/**
 *
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 */
@Document(collection = "coin_player_log")
@CompoundIndexes({ @CompoundIndex(name = "index_detailId", def = "{'detailId': 1}"), @CompoundIndex(name = "index_timeFlag", def = "{'timeFlag': 1}"),
		@CompoundIndex(name = "index_flag", def = "{'flag': 1}"), })
public class CoinPlayerLogModel implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private int detailId; //场次ID
	private Date timeFlag; //时间标志
	private int gameId; //游戏ID
	private int roundLevel; //场次级别
	private String roundName; //名称
	private int sumNum; //玩家总人数
	private int roundNum; //当天牌局数
	private int baseCoin; //扣除台费
	private int winCoin;  //玩家赢取金币数
	private int loseCoin; //玩家输掉
	private int playNum; //玩牌人数  同个ID只记一次
	private int playNumTime; //玩牌人次
	private int bankruptcyNum; //破产人数  同个ID只记一次
	private int bankruptcyNumTime; //破产人次
	private int newBankruptcyNum; //新用户破产人数  同个ID只记一次
	private int newBankruptcyNumTime; //新用户破产人次
	private int payMoney; //充值金额
	private int payNum; //充值用户
	private int exchangeNum; //兑换次数
	private int exchangeNumTime; //兑换人次
	private int newExchangeNum; //新用户兑换次数
	private int newExchangeNumTime; //新用户兑换人次
	private int exchangeMoney; //兑换闲逸豆数
	private Map<Integer, Integer> numMap = new HashMap<>(); // key=天数  value=玩牌人数
	private int newRoundNum; //新玩家牌局数
	private int oldRoundNum; //旧玩家牌局数
	private int reliefCoin; //领取救济金金币数

	//辅助字段
	private String flag;
	private String gameName;    //游戏名称

	//聚宝盆相关统计
	private int cornucopiaPlayNum;//参与人数
	private int cornucopiaGuess; //竞猜人数
	private long cornucopiaRecycleCoin;//回收金币数,赢家贡献
	private long cornucopiaCostCoin; //参与消耗
	private final Map<Long, Integer> cardType = Maps.newHashMap(); //牌型
	private final Map<Long, Long> cardTypeAward = Maps.newHashMap(); //牌型奖励金币

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

	public int getBaseCoin() {
		return baseCoin;
	}

	public void setBaseCoin(int baseCoin) {
		this.baseCoin = baseCoin;
	}

	public int getPlayNum() {
		return playNum;
	}

	public void setPlayNum(int playNum) {
		this.playNum = playNum;
	}

	public int getPlayNumTime() {
		return playNumTime;
	}

	public void setPlayNumTime(int playNumTime) {
		this.playNumTime = playNumTime;
	}

	public int getBankruptcyNum() {
		return bankruptcyNum;
	}

	public void setBankruptcyNum(int bankruptcyNum) {
		this.bankruptcyNum = bankruptcyNum;
	}

	public int getBankruptcyNumTime() {
		return bankruptcyNumTime;
	}

	public void setBankruptcyNumTime(int bankruptcyNumTime) {
		this.bankruptcyNumTime = bankruptcyNumTime;
	}

	public int getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}

	public int getPayNum() {
		return payNum;
	}

	public void setPayNum(int payNum) {
		this.payNum = payNum;
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

	public int getExchangeNum() {
		return exchangeNum;
	}

	public void setExchangeNum(int exchangeNum) {
		this.exchangeNum = exchangeNum;
	}

	public int getExchangeNumTime() {
		return exchangeNumTime;
	}

	public void setExchangeNumTime(int exchangeNumTime) {
		this.exchangeNumTime = exchangeNumTime;
	}

	public int getExchangeMoney() {
		return exchangeMoney;
	}

	public void setExchangeMoney(int exchangeMoney) {
		this.exchangeMoney = exchangeMoney;
	}

	public Map<Integer, Integer> getNumMap() {
		return numMap;
	}

	public void setNumMap(Map<Integer, Integer> numMap) {
		this.numMap = numMap;
	}

	public int getNewRoundNum() {
		return newRoundNum;
	}

	public void setNewRoundNum(int newRoundNum) {
		this.newRoundNum = newRoundNum;
	}

	public int getOldRoundNum() {
		return oldRoundNum;
	}

	public void setOldRoundNum(int oldRoundNum) {
		this.oldRoundNum = oldRoundNum;
	}

	public int getNewBankruptcyNum() {
		return newBankruptcyNum;
	}

	public void setNewBankruptcyNum(int newBankruptcyNum) {
		this.newBankruptcyNum = newBankruptcyNum;
	}

	public int getNewBankruptcyNumTime() {
		return newBankruptcyNumTime;
	}

	public void setNewBankruptcyNumTime(int newBankruptcyNumTime) {
		this.newBankruptcyNumTime = newBankruptcyNumTime;
	}

	public int getReliefCoin() {
		return reliefCoin;
	}

	public void setReliefCoin(int reliefCoin) {
		this.reliefCoin = reliefCoin;
	}

	public int getNewExchangeNum() {
		return newExchangeNum;
	}

	public void setNewExchangeNum(int newExchangeNum) {
		this.newExchangeNum = newExchangeNum;
	}

	public int getNewExchangeNumTime() {
		return newExchangeNumTime;
	}

	public void setNewExchangeNumTime(int newExchangeNumTime) {
		this.newExchangeNumTime = newExchangeNumTime;
	}

	public int getSumNum() {
		return sumNum;
	}

	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}

	public int getCornucopiaPlayNum() {
		return cornucopiaPlayNum;
	}

	public void setCornucopiaPlayNum(int cornucopiaPlayNum) {
		this.cornucopiaPlayNum = cornucopiaPlayNum;
	}

	public int getCornucopiaGuess() {
		return cornucopiaGuess;
	}

	public void setCornucopiaGuess(int cornucopiaGuess) {
		this.cornucopiaGuess = cornucopiaGuess;
	}

	public long getCornucopiaRecycleCoin() {
		return cornucopiaRecycleCoin;
	}

	public void setCornucopiaRecycleCoin(long cornucopiaRecycleCoin) {
		this.cornucopiaRecycleCoin = cornucopiaRecycleCoin;
	}

	public long getCornucopiaCostCoin() {
		return cornucopiaCostCoin;
	}

	public void setCornucopiaCostCoin(long cornucopiaCostCoin) {
		this.cornucopiaCostCoin = cornucopiaCostCoin;
	}

	public Map<Long, Integer> getCardType() {
		return cardType;
	}

	public Map<Long, Long> getCardTypeAward() {
		return cardTypeAward;
	}

	public void updateCardType(long cardTypeValue, int value) {
		cardType.compute(cardTypeValue, (k, v) -> null == v ? value : v + value);
	}

	public void updateCardTypeAward(long cardTypeValue, long value) {
		cardTypeAward.compute(cardTypeValue, (k, v) -> null == v ? value : v + value);
	}
}
