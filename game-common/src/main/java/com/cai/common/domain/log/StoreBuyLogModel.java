package com.cai.common.domain.log;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *
 * @author zhanglong date: 2018年4月19日 下午3:42:42
 */
@Document(collection = "store_buy_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_shopType", def = "{'shopType': 1}", background = true),
		@CompoundIndex(name = "index_itemId", def = "{'itemId': 1}", background = true) })
public class StoreBuyLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING)
	private String _id;
	private Date create_time;
	/**
	 * 玩家Id
	 */
	@Indexed
	private long accountId;
	/**
	 * 游戏类型
	 */
	private int gameType;
	/**
	 * 商品类型
	 */
	private int goodsType;
	/**
	 * 商城类型
	 */
	private int shopType;
	/**
	 * 物品Id
	 */
	private int itemId;
	/**
	 * 物品名称
	 */
	private String itemName;
	/**
	 * 物品数量
	 */
	private int itemNum;

	// 辅助字段
	@Transient
	private String gameTypeName;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getGameType() {
		return gameType;
	}

	public void setGameType(int gameType) {
		this.gameType = gameType;
	}

	public int getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(int goodsType) {
		this.goodsType = goodsType;
	}

	public int getShopType() {
		return shopType;
	}

	public void setShopType(int shopType) {
		this.shopType = shopType;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public String getGameTypeName() {
		return gameTypeName;
	}

	public void setGameTypeName(String gameTypeName) {
		this.gameTypeName = gameTypeName;
	}

}
