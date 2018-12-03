/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.util.Arrays;
import java.util.Date;

/**
 * 俱乐部比赛
 *
 * @author wu_hc date: 2018年6月20日 上午10:07:16 <br/>
 */
public final class ClubMatchModel extends DBBaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 比赛id
	 */
	private long id;

	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 活动名称
	 */
	private String matchName;

	/**
	 * 比赛类型 1 自主报名 2 管理员设置参赛
	 */
	private int matchType;

	/**
	 * 开赛人数
	 */
	private int maxPlayerCount;

	/**
	 * 开始时间
	 */
	private Date startDate;

	/**
	 * 结束时间
	 */
	private Date endDate;

	/**
	 * 活动发起者
	 */
	private long creatorId;

	/**
	 * 状态
	 */
	private byte status;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 已经报名的成员列表[防止中途关服]
	 */
	private String enrollAccountIds;

	/**
	 * 奖励数量
	 */
	private String reward;

	/**
	 * 游戏玩法描述 {@see ClubRuleProto}
	 */
	private String gameRuleJson;

	/**
	 * 扣豆信息(type,num) type 0普通豆 1-专属豆
	 */
	private String costGold;

	/**
	 * 已结束的桌数
	 */
	private int gameCount;

	/**
	 * 玩家积分数据
	 */
	private byte[] datas;

	/**
	 * 开赛类型 0-定时开赛 1-满人开赛
	 */
	private int openType;

	/**
	 * 参赛条件 0-无 1-疲劳值门槛
	 */
	private int attendCondition;

	/**
	 * 参赛条件值
	 */
	private int conditionValue;

	/**
	 * 最小参赛人数
	 */
	private int minPlayerCount;

	/**
	 * 是否关闭报名入口
	 */
	private int isBanEnroll;

	/**
	 * 禁止参赛的玩家
	 */
	private String banPlayers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (this.id == id) {
			return;
		}
		setNeedDB(true);
		this.id = id;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		if (this.clubId == clubId) {
			return;
		}
		setNeedDB(true);
		this.clubId = clubId;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		if (matchName != null && matchName.equals(this.matchName)) {
			return;
		}
		setNeedDB(true);
		this.matchName = matchName;
	}

	public int getMatchType() {
		return matchType;
	}

	public void setMatchType(int matchType) {
		if (this.matchType == matchType) {
			return;
		}
		setNeedDB(true);
		this.matchType = matchType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		if (this.startDate == startDate) {
			return;
		}
		setNeedDB(true);
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		if (this.endDate == endDate) {
			return;
		}
		setNeedDB(true);
		this.endDate = endDate;
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		if (this.creatorId == creatorId) {
			return;
		}
		setNeedDB(true);
		this.creatorId = creatorId;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		if (this.status == status) {
			return;
		}
		setNeedDB(true);
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		if (remark != null && remark.equals(this.remark)) {
			return;
		}
		setNeedDB(true);
		this.remark = remark;
	}

	public String getEnrollAccountIds() {
		return enrollAccountIds;
	}

	public void setEnrollAccountIds(String enrollAccountIds) {
		if (enrollAccountIds != null && enrollAccountIds.equals(this.enrollAccountIds)) {
			return;
		}
		setNeedDB(true);
		this.enrollAccountIds = enrollAccountIds;
	}

	public int getMaxPlayerCount() {
		return maxPlayerCount;
	}

	public void setMaxPlayerCount(int maxPlayerCount) {
		if (this.maxPlayerCount == maxPlayerCount) {
			return;
		}
		setNeedDB(true);
		this.maxPlayerCount = maxPlayerCount;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		if (reward != null && reward.equals(this.reward)) {
			return;
		}
		setNeedDB(true);
		this.reward = reward;
	}

	public String getGameRuleJson() {
		return gameRuleJson;
	}

	public void setGameRuleJson(String gameRuleJson) {
		if (gameRuleJson != null && gameRuleJson.equals(this.gameRuleJson)) {
			return;
		}
		setNeedDB(true);
		this.gameRuleJson = gameRuleJson;
	}

	public String getCostGold() {
		return costGold;
	}

	public void setCostGold(String costGold) {
		if (costGold != null && costGold.equals(this.costGold)) {
			return;
		}
		setNeedDB(true);
		this.costGold = costGold;
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		if (this.gameCount == gameCount) {
			return;
		}
		setNeedDB(true);
		this.gameCount = gameCount;
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

	public int getOpenType() {
		return openType;
	}

	public void setOpenType(int openType) {
		if (this.openType == openType) {
			return;
		}
		setNeedDB(true);
		this.openType = openType;
	}

	public int getAttendCondition() {
		return attendCondition;
	}

	public void setAttendCondition(int attendCondition) {
		if (this.attendCondition == attendCondition) {
			return;
		}
		setNeedDB(true);
		this.attendCondition = attendCondition;
	}

	public int getConditionValue() {
		return conditionValue;
	}

	public void setConditionValue(int conditionValue) {
		if (this.conditionValue == conditionValue) {
			return;
		}
		setNeedDB(true);
		this.conditionValue = conditionValue;
	}

	public int getMinPlayerCount() {
		return minPlayerCount;
	}

	public void setMinPlayerCount(int minPlayerCount) {
		if (this.minPlayerCount == minPlayerCount) {
			return;
		}
		setNeedDB(true);
		this.minPlayerCount = minPlayerCount;
	}

	public int getIsBanEnroll() {
		return isBanEnroll;
	}

	public void setIsBanEnroll(int isBanEnroll) {
		if (this.isBanEnroll == isBanEnroll) {
			return;
		}
		setNeedDB(true);
		this.isBanEnroll = isBanEnroll;
	}

	public String getBanPlayers() {
		return banPlayers;
	}

	public void setBanPlayers(String banPlayers) {
		if (banPlayers != null && banPlayers.equals(this.banPlayers)) {
			return;
		}
		setNeedDB(true);
		this.banPlayers = banPlayers;
	}
}
