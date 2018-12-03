/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 红点类型
 *
 * @author wu_hc date: 2017年10月17日 下午8:04:07 <br/>
 */
public enum EHeartType implements ITypeStatus {

	/**
	 * 
	 */
	NONE((byte) -1),

	/**
	 * 背包
	 */
	BAG((byte) 0),

	/**
	 * 邮件
	 */
	EMAIL((byte) 1),

	/**
	 * 背包-普通道具
	 */
	BAG_NORMAL_PROP((byte) 2),

	/**
	 * 背包-参赛券
	 */
	BAG_MATCH_CARD((byte) 3),

	/**
	 * 背包-红包
	 */
	BAG_RED_PACKET((byte) 4),

	/**
	 * 背包-实物
	 */
	BAG_REAL_ITEM((byte) 5),

	/**
	 * 背包-活动奖励
	 */
	BAG_ACTIVITY_REWARD((byte) 6),

	/**
	 * 红包池
	 */
	REDPACKET_POOL((byte) 7);

	/**
	 * 位置
	 */
	private final byte position;

	/**
	 * @param position
	 */
	private EHeartType(byte position) {
		this.position = position;
	}

	/**
	 * 
	 * @param position
	 * @return
	 */
	public static EHeartType get(int position) {
		for (EHeartType type : EHeartType.values()) {
			if (position == type.position()) {
				return type;
			}
		}
		return NONE;
	}

	@Override
	public byte position() {
		return position;
	}
}
