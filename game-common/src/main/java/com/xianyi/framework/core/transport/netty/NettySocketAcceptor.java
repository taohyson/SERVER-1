/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport.netty;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.nio.ByteOrder;
import java.util.concurrent.ThreadFactory;

import com.google.protobuf.ExtensionRegistry;
import com.xianyi.framework.core.transport.AbstractAcceptor;
import com.xianyi.framework.core.transport.Acceptor;
import com.xianyi.framework.core.transport.event.IOEvent;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.netty.session.C2SSession;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.util.concurrent.DefaultThreadFactory;
import protobuf.clazz.Protocol;

/**
 *
 * @author wu_hc
 */
public class NettySocketAcceptor extends AbstractAcceptor<C2SSession> implements Acceptor {

	/**
	 * 启动辅助器
	 */
	protected ServerBootstrap bootstrap = null;

	/**
	 * clientAcceptor:直接接收客户端的请求，否则作为服务端接收器
	 */
	protected Boolean isClientAcceptor = Boolean.TRUE;

	/**
	 * @param port
	 */
	public NettySocketAcceptor(int port) {
		super(port, (String) null);
	}

	/**
	 * 
	 * @param port
	 * @param inetHost
	 */
	public NettySocketAcceptor(int port, String inetHost) {
		super(port, inetHost);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void shutdownGracefully() throws InterruptedException {
		if (null != bootstrap) {
			bootstrap.childGroup().shutdownGracefully();
			bootstrap.group().shutdownGracefully();
		}
	}

	@Override
	public void doInit() {

		checkArgument(!ioEventListeners.isEmpty(), "Acceptor ioEventListeners CAN NOT be a nil value!!");

		ThreadFactory bossFactory = new DefaultThreadFactory("socket-acceptor-boss", Thread.MAX_PRIORITY);
		ThreadFactory workerFactory = new DefaultThreadFactory("socket-acceptor-worker", Thread.MAX_PRIORITY);
		final ExtensionRegistry registry = ExtensionRegistry.newInstance();
		Protocol.registerAllExtensions(registry);

		bootstrap = new ServerBootstrap();
		bootstrap.group(initEventLoopGroup(1, bossFactory), initEventLoopGroup(workerCount(), workerFactory));
		if (Epoll.isAvailable()) {
			bootstrap.channel(EpollServerSocketChannel.class);
		} else {
			bootstrap.channel(NioServerSocketChannel.class);
		}

		bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
			@Override
			protected void initChannel(final SocketChannel ch) throws Exception {
				ChannelPipeline p = ch.pipeline();
				ChannelHandler fdHandler = Boolean.TRUE == isClientAcceptor
						? new LengthFieldBasedFrameDecoder(ByteOrder.LITTLE_ENDIAN, 30720, 0, 4, 0, 4, true)
						: new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4);
				p.addLast("frameDecoder", fdHandler);
				p.addLast("protobufDecoder", new ProtobufDecoder(Protocol.Request.getDefaultInstance(), registry));
				p.addLast("frameEncoder", new LengthFieldPrepender(4));
				p.addLast("protobufEncoder", new NettyProtobufEncoder(socketIO()));
				// p.addLast("io", new NettyAcceptorIOHandler(socketIO()));
				p.addLast("handler", new NettyAcceptorHandler(NettySocketAcceptor.this, socketIO()));
			}
		});
		initAcceptorOption(bootstrap);
	}

	@Override
	public void start(boolean sync) throws Exception {

		checkNotNull(bootstrap, "You need to invoke doInit before!!");

		ChannelFuture futrue;
		if (null == this.inetHost) {
			futrue = bootstrap.bind(inetPort).sync();
		} else {
			futrue = bootstrap.bind(inetHost, inetPort).sync();
		}

		if (sync)
			futrue.channel().closeFuture().sync();
	}

	/**
	 * 初始化连接参数
	 * 
	 * @param bootstrap
	 */
	protected void initAcceptorOption(final ServerBootstrap bootstrap) {
		bootstrap.option(ChannelOption.SO_RCVBUF, 1024 * 64);
		bootstrap.option(ChannelOption.SO_REUSEADDR, true);
		bootstrap.childOption(ChannelOption.SO_RCVBUF, 1024 * 64);
		bootstrap.childOption(ChannelOption.TCP_NODELAY, true);
	}

	/**
	 * 用于需要定制netty参数
	 * 
	 * @param option
	 * @param value
	 * @return
	 */
	public <T> NettySocketAcceptor option(ChannelOption<T> option, T value) {
		checkNotNull(bootstrap, "You need to invoke doInit before!!");
		bootstrap.option(option, value);
		return this;
	}

	/**
	 * 用于需要定制netty参数
	 * 
	 * @param option
	 * @param value
	 * @return
	 */
	public <T> NettySocketAcceptor childOption(ChannelOption<T> option, T value) {
		checkNotNull(bootstrap, "You need to invoke doInit before!!");
		bootstrap.childOption(option, value);
		return this;
	}

	/**
	 * 
	 * @param nThreads
	 * @param factory
	 * @return
	 */
	protected EventLoopGroup initEventLoopGroup(int nThreads, ThreadFactory factory) {
		if (Epoll.isAvailable()) {
			return new EpollEventLoopGroup(nThreads, factory);
		} else {
			return new NioEventLoopGroup(nThreads, factory);
		}
	}

	@Override
	public void onEvent(IOEvent<C2SSession> ioEvent) {
		for (final IOEventListener<C2SSession> listener : ioEventListeners) {
			listener.onEvent(ioEvent);
		}
	}

	/**
	 * @return the isClientAcceptor
	 */
	public Boolean getIsClientAcceptor() {
		return isClientAcceptor;
	}

	/**
	 * @param isClientAcceptor
	 *            the isClientAcceptor to set
	 */
	public void setIsClientAcceptor(Boolean isClientAcceptor) {
		this.isClientAcceptor = isClientAcceptor;
	}

}
