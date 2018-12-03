package com.cai.common.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author Administrator
 *
 */
@Document(collection = "recommend_active_log")
// 活动中推荐新用户相关统计
public class RecommendActiveModel {
	/**
	 * 统计创建时间
	 */
	@Indexed
	private Date create_time;
	/**
	 * 推荐者玩家帐号ID
	 */
	private Long accountId;
	/**
	 * 玩家帐号id
	 */
	private Long targetAccountId;
	/**
	 * 微信昵称
	 */
	private String nickname;
	
	/**
	 * 消耗的房卡数
	 */
	private Long consumeGoldNum;
	/**
	 * 活动类型，1端午红包活动
	 */
	private Integer type;
	/**
	 * 注册时间
	 */
	private Date createTime;
	/**
	 * ip地址
	 */
	private String ip;
	
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Long getTargetAccountId() {
		return targetAccountId;
	}
	public void setTargetAccountId(Long targetAccountId) {
		this.targetAccountId = targetAccountId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Long getConsumeGoldNum() {
		return consumeGoldNum;
	}
	public void setConsumeGoldNum(Long consumeGoldNum) {
		this.consumeGoldNum = consumeGoldNum;
	}

	
}
