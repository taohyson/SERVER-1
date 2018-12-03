/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author wu_hc
 *
 */
public class NamedThreadFactory implements ThreadFactory, UncaughtExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(NamedThreadFactory.class);

	/**
	 * 是否为后台线程
	 */
	private boolean daemon;

	/**
	 * 线程名
	 */
	private String threadName;
	/**
	 * 优先级
	 */
	private int prio = Thread.NORM_PRIORITY;
	/**
	 * 线程组
	 */
	private ThreadGroup group;
	/**
	 * 线程数目
	 */
	private AtomicInteger threadNumber = new AtomicInteger(1);

	/**
	 * 
	 * @param threadName
	 */
	public NamedThreadFactory(final String threadName) {
		this(threadName, false);
		group = new ThreadGroup(threadName);
	}

	/**
	 * 
	 * 
	 * @param threadName
	 *            线程名前缀
	 * @param daemon
	 *            是否为后台线程
	 */
	public NamedThreadFactory(final String threadName, final boolean daemon) {
		this.threadName = threadName;
		this.daemon = daemon;
		group = new ThreadGroup(threadName);
	}

	/**
	 * 
	 * 
	 * @param name
	 * @param prio
	 */
	public NamedThreadFactory(final String threadName, final int prio) {
		this.threadName = threadName;
		this.prio = prio;
		this.daemon = false;
		group = new ThreadGroup(threadName);
	}

	/**
	 * 
	 * 
	 * @param name
	 * @param prio
	 */
	public NamedThreadFactory(final String threadName, final boolean daemon, final int prio) {
		this.prio = prio;
		this.daemon = daemon;
		this.threadName = threadName;
		group = new ThreadGroup(threadName);
	}

	@Override
	public Thread newThread(final Runnable r) {
		Thread t = new Thread(group, r);
		t.setName(threadName + "-" + threadNumber.getAndIncrement());
		t.setPriority(prio);
		t.setDaemon(daemon);
		t.setUncaughtExceptionHandler(this);
		return t;
	}

	@Override
	public void uncaughtException(final Thread thread, final Throwable throwable) {
		LOG.error(String.format("线程【%s】抛出异常。", thread.getName()), throwable);
	}

	/**
	 * @return the threadName
	 */
	public String getThreadName() {
		return threadName;
	}

}
