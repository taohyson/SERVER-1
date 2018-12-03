/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.select;

import com.xianyi.framework.core.transport.Connector;
import com.xianyi.framework.core.transport.ConnectorGroup.SelectStrategy;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月4日 下午5:26:40 <br/>
 */
public interface ConnectorStrategyFactory {

	/**
	 * 
	 * @param executors
	 * @return
	 */
	ConnectorChooser newChooser(Connector[] connectors);

	/**
	 * 
	 * @param executors
	 * @param strategy
	 * @return
	 */
	ConnectorChooser newChooser(Connector[] connectors, SelectStrategy strategy);

	/**
	 * 
	 * 选择策略器
	 *
	 */
	interface ConnectorChooser {

		Connector next();
	}
}
