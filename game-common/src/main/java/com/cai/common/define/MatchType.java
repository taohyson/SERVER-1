package com.cai.common.define;

public enum MatchType {
	//全民互动赛
	BASE(1), 
	
	//精英
	ELITE(2),
	
	// 线下直通赛
	DIRECT(3),
	
	// 线下
	OUTLINE(4),
	;
	
	private int type;
	
	
	MatchType(int type){
		this.type = type;
	}
	
	public int get(){
		return type;
	}
}
