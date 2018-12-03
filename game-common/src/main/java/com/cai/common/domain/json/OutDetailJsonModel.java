package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.List;

public class OutDetailJsonModel implements Serializable{
	//根据总人数范围确定晋级人数{base_score:10,upgrade:[{area:"1,120",num:18},{area:"120,500",num:72}{}]}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<AreaLimitJsonModel> upgrade;

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
}
