/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author xwy
 *
 */
@Document(collection = "robot_log")
@CompoundIndexes({ @CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_groupId", def = "{'groupId': 1}"),
		@CompoundIndex(name = "index_create_time", def = "{'create_time': 1}"),
		@CompoundIndex(name = "index_v1", def = "{'v1': 1}")
		})
public class RobotModel implements Serializable{
	
	private String _id;
	private Date create_time;
	private Long account_id;
	private Integer center_id;
	private Integer proxy_id;
	private Integer logic_id;
	private String msg;
	private Long v1;
	private Long v2;

	private String groupId;
	private String groupName;
	
	private int game_type_index;
	private int game_round;
	private int game_rule_index;
	private int roomID;
	private String nick_names;
	

	public String getNick_names() {
		return nick_names;
	}

	public void setNick_names(String nick_names) {
		this.nick_names = nick_names;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
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

	public Integer getCenter_id() {
		return center_id;
	}

	public void setCenter_id(Integer center_id) {
		this.center_id = center_id;
	}

	public Integer getProxy_id() {
		return proxy_id;
	}

	public void setProxy_id(Integer proxy_id) {
		this.proxy_id = proxy_id;
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

	public Long getV1() {
		return v1;
	}

	public void setV1(Long v1) {
		this.v1 = v1;
	}

	public Long getV2() {
		return v2;
	}

	public void setV2(Long v2) {
		this.v2 = v2;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public int getGame_round() {
		return game_round;
	}

	public void setGame_round(int game_round) {
		this.game_round = game_round;
	}

	public int getGame_rule_index() {
		return game_rule_index;
	}

	public void setGame_rule_index(int game_rule_index) {
		this.game_rule_index = game_rule_index;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	
}
