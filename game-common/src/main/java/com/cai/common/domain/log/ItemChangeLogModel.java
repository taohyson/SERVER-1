package com.cai.common.domain.log;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *
 * @author zhanglong date: 2018年6月7日 上午10:32:22
 */
@Document(collection = "item_change_log")
@CompoundIndexes({ @CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_changeType", def = "{'changeType': 1}"),
		@CompoundIndex(name = "index_opeType", def = "{'opeType': 1}"),
		@CompoundIndex(name = "index_itemId", def = "{'itemId': 1}") })
public class ItemChangeLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING, expireAfterSeconds = 60 * 60 * 24 * 14, background = true)
	private Date create_time;
	/**
	 * 玩家Id
	 */
	@Indexed
	private long accountId;

	/**
	 * 变动类型 (0-默认 1-后台删除)
	 */
	private int changeType;

	/**
	 * 1-增加 2-减少
	 */
	private int opeType;

	/**
	 * 物品Id
	 */
	private int itemId;
	/**
	 * 物品数量
	 */
	private int itemNum;

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

	public int getChangeType() {
		return changeType;
	}

	public void setChangeType(int changeType) {
		this.changeType = changeType;
	}

	public int getOpeType() {
		return opeType;
	}

	public void setOpeType(int opeType) {
		this.opeType = opeType;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

}
