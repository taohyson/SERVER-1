package com.cai.common.domain;

public class ClubMemberRecordModel extends DBBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	/**
	 * 俱乐部Id
	 */
	private int clubId;
	/**
	 * 玩家Id
	 */
	private long accountId;
	/**
	 * 天
	 */
	private int day;
	/**
	 * 牌局数
	 */
	private int gameCount;
	/**
	 * 大赢家数
	 */
	private int bigWinCount;
	/**
	 * 疲劳值(因产品提的疲劳值不清零需求,此字段改为只做统计八日疲劳值数据时用)
	 */
	private int tireValue;
	/**
	 * 点赞
	 */
	private int isLike;
	/**
	 * 累计疲劳值(因产品提的疲劳值不清零需求,增加此字段来记录玩家真正疲劳值)
	 */
	private int accuTireValue;

	public int getClubId() {
		return clubId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setClubId(int clubId) {
		if (this.clubId == clubId) {
			return;
		}
		setNeedDB(true);
		this.clubId = clubId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		if (this.accountId == accountId) {
			return;
		}
		setNeedDB(true);
		this.accountId = accountId;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (this.day == day) {
			return;
		}
		setNeedDB(true);
		this.day = day;
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		if (this.gameCount == gameCount) {
			return;
		}
		setNeedDB(true);
		this.gameCount = gameCount;
	}

	public int getBigWinCount() {
		return bigWinCount;
	}

	public void setBigWinCount(int bigWinCount) {
		if (this.bigWinCount == bigWinCount) {
			return;
		}
		setNeedDB(true);
		this.bigWinCount = bigWinCount;
	}

	public int getTireValue() {
		return tireValue;
	}

	public void setTireValue(int tireValue) {
		if (this.tireValue == tireValue) {
			return;
		}
		setNeedDB(true);
		this.tireValue = tireValue;
	}

	public int getIsLike() {
		return isLike;
	}

	public void setIsLike(int isLike) {
		if (this.isLike == isLike) {
			return;
		}
		setNeedDB(true);
		this.isLike = isLike;
	}

	public int getAccuTireValue() {
		return accuTireValue;
	}

	public void setAccuTireValue(int accuTireValue) {
		if (this.accuTireValue == accuTireValue) {
			return;
		}
		setNeedDB(true);
		this.accuTireValue = accuTireValue;
	}
}
