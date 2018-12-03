package com.cai.common.domain;

import java.io.Serializable;

/**
 * 代理服状态
 * @author run
 *
 */
public class ProxyStatusModel implements Serializable{
	
	private int proxy_game_id;

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
	
	
	public int getProxy_game_id() {
		return proxy_game_id;
	}

	public void setProxy_game_id(int proxy_game_id) {
		this.proxy_game_id = proxy_game_id;
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
	
	
	
}
