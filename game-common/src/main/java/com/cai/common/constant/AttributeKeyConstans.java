/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant;

import java.util.concurrent.Executor;

import com.cai.common.define.EServerType;
import com.cai.common.domain.json.BaiduLBSJsonModel;
import com.cai.common.util.Pair;
import com.xianyi.framework.core.transport.netty.session.C2SSession;
import com.xianyi.framework.core.transport.netty.session.S2SSession;

import io.netty.util.AttributeKey;
import protobuf.clazz.Protocol.LocationInfor;

/**
 * 
 *
 * @author wu_hc date: 2017年7月24日 下午6:00:39 <br/>
 */
public interface AttributeKeyConstans {

	/**
	 * 代理服网络接收器
	 */
	AttributeKey<C2SSession> PROXY_ACEEPTOR = AttributeKey.valueOf("PROXY_ACEEPTOR");

	/**
	 * 代理服和逻辑服
	 */
	AttributeKey<S2SSession> PROXY_CONNECTOR = AttributeKey.valueOf("PROXY_CONNECTOR");

	/**
	 * 玩家坐标属性
	 */
	AttributeKey<BaiduLBSJsonModel> BAIDU_LBS_MODEL = AttributeKey.valueOf("BaiduLBSJsonModel");

	/**
	 * 
	 */
	AttributeKey<Pair<EServerType, Integer>> CLUB_SESSION = AttributeKey.valueOf("CLUB_SESSION!@@@@@@");

	/**
	 * 
	 */
	AttributeKey<Pair<EServerType, Integer>> LOGIC_SESSION = AttributeKey.valueOf("LOGIC_SESSION!@@@@@@");

	/**
	 * 
	 */
	AttributeKey<Pair<EServerType, Integer>> GATE_SESSION = AttributeKey.valueOf("GATE_SESSION!@@@@@@");

	/**
	 * 
	 */
	AttributeKey<Pair<EServerType, Integer>> MATCH_SESSION = AttributeKey.valueOf("MATCH_SESSION!@@@@@@");

	/**
	 * 
	 */
	AttributeKey<String> IP_ACCOUNT = AttributeKey.valueOf("IP_ACCOUNT!@@@@@@");

	/**
	 * 
	 */
	AttributeKey<Integer> LOGIN_TYPE = AttributeKey.valueOf("LOGIN_TYPE!@@@@@@");

	/**
	 * 
	 */
	AttributeKey<Long> PHONE_IDENTIFY = AttributeKey.valueOf("PHONE_IDENTIFY~~");

	/**
	 * 玩家定位信息
	 */
	AttributeKey<LocationInfor> ACCOUNT_LOCATION = AttributeKey.valueOf("ACCOUNT_LOCATION~~");
	

	/**
	 * 登陆工作线程
	 */
	AttributeKey<Executor> LOGIN_SESSION_WORKER = AttributeKey.valueOf("LOGIN_SESSION_WORKER~~");
}
