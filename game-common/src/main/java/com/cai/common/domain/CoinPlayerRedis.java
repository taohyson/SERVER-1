package com.cai.common.domain;

import java.io.Serializable;

public class CoinPlayerRedis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int gameId;
	
	private final int detailId;
	
	private final int coinIndex;
	
	private final int logicId;

	public CoinPlayerRedis(int gameId, int detailId, int coinIndex,int logicId) {
		this.gameId = gameId;
		this.detailId = detailId;
		this.coinIndex = coinIndex;
		this.logicId = logicId;
	}

	public int getGameId() {
		return gameId;
	}

	public int getDetailId() {
		return detailId;
	}

	public int getCoinIndex() {
		return coinIndex;
	}

	public int getLogicId() {
		return logicId;
	}
	
}
