package com.xianyi.framework.core.transport.netty;

import com.cai.common.constant.AttributeKeyConstans;
import com.xianyi.framework.core.transport.Connector;
import com.xianyi.framework.core.transport.event.IOCustomEvent;
import com.xianyi.framework.core.transport.event.IOEvent.Event;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.netty.session.S2SSession;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 消息处理器
 * 
 * @author vincent.wu
 *
 */
public final class NettyConnectorHandler extends SimpleChannelInboundHandler<Object> {

	/**
	 * 
	 */
	private final IOEventListener<S2SSession> listener;

	/**
	 * 
	 */
	private final Connector connector;

	public NettyConnectorHandler(IOEventListener<S2SSession> listener, Connector connector) {
		this.listener = listener;
		this.connector = connector;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		listener.onEvent(new IOCustomEvent<S2SSession>(Event.READ, getC2S(ctx), msg));
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		listener.onEvent(new IOCustomEvent<S2SSession>(Event.EXCEPTION, getC2S(ctx), cause));
	}

	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		S2SSession session = new S2SSession(ctx.channel());
		ctx.channel().attr(AttributeKeyConstans.PROXY_CONNECTOR).set(session);
		listener.onEvent(new IOCustomEvent<S2SSession>(Event.REGISTERED, session));
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		listener.onEvent(new IOCustomEvent<S2SSession>(Event.UNREGISTERED, getC2S(ctx)));
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		super.channelInactive(ctx);
		if (null != connector) {
			connector.reConnect();
		}
	}

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
	}

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	private static S2SSession getC2S(final ChannelHandlerContext ctx) {
		return ctx.channel().attr(AttributeKeyConstans.PROXY_CONNECTOR).get();
	}
}
