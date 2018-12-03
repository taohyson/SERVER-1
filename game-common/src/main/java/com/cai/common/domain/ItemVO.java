package com.cai.common.domain;

import java.util.Date;

import com.cai.common.domain.ItemDTO;

public class ItemVO extends ItemDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date createTime;
	private int state; // 道具状态：
	private int badgeState; // 角标状态 0: 新道具 ，1：旧道具

	public ItemVO() {
	}

	public ItemVO(int itemId, int number, Date createTime, int state, int badgeState) {
		super(itemId, number);
		this.createTime = createTime;
		this.state = state;
		this.badgeState = badgeState;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public int getState() {
		return state;
	}

	public int getBadgeState() {
		return badgeState;
	}

	public void setBadgeState(int badgeState) {
		this.badgeState = badgeState;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
