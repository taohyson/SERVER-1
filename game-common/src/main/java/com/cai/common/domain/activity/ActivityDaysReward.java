package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 按天任务奖励
 *
 * @author tang date: 2018年8月15日 下午4:41:09 <br/>
 */
public class ActivityDaysReward implements Serializable {
	private static final long serialVersionUID = 1L;
	private int dayIndex;
	private String rewardRemark;
	private String icon;
	private List<NewActivityPrizeModel> rewardList = new ArrayList<>();

	public int getDayIndex() {
		return dayIndex;
	}

	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}

	public String getRewardRemark() {
		return rewardRemark;
	}

	public void setRewardRemark(String rewardRemark) {
		this.rewardRemark = rewardRemark;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<NewActivityPrizeModel> getRewardList() {
		return rewardList;
	}

	public void setRewardList(List<NewActivityPrizeModel> rewardList) {
		this.rewardList = rewardList;
	}

}
