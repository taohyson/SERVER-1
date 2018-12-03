package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class WelfareExchangeModel implements Serializable {

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
	 * 商品名称
	 */
	private String item_name;

	/**
	 * 游戏类型(0-所有)
	 */
	private int game_type;
	/**
	 * 商品类型(0-代理商品 1-普通商品)
	 */
	private int shop_type;

	/**
	 * 限量兑换数量
	 */
	private int limit_num;
	/**
	 * 物品数量
	 */
	private int item_num;
	/**
	 * 福卡数量
	 */
	private int welfare_num;
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

	/**
	 * 商品分类
	 */
	private int goods_type;
	/**
	 * 特惠价格
	 */
	private int discount_price;
	/**
	 * 特惠开始时间
	 */
	private Date discount_begin_time;
	/**
	 * 特惠结束时间
	 */
	private Date discount_end_time;
	/**
	 * 商品描述
	 */
	private String goods_desc;
	/**
	 * 商品规格 格式: 规格1,规格2...
	 */
	private String goods_size;
	/**
	 * 库存类型 0-无限制 1-限制
	 */
	private int limit_type;
	/**
	 * 每人每天限制兑换数量
	 */
	private int daily_limit;
	/**
	 * 轮播图 格式:pic1,pic2...
	 */
	private String view_pic;
	/**
	 * 详情图 格式:pic1,pic2...
	 */
	private String desc_pic;
	/**
	 * 上架状态 0-下架1-上架
	 */
	private int online;

	/**
	 * 标签 1-热卖
	 */
	private int hotTag;

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

	public int getLimit_num() {
		return limit_num;
	}

	public void setLimit_num(int limit_num) {
		this.limit_num = limit_num;
	}

	public int getWelfare_num() {
		return welfare_num;
	}

	public void setWelfare_num(int welfare_num) {
		this.welfare_num = welfare_num;
	}

	public int getGoods_type() {
		return goods_type;
	}

	public void setGoods_type(int goods_type) {
		this.goods_type = goods_type;
	}

	public int getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(int discount_price) {
		this.discount_price = discount_price;
	}

	public Date getDiscount_begin_time() {
		return discount_begin_time;
	}

	public void setDiscount_begin_time(Date discount_begin_time) {
		this.discount_begin_time = discount_begin_time;
	}

	public Date getDiscount_end_time() {
		return discount_end_time;
	}

	public void setDiscount_end_time(Date discount_end_time) {
		this.discount_end_time = discount_end_time;
	}

	public String getGoods_desc() {
		return goods_desc;
	}

	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}

	public String getGoods_size() {
		return goods_size;
	}

	public void setGoods_size(String goods_size) {
		this.goods_size = goods_size;
	}

	public int getLimit_type() {
		return limit_type;
	}

	public void setLimit_type(int limit_type) {
		this.limit_type = limit_type;
	}

	public int getDaily_limit() {
		return daily_limit;
	}

	public void setDaily_limit(int daily_limit) {
		this.daily_limit = daily_limit;
	}

	public String getView_pic() {
		return view_pic;
	}

	public void setView_pic(String view_pic) {
		this.view_pic = view_pic;
	}

	public String getDesc_pic() {
		return desc_pic;
	}

	public void setDesc_pic(String desc_pic) {
		this.desc_pic = desc_pic;
	}

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

	public int getHotTag() {
		return hotTag;
	}

	public void setHotTag(int hotTag) {
		this.hotTag = hotTag;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
}
