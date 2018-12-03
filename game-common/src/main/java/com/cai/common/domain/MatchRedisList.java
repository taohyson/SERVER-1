package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MatchRedisList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final List<MatchRedis> matchList = new ArrayList<>();
	
	public void addMatchRedis(MatchRedis matchRedis){
		matchList.add(matchRedis);
	}
	
	public List<MatchRedis> getMatchList() {
		return matchList;
	}
	
}
