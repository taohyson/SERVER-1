/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 玩家状态
 *
 * @author wu_hc date: 2017年7月25日 下午12:17:47 <br/>
 */
public enum EPlayerGameStatus {

	NORMAL((byte) 0, "正常状态"), WAIT((byte) 1, "等待开局"), PLAYING((byte) 2, "游戏中"), OBERSER((byte) 3, "观战");

	private final byte status;
	private final String desc;

	private EPlayerGameStatus(byte plat, String desc) {
		this.status = plat;
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

	public static EPlayerGameStatus status(int status) {
		for (EPlayerGameStatus t : EPlayerGameStatus.values()) {
			if (status == t.status)
				return t;
		}
		return NORMAL;
	}

}
