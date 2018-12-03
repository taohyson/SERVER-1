package com.cai.common.domain;

import java.io.Serializable;

/**
 * 活动
 *
 */
public class ActivityModel implements Serializable {

	// 类型 1=文字 2=图片,3网页,4红包限时活动,5任务包限时活动 ActivityTypeEnum
	private static final long serialVersionUID = 1L;

	private int id;
	/**
	 * 游戏ID
	 */
	private String game_id;
	/**
	 * 类型 1=文字 2=图片,3网页,4红包限时活动,5任务包限时活动 ActivityTypeEnum
	 */
	private int type;
	/**
	 * 内容
	 */
	private String content;

	private String name;
	/**
	 * 链接
	 */
	private String href;
	/**
	 * 新加字段
	 */
	private Integer player_limit_days;// 玩家活动有效天数
	private Integer activity_condition;// 活动完成限制，1每天可以完成一次,0只能完成一次
	private String remark;// 备注
	private int reset_prizes;// 主奖励重置，0不重置，1按天重置
	private String reset_time;// 每日重置时间
	private Integer activity_object;// 活动对象：0所有用户，1新用户，2代理，3推广员
	private Integer prizes_count;// 奖品总数量
	private String activity_start_time;// 活动开始时间
	private String activity_end_time;// 活动结束时间
	private String main_prizes;// 主要奖品[{红包itemId,红包金额，红包总数}]
	private String random_prizes;// 随机奖励[{type奖品类型,奖品名称,数量}]
	private String activity_mission;// {任务关联ids,任务名，限制条件,任务完成跳转界面}
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

	// 显示位置
	private int display_target;

	// 活动任务分享图
	private String share_mission_images;
	private int include_erweima;
	
	//虚拟奖品显示数量
	private int welfare_count;
	private int welfare_receive;

	public int getReload_state() {
		return reload_state;
	}

	public void setReload_state(int reload_state) {
		this.reload_state = reload_state;
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

	public int getInclude_erweima() {
		return include_erweima;
	}

	public void setInclude_erweima(int include_erweima) {
		this.include_erweima = include_erweima;
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

	public String getMain_prizes() {
		return main_prizes;
	}

	public void setMain_prizes(String main_prizes) {
		this.main_prizes = main_prizes;
	}

	public String getRandom_prizes() {
		return random_prizes;
	}

	public void setRandom_prizes(String random_prizes) {
		this.random_prizes = random_prizes;
	}

	public String getActivity_mission() {
		return activity_mission;
	}

	public void setActivity_mission(String activity_mission) {
		this.activity_mission = activity_mission;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Integer getActivity_condition() {
		return activity_condition;
	}

	public void setActivity_condition(Integer activity_condition) {
		this.activity_condition = activity_condition;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReset_time() {
		return reset_time;
	}

	public void setReset_time(String reset_time) {
		this.reset_time = reset_time;
	}

	public int getReset_prizes() {
		return reset_prizes;
	}

	public void setReset_prizes(int reset_prizes) {
		this.reset_prizes = reset_prizes;
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

	public String getShare_icon() {
		return share_icon;
	}

	public void setShare_icon(String share_icon) {
		this.share_icon = share_icon;
	}

	public int getDisplay_target() {
		return display_target;
	}

	public void setDisplay_target(int display_target) {
		this.display_target = display_target;
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
	
}
