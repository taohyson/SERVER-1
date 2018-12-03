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
 * @author zhanglong date: 2018年4月19日 下午4:30:30
 */
@Document(collection = "card_secret_use_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_cardType", def = "{'cardType': 1}", background = true),
		@CompoundIndex(name = "index_cardMoney", def = "{'cardMoney': 1}", background = true),
		@CompoundIndex(name = "index_cardSecret", def = "{'cardSecret': 1}", background = true)})
public class CardSecretUseLogModel implements Serializable {

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
	 * 卡密类型
	 */
	private int cardType;
	/**
	 * 卡密金额
	 */
	private int cardMoney;
	/**
	 * 卡密
	 */
	private String cardSecret;

	/**
	 * 使用状态(1未使用2已使用)
	 */
	private int state;
	/**
	 * 手机号
	 */
	private String phone;

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

	public int getCardType() {
		return cardType;
	}

	public void setCardType(int cardType) {
		this.cardType = cardType;
	}

	public int getCardMoney() {
		return cardMoney;
	}

	public void setCardMoney(int cardMoney) {
		this.cardMoney = cardMoney;
	}

	public String getCardSecret() {
		return cardSecret;
	}

	public void setCardSecret(String cardSecret) {
		this.cardSecret = cardSecret;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
