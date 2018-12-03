package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class GoodsModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8874586574444664311L;

	private int id;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 状态(1-正常 0-失效)
	 */
	private int state;

	/**
	 * 游戏类型 0-表示所有
	 */
	private int game_type;

	/**
	 * 金币money数量
	 */
	private int money;

	/**
	 * 商品ID
	 */
	private int goodID;

	/**
	 * 排序方式(大的排前面)
	 */
	private int display_order;


	private Date create_time;

	private String remark;

	/**
	 * ICON
	 */
	private String icon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getGoodID() {
		return goodID;
	}

	public void setGoodID(int goodID) {
		this.goodID = goodID;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getGame_type() {
		return game_type;
	}

	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}
	
	public int getDisplay_order() {
		return display_order;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public void setDisplay_order(int display_order) {
		this.display_order = display_order;
	}

}
