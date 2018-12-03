package com.cai.common.domain.common;

import java.io.Serializable;
import java.util.Comparator;

/**
 * 
 *
 * @author tang 2018/11/22 18:41
 */
public class SubProxyModel implements Comparator<SubProxyModel>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long accountId;
	private int level;// 1钻石，2黄金，3白银，4普通代理
	private String nick;// 昵称

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public int compare(SubProxyModel o1, SubProxyModel o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getAccountId() - o2.getAccountId());
	}

}
