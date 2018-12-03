package com.cai.common.domain;

import java.util.Date;

public class ItemModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 主键id
	private int id;
	// 道具类型1普通道具，2参赛券，3红包，4实物，5活动奖励， 6货币
	private int itemType;
	// 道具类别1兑换券，2线上参赛券，3线下参赛券，4红包，5京东卡，6话费卡，7实物，
	// 8活动红包，9闲逸豆，10金币， 11福卡, 12爱奇艺会员卡
	private int type;
	// 道具ID
	private int itemId;
	// 道具名称
	private String name;
	// 描述
	private String description;
	// 道具icon
	private String icon;
	// 有效期---多少天
	private int expirationData;
	// 关联比赛
	private int relationMatch;
	// 使用起始时间
	private Date useStartTime;
	// 使用结束时间
	private Date useEndTime;
	// 赠送好友
	private int give;
	// 此处奖品用于展示用-例如 “1-3名：XXXX"
	// 奖品信息展示
	private String prizeDesc; // 包含内容：[{rank:第一名，description:赠送宝马},{rank:第二名，description:xxxxxxxx}]
	
	private String prize_icon; //奖励图标
	
	/**
	 * 排序参数
	 */
	private int display_order;
	
	/**
	 * 卡密金额
	 */
	private int card_money;

	public int getItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getExpirationData() {
		return expirationData;
	}

	public void setExpirationData(int expirationData) {
		this.expirationData = expirationData;
	}

	public int getRelationMatch() {
		return relationMatch;
	}

	public void setRelationMatch(int relationMatch) {
		this.relationMatch = relationMatch;
	}

	public Date getUseStartTime() {
		return useStartTime;
	}

	public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

	public Date getUseEndTime() {
		return useEndTime;
	}

	public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

	public int getGive() {
		return give;
	}

	public void setGive(int give) {
		this.give = give;
	}

	public String getPrizeDesc() {
		return prizeDesc;
	}

	public void setPrizeDesc(String prizeDesc) {
		this.prizeDesc = prizeDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrize_icon() {
		return prize_icon;
	}

	public void setPrize_icon(String prize_icon) {
		this.prize_icon = prize_icon;
	}

	public int getDisplay_order() {
		return display_order;
	}

	public void setDisplay_order(int display_order) {
		this.display_order = display_order;
	}

	public int getCard_money() {
		return card_money;
	}

	public void setCard_money(int card_money) {
		this.card_money = card_money;
	}
	

}
