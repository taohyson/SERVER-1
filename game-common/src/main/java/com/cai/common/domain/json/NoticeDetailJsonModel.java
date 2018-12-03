package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.List;

/**
 * 定局赛比赛配置 
 */
public class NoticeDetailJsonModel implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id; //id
	private int time; //时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public boolean isSame(int mId){
		if(id == mId){
			return true;
		}
		return false;
	}
	
}
