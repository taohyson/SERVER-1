/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 减少在业务线程中系统时间调用性能损耗
 *
 * @author wu_hc date: 2018年2月16日 下午8:58:14 <br/>
 */
public final class SystemClock {

	public static final SystemClock CLOCK = new SystemClock(40L);
	private final long precision;
	private final AtomicLong now;

	private SystemClock(long precision) {
		this.precision = precision;
		now = new AtomicLong(System.currentTimeMillis());
		scheduleClockUpdating();
	}

	private void scheduleClockUpdating() {
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
			Thread thread = new Thread(runnable, "XY-Game-System-Clock");
			thread.setDaemon(true);
			return thread;
		});
		scheduler.scheduleAtFixedRate(() -> now.set(System.currentTimeMillis()), precision, precision, TimeUnit.MILLISECONDS);
	}

	public long now() {
		return now.get();
	}

	public long precision() {
		return precision;
	}

	public static void main(String[] args) {
		System.out.println(SystemClock.CLOCK.now());
	}
}
