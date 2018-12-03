/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "card_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account", def = "{'account_id': 1}"),
		@CompoundIndex(name = "index_log_type", def = "{'log_type': 1}"),
		@CompoundIndex(name = "index_room_id", def = "{'v3': 1}", background = true), })
public class CardLogModel implements Serializable {

	private static final long serialVersionUID = -1196191607351928564L;

	private Date create_time;
	/**
	 * 帐号ID
	 */
	private Long account_id;

	/**
	 * 参考ECardType 
	 */
	private String log_type;

	/**
	 * 房间ID
	 */
	private int room_id;

	private String msg;
	private int v1;
	private Long v2;
	
	
	private int game_id;

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
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

	public String getLog_type() {
		return log_type;
	}

	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getV1() {
		return v1;
	}

	public void setV1(int v12) {
		this.v1 = v12;
	}

	public Long getV2() {
		return v2;
	}

	public void setV2(Long v2) {
		this.v2 = v2;
	}

}
