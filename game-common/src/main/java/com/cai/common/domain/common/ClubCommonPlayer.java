package com.cai.common.domain.common;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 * 亲友圈玩家对象
 *
 * @author zhanglong 2018/11/13 12:21
 */
public class ClubCommonPlayer implements Serializable {
	private static final long serialVersionUID = 1L;
	private long accountId;

	private String nickname;

	private String avatar;

	private Date lastLoginDate;

	/**
	 * 缓存的玩家代理状态(不是实时的)
	 */
	private boolean isAgent;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public boolean isAgent() {
		return isAgent;
	}

	public void setAgent(boolean agent) {
		isAgent = agent;
	}
}
