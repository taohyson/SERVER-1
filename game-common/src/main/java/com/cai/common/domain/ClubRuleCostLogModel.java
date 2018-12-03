/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import com.cai.common.define.EClubEventType;
import com.google.common.collect.Maps;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 俱乐部包间消耗日志
 *
 * @author wu_hc date: 2018年4月4日 上午9:50:08 <br/>
 */
@Document(collection = "club_rule_cost_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_gameTypeIndex", def = "{'gameTypeIndex': -1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': -1}", background = true), })
public class ClubRuleCostLogModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING, expireAfterSeconds = 60 * 60 * 24 * 15, background = true)
	private Date create_time;

	/**
	 * 俱乐部id
	 */
	private int ruleId;

	/**
	 * 操作类型
	 */
	private int gameTypeIndex;

	/**
	 * 描述
	 */
	private String desc;

	/**
	 * 俱乐部人数
	 */
	private int clubMemberCount;

	/**
	 * 闲逸豆
	 */
	private int gold;

	/**
	 * 专属豆
	 */
	private int exclusiveGold;

	/**
	 * 游戏id
	 */
	private int gameId;

	/**
	 * 局数
	 */
	private int gameCount;

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public ClubRuleCostLogModel setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getClubMemberCount() {
		return clubMemberCount;
	}

	public ClubRuleCostLogModel setClubMemberCount(int clubMemberCount) {
		this.clubMemberCount = clubMemberCount;
		return this;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getExclusiveGold() {
		return exclusiveGold;
	}

	public void setExclusiveGold(int exclusiveGold) {
		this.exclusiveGold = exclusiveGold;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}
}
