package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameGroups implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int game_type_index;
	
	private String fun;
	
	private final List<GameGroupModel> groupModels; 
	
	private final List<GameGroupModel>  commonGroups;
	
	public GameGroups(int game_type_index) {
		this.game_type_index = game_type_index;
		this.groupModels = new ArrayList<>();
		commonGroups = new ArrayList<>();
	}
	public int getGame_type_index() {
		return game_type_index;
	}
	public List<GameGroupModel> getGroupModels() {
		return groupModels;
	}
	public String getFun() {
		return fun;
	}
	public void setFun(String fun) {
		this.fun = fun;
	}
	public List<GameGroupModel> getCommonGroups() {
		return commonGroups;
	}


}
