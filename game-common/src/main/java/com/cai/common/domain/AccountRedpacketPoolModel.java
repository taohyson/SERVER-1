package com.cai.common.domain;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.data.annotation.Transient;
/**
 * 用户红包池
 */
public class AccountRedpacketPoolModel extends DBBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private long account_id;
	
	private int money;
	
	private Date create_time;
	//操作时间
	private Date operate_time;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getOperate_time() {
		return operate_time;
	}
	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}
	
}
