package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/9/14 15:40
 */
public class ClubWelfareSwitchModel implements Serializable {
	private static final long serialVersionUID = -5657356788457650601L;

	/**
	 * 福卡功能总开关(0-关闭 1-开启)
	 */
	private int totalSwitch;
	/**
	 * 按条件开启全部亲友圈
	 */
	private int isConditionOpen;
	/**
	 * 指定亲友圈Id开启
	 */
	private int isAppointOpen;
	/**
	 * 是否勾选亲友圈人数条件
	 */
	private int hasMemCountCond;
	/**
	 * 亲友圈人数大于
	 */
	private int memCount;
	/**
	 * 是否勾选亲友圈总牌局数条件
	 */
	private int hasGameCountCond;
	/**
	 * 亲友圈总牌局数大于
	 */
	private int gameCount;
	/**
	 * 指定亲友圈Id，格式(id1,id2,id3...)
	 */
	private String appointClubIds;
	/**
	 * 首次赠送福卡数量
	 */
	private int firstSendNum;
	/**
	 * 亲友圈福卡少于该值时可手动领取
	 */
	private int canGetCond;
	/**
	 * 福卡手动领取数量
	 */
	private int getNum;

	private Date lastLotteryTime;

	public int getTotalSwitch() {
		return totalSwitch;
	}

	public void setTotalSwitch(int totalSwitch) {
		this.totalSwitch = totalSwitch;
	}

	public int getIsConditionOpen() {
		return isConditionOpen;
	}

	public void setIsConditionOpen(int isConditionOpen) {
		this.isConditionOpen = isConditionOpen;
	}

	public int getIsAppointOpen() {
		return isAppointOpen;
	}

	public void setIsAppointOpen(int isAppointOpen) {
		this.isAppointOpen = isAppointOpen;
	}

	public int getHasMemCountCond() {
		return hasMemCountCond;
	}

	public void setHasMemCountCond(int hasMemCountCond) {
		this.hasMemCountCond = hasMemCountCond;
	}

	public int getMemCount() {
		return memCount;
	}

	public void setMemCount(int memCount) {
		this.memCount = memCount;
	}

	public int getHasGameCountCond() {
		return hasGameCountCond;
	}

	public void setHasGameCountCond(int hasGameCountCond) {
		this.hasGameCountCond = hasGameCountCond;
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}

	public String getAppointClubIds() {
		return appointClubIds;
	}

	public void setAppointClubIds(String appointClubIds) {
		this.appointClubIds = appointClubIds;
	}

	public int getFirstSendNum() {
		return firstSendNum;
	}

	public void setFirstSendNum(int firstSendNum) {
		this.firstSendNum = firstSendNum;
	}

	public int getCanGetCond() {
		return canGetCond;
	}

	public void setCanGetCond(int canGetCond) {
		this.canGetCond = canGetCond;
	}

	public int getGetNum() {
		return getNum;
	}

	public void setGetNum(int getNum) {
		this.getNum = getNum;
	}

	public Date getLastLotteryTime() {
		return lastLotteryTime;
	}

	public void setLastLotteryTime(Date lastLotteryTime) {
		this.lastLotteryTime = lastLotteryTime;
	}
}
