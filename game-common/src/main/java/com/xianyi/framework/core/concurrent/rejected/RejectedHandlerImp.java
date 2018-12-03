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
public final class RejectedHandlerImp {

	/**
	 * 
	 * 
	 *
	 */
	public static final class DiscardPolicy implements RejectedHandler {

		@Override
		public void rejectedExecution(Runnable r, WorkerLoop loop) {

		}
	}

	public static final class CallerRunsPolicy implements RejectedHandler {

		@Override
		public void rejectedExecution(Runnable r, WorkerLoop loop) {
			r.run();
		}
	}

}
