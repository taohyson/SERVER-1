/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 * 考虑用来存放房间一些通用设置，比如是否允许半途加入等
 *
 * @author wu_hc date: 2017年11月3日 下午6:09:49 <br/>
 */
public enum ERoomSettingStatus implements ITypeStatus {
	NONE((byte) -1),

	// 禁止中途加入
	ROOM_FORBID_HALF_WAY_ENTER((byte) 0),;

	private final byte position;

	private ERoomSettingStatus(byte position) {
		this.position = position;
	}

	@Override
	public byte position() {
		return position;
	}

	/**
	 * 
	 * @param position
	 * @return
	 */
	public static ERoomSettingStatus of(int position) {
		for (ERoomSettingStatus type : ERoomSettingStatus.values()) {
			if (position == type.position()) {
				return type;
			}
		}
		return NONE;
	}

}
