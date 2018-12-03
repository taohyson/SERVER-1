/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.concurrent;

/**
 * 
 * 处理线程组
 *
 * @author wu_hc date: 2017年6月29日 下午11:42:09 <br/>
 */
public interface WorkerLoopGroup {

	/**
	 * 下一个
	 * 
	 * @return
	 */
	WorkerLoop next();

	/**
	 * 下一个
	 * 
	 * @return
	 */
	WorkerLoop next(int hash);
	
	/**
	 * 返回分配策略
	 * 
	 * @return
	 */
	SelectStrategy getStrategy();

	/**
	 * 总提交任务数量
	 * 
	 * @return
	 */
	long getTaskCount();

	/**
	 * 已经执行的任务数量
	 * 
	 * @return
	 */
	long getCompletedTaskCount();

	/**
	 * 线程数量
	 * 
	 * @return
	 */
	int workerSize();

	/**
	 * 
	 * 选择策略
	 */
	enum SelectStrategy {
		ROUND, BALANCE, RANDOM;
	}
}