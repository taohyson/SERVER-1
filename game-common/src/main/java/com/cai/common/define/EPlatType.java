/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *
 * @author wu_hc date: 2017年7月21日 下午5:04:13 <br/>
 */
public enum EPlatType {
	UNKOWN((byte) 0, "0"), ANDROID((byte) 1, "android"), IOS((byte) 2, "ios"), PC((byte) 3, "pc");

	private final byte plat;
	private final String desc;

	private EPlatType(byte plat, String desc) {
		this.plat = plat;
		this.desc = desc;
	}

	/**
	 * @return the plat
	 */
	public byte getPlat() {
		return plat;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	public static EPlatType platType(int plat) {
		for (EPlatType t : EPlatType.values()) {
			if (plat == t.plat)
				return t;
		}
		return UNKOWN;
	}
}
