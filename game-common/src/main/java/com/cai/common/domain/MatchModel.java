package com.cai.common.domain;

import java.util.Date;

/**
 * 比赛场
 */
public class MatchModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int game_type;
	private int game_id;
	private String rule_ids;
	private int match_id;
	private String match_name;
	private String icon;
	private int logic_id;
	//比赛类别、分类
	private int match_type;
	//比赛排序
	private int match_sort;
	private String tips;//比赛报名说明
	private String iconTitle;//图标
	private Date create_time;
	private String match_desc;
	private int min_persons;
	private int max_persons;
	//初始积分
	private int base_score;
	//每局费用
	private int score_cost;
	//是否结算金币，0不结算，1结算
	private int balance;
	
	private int is_cancel;//是否可以退出比赛
	//入场金币要求
	private int coin_limit;
	//时间间隔
	private int time_area;
	//所需闲逸豆
	private int gold_cost;
	//所需金币
	private int coin_cost;
	//每天免费次数
	private int free_times;
	//每天分享次数
	private int share_free_times;
	//分享图片
	private String share_icon;
	//所需门票
	private int ticket_type;
	//每日开赛时间
	private String daily_begin_time;
	//每日结束时间
	private String daily_end_time;
	//比赛开始时间
	private Date match_begin_time;
	//比赛结束时间
	private Date match_end_time;
	//赛制选择，1打立出局,选了这个必须要配置定局赛规则
	private int out_right_type;
	
	//base_times打立出局初始倍数
	private String out_detail;//根据总人数范围确定晋级人数{base_times:10,upgrade:[{area:"1,120",num:18},{area:"120,500",num:72}{}]}
	
	//定局赛
	private int static_type;
	//定局赛规则配置详情base_num固定基数，base_score固定底分//base_times定局初始倍数
	private String static_detail;//包含内容{base_times:10,base_num:100,base_score:10,upgrade:[{area:"1,120",num:18},{area:"120,500",num:72}{}]}
	//定局赛局数配置
	private String upgrade_detail;//包含内容[{round:1,upgrade:[{area:"1,120",num:18},{}]},{}]
	private String prize_detail;
	private String base_detail;
	private int match_begin_type;//比赛开始类型，1定时开赛，2人满开赛
	private int match_union_id;//所属联赛id
	
	private String client_begin_time;
	
	private String client_end_time;
	
	private String rule_description;
	
	private int match_status;
	
	private boolean is_add_robot;
	
	private boolean is_auto_start;
	
	private String rs_shift_detail;
	
	private String match_label;
	private Date order_start_time;
	private Date order_end_time;
	//比赛每一局时间
	private int round_time;
	//加时赛场数
	private int play_off_round;
	//出牌时间
	private int play_card_time;
	private int match_union_child_type;
	private String recommend_icon;
	private int recommend_sort;
	private String loop_rule;  //循环时间规则
	private String prize_float_detail;
	private int cheat;
	private int is_open_white_list;//0不开启1开启
	private String white_list;
	private String banner_url;
	private String rank_times;
	private String rank_type_info;
	private String open_info;
	private String revive_detail; //复活配置
	
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
	public int getLogic_id() {
		return logic_id;
	}
	public void setLogic_id(int logic_id) {
		this.logic_id = logic_id;
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
	
	
	public int getIs_cancel() {
		return is_cancel;
	}
	public void setIs_cancel(int is_cancel) {
		this.is_cancel = is_cancel;
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
	public int getMin_persons() {
		return min_persons;
	}
	public void setMin_persons(int min_persons) {
		this.min_persons = min_persons;
	}
	public int getMax_persons() {
		return max_persons;
	}
	public void setMax_persons(int max_persons) {
		this.max_persons = max_persons;
	}
	public int getBase_score() {
		return base_score;
	}
	public void setBase_score(int base_score) {
		this.base_score = base_score;
	}
	public int getScore_cost() {
		return score_cost;
	}
	public void setScore_cost(int score_cost) {
		this.score_cost = score_cost;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCoin_limit() {
		return coin_limit;
	}
	public void setCoin_limit(int coin_limit) {
		this.coin_limit = coin_limit;
	}
	public int getTime_area() {
		return time_area;
	}
	public void setTime_area(int time_area) {
		this.time_area = time_area;
	}
	public int getGold_cost() {
		return gold_cost;
	}
	public void setGold_cost(int gold_cost) {
		this.gold_cost = gold_cost;
	}
	public int getCoin_cost() {
		return coin_cost;
	}
	public void setCoin_cost(int coin_cost) {
		this.coin_cost = coin_cost;
	}
	public int getFree_times() {
		return free_times;
	}
	public void setFree_times(int free_times) {
		this.free_times = free_times;
	}
	public int getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(int ticket_type) {
		this.ticket_type = ticket_type;
	}
	public String getDaily_begin_time() {
		return daily_begin_time;
	}
	public void setDaily_begin_time(String daily_begin_time) {
		this.daily_begin_time = daily_begin_time;
	}
	public String getDaily_end_time() {
		return daily_end_time;
	}
	public void setDaily_end_time(String daily_end_time) {
		this.daily_end_time = daily_end_time;
	}
	public Date getMatch_begin_time() {
		return match_begin_time;
	}
	public void setMatch_begin_time(Date match_begin_time) {
		this.match_begin_time = match_begin_time;
	}
	public Date getMatch_end_time() {
		return match_end_time;
	}
	public void setMatch_end_time(Date match_end_time) {
		this.match_end_time = match_end_time;
	}
	public int getOut_right_type() {
		return out_right_type;
	}
	public void setOut_right_type(int out_right_type) {
		this.out_right_type = out_right_type;
	}
	public String getOut_detail() {
		return out_detail;
	}
	public void setOut_detail(String out_detail) {
		this.out_detail = out_detail;
	}
	public int getStatic_type() {
		return static_type;
	}
	public void setStatic_type(int static_type) {
		this.static_type = static_type;
	}
	public String getStatic_detail() {
		return static_detail;
	}
	public void setStatic_detail(String static_detail) {
		this.static_detail = static_detail;
	}
	public String getUpgrade_detail() {
		return upgrade_detail;
	}
	public void setUpgrade_detail(String upgrade_detail) {
		this.upgrade_detail = upgrade_detail;
	}
	public String getPrize_detail() {
		return prize_detail;
	}
	public void setPrize_detail(String prize_detail) {
		this.prize_detail = prize_detail;
	}
	public String getBase_detail() {
		return base_detail;
	}
	public void setBase_detail(String base_detail) {
		this.base_detail = base_detail;
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
	public String getClient_begin_time() {
		return client_begin_time;
	}
	public void setClient_begin_time(String client_begin_time) {
		this.client_begin_time = client_begin_time;
	}
	public String getClient_end_time() {
		return client_end_time;
	}
	public void setClient_end_time(String client_end_time) {
		this.client_end_time = client_end_time;
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
	public boolean isIs_add_robot() {
		return is_add_robot;
	}
	public void setIs_add_robot(boolean is_add_robot) {
		this.is_add_robot = is_add_robot;
	}
	public boolean isIs_auto_start() {
		return is_auto_start;
	}
	public void setIs_auto_start(boolean is_auto_start) {
		this.is_auto_start = is_auto_start;
	}
	public String getRs_shift_detail() {
		return rs_shift_detail;
	}
	public void setRs_shift_detail(String rs_shift_detail) {
		this.rs_shift_detail = rs_shift_detail;
	}
	public String getMatch_label() {
		return match_label;
	}
	public void setMatch_label(String match_label) {
		this.match_label = match_label;
	}
	public Date getOrder_start_time() {
		return order_start_time;
	}
	public void setOrder_start_time(Date order_start_time) {
		this.order_start_time = order_start_time;
	}
	public Date getOrder_end_time() {
		return order_end_time;
	}
	public void setOrder_end_time(Date order_end_time) {
		this.order_end_time = order_end_time;
	}
	public int getRound_time() {
		return round_time;
	}
	public void setRound_time(int round_time) {
		this.round_time = round_time;
	}
	public int getPlay_off_round() {
		return play_off_round;
	}
	public void setPlay_off_round(int play_off_round) {
		this.play_off_round = play_off_round;
	}
	public int getMatch_union_child_type() {
		return match_union_child_type;
	}
	public void setMatch_union_child_type(int match_union_child_type) {
		this.match_union_child_type = match_union_child_type;
	}
	public int getShare_free_times() {
		return share_free_times;
	}
	public void setShare_free_times(int share_free_times) {
		this.share_free_times = share_free_times;
	}
	public String getShare_icon() {
		return share_icon;
	}
	public void setShare_icon(String share_icon) {
		this.share_icon = share_icon;
	}
	public int getPlay_card_time() {
		return play_card_time;
	}
	public void setPlay_card_time(int play_card_time) {
		this.play_card_time = play_card_time;
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
	public String getLoop_rule() {
		return loop_rule;
	}
	public void setLoop_rule(String loop_rule) {
		this.loop_rule = loop_rule;
	}
	public String getPrize_float_detail() {
		return prize_float_detail;
	}
	public void setPrize_float_detail(String prize_float_detail) {
		this.prize_float_detail = prize_float_detail;
	}
	public int getCheat() {
		return cheat;
	}
	public void setCheat(int cheat) {
		this.cheat = cheat;
	}
	public int getIs_open_white_list() {
		return is_open_white_list;
	}
	public void setIs_open_white_list(int is_open_white_list) {
		this.is_open_white_list = is_open_white_list;
	}
	public String getWhite_list() {
		return white_list;
	}
	public void setWhite_list(String white_list) {
		this.white_list = white_list;
	}
	public String getBanner_url() {
		return banner_url;
	}
	public void setBanner_url(String banner_url) {
		this.banner_url = banner_url;
	}
	public String getOpen_info() {
		return open_info;
	}
	public void setOpen_info(String open_info) {
		this.open_info = open_info;
	}
	public String getRank_times() {
		return rank_times;
	}
	public void setRank_times(String rank_times) {
		this.rank_times = rank_times;
	}
	public String getRank_type_info() {
		return rank_type_info;
	}
	public void setRank_type_info(String rank_type_info) {
		this.rank_type_info = rank_type_info;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getRevive_detail() {
		return revive_detail;
	}
	public void setRevive_detail(String revive_detail) {
		this.revive_detail = revive_detail;
	}
	
}
