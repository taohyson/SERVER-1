package com.cai.common.domain.ej;

import java.util.Date;

import com.cai.common.domain.DBBaseModel;

public class EJRelativeModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountName;
	// private String mobile;
	private long account_id;
	private String nickname;
	private int sex;
	private String headimgurl;
	private Date create_time;
	private Date last_update_time;
	private String unionId;
	private String sdk_channel;

	public String getSdk_channel() {
		return sdk_channel;
	}

	public void setSdk_channel(String sdk_channel) {
		this.sdk_channel = sdk_channel;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(Date last_update_time) {
		this.last_update_time = last_update_time;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	// public String getMobile() {
	// return mobile;
	// }
	//
	// public void setMobile(String mobile) {
	// this.mobile = mobile;
	// }

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

}
