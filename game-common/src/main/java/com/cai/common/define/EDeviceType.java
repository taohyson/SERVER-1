package com.cai.common.define;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * sdk设备类型
 * @author wuhaoran
 */
public enum EDeviceType {
	
	IOS(1, "IOS"), 
	ANDROID(2, "Android");
	
	private int id;

	private String desc;
	
	private final static Map<Integer,EDeviceType> deviceTypeMap = new HashMap<>();
	
	public static final Logger logger = LoggerFactory.getLogger(EDeviceType.class);
	
	static {
		for (EDeviceType e : EDeviceType.values()) {
			EDeviceType type = deviceTypeMap.get(e.getId());
			if(type != null) {
				logger.error("###########################EDeviceType定义了相同类型#########################{}",type.getId());
				System.exit(-1);
			}
			deviceTypeMap.put(e.getId(), e);
		}
	}

	EDeviceType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public static Map<Integer, EDeviceType> getDevicetypemap() {
		return deviceTypeMap;
	}
}
