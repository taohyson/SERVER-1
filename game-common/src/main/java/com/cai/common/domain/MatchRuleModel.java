package com.cai.common.domain;

import java.util.Date;

/**
 * 比赛玩法配置
 */
public class MatchRuleModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int game_type;
	private int game_id;
	private String rule_ids; 
	private int match_id;
	private String match_name;
	private String icon;
	//比赛类别、分类
	private int match_type;
	//比赛排序
	private int match_sort;
	private Date create_time;
	private String match_desc;
	
	private int match_begin_type;//比赛开始类型，1定时开赛，2人满开赛
	
	private int match_union_id;//所属联赛id
	private int logic_id;//逻辑服id，由开发人员确定后再填
	private String tips;//比赛报名说明
	private String iconTitle;//图标
	
	private String rule_description;
	private int match_status;
	private int match_union_child_type;
	private String recommend_icon;
	private int recommend_sort;
	private String banner_url;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGame_type() {
		return game_type;
	}
	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public String getRule_ids() {
		return rule_ids;
	}
	public void setRule_ids(String rule_ids) {
		this.rule_ids = rule_ids;
	}
	public int getMatch_id() {
		return match_id;
	}
	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}
	public String getMatch_name() {
		return match_name;
	}
	public void setMatch_name(String match_name) {
		this.match_name = match_name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getMatch_type() {
		return match_type;
	}
	public void setMatch_type(int match_type) {
		this.match_type = match_type;
	}
	public int getMatch_sort() {
		return match_sort;
	}
	public void setMatch_sort(int match_sort) {
		this.match_sort = match_sort;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getMatch_desc() {
		return match_desc;
	}
	public void setMatch_desc(String match_desc) {
		this.match_desc = match_desc;
	}
	public int getMatch_begin_type() {
		return match_begin_type;
	}
	public void setMatch_begin_type(int match_begin_type) {
		this.match_begin_type = match_begin_type;
	}
	public int getMatch_union_id() {
		return match_union_id;
	}
	public void setMatch_union_id(int match_union_id) {
		this.match_union_id = match_union_id;
	}
	public int getLogic_id() {
		return logic_id;
	}
	public void setLogic_id(int logic_id) {
		this.logic_id = logic_id;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getIconTitle() {
		return iconTitle;
	}
	public void setIconTitle(String iconTitle) {
		this.iconTitle = iconTitle;
	}
	public MatchRuleModel(MatchModel model) {
		super();
		this.id = 0;
		this.game_type = model.getGame_type();
		this.game_id = model.getGame_id();
		this.rule_ids = model.getRule_ids();
		this.match_id = model.getMatch_id();
		this.match_name = model.getMatch_name();
		this.icon = model.getIcon();
		this.match_type = model.getMatch_type();
		this.match_sort = model.getMatch_sort();
		this.create_time = model.getCreate_time();
		this.match_desc = model.getMatch_desc();
		this.match_begin_type = model.getMatch_begin_type();
		this.match_union_id = model.getMatch_union_id();
		this.logic_id = model.getLogic_id();
		this.tips = model.getTips();
		this.iconTitle = model.getIconTitle();
		this.rule_description = model.getRule_description();
		this.match_status = model.getMatch_status();
		this.match_union_child_type = model.getMatch_union_child_type();
		this.recommend_icon = model.getRecommend_icon();
		this.recommend_sort = model.getRecommend_sort();
		this.banner_url = model.getBanner_url();
	}
	public MatchRuleModel() {
	}
	public String getRule_description() {
		return rule_description;
	}
	public void setRule_description(String rule_description) {
		this.rule_description = rule_description;
	}
	public int getMatch_status() {
		return match_status;
	}
	public void setMatch_status(int match_status) {
		this.match_status = match_status;
	}
	public int getMatch_union_child_type() {
		return match_union_child_type;
	}
	public void setMatch_union_child_type(int match_union_child_type) {
		this.match_union_child_type = match_union_child_type;
	}
	public String getRecommend_icon() {
		return recommend_icon;
	}
	public void setRecommend_icon(String recommend_icon) {
		this.recommend_icon = recommend_icon;
	}
	public int getRecommend_sort() {
		return recommend_sort;
	}
	public void setRecommend_sort(int recommend_sort) {
		this.recommend_sort = recommend_sort;
	}
	public String getBanner_url() {
		return banner_url;
	}
	public void setBanner_url(String banner_url) {
		this.banner_url = banner_url;
	}
}
