/**
 * 
 */
package com.cai.common.domain;

/**
 * @author xwy
 *苹果商城
 */
import java.io.Serializable;
import java.util.Date;

public class AppShopModel implements Serializable {

	/**
	 * 
	 */
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

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}


}
