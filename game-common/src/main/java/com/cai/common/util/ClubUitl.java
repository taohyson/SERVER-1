/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.cai.common.constant.Symbol;
import com.cai.common.domain.ClubActivityLogModel;
import com.cai.common.domain.ClubMatchLogModel;
import com.cai.common.domain.ClubMatchModel;
import com.cai.common.domain.RankModel;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import protobuf.clazz.ClubMsgProto.ClubActivityProto;
import protobuf.clazz.Common.CommonRankInfoProto;

/**
 * @author wu_hc date: 2018年1月23日 下午8:37:22 <br/>
 */
public final class ClubUitl {

	/**
	 *
	 */
	public static ClubActivityLogModel activityLogModel(ClubActivityProto proto, List<RankModel> winRankModels, List<RankModel> timeRankModels) {
		return ClubUitl.activityLogModel(proto, JSON.toJSONString(winRankModels), JSON.toJSONString(timeRankModels));
	}

	/**
	 * 活动结果，入库mongoDB
	 */
	public static ClubActivityLogModel activityLogModel(ClubActivityProto proto, String winRankJson, String timeRankJson) {
		ClubActivityLogModel model = new ClubActivityLogModel();
		model.setId(proto.getActivityId());
		model.setActivityEndDate(new Date(proto.getEndDate() * 1000L));
		model.setActivityName(proto.getActivityName());
		model.setActivityStartDate(new Date(proto.getStartDate() * 1000L));
		model.setActivityType(proto.getActivityType());
		model.setCreate_time(new Date());
		model.setCreatorId(proto.getCreatorId());
		model.setClubId(proto.getClubId());

		model.setWinRankJson(winRankJson);
		model.setTimeRankJson(timeRankJson);
		return model;
	}

	/**
	 * 比赛结果，入库mongoDB
	 */
	public static ClubMatchLogModel matchLogModel(ClubMatchModel matchModel, String rankJson, String gameName, String subName) {
		ClubMatchLogModel model = new ClubMatchLogModel();
		model.setCreate_time(new Date());
		model.setId(matchModel.getId());
		model.setCreatorId(matchModel.getCreatorId());
		model.setClubId(matchModel.getClubId());
		model.setMatchType(matchModel.getMatchType());
		model.setMatchName(matchModel.getMatchName());
		model.setRankJson(rankJson);
		model.setStartDate(matchModel.getStartDate());
		model.setEndDate(matchModel.getEndDate());
		model.setEnrollAccountIds(matchModel.getEnrollAccountIds());
		model.setReward(matchModel.getReward());
		model.setGameName(gameName);
		model.setSubName(subName);
		model.setStatus(matchModel.getStatus());
		String costGold = matchModel.getCostGold();
		if (!Strings.isNullOrEmpty(costGold)) {
			List<Integer> list = StringUtil.toIntList(costGold, Symbol.COMMA);
			if (list != null && list.size() >= 2) {
				model.setCostType(list.get(0));
				model.setCostGold(list.get(1));
			}
		}
		model.setOpenType(matchModel.getOpenType());

		return model;
	}

	/**
	 * 反序列化
	 *
	 * @param rankJson
	 * @return
	 */
	public static List<RankModel> rankJsonToList(String rankJson) {
		try {
			return JSON.parseArray(rankJson, RankModel.class);
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	/**
	 * @param rankModel
	 * @return
	 */
	public static CommonRankInfoProto.Builder toRankModelBuilder(final RankModel rankModel) {
		return CommonRankInfoProto.newBuilder().setAccountId(rankModel.getAccountId()).setRank(rankModel.getRank()).setHead(rankModel.getHead())
				.setNickName(rankModel.getNickName()).setValue(rankModel.getValue()).setIsDisband(rankModel.isDisband());

	}

	/**
	 *
	 */
	public static List<CommonRankInfoProto.Builder> toRankModelListBuilder(final List<RankModel> rankModels) {
		List<CommonRankInfoProto.Builder> rr = Lists.newArrayListWithCapacity(rankModels.size());
		rankModels.forEach(model -> {
			rr.add(toRankModelBuilder(model));
		});
		return rr;
	}

	/**
	 *
	 */
	public static List<CommonRankInfoProto> toRankModelListProto(final List<RankModel> rankModels) {
		List<CommonRankInfoProto> rr = Lists.newArrayListWithCapacity(rankModels.size());
		rankModels.forEach(model -> {
			rr.add(toRankModelBuilder(model).build());
		});
		return rr;
	}
}
