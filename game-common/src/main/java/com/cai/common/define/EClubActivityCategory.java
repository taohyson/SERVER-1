/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

import com.cai.common.util.Bits;

/**
 * 
 *
 * @author wu_hc date: 2018年01月22日 下午2:34:57 <br/>
 */
public enum EClubActivityCategory {

	NONE((byte) -1), GAME_TIME(Bits.byte_1), GAME_WIN(Bits.byte_2);

	private final byte category;

	private EClubActivityCategory(byte category) {
		this.category = category;
	}

	public final byte category() {
		return category;
	}

	/**
	 * 
	 * @param category
	 * @return
	 */
	public static EClubActivityCategory of(int category) {
		for (EClubActivityCategory type : EClubActivityCategory.values()) {
			if (category == type.category) {
				return type;
			}
		}
		return NONE;
	}
}
