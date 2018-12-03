package com.cai.common.domain.bonuspoints;

import java.util.concurrent.locks.ReentrantLock;

import com.cai.common.domain.DBBaseModel;

public class AccountBonusPointsModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long account_id;
	private long score;
	private long history_score;
	private transient ReentrantLock redisLock;
	private transient boolean isNewAddValue;

	public ReentrantLock getRedisLock() {
		if (redisLock == null) {
			redisLock = new ReentrantLock();
		}

		return redisLock;
	}

	public void setRedisLock(ReentrantLock redisLock) {
		this.redisLock = redisLock;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public boolean isNewAddValue() {
		return isNewAddValue;
	}

	public void setNewAddValue(boolean isNewAddValue) {
		this.isNewAddValue = isNewAddValue;
	}

	public long getHistory_score() {
		return history_score;
	}

	public void setHistory_score(long history_score) {
		this.history_score = history_score;
	}

}
