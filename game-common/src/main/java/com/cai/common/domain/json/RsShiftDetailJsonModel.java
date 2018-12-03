package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.List;

public class RsShiftDetailJsonModel implements Serializable{
	//包含内容[{round:1,upgrade:[{area:"1,120",num:18},{}]},{}]
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int round; //轮数
	private int round_num; //牌局数
	private int base_times; //倍数
	private int base_num; //基数
	private int base_score; //底分
	private int nextBili;

	private List<AreaLimitJsonModel> upgrade;

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public List<AreaLimitJsonModel> getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(List<AreaLimitJsonModel> upgrade) {
		this.upgrade = upgrade;
	}
	
	public AreaLimitJsonModel getConfig(int count){
		for (AreaLimitJsonModel areaLimitJsonModel : upgrade) {
			if(areaLimitJsonModel.getMinArea() < count && areaLimitJsonModel.getMaxArea() >= count){
				return areaLimitJsonModel;
			}
		}
		return null;
	}

	public int getRound_num() {
		return round_num;
	}

	public void setRound_num(int round_num) {
		this.round_num = round_num;
	}

	public int getBase_times() {
		return base_times;
	}

	public void setBase_times(int base_times) {
		this.base_times = base_times;
	}

	public int getBase_num() {
		return base_num;
	}

	public void setBase_num(int base_num) {
		this.base_num = base_num;
	}

	public int getBase_score() {
		return base_score;
	}

	public void setBase_score(int base_score) {
		this.base_score = base_score;
	}

	public int getNextBili() {
		return nextBili;
	}

	public void setNextBili(int nextBili) {
		this.nextBili = nextBili;
	}
}
