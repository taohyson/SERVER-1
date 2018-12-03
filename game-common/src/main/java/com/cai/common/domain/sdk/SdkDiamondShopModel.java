package com.cai.common.domain.sdk;

import java.io.Serializable;
import java.util.Date;

/**
 * SDK
 * @author chansonyan
 * 2018年9月25日
 */
public class SdkDiamondShopModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 代理商品
	 */
	public static final int AGENT_SHOP=0;
	
	/**
	 * 普通商品
	 */
	public static final int NORMAL_SHOP=1;

	private int id;
	
	/**
	 * 商品ID
	 */
	private int shop_id;
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
	 * 钻石数量
	 */
	private int diamond;

	/**
	 * 赠送钻石数量
	 */
	private int send_diamond;

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
	
	//是否隐藏
	private int is_hidden;
	
	private int platform;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
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

	public int getDiamond() {
		return diamond;
	}

	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}

	public int getSend_diamond() {
		return send_diamond;
	}

	public void setSend_diamond(int send_diamond) {
		this.send_diamond = send_diamond;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public int getPlatform() {
		return platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}

	public int getIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(int is_hidden) {
		this.is_hidden = is_hidden;
	}
	
}
