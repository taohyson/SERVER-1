/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

import com.cai.common.util.Bits;

/**
 * 
 * 财富类型
 *
 * @author wu_hc date: 2017年11月10日 上午10:59:10 <br/>
 */
public enum EWealthCategory {
	/**
	 * 
	 */
	NONE((byte) -1, "-"), GOLD(Bits.byte_1, "房卡"), MONEY(Bits.byte_2, "金币"), EXCLUSIVE_GOLD(Bits.byte_3, "专属豆");

	private final byte category;
	private final String desc;

	private EWealthCategory(byte category, String desc) {
		this.category = category;
		this.desc = desc;
	}

	/**
	 * @return the status
	 */
	public byte category() {
		return category;
	}

	/**
	 * @return the desc
	 */
	public String desc() {
		return desc;
	}

	public static EWealthCategory of(int category) {
		for (EWealthCategory t : EWealthCategory.values()) {
			if (category == t.category)
				return t;
		}
		return NONE;
	}

}
