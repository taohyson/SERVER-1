package com.cai.common.domain;

import java.io.Serializable;

/**
 * 玩家退出房间
 * @author run
 *
 */
public class RedisQuitRoomModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long account_id;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	
}
