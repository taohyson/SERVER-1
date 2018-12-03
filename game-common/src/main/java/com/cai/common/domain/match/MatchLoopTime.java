package com.cai.common.domain.match;

import java.util.Date;

import com.cai.common.domain.json.MatchRuleTimeModel;
import com.cai.common.util.MyDateUtil;

public class MatchLoopTime {
	
	private int loopId;
	private MatchRuleTimeModel timeModel;
	private Date enterTime;
	private Date startTime;
	
	public MatchLoopTime(int loopId,MatchRuleTimeModel timeModel,Date now){
		this.loopId = loopId;
		this.timeModel = timeModel;
		this.enterTime = MyDateUtil.getHourDate(timeModel.getEnter(), now);
		this.startTime = MyDateUtil.getHourDate(timeModel.getStart(), now);
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

	public MatchRuleTimeModel getTimeModel() {
		return timeModel;
	}
	public void setTimeModel(MatchRuleTimeModel timeModel) {
		this.timeModel = timeModel;
	}

	public int getLoopId() {
		return loopId;
	}

	public void setLoopId(int loopId) {
		this.loopId = loopId;
	}

}
