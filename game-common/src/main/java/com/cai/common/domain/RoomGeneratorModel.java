/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 
 */
public class RoomGeneratorModel extends DBBaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int room_id_type;

	private int room_index;

	private String roomd_ids;


	public int getRoom_id_type() {
		return room_id_type;
	}

	public void setRoom_id_type(int room_id_type) {
		this.room_id_type = room_id_type;
	}
	
	public int getRoom_index() {
		return room_index;
	}

	public void setRoom_index(int room_index) {
		this.room_index = room_index;
	}

	public String getRoomd_ids() {
		return roomd_ids;
	}

	public void setRoomd_ids(String roomd_ids) {
		this.roomd_ids = roomd_ids;
	}
}
