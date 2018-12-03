/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * @author wu_hc date: 2017年8月7日 下午12:11:22 <br/>
 */
public enum EServerType {

	UNKOWN((byte) -1, ""), 
	CENTER((byte) 1, "中心服"), 
	PROXY((byte) 2, "代理服"), 
	LOGIC((byte) 3, "逻辑服"), 
	CLUB((byte) 4, ""), 
	MATCH((byte) 5, "比赛服"), 
	GATE((byte) 6, "gate"), 
	COIN((byte)7, "金币场"),
	FOUNDATION((byte)8, "基础服");

	private final byte type;
	private final String desc;

	/**
	 * @param status
	 * @param desc
	 */
	private EServerType(byte type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public final byte type() {
		return this.type;
	}

	public final String desc() {
		return this.desc;
	}

	/**
	 * 
	 * @param status
	 * @return
	 */
	public static EServerType type(int type) {
		for (EServerType s : EServerType.values()) {
			if (s.type == (byte) type)
				return s;
		}
		return EServerType.UNKOWN;
	}
}
