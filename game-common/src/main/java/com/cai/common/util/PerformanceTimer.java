package com.cai.common.util;

import java.util.concurrent.TimeUnit;

/**
 * 计行时间计算工具
 * 
 * @author run
 * @Create 2013-3-28
 */
public class PerformanceTimer {
	private long _begin;

	public PerformanceTimer() {
		_begin = System.currentTimeMillis();
	}

	public void reset() {
		this._begin = System.currentTimeMillis();
	}

	public long get() {
		return System.currentTimeMillis() - this._begin;
	}

	public String getStr() {
		long l1 = System.currentTimeMillis() - this._begin;
		return "(" + l1 + "ms)";
	}

	public long getBegin() {
		return _begin;
	}

	/**
	 * Returns a reasonably scopes duration string.
	 * 
	 * @param start
	 *            The start time.
	 * @return The duration string.
	 */
	public String duration() {
		final long delta = System.currentTimeMillis() - _begin;

		if (TimeUnit.MILLISECONDS.toMinutes(delta) > 0) {
			return TimeUnit.MILLISECONDS.toMinutes(delta) + " minutes";
		} else if (TimeUnit.MILLISECONDS.toSeconds(delta) > 0) {
			return TimeUnit.MILLISECONDS.toSeconds(delta) + " s";
		}
		return delta + " ms";
	}

}
