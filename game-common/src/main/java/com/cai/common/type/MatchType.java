package com.cai.common.type;

public class MatchType {
	
	//开启
	public static final int MATCH_OPEN = 1;
	
	//复活状态
	public static final int REVIVE_COMMON = 0;  //
	public static final int REVIVE_START = 1;  //复活操作开始
	public static final int REVIVE_OVER = 2;  //复活操作结束
	
	//快速赛奖励类型
	public static final int QUICK_ROUND_TYPE = 1; //胜局奖励
	public static final int QUICK_RANK_TYPE = 2; //排名奖励
	
	//复活赛类型  1正常比赛打立出局阶段  2快速赛
	public static final int MATCH_REVIVE_OUT = 1;
	public static final int MATCH_REVIVE_QUICK = 2;
	
	//比赛类别 1全民互动赛2精英赛3线下直通赛 4线下赛 5密匙赛 6冲榜赛 7快速赛
	public static final int MATCH_TYPE_COMMON = 1;
	public static final int MATCH_TYPE_SECRET = 5;
	public static final int MATCH_TYPE_TOP = 6;
	public static final int MATCH_TYPE_QUICK = 7;
	
	//赛制类型 1.打立出局 2.定局赛 3.瑞士移位
	public static final int MATCH_FORMAT_SCORE_OUT = 1;
	public static final int MATCH_FORMAT_FIX = 2;
	public static final int MATCH_FORMAT_SWISS_SHIFT = 3;
	
	//桌子状态 0比赛即将开始  1等待管理员开始比赛  2比赛已开始  3比赛已暂停 4比赛结束  5比赛复活
	public static final int TABLE_NO_START = 0;
	public static final int TABLE_NO_START_ADMIN = 1;
	public static final int TABLE_START = 2;
	public static final int TABLE_PAUSE = 3; 
	public static final int TABLE_OVER = 4;
	public static final int TABLE_REVIVE = 5;
	
	//匹配时桌子解散状态  1上一轮结束  2下一轮匹配开始  3下一轮匹配开始
	public static final int TABLE_MATCH_LAST_OVER = 1;
	public static final int TABLE_MATCH_NEXT_START = 2;
	public static final int TABLE_MATCH_NEXT_OVER = 3;
	
	//1继续比赛 2暂停比赛  3旁观 4删除比赛
	public static final int WINNER_OP_START = 1;
	public static final int WINNER_OP_STOP = 2;
	public static final int WINNER_OP_OBSERVE = 3;
	public static final int WINNER_OP_DELETE = 4;
	
	//联赛状态
	public static final int TYPE_UNION_SUBJECT = 1;
	public static final int TYPE_UNION_COMMON = 2;
	public static final int TYPE_UNION_WINNER = 3;
	
	//链接状态
	public static final int C_STATUS_COMMON= 0;
	public static final int C_STATUS_START = 1;
	public static final int C_STATUS_END = 2;
	
	public static final int ALL = 0;
	
	//比赛类型
	public static final int MATCH_UNION = 1;
	public static final int MATCH_SIDE = 2;
	public static final int MATCH_SCHEDULE = 3;
	
	//0正常状态  1预约  2报名  3开始 4等待排名  10大赢家预约 11大赢家报名 12大赢家管理锁定比赛 13大赢家管理员管理比赛
	public static final int COMMON = 0;
	public static final int RESERVE = 1;
	public static final int APPLY = 2;
	public static final int START = 3;
	public static final int WAIT_RANK = 4;
//	public static final int WINNER_APPLY = 11;
	public static final int WINNER_ADMIN_START = 12;
	public static final int WINNER_ADMIN_MANAGER = 13;
	
	//比赛场状态  -1比赛关闭 0无效状态 1可预约 2可报名 3比赛开始 4比赛结束  5结束后可预约 6不可操作
		//10比赛时间未开始 11比赛时间未开始前两天  12比赛时间未开始前一天  13比赛时间已结束 14当天比赛开始时间之前 15当天比赛结束时间之后  
		//		16比赛未开始可预约 17比赛未开始前一天可预约
	public static final int MATCH_CLOSE = -1;
	public static final int MATCH_COMMON = 0;
	public static final int MATCH_RESERVE = 1;
	public static final int MATCH_APPLY = 2;
	public static final int MATCH_START = 3;
	public static final int MATCH_OVER = 4;
	public static final int MATCH_OVER_RESERVE = 5;
	public static final int MATCH_NO_OPERATION = 6;
	
	public static final int MATCH_TIME_NO_START = 10;
	public static final int MATCH_TIME_NO_START_TWO = 11;
	public static final int MATCH_TIME_NO_START_ONE = 12;
	public static final int MATCH_TIME_OVER = 13;
	public static final int MATCH_TIME_SOON_START = 14;
	public static final int MATCH_TIME_SOON_OVER = 15;
	public static final int MATCH_TIME_NO_START_RESERVE = 16;
	public static final int MATCH_TIME_NO_START_ONE_RESERVE = 17;
	
	
	//0不能进，不移除(报名预约赛等)  1可以进(可报名阶段)  2可以进(开始阶段等)  3不能进，移除(淘汰、一分钟未进等) 4不能进，移除(一分钟未进)
	public static final int NO_ENTER_SAVE = 0;
	public static final int ENTER_SAVE = 2;
	public static final int NO_ENTER_REMOVE = 3;
	public static final int NO_ENTER_TIMEOUT = 4;
	
	//失败类型  1人数不足 2服务器异常  3比赛强制解散 4未找到服务器 5该比赛已开始 6比赛已结束 7比赛已关闭 8后台关闭
	public static final int FAIL_LACK = 1;
	public static final int FAIL_EXCEPTION = 2;
	public static final int FAIL_BREAK_UP = 3;
	public static final int FAIL_NO_SERVER = 4;
	public static final int FAIL_HAD_START = 5;
	public static final int FAIL_HAD_OVER = 6;
	public static final int FAIL_HAD_CLOSE = 7;
	public static final int FAIL_BG_CLOSE = 8;
	
	public final static String REMOVE_OVER = "over"; //比赛结束
	public final static String REMOVE_TOP_OVER = "topOver"; //冲榜赛比赛结束
	public final static String REMOVE_OUT = "out"; //淘汰
	public final static String REMOVE_TIMEOUT = "timeout"; //超时
	public final static String REMOVE_LEAVE = "leave"; //退赛
	public final static String REMOVE_BREAK = "break"; //解散
	public final static String REMOVE_STALE = "stale"; //数据过期
	public final static String REMOVE_BG_CLOSE = "bg_close"; //后台关闭
	public final static String REMOVE_UNKNOW = "unknow"; //未知
	
	public final static int CONFIG_RECOMMEND = 1; //推荐位配置
	
	public static String getTip(int type){
		String tip = "";
		switch (type) {
		case FAIL_LACK:
			tip = "报名人数不足";
			break;
		case FAIL_EXCEPTION:
			tip = "服务器异常";
			break;
		case FAIL_BREAK_UP:
			tip = "比赛强制解散";
			break;
		case FAIL_NO_SERVER:
			tip = "比赛场未开启";
			break;
		case FAIL_HAD_START:
			tip = "已有相同的比赛";
			break;
		case FAIL_HAD_OVER:
			tip = "比赛已结束";
			break;
		case FAIL_HAD_CLOSE:
			tip = "比赛已关闭";
			break;
		case FAIL_BG_CLOSE:
			tip = "后台人员结束比赛";
			break;
		default:
			tip = "比赛失败";
			break;
		}
		return tip;
	}

}
