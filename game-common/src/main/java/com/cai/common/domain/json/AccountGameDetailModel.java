package com.cai.common.domain.json;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 *查看子游戏详情权限
 * @author tang 
 * date: 2018年1月16日 下午2:07:47 <br/>
 */
public class AccountGameDetailModel {
	
	private long accountId;
	private List<Integer> gameIds;
	private List<Integer> privilegeItems;
	
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public List<Integer> getGameIds() {
		return gameIds;
	}
	public void setGameIds(List<Integer> gameIds) {
		this.gameIds = gameIds;
	}
	public List<Integer> getPrivilegeItems() {
		return privilegeItems;
	}
	public void setPrivilegeItems(List<Integer> privilegeItems) {
		this.privilegeItems = privilegeItems;
	}
	
	
}
