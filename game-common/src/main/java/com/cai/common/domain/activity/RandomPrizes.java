package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 
 * 随机奖品
 *
 * @author tang 
 * date: 2018年4月18日 下午6:35:18 <br/>
 */
public class RandomPrizes implements Serializable{
//	[{"itemId":10024,"name":"比赛场兑换券","count":1000}]

	private int itemId;
	private int type;//1闲逸豆，2金币，3背包
	private int count;
	private String name;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
