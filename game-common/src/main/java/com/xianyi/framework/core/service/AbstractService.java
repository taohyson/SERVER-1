/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author wu_hc
 */
public abstract class AbstractService implements Service {

	private String desc;

	private int order;
	/**
	 * 日志
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public String desc() {
		return this.desc;
	}

	@Override
	public int order() {
		return this.order;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

}
