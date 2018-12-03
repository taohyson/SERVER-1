package com.cai.common.type;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/18 11:43
 */
public interface PlayerClubIdentityType {

	/**
	 * 创建人
	 */
	int CREATOR = 1;

	/**
	 * 管理员
	 */
	int MANAGER = 2;

	/**
	 * 既是创建人也是管理员
	 */
	int CREATOR_AND_MANAGER = 3;
}
