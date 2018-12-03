package com.cai.common.define;

/**
 * 活动奖品类型
 * 
 * @author tang
 *
 */
public enum EActivityRewardType {
	ITEM_REDPACKET(1, "道具奖品"), ACTIVITY_REDPACKET(2, "红包池限时红包"), GOLD(3, "闲逸豆"), COIN(4, "金币"), WELFARE(5, "福卡");
	private int id;
	private String desc;

	EActivityRewardType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
