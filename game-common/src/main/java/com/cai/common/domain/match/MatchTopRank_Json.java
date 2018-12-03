package com.cai.common.domain.match;

public class MatchTopRank_Json {
	
	private int index; //名次
	private long accountId; //玩家ID
	private String nickName; //昵称
	private int isMask; //是否屏蔽 0否 1是
	private int score;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getIsMask() {
		return isMask;
	}
	public void setIsMask(int isMask) {
		this.isMask = isMask;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
