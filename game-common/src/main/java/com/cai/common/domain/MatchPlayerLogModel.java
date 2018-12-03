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
@Document(collection = "match_player_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_matchId", def = "{'matchId': 1}"),
		@CompoundIndex(name = "index_matchName", def = "{'matchName': 1}"),
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_accountName", def = "{'accountName': 1}"),
		@CompoundIndex(name = "index_gameId", def = "{'gameId': 1}"),
		@CompoundIndex(name = "index_unqueueId", def = "{'unqueueId': 1}"),
		@CompoundIndex(name = "gameId_0_startTime_-1", def = "{'gameId' : 0, 'startTime' : -1}", background=true)
		})
public class MatchPlayerLogModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	
	private long gameId;
	
	private String gameName;
	
	private int matchType;

	private int matchId;
	
	private String matchName;
	
	private long accountId;
	
	private String accountName;
	
	private int rank;
	
	private Date startTime;
	
	private Integer unqueueId;
	
	private boolean hasPrize;
	private byte[] prizes = new byte[0];
	
	private boolean hasRoundPrize;
	private byte[] roundPrizes = new byte[0];
	
	private String status;
	private String tip;
	private int riseStatus; //晋级状态   0淘汰  1替补  2晋级
	private int matchGameType; //0正常线上赛  1线下赛 2冲榜赛
	private int applyType; //报名方式 //-1未知  0免费  1金豆或金币  2门票 3 4密钥  5分享
	private boolean isTop; //是否冲榜赛
	private int winScore; //冲榜积分
	private int times; //冲榜倍数
	
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

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Integer getUnqueueId() {
		return unqueueId;
	}

	public void setUnqueueId(Integer unqueueId) {
		this.unqueueId = unqueueId;
	}

	public byte[] getPrizes() {
		return prizes;
	}

	public void setPrizes(byte[] prizes) {
		this.prizes = prizes;
	}

	public boolean isHasRoundPrize() {
		return hasRoundPrize;
	}

	public void setHasRoundPrize(boolean hasRoundPrize) {
		this.hasRoundPrize = hasRoundPrize;
	}

	public byte[] getRoundPrizes() {
		return roundPrizes;
	}

	public void setRoundPrizes(byte[] roundPrizes) {
		this.roundPrizes = roundPrizes;
	}

	public MatchRankLogProto encodeClient(){
		MatchRankLogProto.Builder b = MatchRankLogProto.newBuilder();
		b.setCreateTime(startTime.getTime());
		b.setMatchId(matchId);
		b.setMatchName(matchName);
		b.setPrize(ByteString.copyFrom(prizes));
		b.setRank(rank);
		b.setGameName(gameName);
		b.setScore(winScore);
		b.setTimes(times);
		return b.build();
	}

	public boolean isHasPrize() {
		return hasPrize;
	}

	public void setHasPrize(boolean hasPrize) {
		this.hasPrize = hasPrize;
	}

	public String getStatus() {
		return (status == null ? "":status);
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getRiseStatus() {
		return riseStatus;
	}

	public void setRiseStatus(int riseStatus) {
		this.riseStatus = riseStatus;
	}

	public int getMatchGameType() {
		return matchGameType;
	}

	public void setMatchGameType(int matchGameType) {
		this.matchGameType = matchGameType;
	}

	public int getApplyType() {
		return applyType;
	}

	public void setApplyType(int applyType) {
		this.applyType = applyType;
	}

	public boolean isTop() {
		return isTop;
	}

	public void setTop(boolean isTop) {
		this.isTop = isTop;
	}

	public int getWinScore() {
		return winScore;
	}

	public void setWinScore(int winScore) {
		this.winScore = winScore;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	
}
