package com.cai.common.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 代理转卡相关统计
 * @author run
 *
 */
public class ProxyAccountStatModel implements Serializable{
	
	private long account_id;
	
	/**
	 * 昵称
	 */
	private String nick_name;
	
	/**
	 * 邀请人数
	 */
	private int invite_num;
	
	/**
	 * 总转卡数量
	 */
	private long give_gold_num;
	
	/**
	 * 二级代理列表
	 */
	private List<ProxyAccountSecondStatModel> proxyAccountSecondStatModelList;
	
	

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public int getInvite_num() {
		return invite_num;
	}

	public void setInvite_num(int invite_num) {
		this.invite_num = invite_num;
	}

	public long getGive_gold_num() {
		return give_gold_num;
	}

	public void setGive_gold_num(long give_gold_num) {
		this.give_gold_num = give_gold_num;
	}

	public List<ProxyAccountSecondStatModel> getProxyAccountSecondStatModelList() {
		return proxyAccountSecondStatModelList;
	}

	public void setProxyAccountSecondStatModelList(List<ProxyAccountSecondStatModel> proxyAccountSecondStatModelList) {
		this.proxyAccountSecondStatModelList = proxyAccountSecondStatModelList;
	}



	
	

}
