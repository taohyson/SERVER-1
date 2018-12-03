/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain.mj;

/**
 * 
 * 记录玩家的定缺信息
 * @author WalkerGeek 
 * date: 2018年9月3日 下午12:08:38 <br/>
 */
public class DingQueInfo {
	
	private boolean isDingQue ;  // 是否定缺
	private int[] queColors; //  缺牌颜色
	private boolean[] needDingQue; // 需要定缺
	
	public DingQueInfo(){}
	/**
	 * @param isDingQue
	 * @param queColors
	 */
	public DingQueInfo(boolean isDingQue, int maxCount) {
		super();
		this.isDingQue = isDingQue;
		this.queColors = new int[maxCount];
		needDingQue = new boolean[maxCount];
		for(int i = 0; i< maxCount; i++){
			needDingQue[i] = false;
		}
	}
	
	/**
	 * @return the isDingQue
	 */
	public boolean isDingQue() {
		return isDingQue;
	}
	/**
	 * @param isDingQue the isDingQue to set
	 */
	public void setDingQue(boolean isDingQue) {
		this.isDingQue = isDingQue;
	}
	/**
	 * @return the queColors
	 */
	public int getQueColors(int seat_index) {
		return queColors[seat_index];
	}
	/**
	 * @param queColors the queColors to set
	 */
	public void setQueColors(int[] queColors) {
		isDingQue = true;
		this.queColors = queColors;
	}
	public void addQueColors(int seat_index ,int queColor) {
		isDingQue = true;
		this.queColors[seat_index] = queColor;
	}

	/**
	 * @return the needDingQue
	 */
	public boolean getNeedDingQue(int seat_index) {
		return needDingQue[seat_index];
	}

	/**
	 * @param needDingQue the needDingQue to set
	 */
	public void needDingQueVaild(int seat_index) {
		this.needDingQue[seat_index] = true;
	}
	
	/**
	 * @param needDingQue the needDingQue to set
	 */
	public void needDingQueInVaild(int seat_index) {
		this.needDingQue[seat_index] = false;
	}
	
	
	
	

}
