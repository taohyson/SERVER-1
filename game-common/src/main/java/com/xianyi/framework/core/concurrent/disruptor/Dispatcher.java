/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.concurrent.disruptor;

import com.cai.common.util.RuntimeOpt;

/**
 * 
 *
 * @author wu_hc date: 2017年10月24日 上午10:11:13 <br/>
 */
public interface Dispatcher<T> {

	int BUFFER_SIZE = 32768;
	int MAX_NUM_WORKERS = RuntimeOpt.availableProcessors() << 2;

	/**
	 * 
	 */
	boolean dispatch(T message);

	/**
	 * Shutdown
	 */
	void shutdown();
}
