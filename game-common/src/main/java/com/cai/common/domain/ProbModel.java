package com.cai.common.domain;

import java.io.Serializable;

/**
 * 权重
 * @author run
 * @date 2016-1-19
 */
public class ProbModel<T> implements Serializable{
	
	/**
	 * 索引值
	 */
	private int index;
	/**
	 * 权重值
	 */
	private int prob;
	
	private T o;
	
	public ProbModel(int index,int prob){
		this.index = index;
		this.prob = prob;
	}
	
	public ProbModel(int index,int prob,T o){
		this.index = index;
		this.prob = prob;
		this.o = o;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getProb() {
		return prob;
	}
	public void setProb(int prob) {
		this.prob = prob;
	}

	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}
	
	

}
