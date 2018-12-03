package com.cai.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 开房类型
 * @author chansonyan
 * 2018年4月17日
 */
public enum OpenRoomTypeEnum {
	
	COMMON_OPEN_ROOM(0,"正常开房"),
	PROXY_OPEN_ROOM(1, "代理开房"),
	ROBOT_OPEN_ROOM(2, "机器人开房"),
	SYS_OPEN_ROOM(3, "系统开房"),
	MATCH_OPEN_ROOM(4, "比赛场开房"),
	CLUB_OPEN_ROOM(5, "俱乐部开房"),
	COIN_OPEN_ROOM(7, "金币场开房");
	
	private static Map<Integer, OpenRoomTypeEnum> map = new HashMap<>();
	
	static {
		for(OpenRoomTypeEnum temp : OpenRoomTypeEnum.values()) {
			map.put(temp.getId(), temp);
		}
	}
	
	private OpenRoomTypeEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	private int id;
	private String name;
	
	public static OpenRoomTypeEnum getEnum(int id) {
		return map.get(id);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
