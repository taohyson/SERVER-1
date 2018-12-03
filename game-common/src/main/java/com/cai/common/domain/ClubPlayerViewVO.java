package com.cai.common.domain;

import java.io.Serializable;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/18 10:32
 */
public class ClubPlayerViewVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 帐号id
	 */
	private long accountId;

	private boolean isUpdateClubIdentity;

	private int clubIdentity;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public boolean isUpdateClubIdentity() {
		return isUpdateClubIdentity;
	}

	public void setUpdateClubIdentity(boolean updateClubIdentity) {
		isUpdateClubIdentity = updateClubIdentity;
	}

	public int getClubIdentity() {
		return clubIdentity;
	}

	public void setClubIdentity(int clubIdentity) {
		this.clubIdentity = clubIdentity;
	}
}
