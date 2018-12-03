/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config;

/**
 * 配置枚举
 * 
 * @author wu_hc
 */
public enum EnumConfig {
	REDIS("redis"), MONGO("mongo"), MYSQL("mysql"), RMI("centerRmi"), CLUB("clubServer"), TEST("test");

	private final String tag;

	EnumConfig(String tag) {
		this.tag = tag;
	}

	public String tag() {
		return this.tag;
	}
}
