package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.List;

import protobuf.clazz.match.MatchClientRsp.MatchConfigProto;

public class MatchFloatPrizeDetailModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<MatchFloatPrizeRankModel> floatPrizes;
	
	public List<MatchFloatPrizeRankModel> getFloatPrizes() {
		return floatPrizes;
	}

	public void setFloatPrizes(List<MatchFloatPrizeRankModel> floatPrizes) {
		this.floatPrizes = floatPrizes;
	}
	
	public void encodeClient(MatchConfigProto.Builder b){
		if(floatPrizes == null){
			return;
		}
		floatPrizes.forEach((prize)->{
			b.addFloatRankPrizes(prize.encodeClient());
		});
	}
	
	public MatchFloatPrizeRankModel getFloatPrize(int gameNum){
		if(floatPrizes == null){
			return null;
		}
		for (MatchFloatPrizeRankModel model : floatPrizes) {
			if(gameNum >= model.getMinPerson() && gameNum <= model.getMaxPerson()){
				return model;
			}
		}
		return null;
	}

}
