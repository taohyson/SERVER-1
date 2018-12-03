package com.cai.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.cai.common.constant.Symbol;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/19 17:12
 */
public class PhoneNumberParseUtils {

	public static String[] getMobileInfoByBaiduApi(String mobileNumber) {
		//百度的API地址
		String urlString = "http://mobsec-dianhua.baidu.com/dianhua_api/open/location?tel=" + mobileNumber;
		StringBuilder sb = new StringBuilder();
		BufferedReader buffer;
		String provinces = "广东";
		String operators = "移动";
		try {
			URL url = new URL(urlString);
			//获取URL地址中的页面内容
			InputStream in = url.openStream();
			// 解决乱码问题
			buffer = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
			String line = null;
			//一行一行的读取数据
			while ((line = buffer.readLine()) != null) {
				sb.append(line);
			}
			in.close();
			buffer.close();
			//定义字符串
			// String objectStr = "{"response":{"***********":{"detail":{"area":[{"city":"开封"}],"province":"河南","type":"domestic","operator":"移动"},"location":"河南开封移动"}},"responseHeader":{"status":200,"time":1532934563306,"version":"1.1.0"}}";
			//1、使用JSONObject
			JSONObject jsonObject = JSONObject.parseObject(sb.toString());
			String result = jsonObject.getString("response");
			// 使用fastjson的parseObject方法将json字符串转换成Map
			LinkedHashMap<String, String> jsonMap = JSON.parseObject(result, new TypeReference<LinkedHashMap<String, String>>() {
			});
			for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
				String value = entry.getValue();
				LinkedHashMap<String, String> jsonMap1 = JSON.parseObject(value, new TypeReference<LinkedHashMap<String, String>>() {
				});
				for (Map.Entry<String, String> entry1 : jsonMap1.entrySet()) {
					if (entry1.getKey().equals("detail")) {
						String value1 = entry1.getValue();
						LinkedHashMap<String, String> jsonMap2 = JSON.parseObject(value1, new TypeReference<LinkedHashMap<String, String>>() {
						});
						for (Map.Entry<String, String> entry2 : jsonMap2.entrySet()) {
							if (entry2.getKey().equals("province")) {
								provinces = entry2.getValue();
							}
							if (entry2.getKey().equals("operator")) {
								operators = entry2.getValue();
							}
							//							if (entry2.getKey().equals("area")) {
							//								String value2 = entry2.getValue();
							//								String value3 = value2.substring(1, value2.length() - 1);
							//								LinkedHashMap<String, String> jsonMap3 = JSON.parseObject(value3, new TypeReference<LinkedHashMap<String, String>>() {
							//								});
							//								for (Map.Entry<String, String> entry3 : jsonMap3.entrySet()) {
							//									city = entry3.getValue();
							//								}
							//							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String[] { provinces, operators };
	}

	public static String[] getMobileInfoByTaobaoApi(String mobileNumber) {
		//淘宝的API地址
		String urlString = "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=" + mobileNumber;
		String provinces = "广东";
		String operators = "移动";
		try {
			String s = getResponseStr(urlString);
			//定义字符串
			// __GetZoneResult_ = {
			//    mts:'1856567',
			//    province:'广东',
			//    catName:'中国联通',
			//    telString:'18565679668',
			//	areaVid:'30517',
			//	ispVid:'137815084',
			//	carrier:'广东联通'
			//}
			String jsonString = s.split("=")[1].trim();//处理=号前的非json字符串
			jsonString = jsonString.substring(1, jsonString.length() - 1);
			String[] strArr1 = jsonString.split(Symbol.COMMA);
			if (strArr1.length > 0) {
				for (String str : strArr1) {
					String[] tempArr = str.split(Symbol.COLON);
					if (tempArr.length == 2) {
						if (tempArr[0].trim().equals("province")) {
							provinces = tempArr[1].trim();
							provinces = provinces.substring(1, provinces.length() - 1);
						} else if (tempArr[0].trim().equals("catName")) {
							operators = tempArr[1].trim();
							operators = operators.substring(1, operators.length() - 1);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String[] { provinces, operators };
	}

	private static String getResponseStr(String urlString) {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(urlString);
			//获取URL地址中的页面内容
			InputStream in = url.openStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "GBK"));
			String inputLine = null;
			while ((inputLine = bufferedReader.readLine()) != null) {
				sb.append(inputLine);
			}
			in.close();
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
