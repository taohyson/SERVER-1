package com.cai.common.domain;

import java.util.Arrays;

/**
 * 
 *
 * @author zhanglong date: 2018年7月7日 上午11:08:37
 */
public class ClubDataModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int clubId;

	/**
	 * 建赛次数
	 */
	private int matchCreateNum;

	/**
	 * 比赛成功开启次数
	 */
	private int matchEndNum;

	/**
	 * 专属豆消耗
	 */
	private long exclusiveCost;

	/**
	 * 闲逸豆消耗
	 */
	private long goldCost;

	/**
	 * 每日数据
	 */
	private byte[] datas;

	public ClubDataModel() {

	}

	public ClubDataModel(int clubId) {
		this.clubId = clubId;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		if (this.clubId == clubId) {
			return;
		}
		this.setNeedDB(true);
		this.clubId = clubId;
	}

	public int getMatchCreateNum() {
		return matchCreateNum;
	}

	public void setMatchCreateNum(int matchCreateNum) {
		if (this.matchCreateNum == matchCreateNum) {
			return;
		}
		this.setNeedDB(true);
		this.matchCreateNum = matchCreateNum;
	}

	public int getMatchEndNum() {
		return matchEndNum;
	}

	public void setMatchEndNum(int matchEndNum) {
		if (this.matchEndNum == matchEndNum) {
			return;
		}
		this.setNeedDB(true);
		this.matchEndNum = matchEndNum;
	}

	public long getExclusiveCost() {
		return exclusiveCost;
	}

	public void setExclusiveCost(long exclusiveCost) {
		if (this.exclusiveCost == exclusiveCost) {
			return;
		}
		this.setNeedDB(true);
		this.exclusiveCost = exclusiveCost;
	}

	public long getGoldCost() {
		return goldCost;
	}

	public void setGoldCost(long goldCost) {
		if (this.goldCost == goldCost) {
			return;
		}
		this.setNeedDB(true);
		this.goldCost = goldCost;
	}

	public byte[] getDatas() {
		return datas;
	}

	public void setDatas(byte[] datas) {
		if (Arrays.equals(this.datas, datas)) {
			return;
		}
		this.setNeedDB(true);
		this.datas = datas;
	}

}
