/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *
 * @author wu_hc date: 2017年11月11日 下午3:26:22 <br/>
 */
public interface ERedHeartCategory {

	// 请求加入俱乐部
	int CLUB_REQ_ENTER = 1;

	// 俱乐部事件
	int CLUB_EVENT_NOTIFY = 2;

	// 疲劳值修改记录
	int CLUB_TIRE_MODIFY_NOTIFY = 3;

	// 请求退出俱乐部
	int CLUB_REQ_EXIT = 4;
	
	/**
	 * 自建赛新比赛记录
	 */
	int CLUB_MATCH_NEW_LOG = 5;

	/**
	 * 亲友圈福卡抽奖
	 */
	int CLUB_WELFARE_LOTTERY = 6;
}
