/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.concurrent.selfDriver;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.util.SystemClock;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

/**
 * thread_safe,保证队列的任务顺序执行,适用于任务粒度大，耗时长，但并发不是特别高的场景
 *
 * @author wu_hc date: 2018年1月12日 下午5:55:30 <br/>
 */
public final class AutoDriverQueue implements Runnable, Executor {

	private static final Logger logger = LoggerFactory.getLogger(AutoDriverQueue.class);

	/**
	 * 队列
	 */
	private final LinkedList<Runnable> taskQueue = Lists.newLinkedList();

	/**
	 * 执行器
	 */
	private final Executor actuator;

	/**
	 * 锁对象
	 */
	private final Lock lock = new ReentrantLock();

	/**
	 * 提交的任务数量
	 */
	private final LongAdder submitTaskCount = new LongAdder();

	/**
	 * 批量执行,y每次调度会把队列中的所有任务一次执行完毕,n顺序取出一个任务执行
	 */
	private final boolean isBatchExecute;

//	@Deprecated
	//	public static final AutoDriverQueue newQueue(Executor excutor, boolean isBatchExecute) {
	//		return new AutoDriverQueue(excutor, isBatchExecute);
	//	}

	/**
	 * @param excutor
	 * @return
	 */ public static final AutoDriverQueue newQueue(Executor excutor) {
		return new AutoDriverQueue(excutor, false);
	}

	/**
	 * @param excutor
	 */
	private AutoDriverQueue(Executor excutor, boolean isBatchExecute) {
		checkNotNull(excutor, "excutor is a nil value!");

		this.actuator = excutor;
		this.isBatchExecute = isBatchExecute;
	}

	/**
	 * @param task
	 */
	public int addTask(final Runnable task) {
		checkNotNull(task, "task is nil value ");

		int taskSize = 0;
		final Lock lock = this.lock;
		lock.lock();
		submitTaskCount.increment();
		try {
			if (isEmpty()) {
				taskQueue.add(task);
				actuator.execute(this);
			} else {
				taskQueue.add(task);
			}

			taskSize = size();
			if (taskSize > 1000) {
				logger.warn("[auto_driver_queue] more task in queue! size:[{}],thread:[{}]", taskSize, Thread.currentThread().getName());
			}

		} finally {
			lock.unlock();
		}

		return taskSize;
	}

	/**
	 * @param tasks
	 */
	public int addTask(final Collection<Runnable> tasks) {
		checkNotNull(tasks, "tasks is nil value ");

		int taskSize = 0;
		final Lock lock = this.lock;
		lock.lock();
		submitTaskCount.increment();
		try {
			if (isEmpty()) {
				taskQueue.addAll(tasks);
				actuator.execute(this);
			} else {
				taskQueue.addAll(tasks);
			}

			taskSize = size();
			if (taskSize > 1000) {
				logger.warn("[auto_driver_queue] more task in queue! size:[{}],thread:[{}]", taskSize, Thread.currentThread().getName());
			}

		} finally {
			lock.unlock();
		}

		return taskSize;
	}

	@Override
	public void execute(Runnable command) {
		addTask(command);
	}

	/**
	 * 将队列里未执行的任务抽离出来 --GAME-TODO(待测试)
	 *
	 * @return
	 */
	public final List<Runnable> drainQueue() {

		List<Runnable> taskList = null;
		final Lock lock = this.lock;
		lock.lock();
		try {
			if (isEmpty()) {
				taskList = Collections.emptyList();
			} else {

				taskList = Lists.newArrayListWithCapacity(size() + 16);
				taskList.addAll(taskQueue);
				taskQueue.clear();
			}
		} finally {
			lock.unlock();
		}

		return taskList;
	}

	@Override
	public void run() {

		try {
			if (isBatchExecute) {
				batchExecute();
			} else {
				singleExecute();
			}
		} finally {
			tryNextCommit();
		}
	}

	/**
	 * 每次提交一个任务
	 */
	void singleExecute() {

		Runnable task = null;
		final Lock lock = this.lock;
		lock.lock();
		try {
			if (!taskQueue.isEmpty()) {
				task = taskQueue.peek();
			}
		} finally {
			lock.unlock();
		}

		// 在锁外执行，保证在执行期间不占用锁
		if (null != task) {
			executeTask(task);
		}
	}

	/**
	 * 每次提交队列中所有任务
	 */
	void batchExecute() {

		List<Runnable> taskList = Lists.newArrayListWithCapacity(size() + 16);
		final Lock lock = this.lock;
		lock.lock();
		try {
			if (!taskQueue.isEmpty()) {
				taskList.addAll(taskQueue);
			}
			taskQueue.clear();
		} finally {
			lock.unlock();
		}

		// 在锁外执行，保证在执行期间不占用锁
		taskList.forEach((task) -> executeTask(task));

		taskList.clear();
		taskList = null; // help GC
	}

	/**
	 * 尝试再提交
	 */
	private void tryNextCommit() {
		final Lock lock = this.lock;
		lock.lock();
		try {

			//弹出已经执行的任务
			if (!isBatchExecute()) {
				taskQueue.poll();
			}

			if (!isEmpty()) {
				actuator.execute(this);
			}
		} finally {
			lock.unlock();
		}
	}

	static void executeTask(final Runnable task) {
		long cur = SystemClock.CLOCK.now();
		try {
			task.run();

			long now = SystemClock.CLOCK.now();

			if (now - cur > 100L) {
				logger.warn("task[ {}, {} ] cost must time:[ {}ms ],thread[ {} ]", task.getClass(), task.toString(), (now - cur),
						Thread.currentThread().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int size() {
		return taskQueue.size();
	}

	public boolean isEmpty() {
		return taskQueue.isEmpty();
	}

	public void clear() {
		final Lock lock = this.lock;
		lock.lock();
		try {
			taskQueue.clear();
		} finally {
			lock.unlock();
		}
	}

	public boolean isBatchExecute() {
		return isBatchExecute;
	}

	public long getTotalTaskCount() {
		return submitTaskCount.longValue();
	}

	/**
	 * @param v
	 * @param msg
	 */
	private static void checkNotNull(Object v, String msg) {
		if (v == null)
			throw Strings.isNullOrEmpty(msg) ? new NullPointerException() : new NullPointerException(msg);
	}

	@Override
	public String toString() {
		return String.format("[AutoDriverQueue]isBatchExecute:%b,size:%d,submitTaskCount:%d", isBatchExecute, size(), getTotalTaskCount());
	}

}
