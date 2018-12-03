package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.util.MyDateUtil;

public class MatchRuleTimeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int round; //  第几场    
	private String enter; // 进入比赛的时间   
	private String start; //比赛开始时间
	private Date enterTime;
	private Date startTime;
	private String dateFlag;
	
	public void updateTime(Date now){
		this.dateFlag = MyDateUtil.getDateFormat(now, MyDateUtil.Y_M_D);
		this.enterTime = MyDateUtil.getHourDate(enter, now);
		this.startTime = MyDateUtil.getHourDate(start, now);
	}
	
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public String getEnter() {
		return enter;
	}
	public void setEnter(String enter) {
		this.enter = enter;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public Date getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getDateFlag() {
		return dateFlag;
	}

	public void setDateFlag(String dateFlag) {
		this.dateFlag = dateFlag;
	}

	public boolean isUpdate(MatchRuleTimeModel model){
		if(!model.getDateFlag().equals(dateFlag)){
			return true;
		}
		if(round == model.getRound() && (!enter.equals(model.getEnter()) || !start.equals(model.getStart()))){
			return true;
		}
		return false;
	}
	
	public boolean isUpdateRound(MatchRuleTimeModel model){
		if(round != model.getRound()){
			return true;
		}
		return false;
	}
	
}
