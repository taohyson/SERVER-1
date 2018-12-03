package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统公告
 * 
 * @author run
 *
 */
public class SysNoticeModel implements Serializable {

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
	 * 系统公告id
	 */
	private int notice_id;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 创建时间
	 */
	private Date create_time;
	/**
	 * 结束时间
	 */
	private Date end_time;

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

	public int getNotice_id() {
		return notice_id;
	}

	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

}
