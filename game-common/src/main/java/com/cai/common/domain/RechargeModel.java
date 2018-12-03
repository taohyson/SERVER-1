package com.cai.common.domain;

import java.util.Date;

public class RechargeModel {
	private int id;
	private String order_id;
	private long account_id;
	private String nick_name;
	private int shop_id;
	private int sell_type;
	private int recharge_gold;
	private int send_gold;
	private int rmb;
	private Date create_time;
	private Date finish_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public int getSell_type() {
		return sell_type;
	}

	public void setSell_type(int sell_type) {
		this.sell_type = sell_type;
	}

	public int getRecharge_gold() {
		return recharge_gold;
	}

	public void setRecharge_gold(int recharge_gold) {
		this.recharge_gold = recharge_gold;
	}

	public int getSend_gold() {
		return send_gold;
	}

	public void setSend_gold(int send_gold) {
		this.send_gold = send_gold;
	}

	public int getRmb() {
		return rmb;
	}

	public void setRmb(int rmb) {
		this.rmb = rmb;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getFinish_date() {
		return finish_date;
	}

	public void setFinish_date(Date finish_date) {
		this.finish_date = finish_date;
	}

}
