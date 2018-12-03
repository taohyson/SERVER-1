package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;



/**
 * 战绩记录
 * @author run
 *
 */
@Document(collection="brand_result_log")
public class BrandResultModel implements Serializable{
	private String _id;
	@Indexed(name = "index_create_time")
	private Date create_time;
	private int gameId;
	private String gameName;
	private long gold;
	private int roomId;
	private int openType;//开房类型
	@Indexed(name = "index_groupId")
	private String groupId;//群id
	private int clubId;//俱乐部id
	@Indexed(name = "index_accountId")
	private long accountId;//开房人
	private String winner;//大赢家
	private String details;//战绩详情
	private int gameRound;//局数
	private long winnerId;
	
	
	
	public long getWinnerId() {
		return winnerId;
	}
	public void setWinnerId(long winnerId) {
		this.winnerId = winnerId;
	}
	public int getGameRound() {
		return gameRound;
	}
	public void setGameRound(int gameRound) {
		this.gameRound = gameRound;
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
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public long getGold() {
		return gold;
	}
	public void setGold(long gold) {
		this.gold = gold;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getOpenType() {
		return openType;
	}
	public void setOpenType(int openType) {
		this.openType = openType;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public int getClubId() {
		return clubId;
	}
	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
