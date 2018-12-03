package com.cai.common.define;

/**
 * app推送类别
 * 
 * @author tang
 *1签到推送2分享推送3俱乐部推送4赛事推送5自定义推送6绑定手机推送7比赛开始推送8闲逸豆不足推送
 */
public enum EPushType {
	SIGNUP(1,"签到推送"),
	SHARE(2,"分享推送"),
	CLUB(3,"俱乐部推送"),
	MATCH(4,"赛事推送"),
	DEFINE(5,"自定义推送"),
	BIND_MOBILE(6,"绑定手机推送"),
	MATCH_START(7,"比赛开始推送"),
	LACK_GOLD(8,"闲逸豆不足推送");
	private int id;

	private String desc;

	EPushType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
}
