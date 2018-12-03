package com.cai.common.type;

public class CoinType {
	
	public static final int OP_FAIL = -1;
	public static final int OP_SUCCESS = 1;
	
	//-1匹配失败  1匹配成功 2有未完成游戏  3低于准入  4高于准入  5低于游戏准入  6高于房间准入
	public static final int NO_GAME = -2; //未进行任何游戏
	public static final int FAIL = -1; //匹配失败
	public static final int SUCCESS = 1; //匹配成功
	public static final int GAME = 2; //有未完成的游戏
	public static final int LOW_MIN = 3; //低于准入
	public static final int UP_MAX = 4; //高于准入
	public static final int LOW_GAME_MIN = 5; //低于游戏准入
	public static final int UP_GAME_MAX = 6; //高于游戏准入
	public static final int MATCH_EXIT_SUC = 7; //匹配退出成功
	public static final int MATCH_EXIT_FAIL = 8; //匹配退出失败
	public static final int COIN_NOT_HAS_CORNUCOPIA= 9; //场次没有聚宝盆玩法
	
	//操作类型  0正常匹配  1继续游戏   2快速开始
	public static final int OP_START = 0;
	public static final int OP_CONTINUE = 1;
	public static final int OP_QUICK_START = 2;
	
	//1开启  2关闭
	public static final int OPEN = 1;
	public static final int CLOSE = 2;

}
