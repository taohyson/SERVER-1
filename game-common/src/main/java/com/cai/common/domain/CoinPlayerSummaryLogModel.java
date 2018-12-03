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
@Document(collection = "coin_player_summary_log")
@CompoundIndexes({ 
	@CompoundIndex(name = "_id_index", def = "{'_id': 1}"),
	@CompoundIndex(name = "timeFlag_index", def = "{'timeFlag': 1}"),
	@CompoundIndex(name = "flag_index", def = "{'flag': 1}"),
	})
public class CoinPlayerSummaryLogModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//辅助字段
	private String _id;
	private Date timeFlag; //时间标志
	private String flag;
	
	private int sumNum; //玩家总人数
	private int createNewerNum; //新注册用户总人数
	private int coinNewerNum; //新金币场用户总人数
	private int payMoney; //付费金额
	private int payNum; //付费人数
	private int playTime; //玩牌时长
	private int roundNum; //总局数
	private int sumBaseCoin;
	
	public int getRoundNum() {
		return roundNum;
	}
	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Date getTimeFlag() {
		return timeFlag;
	}
	public void setTimeFlag(Date timeFlag) {
		this.timeFlag = timeFlag;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public int getSumNum() {
		return sumNum;
	}
	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}
	public int getCreateNewerNum() {
		return createNewerNum;
	}
	public void setCreateNewerNum(int createNewerNum) {
		this.createNewerNum = createNewerNum;
	}
	public int getCoinNewerNum() {
		return coinNewerNum;
	}
	public void setCoinNewerNum(int coinNewerNum) {
		this.coinNewerNum = coinNewerNum;
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
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public int getSumBaseCoin() {
		return sumBaseCoin;
	}
	public void setSumBaseCoin(int sumBaseCoin) {
		this.sumBaseCoin = sumBaseCoin;
	}
	
}
