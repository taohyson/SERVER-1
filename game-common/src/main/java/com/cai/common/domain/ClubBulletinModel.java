/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.util.Date;
import java.util.Objects;

/**
 * 
 * 俱乐部公告
 *
 * @author wu_hc date: 2018年4月12日 下午12:11:17 <br/>
 */
public final class ClubBulletinModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private long id;

	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 1系统 2俱乐部
	 */
	private byte category;

	/**
	 * 发起者
	 */
	private long creatorId;

	/**
	 * 开始时间
	 */
	private Date startDate;

	/**
	 * 结束时间
	 */
	private Date endDate;

	/**
	 * 内容
	 */
	private String text;

	/**
	 * 状态
	 */
	private byte status;

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
		if (this.clubId == clubId) {
			return;
		}
		setNeedDB(true);
		this.clubId = clubId;
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		if (this.creatorId == creatorId) {
			return;
		}
		setNeedDB(true);
		this.creatorId = creatorId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		if (Objects.equals(startDate, this.startDate)) {
			return;
		}
		setNeedDB(true);
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		if (Objects.equals(endDate, this.endDate)) {
			return;
		}
		setNeedDB(true);
		this.endDate = endDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (Objects.equals(text, this.text)) {
			return;
		}
		setNeedDB(true);
		this.text = text;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		if (Objects.equals(status, this.status)) {
			return;
		}
		setNeedDB(true);
		this.status = status;
	}

	public byte getCategory() {
		return category;
	}

	public void setCategory(byte category) {
		if (Objects.equals(category, this.category)) {
			return;
		}
		setNeedDB(true);
		this.category = category;
	}


	@Override
	public String toString() {
		return "ClubBulletinModel [id=" + id + ", clubId=" + clubId + ", creatorId=" + creatorId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", text=" + text + ", status=" + status + "]";
	}

}
