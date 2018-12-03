package com.cai.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cai.common.domain.json.MatchLoopRuleModel;
import com.cai.common.domain.json.MatchRuleTimeModel;
import com.cai.common.domain.match.MatchChoiceOpenInfo;
import com.cai.common.domain.match.MatchChoiceRankTypeInfo;
import com.cai.common.domain.match.MatchRankSignUp;
import com.cai.common.util.JsonUtil;
import com.cai.common.util.MyDateUtil;
/**
 * 比赛选项配置
 */
public class MatchChoiceModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int match_id;
	private String match_name;
	private int min_persons;
	private int max_persons;
	//初始积分
	private int base_score;
	//每局费用
	private int score_cost;
	//是否结算金币，0不结算，1结算
	private boolean balance;
	//入场金币要求
	private int coin_limit;
	//时间间隔
	private int time_area;
	//所需闲逸豆
	private int gold_cost;
	//所需金币
	private int coin_cost;
	//所需门票
	private int ticket_type;
	//每天免费次数
	private int free_times;
	private int share_free_times;
	private String share_icon;
	//预约开始时间
	private Date order_start_time;
	//预约开始时间
	private Date order_end_time;
	//每日开赛时间
	private String daily_begin_time;
	//每日结束时间9:30
	private String daily_end_time;
	//比赛开始时间
	private Date match_begin_time;
	//比赛结束时间
	private Date match_end_time;
	
	private Date create_time;
	
	private String client_begin_time;
	
	private String client_end_time;
	
	private int is_cancel;
	
	private boolean is_add_robot;
	
	private boolean is_auto_start;
	
	private String match_label;
	//比赛每一局时间
	private int round_time;
	//加时赛场数
	private int play_off_round;
	//出牌时间
	private int play_card_time;
	//循环时间规则
	private String loop_rule;
	private Date loopNowTime;
	private int cheat;
	private int is_open_white_list;//0不开启1开启
	private String white_list;
	private String rank_times;
	private String rank_type_info;
	private String open_info;
	
	//model
	private MatchLoopRuleModel loopRuleModel;
	private MatchRuleTimeModel defaultLoopModel;
	private MatchChoiceOpenInfo openInfoModel;
	private List<MatchRankSignUp> signUpModels;
	private MatchChoiceRankTypeInfo typeInfoModel;
	private List<Integer> rankTypeList = new ArrayList<>();
	private Map<Integer, MatchRankSignUp> signUpMap = new HashMap<>();

	public Date getLoopNowTime() {
		return loopNowTime;
	}

	public void setLoopNowTime(Date loopNowTime) {
		this.loopNowTime = loopNowTime;
	}

	public int getIs_cancel() {
		return is_cancel;
	}

	public void setIs_cancel(int is_cancel) {
		this.is_cancel = is_cancel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public int getFree_times() {
		return free_times;
	}

	public void setFree_times(int free_times) {
		this.free_times = free_times;
	}

	public int getShare_free_times() {
		return share_free_times;
	}

	public void setShare_free_times(int share_free_times) {
		this.share_free_times = share_free_times;
	}

	public String getMatch_name() {
		return match_name;
	}

	public void setMatch_name(String match_name) {
		this.match_name = match_name;
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

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public MatchChoiceModel(MatchModel model) {

		super();
		this.id = 0;
		this.match_id = model.getMatch_id();
		this.match_name = model.getMatch_name();
		this.min_persons = model.getMin_persons();
		this.max_persons = model.getMax_persons();
		this.base_score = model.getBase_score();
		this.score_cost = model.getScore_cost();
		this.setBalance(model.getBalance() == 1);
		this.coin_limit = model.getCoin_limit();
		this.time_area = model.getTime_area();
		this.gold_cost = model.getGold_cost();
		this.coin_cost = model.getCoin_cost();
		this.ticket_type = model.getTicket_type();
		this.daily_begin_time = model.getDaily_begin_time();
		this.daily_end_time = model.getDaily_end_time();
		this.match_begin_time = model.getMatch_begin_time();
		this.match_end_time = model.getMatch_end_time();
		this.create_time = model.getCreate_time();
		this.free_times = model.getFree_times();
		this.share_free_times = model.getShare_free_times();
		this.share_icon = model.getShare_icon();
		this.client_begin_time = model.getClient_begin_time();
		this.client_end_time = model.getClient_end_time();
		this.is_cancel = model.getIs_cancel();
		this.is_add_robot = model.isIs_add_robot();
		this.is_auto_start = model.isIs_auto_start();
		this.match_label = model.getMatch_label();
		this.order_start_time = model.getOrder_start_time();
		this.order_end_time = model.getOrder_end_time();
		this.round_time = model.getRound_time();
		this.play_off_round = model.getPlay_off_round();
		this.play_card_time = model.getPlay_card_time();
		this.loop_rule = model.getLoop_rule();
		this.cheat = model.getCheat();
		this.is_open_white_list = model.getIs_open_white_list();
		this.white_list = model.getWhite_list();
		this.rank_times = model.getRank_times();
		this.rank_type_info = model.getRank_type_info();
		this.open_info = model.getOpen_info();
		initLoopRuleModel();
		initSignUpModel();
		initTypeInfoModel();
		initOpenInfoModel();
	}
	
	private void initSignUpModel(){
		try{
			if(rank_times != null && rank_times.length() > 0){
				signUpModels = JsonUtil.parseJsonArray(rank_times, MatchRankSignUp.class);
				signUpModels.forEach(model -> {
					signUpMap.put(model.getTimes(), model);
				});
			}
		}catch (Exception e) {
		}
	}
	
	private void initTypeInfoModel(){
		try{
			if(rank_type_info != null && rank_type_info.length() > 0){
				typeInfoModel = JsonUtil.parseJsonObject(rank_type_info, MatchChoiceRankTypeInfo.class);
				String sRankType = typeInfoModel.getRankType();
				String[] rankTypeArr = sRankType.split(",");
				for(String sType : rankTypeArr){
					this.rankTypeList.add(Integer.parseInt(sType));
				}
			}
		}catch (Exception e) {
		}
	}
	
	private void initOpenInfoModel(){
		try{
			if(open_info != null && open_info.length() > 0){
				openInfoModel = JsonUtil.parseJsonObject(open_info, MatchChoiceOpenInfo.class);
			}
		}catch (Exception e) {
		}
	}
	
	private void initLoopRuleModel(){
		if(loop_rule == null || loop_rule.length() <= 0){
			initDefaultLoopRuleModel();
			return;
		}
		try{
			loopRuleModel = JsonUtil.parseJsonObject(loop_rule, MatchLoopRuleModel.class);
			if(!isMoreTime()){
				initDefaultLoopRuleModel();
			}
		}catch (Exception e) {
			loopRuleModel = null;
			initDefaultLoopRuleModel();
		}
	}
	
	private void initDefaultLoopRuleModel(){
		defaultLoopModel = new MatchRuleTimeModel();
		defaultLoopModel.setRound(-1);
		defaultLoopModel.setEnter(daily_begin_time);
		defaultLoopModel.setStart(daily_end_time);
		defaultLoopModel.updateTime(new Date());
	}

	public MatchChoiceModel() {
	}

	public String getClient_end_time() {
		return client_end_time;
	}

	public void setClient_end_time(String client_end_time) {
		this.client_end_time = client_end_time;
	}

	public String getClient_begin_time() {
		return client_begin_time;
	}

	public void setClient_begin_time(String client_begin_time) {
		this.client_begin_time = client_begin_time;
	}

	public boolean isBalance() {
		return balance;
	}

	public void setBalance(boolean balance) {
		this.balance = balance;
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

	public int getPlay_card_time() {
		return play_card_time;
	}

	public void setPlay_card_time(int play_card_time) {
		this.play_card_time = play_card_time;
	}

	public String getShare_icon() {
		return share_icon;
	}

	public void setShare_icon(String share_icon) {
		this.share_icon = share_icon;
	}

	public String getLoop_rule() {
		return loop_rule;
	}

	public void setLoop_rule(String loop_rule) {
		this.loop_rule = loop_rule;
	}

	public MatchLoopRuleModel getLoopRuleModel() {
		return loopRuleModel;
	}

	public void setLoopRuleModel(MatchLoopRuleModel loopRuleModel) {
		this.loopRuleModel = loopRuleModel;
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

	public void setWhite_list(String white_list) {
		this.white_list = white_list;
	}

	private boolean isLoopCycle0(){
		if(loopRuleModel == null){
			return false;
		}
		return loopRuleModel.isLoopCycle();
	}
	
	public boolean isMoreTime(){
		if(loopRuleModel == null){
			return false;
		}
		return loopRuleModel.isMoreTime();
	}
	
	public boolean isInLoopCycle(int weekIndex){
		if(!isLoopCycle0()){
			return true;
		}
		if(loopRuleModel.getLoopCycle().contains(weekIndex)){
			return true;
		}
		
		return false;
	}
	
	public MatchRuleTimeModel getDynamicTime() {
		updateLoopNowTime();
		MatchRuleTimeModel loopTime = defaultLoopModel;
		if(isMoreTime()){
			loopTime = loopRuleModel.getNowLoopTime();
		}
		return loopTime;
	}
	
	public MatchRuleTimeModel getLastDynamicTime() {
		updateLoopNowTime();
		MatchRuleTimeModel loopTime = defaultLoopModel;
		if(isMoreTime()){
			loopTime = loopRuleModel.getLastLoopTime();
		}
		return loopTime;
	}
	
	public MatchRuleTimeModel getFirstDynamicTime() {
		updateLoopNowTime();
		MatchRuleTimeModel loopTime = defaultLoopModel;
		if(isMoreTime()){
			loopTime = loopRuleModel.getFirstLoopTime();
		}
		return loopTime;
	}
	
	private void updateLoopNowTime(){
		if(loopNowTime == null || !MyDateUtil.isSameDay(loopNowTime)){
			loopNowTime = new Date();
			if(isMoreTime()){
				loopRuleModel.initLoopTimeList(loopNowTime);
			}else{
				defaultLoopModel.updateTime(loopNowTime);
			}
		}
	}

	public MatchChoiceOpenInfo getOpenInfoModel() {
		return openInfoModel;
	}

	public List<MatchRankSignUp> getSignUpModels() {
		return signUpModels;
	}
	
	public MatchRankSignUp getSignUp(int times){
		MatchRankSignUp signUp = signUpMap.get(times);
		return signUp;
	}

	public MatchChoiceRankTypeInfo getTypeInfoModel() {
		return typeInfoModel;
	}

	public List<Integer> getRankTypeList() {
		return rankTypeList;
	}
	
}
