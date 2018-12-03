package com.cai.common.domain.match;

//禁言消息消息
public class MatchTopChatMsg {
	
	private int ban; //0 1
	private String time;
	private long accountId;
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
}
