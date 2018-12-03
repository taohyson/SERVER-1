/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.rmi;

import java.util.Map;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RMI接口抽象
 *
 * @author wu_hc date: 2017年10月17日 下午4:00:55 <br/>
 */
public abstract class IRMIHandler<T, R> implements Function<T, R> {
	/**
	 * 
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public final R apply(T arg) {
		try {
			return this.execute(arg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	protected final <C> C get(T args, Object key, Class<C> clzz) {
		if (args instanceof Map) {
			return clzz.cast(((Map) (args)).get(key));
		}
		return null;
	}

	/**
	 * 
	 * @param arg
	 * @return
	 */
	protected abstract R execute(T arg);
}
