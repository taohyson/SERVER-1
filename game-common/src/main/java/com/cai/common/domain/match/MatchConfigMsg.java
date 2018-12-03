package com.cai.common.domain.match;

public class MatchConfigMsg {
	
	private int matchId;
	private String gameName; //游戏名
	private String matchName; //比赛名称
	private int matchType; //比赛类别
	private int matchBeginType; //赛制类型
	private String startTime; //开始时间
	private int minNum; //最小开赛人数
	private int maxNum; //最大开赛人数
	private int applyNum; //报名人数
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
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
	public int getMatchType() {
		return matchType;
	}
	public void setMatchType(int matchType) {
		this.matchType = matchType;
	}
	public int getMinNum() {
		return minNum;
	}
	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public int getApplyNum() {
		return applyNum;
	}
	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}
	public int getMatchBeginType() {
		return matchBeginType;
	}
	public void setMatchBeginType(int matchBeginType) {
		this.matchBeginType = matchBeginType;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
