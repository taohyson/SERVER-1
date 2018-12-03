package com.cai.common.domain.statistics;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 玩家每日牌局总数统计
 * 
 * @author chansonyan 2018年6月26日
 */
@Document(collection = "statistics_account_dailybrand")
@CompoundIndexes({ @CompoundIndex(name = "index_account_id", def = "{'account_id': 1}", background = true),
		@CompoundIndex(name = "index_notes_date", def = "{'notes_date': 1}", background = true),
		@CompoundIndex(name = "index_type", def = "{'type': 1}", background = true) })
public class AccountDailyBrandStatistics implements Serializable {

	private static final long serialVersionUID = 1L;
	private long account_id;

	private int notes_date;

	// 统计的牌局类型
	private int type;

	// 统计的牌局总数(按天)
	private int count;

	// 注册时间
	private Date registerTime;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public int getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(int notes_date) {
		this.notes_date = notes_date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

}
