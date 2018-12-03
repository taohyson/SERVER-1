/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.handler;

import java.util.Map;

import com.cai.common.constant.S2SCmd;
import com.google.common.collect.Maps;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Parser;

import protobuf.clazz.s2s.ClubServerProto.ClubCreateRoom;
import protobuf.clazz.s2s.ClubServerProto.ClubGameRecordProto;
import protobuf.clazz.s2s.ClubServerProto.ClubToClientRsp;
import protobuf.clazz.s2s.ClubServerProto.ProxyClubRq;
import protobuf.clazz.s2s.S2SProto.LoginReq;
import protobuf.clazz.s2s.S2SProto.LoginRsp;
import protobuf.clazz.s2s.S2SProto.Ping;
import protobuf.clazz.s2s.S2SProto.Pong;

/**
 * 
 * 服务器与服务器通信的pb注册中心
 * 
 * @author wu date: 2017年9月1日 下午12:23:23 <br/>
 */
@Deprecated
public final class S2SPBRegister {

	/**
	 * s2s解析器
	 */
	public static final Map<Integer, Parser<? extends GeneratedMessage>> S2S_PARSER = Maps.newHashMap();

	static {
		S2S_PARSER.put(S2SCmd.S2S_LOGIN_REQ, LoginReq.getDefaultInstance().getParserForType());
		S2S_PARSER.put(S2SCmd.S2S_LOGIN_RSP, LoginRsp.getDefaultInstance().getParserForType());
		S2S_PARSER.put(S2SCmd.PING, Ping.getDefaultInstance().getParserForType());
		S2S_PARSER.put(S2SCmd.PONG, Pong.getDefaultInstance().getParserForType());
		S2S_PARSER.put(S2SCmd.CLUB_REQ, ProxyClubRq.getDefaultInstance().getParserForType());
		S2S_PARSER.put(S2SCmd.CLUB_GAME_RECORD_REQ, ClubGameRecordProto.getDefaultInstance().getParserForType());
		S2S_PARSER.put(S2SCmd.SEND_TO_CLIENT_RSP, ClubToClientRsp.getDefaultInstance().getParserForType());
		S2S_PARSER.put(S2SCmd.CREATE_CLUB_ROOM_RSP, ClubCreateRoom.getDefaultInstance().getParserForType());
	}
}
