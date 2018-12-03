package com.cai.common.define;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 玩家参数值,数据库用的
 * @author run
 *
 */
public enum EAccountParamType {
	
	DRAW_SHARE_DOWN(1,"是否领取分享下载金币",0),
	TODAY_ADD_MONEY(2,"今天新增加的铜钱数量",1),
	TODAY_ADD_GOLD(3,"今日新增房卡数量 ",1),
	HISTORY_SAMLL_BRAND_TIMES(4,"历史小牌局数",0),
	HISTORY_BIG_BRAND_TIMES(5,"历史大牌局数",0),
	DAY_SHARE_TIME(6,"每日分享的时间",0),
	LAST_LOGIN_NOTICE(7,"最后查看登录公告的时间",0),
	IS_REWARD_LOGIN(8,"今日是否领取登录奖励",1),
	TODAY_DES_MONEY(9,"今天消耗铜钱数量",1),
	ROBOT_TIMES(10,"今日机器人开房次数",1),
	UP_RECOMMEND_PLAYER_INCOME(12,"上级推广员是否已享受推荐玩家收益",0),
	UP_RECOMMEND_AGENT_INCOME(13,"上级推广员是否已享受推荐代理收益",0),
	TODAY_CONSUM_GOLD(14,"今天消耗房卡数量",1),
	TOTAL_ROUND(15,"历史总大局数",0),
	ADD_RECOMMEND_GOLD(16,"填写推荐人获豆",0),
	ADD_HALL_GOLD(17,"大厅填写推广员获豆",0),
	RECOMMEND_PLAYER_RECEIVE(18,"推广员是否已享受推荐玩家收益",0),
	TODAY_ADD_WELFARE(19,"今日新增福卡数量",1),
	TODAY_CONSUME_WELFARE(20,"今日消耗福卡数量",1),
	TAKE_SHARE_DOUBLE_REWARD(21,"连续登录七天内有一次机会领取双倍奖励",0),
	;
	
	private int id;
	
	private String desc;
	
	/**
	 * 类型 0=普通  1今日(每天重置)
	 */
	private int type;
	
	private final static Map<Integer,EAccountParamType> map = new HashMap<Integer,EAccountParamType>();
	
	public static final Logger logger = LoggerFactory.getLogger(EAccountParamType.class);
	
	EAccountParamType(int id,String desc,int type){
		this.id = id;
		this.desc = desc;
		this.type = type;
	}
	
	static {
		for (EAccountParamType c : EAccountParamType.values()){
			EAccountParamType type = map.get(c.getId());
			if(type!=null) {
				logger.error("EAccountParamType定义了相同类型");
				System.exit(-1);
			}
			map.put(c.getId(), c);
		}
	}
	
	public static EAccountParamType getEMsgType(int id)
	{
		return map.get(id);
	}

	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
	
}
