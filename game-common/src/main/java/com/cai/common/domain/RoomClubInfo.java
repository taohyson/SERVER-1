/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 房间附带的俱乐部信息
 *
 * @author wu_hc date: 2017年10月31日 上午10:30:09 <br/>
 */
public final class RoomClubInfo {
	/**
	 * 俱乐部id
	 */
	public int clubId;

	/**
	 * 俱乐部名称
	 */
	public String clubName;

	/**
	 * 规则/玩法id
	 */
	public int ruleId;

	/**
	 * 房间对应ruleId下的索引
	 */
	public int index;

	/**
	 * 新建房间后是否有玩法修改
	 */
	public boolean updateRule = false;

	/**
	 * 新建房间后是否有玩法修改
	 */
	public boolean clubDel = false;

	/**
	 * 是否消耗专属豆的房间
	 */
	public volatile boolean exclusive = false;

	/**
	 * 创建房间时刻俱乐部成员数
	 */
	public int clubMemberSize;

	/**
	 * 是否俱乐部比赛场
	 */
	public long matchId = -1;

	@Override
	public String toString() {
		return "RoomClubInfo [clubId=" + clubId + ", clubName=" + clubName + ", ruleId=" + ruleId + ", index=" + index + ", updateRule=" + updateRule
				+ ", clubDel=" + clubDel + ", exclusive=" + exclusive + ", clubMemberSize=" + clubMemberSize + ", matchId=" + matchId + "]";
	}

}
