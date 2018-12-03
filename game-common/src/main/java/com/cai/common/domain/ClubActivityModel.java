/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.util.Date;

/**
 * 俱乐部活动
 * 
 * @author wu_hc date: 2017年01月22日 下午4:18:09 <br/>
 */
public final class ClubActivityModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 活动id
	 */
	private long id;

	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 活动名称
	 */
	private String activityName;

	/**
	 * 活动类型
	 */
	private int activityType;

	/**
	 * 开始时间
	 */
	private Date activityStartDate;

	/**
	 * 结束时间
	 */
	private Date activityEndDate;

	/**
	 * 活动发起者
	 */
	private long creatorId;

	/**
	 * 状态
	 */
	private byte status;
	/**
	 * 备注
	 */
	private String remark;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public int getActivityType() {
		return activityType;
	}

	public void setActivityType(int activityType) {
		this.activityType = activityType;
	}

	public Date getActivityStartDate() {
		return activityStartDate;
	}

	public void setActivityStartDate(Date activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	public Date getActivityEndDate() {
		return activityEndDate;
	}

	public void setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "ClubActivityModel [id=" + id + ", clubId=" + clubId + ", activityName=" + activityName + ", activityType=" + activityType
				+ ", activityStartDate=" + activityStartDate + ", activityEndDate=" + activityEndDate + ", creatorId=" + creatorId + "]";
	}

}
