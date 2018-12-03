/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

import com.cai.common.domain.StatusModule;
import com.cai.common.util.Bits;

/**
 * 专属豆的相关设置
 *
 * @author wu_hc date: 2018年4月9日 上午10:52:54 <br/>
 */
public enum ExclusiveSettingStatus implements ITypeStatus {

	/**
	 * 不可以赠送
	 */
	NOT_OFFER(Bits.byte_0),

	/**
	 * 不可以出售
	 */
	NOT_SELL(Bits.byte_1),

	/**
	 * 只能赠送给一级代理
	 */
	ONLY_OFFER_FIRST_PROXY(Bits.byte_2);

	// [0,32)
	private final byte position;

	ExclusiveSettingStatus(byte position) {
		this.position = position;
	}

	@Override
	public byte position() {
		return position;
	}

	/**
	 * @param position
	 * @return
	 */
	public static ExclusiveSettingStatus of(int position) {
		for (ExclusiveSettingStatus type : ExclusiveSettingStatus.values()) {
			if (position == type.position()) {
				return type;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		StatusModule statusModule = StatusModule.newWithStatus(3);
		for (ExclusiveSettingStatus value : ExclusiveSettingStatus.values()) {
			System.out.println(String.format("name:%s,status:%b", value.name(), statusModule.isStatusTrue(value)));
		}
	}
}
