/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Set;

/**
 * 
 *
 * @author DIY 
 * date: 2018年5月15日 下午12:26:16 <br/>
 */
public class LogicRoomInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int _game_type_index;
	
	private boolean full; 
	
	private int curNum;
	
	private int[] playerIDs;
	
	private int roomStatus;
	
	private long createID;
	
	private int curRound;
	
	private String gameDesc;
	
	private int clubId;
	
	private String clubName;
	
	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}


	public String getGameDesc() {
		return gameDesc;
	}

	public void setGameDesc(String gameDesc) {
		this.gameDesc = gameDesc;
	}

	public int getCurRound() {
		return curRound;
	}

	public void setCurRound(int curRound) {
		this.curRound = curRound;
	}

	public long getCreateID() {
		return createID;
	}

	public void setCreateID(long createID) {
		this.createID = createID;
	}

	public int getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(int roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int get_game_type_index() {
		return _game_type_index;
	}

	public void set_game_type_index(int _game_type_index) {
		this._game_type_index = _game_type_index;
	}
	
	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}



	public int getCurNum() {
		return curNum;
	}

	public void setCurNum(int curNum) {
		this.curNum = curNum;
	}

	public int[] getPlayerIDs() {
		return playerIDs;
	}

	public void setPlayerIDs(int[] playerIDs) {
		this.playerIDs = playerIDs;
	}
	
	

}
