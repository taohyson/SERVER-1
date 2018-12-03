package com.cai.common.domain;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/8/16 15:09
 */
public class WelfareGoodsTypeModel extends DBBaseModel {

	private static final long serialVersionUID = 6804731025967306956L;
	/**
	 * id
	 */
	private int id;

	/**
	 * 分类名称
	 */
	private String type_desc;

	/**
	 * 排序
	 */
	private int dis_order;

	/**
	 * 状态(0下架1上架)
	 */
	private int online;

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
