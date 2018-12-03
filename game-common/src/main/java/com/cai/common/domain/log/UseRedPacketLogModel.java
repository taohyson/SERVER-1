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
 * @author zhanglong date: 2018年4月20日 上午11:08:48
 */
@Document(collection = "use_redpacket_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_orderId", def = "{'orderId': 1}", background = true),
		@CompoundIndex(name = "index_itemId", def = "{'itemId': 1}", background = true),
		@CompoundIndex(name = "index_state", def = "{'state': 1}", background = true),
		@CompoundIndex(name = "index_finishDate", def = "{'finishDate': 1}", background = true)})
public class UseRedPacketLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING)
	private Date create_time;
	/**
	 * 玩家Id
	 */
	@Indexed
	private long accountId;

	/**
	 * 订单号
	 */
	private String orderId;
	/**
	 * 物品Id
	 */
	private int itemId;
	/**
	 * 红包金额
	 */
	private int money;
	/**
	 * 红包发放状态(1-未发放 2-已发放)
	 */
	private int state;
	
	/**
	 * 订单真正完成时间
	 */
	private Date finishDate;
	
	//辅助字段
	private String bagItemName;

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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getBagItemName() {
		return bagItemName;
	}

	public void setBagItemName(String bagItemName) {
		this.bagItemName = bagItemName;
	}
	
}
