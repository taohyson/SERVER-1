/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import static java.util.stream.Collectors.toList;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 *
 * @author wu_hc date: 2017年9月4日 下午12:13:29 <br/>
 */
public final class FilterUtil {

	/**
	 * 过滤
	 * 
	 * @param collect
	 * @param predicate
	 * @return
	 */
	public static final <T> List<T> filter(Collection<T> collect, Predicate<T> predicate) {
		return collect.stream().filter(predicate).collect(toList());
	}

	private FilterUtil() {
	}
}
