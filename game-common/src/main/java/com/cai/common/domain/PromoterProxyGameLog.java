/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 推广员代理的游戏统计
 */
@Document(collection = "promoter_proxy_game_log")

public class PromoterProxyGameLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(name = "index_notes_date", unique = false)
	private int notes_date;
	@Indexed(name = "index_accountId", unique = false)
	private long accountId;

	private int brand;// 牌局数

	private long cost;// 消耗豆数

	private List<Integer> games;// 代理的游戏列表

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(int notes_date) {
		this.notes_date = notes_date;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public List<Integer> getGames() {
		return games;
	}

	public void setGames(List<Integer> games) {
		this.games = games;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

}
