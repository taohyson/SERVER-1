/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import com.xianyi.framework.core.concurrent.disruptor.TaskDispatcher;
import com.xianyi.framework.core.concurrent.selfDriver.AutoDriverQueue;

/**
 * 
 *
 * @author wu_hc date: 2018年5月9日 下午11:27:08 <br/>
 */
public final class AutoTest {

	static int i = 0;

	// 处理线程
	static final TaskDispatcher dispatcher = TaskDispatcher.newDispatcher(RuntimeOpt.availableProcessors() << 2, "club-task-dispatcher", 2);
	// 请求任务放在这里处理
	static AutoDriverQueue taskQueue = AutoDriverQueue.newQueue(dispatcher);

	static final ExecutorService service = Executors.newFixedThreadPool(30);

	private static final AtomicInteger idx = new AtomicInteger(0);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(10L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			service.execute(new Task(idx.incrementAndGet()));
		}
	}

	static final class Task implements Runnable {

		private final int index;

		/**
		 * @param index
		 */
		public Task(int index) {
			this.index = index;
		}

		@Override
		public void run() {
			try {
				TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(3000));
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			taskQueue.addTask(() -> {
				try {
					TimeUnit.MILLISECONDS.sleep(10L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(index + "\t" + (i++));
			});
		}

	}
}
