/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport.netty;

import static com.google.common.base.Preconditions.checkArgument;

import java.nio.ByteOrder;
import java.util.concurrent.ThreadFactory;

import com.google.protobuf.ExtensionRegistry;
import com.xianyi.framework.core.transport.Acceptor;
import com.xianyi.framework.core.transport.netty.web.NettyWebSocketProtobufEncoder;
import com.xianyi.framework.core.transport.netty.web.XYWebSocketServerHandler;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.util.concurrent.DefaultThreadFactory;
import protobuf.clazz.Protocol;

/**
 * 
 * webSocket support
 *
 * @author wu_hc date: 2018年1月2日 下午2:09:59 <br/>
 */
public class NettyWebSocketAcceptor extends NettySocketAcceptor implements Acceptor {

	/**
	 * @param port
	 */
	public NettyWebSocketAcceptor(int port) {
		super(port, (String) null);
	}

	/**
	 * 
	 * @param port
	 * @param inetHost
	 */
	public NettyWebSocketAcceptor(int port, String inetHost) {
		super(port, inetHost);
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
		// SslContext sslContext = null;

		// try {
		// KeyStore keyStore = KeyStore.getInstance("JKS");
		// keyStore.load(new
		// FileInputStream("C:\\Users\\xxh\\Desktop\\TeslaSSLServer\\conf\\twoway\\sChat.jks"),
		// "sNetty".toCharArray());
		// KeyManagerFactory keyManagerFactory =
		// KeyManagerFactory.getInstance("SunX509");
		// keyManagerFactory.init(keyStore, "sNetty".toCharArray());
		// sslContext = SslContextBuilder.forServer(keyManagerFactory).build();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// final SslContext sslContext_ = sslContext;
		bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
			@Override
			protected void initChannel(final SocketChannel ch) throws Exception {
				ChannelPipeline p = ch.pipeline();
				//
				// SSLEngine engine = sslContext_.newEngine(ch.alloc());
				// engine.setUseClientMode(true);
				// ch.pipeline().addFirst("ssl", new SslHandler(engine));
				// p.addFirst(new SslHandler(engine));
//				SelfSignedCertificate ssc = new SelfSignedCertificate();
//				SslContext sslCtx = SslContext.newServerContext(ssc.certificate(), ssc.privateKey());
//				SSLEngine engine = sslCtx.newEngine(ch.alloc());
//				engine.setUseClientMode(false);
//				p.addLast(new SslHandler(engine));

//				p.addFirst(new LoggingHandler(LogLevel.INFO));
				p.addLast(new HttpServerCodec()); // 将请求和应答消息编码或解码为HTTP消息
				p.addLast(new HttpObjectAggregator(65536)); // 将HTTP消息的多个部分组合成一条完整的HTTP消息
				// p.addLast(new WebSocketServerCompressionHandler());
				p.addLast(new WebSocketServerProtocolHandler("/ws", null, true)); // Netty支持websocket
				p.addLast(new XYWebSocketServerHandler()); // websocket消息帧处理看下面代码(这里需要把前台的消息分类，判断传过来的是websocket哪个帧，如果为二进制帧往下传值，让protobuf解码)

				p.addLast("frameDecoder", new LengthFieldBasedFrameDecoder(ByteOrder.LITTLE_ENDIAN, 30720, 0, 4, 0, 4, true));
				p.addLast("protobufDecoder", new ProtobufDecoder(Protocol.Request.getDefaultInstance(), registry));
				p.addLast("frameEncoder", new LengthFieldPrepender(4));
				p.addLast("protobufEncoder", new NettyWebSocketProtobufEncoder(socketIO()));
				// p.addLast("io", new NettyAcceptorIOHandler(socketIO()));
				p.addLast("handler", new NettyAcceptorHandler(NettyWebSocketAcceptor.this, socketIO()));
			}
		});
		initAcceptorOption(bootstrap);
	}

}
