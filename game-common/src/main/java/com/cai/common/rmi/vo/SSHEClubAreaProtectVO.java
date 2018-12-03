package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/15 14:16
 */
public class SSHEClubAreaProtectVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int clubId;

	private int gameId;

	/**
	 * see ClubAreaProtectType 1-申请 2-同意 3-拒绝 4-解除绑定
	 */
	private int state;

	private String gameName;

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
