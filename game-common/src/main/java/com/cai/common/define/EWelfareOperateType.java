package com.cai.common.define;

public enum EWelfareOperateType {

	EXCHANGE(1, "福卡兑换消耗"),
	BACKSTAGE_ADD_WELFARE(2,"后台增加福卡"),
	BACKSTAGE_REDUCE_WELFARE(3,"后台减少福卡"),
	EMAIL_WELFARE(4,"邮件福卡领取"),
	WELFARE_BUY_WELFARE(5, "福卡商城购买获得"),
	MATCH_WELFARE_RANK(6,"比赛排名奖励福卡"),
	ACTIVITY_WELFARE(7,"活动获得福卡"),
	CLUB_WELFARE_LOTTERY(8, "亲友圈福卡抽奖"),
	MATCH_WELFARE_ROUND(9,"比赛胜局奖励福卡"),
	UNKOWN_TYPE(100,"未知类型");
	
	private int id;

	private String str;

	EWelfareOperateType(int id, String str) {
		this.id = id;
		this.str = str;
	}

	public static EWelfareOperateType ELogType(int id) {
		for (EWelfareOperateType c : EWelfareOperateType.values()) {
			if (c.id == id)
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

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
