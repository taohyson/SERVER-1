/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

import java.util.function.Function;

import com.cai.common.util.RedisKeyUtil;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年12月4日 下午3:01:58 <br/>
 */
public enum EPhoneIdentifyCodeType {

	/**
	 * 绑定
	 */
	PHONE_BIND(1, "手机绑定", 5L * 60) {
		@Override
		public Function<String, String> exe() {
			return RedisKeyUtil::phoneBind;
		}
	},

	/**
	 * 解绑
	 */
	PHONE_UN_BIND(2, "手机解绑", 5L * 60) {
		@Override
		public Function<String, String> exe() {
			return RedisKeyUtil::phoneUnBind;
		}
	},

	/**
	 * 登陆
	 */
	PHOEN_LOGIN(3, "手机登陆", 2L * 60 * 60) {
		@Override
		public Function<String, String> exe() {
			return RedisKeyUtil::phoneLogin;
		}

	},

	/**
	 * 俱乐部解散
	 */
	PHONE_CLUB_DISBAND(4, "俱乐部解散", 5L * 60) {

		@Override
		public Function<String, String> exe() {
			return RedisKeyUtil::phoneClubDisband;
		}

	},
	/**
	 * 俱乐部转让
	 */
	PHONE_CLUB_ASSIGNMENT(5, "俱乐部转让", 5L * 60) {

		@Override
		public Function<String, String> exe() {
			return RedisKeyUtil::phoneClubAssignment;
		}
	},
	/**
	 * 背包物品使用
	 */
	ITEM_USE(6, "背包物品使用", 5L * 60) {
		@Override
		public Function<String, String> exe() {
			return RedisKeyUtil::itemUse;
		}
	}
	;

	private final int type;
	private final String desc;
	private final long alive; // 存活 单位s

	/**
	 * @param type
	 */
	private EPhoneIdentifyCodeType(int type, String desc, long alive) {
		this.type = type;
		this.alive = alive;
		this.desc = desc;
	}

	public int getType() {
		return type;
	}

	public long getAlive() {
		return alive;
	}

	public String getDesc() {
		return desc;
	}

	/**
	 * 
	 * @param category
	 * @return
	 */
	public static EPhoneIdentifyCodeType of(int type) {
		for (EPhoneIdentifyCodeType tmp : EPhoneIdentifyCodeType.values()) {
			if (type == tmp.type) {
				return tmp;
			}
		}
		return null;
	}

	public abstract Function<String, String> exe();
}
