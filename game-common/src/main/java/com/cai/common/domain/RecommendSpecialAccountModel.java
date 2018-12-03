package com.cai.common.domain;
/**
 * 推广员特殊账号处理
 * @author tang
 *
 */
public class RecommendSpecialAccountModel {
	
	private int id;
	private long account_id; //特权id
	private long target_account_id; //能查看的id
	private String exattr;
	
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getTarget_account_id() {
		return target_account_id;
	}
	public void setTarget_account_id(long target_account_id) {
		this.target_account_id = target_account_id;
	}
	public String getExattr() {
		return exattr;
	}
	public void setExattr(String exattr) {
		this.exattr = exattr;
	}
	
	
}
