package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 代理卡消费记录
 * 
 * @author run
 *
 */
@Document(collection = "proxy_consume_tj")
public class ProxyConsumeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7027037558394473482L;
	/**
	 * 创建日期
	 */
	@Indexed
	private int create_time;
	/**
	 * 玩家账号id
	 */
	@Indexed
	private Long account_id;

	/**
	 * 目标昵称
	 */
	private String nick_name;
	/**
	 * 转卡数量
	 */
	private Long give_num;
	/**
	 * 代理代开房卡数量
	 */
	private Long proxy_open_num;
	
	/**
	 * 剩余房卡
	 */
	private long leftGold;
	/**
	 * 推荐人id
	 */
	private long recommend_id;

	

	public long getRecommend_id() {
		return recommend_id;
	}

	public void setRecommend_id(long recommend_id) {
		this.recommend_id = recommend_id;
	}

	public int getCreate_time() {
		return create_time;
	}

	public void setCreate_time(int create_time) {
		this.create_time = create_time;
	}

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


	public long getLeftGold() {
		return leftGold;
	}

	public void setLeftGold(long leftGold) {
		this.leftGold = leftGold;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public Long getProxy_open_num() {
		return proxy_open_num;
	}

	public void setProxy_open_num(Long proxy_open_num) {
		this.proxy_open_num = proxy_open_num;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
