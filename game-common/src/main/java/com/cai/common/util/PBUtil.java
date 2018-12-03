/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.constant.S2CCmd;
import com.cai.common.constant.S2SCmd;
import com.cai.common.handler.RoomPBRegister;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;

import protobuf.clazz.Protocol;
import protobuf.clazz.Protocol.CommonProto;
import protobuf.clazz.Protocol.Request;
import protobuf.clazz.Protocol.Response;
import protobuf.clazz.Protocol.Response.ResponseType;
import protobuf.clazz.Protocol.RoomRequest;
import protobuf.clazz.Protocol.S2SCommonProto;
import protobuf.clazz.match.MatchClientHeaderRsp.MatchClientResponse;
import protobuf.clazz.s2s.ClubServerProto.ClubToClientRsp;

/**
 * 
 *
 * @author wu_hc date: 2017年7月17日 下午2:04:07 <br/>
 */
public final class PBUtil {
	/**
	 * 日志
	 */
	private static Logger log = LoggerFactory.getLogger(PBUtil.class);

	private PBUtil() {
	}

	/**
	 * ByteString --> byte[]
	 * 
	 * @param byteString
	 * @return
	 */
	public static byte[] toByteArray(ByteString byteString) {
		return byteString.toByteArray();
	}

	/**
	 * byte[] --> ByteString
	 * 
	 * @param bytes
	 * @return
	 */
	public static ByteString toByteString(byte[] bytes) {
		return ByteString.copyFrom(bytes);
	}

	/**
	 * byte[] --> ByteString
	 * 
	 * @param builder
	 * @return
	 */
	public static ByteString toByteString(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
		return ByteString.copyFrom(builder.build().toByteArray());
	}

	/**
	 * roomrequest
	 * 
	 * @param request
	 * @return
	 */
	public static com.google.protobuf.GeneratedMessage toObject(RoomRequest request) {
		return toObject(request, GeneratedMessage.class);
	}

	/**
	 * roomrequest
	 * 
	 * @param request
	 * @param clazz
	 * @return
	 */
	public static <T extends GeneratedMessage> T toObject(RoomRequest request, Class<? extends T> clazz) {
		com.google.protobuf.Parser<? extends GeneratedMessage> parser = RoomPBRegister.ROOM_PARSER.get(request.getType());
		return toObject(request.getCommRequet(), parser, clazz);
	}

	/**
	 * 
	 * @param code
	 * @param byteString
	 * @param parser
	 * @param clazz
	 * @return
	 */
	public static <T extends GeneratedMessage> T toObject(ByteString byteString, Parser<? extends GeneratedMessage> parser, Class<T> clazz) {
		if (null == parser) {
			log.error("====找不到解析器，请确认是否已经配置=========,{}", clazz);
			return null;
		}

		try {
			return clazz.cast(parser.parseFrom(byteString));
		} catch (InvalidProtocolBufferException e) {
			log.error("====解析器错误，请确认是否配置错误=========,{}", clazz);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 组装在服务器处理的消息包
	 * 
	 * @param code
	 * @param builder
	 * @return
	 */
	public static Request.Builder toS2SRequet(int code, GeneratedMessage.Builder<?> builder) {
		S2SCommonProto.Builder commBuilder = S2SCommonProto.newBuilder();
		commBuilder.setCmd(code);
		commBuilder.setByte(builder.build().toByteString());

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.S2S);
		requestBuilder.setExtension(Protocol.s2SRequest, commBuilder.build());
		return requestBuilder;
	}

	/**
	 * 组装在服务器处理的消息包
	 * 
	 * @param code
	 * @param builder
	 * @return
	 */
	public static Request.Builder toS2SRequet(int code, GeneratedMessage builder) {
		S2SCommonProto.Builder commBuilder = S2SCommonProto.newBuilder();
		commBuilder.setCmd(code);
		commBuilder.setByte(builder.toByteString());

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.S2S);
		requestBuilder.setExtension(Protocol.s2SRequest, commBuilder.build());
		return requestBuilder;
	}

