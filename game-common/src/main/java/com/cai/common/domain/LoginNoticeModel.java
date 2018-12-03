package com.cai.common.domain;

import java.io.Serializable;

public class LoginNoticeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 游戏id
	 */
	private int game_id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 是否开放0=不开放 1=开放
	 */
	private int open;
	
	/**
	 * 时间间隔,小时
	 */
	private int interval_hour;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public int getInterval_hour() {
		return interval_hour;
	}

	public void setInterval_hour(int interval_hour) {
		this.interval_hour = interval_hour;
	}

	
}
