/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/** 汇总
 */
@Document(collection = "match_summary_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_startTime", def = "{'startTime': 1}"),
		@CompoundIndex(name = "index_timeFlag", def = "{'timeFlag': 1}"),
		})
public class MatchLogSummaryModel implements Serializable{
	/**
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private String timeFlag;
	private Date startTime;
	
	private int joinNum; //报名人数
	private int joinNumTime; //报名人次
	private int noJoinNum; //取消报名人数
	private int noJoinNumTime; //取消报名人次
	private int startNum; //参赛人数
	private int startNumTime; //参赛人次
	private int costGold; //消耗金豆
	private int costMoney; //消耗金币
	private int prizeGold; //奖励金豆
	private int prizeMoney; //奖励金币
	private int matchSuccess; //正常开赛次数
	private int matchFail; // 开局失败次数
	private int leaveNumTime; //主动退赛人次
	private int prizeNumTime; //奖励人次
	private int payStartNum; //支付用户参赛人数
	private int newerStartNum; //新增用户参赛人数
	private int robotNum; //机器人数
	private int prizeRedCash; //奖励红包金额
	private String prizeItemMsg; //道具奖励
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getTimeFlag() {
		return timeFlag;
	}
	public void setTimeFlag(String timeFlag) {
		this.timeFlag = timeFlag;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
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
	public int getCostGold() {
		return costGold;
	}
	public void setCostGold(int costGold) {
		this.costGold = costGold;
	}
	public int getCostMoney() {
		return costMoney;
	}
	public void setCostMoney(int costMoney) {
		this.costMoney = costMoney;
	}
	public int getPrizeGold() {
		return prizeGold;
	}
	public void setPrizeGold(int prizeGold) {
		this.prizeGold = prizeGold;
	}
	public int getPrizeMoney() {
		return prizeMoney;
	}
	public void setPrizeMoney(int prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	public int getMatchSuccess() {
		return matchSuccess;
	}
	public void setMatchSuccess(int matchSuccess) {
		this.matchSuccess = matchSuccess;
	}
	public int getMatchFail() {
		return matchFail;
	}
	public void setMatchFail(int matchFail) {
		this.matchFail = matchFail;
	}
	public int getJoinNum() {
		return joinNum;
	}
	public void setJoinNum(int joinNum) {
		this.joinNum = joinNum;
	}
	public int getJoinNumTime() {
		return joinNumTime;
	}
	public void setJoinNumTime(int joinNumTime) {
		this.joinNumTime = joinNumTime;
	}
	public int getNoJoinNumTime() {
		return noJoinNumTime;
	}
	public void setNoJoinNumTime(int noJoinNumTime) {
		this.noJoinNumTime = noJoinNumTime;
	}
	public int getLeaveNumTime() {
		return leaveNumTime;
	}
	public void setLeaveNumTime(int leaveNumTime) {
		this.leaveNumTime = leaveNumTime;
	}
	public int getPrizeNumTime() {
		return prizeNumTime;
	}
	public void setPrizeNumTime(int prizeNumTime) {
		this.prizeNumTime = prizeNumTime;
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
	public int getRobotNum() {
		return robotNum;
	}
	public void setRobotNum(int robotNum) {
		this.robotNum = robotNum;
	}
	public int getPrizeRedCash() {
		return prizeRedCash;
	}
	public void setPrizeRedCash(int prizeRedCash) {
		this.prizeRedCash = prizeRedCash;
	}
	public String getPrizeItemMsg() {
		return prizeItemMsg;
	}
	public void setPrizeItemMsg(String prizeItemMsg) {
		this.prizeItemMsg = prizeItemMsg;
	}
	public int getNoJoinNum() {
		return noJoinNum;
	}
	public void setNoJoinNum(int noJoinNum) {
		this.noJoinNum = noJoinNum;
	}
}
