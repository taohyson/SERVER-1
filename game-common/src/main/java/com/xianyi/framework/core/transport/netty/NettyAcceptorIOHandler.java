/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.netty;

import com.xianyi.framework.core.transport.statistics.SocketIOUtil;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import protobuf.clazz.Protocol.Request;

/**
 * 
 * 入流统计
 * 
 * @author wu_hc date: 2017年7月27日 上午11:45:44 <br/>
 */
public final class NettyAcceptorIOHandler extends SimpleChannelInboundHandler<Object> {
	/**
	 * 
	 */
	private final SocketIOUtil socketIOUtil;

	/**
	 */
	public NettyAcceptorIOHandler(SocketIOUtil socketIOUtil) {
		this.socketIOUtil = socketIOUtil;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		if (msg instanceof Request) {
			Request request = (Request) msg;
			socketIOUtil.in(request.getRequestType().getNumber(), request.toByteArray().length);
		} else if (msg instanceof Request.Builder) {
			Request.Builder request = (Request.Builder) msg;
			socketIOUtil.in(request.getRequestType().getNumber(), request.build().toByteArray().length);
		}
		ctx.fireChannelRead(msg);
	}

}
