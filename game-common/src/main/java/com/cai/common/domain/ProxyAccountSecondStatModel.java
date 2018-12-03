package com.cai.common.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 代理转卡相关统计二级
 * 
 * @author run
 *
 */
public class ProxyAccountSecondStatModel implements Serializable {

	private long account_id;

	/**
	 * 历史加卡
	 */
	private long history_gold;
	/**
	 * 总加卡
	 */
	private long gold_count;

	/**
	 * 后台加卡
	 */
	private long oss_add_gold;

	/**
	 * 赠关卡
	 */
	private long give_gold;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getGold_count() {
		return gold_count;
	}

	public void setGold_count(long gold_count) {
		this.gold_count = gold_count;
	}

	public long getOss_add_gold() {
		return oss_add_gold;
	}

	public void setOss_add_gold(long oss_add_gold) {
		this.oss_add_gold = oss_add_gold;
	}

	public long getGive_gold() {
		return give_gold;
	}

	public void setGive_gold(long give_gold) {
		this.give_gold = give_gold;
	}

	public long getHistory_gold() {
		return history_gold;
	}

	public void setHistory_gold(long history_gold) {
		this.history_gold = history_gold;
	}

}
