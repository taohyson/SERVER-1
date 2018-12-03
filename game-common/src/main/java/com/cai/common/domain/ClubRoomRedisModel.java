package com.cai.common.domain;

import java.io.Serializable;

/**
 * 存放在redis上的房间
 * 
 * @author run
 *
 */
public class ClubRoomRedisModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 房间号
	 */
	private int room_id;

	/**
	 * 房间索引
	 */

	private int index;

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
