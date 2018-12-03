/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * 
 *
 * @author wu_hc date: 2017年8月9日 上午10:38:23 <br/>
 */
public final class RoomIDUtil {

	/**
	 * 房间ID-->逻辑服ID影射关系
	 */
	public static final LoadingCache<Integer, Integer> ID_CACHE = CacheBuilder.newBuilder().maximumSize(100000L).expireAfterAccess(2, TimeUnit.SECONDS)
			.build(new CacheLoader<Integer, Integer>() {

				@Override
				public Integer load(Integer key) throws Exception {
					return -1;
				}
			});

	private RoomIDUtil() {
	}

	public static void main(String[] args) {
		try {
			ID_CACHE.put(3, 5);
			System.out.println(ID_CACHE.getUnchecked(3));
			Thread.sleep(4000L);
			System.out.println(ID_CACHE.getUnchecked(3));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
