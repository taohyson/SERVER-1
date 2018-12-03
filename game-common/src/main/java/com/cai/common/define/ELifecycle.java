/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

import com.cai.common.util.Bits;

/**
 * 
 *
 * @author wu_hc date: 2018年1月29日 下午2:17:53 <br/>
 */
public enum ELifecycle {

	NONE(Bits.byte_0), BEFORE(Bits.byte_1), ING(Bits.byte_2), AFTER(Bits.byte_3);

	private final byte status;

	/**
	 * @param status
	 */
	private ELifecycle(byte status) {
		this.status = status;
	}

	/**
	 * 
	 * @param identity
	 * @return
	 */
	public static ELifecycle of(int identity) {
		for (ELifecycle i : ELifecycle.values()) {
			if (identity == i.status) {
				return i;
			}
		}
		return null;
	}

	public byte status() {
		return this.status;
	}

}
