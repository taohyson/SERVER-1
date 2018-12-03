package com.cai.common.domain.activity;

import java.io.Serializable;

public class RewardJsonModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int itemId;
	private int count;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
