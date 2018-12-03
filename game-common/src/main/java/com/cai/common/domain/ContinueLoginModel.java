package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.cai.common.util.GoodPaserUtil;

import protobuf.clazz.Protocol.RewardResponse;

/**
 * 连续登录配置
 *
 */
public class ContinueLoginModel implements Serializable {

	
	private static final long serialVersionUID = 6804423743954861325L;

	private int id;

	/**
	 * 游戏ID
	 */
	private int game_id;
	/**
	 * 天数
	 */
	private int day;
	/**
	 * 内容
	 */
	private String reward;
	
	private List<RewardResponse> rewardList;

	public List<RewardResponse> getRewardList() {
		if(rewardList==null) {
			rewardList = new ArrayList<RewardResponse>();
			List<ItemDTO> itemList = GoodPaserUtil.turnItemDTOs(reward);
			for(ItemDTO dto:itemList) {
				RewardResponse.Builder response = RewardResponse.newBuilder();
				response.setNumber(dto.getNumber());
				response.setType(dto.getId());
				rewardList.add(response.build());
			}
		}
		return rewardList;
	}

	public void setRewardList(List<RewardResponse> rewardList) {
		this.rewardList = rewardList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

}
