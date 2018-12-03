package com.cai.common.domain.coin;

import java.io.Serializable;

/**
 * 金币救济
 */
public class CoinRelief implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int relief_coin;
	private int daily_receive_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRelief_coin() {
		return relief_coin;
	}
	public void setRelief_coin(int relief_coin) {
		this.relief_coin = relief_coin;
	}
	public int getDaily_receive_time() {
		return daily_receive_time;
	}
	public void setDaily_receive_time(int daily_receive_time) {
		this.daily_receive_time = daily_receive_time;
	}

}
