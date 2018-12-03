package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class ItemExchangeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键Id
	 */
	private int id;

	/**
	 * 物品Id
	 */
	private int item_id;
	
	/**
	 * 游戏类型(0-所有)
	 */
	private int game_type;
	/**
	 * 商品类型(0-代理商品 1-普通商品)
	 */
	private int shop_type;
	/**
	 * 物品数量
	 */
	private int item_num;
	/**
	 * 兑换券道具Id
	 */
	private int exchange_item_id;
	/**
	 * 兑换券数量
	 */
	private int exchange_item_num;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 排序方式(大的排前面)
	 */
	private int display_order;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 上架开始时间
	 */
	private Date begin_time;
	/**
	 * 上架结束时间
	 */
	private Date end_time;
	/**
	 * 展示时间(开始)
	 */
	private Date begin_show_time;
	/**
	 * 展示时间(结束)
	 */
	private Date end_show_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemId() {
		return item_id;
	}

	public void setItemId(int item_id) {
		this.item_id = item_id;
	}

	public int getGameType() {
		return game_type;
	}

	public void setGameType(int game_type) {
		this.game_type = game_type;
	}

	public int getShopType() {
		return shop_type;
	}

	public void setShopType(int shop_type) {
		this.shop_type = shop_type;
	}

	public int getItemNum() {
		return item_num;
	}

	public void setItemNum(int item_num) {
		this.item_num = item_num;
	}

	public int getExchangeItemId() {
		return exchange_item_id;
	}

	public void setExchangeItemId(int exchange_item_id) {
		this.exchange_item_id = exchange_item_id;
	}

	public int getExchangeItemNum() {
		return exchange_item_num;
	}

	public void setExchangeItemNum(int exchange_item_num) {
		this.exchange_item_num = exchange_item_num;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getDisplayOrder() {
		return display_order;
	}

	public void setDisplayOrder(int display_order) {
		this.display_order = display_order;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getBeginTime() {
		return begin_time;
	}

	public void setBeginTime(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getEndTime() {
		return end_time;
	}

	public void setEndTime(Date end_time) {
		this.end_time = end_time;
	}

	public Date getBeginShowTime() {
		return begin_show_time;
	}

	public void setBeginShowTime(Date begin_show_time) {
		this.begin_show_time = begin_show_time;
	}

	public Date getEndShowTime() {
		return end_show_time;
	}

	public void setEndShowTime(Date end_show_time) {
		this.end_show_time = end_show_time;
	}
}
