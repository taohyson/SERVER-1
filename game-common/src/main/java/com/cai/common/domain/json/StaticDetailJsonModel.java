package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.List;

public class StaticDetailJsonModel implements Serializable{
	//包含内容{base_times:10,base_num:100,base_score:10,upgrade:[{area:"1,120",num:18},{area:"120,500",num:72}{}]}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int base_times;
	
	private int base_num;
	
	private int base_score;
	
	private int init_score;
	
	private List<AreaLimitJsonModel> upgrade;

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

	public List<AreaLimitJsonModel> getUpgrade() {
		return upgrade;
	}

	public int getInit_score() {
		return init_score;
	}

	public void setInit_score(int init_score) {
		this.init_score = init_score;
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
	 
	
}
