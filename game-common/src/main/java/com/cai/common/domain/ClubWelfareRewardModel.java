package com.cai.common.domain;

import java.io.Serializable;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/9/14 15:11
 */
public class ClubWelfareRewardModel implements Serializable {
	private static final long serialVersionUID = 2208202495893290640L;

	/**
	 * 唯一Id
	 */
	private int id;

	/**
	 * 奖励类型(1-真实奖励 2-展示奖励)
	 */
	private int rewardType;
	/**
	 * 奖励权重(1-常规奖励 2-辅助奖励)
	 */
	private int rewardWeightType;
	/**
	 * 奖品Id
	 */
	private int awardId;
	/**
	 * 奖品数量
	 */
	private int awardNum;
	/**
	 * 奖品图片
	 */
	private String awardIcon;
	/**
	 * 奖品描述
	 */
	private String awardDesc;
	/**
	 * 每日抽奖次数
	 */
	private int dailyLotteryNum;
	/**
	 * 展示概率
	 */
	private int showRate;
	/**
	 * 备注
	 */
	private String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRewardType() {
		return rewardType;
	}

	public void setRewardType(int rewardType) {
		this.rewardType = rewardType;
	}

	public int getRewardWeightType() {
		return rewardWeightType;
	}

	public void setRewardWeightType(int rewardWeightType) {
		this.rewardWeightType = rewardWeightType;
	}

	public int getAwardId() {
		return awardId;
	}

	public void setAwardId(int awardId) {
		this.awardId = awardId;
	}

	public int getAwardNum() {
		return awardNum;
	}

	public void setAwardNum(int awardNum) {
		this.awardNum = awardNum;
	}

	public String getAwardIcon() {
		return awardIcon;
	}

	public void setAwardIcon(String awardIcon) {
		this.awardIcon = awardIcon;
	}

	public String getAwardDesc() {
		return awardDesc;
	}

	public void setAwardDesc(String awardDesc) {
		this.awardDesc = awardDesc;
	}

	public int getDailyLotteryNum() {
		return dailyLotteryNum;
	}

	public void setDailyLotteryNum(int dailyLotteryNum) {
		this.dailyLotteryNum = dailyLotteryNum;
	}

	public int getShowRate() {
		return showRate;
	}

	public void setShowRate(int showRate) {
		this.showRate = showRate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
