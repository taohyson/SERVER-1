package com.cai.common.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 线下比赛全局model
 */
public class MatchOffLineModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int itemId;//参赛券id
	//组id排列
	public static Map<Integer,MatchGroupModel> groupMap = new HashMap<Integer,MatchGroupModel>();
	//按报名序号排列
	public static Map<Integer,MatchSignUpModel> allSignUpMap = new HashMap<Integer,MatchSignUpModel>();
	
	public List<MatchNoticeModel> matchNoticeList = new ArrayList<MatchNoticeModel>();
	//按组id排列
	public static List<MatchTableModel> groupTableList = new ArrayList<MatchTableModel>();
	
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public static Map<Integer, MatchGroupModel> getGroupMap() {
		return groupMap;
	}

	public static void setGroupMap(Map<Integer, MatchGroupModel> groupMap) {
		MatchOffLineModel.groupMap = groupMap;
	}

	public static Map<Integer, MatchSignUpModel> getAllSignUpMap() {
		return allSignUpMap;
	}

	public static void setAllSignUpMap(Map<Integer, MatchSignUpModel> allSignUpMap) {
		MatchOffLineModel.allSignUpMap = allSignUpMap;
	}

	public List<MatchNoticeModel> getMatchNoticeList() {
		return matchNoticeList;
	}

	public void setMatchNoticeList(List<MatchNoticeModel> matchNoticeList) {
		this.matchNoticeList = matchNoticeList;
	}
	
}
