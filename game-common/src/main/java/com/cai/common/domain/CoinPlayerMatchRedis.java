package com.cai.common.domain;

import java.io.Serializable;

public class CoinPlayerMatchRedis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int gameId;
	
	private int detailId;

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public int getGameId() {
		return gameId;
	}

	public int getDetailId() {
		return detailId;
	}
	
}
