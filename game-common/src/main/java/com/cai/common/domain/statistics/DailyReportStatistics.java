package com.cai.common.domain.statistics;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 日报统计
 * 
 * @author chansonyan 2018年6月20日
 */
@Document(collection = "statistics_daily_report")
public class DailyReportStatistics implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	// 注册用户数
	private int registerAccount;

	// 活跃账号数
	private int activeAccount;

	// 普通付费账号
	private int normalPayAccount;

	// 代理付费账号
	private int agentPayAccount;

	// 普通付费金额
	private long normalPayAmount;

	// 代理付费金额
	private long agentPayAmount;

	// 付费率
	private double payRate;

	private double normalArppu;

	private double agentArppu;

	// 比赛场总场次数
	private int matchTotal;

	// 金币场牌局总数
	private int coinTotal;

	// 俱乐部牌局总数
	private int clubTotal;

	private int normalTotal;
	// 实时统计的时间
	private Date date;

	private double matchAveBrand;// 用户日均比赛场次
	private double coinAveBrand;// 用户日均金币场次
	private double clubAveBrand;// 亲友圈日均
	private double normalAveBrand;// 普通房间日均
	private long userAveOnlineTime;// 用户平均在线时长
	private int newUserCount;// 参与牌局的新用户数
	private int newUserBrand;// 新用户牌局数
	private double newUserAveBrand;// 新增用户平均牌局数

	public int getNewUserCount() {
		return newUserCount;
	}

	public void setNewUserCount(int newUserCount) {
		this.newUserCount = newUserCount;
	}

	public int getNewUserBrand() {
		return newUserBrand;
	}

	public void setNewUserBrand(int newUserBrand) {
		this.newUserBrand = newUserBrand;
	}

	public double getNewUserAveBrand() {
		return newUserAveBrand;
	}

	public void setNewUserAveBrand(double newUserAveBrand) {
		this.newUserAveBrand = newUserAveBrand;
	}

	public double getMatchAveBrand() {
		return matchAveBrand;
	}

	public void setMatchAveBrand(double matchAveBrand) {
		this.matchAveBrand = matchAveBrand;
	}

	public double getCoinAveBrand() {
		return coinAveBrand;
	}

	public void setCoinAveBrand(double coinAveBrand) {
		this.coinAveBrand = coinAveBrand;
	}

	public double getClubAveBrand() {
		return clubAveBrand;
	}

	public void setClubAveBrand(double clubAveBrand) {
		this.clubAveBrand = clubAveBrand;
	}

	public double getNormalAveBrand() {
		return normalAveBrand;
	}

	public void setNormalAveBrand(double normalAveBrand) {
		this.normalAveBrand = normalAveBrand;
	}

	public long getUserAveOnlineTime() {
		return userAveOnlineTime;
	}

	public void setUserAveOnlineTime(long userAveOnlineTime) {
		this.userAveOnlineTime = userAveOnlineTime;
	}

	public int getNormalTotal() {
		return normalTotal;
	}

	public void setNormalTotal(int normalTotal) {
		this.normalTotal = normalTotal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRegisterAccount() {
		return registerAccount;
	}

	public void setRegisterAccount(int registerAccount) {
		this.registerAccount = registerAccount;
	}

	public int getActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(int activeAccount) {
		this.activeAccount = activeAccount;
	}

	public int getNormalPayAccount() {
		return normalPayAccount;
	}

	public void setNormalPayAccount(int normalPayAccount) {
		this.normalPayAccount = normalPayAccount;
	}

	public int getAgentPayAccount() {
		return agentPayAccount;
	}

	public void setAgentPayAccount(int agentPayAccount) {
		this.agentPayAccount = agentPayAccount;
	}

	public long getNormalPayAmount() {
		return normalPayAmount;
	}

	public void setNormalPayAmount(long normalPayAmount) {
		this.normalPayAmount = normalPayAmount;
	}

	public long getAgentPayAmount() {
		return agentPayAmount;
	}

	public void setAgentPayAmount(long agentPayAmount) {
		this.agentPayAmount = agentPayAmount;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getNormalArppu() {
		return normalArppu;
	}

	public void setNormalArppu(double normalArppu) {
		this.normalArppu = normalArppu;
	}

	public double getAgentArppu() {
		return agentArppu;
	}

	public void setAgentArppu(double agentArppu) {
		this.agentArppu = agentArppu;
	}

	public int getMatchTotal() {
		return matchTotal;
	}

	public void setMatchTotal(int matchTotal) {
		this.matchTotal = matchTotal;
	}

	public int getCoinTotal() {
		return coinTotal;
	}

	public void setCoinTotal(int coinTotal) {
		this.coinTotal = coinTotal;
	}

	public int getClubTotal() {
		return clubTotal;
	}

	public void setClubTotal(int clubTotal) {
		this.clubTotal = clubTotal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
