package com.cai.common.domain;

import java.io.Serializable;

/**
 * 红包排行榜数据
 * 
 * @author tang
 */
public final class RedPackageRankModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 排名
	 */
	private int rank;

	/**
	 * 头像
	 */
	private String head;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 帐号ID
	 */
	private long accountId;

	/**
	 * 值
	 */
	private long value;

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

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RankModel [rank=" + rank + ", head=" + head + ", nickName=" + nickName + ", accountId=" + accountId
				+ ", value=" + value + "]";
	}

}
