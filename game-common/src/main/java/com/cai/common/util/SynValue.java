package com.cai.common.util;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public abstract class SynValue<K, V> {

	private static LoadingCache<Object, ReentrantLock> cache = CacheBuilder.newBuilder().expireAfterAccess(1, TimeUnit.HOURS)
			.build(new CacheLoader<Object, ReentrantLock>() {
				@Override
				public ReentrantLock load(Object key) throws Exception {
					return new ReentrantLock();
				}
			});

	public abstract V exevute(K key) throws Exception;

	public V startWork(K key) {
		return startWork(key, null);
	}

	public V startWork(K key, V result) {
		ReentrantLock reentrantLock = getReentrantLock(key);
		if (reentrantLock == null)
			return result;

		reentrantLock.lock();
		try {
			return exevute(key);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reentrantLock.unlock();
		}
		return result;
	}

	private ReentrantLock getReentrantLock(K key) {
		try {
			return cache.get(key);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean isInCache(Object key) {
		return cache.getIfPresent(key) != null;
	}
}
