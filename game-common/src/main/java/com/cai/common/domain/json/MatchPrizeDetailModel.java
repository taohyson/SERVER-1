package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import protobuf.clazz.match.MatchClientRsp.MatchConfigProto;
import protobuf.clazz.match.MatchClientRsp.MatchRankItemProto;
import protobuf.clazz.match.MatchClientRsp.MatchRankLogPrizeProto;
import protobuf.clazz.match.MatchClientRsp.MatchRankPrizeConfigProto;

public class MatchPrizeDetailModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<MatchPrizeRankModel> ranks;
	
	public List<MatchPrizeRankModel> getRanks() {
		return ranks;
	}

	public void setRanks(List<MatchPrizeRankModel> ranks) {
		this.ranks = ranks;
	}
	
	public void encodeClient(MatchConfigProto.Builder b){
		if(ranks == null){
			return;
		}
		ranks.forEach((prize)->{
			prize.encodeClient(b);
		});
	}
	
	public MatchPrizeRankModel getPrize(int rank){
		if(ranks == null){
			return null;
		}
		for (MatchPrizeRankModel matchPrizeRankModel : ranks) {
			if(rank >= matchPrizeRankModel.minRank && rank <= matchPrizeRankModel.maxRank){
				return matchPrizeRankModel;
			}
		}
		return null;
	}
	
	public static class MatchPrizeRankModel implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int minRank;
		private int maxRank;
		
		private int coins;
		
		private int gold;
		
		private List<MatchPrizeItemModel> prizeExattr;
		
		public MatchPrizeRankModel copy(){
			MatchPrizeRankModel newModel = new MatchPrizeRankModel();
			newModel.minRank = minRank;
			newModel.maxRank = maxRank;
			newModel.coins = coins;
			newModel.gold = gold;
			newModel.prizeExattr = prizeExattr;
			return newModel;
		}
		
		public void delPrizeItemModel(int prizeId){
			if(prizeExattr != null){
				Iterator<MatchPrizeItemModel> iterator = prizeExattr.iterator();
				while(iterator.hasNext()){
					MatchPrizeItemModel iModel = iterator.next();
					if(iModel.getPrizeId() == prizeId){
						iterator.remove();
					}
				}
			}
		}
		
		public void encodeClient(MatchConfigProto.Builder b){
			
			MatchRankPrizeConfigProto.Builder prizeBuilder = MatchRankPrizeConfigProto.newBuilder();
			prizeBuilder.setMinRank(minRank);
			prizeBuilder.setMaxRank(maxRank);
			prizeBuilder.setMoney(coins);
			prizeBuilder.setGold(gold);
			
			List<MatchRankItemProto> itemList = new ArrayList<>();
			if(prizeExattr != null){
				prizeExattr.forEach((prize)->{
					itemList.add(prize.encodeClient().build());
				});
			}
			prizeBuilder.addAllItems(itemList);
			b.addRankPrizes(prizeBuilder);
		}
		
		public MatchRankPrizeConfigProto encodeClient(){
			
			MatchRankPrizeConfigProto.Builder prizeBuilder = MatchRankPrizeConfigProto.newBuilder();
			prizeBuilder.setMinRank(minRank);
			prizeBuilder.setMaxRank(maxRank);
			prizeBuilder.setMoney(coins);
			prizeBuilder.setGold(gold);
			
			List<MatchRankItemProto> itemList = new ArrayList<>();
			if(prizeExattr != null){
				prizeExattr.forEach((prize)->{
					itemList.add(prize.encodeClient().build());
				});
			}
			prizeBuilder.addAllItems(itemList);
			return prizeBuilder.build();
		}
		
		public MatchRankLogPrizeProto encodeLog(){
			MatchRankLogPrizeProto.Builder log = MatchRankLogPrizeProto.newBuilder();
			log.setMoney(coins);
			log.setGold(gold);
			List<MatchRankItemProto> itemList = new ArrayList<>();
			prizeExattr.forEach((prize)->{
				itemList.add(prize.encodeClient().build());
			});
			log.addAllItems(itemList);
			return log.build();
		}

		public int getMinRank() {
			return minRank;
		}

		public void setMinRank(int minRank) {
			this.minRank = minRank;
		}

		public int getMaxRank() {
			return maxRank;
		}

		public void setMaxRank(int maxRank) {
			this.maxRank = maxRank;
		}

		public int getCoins() {
			return coins;
		}

		public void setCoins(int coins) {
			this.coins = coins;
		}

		public int getGold() {
			return gold;
		}

		public void setGold(int gold) {
			this.gold = gold;
		}

		public List<MatchPrizeItemModel> getPrizeExattr() {
			return prizeExattr;
		}

		public void setPrizeExattr(List<MatchPrizeItemModel> prizeExattr) {
			this.prizeExattr = prizeExattr;
		}
	}

}
