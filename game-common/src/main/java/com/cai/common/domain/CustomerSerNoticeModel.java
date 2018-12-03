package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 主界面公告
 * @author run
 *
 */
public class CustomerSerNoticeModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	/**
	 * 游戏ID
	 */
	private int game_id;
	/**
	 * 类型 1=文字 2=图片
	 */
	private int type;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 结束时间
	 */
	private Date end_time;
	/**
	 * 链接
	 */
	private String href;

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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
	
	
	
	
}
