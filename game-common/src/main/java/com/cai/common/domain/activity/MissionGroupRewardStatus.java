package com.cai.common.domain.activity;

/**
 * 任务组奖励领取状态
 * 
 * @author tang 2018年8月2日
 */
public class MissionGroupRewardStatus {
	private int groupId;
	private int status;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static MissionGroupRewardStatus build(int groupId, int status) {
		MissionGroupRewardStatus m = new MissionGroupRewardStatus();
		m.setGroupId(groupId);
		m.setStatus(status);
		return m;
	}

}
