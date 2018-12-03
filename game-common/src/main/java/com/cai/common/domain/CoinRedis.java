package com.cai.common.domain;

import java.io.Serializable;

public class CoinRedis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int gameId;
	
	private final int detailId;
	
	private final int coinIndex;
	
	private final int logicIndex;
	
	private final int count;
	
	private final long startTime;

	public CoinRedis(int gameId, int detailId, int coinIndex, int logicIndex, int count) {
		this.gameId = gameId;
		this.detailId = detailId;
		this.coinIndex = coinIndex;
		this.logicIndex = logicIndex;
		this.count = count;
		this.startTime = System.currentTimeMillis();
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

	public int getLogicIndex() {
		return logicIndex;
	}

	public int getCount() {
		return count;
	}

	public long getStartTime() {
		return startTime;
	}
	
}
