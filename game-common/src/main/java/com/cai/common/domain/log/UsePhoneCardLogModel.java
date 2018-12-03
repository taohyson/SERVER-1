package com.cai.common.domain.log;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/22 10:19
 */
@Document(collection = "use_phone_card_log")
@CompoundIndexes({ @CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_orderId", def = "{'orderId': 1}", background = true),
		@CompoundIndex(name = "index_itemId", def = "{'itemId': 1}", background = true),
		@CompoundIndex(name = "index_state", def = "{'state': 1}", background = true),
		@CompoundIndex(name = "index_finishDate", def = "{'finishDate': 1}", background = true) })
public class UsePhoneCardLogModel implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING) private Date create_time;

	/**
	 * 玩家Id
	 */
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
	 * 话费金额(面额)
	 */
	private int money;

	/**
	 * 充值金额
	 */
	private String chargeMoney;

	/**
	 * 充值平台订单号
	 */
	private String tranId;

	/**
	 * 订单状态(-1.发起充值 0.提交成功 1.充值中 2.充值成功 3.充值失败)
	 */
	private int resultNo;

	/**
	 * 订单真正完成时间
	 */
	private Date finishDate;

	/**
	 * 返回码
	 */
	private int status;

	/**
	 * 返回信息
	 */
	private String errMsg;

	private int userId;

	private String key;

	private String phone;

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

	public String getChargeMoney() {
		return chargeMoney;
	}

	public void setChargeMoney(String chargeMoney) {
		this.chargeMoney = chargeMoney;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public int getResultNo() {
		return resultNo;
	}

	public void setResultNo(int resultNo) {
		this.resultNo = resultNo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBagItemName() {
		return bagItemName;
	}

	public void setBagItemName(String bagItemName) {
		this.bagItemName = bagItemName;
	}
}
