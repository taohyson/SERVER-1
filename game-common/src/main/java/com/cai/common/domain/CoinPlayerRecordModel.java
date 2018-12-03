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
@Document(collection = "coin_player_record")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_reliefNum", def = "{'reliefNum': 1}"),
		})
public class CoinPlayerRecordModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long accountId;
	private int reliefNum;
	private Map<Integer, CoinRecord> rateMap = new HashMap<>();
	private Date date;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public int getReliefNum() {
		return reliefNum;
	}
	public void setReliefNum(int reliefNum) {
		this.reliefNum = reliefNum;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Map<Integer, CoinRecord> getRateMap() {
		return rateMap;
	}
	public void setRateMap(Map<Integer, CoinRecord> rateMap) {
		this.rateMap = rateMap;
	}

}
