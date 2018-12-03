/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.cai.common.domain.LogicGameServerModel;
import com.cai.common.domain.ProxyGameServerModel;
import com.cai.common.rmi.ILogicRMIServer;
import com.cai.common.rmi.IProxyRMIServer;
import com.xianyi.framework.core.transport.UnresolvedAddress;

/**
 * rmi工具
 *
 * @author wu_hc date: 2017年8月4日 下午5:06:05 <br/>
 */
public final class RMIUtil {

	/**
	 * 
	 */
	public static final String PROXY_RMI_SERVER = "/proxyRMIServer";

	/**
	 * 
	 */
	public static final String LOGIC_RMI_SERVER = "/logicRMIServer";

	/**
	 * RMI多久超时
	 */
	public static final int RMI_PING_TIME_OUT = 20 * 1000;

	/**
	 * RMI PING间隔
	 */
	public static final int RMI_PING_INTERVAL = 10 * 1000;

	/**
	 * RMI PING 延迟
	 */
	public static final int RMI_PING_DELAY = 5 * 1000;

	/**
	 * 创建RMI客户端
	 * 
	 * @param adress
	 * @param region
	 * @param serviceInterface
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T createRMIBean(UnresolvedAddress adress, final String region, Class<T> serviceInterface) {
		RmiProxyFactoryBean rpfb = new RmiProxyFactoryBean();
		rpfb.setRefreshStubOnConnectFailure(true);
		rpfb.setLookupStubOnStartup(false);
		StringBuilder buf = new StringBuilder();
		buf.append("rmi://").append(adress.toString()).append(region);
		rpfb.setServiceUrl(buf.toString());
		rpfb.setServiceInterface(serviceInterface);
		rpfb.afterPropertiesSet();
		Object serviceProxy = rpfb.getObject();
		return (T) serviceProxy;

	}

	/**
	 * 创建和逻辑服的RMI连接
	 * 
	 * @param serverModel
	 * @return
	 */
	public static ILogicRMIServer createLogicRMIBean(final LogicGameServerModel serverModel) {
		ILogicRMIServer rmiServer = RMIUtil.createRMIBean(new UnresolvedAddress(serverModel.getInner_ip(), serverModel.getRmi_port()),
				RMIUtil.LOGIC_RMI_SERVER, ILogicRMIServer.class);
		return rmiServer;
	}

	/**
	 * 创建和代理服的RMI连接
	 * 
	 * @param serverModel
	 * @return
	 */
	public static IProxyRMIServer createProxyRMIBean(final ProxyGameServerModel serverModel) {
		IProxyRMIServer rmiServer = RMIUtil.createRMIBean(new UnresolvedAddress(serverModel.getInner_ip(), serverModel.getRmi_port()),
				RMIUtil.PROXY_RMI_SERVER, IProxyRMIServer.class);
		return rmiServer;
	}

	private RMIUtil() {
	}
}
