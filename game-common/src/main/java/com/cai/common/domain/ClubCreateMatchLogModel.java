package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *
 * @author zhanglong date: 2018年7月3日 上午11:40:37
 */
@Document(collection = "club_create_match_log")
@CompoundIndexes({ @CompoundIndex(name = "index_id", def = "{'id': 1}"), @CompoundIndex(name = "index_clubId", def = "{'clubId': 1}"),
		@CompoundIndex(name = "index_creatorId", def = "{'creatorId': 1}"),
		@CompoundIndex(name = "index_startDate", def = "{'startDate': -1}", background = true), })
public class ClubCreateMatchLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 日志创建时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING, background = true)
	private Date create_time;

	/**
	 * 比赛id
	 */
	private long id;

	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 比赛名称
	 */
	private String matchName;

	/**
	 * 比赛类型 1 自主报名 2 管理员设置参赛
	 */
	private int matchType;

	/**
	 * 开始时间
	 */
	private Date startDate;

	/**
	 * 活动发起者
	 */
	private long creatorId;

	private String reward;

	private String gameName;

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public int getMatchType() {
		return matchType;
	}

	public void setMatchType(int matchType) {
		this.matchType = matchType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

}
