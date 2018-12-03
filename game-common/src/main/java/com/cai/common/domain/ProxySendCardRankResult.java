package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 代理玩家转卡排行
 * 
 * @author run
 *
 */
public class ProxySendCardRankResult implements Serializable {
	private Long account_id;
	private Long give_num;
	
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Long getGive_num() {
		return give_num;
	}
	public void setGive_num(Long give_num) {
		this.give_num = give_num;
	}
	
	
}
