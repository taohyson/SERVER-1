package com.cai.common.define;

/**
 * 特殊牌型，用于特殊上报{@see DB table[card_category]}
 *
 * @author wu_hc date: 2018年08月10日 下午2:34:57 <br/>
 */
public enum ECardCategory {

	/**
	 * 余牌
	 */
	SURPLUS(1, 0, 0x00000000),

	;

	final int id;
	final int gameId;
	final long cardTypeValue;
	final String cardCategory;

	ECardCategory(int id, int gameId, long cardTypeValue) {
		this.id = id;
		this.gameId = gameId;
		this.cardTypeValue = cardTypeValue;
		this.cardCategory = String.join(":", Integer.toString(gameId), Long.toString(cardTypeValue));
	}

	public int id() {
		return id;
	}

	/**
	 * 牌型串
	 *
	 * @return
	 */
	public final String cardCategory() {
		return this.cardCategory;
	}

	/**
	 * 牌型值
	 *
	 * @return
	 */
	public final long cardTypeValue() {
		return this.cardTypeValue;
	}

	/**
	 * @param id
	 * @return
	 */
	public static ECardCategory of(int id) {
		for (ECardCategory type : ECardCategory.values()) {
			if (id == type.id) {
				return type;
			}
		}
		return null;
	}
}
