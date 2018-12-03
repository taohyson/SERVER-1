package com.cai.common.domain.match;

public class MatchStartMsg {
	
	private int matchId;
	private int uniqueId;
	private String matchName;
	private String accountMsg; //参赛玩家列表
	private String date;
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public String getAccountMsg() {
		return accountMsg;
	}
	public void setAccountMsg(String accountMsg) {
		this.accountMsg = accountMsg;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
