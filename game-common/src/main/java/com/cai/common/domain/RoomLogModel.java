/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "room_log")
@CompoundIndexes(
		{ 
		@CompoundIndex(name = "index_account_id", def = "{'account_id': 1}", background = true),
		@CompoundIndex(name = "index_roomId", def = "{'roomId': 1}", background = true),
		@CompoundIndex(name = "index_logic_id", def = "{'logic_id': 1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': 1}", background = true)
		 })
public class RoomLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Date create_time;
	@Indexed
	private Long account_id;
	private Integer logic_id;
	private String msg;

	private Integer appId;

	private Integer gameTypeIndex;

	private Integer roomId;
	
	private Integer clubId;

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public Integer getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(Integer gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Integer getLogic_id() {
		return logic_id;
	}

	public void setLogic_id(Integer logic_id) {
		this.logic_id = logic_id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}


}
