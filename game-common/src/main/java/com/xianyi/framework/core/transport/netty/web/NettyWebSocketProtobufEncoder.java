package com.xianyi.framework.core.transport.netty.web;

import java.util.List;

import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.xianyi.framework.core.transport.statistics.SocketIOUtil;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import protobuf.clazz.Protocol.Request;
import protobuf.clazz.Protocol.Response;

/**
 * 
 * websocekt封包编码
 *
 * @author wu_hc date: 2018年1月2日 下午4:44:14 <br/>
 */
@Sharable
public final class NettyWebSocketProtobufEncoder extends MessageToMessageEncoder<MessageLiteOrBuilder> {

	/**
	 * 统计流量
	 */
	private final SocketIOUtil socketIO;

	/**
	 * @param socketIO
	 */
	public NettyWebSocketProtobufEncoder(SocketIOUtil socketIO) {
		this.socketIO = socketIO;
	}

	@Override
	protected void encode(ChannelHandlerContext ctx, MessageLiteOrBuilder msg, List<Object> out) throws Exception {
		if (msg instanceof MessageLite) {
			byte[] bys = ((MessageLite) msg).toByteArray();
			int length = bys.length;
			ByteBuf result = Unpooled.buffer();
			result.writeInt(length);
			result.writeBytes(bys);
			BinaryWebSocketFrame frame = new BinaryWebSocketFrame(result);
			out.add(frame);

			// 流量统计
			if (msg instanceof Response) {
				Response response = (Response) msg;
				socketIO.out(response.getResponseType().getNumber(), length);
			} else {
				Request requst = (Request) msg;
				socketIO.out(requst.getRequestType().getNumber(), length);
			}

			return;
		}
		if (msg instanceof MessageLite.Builder) {
			byte[] bys = ((MessageLite.Builder) msg).build().toByteArray();
			int length = bys.length;

			ByteBuf result = Unpooled.buffer();
			result.writeInt(length);
			result.writeBytes(bys);
			BinaryWebSocketFrame frame = new BinaryWebSocketFrame(result);
			out.add(frame);

			// 流量统计
			if (msg instanceof Response.Builder) {
				Response.Builder response = (Response.Builder) msg;
				socketIO.out(response.getResponseType().getNumber(), length);
			} else {
				Request.Builder requst = (Request.Builder) msg;
				socketIO.out(requst.getRequestType().getNumber(), length);
			}
		}
	}

}
