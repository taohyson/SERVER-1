/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.xianyi.framework.core.transport.Session;

/**
 * PS：此处随机接口提供给服务器分配用，很重要，修改需要谨慎！！！！
 *
 * @author wu_hc date: 2018年1月15日 下午2:52:59 <br/>
 */
public final class ServerRandomUtil {

	/**
	 * 
	 * @param num
	 * @return
	 */
	public static int getRandomNumber(int num) {
		return ThreadLocalRandom.current().nextInt(num);
	}

	/**
	 * 排除后随机
	 * 
	 * @param c1
	 * @param c2
	 * @return
	 */
	public static int eliminateAndRandom(Set<Integer> source, Set<Integer> target) {
		if (null == source || source.isEmpty()) {
			return -1;
		}
		if (null != target && !target.isEmpty()) {
			int[] actives = Ints.toArray(Sets.difference(source, target));
			if (actives.length == 0) {
				return -1;
			}
			return actives[ServerRandomUtil.getRandomNumber(actives.length)];
		} else {
			int[] actives = Ints.toArray(source);
			return actives[ServerRandomUtil.getRandomNumber(actives.length)];
		}
	}

	/**
	 * 交集后随机
	 * 
	 * @param c1
	 * @param c2
	 * @return 如果交集为空，返回-1
	 */
	public static int intersectionAndRandom(Collection<Integer> c1, Collection<Integer> c2) {
		Set<Integer> intersectionSet = Sets.newHashSet();
		if (null != c1 && !c1.isEmpty()) {
			c1.forEach((v) -> {
				intersectionSet.add(v);
			});
		}

		if (null != c2 && !c2.isEmpty()) {
			c2.forEach((v) -> {
				intersectionSet.add(v);
			});
		}
		if (intersectionSet.isEmpty()) {
			return -1;
		}

		int[] actives = Ints.toArray(intersectionSet);
		return actives[ServerRandomUtil.getRandomNumber(actives.length)];
	}

	/**
	 * 随机会话
	 * 
	 * @param sessions
	 * @return
	 */
	public static <T extends Session> Optional<T> randomSession(Collection<T> sessions) {
		List<T> activeSessions = FilterUtil.filter(sessions, Session::isActive);
		return activeSessions.isEmpty() ? Optional.empty() : Optional.of(activeSessions.get(ServerRandomUtil.getRandomNumber(activeSessions.size())));
	}

	private ServerRandomUtil() {
	}

}
