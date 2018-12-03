package com.cai.common.domain.coin;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.util.DescParams;

public class CoinGameDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int round_level;
	private String round_level_name;
	private String round_icon;
	private int round_sort;
	private int game_type_index;
	private String rule_ids;
	private String rule_msg;
	private int base_antes;
	private int base_coin;
	private int min_coin;
	private int max_coin;
	private int lower_limit;
	private int upper_limit;
	private int tools_limit;
	private int play_card_time;
	private int gold_price;
	private int logic_id;
	private int state;
	private int min_match_time;
	private int max_match_time;
	private String oss_name;
	private Date operate_time;
	private int is_add_robot;
	private int count_down_time;
	private String excite_condition_id;
	private String cornucopia_condition_id;
	private int is_open_white_list;
	private String white_list;
	private String corner_icon;
	private int cornucopia_cost;
	private int cornucopia_recycle_ratio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRound_level() {
		return round_level;
	}

	public void setRound_level(int round_level) {
		this.round_level = round_level;
	}

	public String getRound_icon() {
		return round_icon;
	}

	public void setRound_icon(String round_icon) {
		this.round_icon = round_icon;
	}

	public String getRound_level_name() {
		return round_level_name;
	}

	public void setRound_level_name(String round_level_name) {
		this.round_level_name = round_level_name;
	}

	public int getRound_sort() {
		return round_sort;
	}

	public void setRound_sort(int round_sort) {
		this.round_sort = round_sort;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public String getRule_ids() {
		return rule_ids;
	}

	public void setRule_ids(String rule_ids) {
		this.rule_ids = rule_ids;
	}

	public String getRule_msg() {
		return rule_msg;
	}

	public void setRule_msg(String rule_msg) {
		this.rule_msg = rule_msg;
	}

	public int getBase_antes() {
		return base_antes;
	}

	public void setBase_antes(int base_antes) {
		this.base_antes = base_antes;
	}

	public int getBase_coin() {
		return base_coin;
	}

	public void setBase_coin(int base_coin) {
		this.base_coin = base_coin;
	}

	public int getMin_coin() {
		return min_coin;
	}

	public void setMin_coin(int min_coin) {
		this.min_coin = min_coin;
	}

	public int getMax_coin() {
		return max_coin;
	}

	public void setMax_coin(int max_coin) {
		this.max_coin = max_coin;
	}

	public int getLower_limit() {
		return lower_limit;
	}

	public void setLower_limit(int lower_limit) {
		this.lower_limit = lower_limit;
	}

	public int getUpper_limit() {
		return upper_limit;
	}

	public void setUpper_limit(int upper_limit) {
		this.upper_limit = upper_limit;
	}

	public int getTools_limit() {
		return tools_limit;
	}

	public void setTools_limit(int tools_limit) {
		this.tools_limit = tools_limit;
	}

	public int getPlay_card_time() {
		return play_card_time;
	}

	public void setPlay_card_time(int play_card_time) {
		this.play_card_time = play_card_time;
	}

	public int getGold_price() {
		return gold_price;
	}

	public void setGold_price(int gold_price) {
		this.gold_price = gold_price;
	}

	public int getLogic_id() {
		return logic_id;
	}

	public void setLogic_id(int logic_id) {
		this.logic_id = logic_id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getMin_match_time() {
		return min_match_time;
	}

	public void setMin_match_time(int min_match_time) {
		this.min_match_time = min_match_time;
	}

	public int getMax_match_time() {
		return max_match_time;
	}

	public void setMax_match_time(int max_match_time) {
		this.max_match_time = max_match_time;
	}

	public String getOss_name() {
		return oss_name;
	}

	public void setOss_name(String oss_name) {
		this.oss_name = oss_name;
	}

	public Date getOperate_time() {
		return operate_time;
	}

	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}

	public int getIs_add_robot() {
		return is_add_robot;
	}

	public void setIs_add_robot(int is_add_robot) {
		this.is_add_robot = is_add_robot;
	}

	public int getCount_down_time() {
		return count_down_time;
	}

	public void setCount_down_time(int count_down_time) {
		this.count_down_time = count_down_time;
	}

	public String getExcite_condition_id() {
		return excite_condition_id;
	}

	public String getCorner_icon() {
		return corner_icon;
	}

	public void setCorner_icon(String corner_icon) {
		this.corner_icon = corner_icon;
	}

	public void setExcite_condition_id(String excite_condition_id) {
		this.excite_condition_id = excite_condition_id;
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

	public String getCornucopia_condition_id() {
		return cornucopia_condition_id;
	}

	public void setCornucopia_condition_id(String cornucopia_condition_id) {
		this.cornucopia_condition_id = cornucopia_condition_id;
	}

	public int getCornucopia_recycle_ratio() {
		return cornucopia_recycle_ratio;
	}

	public void setCornucopia_recycle_ratio(int cornucopia_recycle_ratio) {
		this.cornucopia_recycle_ratio = cornucopia_recycle_ratio;
	}

	public int getCornucopia_cost() {
		return cornucopia_cost;
	}

	public void setCornucopia_cost(int cornucopia_cost) {
		this.cornucopia_cost = cornucopia_cost;
	}

	public boolean isWhiteAccountId(long accountId) {
		boolean result = true;
		if (is_open_white_list == 1) {
			result = false;
			if (white_list != null && white_list.indexOf(accountId + "") >= 0) {
				result = true;
			}
		}
		return result;
	}

	public boolean isClose() {
		if (state == 2) {
			return true;
		}
		return false;
	}

	public DescParams getRuleParam() {
		DescParams params = new DescParams();
		String[] temps1 = rule_ids.split("\\|");
		params.game_rules = new int[8];
		params._game_type_index = game_type_index;

		for (String temp2 : temps1) {

			String[] ruleStr = temp2.split(",");

			int ruleId = Integer.parseInt(ruleStr[0]);
			int value = Integer.parseInt(ruleStr[1]);
			params.put(ruleId, value);

			if (ruleId < 32) {
				params._game_rule_index = params._game_rule_index | (1 << ruleId);
			}
			int mod = ruleId % 32;
			int index = (ruleId - mod) / 32;
			if (index < params.game_rules.length) {
				params.game_rules[index] = params.game_rules[index] | (1 << mod);
			}
		}

		return params;
	}

}
