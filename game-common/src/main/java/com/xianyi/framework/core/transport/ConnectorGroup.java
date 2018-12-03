/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月4日 下午6:27:32 <br/>
 */
public interface ConnectorGroup {

	/**
	 * 下一个
	 * 
	 * @return
	 */
	Connector next();

	/**
	 * 返回分配策略
	 * 
	 * @return
	 */
	SelectStrategy getStrategy();

	/**
	 * 
	 */
	void doInit();

	/**
	 * 
	 */
	void connect();

	/**
	 * 
	 * @param message
	 */
	void send(Object message);

	/**
	 * 
	 * 选择策略
	 */
	public static enum SelectStrategy {
		ROUND, RANDOM;
	}
}