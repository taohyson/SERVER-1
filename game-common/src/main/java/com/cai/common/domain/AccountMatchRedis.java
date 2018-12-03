package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cai.common.type.MatchType;

/**
 * 比赛场缓存数据
 */
public class AccountMatchRedis implements Serializable{
	
	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<Integer, AccountMatchInfoRedis> matchInfoMap = new ConcurrentHashMap<>();

	public Map<Integer, AccountMatchInfoRedis> getMatchInfoMap() {
		return matchInfoMap;
	}
	
	public void setMatchInfoMap(Map<Integer, AccountMatchInfoRedis> matchInfoMap) {
		this.matchInfoMap = matchInfoMap;
	}

	public AccountMatchInfoRedis getMatchInfo(int matchId){
		AccountMatchInfoRedis info = matchInfoMap.get(matchId);
		return info;
	}
	
	public void addMatchInfo(AccountMatchInfoRedis info){
		matchInfoMap.put(info.getMatchId(), info);
	}
	
	public boolean removeMatchInfo(int matchId,int id){
		AccountMatchInfoRedis matchInfoRedis = matchInfoMap.get(matchId);
		if(matchInfoRedis == null){
			return false;
		}
		if(matchInfoRedis.getId() == id){
			matchInfoMap.remove(matchId);
			return true;
		}
		return false;
	}
	
	public boolean removeMatchInfo(int matchId){
		if(matchInfoMap.containsKey(matchId)){
			matchInfoMap.remove(matchId);
			return true;
		}
		return false;
	}
	
	public boolean isStart(){
		for(AccountMatchInfoRedis info : matchInfoMap.values()){
			if(info.getStatus() == MatchType.START){
				return true;
			}
		}
		return false;
	}
	
	public List<Integer> getManagerIdList(){
		List<Integer> list = new ArrayList<>();
		for(AccountMatchInfoRedis info : matchInfoMap.values()){
			if(info.isManager()){
				list.add(info.getMatchId());
			}
		}
		return list;
	}
	

}
