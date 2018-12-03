package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 玩家游戏列表
 * 
 * @author run
 *
 */

@Document(collection = "account_games_list")
public class AccountGamesModel implements Serializable {
	
	private String _id;
	@Indexed
	private long accountId;
	
	private Set<Integer> games;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Set<Integer> getGames() {
		return games;
	}

	public void setGames(Set<Integer> games) {
		this.games = games;
	}

	
}
