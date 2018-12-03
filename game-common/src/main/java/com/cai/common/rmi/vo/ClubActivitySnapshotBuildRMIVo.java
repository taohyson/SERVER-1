/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 
 *
 * @author wu_hc date: 2018年1月24日 下午12:14:13 <br/>
 */
public final class ClubActivitySnapshotBuildRMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int clubId;
	private long activityId;

	public static ClubActivitySnapshotBuildRMIVo newVO(final int clubId, long activityId) {
		return new ClubActivitySnapshotBuildRMIVo(clubId, activityId);
	}

	/**
	 * @param clubId
	 * @param activityId
	 */
	private ClubActivitySnapshotBuildRMIVo(int clubId, long activityId) {
		this.clubId = clubId;
		this.activityId = activityId;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public long getActivityId() {
		return activityId;
	}

	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}

}
