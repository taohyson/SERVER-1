package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 俱乐部专属豆消耗统计
 * @author 
 *
 */
@Document(collection = "club_exclusive_gold_tj")
public class ClubExclusiveGoldTjModel implements Serializable {
	private String _id;
	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date")
	private Integer notes_date;
	private Integer clubId;
	private Integer appId;
	private String clubName;
	private Long cost;
	private Long accountId;
	private Long openRoomCount;
	private String appName;
	
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Integer getNotes_date() {
		return notes_date;
	}
	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}
	public Integer getClubId() {
		return clubId;
	}
	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Long getOpenRoomCount() {
		return openRoomCount;
	}
	public void setOpenRoomCount(Long openRoomCount) {
		this.openRoomCount = openRoomCount;
	}
	
}
