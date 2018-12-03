/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *
 * date: 2017年12月7日 下午4:45:13 <br/>
 */
@Document(collection = "test_card_log")
public class TestCardModel implements Serializable {
	
	private String _id;
	private Date create_time;
	
	/**
	 * 游戏类型
	 */
	private int game_id;
	
	/**
	 * 游戏规则
	 */
	private int _game_rule_index;
	
	
	/**
	 * 详细描述
	 */
	private int _game_type_index;
	
	/**
	 * 输入的牌型
	 */
	private String debug_my_cards;
	
	/**
	 * 详细描述
	 */
	private String desc;
	/**
	 * 输入参数
	 */
	private String cards_param;
	
	/**
	 * 详细描述
	 */
	private String name;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public int get_game_rule_index() {
		return _game_rule_index;
	}
	public void set_game_rule_index(int _game_rule_index) {
		this._game_rule_index = _game_rule_index;
	}
	public int get_game_type_index() {
		return _game_type_index;
	}
	public void set_game_type_index(int _game_type_index) {
		this._game_type_index = _game_type_index;
	}
	public String getDebug_my_cards() {
		return debug_my_cards;
	}
	public void setDebug_my_cards(String debug_my_cards) {
		this.debug_my_cards = debug_my_cards;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCards_param() {
		return cards_param;
	}
	public void setCards_param(String cards_param) {
		this.cards_param = cards_param;
	}
}
