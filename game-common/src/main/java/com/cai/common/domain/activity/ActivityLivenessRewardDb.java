package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 
 * 任务条件
 *
 * @author tang date: 2018年4月18日 下午6:35:18 <br/>
 */
public class ActivityLivenessRewardDb implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int activity_id;
	private int index_seq;
	private String reward;
	private int need_liveness;

	public int getNeed_liveness() {
		return need_liveness;
	}

	public void setNeed_liveness(int need_liveness) {
		this.need_liveness = need_liveness;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}

	public int getIndex_seq() {
		return index_seq;
	}

	public void setIndex_seq(int index_seq) {
		this.index_seq = index_seq;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

}
