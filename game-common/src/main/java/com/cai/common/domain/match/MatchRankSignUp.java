package com.cai.common.domain.match;

import java.io.Serializable;

/**
 * 冲榜赛报名倍数
 * @author wuhaoran
 */
public class MatchRankSignUp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int times;				//倍数(1倍2倍3倍)
	private int freeType;			//赠送的免费次数类型(1直接免费2分享免费)
	private int freeNum;			//免费次数
	private int signType;			//报名消耗类型(1闲逸豆2金币)
	private int goldMoneyNum;		//消耗数量
	
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public int getFreeType() {
		return freeType;
	}
	public void setFreeType(int freeType) {
		this.freeType = freeType;
	}
	public int getFreeNum() {
		return freeNum;
	}
	public void setFreeNum(int freeNum) {
		this.freeNum = freeNum;
	}
	public int getSignType() {
		return signType;
	}
	public void setSignType(int signType) {
		this.signType = signType;
	}
	public int getGoldMoneyNum() {
		return goldMoneyNum;
	}
	public void setGoldMoneyNum(int goldMoneyNum) {
		this.goldMoneyNum = goldMoneyNum;
	}
	
}
