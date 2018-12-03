package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.cai.common.domain.json.MatchPrizeDetailModel.MatchPrizeRankModel;

import protobuf.clazz.match.MatchClientRsp.MatchFloatRankPrizeConfigProto;
import protobuf.clazz.match.MatchClientRsp.MatchRankLogPrizeProto;
import protobuf.clazz.match.MatchClientRsp.MatchRankPrizeConfigProto;

public class MatchFloatPrizeRankModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int minPerson;
	private int maxPerson;

	private List<MatchPrizeRankModel> prizeList;

	public MatchFloatRankPrizeConfigProto.Builder encodeClient() {

		MatchFloatRankPrizeConfigProto.Builder prizeBuilder = MatchFloatRankPrizeConfigProto.newBuilder();
		prizeBuilder.setMinNum(minPerson);
		prizeBuilder.setMaxNum(maxPerson);

		List<MatchRankPrizeConfigProto> prizeMsgList = new ArrayList<>();
		if(prizeList != null){
			prizeList.forEach((prize) -> {
				prizeMsgList.add(prize.encodeClient());
			});
		}
		prizeBuilder.addAllRankPrizes(prizeMsgList);
		return prizeBuilder;
	}

	public MatchRankLogPrizeProto encodeLog(MatchPrizeRankModel model) {
		return model.encodeLog();
	}

	public MatchPrizeRankModel getPrize(int rank) {
		for (MatchPrizeRankModel matchPrizeRankModel : prizeList) {
			if (rank >= matchPrizeRankModel.getMinRank() && rank <= matchPrizeRankModel.getMaxRank()) {
				return matchPrizeRankModel;
			}
		}
		return null;
	}

	public List<MatchPrizeRankModel> getPrizeList() {
		return prizeList;
	}

	public void setPrizeList(List<MatchPrizeRankModel> prizeList) {
		this.prizeList = prizeList;
	}

	public int getMinPerson() {
		return minPerson;
	}

	public void setMinPerson(int minPerson) {
		this.minPerson = minPerson;
	}

	public int getMaxPerson() {
		return maxPerson;
	}

	public void setMaxPerson(int maxPerson) {
		this.maxPerson = maxPerson;
	}

}
