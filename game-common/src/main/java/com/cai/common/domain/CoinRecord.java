package com.cai.common.domain;

import java.io.Serializable;

public class CoinRecord implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int gameId;
	private int win;
	private int sum;
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

}
