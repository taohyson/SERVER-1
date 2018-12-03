package com.cai.common.domain.json;

import java.io.Serializable;

/**
 * 打立出局复活信息
 */
public class MatchReiveGoldModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//area:"1,120",num:18
	private int index; //复活次数
	private int gold; //复活金豆
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
}
