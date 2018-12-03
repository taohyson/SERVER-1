/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 * 来自ssh后台的一些俱乐部设置
 *
 * @author wu_hc date: 2017年12月1日 下午5:24:20 <br/>
 */
public interface IClubSsheOperateType {

	int CLUB_SETS = 1;

	int CLUB_DEL = 2;

	int UPDATE_CLUB_NAME = 3;

	int UPDATE_CLUB_NOTICE = 4;

	int DISBAND_TABLE = 5;

	int KICK = 6;

	int DEL_RULE = 7;

	int AGREE_ALL = 8;

	// 直接设置clubModel的值
	int COMMON_CLUB_SET = 9;
	
	/**
	 * 俱乐部聊天开关
	 */
	int SET_CHAT = 10;
	
	/**
	 * 俱乐部公告开关
	 */
	int SET_BULLETIN = 11;
	
	/**
	 * 俱乐部跑马灯开关
	 */
	int SET_MARQUEE = 12;
	
}
