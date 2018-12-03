package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 主界面公告
 * 
 * @author run
 *
 */
public class MainUiNoticeModel implements Serializable {
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

	/**
	 * 是否登录时打开（-1 为否 0及以上为间隔相应小时打开）
	 */
	private int if_loginopen;
	/**
	 * 创建时间
	 */
	private Date create_time;

	/**
	 * 公告标题
	 */
	private String title;

	private int open_obejct;

	public int getOpen_obejct() {
		return open_obejct;
	}

	public void setOpen_obejct(int open_obejct) {
		this.open_obejct = open_obejct;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIf_loginopen() {
		return if_loginopen;
	}

	public void setIf_loginopen(int if_loginopen) {
		this.if_loginopen = if_loginopen;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

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
