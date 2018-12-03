package com.cai.common.domain.json;

import java.io.Serializable;

public class AreaLimitJsonModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//area:"1,120",num:18
	private int minArea;
	private int maxArea;
	private int num; //停止打立出局人数
	private int goNextRoundPerson; //晋级人数
	private int nextBili; //带入比例
	
	public int getMinArea() {
		return minArea;
	}
	public void setMinArea(int minArea) {
		this.minArea = minArea;
	}
	public int getMaxArea() {
		return maxArea;
	}
	public void setMaxArea(int maxArea) {
		this.maxArea = maxArea;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getGoNextRoundPerson() {
		return goNextRoundPerson;
	}
	public void setGoNextRoundPerson(int goNextRoundPerson) {
		this.goNextRoundPerson = goNextRoundPerson;
	}
	public int getNextBili() {
		return nextBili;
	}
	public void setNextBili(int nextBili) {
		this.nextBili = nextBili;
	}
	
}
