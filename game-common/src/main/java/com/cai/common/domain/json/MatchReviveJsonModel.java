package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.List;

public class MatchReviveJsonModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int type; //类型   1正常比赛打立出局阶段  2快速赛
	private int isRevive; //是否允许复活  0不允许  1允许
	private int time; //允许复活时间
	private int reviveNum; //停止复活人数
	private double reviveTimes; //正常比赛打立出局阶段为倍数    快速赛为名次
	private List<MatchReiveGoldModel> goldList; //每次复活消耗金豆列表
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getIsRevive() {
		return isRevive;
	}
	public void setIsRevive(int isRevive) {
		this.isRevive = isRevive;
	}
	public int getReviveNum() {
		return reviveNum;
	}
	public void setReviveNum(int reviveNum) {
		this.reviveNum = reviveNum;
	}
	public List<MatchReiveGoldModel> getGoldList() {
		return goldList;
	}
	public void setGoldList(List<MatchReiveGoldModel> goldList) {
		this.goldList = goldList;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getReviveTimes() {
		return reviveTimes;
	}
	public void setReviveTimes(double reviveTimes) {
		this.reviveTimes = reviveTimes;
	}
	public int acquireMaxReviveNum(){
		return goldList.size();
	}
	
	public int getReviveGold(int index){
		int goldSize = goldList.size();
		if(index >= goldSize){
			index = goldSize - 1;
		}
		MatchReiveGoldModel model = goldList.get(index);
		return model.getGold();
	}
	
}