	/**
	 * 组装在服务器处理的消息包
	 * 
	 * @param code
	 * @param builder
	 * @return
	 */
	public static Request.Builder toS2SResponse(int code, GeneratedMessage.Builder<?> builder) {
		S2SCommonProto.Builder commBuilder = S2SCommonProto.newBuilder();
		commBuilder.setCmd(code);
		commBuilder.setByte(builder.build().toByteString());

		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.S2S);
		responseBuilder.setExtension(Protocol.s2SResponse, commBuilder.build());

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.S2S);
		requestBuilder.setExtension(Protocol.response, responseBuilder.build());

		return requestBuilder;
	}

	/**
	 * 组装发给所有在线玩家
	 * 
	 * @param code
	 * @param builder
	 * @return
	 */
	public static Request.Builder toS2S_ALL_CResponse(int code, GeneratedMessage.Builder<?> builder) {
		S2SCommonProto.Builder commBuilder = S2SCommonProto.newBuilder();
		commBuilder.setCmd(S2SCmd.SEND_TO_ALL_CLIENT);

		CommonProto.Builder cb = CommonProto.newBuilder();
		cb.setCmd(code);
		cb.setByte(builder.build().toByteString());

		commBuilder.setByte(cb.build().toByteString());

		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.S2S);
		responseBuilder.setExtension(Protocol.s2SResponse, commBuilder.build());

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.S2S);
		requestBuilder.setExtension(Protocol.response, responseBuilder.build());

		return requestBuilder;
	}

	/**
	 * 在逻辑副或者俱乐部服调用这个组装直接发给客户端
	 * 
	 * @param proxyId
	 *            代理服id
	 * @param accountid
	 *            帐号id
	 * @param rspBuilder
	 *            回复数据
	 * @return
	 */
	public static Request.Builder toS_S2CRequet(long accountid, int cmd, GeneratedMessage.Builder<?> builder) {

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.PROXY);
		requestBuilder.setProxId(1); // 没啥意义
		requestBuilder.setProxSeesionId(accountid);
		requestBuilder.setExtension(Protocol.response, toS2CCommonRsp(cmd, builder).build());
		return requestBuilder;
	}

	/**
	 * 在逻辑副或者俱乐部服调用这个组装直接发给客户端
	 *
	 * @param proxyId
	 *            代理服id
	 * @param accountid
	 *            帐号id
	 * @param rspBuilder
	 *            回复数据
	 * @return
	 */
	public static Request.Builder toS_S2CRequet(long accountid, int cmd, Message message) {

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.PROXY);
		requestBuilder.setProxId(1); // 没啥意义
		requestBuilder.setProxSeesionId(accountid);
		requestBuilder.setExtension(Protocol.response, toS2CCommonRsp(cmd, message).build());
		return requestBuilder;
	}

	/**
	 * 在逻辑副或者俱乐部服调用这个组装直接发给客户端
	 * 
	 * @param proxyId
	 *            代理服id
	 * @param accountIds
	 *            帐号id
	 * @param rspBuilder
	 *            回复数据
	 * @return
	 */
	public static Request.Builder toS_S2CRequet(Collection<Long> accountIds, int cmd, GeneratedMessage.Builder<?> builder) {

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.PROXY);
		requestBuilder.setProxId(1); // 没啥意义
		requestBuilder.addAllAccountIds(accountIds);
		requestBuilder.setExtension(Protocol.response, toS2CCommonRsp(cmd, builder).build());
		return requestBuilder;
	}

	/**
	 * 代理服直接发给客户端
	 * 
	 * @param cmd
	 * @param builder
	 * @return
	 */
	public static Response.Builder toS2CCommonRsp(int cmd, GeneratedMessage.Builder<?> builder) {
		CommonProto.Builder commBuilder = CommonProto.newBuilder();
		commBuilder.setCmd(cmd);
		commBuilder.setByte(builder.build().toByteString());

		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.S2C);
		responseBuilder.setExtension(Protocol.s2CResponse, commBuilder.build());
		return responseBuilder;
	}

	/**
	 * 代理服直接发给客户端
	 *
	 * @param cmd
	 * @param message
	 * @return
	 */
	public static Response.Builder toS2CCommonRsp(int cmd, Message message) {
		CommonProto.Builder commBuilder = CommonProto.newBuilder();
		commBuilder.setCmd(cmd);
		commBuilder.setByte(message.toByteString());

		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.S2C);
		responseBuilder.setExtension(Protocol.s2CResponse, commBuilder.build());
		return responseBuilder;
	}

	/**
	 * 
	 * @param cmd
	 * @param builder
	 * @return
	 */
	public static Response.Builder toS2CCommonRsp(int cmd, GeneratedMessage builder) {
		CommonProto.Builder commBuilder = CommonProto.newBuilder();
		commBuilder.setCmd(cmd);
		commBuilder.setByte(builder.toByteString());

		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.S2C);
		responseBuilder.setExtension(Protocol.s2CResponse, commBuilder.build());
		return responseBuilder;
	}

	/**
	 * 俱乐部服直接发送消息给客户端
	 * 
	 * @param account_id
	 * @param cmd
	 * @param builder
	 * @return
	 */
	public static ClubToClientRsp.Builder clubS2C(long account_id, int cmd, GeneratedMessage.Builder<?> builder) {
		return getClubServerResponse(account_id).setRsp(toS2CCommonRsp(cmd, builder));
	}

	public static ClubToClientRsp.Builder getClubServerResponse(long account_id) {
		ClubToClientRsp.Builder b = ClubToClientRsp.newBuilder();
		b.setClientSessionId(account_id);
		return b;
	}

	public static Request S2C_Match_Requet(long accountId, int cmd, GeneratedMessage.Builder<?> response) {
		MatchClientResponse.Builder matchResp = MatchClientResponse.newBuilder();
		matchResp.setCmd(cmd);
		matchResp.setData(response.build().toByteString());

		Request.Builder request = Request.newBuilder();
		request.setRequestType(Request.RequestType.PROXY);
		request.setProxId(1); // 没啥意义
		request.setProxSeesionId(accountId);
		request.setExtension(Protocol.response, toS2CCommonRsp(S2CCmd.MATCH, matchResp).build());

		return request.build();
	}

}
