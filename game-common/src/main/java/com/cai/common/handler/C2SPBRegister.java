/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.handler;

import java.util.Map;

import com.cai.common.constant.C2SCmd;
import com.google.common.collect.Maps;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Parser;

import protobuf.clazz.Common.GameRuleRequest;
import protobuf.clazz.activity.ActivityTurntableProto.TurntableReq;
import protobuf.clazz.c2s.C2SProto.AppItemsReq;
import protobuf.clazz.c2s.C2SProto.RoomInfoReq;

/**
 * 
 * 客户端与服务器通信的pb注册中心
 * 
 * @author wu date: 2017年9月1日 下午12:23:23 <br/>
 */
@Deprecated
public final class C2SPBRegister {

	/**
	 * s2s解析器
	 */
	public static final Map<Integer, Parser<? extends GeneratedMessage>> C2S_PARSER = Maps.newHashMap();

	static {
		C2S_PARSER.put(C2SCmd.APPITEM, AppItemsReq.getDefaultInstance().getParserForType());
		C2S_PARSER.put(C2SCmd.ROOM_INFO, RoomInfoReq.getDefaultInstance().getParserForType());
		C2S_PARSER.put(C2SCmd.GAME_RULE, GameRuleRequest.getDefaultInstance().getParserForType());

		C2S_PARSER.put(C2SCmd.GAME_RULE_BY_GAME_ID, GameRuleRequest.getDefaultInstance().getParserForType());
		C2S_PARSER.put(C2SCmd.ACTIVITY_TURNTABLE, TurntableReq.getDefaultInstance().getParserForType());
	}
}
