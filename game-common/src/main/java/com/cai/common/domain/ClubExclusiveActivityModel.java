package com.cai.common.domain;

import java.util.Date;

/**
 * 
 * 俱乐部专属豆-活动相关
 *
 * @author wu_hc date: 2017年12月5日 下午4:13:27 <br/>
 */
public final class ClubExclusiveActivityModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private int gameId;
	private int userCategory;
	private Date activityBeginDate;
	private Date activityEndDate;
	private byte status;
	private long exclusiveGold;

	public int getId() {
		return id;
	}

	public int getGameId() {
		return gameId;
	}

	public ClubExclusiveActivityModel setGameId(int gameId) {
		this.gameId = gameId;
		return this;
	}

	public int getUserCategory() {
		return userCategory;
	}

	public ClubExclusiveActivityModel setUserCategory(int userCategory) {
		this.userCategory = userCategory;
		return this;
	}

	public Date getActivityBeginDate() {
		return activityBeginDate;
	}

	public ClubExclusiveActivityModel setActivityBeginDate(Date activityBeginDate) {
		this.activityBeginDate = activityBeginDate;
		return this;
	}

	public Date getActivityEndDate() {
		return activityEndDate;
	}

	public ClubExclusiveActivityModel setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
		return this;
	}

	public byte getStatus() {
		return status;
	}

	public ClubExclusiveActivityModel setStatus(byte status) {
		this.status = status;
		return this;
	}

	public long getExclusiveGold() {
		return exclusiveGold;
	}

	public ClubExclusiveActivityModel setExclusiveGold(long exclusiveGold) {
		this.exclusiveGold = exclusiveGold;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activityBeginDate == null) ? 0 : activityBeginDate.hashCode());
		result = prime * result + ((activityEndDate == null) ? 0 : activityEndDate.hashCode());
		result = prime * result + (int) (exclusiveGold ^ (exclusiveGold >>> 32));
		result = prime * result + gameId;
		result = prime * result + id;
		result = prime * result + status;
		result = prime * result + userCategory;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClubExclusiveActivityModel other = (ClubExclusiveActivityModel) obj;
		if (activityBeginDate == null) {
			if (other.activityBeginDate != null)
				return false;
		} else if (!activityBeginDate.equals(other.activityBeginDate))
			return false;
		if (activityEndDate == null) {
			if (other.activityEndDate != null)
				return false;
		} else if (!activityEndDate.equals(other.activityEndDate))
			return false;
		if (exclusiveGold != other.exclusiveGold)
			return false;
		if (gameId != other.gameId)
			return false;
		if (id != other.id)
			return false;
		if (status != other.status)
			return false;
		if (userCategory != other.userCategory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClubExclusiveActivityModel [id=" + id + ", gameId=" + gameId + ", userCategory=" + userCategory + ", activityBeginDate="
				+ activityBeginDate + ", activityEndDate=" + activityEndDate + ", status=" + status + ", exclusiveGold=" + exclusiveGold + "]";
	}

}
