package com.cai.common.define;

/**
 * 牌局事件时机
 *
 * @author wu_hc date: 2018年08月10日 下午2:34:57 <br/>
 */
public enum ETriggerType {

	/**
	 * 起手， 指的是手牌出现的牌型
	 */
	START(1),

	/**
	 * 进行中，中途打出的牌型，重点是打出的牌型才算
	 */
	ING(2),

	/**
	 * 结束，结束时胡牌类型
	 */
	OVER(3),
	;

	final int category;

	ETriggerType(int category) {
		this.category = category;
	}

	public int getCategory() {
		return category;
	}

	public static ETriggerType of(int category) {
		for (ETriggerType type : ETriggerType.values()) {
			if (category == type.category) {
				return type;
			}
		}
		return null;
	}
}
