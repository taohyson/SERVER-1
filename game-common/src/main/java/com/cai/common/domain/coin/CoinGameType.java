package com.cai.common.domain.coin;

import java.io.Serializable;
import java.util.Date;

/**
 * 金币场类型
 */
public class CoinGameType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int game_big_type_id;
	private int state;
	private int game_big_type_sort;
	private String oss_name;
	private Date operate_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGame_big_type_id() {
		return game_big_type_id;
	}
	public void setGame_big_type_id(int game_big_type_id) {
		this.game_big_type_id = game_big_type_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getGame_big_type_sort() {
		return game_big_type_sort;
	}
	public void setGame_big_type_sort(int game_big_type_sort) {
		this.game_big_type_sort = game_big_type_sort;
	}
	public String getOss_name() {
		return oss_name;
	}
	public void setOss_name(String oss_name) {
		this.oss_name = oss_name;
	}
	public Date getOperate_time() {
		return operate_time;
	}
	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}

}
