package com.cai.common.domain;

import java.io.Serializable;

public class MatchRedis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int id;
	
	private final int matchId;
	
	private final int logicIndex;
	
	private final int count;
	
	private final long startTime;
	
	public MatchRedis(int id, int matchId, int logicIndex, int count, long startTime){
		this.id = id;
		this.matchId = matchId;
		this.logicIndex = logicIndex;
		this.count = count;
		this.startTime = startTime;
	}

	public int getLogicIndex() {
		return logicIndex;
	}


	public int getMatchId() {
		return matchId;
	}


	public int getId() {
		return id;
	}


	public int getCount() {
		return count;
	}

	public long getStartTime() {
		return startTime;
	}

	
}
