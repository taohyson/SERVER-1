/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import java.util.Arrays;

import com.xianyi.framework.core.transport.netty.NettySocketConnector;
import com.xianyi.framework.core.transport.select.ConnectorStrategyFactory;
import com.xianyi.framework.core.transport.select.DefaultConnectorStrategyFactory;

/**
 * 
 * 连接器组管理
 *
 * @author wu_hc date: 2017年11月4日 下午6:27:24 <br/>
 */
public class DefaultConnectorGroup implements ConnectorGroup {

	/**
	 * 工作组
	 */
	private final Connector[] connectors;

	/**
	 * 分配策略
	 */
	private final SelectStrategy strategy;

	/**
	 * 选择器
	 */
	private final ConnectorStrategyFactory.ConnectorChooser chooser;

	/**
	 * 
	 * @param address
	 * @return
	 */
	public static DefaultConnectorGroup newGroup(final UnresolvedAddress address) {
		return newGroup(address.toString());
	}

	/**
	 * 
	 * @param hostNode
	 * @return
	 */
	public static DefaultConnectorGroup newGroup(final String hostNode) {
		return new DefaultConnectorGroup(hostNode, 2, SelectStrategy.ROUND);
	}

	/**
	 * 
	 * @param hostNode
	 * @param size
	 * @param strategy
	 * @return
	 */
	public static DefaultConnectorGroup newGroup(String hostNode, int size, SelectStrategy strategy) {
		return new DefaultConnectorGroup(hostNode, size, strategy);
	}

	/**
	 * 
	 * @param hostNode
	 * @param size
	 * @param strategy
	 */
	private DefaultConnectorGroup(final String hostNode, int size, SelectStrategy strategy) {
		if (size <= 0) {
			throw new IllegalArgumentException("create connector group,size must more than zero!");
		}

		connectors = new NettySocketConnector[size];
		for (int i = 0; i < size; i++) {
			connectors[i] = new NettySocketConnector(hostNode);
		}

		this.strategy = strategy;
		chooser = DefaultConnectorStrategyFactory.getInstance().newChooser(connectors, strategy);
	}

	@Override
	public Connector next() {
		return chooser.next();
	}

	@Override
	public void doInit() {
		for (int i = 0; i < connectors.length; i++) {
			connectors[i].doInit();
		}
	}

	@Override
	public void connect() {
		for (int i = 0; i < connectors.length; i++) {
			connectors[i].connect();
		}
	}

	@Override
	public SelectStrategy getStrategy() {
		return this.strategy;
	}

	@Override
	public void send(Object message) {
		next().send(message);
	}

	@Override
	public String toString() {
		return "DefaultConnectorGroup [connectors=" + Arrays.toString(connectors) + ", strategy=" + strategy + ", chooser=" + chooser + "]";
	}

}
