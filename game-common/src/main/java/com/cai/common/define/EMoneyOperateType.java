package com.cai.common.define;

/**
 * 房卡操作类型
 * @author run
 *
 */
public enum EMoneyOperateType {
	
	//不要用 1 -1
	
	UNKOWN_TYPE(100,"未知类型"),
	
	LOGIN_ACTIVITY(10,"登录活动"),
	USE_PROP(11,"使用道具"),
	DUIHUAN_PROP(12,"兑换金币"),
	ROOM_COST(13,"牌桌内消耗"),
	QUIT_ROOM_COST(14,"牌桌内逃跑扣费"),
	ADD_MONEY(15,"后台加金币"),
	DEC_MONEY(16,"后台减金币"),
	TURNTABLE_ACTIVITY_REWARD(17,"转盘活动-抽取加金币"),
	TURNTABLE_ACTIVITY_COST(18,"转盘活动-抽取加金币"),	
	MATCH_APPLY(19,"比赛场报名扣金币"),
	MATCH_FAIL_RETURN(20,"比赛场开局失败返回金币"),
	MATCH_RANK(21,"比赛排名奖励获得金币"),
	TURNTABLE(22,"转盘奖励"),
	COIN_RELIEF_REWARD(23,"金币场救济金奖励金币"),
	COIN_BASE_COST(24,"金币场台费扣除"),
	COIN_SETTLE_COST(25,"金币场结算扣除"),
	COIN_SETTLE_REWARD(26,"金币场结算获取"),
	XIAN_YI_DOU_EXCHANGE_COIN(27,"闲逸豆兑换金币"),
	RECHARGE_EXCHANGE_COIN(28,"充值闲逸豆直接兑换金币"),
	ACTIVITY_SEND_COIN(29,"参与活动送金币"),
	ACTIVITY_RANDOM_COIN(30,"活动随机送金币"),
	EMAIL_MONEY(31,"邮件金币领取"),
	WELFARE_BUY_MONEY(32,"福卡商城购买"),
	COIN_CORNUCOPIA_AWARD(33,"金币场聚宝盆"),
	CLUB_WELFARE_LOTTERY(34, "亲友圈福卡抽奖"),
	MATCH_ROUND_RANK(35,"比赛胜局奖励获得金币"),
	COIN_OPEN_BOX_AWARD(36,"金币场开宝箱奖励"),
	;
	private int id;
	
	private String idstr;
	
	
	
	EMoneyOperateType(int id,String idstr){
		this.id = id;
		this.idstr = idstr;
	}
	
	
	public static EMoneyOperateType ELogType(int id)
	{
		for (EMoneyOperateType c : EMoneyOperateType.values())
		{
			if(c.id==id)
				return c;
		}
		return null;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIdstr() {
		return idstr;
	}


	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}


	

	
	
}
