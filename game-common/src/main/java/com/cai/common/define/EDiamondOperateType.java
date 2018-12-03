package com.cai.common.define;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 钻石操作类型
 * @author chansonyan
 * 2018年9月11日
 */
public enum EDiamondOperateType {
	
	//不要用 1 -1
	EXCHANGE(10, "APP商品兑换", "APP商品兑换"),
	RECHARGE_ANZHUO(11,"安卓充值", "安卓充值充值"),
	RECHARGE_IOS(12,"IOS充值", "IOS充值"),
	OSS_SEND(13,"后台操作", "后台操作"),
	;
	
	private int id;
	
	private String idstr;
	
	private String transDesc;
	
	private static final Map<Integer, EDiamondOperateType> map = new ConcurrentHashMap<>();
	
	static {
		for(EDiamondOperateType temp : EDiamondOperateType.values()) {
			map.put(temp.getId(), temp);
		}
	}
	
	
	EDiamondOperateType(int id,String idstr, String transDesc) {
		this.id = id;
		this.idstr = idstr;
		this.transDesc = transDesc;
	}
	
	
	public static EDiamondOperateType ELogType(int id) {
		for (EDiamondOperateType c : EDiamondOperateType.values())
		{
			if(c.id==id)
				return c;
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdstr() {
		return idstr;
	}

	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}

	public String getTransDesc() {
		return transDesc;
	}

	
}
