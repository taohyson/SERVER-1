package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 
 * 任务条件
 *
 * @author tang date: 2018年4月18日 下午6:35:18 <br/>
 */
public class LivenessState implements Serializable {
	private static final long serialVersionUID = 1L;
	private int indexSeq;
	private int state;
	private int liveness;

	public int getLiveness() {
		return liveness;
	}

	public void setLiveness(int liveness) {
		this.liveness = liveness;
	}

	public int getIndexSeq() {
		return indexSeq;
	}

	public void setIndexSeq(int indexSeq) {
		this.indexSeq = indexSeq;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
