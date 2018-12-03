package com.cai.common.util;

import java.util.List;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
	
	public static String toJsonString(Object obj){
		return JSON.toJSONString(obj);
	}
	
	public static <T> T parseJsonObject(String msg,Class<T> clazz){
		return JSON.parseObject(msg, clazz);
	}
	
	public static <T> List<T> parseJsonArray(String msg,Class<T> clazz){
		return JSON.parseArray(msg, clazz);
	}
	
	public static JSONObject parseJsonObject(String msg) {
		JSONObject json = JSON.parseObject(msg);
		return json;
	}
	
}
