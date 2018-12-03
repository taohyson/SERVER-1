package com.cai.common.rmi.vo;

import java.io.Serializable;

import com.cai.common.domain.ClubRuleModel;

public class ClubMatchCreateRoomVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int roomNum;
	
	private int clubId;
	
	private ClubRuleModel clubRuleModel;
	
	private long clubOwnerId;
	
	private String clubName;
	
	private boolean repair;
	
	private int tableIndex;
	
	private int clubMemSize;
	
	private int logicId;

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public ClubRuleModel getClubRuleModel() {
		return clubRuleModel;
	}

	public void setClubRuleModel(ClubRuleModel clubRuleModel) {
		this.clubRuleModel = clubRuleModel;
	}

	public long getClubOwnerId() {
		return clubOwnerId;
	}

	public void setClubOwnerId(long clubOwnerId) {
		this.clubOwnerId = clubOwnerId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public boolean isRepair() {
		return repair;
	}

	public void setRepair(boolean repair) {
		this.repair = repair;
	}

	public int getTableIndex() {
		return tableIndex;
	}

	public void setTableIndex(int tableIndex) {
		this.tableIndex = tableIndex;
	}

	public int getClubMemSize() {
		return clubMemSize;
	}

	public void setClubMemSize(int clubMemSize) {
		this.clubMemSize = clubMemSize;
	}

	public int getLogicId() {
		return logicId;
	}

	public void setLogicId(int logicId) {
		this.logicId = logicId;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
}
