package com.cai.common.domain.zhuzhou;

import java.util.Date;

public class IndexModel {
	private long accountId;
	private String nick;
	private String icon;
	private long yesterdayIncome;// 昨日收益
	private long remainIncome;// 可提现金额
	private long historyIncome;// 总收益
	private int yesterdayBind;// 昨日绑定人数
	private int yesterdayRecharge;// 昨日充值人数
	private int totalBind;// 总绑定人数
	private Date updateTime;
	private long historyDrawCash;// 总提现金额

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public long getYesterdayIncome() {
		return yesterdayIncome;
	}

	public void setYesterdayIncome(long yesterdayIncome) {
		this.yesterdayIncome = yesterdayIncome;
	}

	public long getRemainIncome() {
		return remainIncome;
	}

	public void setRemainIncome(long remainIncome) {
		this.remainIncome = remainIncome;
	}

	public long getHistoryIncome() {
		return historyIncome;
	}

	public void setHistoryIncome(long historyIncome) {
		this.historyIncome = historyIncome;
	}

	public int getYesterdayBind() {
		return yesterdayBind;
	}

	public void setYesterdayBind(int yesterdayBind) {
		this.yesterdayBind = yesterdayBind;
	}

	public int getYesterdayRecharge() {
		return yesterdayRecharge;
	}

	public void setYesterdayRecharge(int yesterdayRecharge) {
		this.yesterdayRecharge = yesterdayRecharge;
	}

	public int getTotalBind() {
		return totalBind;
	}

	public void setTotalBind(int totalBind) {
		this.totalBind = totalBind;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public long getHistoryDrawCash() {
		return historyDrawCash;
	}

	public void setHistoryDrawCash(long historyDrawCash) {
		this.historyDrawCash = historyDrawCash;
	}
}
