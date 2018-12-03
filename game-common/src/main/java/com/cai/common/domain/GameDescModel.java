package com.cai.common.domain;

import java.io.Serializable;

/**
 * 游戏玩法说明
 * @author run
 *
 */
public class GameDescModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	/**
	 * 游戏id
	 */
	private int game_id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 描述
	 */
	private String game_desc;
	/**
	 * 排序值
	 */
	private int sort;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGame_desc() {
		return game_desc;
	}
	public void setGame_desc(String game_desc) {
		this.game_desc = game_desc;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	
	
}
