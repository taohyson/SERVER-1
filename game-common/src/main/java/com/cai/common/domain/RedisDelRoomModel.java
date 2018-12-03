package com.cai.common.domain;

import java.io.Serializable;

/**
 * 删除房间
 * @author run
 *
 */
public class RedisDelRoomModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int room_id;

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	
	
	
}
