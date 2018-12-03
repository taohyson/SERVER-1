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
@Document(collection = "match_status_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_indexId", def = "{'indexId': 1}"),
		@CompoundIndex(name = "index_matchId", def = "{'matchId': 1}"),
		})
public class MatchStatusLogModel implements Serializable{
	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private int indexId;
	private int matchId;
	private int unionId;
	private String unionName;
	private long gameId;
	private String gameName;
	private int matchType;
	private String matchName;
	private Date startTime;
	private String status;
	
	public int getIndexId() {
		return indexId;
	}
	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
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
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getMatchType() {
		return matchType;
	}
	public void setMatchType(int matchType) {
		this.matchType = matchType;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
