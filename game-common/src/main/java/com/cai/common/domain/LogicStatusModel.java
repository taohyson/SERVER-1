package com.cai.common.domain;

import java.io.Serializable;

/**
 * 逻辑服状态
 * 
 * @author run
 *
 */
public class LogicStatusModel implements Serializable {

	private int logic_game_id;

	/**
	 * 在线玩家数量
	 */
	private int online_playe_num;

	/**
	 * socket链接数
	 */
	private int socket_connect_num;

	/**
	 * 收到消息的总数
	 */
	private long msg_receive_count;

	/**
	 * 已处理消息数量
	 */
	private long msg_completed_count;

	/**
	 * 当前消息队列中的消息数量
	 */
	private long msg_queue_count;

	/**
	 * 当前逻辑服的缓存房间数量
	 */
	private int room_num;

	public int getLogic_game_id() {
		return logic_game_id;
	}

	public void setLogic_game_id(int logic_game_id) {
		this.logic_game_id = logic_game_id;
	}

	public int getOnline_playe_num() {
		return online_playe_num;
	}

	public void setOnline_playe_num(int online_playe_num) {
		this.online_playe_num = online_playe_num;
	}

	public int getSocket_connect_num() {
		return socket_connect_num;
	}

	public void setSocket_connect_num(int socket_connect_num) {
		this.socket_connect_num = socket_connect_num;
	}

	public long getMsg_receive_count() {
		return msg_receive_count;
	}

	public void setMsg_receive_count(long msg_receive_count) {
		this.msg_receive_count = msg_receive_count;
	}

	public long getMsg_completed_count() {
		return msg_completed_count;
	}

	public void setMsg_completed_count(long msg_completed_count) {
		this.msg_completed_count = msg_completed_count;
	}

	public long getMsg_queue_count() {
		return msg_queue_count;
	}

	public void setMsg_queue_count(long msg_queue_count) {
		this.msg_queue_count = msg_queue_count;
	}

	/**
	 * @return the room_num
	 */
	public int getRoom_num() {
		return room_num;
	}

	/**
	 * @param room_num
	 *            the room_num to set
	 */
	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}

}
