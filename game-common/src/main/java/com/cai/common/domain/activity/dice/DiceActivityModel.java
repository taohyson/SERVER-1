package com.cai.common.domain.activity.dice;

import java.io.Serializable;

/**
 * 骰子活动
 * @author chansonyan
 * 2018年11月23日
 */
public class DiceActivityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;

	private String game_id;

	private String name;

	private String content;

	// 活动开始时间
	private String activity_start_time;
	
	// 活动结束时间
	private String activity_end_time;

	// 上线状态，0下线，1上线
	private int state;

	// 备注
	private String remark;
	// 分享链接
	private String share_icon;

	// 活动任务分享图
	private String share_mission_images;
	
	// 分享图是否包含二维码
	private int include_erweima;
	
	// 消耗豆
	private String gold_cost_section;
	
	//骰子活动任务
	private String dice_task;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getShare_icon() {
		return share_icon;
	}

	public void setShare_icon(String share_icon) {
		this.share_icon = share_icon;
	}

	public String getShare_mission_images() {
		return share_mission_images;
	}

	public void setShare_mission_images(String share_mission_images) {
		this.share_mission_images = share_mission_images;
	}

	public int getInclude_erweima() {
		return include_erweima;
	}

	public void setInclude_erweima(int include_erweima) {
		this.include_erweima = include_erweima;
	}

	public String getGold_cost_section() {
		return gold_cost_section;
	}

	public void setGold_cost_section(String gold_cost_section) {
		this.gold_cost_section = gold_cost_section;
	}

	public String getDice_task() {
		return dice_task;
	}

	public void setDice_task(String dice_task) {
		this.dice_task = dice_task;
	}
	
}
