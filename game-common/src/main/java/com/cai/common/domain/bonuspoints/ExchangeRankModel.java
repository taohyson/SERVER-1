package com.cai.common.domain.bonuspoints;

import com.cai.common.domain.DBBaseModel;

/**
 * 积分商品
 * 
 * @author tang
 *
 */
public class ExchangeRankModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long exchangeCount;// 兑换次数
	private int rank;// 排名
	private BonusPointsGoods goods;

	public long getExchangeCount() {
		return exchangeCount;
	}

	public void setExchangeCount(long exchangeCount) {
		this.exchangeCount = exchangeCount;
	}

	public BonusPointsGoods getGoods() {
		return goods;
	}

	public void setGoods(BonusPointsGoods goods) {
		this.goods = goods;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
