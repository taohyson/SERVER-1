package com.cai.common.domain.log;

import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 * <p>
 * 亲友圈福卡抽奖记录
 *
 * @author zhanglong 2018/9/14 15:56
 */
@Document(collection = "club_welfare_lottery_msg_log")
@CompoundIndexes({ @CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_gameTypeIndex", def = "{'gameTypeIndex': 1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': 1}", background = true) })
public class ClubWelfareLotteryMsgLogModel extends BaseLogModel {
	private static final long serialVersionUID = 3079202592792055070L;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING, expireAfterSeconds = 60 * 60 * 24 * 15, background = true)
	private Date create_time;

	private long accountId;
	private String nickname;
	private int gameTypeIndex;
	private String subName;
	private int clubId;
	private int costNum;
	private int awardId;
	private int awardNum;

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public int getCostNum() {
		return costNum;
	}

	public void setCostNum(int costNum) {
		this.costNum = costNum;
	}

	public int getAwardId() {
		return awardId;
	}

	public void setAwardId(int awardId) {
		this.awardId = awardId;
	}

	public int getAwardNum() {
		return awardNum;
	}

	public void setAwardNum(int awardNum) {
		this.awardNum = awardNum;
	}
}
