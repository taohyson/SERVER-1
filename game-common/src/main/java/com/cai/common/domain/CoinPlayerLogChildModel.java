package com.cai.common.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CoinPlayerLogChildModel extends CoinPlayerLogModel implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Map<String, Integer> personMap = new HashMap<>(); // key=天数  value=玩牌人数
	

	public Map<String, Integer> getPersonMap() {
		return personMap;
	}
	public void setPersonMap(Map<String, Integer> personMap) {
		this.personMap = personMap;
	}

}
