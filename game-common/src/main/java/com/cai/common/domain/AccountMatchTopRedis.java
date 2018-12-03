package com.cai.common.domain;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 比赛场缓存数据
 */
public class AccountMatchTopRedis implements Serializable{
	
	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<Integer, Integer> matchTopMap = new ConcurrentHashMap<>();

	public void addTopId(int id, int matchId){
		matchTopMap.put(id, matchId);
	}
	
	public void removeTopId(int id){
		matchTopMap.remove(id);
	}
	
	public boolean isExist(int id){
		Integer matchId = matchTopMap.get(id);
		if(matchId == null){
			return false;
		}
		return true;
	}
	
}
