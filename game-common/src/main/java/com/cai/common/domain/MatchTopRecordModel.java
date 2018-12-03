package com.cai.common.domain;

public class MatchTopRecordModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private long account_id;
	private String head_url;
	private String nick_name;
	private String top_msg;
	private String chat_msg;
	
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public String getHead_url() {
		return head_url;
	}
	public void setHead_url(String head_url) {
		this.head_url = head_url;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getTop_msg() {
		return top_msg;
	}
	public void setTop_msg(String top_msg) {
		this.top_msg = top_msg;
	}
	public String getChat_msg() {
		return chat_msg;
	}
	public void setChat_msg(String chat_msg) {
		this.chat_msg = chat_msg;
	}
	
}
