package com.cai.common.domain;

import java.io.Serializable;

public class AccountMatchInfoRedis implements Serializable{
	
	/**
	 */
	private static final long serialVersionUID = 1L;

	private int matchId;
	//比赛唯一Id
	private int id;
	
	private int status;
	
	private boolean isStart;
	
	private boolean isLock;
	
	private int logicIndex;
	
	private boolean isManager;
	
	private int applyType; //报名方式
	
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isStart() {
		return isStart;
	}

	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}

	public boolean isLock() {
		return isLock;
	}

	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}

	public int getLogicIndex() {
		return logicIndex;
	}

	public void setLogicIndex(int logicIndex) {
		this.logicIndex = logicIndex;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public int getApplyType() {
		return applyType;
	}

	public void setApplyType(int applyType) {
		this.applyType = applyType;
	}
}
