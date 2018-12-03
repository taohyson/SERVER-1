package com.cai.common.rmi.vo;

import java.io.Serializable;

public class SSHEClubTireInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 亲友圈Id(0-查所有俱乐部统计信息)
	 */
	private int clubId;
	
	/**
	 * 玩家Id
	 */
	private long accountId;

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

}
