package com.cai.common.util;

/**
 * SDK订单类型
 * @author chansonyan
 * 2018年9月6日
 */
public enum SdkOrderType {
	
	ITEM_EXCHANGE(0, "商品兑换"),
	RMB_RECHARGE(1, "RMB充值");
	
	private int code;
	private String desc;
	
	private SdkOrderType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
