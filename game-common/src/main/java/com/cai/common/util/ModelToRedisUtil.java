package com.cai.common.util;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cai.common.define.ERankType;
import com.cai.common.domain.AccountWeixinModel;
import com.cai.common.domain.GameNoticeModel;
import com.cai.common.domain.RankModel;

import protobuf.redis.ProtoRedis.RsAccountWeixinModelResponse;
import protobuf.redis.ProtoRedis.RsGameNoticeModelResponse;
import protobuf.redis.ProtoRedis.RsRankProto;
import protobuf.redis.ProtoRedis.RsRankResponse;

/**
 * model转protobuf
 * 
 * @author run
 *
 */
public class ModelToRedisUtil {

	public static RsAccountWeixinModelResponse.Builder getRsAccountWeixinModelResponse(
			AccountWeixinModel accountWeixinModel) {
		RsAccountWeixinModelResponse.Builder builder = RsAccountWeixinModelResponse.newBuilder();
		builder.setAccountId(accountWeixinModel.getAccount_id());
		builder.setAccessToken(accountWeixinModel.getAccess_token());
		builder.setRefreshToken(accountWeixinModel.getRefresh_token());
		builder.setOpenid(accountWeixinModel.getOpenid());
		builder.setScope(accountWeixinModel.getScope());
		builder.setUnionid(accountWeixinModel.getUnionid());
		builder.setNickname(accountWeixinModel.getNickname());
		builder.setSex(accountWeixinModel.getSex());
		builder.setProvince(accountWeixinModel.getProvince());
		builder.setCity(accountWeixinModel.getCity());
		builder.setCountry(accountWeixinModel.getCountry());
		builder.setHeadimgurl(accountWeixinModel.getHeadimgurl());
		builder.setPrivilege(accountWeixinModel.getPrivilege());
		builder.setLastFlushTime(accountWeixinModel.getLast_flush_time().getTime());
		builder.setSelfToken(accountWeixinModel.getSelf_token());
		builder.setLastFalseSelfToken(accountWeixinModel.getLast_false_self_token().getTime());
		return builder;
	}

	public static RsGameNoticeModelResponse.Builder getRsGameNoticeModelResponse(GameNoticeModel model) {
		RsGameNoticeModelResponse.Builder builder = RsGameNoticeModelResponse.newBuilder();
		builder.setId(model.getId());
		builder.setContent(model.getContent());
		builder.setGameType(model.getGame_type());
		builder.setDelay(model.getDelay());
		builder.setCreateTime(model.getCreate_time().getTime());
		builder.setEndTime(model.getEnd_time().getTime());
		builder.setGameId(1);// TODO
		builder.setPayType(model.getPlay_type());
		return builder;
	}

	/**
	 * 排行榜
	 * 
	 * @param model
	 * @return
	 */
	public static RsRankResponse.Builder getRankModelResp(ERankType type, List<RankModel> models) {
		RsRankResponse.Builder builder = RsRankResponse.newBuilder();
		builder.setType(type.getType());
		// models.forEach((m) -> {
		//
		// });
		for (final RankModel m : models) {
			RsRankProto.Builder b = RsRankProto.newBuilder();
			b.setRank(m.getRank());
			b.setAccountId(m.getAccountId());
			b.setHead(m.getHead());
			b.setNickName(m.getNickName());
			b.setSignature(StringUtils.isNotEmpty(m.getSignature()) ? m.getSignature() : "该用户很懒,什么也没写");
			b.setValue(m.getValue());
			builder.addRanks(b.build());
		}
		return builder;
	}

}
