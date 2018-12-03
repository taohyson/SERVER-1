/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain.log;

import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;

/**
 * @author wu_hc date: 2018/11/20 16:58 <br/>
 */
public final class CoinBoxData {

	private int openBoxPlayerNum; //开宝箱人数
	private int openBoxTimes; //开宝箱次数
	private int boxTotalCoinNum; //宝箱发放金币

	private transient final Set<Long> accountSet = Sets.newHashSet();

	public int getOpenBoxPlayerNum() {
		return openBoxPlayerNum;
	}

	public void setOpenBoxPlayerNum(int openBoxPlayerNum) {
		this.openBoxPlayerNum = openBoxPlayerNum;
	}

	public int getOpenBoxTimes() {
		return openBoxTimes;
	}

	public void setOpenBoxTimes(int openBoxTimes) {
		this.openBoxTimes = openBoxTimes;
	}

	public int getBoxTotalCoinNum() {
		return boxTotalCoinNum;
	}

	public void setBoxTotalCoinNum(int boxTotalCoinNum) {
		this.boxTotalCoinNum = boxTotalCoinNum;
	}

	public void playerOpenBox(long accountId){
		if(accountSet.contains(accountId)){
			return;
		}
		accountSet.add(accountId);
		this.openBoxPlayerNum += 1;
	}
	public final String toJson() {
		try {
			return JSON.toJSONString(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public final void parseFromJson(String json) {
		try {
			CoinBoxData data = JSON.parseObject(json, CoinBoxData.class);
			this.setBoxTotalCoinNum(data.getBoxTotalCoinNum());
			this.setOpenBoxPlayerNum(data.getOpenBoxPlayerNum());
			this.setOpenBoxTimes(data.getOpenBoxTimes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
