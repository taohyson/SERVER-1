package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 
 * 主奖品
 *
 * @author tang 
 * date: 2018年4月18日 下午6:35:18 <br/>
 */
public class MainPrizes implements Serializable{
	private static final long serialVersionUID = 1L;
	//	[{"itemId":10029,"name":"50元京东卡","count":100}]
	private int itemId;
	private String name;
	private int count;
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
