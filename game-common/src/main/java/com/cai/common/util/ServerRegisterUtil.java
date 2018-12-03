/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.util;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.define.EServerStatus;
import com.cai.common.define.EServerType;
import com.cai.common.rmi.ICenterRMIServer;
import com.google.common.base.Objects;

/**
 * 
 * 服务器注册管理
 *
 * @author wu_hc date: 2017年10月13日 上午10:50:52 <br/>
 */
public final class ServerRegisterUtil {

	/**
	 * 
	 */
	private static Logger logger = LoggerFactory.getLogger(ServerRegisterUtil.class);

	/**
	 * 
	 * @param serverType
	 * @param status
	 * @param serverIndex
	 */
	public static void registerToCenter(EServerType serverType, EServerStatus status, int serverIndex) {

		new Thread(() -> {
			for (;;) {
				try {
					boolean r = SpringService.getBean(ICenterRMIServer.class).serverStatusUpdate(serverType, status, serverIndex);
					if (r) {
						logger.info("======== [{}<->center] 状态[{}]更新成功!! id:[{}] ==========", serverType.name(), status.name(), serverIndex);
						break;
					}
				} catch (Exception e) {
					logger.error(" ####[{}<->center]状态[{}]更新失败,5s后尝试再次更新!! id:[{}] e:{}#####", serverType.name(), status.name(), serverIndex, e);
					try {
						TimeUnit.SECONDS.sleep(5L);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}
		}).start();
	}

	/**
	 * 
	 * @param serverInfo
	 * @param cfgServerIndex
	 * @return
	 */
	public static boolean doVaildServerMsg(ServerInfo serverInfo, int cfgServerIndex) {
		// 1,服务器id校验
		if (serverInfo.getServerIndex() != cfgServerIndex) {
			return false;
		}

		// 2,服务器ip校验
		if (!Objects.equal(serverInfo.getRmiHostName(), RuntimeOpt.getRmiHostAddress())) {
			return false;
		}

		// 3,safeCode校验-暂不需要

		return true;
	}

	private ServerRegisterUtil() {
	}
}
