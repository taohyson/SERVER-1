package com.cai.common.domain;

import java.io.Serializable;

public class TurntableSystemModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	// 转盘对应的格子位
	private int latticeId;
	// 物品ID
	private int goodsId;
	// 物品描述
	private String goodsDesc;
	// 物品数量
	private String rewardDetail;
	// 物品权重
	private int goodsWeight;
	// 中奖后记录中是否显示
	private int rewradedShow;
	// 是否广播
	private int broad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLatticeId() {
		return latticeId;
	}

	public void setLatticeId(int latticeId) {
		this.latticeId = latticeId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getRewardDetail() {
		return rewardDetail;
	}

	public void setRewardDetail(String rewardDetail) {
		this.rewardDetail = rewardDetail;
	}

	public int getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(int goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public int getRewradedShow() {
		return rewradedShow;
	}

	public void setRewradedShow(int rewradedShow) {
		this.rewradedShow = rewradedShow;
	}

	public int getBroad() {
		return broad;
	}

	public void setBroad(int broad) {
		this.broad = broad;
	}
}
