/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import com.cai.common.define.ITypeStatus;
import com.cai.common.util.Bits;

/**
 * 状态管理，总共32个状态位
 *
 * @author wu_hc date: 2017年10月17日 下午8:45:05 <br/>
 */
public final class StatusModule {

	/**
	 * 状态
	 */
	private int status;

	/**
	 * 
	 * @param status
	 * @return
	 */
	public static StatusModule newWithStatus(final int status) {
		StatusModule m = new StatusModule();
		m.status = status;
		return m;
	}

	/**
	 * 重置
	 */
	public void reset() {
		status = 0;
	}

	/**
	 * 添加状态
	 * 
	 * @param eTypes
	 */
	public int statusAdd(ITypeStatus... eTypes) {
		for (ITypeStatus e : eTypes) {
			status = Bits.setBitValue(status, e.position(), Bits.byte_1);
		}
		return status;
	}

	/**
	 * 删除状态
	 * 
	 * @param eTypes
	 */
	public int statusDel(ITypeStatus... eTypes) {
		for (ITypeStatus e : eTypes) {
			status = Bits.setBitValue(status, e.position(), Bits.byte_0);
		}
		return status;
	}

	/**
	 * 状态是否为真
	 * 
	 * @param eType
	 * @return
	 */
	public boolean isStatusTrue(ITypeStatus eType) {
		return Bits.checkBitValue(status, eType.position());
	}

	/**
	 * 与
	 * 
	 * @param eTypes
	 * @return
	 */
	public boolean statusAND(ITypeStatus... eTypes) {
		for (ITypeStatus e : eTypes) {
			if (!Bits.checkBitValue(status, e.position())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 或
	 * 
	 * @param eTypes
	 * @return
	 */
	public boolean statusOR(ITypeStatus... eTypes) {
		for (ITypeStatus e : eTypes) {
			if (Bits.checkBitValue(status, e.position())) {
				return true;
			}
		}
		return false;
	}

	public int getStatus() {
		return status;
	}
}
