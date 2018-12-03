package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author demon date: 2017年7月20日 下午6:59:15 <br/>
 */
public class ClubAccountModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private volatile int club_id;

	private volatile long account_id;

	private int status;

	private int big_win_count;

	private int game_count;

	private Date date;

	private String remark;

	private String remark_ext;

	// @see EClubIdentity
	private byte identity;
	
	private String roundLimitData;

	/**
	 * 是否合伙人 0-否 1-是
	 */
	private int isPartner;

	/**
	 * 上级玩家Id
	 */
	private long parentId;

	/**
	 * 成员亲友圈福卡数量
	 */
	private long clubWelfare;

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getBig_win_count() {
		return big_win_count;
	}

	public void setBig_win_count(int big_win_count) {
		this.big_win_count = big_win_count;
	}

	public int getGame_count() {
		return game_count;
	}

	public void setGame_count(int game_count) {
		this.game_count = game_count;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark_ext() {
		return remark_ext;
	}

	public void setRemark_ext(String remark_ext) {
		this.remark_ext = remark_ext;
	}

	public byte getIdentity() {
		return identity;
	}

	public void setIdentity(byte identity) {
		this.identity = identity;
	}

	public String getRoundLimitData() {
		return roundLimitData;
	}

	public void setRoundLimitData(String roundLimitData) {
		this.roundLimitData = roundLimitData;
	}

	public int getIsPartner() {
		return isPartner;
	}

	public void setIsPartner(int isPartner) {
		this.isPartner = isPartner;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public long getClubWelfare() {
		return clubWelfare;
	}

	public void setClubWelfare(long clubWelfare) {
		this.clubWelfare = clubWelfare;
	}
}
