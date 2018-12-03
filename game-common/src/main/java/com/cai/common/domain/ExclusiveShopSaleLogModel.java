package com.cai.common.domain;

import org.springframework.data.annotation.Transient;
import java.util.Date;
import java.util.Set;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exclusive_gold_shop_sale_log")
@CompoundIndexes({ @CompoundIndex(name = "index_crate_time", def = "{'create_time': -1}", background = true),
	@CompoundIndex(name = "index_accountId", def = "{'accountId': -1}", background = true),
	@CompoundIndex(name = "index_accountIds", def = "{'accountIds': -1}", background = true),
	@CompoundIndex(name = "index_gameId", def = "{'gameId': -1}", background = true)
		 })
public class ExclusiveShopSaleLogModel {

	private String id;
	private Date create_time;
	private long accountId;
	private Set<Long> accountIds;//关联id
	private int type;//0（转豆upAccountId为赠送者）,1自己充值
	private int level;//充值身份 0普通用户，4代理，3白银推广员，2黄金
	private int gold;
	private int goodsId;
	private int price;
	private int gameId;
	private String remark;
	private int remainGold;
	private String saleDate;
	private int buyType;//购买类型，0进货，1开通代理，2开通推广员
	private String accountName;
	private String orderSeq;//订单号
	private int state;//订单状态
	private String icon;
	@Transient
	private String gameName;
	
	
	
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getBuyType() {
		return buyType;
	}
	public void setBuyType(int buyType) {
		this.buyType = buyType;
	}
	public String getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Set<Long> getAccountIds() {
		return accountIds;
	}
	public void setAccountIds(Set<Long> accountIds) {
		this.accountIds = accountIds;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getRemainGold() {
		return remainGold;
	}
	public void setRemainGold(int remainGold) {
		this.remainGold = remainGold;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	
}
