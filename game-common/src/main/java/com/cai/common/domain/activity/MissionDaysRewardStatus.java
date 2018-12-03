package com.cai.common.domain.activity;

/**
 * 每天任务奖励领取状态
 * 
 * @author tang 2018年8月14日
 */
public class MissionDaysRewardStatus {
	private int dayIndex;
	private int status;

	public int getDayIndex() {
		return dayIndex;
	}

	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static MissionDaysRewardStatus build(int dayIndex, int status) {
		MissionDaysRewardStatus m = new MissionDaysRewardStatus();
		m.setStatus(status);
		m.setDayIndex(dayIndex);
		return m;
	}

}
