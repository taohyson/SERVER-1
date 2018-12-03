/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wu_hc date: 2018/9/14 11:26 <br/>
 */
public abstract class AbsEnsureTask implements Runnable {

	/**
	 *
	 */
	private static final Logger logger = LoggerFactory.getLogger(AbsEnsureTask.class);

	/**
	 * 最大重试次数
	 */
	private static final int MAX_TRY_TIME = 60;

	/**
	 * 尝试提交次数
	 */
	private int tryTime = 0;

	@Override
	public void run() {
		if (tryTime++ > MAX_TRY_TIME) {
			return;
		}

		if (!execute()) {
			logger.error("task[{}] execute failed,cur try time:{},will retry after {} Second!!", this.getClass(), 5 * tryTime, tryTime);
			GlobalExecutor.schedule(this, 5000L * tryTime);
		}
	}

	protected abstract boolean execute();
}
