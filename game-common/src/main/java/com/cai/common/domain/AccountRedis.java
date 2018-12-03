package com.cai.common.domain;

import java.io.Serializable;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * reids上的账号
 * @author run
 *
 */
public class AccountRedis implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long account_id;
	
	
	
	/**
	 * 当前代理房间列表 key=room_id
	 */
	private Map<Integer,PrxoyPlayerRoomModel> proxRoomMap = Maps.newConcurrentMap();

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public Map<Integer, PrxoyPlayerRoomModel> getProxRoomMap() {
		return proxRoomMap;
	}

	public void setProxRoomMap(Map<Integer, PrxoyPlayerRoomModel> proxRoomMap) {
		this.proxRoomMap = proxRoomMap;
	}
}
