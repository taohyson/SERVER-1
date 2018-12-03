/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 */
@Document(collection = "club_daily_match_log")

public class ClubMatchDailyModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed
	private int notes_date;
	private int clubMatchCounts;//自建赛开赛场数
	private int clubMatchSuceessCounts;//自建赛成功开赛场数
	private int consumeCounts;////自建赛消耗豆数
	
	private int clubNum;							//俱乐部总个数——截止当日平台总俱乐部个数；
	private int newClubNum;						//新创建俱乐部数——当日俱乐部新增个数；
	private int activeClubNum;						//活跃俱乐部个数——当日有成功开房1局（大局）的俱乐部个数;
	private long ClubOpenRoomNum;					//俱乐部总开房数——当日所有俱乐部的总开房数;
	private String clubOpenRoomProportion;			//总开房数占比——当日俱乐部开房数÷当日全平台总开房数×100%
	private long clubConsumeNum;					//俱乐部总消耗数——当日所有俱乐部的总扣豆数
	private String clubConsumeProportion;			//总消耗占比——当日俱乐部总扣豆数÷当日全平台开房扣豆数×100%
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
	public int getClubMatchCounts() {
		return clubMatchCounts;
	}
	public void setClubMatchCounts(int clubMatchCounts) {
		this.clubMatchCounts = clubMatchCounts;
	}
	public int getClubMatchSuceessCounts() {
		return clubMatchSuceessCounts;
	}
	public void setClubMatchSuceessCounts(int clubMatchSuceessCounts) {
		this.clubMatchSuceessCounts = clubMatchSuceessCounts;
	}
	public int getConsumeCounts() {
		return consumeCounts;
	}
	public void setConsumeCounts(int consumeCounts) {
		this.consumeCounts = consumeCounts;
	}
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public int getNewClubNum() {
		return newClubNum;
	}
	public void setNewClubNum(int newClubNum) {
		this.newClubNum = newClubNum;
	}
	public int getActiveClubNum() {
		return activeClubNum;
	}
	public void setActiveClubNum(int activeClubNum) {
		this.activeClubNum = activeClubNum;
	}
	public long getClubOpenRoomNum() {
		return ClubOpenRoomNum;
	}
	public void setClubOpenRoomNum(long clubOpenRoomNum) {
		ClubOpenRoomNum = clubOpenRoomNum;
	}
	public String getClubOpenRoomProportion() {
		return clubOpenRoomProportion;
	}
	public void setClubOpenRoomProportion(String clubOpenRoomProportion) {
		this.clubOpenRoomProportion = clubOpenRoomProportion;
	}
	public long getClubConsumeNum() {
		return clubConsumeNum;
	}
	public void setClubConsumeNum(long clubConsumeNum) {
		this.clubConsumeNum = clubConsumeNum;
	}
	public String getClubConsumeProportion() {
		return clubConsumeProportion;
	}
	public void setClubConsumeProportion(String clubConsumeProportion) {
		this.clubConsumeProportion = clubConsumeProportion;
	}
	
	
	
}
