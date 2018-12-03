package com.cai.common.util;


import java.util.concurrent.locks.ReentrantLock;

public class InviteLockModel   {
	
	private long accountId;
	private long timeStamp;
	private int visitTimes;
	private int total;
	private transient ReentrantLock redisLock;
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getVisitTimes() {
		return visitTimes;
	}
	public void setVisitTimes(int visitTimes) {
		this.visitTimes = visitTimes;
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
	public InviteLockModel(long accountId){
		this.accountId = accountId;
		this.visitTimes=1;
		this.timeStamp = System.currentTimeMillis();
	}
}
