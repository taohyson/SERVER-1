/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.util;

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.function.Supplier;

import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.xianyi.framework.core.transport.Session;
import com.xianyi.framework.core.transport.netty.session.C2SSession;

import io.netty.util.AttributeKey;

/**
 *
 * @author wu_hc
 */
public final class SessionUtil {

	/**
	 * roomid:logic
	 */
	static final AttributeKey<Map<Integer, Integer>> key = AttributeKey.valueOf("room-logic-attr-key");

	/**
	 * 最新访问的
	 */
	static final AttributeKey<Pair<Integer, Integer>> lastAccess = AttributeKey.valueOf("room-logic-attr-last--key");

	private SessionUtil() {
	}

	/**
	 * 
	 * @param session
	 * @return
	 */
	public static int getLogicSvrId(C2SSession session, int roomId) {
		final Lock lock = session.getMainLock();
		lock.lock();
		try {
			Map<Integer, Integer> m = session.attr(SessionUtil.key).get();
			return (null != m && m.containsKey(roomId)) ? m.get(roomId).intValue()
					: -1/* getLastAccessLogicSvrId(session) */;
		} finally {
			lock.unlock();
		}
	}

	/**
	 * 
	 * @param session
	 * @param logicSvrId
	 */
	public static void setLogicSvrId(C2SSession session, int logicSvrId, int roomId) {
		final Lock lock = session.getMainLock();
		lock.lock();
		try {
			Map<Integer, Integer> m = session.attr(SessionUtil.key).get();
			if (null == m) {
				m = Maps.newHashMap();
				session.attr(SessionUtil.key).set(m);
			}
			m.put(roomId, logicSvrId);

			RoomIDUtil.ID_CACHE.put(roomId, logicSvrId);

			session.attr(SessionUtil.lastAccess).set(Pair.of(roomId, logicSvrId));
		} finally {
			lock.unlock();
		}
	}

	/**
	 * 获取最近设置的逻辑服id
	 * 
	 * @param session
	 * @return
	 */
	public static int getLastAccessLogicSvrId(C2SSession session) {
		Pair<Integer, Integer> lastAccess = session.attr(SessionUtil.lastAccess).get();
		return null == lastAccess ? -1 : lastAccess.getSecond().intValue();
	}

	/**
	 * 
	 * @param session
	 * @return
	 */
	public static Pair<Integer, Integer> getLastAccess(C2SSession session) {
		Pair<Integer, Integer> lastAccess = session.attr(SessionUtil.lastAccess).get();
		return null == lastAccess ? Pair.of(-1, -1) : lastAccess;
	}

	/**
	 * 随机一个之前登陆过的逻辑服
	 * 
	 * @param session
	 * @return
	 */
	public static int randomHistoryLogicSvrId(C2SSession session) {
		final Lock lock = session.getMainLock();
		lock.lock();
		try {
			Map<Integer, Integer> m = session.attr(SessionUtil.key).get();
			if (null == m || m.isEmpty()) {
				return -1;
			}
			int[] roomIds = Ints.toArray(m.values());
			return roomIds[RandomUtil.getRandomNumber(roomIds.length)];
		} finally {
			lock.unlock();
		}
	}

	/**
	 * 设置参数
	 * 
	 * @param session
	 * @param key
	 * @param value
	 */
	public static <T> void setAttr(Session session, AttributeKey<T> key, T value) {
		session.attr(key).set(value);
	}

	/**
	 * 获得参数
	 * 
	 * @param session
	 * @param key
	 * @return
	 */
	public static <T> T getAttr(Session session, AttributeKey<T> key) {
		return session.attr(key).get();
	}

	/**
	 * 获得参数
	 * 
	 * @param session
	 * @param key
	 * @return
	 */
	public static <T> T getAttrOrDefault(Session session, AttributeKey<T> key, T def) {
		T v = session.attr(key).get();
		return null != v ? v : def;
	}

	/**
	 * 获得参数
	 * 
	 * @param session
	 * @param key
	 * @return
	 */
	public static <T> T getAttrOrDefault(C2SSession session, AttributeKey<T> key, Supplier<T> def) {
		T v = session.attr(key).get();
		return null != v ? v : def.get();
	}

	/**
	 * 关闭会话
	 * 
	 * @param session
	 */
	public static void shutdown(final Session session) {
		if (null != session) {
			session.shutdownGracefully();
		}
	}
}
