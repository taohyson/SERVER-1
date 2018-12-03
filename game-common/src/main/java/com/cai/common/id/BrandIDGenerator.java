/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.id;

import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author wu_hc date: 2017年8月4日 下午3:18:19 <br/>
 */
public final class BrandIDGenerator implements IDGenerator {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory.getLogger(BrandIDGenerator.class);

	/**
	 * 步长
	 */
	private static final int STEP = 5;

	/**
	 * 
	 */
	private long currentId;

	/**
	 * @param start
	 */
	public BrandIDGenerator(long currentId) {
		this.currentId = currentId;
	}

	@Override
	public long nextId() {
		long nextId = 0L;
		int offset = ThreadLocalRandom.current().nextInt(STEP) + 1;
		synchronized (this) {
			currentId += offset;
			nextId = currentId;
		}
		// 理论不存在，除非量特别巨大了
		if (nextId > 99999999L || nextId < 10000000L) {
			logger.error("########### BrandIDGenerator id 溢出了########## currentId:{}", currentId);
		}
		return nextId;
	}
}
