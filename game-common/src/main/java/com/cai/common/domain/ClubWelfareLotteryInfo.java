package com.cai.common.domain;

import java.io.Serializable;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/9/25 10:08
 */
public class ClubWelfareLotteryInfo implements Serializable {

	private static final long serialVersionUID = 8514299382335958858L;
	/**
	 * 奖励唯一Id
	 */
	private int rewardId;
	/**
	 * 物品Id
	 */
	private int itemId;
	/**
	 * 已抽取次数
	 */
	private int lotteryCount;

	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getLotteryCount() {
		return lotteryCount;
	}

	public void setLotteryCount(int lotteryCount) {
		this.lotteryCount = lotteryCount;
	}
}
