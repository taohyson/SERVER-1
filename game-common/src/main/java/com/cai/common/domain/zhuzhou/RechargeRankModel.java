package com.cai.common.domain.zhuzhou;

/**
 * 充值排行榜
 * 
 *
 * @author Tang date: 2018年9月25日 下午4:53:38 <br/>
 */
public class RechargeRankModel implements Comparable<RechargeRankModel> {
	private long accountId;
	private String nick;
	private String icon;
	private long rechargeMoney;
	private long receiveMoney;

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

	public long getRechargeMoney() {
		return rechargeMoney;
	}

	public void setRechargeMoney(long rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}

	public long getReceiveMoney() {
		return receiveMoney;
	}

	public void setReceiveMoney(long receiveMoney) {
		this.receiveMoney = receiveMoney;
	}

	@Override
	public int compareTo(RechargeRankModel o) {
		return rechargeMoney - o.getRechargeMoney() >= 0 ? -1 : 1;
	}

}
