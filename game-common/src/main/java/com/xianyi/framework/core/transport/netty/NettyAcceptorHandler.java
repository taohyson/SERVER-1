/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.netty;

import com.cai.common.constant.AttributeKeyConstans;
import com.xianyi.framework.core.transport.event.IOCustomEvent;
import com.xianyi.framework.core.transport.event.IOEvent.Event;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.netty.session.C2SSession;
import com.xianyi.framework.core.transport.statistics.SocketIOUtil;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 消息处理器
 * 
 *
 * @author wu_hc <br/>
 * 
 */
@Sharable
public final class NettyAcceptorHandler extends SimpleChannelInboundHandler<Object> {
	/**
	 * 
	 */
	private final IOEventListener<C2SSession> listener;

	/**
	 * 
	 */
//	private final SocketIOUtil socketIOUtil;

	/**
	 * @param behaviour
	 */
	public NettyAcceptorHandler(IOEventListener<C2SSession> listener, SocketIOUtil socketIOUtil) {
		this.listener = listener;
//		this.socketIOUtil = socketIOUtil;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		listener.onEvent(new IOCustomEvent<C2SSession>(Event.READ, getC2S(ctx), msg));
//		if (msg instanceof Request) {
//			Request request = (Request) msg;
//			socketIOUtil.in(request.getRequestType().getNumber(), request.toByteArray().length);
//		} else if (msg instanceof Request.Builder) {
//			Request.Builder request = (Request.Builder) msg;
//			socketIOUtil.in(request.getRequestType().getNumber(), request.build().toByteArray().length);
//		}
	}

	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		C2SSession session = new C2SSession(ctx.channel());
		ctx.channel().attr(AttributeKeyConstans.PROXY_ACEEPTOR).set(session);
		listener.onEvent(new IOCustomEvent<C2SSession>(Event.REGISTERED, session));
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		listener.onEvent(new IOCustomEvent<C2SSession>(Event.UNREGISTERED, getC2S(ctx)));
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		listener.onEvent(new IOCustomEvent<C2SSession>(Event.EXCEPTION, getC2S(ctx), cause));
	}

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	private static C2SSession getC2S(final ChannelHandlerContext ctx) {
		return ctx.channel().attr(AttributeKeyConstans.PROXY_ACEEPTOR).get();
	}
}
