package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.Set;

/**
 * 
 * @author wu_hc
 *
 */
public class ClubAndAccountVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long accountId;
	private int clubId;

	private Set<String> accountGroupIds;

	private boolean inClub;
	private boolean isClubGroup;

	private byte identity;

	private int ruleId;
	private boolean isTireEnough;

	private int tableIndex;
	private int tablePassport;

	private String banPlayerName;

	/**
	 * 玩家剩余的限制局数(-1表示不限制)
	 */
	private int leftGameLimitRound;

	private boolean canEnterTable = true;
	private int enterBanTime;

	private boolean isClubWelfareEnough = true;
	private int limitWelfare;

	public static ClubAndAccountVo newVO(long accountId, int clubId) {
		return new ClubAndAccountVo().setAccountId(accountId).setClubId(clubId);
	}

	public long getAccountId() {
		return accountId;
	}

	public ClubAndAccountVo setAccountId(long accountId) {
		this.accountId = accountId;
		return this;
	}

	public int getClubId() {
		return clubId;
	}

	public ClubAndAccountVo setClubId(int clubId) {
		this.clubId = clubId;
		return this;
	}

	public Set<String> getAccountGroupIds() {
		return accountGroupIds;
	}

	public ClubAndAccountVo setAccountGroupIds(Set<String> accountGroupIds) {
		this.accountGroupIds = accountGroupIds;
		return this;
	}

	public boolean isInClub() {
		return inClub;
	}

	public ClubAndAccountVo setInClub(boolean inClub) {
		this.inClub = inClub;
		return this;
	}

	public boolean isClubGroup() {
		return isClubGroup;
	}

	public ClubAndAccountVo setClubGroup(boolean isClubGroup) {
		this.isClubGroup = isClubGroup;
		return this;
	}

	public byte getIdentity() {
		return identity;
	}

	public ClubAndAccountVo setIdentity(byte identity) {
		this.identity = identity;
		return this;
	}

	public int getRuleId() {
		return this.ruleId;
	}

	public ClubAndAccountVo setRuleId(int ruleId) {
		this.ruleId = ruleId;
		return this;
	}

	public boolean isTireEnough() {
		return isTireEnough;
	}

	public ClubAndAccountVo setIsTireEnough(boolean isTireEnough) {
		this.isTireEnough = isTireEnough;
		return this;
	}

	public int getTableIndex() {
		return tableIndex;
	}

	public void setTableIndex(int tableIndex) {
		this.tableIndex = tableIndex;
	}

	public int getTablePassport() {
		return tablePassport;
	}

	public void setTablePassport(int tablePassport) {
		this.tablePassport = tablePassport;
	}

	public String getBanPlayerName() {
		return banPlayerName;
	}

	public void setBanPlayerName(String banPlayerName) {
		this.banPlayerName = banPlayerName;
	}

	public int getLeftGameLimitRound() {
		return leftGameLimitRound;
	}

	public void setLeftGameLimitRound(int leftGameLimitRound) {
		this.leftGameLimitRound = leftGameLimitRound;
	}

	public boolean isCanEnterTable() {
		return canEnterTable;
	}

	public void setCanEnterTable(boolean canEnterTable) {
		this.canEnterTable = canEnterTable;
	}

	public int getEnterBanTime() {
		return enterBanTime;
	}

	public void setEnterBanTime(int enterBanTime) {
		this.enterBanTime = enterBanTime;
	}

	public boolean isClubWelfareEnough() {
		return isClubWelfareEnough;
	}

	public void setClubWelfareEnough(boolean clubWelfareEnough) {
		isClubWelfareEnough = clubWelfareEnough;
	}

	public int getLimitWelfare() {
		return limitWelfare;
	}

	public void setLimitWelfare(int limitWelfare) {
		this.limitWelfare = limitWelfare;
	}
}
