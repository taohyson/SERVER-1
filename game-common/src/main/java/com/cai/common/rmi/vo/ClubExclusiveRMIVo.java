/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.define.EGoldOperateType;
import com.cai.common.define.ExclusiveSettingStatus;
import com.cai.common.domain.StatusModule;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年12月13日 下午5:41:17 <br/>
 */
public final class ClubExclusiveRMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final long accountId;
	private final int gameId;
	private long value;
	private final EGoldOperateType type;
	private String desc;
	private int gameTypeIndex;
	private int clubId;

	// 如果是来自后台
	private Date exclusiveBeginDate;
	private Date exclusiveEndDate;
	// @see com.cai.common.define.ExclusiveSettingStatus
	private int settings;

	/**
	 * 
	 * @param accountId
	 * @param gameId
	 * @param value
	 * @return
	 */
	public static ClubExclusiveRMIVo newVo(long accountId, int gameId, long value) {
		return new ClubExclusiveRMIVo(accountId, gameId, value, null);
	}

	/**
	 * 
	 * @param accountId
	 * @param gameId
	 * @param value
	 * @param type
	 * @return
	 */
	public static ClubExclusiveRMIVo newVo(long accountId, int gameId, long value, EGoldOperateType type) {
		return new ClubExclusiveRMIVo(accountId, gameId, value, type);
	}

	private ClubExclusiveRMIVo(long accountId, int gameId, long value, EGoldOperateType type) {
		super();
		this.accountId = accountId;
		this.gameId = gameId;
		this.value = value;
		this.type = type;
	}

	public long getAccountId() {
		return accountId;
	}

	public int getGameId() {
		return gameId;
	}

	public long getValue() {
		return value;
	}

	public EGoldOperateType getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}

	public ClubExclusiveRMIVo setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public Date getExclusiveBeginDate() {
		return exclusiveBeginDate;
	}

	public ClubExclusiveRMIVo setExclusiveBeginDate(Date exclusiveBeginDate) {
		this.exclusiveBeginDate = exclusiveBeginDate;
		return this;
	}

	public Date getExclusiveEndDate() {
		return exclusiveEndDate;
	}

	public ClubExclusiveRMIVo setExclusiveEndDate(Date exclusiveEndDate) {
		this.exclusiveEndDate = exclusiveEndDate;
		return this;
	}

	public ClubExclusiveRMIVo setValue(long value) {
		this.value = value;
		return this;
	}

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public ClubExclusiveRMIVo setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
		return this;
	}

	public int getClubId() {
		return clubId;
	}

	public ClubExclusiveRMIVo setClubId(int clubId) {
		this.clubId = clubId;
		return this;
	}

	public int getSettings() {
		return settings;
	}

	public void setSettings(int settings) {
		this.settings = settings;
	}

	/**
	 * 添加设置状态
	 * 
	 * @param eTypes
	 */
	public void statusAdd(ExclusiveSettingStatus... eTypes) {
		settings = StatusModule.newWithStatus(settings).statusAdd(eTypes);
	}

	@Override
	public String toString() {
		return "ClubExclusiveRMIVo [accountId=" + accountId + ", gameId=" + gameId + ", value=" + value + ", type=" + type + ", desc=" + desc
				+ ", gameTypeIndex=" + gameTypeIndex + ", clubId=" + clubId + ", exclusiveBeginDate=" + exclusiveBeginDate + ", exclusiveEndDate="
				+ exclusiveEndDate + ", settings=" + settings + "]";
	}


}
