/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

/**
 * 
 * 三参消费者
 * 
 * @author wu_hc date: 2018年1月5日 下午6:00:05 <br/>
 */
@FunctionalInterface
public interface ThreeConsumer<T, U, O> {

	/**
	 * 
	 * @param t
	 * @param u
	 * @param o
	 */
	void accept(T t, U u, O o);
}
