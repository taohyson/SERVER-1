package com.cai.common.domain;

import java.io.Serializable;

/**
 * 游戏状态统计
 * @author run
 *
 */
public class GameStatModel implements Serializable{

	/**
	 * socket链接数量
	 */
	private int socket_num;
	
	/**
	 * 在线玩家数量
	 */
	private int online_player_num;
	
	public synchronized void addsocketNum(int num){
		this.socket_num = this.socket_num + num;
	}
	
	public synchronized void addOnlinePlayerNum(int num){
		this.online_player_num = this.online_player_num + num;
	}

	public int getSocket_num() {
		return socket_num;
	}

	public void setSocket_num(int socket_num) {
		this.socket_num = socket_num;
	}

	public int getOnline_player_num() {
		return online_player_num;
	}

	public void setOnline_player_num(int online_player_num) {
		this.online_player_num = online_player_num;
	}
	
	
}
