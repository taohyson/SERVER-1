/**
 * 
 */
package com.cai.common.domain;

/**
 * @author xwy
 *
 */

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 每日机器人统计
 * 
 * @author run
 *
 */

@Document(collection = "every_day_club")
public class EveryDayClubModel implements Serializable {

	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date")
	private Integer notes_date;

	/**
	 * 俱乐部Id
	 */
	private int clubId;

	/**
	 * 扣费帐号ID
	 */
	private long account_id;

	/**
	 * 花费的房卡总数
	 */
	private int goldTotal;
	
	private String clubName;
	
	private int game_type_index;
	
	
	private int brandtotal;

	/**
	 * 
	 */
	private String msg;
	
	/**
	 * 扣费帐号ID
	 */
	private long recommend_id;

	public Integer getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}


	public int getGoldTotal() {
		return goldTotal;
	}

	public void setGoldTotal(int goldTotal) {
		this.goldTotal = goldTotal;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public int getBrandtotal() {
		return brandtotal;
	}

	public void setBrandtotal(int brandtotal) {
		this.brandtotal = brandtotal;
	}

	public long getRecommend_id() {
		return recommend_id;
	}

	public void setRecommend_id(long recommend_id) {
		this.recommend_id = recommend_id;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	

}
