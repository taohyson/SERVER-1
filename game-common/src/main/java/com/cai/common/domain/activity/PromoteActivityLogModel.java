package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 株洲推广员活动奖品领取记录
 *
 * @author tang date: 2018年8月21日 <br/>
 */
@Document(collection = "zz_promote_reward_log")
@CompoundIndexes({ @CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_create_time", def = "{'create_time': 1}") })
public class PromoteActivityLogModel implements Serializable {
	private static final long serialVersionUID = 1L;
	@Indexed
	private String _id;
	private long accountId;
	private Date create_time;
	private String itemIds;
	private int gold;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getItemIds() {
		return itemIds;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

}
