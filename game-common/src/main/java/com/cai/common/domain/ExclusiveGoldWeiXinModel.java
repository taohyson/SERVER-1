package com.cai.common.domain;

import java.io.Serializable;

/**
 * 查询专属豆的数量(供微信使用)
 * @author wuhaoran
 */
public class ExclusiveGoldWeiXinModel implements Serializable {
	
	private int gameId;
	private String gameName;
	private int num;
	private int expire;
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getExpire() {
		return expire;
	}
	public void setExpire(int expire) {
		this.expire = expire;
	}
	
}
