/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.constant.S2SCmd;
import com.cai.common.define.EServerStatus;
import com.cai.common.define.EServerType;
import com.cai.common.domain.GateServerModel;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.netty.NettySocketConnector;
import com.xianyi.framework.core.transport.netty.session.S2SSession;

import protobuf.clazz.s2s.S2SProto.LoginReq;

/**
 * 
 *
 * @author wu_hc date: 2017年11月9日 上午10:31:51 <br/>
 */
public final class GateUtil {

	protected static final Logger logger = LoggerFactory.getLogger(GateUtil.class);

	/**
	 * 创建网关服连接器。为了通用方便，此函数参数较多 ... ^_^" 尴尬的笑.....
	 * 
	 * @param serverModel
	 * @param connetosHolder
	 * @param eServerType
	 * @param serverIndex
	 * @param ls
	 * @return
	 */
	private static NettySocketConnector createConnector(GateServerModel serverModel, Map<Integer, NettySocketConnector> connetosHolder,
			EServerType eServerType, int serverIndex, IOEventListener<S2SSession> ls) {

		if (serverModel.getOpen() != EServerStatus.ACTIVE.getStatus()) {
			return null;
		}

		NettySocketConnector connector = new NettySocketConnector(serverModel.getInner_ip(), serverModel.getSocket_port());
		connector.setListener(ls);
		connector.doInit();
		connector.setReConnect(true);
		connector.doLogin();
		connector.setDescription(serverModel.getServer_desc());
		connetosHolder.put(serverModel.getServer_id(), connector);
		connector.setConnectedCallback((cntor) -> {
			LoginReq.Builder builder = LoginReq.newBuilder();
			builder.setSafeCode("DFASE##@546654");
			builder.setServerType(eServerType.type());
			builder.setServerIndex(serverIndex);
			((NettySocketConnector) cntor).send(PBUtil.toS2SRequet(S2SCmd.S2S_LOGIN_REQ, builder).build());
		});
		connector.connect();
		return connector;
	}

	/**
	 * 创建网关服连接器。为了通用方便，此函数参数较多 ... ^_^" 尴尬的笑.....
	 * 
	 * @param dict
	 * @param connetosHolder
	 * @param eServerType
	 * @param serverIndex
	 * @param ls
	 */
	public static void initOrReloadConnector(Map<Integer, GateServerModel> dict, Map<Integer, NettySocketConnector> connetosHolder,
			EServerType eServerType, int serverIndex, IOEventListener<S2SSession> ls) {

		final Map<Integer, GateServerModel> gateDict = dict;
		gateDict.forEach((gateId, model) -> {
			NettySocketConnector connector = connetosHolder.get(gateId);

			if (null == connector) {
				if (model.getOpen() == EServerStatus.ACTIVE.getStatus()) { // 需要新增
					connector = createConnector(model, connetosHolder, eServerType, serverIndex, ls);
					logger.info("[this->gate],###### add Connector:{} #######", connector);
				}
			} else {
				if (model.getOpen() == EServerStatus.CLOSE.getStatus()) { // 需要下线,设置不重连即可
					connector.setReConnect(false);
					connetosHolder.remove(model.getServer_id());
					logger.info("[this->gate],###### remove Connector:{} #######", connector);
				}
			}
		});
	}

	private GateUtil() {
	}
}
