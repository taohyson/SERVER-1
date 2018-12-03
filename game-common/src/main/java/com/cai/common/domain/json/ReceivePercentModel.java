package com.cai.common.domain.json;

public class ReceivePercentModel{
	/**
	 * 
	 */
	private int type;
	private int curPer;//当前等级收益
	private int nextPer;//下一等级收益
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCurPer() {
		return curPer;
	}
	public void setCurPer(int curPer) {
		this.curPer = curPer;
	}
	public int getNextPer() {
		return nextPer;
	}
	public void setNextPer(int nextPer) {
		this.nextPer = nextPer;
	}
	public ReceivePercentModel(int type, int curPer, int nextPer) {
		super();
		this.type = type;
		this.curPer = curPer;
		this.nextPer = nextPer;
	}
	
	
}
