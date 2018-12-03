/**
 * 
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 邀请下载VO
 * @author chansonyan
 * 2018年7月16日
 */
public class InviteMissionDataVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private long accountId;
	private long beRecommendId;
	private int game;
	private int count;
	private long createTime;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getBeRecommendId() {
		return beRecommendId;
	}
	public void setBeRecommendId(long beRecommendId) {
		this.beRecommendId = beRecommendId;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		this.game = game;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	
}
