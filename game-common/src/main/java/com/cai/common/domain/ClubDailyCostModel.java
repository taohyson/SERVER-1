/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 */
@Document(collection = "club_daily_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_clubId", def = "{'clubId': 1}"),
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_create_time", def = "{'create_time': 1}"),
		})
public class ClubDailyCostModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private Date create_time;
	
	private long accountId;

	private int clubId;
	
	private long cost;
	
	private int gameCount;
	
	private String clubName;
	
	private long account_id;
	
	private String gameNames;
	
	private int receive;//领取状态0未领取，1领取
	
	private int sendGold;//送的豆
	
	private int goldTotal;//花费的房卡总数
	
	private int clubMemberCount;//成员数
	
	

	public int getClubMemberCount() {
		return clubMemberCount;
	}

	public void setClubMemberCount(int clubMemberCount) {
		this.clubMemberCount = clubMemberCount;
	}

	public int getSendGold() {
		return sendGold;
	}

	public void setSendGold(int sendGold) {
		this.sendGold = sendGold;
	}

	public int getReceive() {
		return receive;
	}

	public void setReceive(int receive) {
		this.receive = receive;
	}

	public String getGameNames() {
		return gameNames;
	}

	public void setGameNames(String gameNames) {
		this.gameNames = gameNames;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}


	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}


	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getGoldTotal() {
		return goldTotal;
	}

	public void setGoldTotal(int goldTotal) {
		this.goldTotal = goldTotal;
	}
	
	
	
}
