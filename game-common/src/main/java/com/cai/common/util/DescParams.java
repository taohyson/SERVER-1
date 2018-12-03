package com.cai.common.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.cai.common.domain.GameGroups;

public class DescParams implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 基础参数
	public int _game_type_index, _game_rule_index;

	public int[] game_rules = new int[3];
	
	public int _game_round;
	
	public int _cur_round;
	
	public transient GameGroups groupConfig = null;
	
	private Map<Integer,Integer> ruleMap = new HashMap<>();
	
	public DescParams put(int ruleId, int value){
		ruleMap.put(ruleId, value);
		return this;
	}
	
	public DescParams setRuleMap(Map<Integer,Integer> ruleMap){
		this.ruleMap = ruleMap;
		return this;
	}
	public Map<Integer,Integer> getMap(){
		return ruleMap;
	}

	public DescParams setGameType(int type) {
		this._game_type_index = type;
		return this;
	}

	public DescParams setGameRule(int _game_rule_index) {
		this._game_rule_index = _game_rule_index;
		return this;
	}
	
	public int getRuleValue(int rule_id){
		if(ruleMap.containsKey(rule_id)){
			return ruleMap.get(rule_id);
		}
		return 0;
	}
	
	public static DescParams create(int gameId,Map<Integer,Integer> rules){
		DescParams ruleParams = new DescParams();
		ruleParams.setGameType(gameId);
		rules.forEach((id,value)->{
			ruleParams.ruleMap.put(id, value);
			if (id < 32) {
				ruleParams._game_rule_index = ruleParams._game_rule_index | (1 << id);
			}
			int mod = id % 32;
			mod = id % 32;
			int index = (id - mod) / 32;
			if (index < ruleParams.game_rules.length) {
				ruleParams.game_rules[index] = ruleParams.game_rules[index] | (1 << mod);
			}
		});
	
		return ruleParams;
	}

	@Override
	public String toString() {
		return "DescParams [_game_type_index=" + _game_type_index + ", _game_rule_index=" + _game_rule_index
				+ ", game_rules=" + Arrays.toString(game_rules) + ", _game_round=" + _game_round + ", _cur_round="
				+ _cur_round + ", ruleMap=" + ruleMap + "]";
	}
	
	public static void main(String[] args) {
		Map<Integer,Integer> rules = new HashMap<Integer, Integer>();
		rules.put(1, 1);
		rules.put(2, 1);
		rules.put(3, 1);
		rules.put(201, 1);
		rules.put(202, 5);
		rules.put(203, 7);
		
		DescParams ruleParams =create(3012,rules);
		System.out.println(JSON.toJSONString(ruleParams));
		String desc=GameDescUtil.getGameDesc(ruleParams);
		System.out.println(desc);
	}
}
