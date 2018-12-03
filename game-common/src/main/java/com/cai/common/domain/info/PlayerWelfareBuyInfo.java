package com.cai.common.domain.info;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/8/16 21:20
 */
public class PlayerWelfareBuyInfo implements Serializable {
	private static final long serialVersionUID = -3385899483541758077L;

	/**
	 * 玩家Id
	 */
	private long accountId;

	/**
	 * 福卡商品Id
	 */
	private int welfareItemId;

	/**
	 * 上次购买时间
	 */
	private Date lastBuyTime;

	/**
	 * 已购买次数
	 */
	private int buyNum;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getWelfareItemId() {
		return welfareItemId;
	}

	public void setWelfareItemId(int welfareItemId) {
		this.welfareItemId = welfareItemId;
	}

	public Date getLastBuyTime() {
		return lastBuyTime;
	}

	public void setLastBuyTime(Date lastBuyTime) {
		this.lastBuyTime = lastBuyTime;
	}

	public int getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
}
