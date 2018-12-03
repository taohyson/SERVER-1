/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.concurrent.rejected;

import com.xianyi.framework.core.concurrent.WorkerLoop;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年12月5日 下午1:25:58 <br/>
 */
public interface RejectedHandler {

	/**
	 * 
	 * @param r
	 * @param loop
	 */
	void rejectedExecution(Runnable r, WorkerLoop loop);
}
