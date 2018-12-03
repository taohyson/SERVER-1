package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class MatchLoopRuleModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final LoopTimeComparator comparator = new LoopTimeComparator();
	
	private int loopType; //循环类型1单场 2多场
	private List<Integer> loopCycle;  //1周一  7周天
	private List<MatchRuleTimeModel> moreTime; //多场的时间配置
	private List<MatchRuleTimeModel> sortTimeList;
	
	public void initLoopTimeList(Date nowDate){
		List<MatchRuleTimeModel> tempList = new ArrayList<>();
		for(MatchRuleTimeModel model : moreTime){
			model.updateTime(nowDate);
			tempList.add(model);
		}
		Collections.sort(tempList, comparator);
		sortTimeList = tempList;
	}
	
	public MatchRuleTimeModel getNowLoopTime(){
		List<MatchRuleTimeModel> tempList = sortTimeList;
		long now = System.currentTimeMillis();
		for(MatchRuleTimeModel loopTime : tempList){
			if(now < loopTime.getStartTime().getTime()){
				return loopTime;
			}
		}
		return tempList.get(0);
	}
	
	public MatchRuleTimeModel getLastLoopTime(){
		List<MatchRuleTimeModel> tempList = sortTimeList;
		long max = 0;
		MatchRuleTimeModel lastModel = null;
		for(MatchRuleTimeModel loopTime : tempList){
			if(loopTime.getStartTime().getTime() >= max){
				max = loopTime.getStartTime().getTime();
				lastModel = loopTime;
			}
		}
		return lastModel;
	}
	
	public MatchRuleTimeModel getFirstLoopTime(){
		List<MatchRuleTimeModel> tempList = sortTimeList;
		long min = Long.MAX_VALUE;
		MatchRuleTimeModel firstModel = null;
		for(MatchRuleTimeModel loopTime : tempList){
			if(loopTime.getStartTime().getTime() <= min){
				min = loopTime.getStartTime().getTime();
				firstModel = loopTime;
			}
		}
		return firstModel;
	}
	
	public boolean isLoopCycle(){
		if(loopCycle == null || loopCycle.size() <= 0){
			return false;
		}
		return true;
	}
	
	public boolean isMoreTime(){
		if(moreTime == null || moreTime.size() <= 0){
			return false;
		}
		return true;
	}
	
	public int getLoopType() {
		return loopType;
	}
	public void setLoopType(int loopType) {
		this.loopType = loopType;
	}
	public List<Integer> getLoopCycle() {
		return loopCycle;
	}
	public void setLoopCycle(List<Integer> loopCycle) {
		this.loopCycle = loopCycle;
	}
	public List<MatchRuleTimeModel> getMoreTime() {
		return moreTime;
	}
	public void setMoreTime(List<MatchRuleTimeModel> moreTime) {
		this.moreTime = moreTime;
	}
	
	private static class LoopTimeComparator implements Comparator<MatchRuleTimeModel>{

		@Override
		public int compare(MatchRuleTimeModel o1, MatchRuleTimeModel o2) {
			int result = (int) (o1.getStartTime().getTime() - o2.getStartTime().getTime());
			if(result > 0){
				return 1;
			}
			return -1;
		}
		
	}
	
}
