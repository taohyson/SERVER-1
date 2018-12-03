package com.cai.common.domain.zhuzhou;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * 株洲协会推广推广详情model
 * 
 * @author tang date: 2018年9月21日 下午2:26:59 <br/>
 */
public class AccountZZPromoterModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private long account_id;
	private long target_id;
	private Date create_time;
	private int level;// 身份等级
	private transient String nick;
	private transient String icon;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getTarget_id() {
		return target_id;
	}

	public void setTarget_id(long target_id) {
		this.target_id = target_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
