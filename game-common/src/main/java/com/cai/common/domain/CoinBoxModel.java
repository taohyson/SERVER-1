// Generated by the DBTool.exe,  DO NOT EDIT!

package com.cai.common.domain;

import java.util.Objects;

/**
 * db:yx_public , table:coin_box date:2018-11-14 10:34:56
 */
public final class CoinBoxModel extends DBBaseModel {

	/**
	 * serial uid
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private int id;

	/**
	 * 宝箱名称
	 */
	private String name;

	/**
	 * 宝箱icon
	 */
	private String icon;

	/**
	 * 宝箱包含金币数量
	 */
	private int amount;

	/**
	 * 排序值
	 */
	private int sort;

	/**
	 * 权重
	 */
	private int weight;

	/**
	 * 是否特殊宝箱(小奖励宝箱)，0否，1是
	 */
	private boolean isSpecial;

	/**
	 * 宝箱所属类型，1金2银3铜
	 */
	private int category;

	/**
	 * 
	 */
	public void setId(int id) {
		if(Objects.equals(this.id,id)) 
			return;
		this.id = id;
		setNeedDB(true);
	}

	/**
	 * 
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * 宝箱名称
	 */
	public void setName(String name) {
		if(Objects.equals(this.name,name)) 
			return;
		this.name = name;
		setNeedDB(true);
	}

	/**
	 * 宝箱名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 宝箱icon
	 */
	public void setIcon(String icon) {
		if(Objects.equals(this.icon,icon)) 
			return;
		this.icon = icon;
		setNeedDB(true);
	}

	/**
	 * 宝箱icon
	 */
	public String getIcon() {
		return this.icon;
	}

	/**
	 * 宝箱包含金币数量
	 */
	public void setAmount(int amount) {
		if(Objects.equals(this.amount,amount)) 
			return;
		this.amount = amount;
		setNeedDB(true);
	}

	/**
	 * 宝箱包含金币数量
	 */
	public int getAmount() {
		return this.amount;
	}

	/**
	 * 排序值
	 */
	public void setSort(int sort) {
		if(Objects.equals(this.sort,sort)) 
			return;
		this.sort = sort;
		setNeedDB(true);
	}

	/**
	 * 排序值
	 */
	public int getSort() {
		return this.sort;
	}

	/**
	 * 权重
	 */
	public void setWeight(int weight) {
		if(Objects.equals(this.weight,weight)) 
			return;
		this.weight = weight;
		setNeedDB(true);
	}

	/**
	 * 权重
	 */
	public int getWeight() {
		return this.weight;
	}

	/**
	 * 是否特殊宝箱(小奖励宝箱)，0否，1是
	 */
	public void setIsSpecial(boolean isSpecial) {
		if(Objects.equals(this.isSpecial,isSpecial)) 
			return;
		this.isSpecial = isSpecial;
		setNeedDB(true);
	}

	/**
	 * 是否特殊宝箱(小奖励宝箱)，0否，1是
	 */
	public boolean getIsSpecial() {
		return this.isSpecial;
	}

	/**
	 * 宝箱所属类型，1金2银3铜
	 */
	public void setCategory(int category) {
		if(Objects.equals(this.category,category)) 
			return;
		this.category = category;
		setNeedDB(true);
	}

	/**
	 * 宝箱所属类型，1金2银3铜
	 */
	public int getCategory() {
		return this.category;
	}

}