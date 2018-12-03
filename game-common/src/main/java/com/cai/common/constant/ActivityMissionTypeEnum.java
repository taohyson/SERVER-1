package com.cai.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 活动任务类型
 * @author chansonyan
 * 2018年4月17日
 */
public enum ActivityMissionTypeEnum {
	
	PER_RECHARGE_REQUIRE(1, "充值每满XX分"),
	TOTAL_RECHARGE_REQUIRE(2, "充值满XX分"),
	SHARE_WX_PYQ(3, "分享朋友圈"),
	SHARE_WX_FRIENDS(4, "分享微信好友"),
	SHARE_QQ_FRIENDS(5, "分享QQ好友"),
	CLUB_BIG_WINNER(6, "俱乐部获得大赢家XX次"),
	JOIN_MATCH(7, "参与比赛XX次"),
	MATCH_RANK_SUMMARY(8, "比赛获奖XX次"),
	CLUB_BOARD_SUMMARY(9, "完成俱乐部牌局达XX次"),
	ROOM_BOARD_SUMMARY(10, "完成开房模式牌局达到XX次"),	//不包括比赛和金币场
	COIN_BOARD_SUMMARY(11, "完成金币模式牌局XX次"),
	INVITE_DOWNLOAD_PLAY(12, "邀请XX个好友下载并玩任意游戏"),	//玩家发送邀请后，好友下载并玩XX局游戏视为完成
	PHONE_BOND(13, "绑定手机号"),
	SHARE_WX_PYQ_SEQUENCE(14, "连续分享XX次朋友圈"),	//当配置该类型活动时，玩家1天只能算1次有效分享
	LOGIN(15, "玩家登录游戏"),	//玩家登录游戏即完成任务
	CLUB_GAME_BIG_WINNER(16, "俱乐部玩XX游戏获得XX次大赢家"),	//指定玩俱乐部子游戏并获得多次大赢家完成任务
	JOIN_TARGET_GAME_FORMATCH(17, "参加XX游戏比赛XX次"),	//指定参与几场指定游戏比赛
	CLUB_TARGET_GAME_BOARD(18, "完成俱乐部XX游戏牌局XX次"),	//完成俱乐部指定游戏固定局数完成任务
	ROOM_TARGET_GAME_BOARD(19, "完成开房模式XX游戏牌局XX次"),	//
	COIN_TARGET_GAME_BOARD(20, "完成金币模式XX游戏牌局XX次"),	//完成金币模式指定游戏固定局数
	INVITE_DOWNLOD_AND_TARGETGAME_BOARD(21, "邀请XX个好友下载并玩XX游戏"),
	NEW_PLAYER_FIRSTLOGIN(22, "新用户首次登录游戏"),
	JOIN_TARGET_MATCH(23, "参与XX比赛XX次"),
	INVITE_RECOMMEND(24, "邀请推荐好友"),
	SHARE_XL_FRIENDS(25, "分享闲聊好友"),
	BRAND_ITEM_USE(26, "牌局使用道具达到XX次");
	
	private static Map<Integer, ActivityMissionTypeEnum> map = new HashMap<>();
	
	static {
		for(ActivityMissionTypeEnum temp : ActivityMissionTypeEnum.values()) {
			map.put(temp.getId(), temp);
		}
	}
	
	private ActivityMissionTypeEnum(int id, String tag) {
		this.id = id;
		this.tag = tag;
	}
	
	//活动
	private int id;
	//活动描述
	private String tag;
	
	public static ActivityMissionTypeEnum getEnum(int id) {
		return map.get(id);
	}
	
	public int getId() {
		return id;
	}

	public String getTag() {
		return tag;
	}

	
}
