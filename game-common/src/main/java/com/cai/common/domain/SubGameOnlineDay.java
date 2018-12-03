/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *每天每个子游戏的在线人数---去重了--5点重启会数据不准，关系不大
 * date: 2017年11月20日 下午10:04:24 <br/>
 */
@Document(collection = "sub_game_online_day")
public class SubGameOnlineDay implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date")
	private Integer notes_date;
	
	private String _id;

	private int game_type_index;
	
	private int totalOnline;
	
	private String gameName;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}


	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public int getTotalOnline() {
		return totalOnline;
	}

	public void setTotalOnline(int totalOnline) {
		this.totalOnline = totalOnline;
	}

	public String getGameName() {
		return gameName;
	}

	public Integer getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
