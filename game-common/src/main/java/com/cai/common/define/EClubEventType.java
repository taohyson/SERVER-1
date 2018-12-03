/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *
 * @author wu_hc date: 2018年4月4日 上午11:09:01 <br/>
 */
public enum EClubEventType {

	/**
	 * 创建俱乐部
	 */
	CREATE(1, "创建俱乐部"),

	/**
	 * 删除俱乐部
	 */
	DELETE(2, "删除俱乐部"),

	/**
	 * 添加玩法/包间
	 */
	RULE_A(3, "添加玩法/包间"),

	/**
	 * 删除玩法
	 */
	RULE_D(4, "删除玩法"),

	/**
	 * 修改玩法
	 */
	RULE_U(5, "修改玩法"),

	/**
	 * 修改设置
	 */
	SETS_U(6, "修改设置"),

	/**
	 * 加入
	 */
	JOIN(7, "加入"),

	/**
	 * 离开
	 */
	OUT(8, "离开"),

	/**
	 * 踢出桌子
	 */
	KICK(9, "踢出桌子"),

	/**
	 * 解散桌子
	 */
	DISBAND(10, "解散桌子"),

	/**
	 * 修改疲劳值
	 */
	TIRE_U(11, "修改疲劳值"),

	/**
	 * 修改疲劳值开关
	 */
	TIRE_SWITCH_U(12, "修改疲劳值开关"),

	/**
	 * 修改疲劳值重置开关
	 */
	TIRE_RESET_SWITCH_U(13, "修改疲劳值重置开关"),

	/**
	 * 亲友圈自建赛开关(黑名单)
	 */
	CLUB_MATCH_BLACKLIST_U(14, "亲友圈自建赛黑名单"),
	/**
	 * 亲友圈自建赛白名单
	 */
	CLUB_MATCH_WHITELIST_U(15, "亲友圈自建赛白名单"),
	/**
	 * 亲友圈添加合伙人
	 */
	ADD_PARTNER(16, "亲友圈添加合伙人"),
	/**
	 * 亲友圈删除合伙人
	 */
	DEL_PARTNER(17, "亲友圈删除合伙人"),
	/**
	 * 亲友圈添加子成员
	 */
	ADD_CHILD(18, "亲友圈添加子成员"),
	/**
	 * 亲友圈移除子成员
	 */
	DEL_CHILD(19, "亲友圈移除子成员"),
	/**
	 * 修改玩家亲友圈福卡
	 */
	MODIFY_WELFARE(20, "修改玩家亲友圈福卡"),
	/**
	 * 后台操作区域保护游戏权限
	 */
	AREA_PROTECT(21, "后台操作区域保护游戏权限"),
	/**
	 * 禁止同桌操作
	 */
	SET_TABLE_BAN_PLAYER(22, "禁止同桌"),
	/**
	 * 禁止娱乐操作
	 */
	SET_DEFRIEND(23, "禁止娱乐操作"),
	/**
	 * 包间开关操作
	 */
	RULE_SWITCH(24, "包间开关操作");

	private final int category;
	private final String desc;

	/**
	 * @param category
	 * @param desc
	 */
	private EClubEventType(int category, String desc) {
		this.category = category;
		this.desc = desc;
	}

	public final int category() {
		return category;
	}

	public String getDesc() {
		return desc;
	}

}
