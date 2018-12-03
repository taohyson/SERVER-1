package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ItemListVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 1添加 0 使用 使用只支持一个
	private final int type;
	private final long accountId;
	private final List<ItemVo> items;

	public ItemListVo(int type, long accountId) {
		items = new ArrayList<>();
		this.type = type;
		this.accountId = accountId;
	}

	public void add(int itemId, int count){
		if(type == 0 && items.size() > 0){
			throw new RuntimeException("物品使用只支持一个");
		}
		items.add(new ItemVo(itemId, count));
	}

	public int getType() {
		return type;
	}

	public List<ItemVo> getItems() {
		return items;
	}

	public long getAccountId() {
		return accountId;
	}

	public class ItemVo implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private final int itemId;
		private final int count;

		private ItemVo(int itemId, int count) {
			this.itemId = itemId;
			this.count = count;
		}

		public int getItemId() {
			return itemId;
		}

		public int getCount() {
			return count;
		}
	}
}
