/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.concurrent;

import java.util.concurrent.Executor;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年6月30日 下午11:42:48 <br/>
 */
public interface WorkerLoop extends Executor {

	/**
	 * 注册/绑定到该工作线程
	 * 
	 * @param listener
	 */
	void register(IEventListener listener);

	/**
	 * 取消注册，解绑与该工作线程的绑定
	 * 
	 * @param listener
	 */
	void unRegister(IEventListener listener);

	/**
	 * 在主循环中执行该任务,普通优先级
	 * 
	 * @param task
	 */
	void runInLoop(Runnable task);

	/**
	 * 在主循环中执行该任务,高优先级
	 * 
	 * @param task
	 */
	void runInPriLoop(Runnable task);

	/**
	 * 获取注册数量
	 * 
	 * @return
	 */
	int getRegisterCount();

	/**
	 * 获取ID
	 * 
	 * @return
	 */
	int getId();

	/**
	 * 
	 * @return
	 */
	boolean inEventLoop();

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
}
