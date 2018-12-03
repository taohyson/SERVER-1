package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 
 * 新手豪礼配置里的每日奖励json数据
 *
 * @author tang date: 2018年8月15日 下午4:45:49 <br/>
 */
public class ActivityDaysRandomReward implements Serializable {
	private static final long serialVersionUID = 1L;
	private int dayIndex;// 第几天的奖励
	private String rewardRemark;// 描述
	private String icon;// 奖励展示图
	// {"dayIndex":1,"rewardRemark":"1-2元红包","icon":"http://tpfw.oss-cn-shenzhen.aliyuncs.com/10test/activityprize/images/5og13br11528430714598.png"}

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

}
