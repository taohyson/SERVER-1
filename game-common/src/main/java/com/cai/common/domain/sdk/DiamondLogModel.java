package com.cai.common.domain.sdk;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 钻石充值消耗流水日志
 * @author chansonyan
 * 2018年9月11日
 */
@Document(collection = "diamond_log")
public class DiamondLogModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	public static final String DIAMONDATTACH="DIAMOND";

	@Id
	private String _id;
	
	//本地订单流水号
	private String orderID;
	
	//第三方平台订单号
	@Indexed
	private String centerOrderID;
	
	//玩家帐号ID
	@Indexed
	private Long accountId;
	
	//微信昵称
	private String nickname;
	
	//帐号类型(1--代理 0-普通)
	private int accountType;

	//对应枚举类型ESellType
	private Integer sellType;

	//商品ID >0 商品ID -1非购买
	@Indexed
	private Integer shopId;

	//购买的钻石数
	private Integer cardNum;

	//购买赠送的钻石数
	private Integer sendNum;
	
	//花费的rmb
	private Integer rmb;
	
	//如果为兑换CP商品，消耗的钻石数
	private Integer costDiamond;
	
	//收款帐号ID
	private Integer cashAccountID;

	//收款帐号名
	@Indexed
	private String cashAccountName;
	
	//备注
	private String remark;
	
	//订单创建时间
	private Date create_time;

	//后台管理员ID
	private String ossID;
	
	//后台管理员名字
	private String ossName;

	//订单状态 -针对本游戏客户端充值才有 0-成功 1-临时 2-异常
	private int orderStatus;
	
	//订单真正完成时间 ---针对本游戏客户端充值才有
	private Date finishDate;
	
	private String orderSoures;
	
	// SDK_APP ID
	private long gameId;
	
	// 商品名称，可以对应SDK_APP_SHOP和SDK_DIAMOND_SHOP商品
	private String shopName;
	
	// 操作界面 -> UIType
	private int uiType; 
	
	// 操作子界面 -> UIType
	private int subUiType; 
	
	// 操作值
	private int opId; 
	
	// 渠道id
	private int channelId;
	
	//历史值
	private int oldNum;
	
	//当前值
	private int curNum;
	
	//sdk支付ID
	private String sdkPrepID;

	public String getSdkPrepID() {
		return sdkPrepID;
	}

	public void setSdkPrepID(String sdkPrepID) {
		this.sdkPrepID = sdkPrepID;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getCenterOrderID() {
		return centerOrderID;
	}

	public void setCenterOrderID(String centerOrderID) {
		this.centerOrderID = centerOrderID;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public Integer getSellType() {
		return sellType;
	}

	public void setSellType(Integer sellType) {
		this.sellType = sellType;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getCardNum() {
		return cardNum;
	}

	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}

	public Integer getSendNum() {
		return sendNum;
	}

	public void setSendNum(Integer sendNum) {
		this.sendNum = sendNum;
	}

	public Integer getRmb() {
		return rmb;
	}

	public void setRmb(Integer rmb) {
		this.rmb = rmb;
	}

	public Integer getCostDiamond() {
		return costDiamond;
	}

	public void setCostDiamond(Integer costDiamond) {
		this.costDiamond = costDiamond;
	}

	public Integer getCashAccountID() {
		return cashAccountID;
	}

	public void setCashAccountID(Integer cashAccountID) {
		this.cashAccountID = cashAccountID;
	}

	public String getCashAccountName() {
		return cashAccountName;
	}

	public void setCashAccountName(String cashAccountName) {
		this.cashAccountName = cashAccountName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getOssID() {
		return ossID;
	}

	public void setOssID(String ossID) {
		this.ossID = ossID;
	}

	public String getOssName() {
		return ossName;
	}

	public void setOssName(String ossName) {
		this.ossName = ossName;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getOrderSoures() {
		return orderSoures;
	}

	public void setOrderSoures(String orderSoures) {
		this.orderSoures = orderSoures;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getUiType() {
		return uiType;
	}

	public void setUiType(int uiType) {
		this.uiType = uiType;
	}

	public int getSubUiType() {
		return subUiType;
	}

	public void setSubUiType(int subUiType) {
		this.subUiType = subUiType;
	}

	public int getOpId() {
		return opId;
	}

	public void setOpId(int opId) {
		this.opId = opId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public int getOldNum() {
		return oldNum;
	}

	public void setOldNum(int oldNum) {
		this.oldNum = oldNum;
	}

	public int getCurNum() {
		return curNum;
	}

	public void setCurNum(int curNum) {
		this.curNum = curNum;
	} 
	
}
