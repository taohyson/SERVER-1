/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 
 *
 * @author wu_hc date: 2018年1月23日 下午6:01:58 <br/>
 */
@Document(collection = "club_activity_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_id", def = "{'id': 1}"), @CompoundIndex(name = "index_clubId", def = "{'clubId': 1}"),
		@CompoundIndex(name = "index_creatorId", def = "{'creatorId': 1}"),
		@CompoundIndex(name = "index_activityStartDate", def = "{'activityStartDate': -1}", background = true),
		@CompoundIndex(name = "index_activityEndDate", def = "{'activityEndDate': -1}", background = true), })
public class ClubActivityLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 日志创建时间
	 */
	private Date create_time;

	/**
	 * 大赢家次数排行榜序列化 @see com.cai.common.domain.RankModel
	 */
	private String winRankJson;

	/**
	 * 局数次数排行榜序列化see com.cai.common.domain.RankModel
	 */
	private String timeRankJson;

	/**
	 * 活动id
	 */
	private long id;

	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 活动名称
	 */
	private String activityName;

	/**
	 * 活动类型
	 */
	private int activityType;

	/**
	 * 开始时间
	 */
	private Date activityStartDate;

	/**
	 * 结束时间
	 */
	private Date activityEndDate;

	/**
	 * 活动发起者
	 */
	private long creatorId;

	/**
	 * 状态
	 */
	private byte status;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 代理服id
	 */
	private int proxyId;

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

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public int getActivityType() {
		return activityType;
	}

	public void setActivityType(int activityType) {
		this.activityType = activityType;
	}

	public Date getActivityStartDate() {
		return activityStartDate;
	}

	public void setActivityStartDate(Date activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	public Date getActivityEndDate() {
		return activityEndDate;
	}

	public void setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
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

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getWinRankJson() {
		return winRankJson;
	}

	public void setWinRankJson(String winRankJson) {
		this.winRankJson = winRankJson;
	}

	public String getTimeRankJson() {
		return timeRankJson;
	}

	public void setTimeRankJson(String timeRankJson) {
		this.timeRankJson = timeRankJson;
	}

	public int getProxyId() {
		return proxyId;
	}

	public void setProxyId(int proxyId) {
		this.proxyId = proxyId;
	}

}
