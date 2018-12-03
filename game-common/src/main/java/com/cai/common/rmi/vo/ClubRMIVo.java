/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.List;

import com.cai.common.define.EClubSettingStatus;
import com.cai.common.domain.StatusModule;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月25日 上午11:35:23 <br/>
 */
public final class ClubRMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 俱乐部设置(冻结俱乐部)、解散俱乐部、修改名称、修改公告、解散桌子、踢人。
	 */
	private int type;
	private int clubId;
	private String newClubName;
	private String newNotice;
	private int ruleId;
	private int tableIndex;
	private int clubSettings;
	private List<Long> memberId;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getNewClubName() {
		return newClubName;
	}

	public void setNewClubName(String newClubName) {
		this.newClubName = newClubName;
	}

	public String getNewNotice() {
		return newNotice;
	}

	public void setNewNotice(String newNotice) {
		this.newNotice = newNotice;
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public int getTableIndex() {
		return tableIndex;
	}

	public void setTableIndex(int tableIndex) {
		this.tableIndex = tableIndex;
	}

	public int getClubSettings() {
		return clubSettings;
	}

	public void setClubSettings(int clubSettings) {
		this.clubSettings = clubSettings;
	}

	public List<Long> getMemberId() {
		return memberId;
	}

	public void setMemberId(List<Long> memberId) {
		this.memberId = memberId;
	}

	/**
	 * 俱乐部冻结
	 */
	public void clubFreeze(boolean freeze) {
		StatusModule model = StatusModule.newWithStatus(0);
		clubSettings = freeze ? model.statusAdd(EClubSettingStatus.CLUB_FREEZE) : model.statusDel(EClubSettingStatus.CLUB_FREEZE);
	}

	/**
	 * 设置加入审核
	 * 
	 * @param examined
	 */
	public void clubExamined(boolean examined) {
		StatusModule model = StatusModule.newWithStatus(0);
		clubSettings = examined ? model.statusAdd(EClubSettingStatus.CLUB_EXAMINED) : model.statusDel(EClubSettingStatus.CLUB_EXAMINED);
	}
	
	/**
	 * 设置退出审核
	 * 
	 * @param examined
	 */
	public void clubQuitExamined(boolean examined) {
		StatusModule model = StatusModule.newWithStatus(0);
		clubSettings = examined ? model.statusAdd(EClubSettingStatus.CLUB_QUIT_EXAMINED) : model.statusDel(EClubSettingStatus.CLUB_QUIT_EXAMINED);
	}
	
	@Override
	public String toString() {
		return "ClubRMIVo [type=" + type + ", clubId=" + clubId + ", newClubName=" + newClubName + ", newNotice=" + newNotice + ", ruleId=" + ruleId
				+ ", tableIndex=" + tableIndex + ", clubSettings=" + clubSettings + ", memberId=" + memberId + "]";
	}

}
