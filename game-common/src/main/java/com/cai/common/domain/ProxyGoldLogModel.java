package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 代理转卡记录
 * 
 * @author run
 *
 */
@Document(collection = "proxy_gold_log")
public class ProxyGoldLogModel implements Serializable {

	/**
	 * 创建日期
	 */
	@Indexed
	private Date create_time;
	/**
	 * 玩家账号id
	 */
	@Indexed
	private Long account_id;
	/**
	 * 目标id
	 */
	@Indexed
	private Long target_account_id;

	/**
	 * 目标昵称
	 */
	private String target_nick_name;
	/**
	 * 赠送数量
	 */
	private Long give_num;
	

	/**
	 * 操作ip
	 */
	private String account_ip;

	/**
	 * 操作状态 0成功
	 */
	private Integer code;

	/**
	 * 在哪个游戏id
	 */
	private Integer game_id;

	/**
	 * 本机ip
	 */
	private String local_ip;

	/**
	 * 详细信息
	 */
	private String msg;
	
	
	/**
	 * 目标是否是代理账号 0=否 1=是
	 */
	private int target_proxy_account;
	
	
	/**
	 * 目标昵称
	 */
	private String target_head_url="";
	
	/**
	 * 我的剩余
	 */
	private long leftGold;

	public String getTarget_head_url() {
		return target_head_url;
	}

	public void setTarget_head_url(String target_head_url) {
		this.target_head_url = target_head_url;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Long getTarget_account_id() {
		return target_account_id;
	}

	public void setTarget_account_id(Long target_account_id) {
		this.target_account_id = target_account_id;
	}

	public Long getGive_num() {
		return give_num;
	}

	public void setGive_num(Long give_num) {
		this.give_num = give_num;
	}

	public String getAccount_ip() {
		return account_ip;
	}

	public void setAccount_ip(String account_ip) {
		this.account_ip = account_ip;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getGame_id() {
		return game_id;
	}

	public void setGame_id(Integer game_id) {
		this.game_id = game_id;
	}

	public String getLocal_ip() {
		return local_ip;
	}

	public void setLocal_ip(String local_ip) {
		this.local_ip = local_ip;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getTarget_nick_name() {
		return target_nick_name;
	}

	public void setTarget_nick_name(String target_nick_name) {
		this.target_nick_name = target_nick_name;
	}
	
	public long getLeftGold() {
		return leftGold;
	}

	public void setLeftGold(long leftGold) {
		this.leftGold = leftGold;
	}

	public int getTarget_proxy_account() {
		return target_proxy_account;
	}

	public void setTarget_proxy_account(int target_proxy_account) {
		this.target_proxy_account = target_proxy_account;
	}

}
