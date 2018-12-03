package com.cai.common.domain.statistics;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 实时统计
 * @author chansonyan
 * 2018年6月5日
 */
@Document(collection = "statistics_real_time")
public class RealTimeStatistics implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	//注册用户数
	private int registerAccount;
	
	//活跃账号数
	private int activeAccount;
	
	//在线人数
	private int online;
	
	//普通付费账号
	private int normalPayAccount;
	
	//代理付费账号
	private int agentPayAccount;
	
	//普通付费金额
	private long normalPayAmount;
	
	//代理付费金额
	private long agentPayAmount;
	
	//闲逸豆产出
	private int goldOutput;
	
	//闲逸豆消耗
	private int goldConsume;

	//金币产出和消耗
	private int moneyOutput;
	
	private int moneyConsume;
	
	//实时统计的时间
	private Date date;
	
	//统计当天的开始时间参数
	private Date startDailyDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
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

	public int getGoldOutput() {
		return goldOutput;
	}

	public void setGoldOutput(int goldOutput) {
		this.goldOutput = goldOutput;
	}

	public int getGoldConsume() {
		return goldConsume;
	}

	public void setGoldConsume(int goldConsume) {
		this.goldConsume = goldConsume;
	}

	public int getMoneyOutput() {
		return moneyOutput;
	}

	public void setMoneyOutput(int moneyOutput) {
		this.moneyOutput = moneyOutput;
	}

	public int getMoneyConsume() {
		return moneyConsume;
	}

	public void setMoneyConsume(int moneyConsume) {
		this.moneyConsume = moneyConsume;
	}

	public Date getStartDailyDate() {
		return startDailyDate;
	}

	public void setStartDailyDate(Date startDailyDate) {
		this.startDailyDate = startDailyDate;
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
	
}
