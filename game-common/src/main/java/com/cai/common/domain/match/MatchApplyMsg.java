package com.cai.common.domain.match;

public class MatchApplyMsg {
	
	private String gameName; //游戏名称
	private String matchName; //比赛名称
	private long accountId; //玩家ID
	private String nickname; //玩家昵称
	private int glod;  //闲逸豆
	private String applyTime; //报名时间
	private int opType; // 0游戏内 1系统
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getGlod() {
		return glod;
	}
	public void setGlod(int glod) {
		this.glod = glod;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public int getOpType() {
		return opType;
	}
	public void setOpType(int opType) {
		this.opType = opType;
	}

}
