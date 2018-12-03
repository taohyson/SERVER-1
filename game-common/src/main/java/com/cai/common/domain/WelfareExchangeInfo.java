package com.cai.common.domain;

import java.io.Serializable;

public class WelfareExchangeInfo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 物品Id
	 */
	private int itemId;
	
	/**
	 * 已兑换数量
	 */
	private int exchangedNum;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getExchangedNum() {
		return exchangedNum;
	}

	public void setExchangedNum(int exchangedNum) {
		this.exchangedNum = exchangedNum;
	}

}
