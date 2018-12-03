package com.cai.common.domain;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.data.annotation.Transient;

/**
 * 用户活跃度
 */
public class AccountLivenessModel extends DBBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long account_id;
	private int liveness;
	private Date update_time;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public int getLiveness() {
		return liveness;
	}

	public void setLiveness(int liveness) {
		this.liveness = liveness;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Transient
	private transient ReentrantLock redisLock;
	/**
	 * 是否是新加的值
	 */
	private transient boolean isNewAddValue;

	public boolean isNewAddValue() {
		return isNewAddValue;
	}

	public void setNewAddValue(boolean isNewAddValue) {
		this.isNewAddValue = isNewAddValue;
	}

	public ReentrantLock getRedisLock() {
		if (redisLock == null) {
			redisLock = new ReentrantLock();
		}
		return redisLock;
	}

	public void setRedisLock(ReentrantLock redisLock) {
		this.redisLock = redisLock;
	}

}
