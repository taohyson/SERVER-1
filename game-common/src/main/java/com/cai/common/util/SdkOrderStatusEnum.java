package com.cai.common.util;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * SDK订单状态
 * @author chansonyan
 * 2018年9月6日
 */
public enum SdkOrderStatusEnum {
	
	SUCCESS(1000, "订单完成"),
	INIT(1001, "订单初始化"),		//保存在数据库中，初始化完成
	EXCHANGE_SUCCESS(1002, "大厅兑换成功"),	//已经在大厅兑换成功（扣除大厅货币）保存的状态
	NOTIFYING(1003, "通知中"),	//该订单会连续向CP发起回调通知，直到通知5次失败，变为失败
	FAILED(1004, "通知失败"),	//通知不到CP，状态为失败
	DISCARD(1005, "无效订单");	//调用中心服兑换失败或者RMI调用失败丢弃订单
	
	private int code;
	private String desc;
	private final static Map<Integer,SdkOrderStatusEnum> orderStatusMap = new HashMap<>();
	public static final Logger logger = LoggerFactory.getLogger(SdkOrderStatusEnum.class);
	static {
		for (SdkOrderStatusEnum e : SdkOrderStatusEnum.values()) {
			SdkOrderStatusEnum type = orderStatusMap.get(e.getCode());
			if(type != null) {
				logger.error("###########################SdkOrderStatusEnum定义了相同类型#########################{}",type.getCode());
				System.exit(-1);
			}
			orderStatusMap.put(e.getCode(), e);
		}
	}
	
	
	private SdkOrderStatusEnum(int code, String desc) {
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
	public static Map<Integer, SdkOrderStatusEnum> getOrderStatusmap() {
		return orderStatusMap;
	}
}
