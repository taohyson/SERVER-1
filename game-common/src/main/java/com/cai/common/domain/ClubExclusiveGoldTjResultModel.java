package com.cai.common.domain;


/**
 * 俱乐部专属豆消耗统计
 * @author 
 *
 */
public class ClubExclusiveGoldTjResultModel {
	private Integer clubId;
	private Integer appId;
	private Long cost;
	private Long openRoomCount;
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
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public Long getOpenRoomCount() {
		return openRoomCount;
	}
	public void setOpenRoomCount(Long openRoomCount) {
		this.openRoomCount = openRoomCount;
	}
	
	
	
}
