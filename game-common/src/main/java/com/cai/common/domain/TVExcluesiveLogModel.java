package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tv_excluesive_log")
public class TVExcluesiveLogModel implements Serializable {
	/**
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(name = "index_notes_date", unique = false)
	private int notes_date;
	private int total_register;// 总注册人数 1
	private int today_inc;// 今日新增1
	private int totay_active;// 今日活跃
	private int today_pay;// 今日付费金额
	private int day1;// 1日留存
	private int day3;// 3日留存
	private int day5;// 5日留存
	private int day7;// 7日留存
	private int day15;// 15日留存
	private int day30;// 30日留存
	private long total_recharge_gold;// 总充值豆数1
	private long total_consume_gold;// 总消耗豆数1
	private long total_exchange_coin;// 总兑换金币数
	private long total_brand;// 总牌局数
	private int match_brand_count;// 今日比赛场参与数
	private long coin_brand_count;// 今日金币场参与数
	private int today_consume_gold;// 今日消耗豆数
	private int today_recharge_gold;// 今日充值豆数
	private long today_exchange_coin;// 今日兑换金币数
	private int totay_brand;// 今日牌局数
	private int join_club_members;// 加入俱乐部用户数
	private int join_club_members_percent;// 加入俱乐部用户占千分比

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

	public int getTotal_register() {
		return total_register;
	}

	public void setTotal_register(int total_register) {
		this.total_register = total_register;
	}

	public int getToday_inc() {
		return today_inc;
	}

	public void setToday_inc(int today_inc) {
		this.today_inc = today_inc;
	}

	public int getTotay_active() {
		return totay_active;
	}

	public void setTotay_active(int totay_active) {
		this.totay_active = totay_active;
	}

	public int getToday_pay() {
		return today_pay;
	}

	public void setToday_pay(int today_pay) {
		this.today_pay = today_pay;
	}

	public int getDay1() {
		return day1;
	}

	public void setDay1(int day1) {
		this.day1 = day1;
	}

	public int getDay3() {
		return day3;
	}

	public void setDay3(int day3) {
		this.day3 = day3;
	}

	public int getDay5() {
		return day5;
	}

	public void setDay5(int day5) {
		this.day5 = day5;
	}

	public int getDay7() {
		return day7;
	}

	public void setDay7(int day7) {
		this.day7 = day7;
	}

	public int getDay15() {
		return day15;
	}

	public void setDay15(int day15) {
		this.day15 = day15;
	}

	public int getDay30() {
		return day30;
	}

	public void setDay30(int day30) {
		this.day30 = day30;
	}

	public long getTotal_recharge_gold() {
		return total_recharge_gold;
	}

	public void setTotal_recharge_gold(long total_recharge_gold) {
		this.total_recharge_gold = total_recharge_gold;
	}

	public long getTotal_consume_gold() {
		return total_consume_gold;
	}

	public void setTotal_consume_gold(long total_consume_gold) {
		this.total_consume_gold = total_consume_gold;
	}

	public long getTotal_exchange_coin() {
		return total_exchange_coin;
	}

	public void setTotal_exchange_coin(long total_exchange_coin) {
		this.total_exchange_coin = total_exchange_coin;
	}

	public int getMatch_brand_count() {
		return match_brand_count;
	}

	public void setMatch_brand_count(int match_brand_count) {
		this.match_brand_count = match_brand_count;
	}

	public long getCoin_brand_count() {
		return coin_brand_count;
	}

	public void setCoin_brand_count(long coin_brand_count) {
		this.coin_brand_count = coin_brand_count;
	}

	public int getToday_consume_gold() {
		return today_consume_gold;
	}

	public void setToday_consume_gold(int today_consume_gold) {
		this.today_consume_gold = today_consume_gold;
	}

	public int getToday_recharge_gold() {
		return today_recharge_gold;
	}

	public void setToday_recharge_gold(int today_recharge_gold) {
		this.today_recharge_gold = today_recharge_gold;
	}

	public long getToday_exchange_coin() {
		return today_exchange_coin;
	}

	public void setToday_exchange_coin(long today_exchange_coin) {
		this.today_exchange_coin = today_exchange_coin;
	}

	public int getJoin_club_members() {
		return join_club_members;
	}

	public void setJoin_club_members(int join_club_members) {
		this.join_club_members = join_club_members;
	}

	public int getJoin_club_members_percent() {
		return join_club_members_percent;
	}

	public void setJoin_club_members_percent(int join_club_members_percent) {
		this.join_club_members_percent = join_club_members_percent;
	}

	public long getTotal_brand() {
		return total_brand;
	}

	public void setTotal_brand(long total_brand) {
		this.total_brand = total_brand;
	}

	public int getTotay_brand() {
		return totay_brand;
	}

	public void setTotay_brand(int totay_brand) {
		this.totay_brand = totay_brand;
	}

}
