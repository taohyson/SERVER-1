/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 排行榜类型
 * 
 * @author wu_hc
 */
public enum ERankType {

	NONE(-1), // 无效排行榜
	MONEY(1), // 金币--富豪榜
	GOLD(2), // 闲逸豆--土豪榜
	;

	private int type;

	/**
	 * @param type
	 */
	private ERankType(int type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 * @return
	 */
	public static ERankType of(int type) {
		for (ERankType t : ERankType.values()) {
			if (type == t.type)
				return t;
		}
		return ERankType.NONE;
	}
}
