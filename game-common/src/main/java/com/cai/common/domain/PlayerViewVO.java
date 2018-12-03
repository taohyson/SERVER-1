/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 查看玩家数据，和PlayerViewResponse对应
 * 
 * @author wu_hc
 */
public final class PlayerViewVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 帐号id
	 */
	private long accountId;

	/**
	 * 头像
	 */
	private String head;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 闲逸豆
	 */
	private long gold;

	/**
	 * 金币
	 */
	private long money;

	/**
	 * 签名
	 */
	private String signature;

	/**
	 * 性别1男2女
	 */
	private int sex;

	/**
	 * vip等级
	 */
	private int vipLv;

	private Date create_time;

	private String phoneNum;

	private Date coinPlayTime;
	private boolean isPayAccount;

	private Date firstJoinClubTime;
	private boolean isFirstJoinClub;
	private long recommendId;
	private String honor_msg;

	/**
	 * 是否代理 0-否 1-是
	 */
	private int isAgent;

	/**
	 * 俱乐部身份(1-创建人 2-管理员 3-创建人&管理员)
	 */
	private int clubIdentity;

	/**
	 * 上次充值时间
	 */
	private Date lastPayTime;

	/**
	 * 上次参与比赛时间
	 */
	private Date lastMatchTime;

	/**
	 * 推广员级别
	 */
	private int recommentLevel;

	/**
	 * 禁止亲友圈邀请
	 */
	private boolean banClubInvite;

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

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getVipLv() {
		return vipLv;
	}

	public void setVipLv(int vipLv) {
		this.vipLv = vipLv;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getCoinPlayTime() {
		return coinPlayTime;
	}

	public void setCoinPlayTime(Date coinPlayTime) {
		this.coinPlayTime = coinPlayTime;
	}

	public boolean isPayAccount() {
		return isPayAccount;
	}

	public void setPayAccount(boolean isPayAccount) {
		this.isPayAccount = isPayAccount;
	}

	public Date getFirstJoinClubTime() {
		return firstJoinClubTime;
	}

	public void setFirstJoinClubTime(Date firstJoinClubTime) {
		this.firstJoinClubTime = firstJoinClubTime;
	}

	public boolean isFirstJoinClub() {
		return isFirstJoinClub;
	}

	public void setFirstJoinClub(boolean isFirstJoinClub) {
		this.isFirstJoinClub = isFirstJoinClub;
	}

	public long getRecommendId() {
		return recommendId;
	}

	public void setRecommendId(long recommendId) {
		this.recommendId = recommendId;
	}

	public String getHonor_msg() {
		return honor_msg;
	}

	public void setHonor_msg(String honor_msg) {
		this.honor_msg = honor_msg;
	}

	public int getIsAgent() {
		return isAgent;
	}

	public void setIsAgent(int isAgent) {
		this.isAgent = isAgent;
	}

	public int getClubIdentity() {
		return clubIdentity;
	}

	public void setClubIdentity(int clubIdentity) {
		this.clubIdentity = clubIdentity;
	}

	public Date getLastPayTime() {
		return lastPayTime;
	}

	public void setLastPayTime(Date lastPayTime) {
		this.lastPayTime = lastPayTime;
	}

	public Date getLastMatchTime() {
		return lastMatchTime;
	}

	public void setLastMatchTime(Date lastMatchTime) {
		this.lastMatchTime = lastMatchTime;
	}

	public int getRecommentLevel() {
		return recommentLevel;
	}

	public void setRecommentLevel(int recommentLevel) {
		this.recommentLevel = recommentLevel;
	}

	public boolean isBanClubInvite() {
		return banClubInvite;
	}

	public void setBanClubInvite(boolean banClubInvite) {
		this.banClubInvite = banClubInvite;
	}

	@Override
	public String toString() {
		return "PlayerViewVO [accountId=" + accountId + ", head=" + head + ", nickName=" + nickName + ", gold=" + gold + ", money=" + money
				+ ", signature=" + signature + ", sex=" + sex + ", vipLv=" + vipLv + "]";
	}

}
