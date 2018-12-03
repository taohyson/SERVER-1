/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

import java.util.Objects;

import com.cai.common.domain.StatusModule;
import com.cai.common.util.Bits;

/**
 * 俱乐部的一些设置
 *
 * @author wu_hc date: 2017年11月2日 下午2:34:57 <br/>
 */
public enum EClubSettingStatus implements ITypeStatus {

	NONE(Bits.byte_negative_1),

	/**
	 * 冻结
	 */
	CLUB_FREEZE(Bits.byte_0),

	/**
	 * 审核
	 */
	CLUB_EXAMINED(Bits.byte_1),

	/**
	 * 隐藏成员列表
	 */
	CONCEAL_MEMBER(Bits.byte_2),

	/**
	 * 隐藏开局桌子
	 */
	CONCEAL_TABLE(Bits.byte_3),

	/**
	 * 退俱乐部审核
	 */
	CLUB_QUIT_EXAMINED(Bits.byte_4),

	/**
	 *
	 */
	CONCEAL_BRAND(Bits.byte_5),

	/**
	 *
	 */
	CLUB_TIRE_SWITCH(Bits.byte_6),
	/**
	 * 防封群开关
	 */
	CLUB_WX_BAN_SHARE_SWITCH(Bits.byte_7),

	/**
	 * 疲劳值清零开关 0-清零 1-不清零
	 */
	CLUB_TIRE_DAILY_RESET_SWITCH(Bits.byte_8),

	/**
	 * 可见成员(疲劳值开关的复选项) (0-管理员和成员可见 1-仅管理员可见)
	 */
	CLUB_TIRE_SWITCH_CHECK_BOX(Bits.byte_9),

	/**
	 * 亲友圈自建赛黑名单 0-不在黑名单中 1-在黑名单中
	 */
	CLUB_MATCH_BLACK_LIST(Bits.byte_10),

	/**
	 * 今日(疲劳值开关的复选项) (0-勾选 1-未勾选)
	 */
	CLUB_TIRE_TODAY(Bits.byte_11),

	/**
	 * 昨日(疲劳值开关的复选项) (0-勾选 1-未勾选)
	 */
	CLUB_TIRE_YESTERDAY(Bits.byte_12),

	/**
	 * 前日(疲劳值开关的复选项) (0-未勾选 1-勾选)
	 */
	CLUB_TIRE_BEFORE_YESTERDAY(Bits.byte_13),
	/**
	 * 八日(疲劳值开关的复选项) (0-未勾选 1-勾选)
	 */
	CLUB_TIRE_EIGHT(Bits.byte_14),
	/**
	 * 全部(疲劳值开关的复选项) (0-未勾选 1-勾选)
	 */
	CLUB_TIRE_ALL(Bits.byte_15),
	/**
	 * 房间内解散设置(0-正常解散 1-只允许管理员解散)
	 */
	CLUB_DISBAND_ROOM(Bits.byte_16),
	/**
	 * 亲友圈自建赛白名单 0-不在白名单中 1-在白名单中
	 */
	CLUB_MATCH_WHITE_LIST(Bits.byte_17),

	/**
	 * 可见成员(大赢家开关的复选项) (0-管理员和成员可见 1-仅管理员可见)
	 */
	CLUB_WIN_SWITCH_CHECK_BOX(Bits.byte_18),
	/**
	 * 今日(大赢家开关的复选项) (0-勾选 1-未勾选)
	 */
	CLUB_WIN_TODAY(Bits.byte_19),

	/**
	 * 昨日(大赢家开关的复选项) (0-勾选 1-未勾选)
	 */
	CLUB_WIN_YESTERDAY(Bits.byte_20),

	/**
	 * 前日(大赢家开关的复选项) (0-未勾选 1-勾选)
	 */
	CLUB_WIN_BEFORE_YESTERDAY(Bits.byte_21),
	/**
	 * 八日(大赢家开关的复选项) (0-未勾选 1-勾选)
	 */
	CLUB_WIN_EIGHT(Bits.byte_22),
	/**
	 * 全部(大赢家开关的复选项) (0-未勾选 1-勾选)
	 */
	CLUB_WIN_ALL(Bits.byte_23),
	/**
	 * 包间模式切换(0-常规模式 1-多包间模式)
	 */
	CLUB_RULE_TABLE_MODE(Bits.byte_24),
	/**
	 * 亲友圈福卡开关(服务器修改此开关)
	 */
	CLUB_WELFARE_SWITCH(Bits.byte_25),
	/**
	 * 隐藏战绩聊天链接
	 */
	CONCEAL_BRAND_CHAT(Bits.byte_26);

	// [0,32)
	private final byte position;

	private EClubSettingStatus(byte position) {
		this.position = position;
	}

	@Override
	public byte position() {
		return position;
	}

	/**
	 * @param position
	 * @return
	 */
	public static EClubSettingStatus of(int position) {
		for (EClubSettingStatus type : EClubSettingStatus.values()) {
			if (position == type.position()) {
				return type;
			}
		}
		return NONE;
	}

	public static void main(String[] args) {
		StatusModule stats = StatusModule.newWithStatus(100720902);
		for (EClubSettingStatus s : EClubSettingStatus.values()) {
			System.out.println(String.format("%-10b\t\t%-6s ", stats.isStatusTrue(s), s.name()));
		}

		//检查修改
//		StatusModule s1 = StatusModule.newWithStatus(33554438);
//		StatusModule s2 = StatusModule.newWithStatus(33619974);
//		for (EClubSettingStatus s : EClubSettingStatus.values()) {
//			if (!Objects.equals(s1.isStatusTrue(s), s2.isStatusTrue(s)))
//				System.out.println(String.format("%-10b->%-10b\t\t%-6s ", s1.isStatusTrue(s), s2.isStatusTrue(s), s.name()));
//		}
	}
}
