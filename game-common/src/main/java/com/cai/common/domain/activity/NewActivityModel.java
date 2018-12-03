package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cai.common.domain.ActivityMissionModel;

/**
 * 活动
 *
 */
public class NewActivityModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String game_id;

	private int type;

	private String content;

	private String name;

	private String href;

	private Integer activity_condition;// 活动完成限制，1每天可以完成一次,0只能完成一次

	private String remark;// 备注

	private int reset_prizes;// 主奖励重置，0不重置，1按天重置

	private String reset_time;// 每日重置时间

	private Integer player_limit_days;// 玩家活动有效天数

	private Integer activity_object;// 活动对象：0所有用户，1新用户，2代理，3推广员

	private Integer prizes_count;// 奖品总数量

	private String activity_start_time;// 活动开始时间

	private String activity_end_time;// 活动结束时间

	private List<MainPrizes> mainPrizesList;// 主要奖品[{红包itemId,红包金额，红包总数}]

	private List<RandomPrizes> randomPrizesList;// 随机奖励[{itemId物品id,奖品名称,数量}]

	// private ActivityMission activityMission;//{任务关联ids,任务名，限制条件,任务完成跳转界面}
	// 任务项，通过任务关联ids获取
	private List<ActivityMissionModel> activityMissionList;

	private int state;// 上线状态，0下线，1上线

	private int reload_state;// 重新加载活动标志,1需要加载，0不需要加载，默认0

	// 任务开启类型，对应ActivityStartTypeEnum枚举
	private int activity_start_type;

	// 开始有效时间，精确到分钟
	private int start_avaliable_time;

	// 任务奖励随机类型，对应ActivityRewardRandomEnum枚举
	private int reward_random_type;

	// 分享链接
	private String share_icon;

	// 客户端显示位置
	private int display_target;

	// 活动任务分享图
	private String share_mission_images;

	// 活动按概率随机奖励
	private Map<Integer, List<NewActivityPrizeModel>> activityPrizeMap = new HashMap<>();

	// 任务组
	private List<ActivityMissionGroupModel> missionGroupList = new ArrayList<>();

	// 任务组奖励配置
	private Map<Integer, Map<Integer, List<NewActivityPrizeModel>>> missionGroupPrizeModel = new HashMap<>();
	private Map<Integer, ActivityDaysReward> dailyMissionPrizeMap = new HashMap<>();

	// type=8新手豪礼 每日任务
	private Map<Integer, ActivityEveryDayMission> everydayMissions = new HashMap<>();
	private Map<Integer, ActivityLivenessRewardModel> livenessMap = new HashMap<>();

	private Date myActivityStartTime;
	private Date myActivityEndTime;
	private int include_erweima;// 分享图是否包含二维码

	// 虚拟奖品显示数量
	private int welfare_count;
	private int welfare_receive;

	public int getReload_state() {
		return reload_state;
	}

	public void setReload_state(int reload_state) {
		this.reload_state = reload_state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getReset_prizes() {
		return reset_prizes;
	}

	public void setReset_prizes(int reset_prizes) {
		this.reset_prizes = reset_prizes;
	}

	public String getReset_time() {
		return reset_time;
	}

	public void setReset_time(String reset_time) {
		this.reset_time = reset_time;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getInclude_erweima() {
		return include_erweima;
	}

	public void setInclude_erweima(int include_erweima) {
		this.include_erweima = include_erweima;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGame_id() {
		return game_id;
	}

	public void setGame_id(String game_id) {
		this.game_id = game_id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Integer getPlayer_limit_days() {
		return player_limit_days;
	}

	public void setPlayer_limit_days(Integer player_limit_days) {
		this.player_limit_days = player_limit_days;
	}

	public Integer getActivity_object() {
		return activity_object;
	}

	public void setActivity_object(Integer activity_object) {
		this.activity_object = activity_object;
	}

	public Integer getPrizes_count() {
		return prizes_count;
	}

	public void setPrizes_count(Integer prizes_count) {
		this.prizes_count = prizes_count;
	}

	public String getActivity_start_time() {
		return activity_start_time;
	}

	public void setActivity_start_time(String activity_start_time) {
		this.activity_start_time = activity_start_time;
	}

	public String getActivity_end_time() {
		return activity_end_time;
	}

	public void setActivity_end_time(String activity_end_time) {
		this.activity_end_time = activity_end_time;
	}

	public List<MainPrizes> getMainPrizesList() {
		return mainPrizesList;
	}

	public void setMainPrizesList(List<MainPrizes> mainPrizesList) {
		this.mainPrizesList = mainPrizesList;
	}

	public List<RandomPrizes> getRandomPrizesList() {
		return randomPrizesList;
	}

	public void setRandomPrizesList(List<RandomPrizes> randomPrizesList) {
		this.randomPrizesList = randomPrizesList;
	}

	// public ActivityMission getActivityMission() {
	// return activityMission;
	// }
	// public void setActivityMission(ActivityMission activityMission) {
	// this.activityMission = activityMission;
	// }
	public List<ActivityMissionModel> getActivityMissionList() {
		return activityMissionList;
	}

	public void setActivityMissionList(List<ActivityMissionModel> activityMissionList) {
		this.activityMissionList = activityMissionList;
	}

	public Integer getActivity_condition() {
		return activity_condition;
	}

	public void setActivity_condition(Integer activity_condition) {
		this.activity_condition = activity_condition;
	}

	public int getActivity_start_type() {
		return activity_start_type;
	}

	public void setActivity_start_type(int activity_start_type) {
		this.activity_start_type = activity_start_type;
	}

	public int getStart_avaliable_time() {
		return start_avaliable_time;
	}

	public void setStart_avaliable_time(int start_avaliable_time) {
		this.start_avaliable_time = start_avaliable_time;
	}

	public int getReward_random_type() {
		return reward_random_type;
	}

	public void setReward_random_type(int reward_random_type) {
		this.reward_random_type = reward_random_type;
	}

	public Map<Integer, List<NewActivityPrizeModel>> getActivityPrizeMap() {
		return activityPrizeMap;
	}

	public void setActivityPrizeMap(Map<Integer, List<NewActivityPrizeModel>> activityPrizeMap) {
		this.activityPrizeMap = activityPrizeMap;
	}

	public String getShare_icon() {
		return share_icon;
	}

	public void setShare_icon(String share_icon) {
		this.share_icon = share_icon;
	}

	public Date getMyActivityStartTime() {
		return myActivityStartTime;
	}

	public void setMyActivityStartTime(Date myActivityStartTime) {
		this.myActivityStartTime = myActivityStartTime;
	}

	public Date getMyActivityEndTime() {
		return myActivityEndTime;
	}

	public void setMyActivityEndTime(Date myActivityEndTime) {
		this.myActivityEndTime = myActivityEndTime;
	}

	public List<ActivityMissionGroupModel> getMissionGroupList() {
		return missionGroupList;
	}

	public void setMissionGroupList(List<ActivityMissionGroupModel> missionGroupList) {
		this.missionGroupList = missionGroupList;
	}

	public int getDisplay_target() {
		return display_target;
	}

	public void setDisplay_target(int display_target) {
		this.display_target = display_target;
	}

	public Map<Integer, Map<Integer, List<NewActivityPrizeModel>>> getMissionGroupPrizeModel() {
		return missionGroupPrizeModel;
	}

	public void setMissionGroupPrizeModel(Map<Integer, Map<Integer, List<NewActivityPrizeModel>>> missionGroupPrizeModel) {
		this.missionGroupPrizeModel = missionGroupPrizeModel;
	}

	public Map<Integer, ActivityEveryDayMission> getEverydayMissions() {
		return everydayMissions;
	}

	public void setEverydayMissions(Map<Integer, ActivityEveryDayMission> everydayMissions) {
		this.everydayMissions = everydayMissions;
	}

	public Map<Integer, ActivityDaysReward> getDailyMissionPrizeMap() {
		return dailyMissionPrizeMap;
	}

	public void setDailyMissionPrizeMap(Map<Integer, ActivityDaysReward> dailyMissionPrizeMap) {
		this.dailyMissionPrizeMap = dailyMissionPrizeMap;
	}

	public String getShare_mission_images() {
		return share_mission_images;
	}

	public void setShare_mission_images(String share_mission_images) {
		this.share_mission_images = share_mission_images;
	}

	public int getWelfare_count() {
		return welfare_count;
	}

	public void setWelfare_count(int welfare_count) {
		this.welfare_count = welfare_count;
	}

	public int getWelfare_receive() {
		return welfare_receive;
	}

	public void setWelfare_receive(int welfare_receive) {
		this.welfare_receive = welfare_receive;
	}

	public Map<Integer, ActivityLivenessRewardModel> getLivenessMap() {
		return livenessMap;
	}

	public void setLivenessMap(Map<Integer, ActivityLivenessRewardModel> livenessMap) {
		this.livenessMap = livenessMap;
	}

}
