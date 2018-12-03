/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *
 * @author wu_hc date: 2017年8月2日 下午2:21:33 <br/>
 */
public enum EUrl {

	BAIDU_LBS("https://api.map.baidu.com/location/ip?ip=%s&ak=%s&coor=bd09ll");

	private final String url;

	/**
	 * @param url
	 */
	private EUrl(String url) {
		this.url = url;
	}

	/*
	 * 获取URL
	 */
	public final String url() {
		return this.url;
	}

	/**
	 * 
	 * @param eurl
	 * @param args
	 * @return
	 */
	public static String fullUrl(EUrl eurl, Object... args) {
		return String.format(eurl.url, args);
	}
}
