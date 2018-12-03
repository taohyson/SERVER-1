package com.cai.common.domain.sdk;

import java.io.Serializable;
import java.util.Date;

/**
 * SDK充值订单
 * @author chansonyan
 *
 * 2018年8月22日
 */
public class SdkOrder implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private Long id;
	
	//本地生成的订单号，需要通知到客户端
	private String orderId;
	
	//CP传递的订单号
	private String cpOrderId;
	
	//订单类型（默认0为兑换订单，1为RMB充值订单）
	private Integer orderType;
	
	//账号ID
	private long accountId;
	
	private String openId;
	
	private Long appId;
	
	private String roleId;
	
	private String nickName;
	
	private String zone;
	
	//对应sdk_shop
	private String itemId;
	
	//充值或者兑换金额
	private Double amount;
	
	//实际金额（如果出现SDK打折功能）
	private Double realAmount;
	
	//CP通知地址
	private String notifyUrl;
	
	//CP透传的自定义参数，回调透传到CP notifyURL
	private String callbackInfo;
	
	//回调CP失败次数，每5分钟通知一次，大于5次不再通知，订单变为失败
	private int failedCount;
	
	//当前订单状态
	private int state;
	
	private Date createTime;
	
	private Date updateTime;
	
	//乐观锁
	private int version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCpOrderId() {
		return cpOrderId;
	}

	public void setCpOrderId(String cpOrderId) {
		this.cpOrderId = cpOrderId;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getCallbackInfo() {
		return callbackInfo;
	}

	public void setCallbackInfo(String callbackInfo) {
		this.callbackInfo = callbackInfo;
	}

	public int getFailedCount() {
		return failedCount;
	}

	public void setFailedCount(int failedCount) {
		this.failedCount = failedCount;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	@Override
	public String toString() {
		return "SdkOrder [id=" + id + ", orderId=" + orderId + ", cpOrderId=" + cpOrderId + ", orderType=" + orderType
				+ ", accountId=" + accountId + ", openId=" + openId + ", appId=" + appId + ", roleId=" + roleId
				+ ", nickName=" + nickName + ", zone=" + zone + ", itemId=" + itemId + ", amount=" + amount
				+ ", realAmount=" + realAmount + ", notifyUrl=" + notifyUrl + ", callbackInfo=" + callbackInfo
				+ ", failedCount=" + failedCount + ", state=" + state + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", version=" + version + "]";
	}
	
}
