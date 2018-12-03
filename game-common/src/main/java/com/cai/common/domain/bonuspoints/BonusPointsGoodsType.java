package com.cai.common.domain.bonuspoints;

/**
 * 积分商品
 * 
 * @author tang
 *
 */
public class BonusPointsGoodsType {

	private int id;// 商品类型
	private String type_desc;// 类型描述
	private int dis_order;// 展示顺序，越大优先级越高
	private int online;// 0下架，1上架

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType_desc() {
		return type_desc;
	}

	public void setType_desc(String type_desc) {
		this.type_desc = type_desc;
	}

	public int getDis_order() {
		return dis_order;
	}

	public void setDis_order(int dis_order) {
		this.dis_order = dis_order;
	}

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

}
