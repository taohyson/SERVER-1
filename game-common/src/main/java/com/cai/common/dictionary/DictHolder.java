/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.dictionary;

import java.io.Serializable;

/**
 * 
 *
 * @author wu_hc date: 2017年10月29日 下午1:14:25 <br/>
 */
public final class DictHolder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 类型
	 */
	private final String type;

	/**
	 * 内容
	 */
	private final Object dicts;

	/**
	 * 
	 * @param type
	 * @param dicts
	 * @return
	 */
	public static DictHolder newHolder(String type, Object dicts) {
		return new DictHolder(type, dicts);
	}

	/**
	 * 
	 */
	public DictHolder() {
		this(null, null);
	}

	/**
	 * @param type
	 * @param dicts
	 */
	private DictHolder(String type, Object dicts) {
		super();
		this.type = type;
		this.dicts = dicts;
	}

	public String getType() {
		return type;
	}

	@SuppressWarnings("unchecked")
	public <T> T getDicts() {
		return (T) dicts;
	}

	public <T> T getDicts(Class<T> clz) {
		return clz.cast(dicts);
	}

	@Override
	public String toString() {
		return "DictHolder [type=" + type + ", dicts=" + dicts + "]";
	}

}
