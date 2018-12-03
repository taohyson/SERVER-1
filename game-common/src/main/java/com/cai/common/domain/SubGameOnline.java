/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 每个子游戏 5分钟统计房间数 和在线人数
 *
 */
@Document(collection = "sub_game_online")
@CompoundIndexes({ @CompoundIndex(name = "index_crate_time", def = "{'create_time': 1}"),
		@CompoundIndex(name = "index_game_type_index", def = "{'game_type_index': 1}")
})
public class SubGameOnline implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private Date create_time;
	/**
	 * 游戏子类型
	 */
	private int game_type_index;
	// 桌子的总个数
	private int number;
	// 桌子的个数--打满的
	private int fullNumber;
	// 玩家总数
	private int playerTotalNumber;
	// 游戏名字
	private String gameName;
	
	
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
	public int getGame_type_index() {
		return game_type_index;
	}
	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFullNumber() {
		return fullNumber;
	}
	public void setFullNumber(int fullNumber) {
		this.fullNumber = fullNumber;
	}
	public int getPlayerTotalNumber() {
		return playerTotalNumber;
	}
	public void setPlayerTotalNumber(int playerTotalNumber) {
		this.playerTotalNumber = playerTotalNumber;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	
	

}
