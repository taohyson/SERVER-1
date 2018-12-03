/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.concurrent;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 * 
 * @author wu_hc date: 2017年06月28日 上午11:35:33 <br/>
 */
public final class DefaultWorkerLoop extends AbstractWorkerLoop implements WorkerLoop {

	/**
	 * 高优先级的任务,在每次主循環中執行完
	 */
	private final Queue<Runnable> priorityQueue = new ConcurrentLinkedQueue<>();

	/**
	 * 任务缓冲队列，在每次主循环中取出一个任务进行处理
	 */
	private final BlockingQueue<Runnable> taskQueue;

	/**
	 * 
	 */
	private final Thread thread;

	/**
	 * 
	 * @param prefix
	 */
	public DefaultWorkerLoop(final String prefix) {
		this(prefix, -1);
	}

	/**
	 * 
	 * @param prefix
	 * @param index
	 */
	public DefaultWorkerLoop(final String prefix, final int index) {
		this(prefix, index, Integer.MAX_VALUE - 1);
	}

	/**
	 * 
	 * @param prefix
	 * @param index
	 * @param capacity
	 */
	public DefaultWorkerLoop(final String prefix, final int index, int capacity) {
		super(ID_GENERATOR.incrementAndGet());
		if (capacity <= 0)
			throw new IllegalArgumentException(String.format("capacity[%d] must more than zero!!", capacity));

		// 多生产者单消费者
		// taskQueue = PlatformDependent.newMpscQueue();
		taskQueue = new LinkedBlockingQueue<Runnable>(capacity);

		EventWorker worker = new EventWorker(index >= 0 ? (prefix + "-" + index) : prefix);
		worker.start();
		thread = worker;
	}

	@Override
	public void runInLoop(Runnable task) {
		submitTaskCount.increment();
		if (!taskQueue.offer(task)) {
			logger.error("##### thread[{}]--- NOR task Queue full!! ---#####", Thread.currentThread().getName());
		}
	}

	@Override
	public void runInPriLoop(Runnable task) {
		submitTaskCount.increment();
		if (!priorityQueue.offer(task)) {
			logger.error("##### thread[{}]--- PRI task Queue error!! ----#####", Thread.currentThread().getName());
		}
	}

	@Override
	public boolean inEventLoop() {
		return Thread.currentThread() == thread;
	}

	// 处理事件的线程
	private final class EventWorker extends Thread {

		public EventWorker(final String name) {
			super(name);
			setDaemon(true);
		}

		@Override
		public void run() {
			for (;;) {
				try {
					mainLoop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		/**
		 * 线程主循环
		 * 
		 * @throws Exception
		 */
		private void mainLoop() throws Exception {

			Runnable r;
			while ((r = priorityQueue.poll()) != null) {
				executeTask(r);
				completeTaskCount.increment();
			}
			r = taskQueue.take();
			if (null != r) {
				executeTask(r);
				completeTaskCount.increment();
			}
		}
	}

	@Override
	public String toString() {
		return "DefaultEventLoop [getRegisterCount()=" + getRegisterCount() + ", getId()=" + getId() + "]";
	}

}
