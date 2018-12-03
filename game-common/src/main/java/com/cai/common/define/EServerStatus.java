/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 * 服务器状态，对应logic_game_server和proxy_game_server的open字段
 * 
 * @author wu_hc date: 2017年7月18日 上午10:51:36 <br/>
 */
public enum EServerStatus {
	NONE((byte) -1), CLOSE((byte) 0), ACTIVE((byte) 1), REPAIR((byte) 2), CLOSEING((byte) 3);

	private final byte status;

	/**
	 * 
	 * @param status
	 */
	EServerStatus(byte status) {
		this.status = status;
	}

	/**
	 * @return the status
	 */
	public byte getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 * @return
	 */
	public static EServerStatus getStatus(int status) {
		if (status < Byte.MIN_VALUE || status > Byte.MAX_VALUE - 1) {
			return EServerStatus.NONE;
		}
		for (EServerStatus s : EServerStatus.values()) {
			if (s.status == (byte) status)
				return s;
		}
		return EServerStatus.NONE;
	}
}
