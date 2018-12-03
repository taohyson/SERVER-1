package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 *
 * @author zhanglong date: 2018年7月3日 下午6:39:30
 */
public class ClubMatchBlacklistVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 操作类型 1-请求黑名单列表 2-添加黑名单 3-删除黑名单 | 4-请求白名单列表 5-添加白名单 6-删除白名单
	 */
	private int opType;

	/**
	 * 操作结果
	 */
	private boolean result;

	private int clubId;

	private List<Integer> clubList;

	public int getOpType() {
		return opType;
	}

	public void setOpType(int opType) {
		this.opType = opType;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public List<Integer> getClubList() {
		return clubList;
	}

	public void setClubList(List<Integer> clubList) {
		this.clubList = clubList;
	}

}
