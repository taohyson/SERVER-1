/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 */
@Document(collection = "match_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_matchId", def = "{'matchId': 1}"),
		@CompoundIndex(name = "index_matchName", def = "{'matchName': 1}"),
		@CompoundIndex(name = "index_gameId", def = "{'gameId': 1}"),
		@CompoundIndex(name = "index_unionId", def = "{'unionId': 1}"),
		@CompoundIndex(name = "index_timeFlag", def = "{'timeFlag': 1}"),
		})
public class MatchLogModel implements Serializable{
	/**
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private String timeFlag;
	
	private int unionId;
	
	private String unionName;
	
	private long gameId;
	
	private String gameName;
	
	private int matchType;
	private int matchBeginType;

	private int matchId;
	
	private String matchName;
	
	private Date startTime;
	
	// 报名消耗了多少豆
	private long costGold;
	
	// 比赛奖励了多少豆
	private long prizeGold;
	
	// 报名消耗了多少金币
	private long costMoney;
	
	// 比赛奖励了多少金币
	private long prizeMoney;
	
	//正常开赛次数
	private int matchSuccess;
	
	// 开局失败次数
	private int matchFail;
	
	// 参数人数
	private int applyCount;
	
	// 奖励发放人数
	private int prizeCount;
	
	// 独立人次
	private int distinctApplyCount;
	
	// 奖励人次
	private int distinctPrizeCount;
	
	private int ticketNum; //人票人数
	private int playTime; //时长
	private int robotNum; //机器人人数
	private int joinNum; //报名人数
	private int joinNumTime; //报名人次
	private int noJoinNum; //取消报名人数
	private int noJoinNumTime; //取消报名人次
	private int applyNum; //报名人数
	private int applyNumTime; //报名人次
	private int startNum; //参赛人数
	private int startNumTime; //参赛人次
	private int payStartNum; //支付用户参赛人数
	private int newerStartNum; //新增用户参赛人数
	private int noStartNum; //未参赛人数
	private int noStartNumTime; //未参赛人次
	private int leaveNum; //主动退赛人数
	private int leaveNumTime; //主动退赛人次
	private int prizeNum; //奖励人数
	private int prizeNumTime; //奖励人次
	private Map<String, Integer> itemMap = new HashMap<>(); //道具奖励  key:itemId value数量
	private String rewardItemMsg; //奖励道具信息
	private int rewardCash; //奖励红包现金
	//冲榜赛
	private int resetNum; //清零独立人数
	private int resetOpNum; //清零使用次数
	private int resetSumGold; //清零消耗金豆
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public int getMatchType() {
		return matchType;
	}

	public void setMatchType(int matchType) {
		this.matchType = matchType;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public int getDistinctPrizeCount() {
		return distinctPrizeCount;
	}

	public void setDistinctPrizeCount(int distinctPrizeCount) {
		this.distinctPrizeCount = distinctPrizeCount;
	}

	public int getDistinctApplyCount() {
		return distinctApplyCount;
	}

	public void setDistinctApplyCount(int distinctApplyCount) {
		this.distinctApplyCount = distinctApplyCount;
	}

	public int getPrizeCount() {
		return prizeCount;
	}

	public void setPrizeCount(int prizeCount) {
		this.prizeCount = prizeCount;
	}

	public int getApplyCount() {
		return applyCount;
	}

	public void setApplyCount(int applyCount) {
		this.applyCount = applyCount;
	}

	public int getMatchFail() {
		return matchFail;
	}

	public void setMatchFail(int matchFail) {
		this.matchFail = matchFail;
	}

	public int getMatchSuccess() {
		return matchSuccess;
	}

	public void setMatchSuccess(int matchSuccess) {
		this.matchSuccess = matchSuccess;
	}

	public long getCostMoney() {
		return costMoney;
	}

	public void setCostMoney(long costMoney) {
		this.costMoney = costMoney;
	}

	public long getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(long prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	public long getPrizeGold() {
		return prizeGold;
	}

	public void setPrizeGold(long prizeGold) {
		this.prizeGold = prizeGold;
	}

	public long getCostGold() {
		return costGold;
	}

	public void setCostGold(long costGold) {
		this.costGold = costGold;
	}


	public int getUnionId() {
		return unionId;
	}

	public void setUnionId(int unionId) {
		this.unionId = unionId;
	}

	public String getUnionName() {
		return unionName;
	}

	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}

	public String getTimeFlag() {
		return timeFlag;
	}

	public void setTimeFlag(String timeFlag) {
		this.timeFlag = timeFlag;
	}

	public int getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}

	public int getApplyNumTime() {
		return applyNumTime;
	}

	public void setApplyNumTime(int applyNumTime) {
		this.applyNumTime = applyNumTime;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getStartNumTime() {
		return startNumTime;
	}

	public void setStartNumTime(int startNumTime) {
		this.startNumTime = startNumTime;
	}

	public int getNoStartNum() {
		return noStartNum;
	}

	public void setNoStartNum(int noStartNum) {
		this.noStartNum = noStartNum;
	}

	public int getNoStartNumTime() {
		return noStartNumTime;
	}

	public void setNoStartNumTime(int noStartNumTime) {
		this.noStartNumTime = noStartNumTime;
	}

	public int getLeaveNum() {
		return leaveNum;
	}

	public void setLeaveNum(int leaveNum) {
		this.leaveNum = leaveNum;
	}

	public int getLeaveNumTime() {
		return leaveNumTime;
	}

	public void setLeaveNumTime(int leaveNumTime) {
		this.leaveNumTime = leaveNumTime;
	}

	public int getPrizeNum() {
		return prizeNum;
	}

	public void setPrizeNum(int prizeNum) {
		this.prizeNum = prizeNum;
	}

	public int getPrizeNumTime() {
		return prizeNumTime;
	}

	public void setPrizeNumTime(int prizeNumTime) {
		this.prizeNumTime = prizeNumTime;
	}

	public Map<String, Integer> getItemMap() {
		return itemMap;
	}

	public void setItemMap(Map<String, Integer> itemMap) {
		this.itemMap = itemMap;
	}

	public int getJoinNum() {
		return joinNum;
	}

	public void setJoinNum(int joinNum) {
		this.joinNum = joinNum;
	}

	public int getNoJoinNum() {
		return noJoinNum;
	}

	public void setNoJoinNum(int noJoinNum) {
		this.noJoinNum = noJoinNum;
	}

	public int getNoJoinNumTime() {
		return noJoinNumTime;
	}

	public void setNoJoinNumTime(int noJoinNumTime) {
		this.noJoinNumTime = noJoinNumTime;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public int getRobotNum() {
		return robotNum;
	}
	public void setRobotNum(int robotNum) {
		this.robotNum = robotNum;
	}
	public int getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}

	public int getPayStartNum() {
		return payStartNum;
	}

	public void setPayStartNum(int payStartNum) {
		this.payStartNum = payStartNum;
	}

	public int getNewerStartNum() {
		return newerStartNum;
	}

	public void setNewerStartNum(int newerStartNum) {
		this.newerStartNum = newerStartNum;
	}

	public int getJoinNumTime() {
		return joinNumTime;
	}

	public void setJoinNumTime(int joinNumTime) {
		this.joinNumTime = joinNumTime;
	}

	public int getMatchBeginType() {
		return matchBeginType;
	}

	public void setMatchBeginType(int matchBeginType) {
		this.matchBeginType = matchBeginType;
	}

	public String getRewardItemMsg() {
		return rewardItemMsg;
	}

	public void setRewardItemMsg(String rewardItemMsg) {
		this.rewardItemMsg = rewardItemMsg;
	}

	public int getRewardCash() {
		return rewardCash;
	}

	public void setRewardCash(int rewardCash) {
		this.rewardCash = rewardCash;
	}

	public int getResetNum() {
		return resetNum;
	}

	public void setResetNum(int resetNum) {
		this.resetNum = resetNum;
	}

	public int getResetOpNum() {
		return resetOpNum;
	}

	public void setResetOpNum(int resetOpNum) {
		this.resetOpNum = resetOpNum;
	}

	public int getResetSumGold() {
		return resetSumGold;
	}

	public void setResetSumGold(int resetSumGold) {
		this.resetSumGold = resetSumGold;
	}

}
