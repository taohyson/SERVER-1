/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * 
 * 缓存ip和城市吗的映射关系,防止多次请求
 * 
 * @author wu date: 2017年9月4日 下午2:09:55 <br/>
 */
public final class IPAndCityCache {

	private static final Map<String, Integer> cache = Maps.newConcurrentMap();

	public static Integer append(String ip, Integer cityCode) {
		return cache.put(ip, cityCode);
	}

	public static Integer getCityCodeIfExsit(final String ip) {
		return cache.get(ip);
	}

	private IPAndCityCache() {
	}
}
