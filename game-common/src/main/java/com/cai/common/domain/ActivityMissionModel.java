package com.cai.common.domain;

import java.io.Serializable;

import com.cai.common.domain.activity.ActivityMissionRely;

/**
 * 活动任务项
 * 
 * @author chansonyan 2018年4月17日
 */
public class ActivityMissionModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	// 任务名称
	private String name;

	// 任务描述，供前端使用
	private String activity_desc;

	// 任务类型，0：针对玩家；1：针对全服玩家目标(全服玩家完成一个任务，需要做好并发处理)
	private int type;

	// 任务目标类型，指定处理任务事件
	private int mission_type_enum;

	// 任务重置类型，默认0按天，1为活动有效期
	private int reset_type;

	// 指定游戏（特定在某些游戏类任务）
	private int target_game;

	// 需要满足条件
	private int need_condition;

	// 达成条件需要次数算完成
	private int target_count;

	// 是否为全局奖励，0：单项任务奖励（如果为单向任务奖励，下面rewards必填）；1：全局奖励（由活动去控制随机奖励）
	private int is_global_reward;

	// 活动奖励，JSON处理
	private String rewards;

	// 单项任务跳转页面 AppLinkEnum
	private int turnType;

	private String turnTypeNext;

	// 是否支持免费游戏
	private int free_game;

	private String mission_type_rely;

	// 任务JSON字段解析
	private ActivityMissionRely missionRely;

	private int liveness;

	public int getLiveness() {
		return liveness;
	}

	public void setLiveness(int liveness) {
		this.liveness = liveness;
	}

	public String getTurnTypeNext() {
		return turnTypeNext;
	}

	public void setTurnTypeNext(String turnTypeNext) {
		this.turnTypeNext = turnTypeNext;
	}

	public int getTurnType() {
		return turnType;
	}

	public void setTurnType(int turnType) {
		this.turnType = turnType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActivity_desc() {
		return activity_desc;
	}

	public void setActivity_desc(String activity_desc) {
		this.activity_desc = activity_desc;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getMission_type_enum() {
		return mission_type_enum;
	}

	public void setMission_type_enum(int mission_type_enum) {
		this.mission_type_enum = mission_type_enum;
	}

	public int getReset_type() {
		return reset_type;
	}

	public void setReset_type(int reset_type) {
		this.reset_type = reset_type;
	}

	public int getTarget_game() {
		return target_game;
	}

	public void setTarget_game(int target_game) {
		this.target_game = target_game;
	}

	public int getNeed_condition() {
		return need_condition;
	}

	public void setNeed_condition(int need_condition) {
		this.need_condition = need_condition;
	}

	public String getRewards() {
		return rewards;
	}

	public void setRewards(String rewards) {
		this.rewards = rewards;
	}

	public int getIs_global_reward() {
		return is_global_reward;
	}

	public void setIs_global_reward(int is_global_reward) {
		this.is_global_reward = is_global_reward;
	}

	public int getTarget_count() {
		return target_count;
	}

	public void setTarget_count(int target_count) {
		this.target_count = target_count;
	}

	public int getFree_game() {
		return free_game;
	}

	public void setFree_game(int free_game) {
		this.free_game = free_game;
	}

	public String getMission_type_rely() {
		return mission_type_rely;
	}

	public void setMission_type_rely(String mission_type_rely) {
		this.mission_type_rely = mission_type_rely;
	}

	public ActivityMissionRely getMissionRely() {
		return missionRely;
	}

	public void setMissionRely(ActivityMissionRely missionRely) {
		this.missionRely = missionRely;
	}

}
