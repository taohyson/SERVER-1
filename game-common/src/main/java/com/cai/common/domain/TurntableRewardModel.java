package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "turntable_reward_model")
public class TurntableRewardModel implements Serializable {

	private String id;
	@Indexed(direction = IndexDirection.DESCENDING)
	private Date createTime;
	@Indexed
	private Long accountId;
	private String accountName;
	private int rewardGoodsId;
	private String rewardGoodsDesc;
	private String headImgUrl;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getRewardGoodsId() {
		return rewardGoodsId;
	}

	public void setRewardGoodsId(int rewardGoodsId) {
		this.rewardGoodsId = rewardGoodsId;
	}

	public String getRewardGoodsDesc() {
		return rewardGoodsDesc;
	}

	public void setRewardGoodsDesc(String rewardGoodsDesc) {
		this.rewardGoodsDesc = rewardGoodsDesc;
	}
}
