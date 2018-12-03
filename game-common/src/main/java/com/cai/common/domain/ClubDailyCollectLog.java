/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 俱乐部总计开局日报
 */
@Document(collection = "club_daily_collect")

public class ClubDailyCollectLog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	
	private int notes_date;
	
	private int collecType;//查询统计类型，1-30人type=1,31-50人type=2,51-100人type=3,101到200人type=4，200人以上type=5
	
	private int clubCounts;//俱乐部个数
	
	private int brandCounts;//局数
	
	private long cost;//消耗数
	
	private int activeClubCounts;//活跃的俱乐部数
	
	

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public int getActiveClubCounts() {
		return activeClubCounts;
	}

	public void setActiveClubCounts(int activeClubCounts) {
		this.activeClubCounts = activeClubCounts;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(int notes_date) {
		this.notes_date = notes_date;
	}

	public int getCollecType() {
		return collecType;
	}

	public void setCollecType(int collecType) {
		this.collecType = collecType;
	}

	public int getClubCounts() {
		return clubCounts;
	}

	public void setClubCounts(int clubCounts) {
		this.clubCounts = clubCounts;
	}

	public int getBrandCounts() {
		return brandCounts;
	}

	public void setBrandCounts(int brandCounts) {
		this.brandCounts = brandCounts;
	}


	public ClubDailyCollectLog(){
		
	}
	public ClubDailyCollectLog(HashMap map,int collecType,int notes_date,int activeClubCounts){
		this.collecType = collecType;
		if(map.containsKey("brandCounts"))
			this.brandCounts = map.get("brandCounts") == null ? 0 : (int)map.get("brandCounts");
		if(map.containsKey("clubCounts"))
			this.clubCounts = map.get("clubCounts") == null ? 0 : (int)map.get("clubCounts");
		if(map.containsKey("cost"))
			this.cost = map.get("cost") == null ? 0 : (long)map.get("cost");
		this.notes_date = notes_date;
		this.activeClubCounts = activeClubCounts;
	}
	
}
