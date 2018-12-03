package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class ShopModel implements Serializable {

	private static final long serialVersionUID = -6196911302592574360L;
	
	/**
	 * 代理商品
	 */
	public static final int AGENT_SHOP=0;
	
	/**
	 * 普通商品
	 */
	public static final int NORMAL_SHOP=1;
	
	/**
	 * 红包商品
	 */
	public static final int REDPACKET_SHOP=4;

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
	 * 商品类型 0-代理商品 1-普通商品
	 */
	private int shop_type;

	/**
	 * 房卡数量
	 */
	private int gold;

	/**
	 * 赠送房卡数量
	 */
	private int send_gold;

	/**
	 * 商品出售价格(分为单位 )
	 */
	private int price;

	/**
	 * 排序方式(大的排前面)
	 */
	private int display_order;

	/**
	 * 创建时间
	 */
	private Date create_time;

	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * ICON
	 */
	private String icon;
	
	/**
	 * 热卖标签(0-否 1-是)
	 */
	private int hotTag;
	
	/**
	 * 赠送标签
	 */
	private String sendTag;
	
	/**
	 * 上架开始时间
	 */
	private Date begin_time;
	
	/**
	 * 上架结束时间
	 */
	private Date end_time;
	
	/**
	 * 展示开始时间
	 */
	private Date begin_show_time;
	
	/**
	 * 展示结束时间
	 */
	private Date end_show_time;

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


	/**
	 * 状态(1-正常 0-失效)
	 * 
	 * @return
	 */
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getGame_type() {
		return game_type;
	}

	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}

	public int getShop_type() {
		return shop_type;
	}

	public void setShop_type(int shop_type) {
		this.shop_type = shop_type;
	}

	public int getSend_gold() {
		return send_gold;
	}

	public void setSend_gold(int send_gold) {
		this.send_gold = send_gold;
	}

	public int getDisplay_order() {
		return display_order;
	}

	public void setDisplay_order(int display_order) {
		this.display_order = display_order;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	/**
	 * 是否是代理商品
	 * @return
	 */
	public boolean isAgentShop() {
		return shop_type==AGENT_SHOP;
	}
	
	/**
	 * 商品状态是否正常
	 * @return
	 */
	public boolean isStatusEffect() {
		return state==1;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getHotTag() {
		return hotTag;
	}

	public void setHotTag(int hotTag) {
		this.hotTag = hotTag;
	}

	public String getSendTag() {
		return sendTag;
	}

	public void setSendTag(String sendTag) {
		this.sendTag = sendTag;
	}

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Date getBegin_show_time() {
		return begin_show_time;
	}

	public void setBegin_show_time(Date begin_show_time) {
		this.begin_show_time = begin_show_time;
	}

	public Date getEnd_show_time() {
		return end_show_time;
	}

	public void setEnd_show_time(Date end_show_time) {
		this.end_show_time = end_show_time;
	}


}
