package com.cai.common.domain;

import java.io.Serializable;

public class AccountRoomRedis implements Serializable{
	
	/**
	 */
	private static final long serialVersionUID = 1L;

	private int matchId;
	
	//比赛唯一Id
	private int id;
	
	//报名了是否可以去干其他的。比如去组局之类的（比赛涉及扣金币的，报了名就不能干其他事）
	private boolean isLock;
	
	//是否进入了比赛场
	private boolean isEnter;
	
//	// 
//	private int roomId;
	
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

//	public int getRoomId() {
//		return roomId;
//	}
//
//	public void setRoomId(int roomId) {
//		this.roomId = roomId;
//	}

	public boolean isLock() {
		return isLock;
	}

	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}
	
	public void clear(){
		isLock = false;
		id = 0;
		matchId= 0 ;
		isEnter = false;
	}

	public boolean isEnter() {
		return isEnter;
	}

	public void setEnter(boolean isEnter) {
		this.isEnter = isEnter;
	}

}
