package com.cai.common.domain;

import java.io.Serializable;

/**
 * 简单的account对象
 * @author run
 *
 */
public class AccountSimple implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long account_id;

	private String nick_name;

	private String icon;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
