package com.cai.common.domain.coin;

import java.io.Serializable;
import java.util.Date;

/**
 * 金币游戏类型
 */
public class CoinGame implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int game_type_index;
	private String game_name;
	private int game_sort;
	private int game_big_type_id;
	private int state;
	private String oss_name;
	private Date operate_time;
	private String game_desc;
	private String show_game_name; //用于展示的游戏名称，为空则用game_name

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public String getGame_name() {
		return game_name;
	}

	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}

	public int getGame_sort() {
		return game_sort;
	}

	public void setGame_sort(int game_sort) {
		this.game_sort = game_sort;
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

	public String getGame_desc() {
		if (game_desc == null) {
			game_desc = "";
		}
		return game_desc;
	}

	public void setGame_desc(String game_desc) {
		this.game_desc = game_desc;
	}

	public String getShow_game_name() {
		if (null != show_game_name)
			return show_game_name;
		return game_name;
	}

	public void setShow_game_name(String show_game_name) {
		this.show_game_name = show_game_name;
	}
}
