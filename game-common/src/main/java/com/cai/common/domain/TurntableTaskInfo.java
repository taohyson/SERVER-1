package com.cai.common.domain;

/**
 * 转盘活动任务
 * @author chansonyan
 * 2018年5月14日
 */
public class TurntableTaskInfo extends DBBaseModel {
	
	private static final long serialVersionUID = 1L;
	//是否重复
	private int isRepeatFinish;
	//任务ID
	private int missionId;
	//获得抽奖券次数
	private int times;
	
	public int getIsRepeatFinish() {
		return isRepeatFinish;
	}
	public void setIsRepeatFinish(int isRepeatFinish) {
		this.isRepeatFinish = isRepeatFinish;
	}
	public int getMissionId() {
		return missionId;
	}
	public void setMissionId(int missionId) {
		this.missionId = missionId;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
}
