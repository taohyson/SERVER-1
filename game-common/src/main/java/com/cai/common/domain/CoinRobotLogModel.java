/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 */
@Document(collection = "coin_robot_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_detailId", def = "{'detailId': 1}"),
		@CompoundIndex(name = "index_timeFlag", def = "{'timeFlag': 1}"),
		})
public class CoinRobotLogModel implements Serializable{
	/**
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private int detailId;  //场次ID
	private Date timeFlag; //	时间标志
	private int gameId; //游戏ID
	private int roundLevel; //场次级别
	private String roundName; //名称
	private int roundNum; //总局数
	private int robotNum; //机器人参加数量
	private int winCoin; //赢得金币数
	private int loseCoin; //输掉金币数
	private int winNum; //胜利次数
	private int loseNum; //失败次数
	private String flag;
	
	//辅助字段
	private String gameName;	//游戏名称
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public Date getTimeFlag() {
		return timeFlag;
	}
	public void setTimeFlag(Date timeFlag) {
		this.timeFlag = timeFlag;
	}
	public int getRoundNum() {
		return roundNum;
	}
	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
	public int getRobotNum() {
		return robotNum;
	}
	public void setRobotNum(int robotNum) {
		this.robotNum = robotNum;
	}
	public int getWinCoin() {
		return winCoin;
	}
	public void setWinCoin(int winCoin) {
		this.winCoin = winCoin;
	}
	public int getLoseCoin() {
		return loseCoin;
	}
	public void setLoseCoin(int loseCoin) {
		this.loseCoin = loseCoin;
	}
	public int getWinNum() {
		return winNum;
	}
	public void setWinNum(int winNum) {
		this.winNum = winNum;
	}
	public int getLoseNum() {
		return loseNum;
	}
	public void setLoseNum(int loseNum) {
		this.loseNum = loseNum;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getRoundLevel() {
		return roundLevel;
	}
	public void setRoundLevel(int roundLevel) {
		this.roundLevel = roundLevel;
	}
	public String getRoundName() {
		return roundName;
	}
	public void setRoundName(String roundName) {
		this.roundName = roundName;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
}
