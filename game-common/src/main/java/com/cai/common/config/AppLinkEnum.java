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
public enum AppLinkEnum {
	
	OPEN_APP(1,"打开app"),
	OPEN_CLUB(2,"打开俱乐部"),
	OPEN_MATCH(3,"打开比赛"),
	OPEN_REDPACKET(4,"打开分享红包"),
	OPEN_WHEEL(5,"打开转盘"),
	OPEN_SHARE(6,"打开免费送豆"),
	OPEN_REDPACKET_RAIN(7,"打开红包雨"),
	ACTIVITY(8,"打开精彩活动界面"),
	OPEN_SHOP(9,"打开商城界面"),
	OPEN_BACK_PACK(10,"打开背包界面"),
	OPEN_GAME_RECORD(11,"打开战绩界面"),
	OPEN_BUSINESS_COOPERATE(12,"打开商务合作界面"),
	OPEN_PROMOTER(13,"打开推广界面"),
	OPEN_SERVICE(14,"打开客服界面"),
	OPEN_MAIL(15,"打开邮件界面"),
	OPEN_CREATE_HELP(16,"打开创建房间帮助界面"),
	OPEN_QUICKLY_JOIN(17,"打开快速加入游戏界面"),
	CLOSED_CUR_PAGE(18,"关闭当前页面"),
	OPEN_COIN_FIELD(19,"打开金币场"),
	OPEN_BIND_MOBILE(20,"打开手机绑定页面"),
	OPEN_SHARE_DOWNLOAD(21,"打开游戏分享下载页面");

	private final String tag;
	private final int type;
	AppLinkEnum(int type,String tag) {
		this.type = type;
		this.tag = tag;
	}
	
	public int getType() {
		return type;
	}

	public String tag() {
		return this.tag;
	}
}
