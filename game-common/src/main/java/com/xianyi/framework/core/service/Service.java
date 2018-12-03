/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.service;

import com.cai.common.util.Lifecycle;

/**
 *
 * @author wu_hc
 */
public interface Service extends Lifecycle {

	/**
	 * 
	 * @return
	 */
	String desc();

	/**
	 * 
	 * @return
	 */
	int order();
}
