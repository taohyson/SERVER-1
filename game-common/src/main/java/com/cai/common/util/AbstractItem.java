package com.cai.common.util;

import java.util.Date;

import com.cai.common.domain.ItemVO;

import protobuf.clazz.s2s.BackpackProto.Backpack;

/**
 * 道具抽象类
 * 
 * @author yu
 *
 */
public abstract class AbstractItem {

	// 道具类别
	protected int type;
	// 道具ID
	protected int itemId;
	// 道具名称
	protected String name;
	// 道具icon
	protected String icon;
	// 描述
	protected String description;
	// 物品创建时间
	protected Date createTime;

	public abstract void initItem(int itemId);

	public abstract boolean addItem(long accountId, int number);

	public abstract boolean delItem(long accountId);

	public abstract String tokenExpirationDataDesc(Date createTime);

	public abstract Backpack.Builder getUseItemsLog(Date useTime);

	public abstract void getUseItemsLogDetail(Date useTime);

	public abstract Tuple<Boolean, Integer, Object> checkEffective(ItemVO item);

	public void intBackpackPro(Backpack.Builder builder, Date createTime) {
	}

	public Backpack.Builder getItemDetail() {
		Backpack.Builder BackpackBuilder = Backpack.newBuilder();
		BackpackBuilder.setBackpackName(name);
		BackpackBuilder.setDescription(description);
		BackpackBuilder.setIcon(icon);

		return BackpackBuilder;
	}

	/**
	 * 使用道具
	 * 
	 * @return
	 */
	public boolean use(long accountId) {
		return true;
	}

	/**
	 * 验证逾期
	 * 
	 * @return
	 */
	public boolean checkOverdue() {
		return false;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
