/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.google.protobuf.ByteString;

import protobuf.clazz.match.MatchClientRsp.MatchRankLogProto;

/**
 */
@Document(collection = "match_player_log_top")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_matchId", def = "{'matchId': 1}"),
		@CompoundIndex(name = "index_matchName", def = "{'matchName': 1}"),
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_accountName", def = "{'accountName': 1}"),
		@CompoundIndex(name = "index_gameId", def = "{'gameId': 1}")
		})
public class MatchPlayerTopLogModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	
	private long accountId;
	
	private int rank;
	private int rankType;
	private String accountName;
	private long gameId;
	private String gameName;
	
	private int matchType;

	private int matchId;
	
	private String matchName;
	
	private Date startTime;
	
	private boolean hasPrize;
	
	private byte[] prizes = new byte[0];
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
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

	public int getRankType() {
		return rankType;
	}

	public void setRankType(int rankType) {
		this.rankType = rankType;
	}

	public byte[] getPrizes() {
		return prizes;
	}

	public void setPrizes(byte[] prizes) {
		this.prizes = prizes;
	}

	public MatchRankLogProto encodeClient(){
		MatchRankLogProto.Builder b = MatchRankLogProto.newBuilder();
		b.setCreateTime(startTime.getTime());
		b.setMatchId(matchId);
		b.setMatchName(matchName);
		b.setPrize(ByteString.copyFrom(prizes));
		b.setRank(rank);
		return b.build();
	}

	public boolean isHasPrize() {
		return hasPrize;
	}

	public void setHasPrize(boolean hasPrize) {
		this.hasPrize = hasPrize;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
}
