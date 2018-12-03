/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工作队列抽象 ，对应一个线程
 * 
 *
 * @author wu_hc date: 2017年06月28日 上午11:35:33 <br/>
 */
public abstract class AbstractWorkerLoop implements WorkerLoop {

	/**
	 * 日志
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * ID生成器
	 */
	protected static final AtomicInteger ID_GENERATOR = new AtomicInteger(0);

	/**
	 * 注册数量
	 */
	protected final AtomicInteger registerCounter = new AtomicInteger(0);

	/**
	 * 提交的任务数量
	 */
	protected LongAdder submitTaskCount = new LongAdder();

	/**
	 * 完成的任务数量
	 */
	protected LongAdder completeTaskCount = new LongAdder();

	/**
	 * ID
	 */
	private final int id;

	/**
	 * 
	 * @param id
	 */
	AbstractWorkerLoop(int id) {
		this.id = id;
	}

	@Override
	public void register(final IEventListener listener) {
		registerCounter.incrementAndGet();
		if (null != listener) {
			runInPriLoop(() -> {
				listener.onEvent(this);
			});
		}
	}

	@Override
	public void unRegister(IEventListener listener) {
		registerCounter.decrementAndGet();
		if (null != listener) {
			runInPriLoop(() -> {
				listener.onEvent(this);
			});
		}
	}

	@Override
	public int getRegisterCount() {
		return registerCounter.get();
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public long getTaskCount() {
		return submitTaskCount.longValue();
	}

	@Override
	public long getCompletedTaskCount() {
		return completeTaskCount.longValue();
	}

	@Override
	public void execute(Runnable command) {
		runInLoop(command);
	}

	/**
	 * 
	 * @param task
	 */
	static void executeTask(final Runnable task) {
		task.run();
	}
}
