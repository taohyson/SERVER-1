/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.cai.common.constant.Symbol;
import com.cai.common.util.ClubUitl;
import com.cai.common.util.StringUtil;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import protobuf.clazz.ClubMsgProto.ClubMatchRecordInfo;
import protobuf.clazz.Common.CommonII;

/**
 * 
 * 
 *
 * @author wu_hc date: 2018年6月20日 上午11:09:42 <br/>
 */
@Document(collection = "club_match_log")
@CompoundIndexes({ @CompoundIndex(name = "index_id", def = "{'id': 1}"), @CompoundIndex(name = "index_clubId", def = "{'clubId': 1}"),
		@CompoundIndex(name = "index_creatorId", def = "{'creatorId': 1}"),
		@CompoundIndex(name = "index_startDate", def = "{'startDate': -1}", background = true),
		@CompoundIndex(name = "index_endDate", def = "{'endDate': -1}", background = true), })
public class ClubMatchLogModel implements Serializable {

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
	 * 排行榜序列化 @see com.cai.common.domain.RankModel
	 */
	private String rankJson;

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
	 * 结束时间
	 */
	private Date endDate;

	/**
	 * 比赛创建者
	 */
	private long creatorId;

	/**
	 * 状态 2-正常结束 -2-开赛失败
	 */
	private byte status;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 报名的成员列表
	 */
	private String enrollAccountIds;

	private String reward;

	private String gameName;

	private String subName;
	
	/**
	 * 扣豆类型 0-闲逸豆 1-专属豆
	 */
	private int costType;
	
	/**
	 * 扣豆数量
	 */
	private int costGold;

	/**
	 * 开赛类型 0-定时开赛 1-满人开赛
	 */
	private int openType;

	/**
	 * 报名成员列表
	 */
	@Transient
	private Set<Long> enrollAccountIdList;

	/**
	 * 奖励数量
	 */
	@Transient
	private List<Integer> rewards = Lists.newArrayList();

	/**
	 * 排行榜
	 */
	@Transient
	private List<RankModel> rankList = Lists.newArrayList();

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getRankJson() {
		return rankJson;
	}

	public void setRankJson(String rankJson) {
		this.rankJson = rankJson;
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

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEnrollAccountIds() {
		return enrollAccountIds;
	}

	public void setEnrollAccountIds(String enrollAccountIds) {
		this.enrollAccountIds = enrollAccountIds;
	}

	public final ClubMatchRecordInfo.Builder toBuilder() {
		ClubMatchRecordInfo.Builder builder = ClubMatchRecordInfo.newBuilder();
		builder.setMatchId(this.id);
		builder.setClubId(this.clubId);
		if (this.matchName != null) {
			builder.setMatchName(this.matchName);
		}
		builder.setMatchType(this.matchType);
		if (this.startDate != null) {
			builder.setStartDate((int) (this.getStartDate().getTime() / 1000L));
		}
		if (this.endDate != null) {
			builder.setEndDate((int) (this.getEndDate().getTime() / 1000L));
		}
		// 奖励
		if (this.rewards.size() <= 0) {
			parseReward();
		}
		int i = 1;
		for (Integer v : rewards) {
			CommonII.Builder tmp = CommonII.newBuilder();
			tmp.setK(i++);
			tmp.setV(v);
			builder.addRewards(tmp);
		}

		// 排行
		if (this.rankList.size() <= 0) {
			parseRank();
		}
		builder.addAllRankList(ClubUitl.toRankModelListProto(this.rankList));

		if (this.gameName != null) {
			builder.setGameName(this.gameName);
		}
		if (this.subName != null) {
			builder.setSubName(this.subName);
		}

		return builder;
	}

	public Set<Long> getEnrollAccountIdList() {
		return enrollAccountIdList;
	}

	public void setEnrollAccountIdList(Set<Long> enrollAccountIdList) {
		this.enrollAccountIdList = enrollAccountIdList;
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

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getCostType() {
		return costType;
	}

	public void setCostType(int costType) {
		this.costType = costType;
	}

	public int getCostGold() {
		return costGold;
	}

	public void setCostGold(int costGold) {
		this.costGold = costGold;
	}

	/**
	 * 参赛成员数据解析
	 */
	public void parseEnrollPlayer() {
		if (!Strings.isNullOrEmpty(this.enrollAccountIds)) {
			try {
				List<Long> enrollAccountIds_ = JSON.parseArray(this.enrollAccountIds, Long.class);
				enrollAccountIdList = Sets.newHashSet();
				enrollAccountIdList.addAll(enrollAccountIds_);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 解析奖励
	 */
	public void parseReward() {
		if (!Strings.isNullOrEmpty(this.reward)) {
			try {
				List<Integer> reward_ = StringUtil.toIntList(this.reward, Symbol.COMMA);
				this.rewards.clear();
				this.rewards.addAll(reward_);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 解析排行榜
	 */
	public void parseRank() {
		if (!Strings.isNullOrEmpty(this.rankJson)) {
			List<RankModel> rank_ = ClubUitl.rankJsonToList(this.rankJson);
			this.rankList.clear();
			this.rankList.addAll(rank_);
		}
	}

	public int getOpenType() {
		return openType;
	}

	public void setOpenType(int openType) {
		this.openType = openType;
	}
}
