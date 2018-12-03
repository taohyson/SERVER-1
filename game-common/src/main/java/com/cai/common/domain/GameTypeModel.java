package com.cai.common.domain;

import java.io.Serializable;

/**
 * 游戏类型
 * @author run
 *
 */
public class GameTypeModel implements Serializable{

	/**
	 * 游戏id 
	 */
	private int game_id;
	
	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 描述
	 */
	private String game_desc;

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGame_desc() {
		return game_desc;
	}

	public void setGame_desc(String game_desc) {
		this.game_desc = game_desc;
	}
	
	
}
