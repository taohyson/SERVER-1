package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 统计代理真实开房消耗(供微信公众号使用)
 * 
 * @author wuhaoran
 */
@Document(collection = "temp_weixin_proxy_consume_log")
public class TempWeiXinProxyConsumeModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed
	private long account_id; // 账号ID
	private int game_type_index; // 子游戏ID
	private int brand; // 大局数
	private int gold_count; // 扣闲逸豆数
	private int exclusive_gold; // 扣专属豆数
	private int notes_date; // 创建时间

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public int getGold_count() {
		return gold_count;
	}

	public void setGold_count(int gold_count) {
		this.gold_count = gold_count;
	}

	public int getExclusive_gold() {
		return exclusive_gold;
	}

	public void setExclusive_gold(int exclusive_gold) {
		this.exclusive_gold = exclusive_gold;
	}

	public int getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(int notes_date) {
		this.notes_date = notes_date;
	}

}
