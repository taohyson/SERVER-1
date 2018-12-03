package com.cai.common.domain;

import java.util.Date;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import com.alibaba.fastjson.JSON;
import com.cai.common.domain.json.MatchFloatPrizeDetailModel;
import com.cai.common.domain.json.MatchFloatPrizeRankModel;
import com.cai.common.domain.json.MatchPrizeDetailModel;
import com.cai.common.domain.json.MatchReviveJsonModel;
import com.cai.common.domain.json.MatchPrizeDetailModel.MatchPrizeRankModel;
import com.cai.common.domain.json.OutDetailJsonModel;
import com.cai.common.domain.json.RsShiftDetailJsonModel;
import com.cai.common.domain.json.UpgradeDetailJsonModel;
import com.cai.common.util.DescParams;
import protobuf.clazz.match.MatchClientRsp.MatchConfigProto;
import protobuf.clazz.match.MatchClientRsp.MatchConfigTopProto;
import protobuf.clazz.match.MatchClientRsp.MatchDetailConfig;
import protobuf.clazz.match.MatchClientRsp.MatchTopCostMsg;

/**
 * 比赛场
 */
public class MatchRoundModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int matchId;//比赛id
	
	private MatchRuleModel matchRuleModel;//比赛玩法配置
	private MatchChoiceModel matchChoiceModel;//比赛选项配置
	private MatchFormatModel matchFormatModel;//比赛赛制配置
	private MatchPrizeModel matchPrizeModel;//比赛奖励配置
	private MatchBaseScoreModel matchBaseScoreModel;//比赛基数配置
	private MatchPrizeDetailModel prizeDetailModel;
	private MatchFloatPrizeDetailModel prizeFloatDetailModel;
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public MatchRuleModel getMatchRuleModel() {
		return matchRuleModel;
	}
	public void setMatchRuleModel(MatchRuleModel matchRuleModel) {
		this.matchRuleModel = matchRuleModel;
	}
	public MatchChoiceModel getMatchChoiceModel() {
		return matchChoiceModel;
	}
	public void setMatchChoiceModel(MatchChoiceModel matchChoiceModel) {
		this.matchChoiceModel = matchChoiceModel;
	}
	public MatchFormatModel getMatchFormatModel() {
		return matchFormatModel;
	}
	public void setMatchFormatModel(MatchFormatModel matchFormatModel) {
		this.matchFormatModel = matchFormatModel;
		if(StringUtils.isNotBlank(matchFormatModel.getOut_detail())){
			OutDetailJsonModel outDetailJsonModel = JSON.parseObject(matchFormatModel.getOut_detail(), OutDetailJsonModel.class);
			matchFormatModel.setOutDetailJsonModel(outDetailJsonModel);
		}
		if(StringUtils.isNotBlank(matchFormatModel.getUpgrade_detail())){
			List<UpgradeDetailJsonModel> upgradeDetailJsonModelList = JSON.parseArray(matchFormatModel.getUpgrade_detail(), UpgradeDetailJsonModel.class);
			matchFormatModel.setUpgradeDetailJsonModelList(upgradeDetailJsonModelList);
		}
		if(StringUtils.isNotBlank(matchFormatModel.getRs_shift_detail())){
			List<RsShiftDetailJsonModel> upgradeDetailJsonModelList = JSON.parseArray(matchFormatModel.getRs_shift_detail(), RsShiftDetailJsonModel.class);
			matchFormatModel.setRsDetailJsonModelList(upgradeDetailJsonModelList);
		}
		if(StringUtils.isNotBlank(matchFormatModel.getRevive_detail())){
			MatchReviveJsonModel reviveModel = JSON.parseObject(matchFormatModel.getRevive_detail(), MatchReviveJsonModel.class);
			matchFormatModel.setReviveJsonModel(reviveModel);
		}
	}
	public MatchPrizeModel getMatchPrizeModel() {
		return matchPrizeModel;
	}
	public void setMatchPrizeModel(MatchPrizeModel matchPrizeModel) {
		String rankPrize = matchPrizeModel.getPrize_detail();
		String floatPrize = matchPrizeModel.getPrize_float_detail();
		List<MatchFloatPrizeRankModel> floatList = null;
		List<MatchPrizeRankModel> rankList = null;
		if(rankPrize != null){
			try{
				rankList = JSON.parseArray(rankPrize, MatchPrizeRankModel.class);
				prizeDetailModel = new MatchPrizeDetailModel();
				prizeDetailModel.setRanks(rankList);
			}catch (Exception e) {
			}
		}
		
		if(floatPrize != null){
			try{
				floatList = JSON.parseArray(floatPrize, MatchFloatPrizeRankModel.class);
				prizeFloatDetailModel = new MatchFloatPrizeDetailModel();
				prizeFloatDetailModel.setFloatPrizes(floatList);
			}catch (Exception e) {
			}
		}
		
		this.matchPrizeModel = matchPrizeModel;
	}
	public MatchBaseScoreModel getMatchBaseScoreModel() {
		return matchBaseScoreModel;
	}
	public void setMatchBaseScoreModel(MatchBaseScoreModel matchBaseScoreModel) {
		this.matchBaseScoreModel = matchBaseScoreModel;
	}
	
	public MatchConfigProto encodeBase(int appId,int sideType){
		MatchConfigProto.Builder b = MatchConfigProto.newBuilder();
		
		b.setIconItem(getMatchRuleModel().getIcon());
		b.setAppId(appId);
		b.setMaxCount(getMatchChoiceModel().getMax_persons());
		b.setMatchId(getMatchId());
		b.setMatchName(getMatchChoiceModel().getMatch_name());
		b.setGoldCost(getMatchChoiceModel().getGold_cost());
		b.setMoneyCost(getMatchChoiceModel().getCoin_cost());
		b.setFreeCount(getMatchChoiceModel().getFree_times());
		b.setItemCost(getMatchChoiceModel().getTicket_type());
		b.setMatchBeginType(getMatchRuleModel().getMatch_begin_type());
		b.setGameId(getMatchRuleModel().getGame_id());
		b.setDailyEndTime(getMatchChoiceModel().getDaily_end_time());
		b.setDailyStartTime(getMatchChoiceModel().getDaily_begin_time());
		b.setMinCount(getMatchChoiceModel().getMin_persons());
		b.setMaxCount(getMatchChoiceModel().getMax_persons());
		b.setStartTime(DateFormatUtils.format(getMatchChoiceModel().getMatch_begin_time(), "yyyy-MM-dd"));
		b.setEndTime(DateFormatUtils.format(getMatchChoiceModel().getMatch_end_time(), "yyyy-MM-dd"));
		Date reserveStartTime = getMatchChoiceModel().getOrder_start_time();
		Date reserveEndTime = getMatchChoiceModel().getOrder_end_time();
		b.setReserveStartTime(DateFormatUtils.format(reserveStartTime, "yyyy-MM-dd HH:mm:ss"));
		b.setReserveEndTime(DateFormatUtils.format(reserveEndTime, "yyyy-MM-dd HH:mm:ss"));
		
//		b.setRuleDesc(getMatchRuleModel().getRule_description());
		b.setClientEndTime(getMatchChoiceModel().getClient_end_time());
		b.setClientStartTime(getMatchChoiceModel().getClient_begin_time());
		b.setIconTitle(getMatchRuleModel().getIconTitle());
		b.setSort(getMatchRuleModel().getMatch_sort());
//		b.setDesc(getMatchRuleModel().getMatch_desc());
		b.setTips(getMatchRuleModel().getTips());
		b.setStatus(getMatchRuleModel().getMatch_status());
		b.setLabel(getMatchChoiceModel().getMatch_label());
		b.setUnionId(getMatchRuleModel().getMatch_union_id());
		b.setSideType(sideType);
		b.setMatchType(getMatchRuleModel().getMatch_type());
		b.setShareCount(getMatchChoiceModel().getShare_free_times());
		String shareIconUrl = getMatchChoiceModel().getShare_icon();
		b.setShareIconUrl(shareIconUrl!=null?shareIconUrl:"");
		b.setRecommendIcon(getMatchRuleModel().getRecommend_icon() != null ? getMatchRuleModel().getRecommend_icon() : "");
		b.setRecommendSort(getMatchRuleModel().getRecommend_sort());
		b.setCheat(getMatchChoiceModel().getCheat());
		b.setBannerUrl(getMatchRuleModel().getBanner_url() != null ? getMatchRuleModel().getBanner_url() : "");
		
		if(prizeDetailModel != null){
			prizeDetailModel.encodeClient(b);
		}
		if(prizeFloatDetailModel != null){
			prizeFloatDetailModel.encodeClient(b);
		}
		
//		repeated int32 rankTypes = 1; //榜单类型  0日  1周  2月
//		repeated MatchTopCostMsg costMgs = 2; //消耗
//		optional string rankGameBgImage = 3;		//冲榜赛子游戏背景图
//		optional string prizeImage = 4;			//冲榜赛奖励图
		MatchConfigTopProto.Builder topMsg = MatchConfigTopProto.newBuilder();
		if(getMatchChoiceModel().getRankTypeList() != null){
			topMsg.addAllRankTypes(getMatchChoiceModel().getRankTypeList());
		}
		if(getMatchChoiceModel().getTypeInfoModel() != null){
			topMsg.setRankGameBgImage(getMatchChoiceModel().getTypeInfoModel().getPrizeImage());
			topMsg.setPrizeImage(getMatchChoiceModel().getTypeInfoModel().getPrizeImage());
			topMsg.setPrizeDesc(getMatchChoiceModel().getTypeInfoModel().getPrizeDesc());
			topMsg.setIsReset(getMatchChoiceModel().getTypeInfoModel().getOpenClearZero());
			topMsg.setResetGold(getMatchChoiceModel().getTypeInfoModel().getClearZeroGold());
		}
		if(getMatchChoiceModel().getSignUpModels() != null){
			getMatchChoiceModel().getSignUpModels().forEach((costModel) -> {
				MatchTopCostMsg.Builder tpCostMsg = MatchTopCostMsg.newBuilder();
				tpCostMsg.setTimes(costModel.getTimes());
				tpCostMsg.setCostType(costModel.getSignType());
				tpCostMsg.setCostNum(costModel.getGoldMoneyNum());
				
				topMsg.addCostMsg(tpCostMsg.build());
			});
		}
		b.setTopConfigs(topMsg.build());
		
		return b.build();
	}
	
	public MatchDetailConfig.Builder encodeDetail(){
		MatchDetailConfig.Builder detailConfig = MatchDetailConfig.newBuilder();
		detailConfig.setMatchId(matchId);
		detailConfig.setDesc(getMatchRuleModel().getMatch_desc());
		detailConfig.setTips(getMatchRuleModel().getTips());
		detailConfig.setRuleDesc(getMatchRuleModel().getRule_description());
		return detailConfig;
	}
	
	public MatchPrizeDetailModel getPrizeDetailModel() {
		return prizeDetailModel;
	}
	public MatchFloatPrizeDetailModel getPrizeFloatDetailModel() {
		return prizeFloatDetailModel;
	}
	
	public boolean isFloatPrize(){
		if(prizeFloatDetailModel != null){
			return true;
		}
		return false;
	}
	
	public DescParams getRuleParam() {
		DescParams params = new DescParams();
		String ids = getMatchRuleModel().getRule_ids();
		String[] temps1 = ids.split("\\|");
		params.game_rules = new int[3];
		params._game_type_index = matchRuleModel.getGame_id();

		for (String temp2 : temps1) {

			String[] ruleStr = temp2.split(",");

			int ruleId = Integer.parseInt(ruleStr[0]);
			int value = Integer.parseInt(ruleStr[1]);
			params.put(ruleId, value);

			if (ruleId < 32) {
				params._game_rule_index = params._game_rule_index | (1 << ruleId);
			}
			int mod = ruleId % 32;
			mod = ruleId % 32;
			int index = (ruleId - mod) / 32;
			if (index < params.game_rules.length) {
				params.game_rules[index] = params.game_rules[index] | (1 << mod);
			}
		}

		return params;
	}
	
	public boolean isClose(){
		if(matchRuleModel == null){
			return true;
		}
		int status = matchRuleModel.getMatch_status();
		if(status == 2){
			return true;
		}
		return false;
	}
	
}
