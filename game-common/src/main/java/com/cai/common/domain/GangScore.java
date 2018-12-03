package com.cai.common.domain;

import com.cai.common.constant.GameConstants;

public class GangScore {
	public int gang_count;//杠个数
	public float scores[][];///每个杠得分 每个人的分
	public int provide_gang_count;
	public int get_gang_count;
	public int ming_gang_count;
	public int an_gang_count;
	public GangScore(){
		gang_count = 0;
		scores = new float[GameConstants.MAX_WEAVE][GameConstants.GAME_PLAYER];
		provide_gang_count = 0;
		get_gang_count = 0;
		ming_gang_count=0;
		an_gang_count=0;
	}
	public int getGang_count() {
		return gang_count;
	}
	public void setGang_count(int gang_count) {
		this.gang_count = gang_count;
	}
	public float[][] getScores() {
		return scores;
	}
	public void setScores(float[][] scores) {
		this.scores = scores;
	}
	public int getProvide_gang_count() {
		return provide_gang_count;
	}
	public void setProvide_gang_count(int provide_gang_count) {
		this.provide_gang_count = provide_gang_count;
	}
	public int getGet_gang_count() {
		return get_gang_count;
	}
	public void setGet_gang_count(int get_gang_count) {
		this.get_gang_count = get_gang_count;
	}
}
