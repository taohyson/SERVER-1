package com.cai.common.domain;

/**
 * 
 *
 * @author zhanglong date: 2018年5月28日 下午3:06:46
 */
public class ClubBanPlayerModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 亲友圈Id
	 */
	private int clubId;

	/**
	 * 玩家Id
	 */
	private long accountId;

	/**
	 * 禁止同桌玩家Id
	 */
	private String banPlayers;

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

	public String getBanPlayers() {
		return banPlayers;
	}

	public void setBanPlayers(String banPlayers) {
		this.banPlayers = banPlayers;
	}

}
