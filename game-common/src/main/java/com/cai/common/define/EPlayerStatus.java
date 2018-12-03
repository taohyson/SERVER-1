/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *
 * @author wu_hc date: 2017年10月18日 上午11:49:37 <br/>
 */
public enum EPlayerStatus {
	NONE((byte) 0, "未知"), ONLINE((byte) 1, "上线"), OFFLINE((byte) 2, "下线");

	private final byte status;
	private final String desc;

	private EPlayerStatus(byte status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	/**
	 * @return the status
	 */
	public byte status() {
		return status;
	}

	/**
	 * @return the desc
	 */
	public String desc() {
		return desc;
	}

	public static EPlayerStatus status(int status) {
		for (EPlayerStatus t : EPlayerStatus.values()) {
			if (status == t.status)
				return t;
		}
		return NONE;
	}

}
