/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 查看玩家数据，和PlayerViewResponse对应
 * 
 * @author wu_hc
 */
public final class PlayerSdkViewVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 帐号id
	 */
	private long accountId;
	
	/**
	 * 头像
	 */
	private String head;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 钻石数量
	 */
	private int diamond;

	/**
	 * 签名
	 */
	private String signature;

	/**
	 * 性别1男2女
	 */
	private int sex;

	private Date create_time;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getDiamond() {
		return diamond;
	}

	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
}
