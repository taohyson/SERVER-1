package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.cai.common.util.GameDescUtil;
import com.google.protobuf.InvalidProtocolBufferException;

import protobuf.clazz.ClubMsgProto.ClubRuleProto;
import protobuf.clazz.Common.CommonGameRuleProto;
import protobuf.clazz.Common.CommonGameRulesProto;

/**
 * 
 * @author demon 
 * date: 2017年7月21日 下午5:14:56 <br/>
 */
public class ClubRuleBaseModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int game_type_index;
	
	private int game_round;
	
	private String game_desc;

	public String getGame_desc() {
		return game_desc;
	}

	public void setGame_desc(String game_desc) {
		this.game_desc = game_desc;
	}

	public int getGame_round() {
		return game_round;
	}

	public void setGame_round(int game_round) {
		this.game_round = game_round;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
