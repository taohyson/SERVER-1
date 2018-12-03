/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author wu date: 2017年8月29日 下午4:23:59 <br/>
 */
public final class GlobalExecutor {

	private final static Logger logger = LoggerFactory.getLogger(GlobalExecutor.class);

	/***
	 * 
	 * 
	 * 不要用此线程 执行耗时业务
	 */
	private static final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(RuntimeOpt.availableProcessors() << 1,
			new NamedThreadFactory("xy-game-global-thread"));

	/**
	 * 异步执行线程池
	 */
	private static final ScheduledThreadPoolExecutor ASYN_EXECUTOR = new ScheduledThreadPoolExecutor(RuntimeOpt.availableProcessors(),
			new NamedThreadFactory("ASYN_EXECUTOR-thread"));

	/**
	 * 异步执行线程池---专门操作数据库用
	 */
	private static final ScheduledThreadPoolExecutor ASYN_DB_EXECUTOR = new ScheduledThreadPoolExecutor(RuntimeOpt.availableProcessors(),
			new NamedThreadFactory("ASYN_DB_EXECUTOR-thread"));

	public static ScheduledThreadPoolExecutor getScheduledThreadPoolExecutor() {
		return executor;
	}

	public static ScheduledThreadPoolExecutor getScheduledThreadPoolAsyn() {
		return ASYN_EXECUTOR;
	}

	public static ScheduledThreadPoolExecutor getScheduledThreadPoolDB() {
		return ASYN_DB_EXECUTOR;
	}

	/***
	 * 
	 * 
	 * 异步执行线程池
	 */
	public static void asyn_execute(final Runnable task) {
		if (null == task)
			return;

		ASYN_EXECUTOR.execute(() -> {
			try {
				task.run();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("ASYN_EXECUTOR error", e);
			}
		});
	}

	/***
	 * 异步执行线程池---专门操作数据库用
	 */
	public static void asyn_db_execute(final Runnable task) {
		if (null == task)
			return;

		ASYN_DB_EXECUTOR.execute(() -> {
			try {
				task.run();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("ASYN_DB_EXECUTOR error", e);
			}
		});
	}

	/***
	 * 
	 * 
	 * 不要用此线程 执行耗时业务
	 */
	public static void execute(final Runnable task) {
		if (null == task)
			return;

		executor.execute(() -> {
			try {
				task.run();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("global thread pool execute task error", e);
				logger.error("execption task:{}", task);
			}
		});
	}

	/**
	 * 延迟多少多少毫秒执行
	 * 
	 * @param task
	 */
	public static java.util.concurrent.ScheduledFuture<?> schedule(final Runnable task, long delay) {
		if (null == task)
			return null;

		return (java.util.concurrent.ScheduledFuture<?>) ASYN_DB_EXECUTOR.schedule(() -> {
			try {
				task.run();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("global thread pool execute task error", e);
				logger.error("execption task:{}", task);
			}
		}, delay, TimeUnit.MILLISECONDS);
	}

	/**
	 * 延迟多少多少毫秒执行
	 * 
	 * @param task
	 */
	public static java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(final Runnable task, long initialDelay, long period) {
		if (null == task)
			return null;

		return (java.util.concurrent.ScheduledFuture<?>) ASYN_DB_EXECUTOR.scheduleAtFixedRate(() -> {
			try {
				task.run();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("global thread pool execute task error", e);
				logger.error("execption task:{}", task);
			}
		}, initialDelay, period, TimeUnit.MILLISECONDS);
	}

	/**
	 * 
	 */
	public static void shutdownGracefully() {
		executor.shutdown();
	}

	/**
	 * 
	 * @return
	 */
	public static Executor actuator() {
		return executor;
	}

	private GlobalExecutor() {
	}
}
