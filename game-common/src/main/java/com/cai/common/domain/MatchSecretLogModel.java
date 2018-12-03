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
@Document(collection = "match_secret_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_matchId", def = "{'matchId': 1}"),
		@CompoundIndex(name = "index_adminId", def = "{'adminId': 1}"),
		})
public class MatchSecretLogModel implements Serializable{
	/**
	 */
	private static final long serialVersionUID = 1L;
	private int matchId;  //使用比赛
	private long adminId;  //管理员ID
	private int secretId;  //密匙ID
	private int secretKey; //密匙码
	private String useType; //使用类型   use使用  back取消使用
	private long accountId; //使用玩家
	private Date useData; //使用日期
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public int getSecretId() {
		return secretId;
	}
	public void setSecretId(int secretId) {
		this.secretId = secretId;
	}
	public int getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(int secretKey) {
		this.secretKey = secretKey;
	}
	public Date getUseData() {
		return useData;
	}
	public void setUseData(Date useData) {
		this.useData = useData;
	}
	public String getUseType() {
		return useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

}
