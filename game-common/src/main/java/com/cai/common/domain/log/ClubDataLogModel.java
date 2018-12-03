package com.cai.common.domain.log;

import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 俱乐部信息统计日志
 *
 * @author zhanglong date: 2018年6月5日 下午6:24:46
 */
@Document(collection = "club_data_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true) })
public class ClubDataLogModel extends BaseLogModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING)
	private Date create_time;
	
	/**
	 * 俱乐部总数
	 */
	private int totalClubCount;
	
	/**
	 * 新加入俱乐部玩家数
	 */
	private int newJoinCount;

	/**
	 * 俱乐部独立用户数(加入多个俱乐部算一个)
	 */
	private int distinct_user;
	
	/**
	 * 俱乐部设置包间个数统计(格式：0,num|1,num|2,num|3,num|4,num|5,num)俱乐部可设置0-5个包间
	 */
	private String setRuleCountData;
	
	/**
	 * 成功开桌次数
	 */
	private int successGameCount;
	
	/**
	 * 俱乐部活跃人数
	 */
	private int activePlayerCount;
	
	/**
	 * 俱乐部子游戏统计(俱乐部设置的子游戏占比)(格式：gameId,num|...)
	 */
	private String clubGameCountData;
	
	/**
	 * 俱乐部激活牌桌数
	 */
	private int activeTableCount;
	
	/**
	 * 俱乐部人数区间数据(格式：该区间俱乐部数,该区间俱乐部牌局数量|...)
	 */
	private String clubSectionData;
	
	/**
	 * 俱乐部总小局数
	 */
	private int childBrandCount;
	
	/**
	 * 俱乐部总大局数(打满了所有小局)
	 */
	private int completeParentBrandCount;
	
	/**
	 * 俱乐部开房消耗总豆数
	 */
	private int totalCostGold;
	
	/**
	 * 俱乐部对应各子游戏牌局数、玩牌人数(人数和人次)
	 */
	private String gameInfoData;
	
	/**
	 * 今日注册且玩牌的玩家人数
	 */
	private int registAndPlayNum;
	
	/**
	 * 新增俱乐部数
	 */
	private int newClubCount;
	
	/**
	 * 活跃俱乐部数
	 */
	private int activeClubNum;
	

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getDistinct_user() {
		return distinct_user;
	}

	public void setDistinct_user(int distinct_user) {
		this.distinct_user = distinct_user;
	}

	public int getSuccessGameCount() {
		return successGameCount;
	}

	public void setSuccessGameCount(int successGameCount) {
		this.successGameCount = successGameCount;
	}

	public int getActivePlayerCount() {
		return activePlayerCount;
	}

	public void setActivePlayerCount(int activePlayerCount) {
		this.activePlayerCount = activePlayerCount;
	}

	public int getNewJoinCount() {
		return newJoinCount;
	}

	public void setNewJoinCount(int newJoinCount) {
		this.newJoinCount = newJoinCount;
	}

	public int getClubActiveTableCount() {
		return activeTableCount;
	}

	public void setClubActiveTableCount(int clubActiveTableCount) {
		this.activeTableCount = clubActiveTableCount;
	}

	public int getTotalClubCount() {
		return totalClubCount;
	}

	public void setTotalClubCount(int totalClubCount) {
		this.totalClubCount = totalClubCount;
	}

	public String getClubSectionData() {
		return clubSectionData;
	}

	public void setClubSectionData(String clubSectionData) {
		this.clubSectionData = clubSectionData;
	}

	public String getSetRuleCountData() {
		return setRuleCountData;
	}

	public void setSetRuleCountData(String setRuleCountData) {
		this.setRuleCountData = setRuleCountData;
	}

	public String getClubGameCountData() {
		return clubGameCountData;
	}

	public void setClubGameCountData(String clubGameCountData) {
		this.clubGameCountData = clubGameCountData;
	}

	public int getChildBrandCount() {
		return childBrandCount;
	}

	public void setChildBrandCount(int childBrandCount) {
		this.childBrandCount = childBrandCount;
	}

	public int getCompleteParentBrandCount() {
		return completeParentBrandCount;
	}

	public void setCompleteParentBrandCount(int completeParentBrandCount) {
		this.completeParentBrandCount = completeParentBrandCount;
	}

	public int getTotalCostGold() {
		return totalCostGold;
	}

	public void setTotalCostGold(int totalCostGold) {
		this.totalCostGold = totalCostGold;
	}

	public String getGameInfoData() {
		return gameInfoData;
	}

	public void setGameInfoData(String gameInfoData) {
		this.gameInfoData = gameInfoData;
	}

	public int getRegistAndPlayNum() {
		return registAndPlayNum;
	}

	public void setRegistAndPlayNum(int registAndPlayNum) {
		this.registAndPlayNum = registAndPlayNum;
	}

	public int getNewClubCount() {
		return newClubCount;
	}

	public void setNewClubCount(int newClubCount) {
		this.newClubCount = newClubCount;
	}

	public int getActiveClubNum() {
		return activeClubNum;
	}

	public void setActiveClubNum(int activeClubNum) {
		this.activeClubNum = activeClubNum;
	}


}
