/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 
 *
 * @author wu_hc date: 2018年5月9日 下午3:21:00 <br/>
 */
public final class CreateClubRoomVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long account;
	private int club_id;
	private long club_account;
	private String clubName;
	private boolean ruleRepair;
	private int tableIndex;
	private int clubMemberSize;
	private int debugLogicId;

	public static CreateClubRoomVO newVO(int club_id) {
		return new CreateClubRoomVO(club_id);
	}

	/**
	 * @param club_id
	 */
	public CreateClubRoomVO(int club_id) {
		this.club_id = club_id;
	}

	public long getAccount() {
		return account;
	}

	public CreateClubRoomVO setAccount(long account) {
		this.account = account;
		return this;
	}

	public int getClub_id() {
		return club_id;
	}

	public CreateClubRoomVO setClub_id(int club_id) {
		this.club_id = club_id;
		return this;
	}

	public long getClub_account() {
		return club_account;
	}

	public CreateClubRoomVO setClub_account(long club_account) {
		this.club_account = club_account;
		return this;
	}

	public String getClubName() {
		return clubName;
	}

	public CreateClubRoomVO setClubName(String clubName) {
		this.clubName = clubName;
		return this;
	}

	public boolean isRuleRepair() {
		return ruleRepair;
	}

	public CreateClubRoomVO setRuleRepair(boolean ruleRepair) {
		this.ruleRepair = ruleRepair;
		return this;
	}

	public int getTableIndex() {
		return tableIndex;
	}

	public CreateClubRoomVO setTableIndex(int tableIndex) {
		this.tableIndex = tableIndex;
		return this;
	}

	public int getClubMemberSize() {
		return clubMemberSize;
	}

	public CreateClubRoomVO setClubMemberSize(int clubMemberSize) {
		this.clubMemberSize = clubMemberSize;
		return this;
	}

	public int getDebugLogicId() {
		return debugLogicId;
	}

	public CreateClubRoomVO setDebugLogicId(int debugLogicId) {
		this.debugLogicId = debugLogicId;
		return this;
	}

}
