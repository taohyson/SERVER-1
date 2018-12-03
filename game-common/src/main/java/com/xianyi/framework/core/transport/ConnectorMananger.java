/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * 连接管理器
 * 
 * @author wu_hc
 */
public final class ConnectorMananger {

	private static final ConnectorMananger MGR = new ConnectorMananger();

	/**
	 * 
	 */
	private final Map<String, Connector> connectors = Maps.newConcurrentMap();

	public static ConnectorMananger getInstance() {
		return ConnectorMananger.MGR;
	}

	public void addConnector(String key, Connector connector) {
		connectors.put(key, connector);
	}

	@SuppressWarnings("unchecked")
	public <T extends Connector> T getConnector(String key) {
		return (T) connectors.get(key);
	}
}
