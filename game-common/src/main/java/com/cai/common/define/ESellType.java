package com.cai.common.define;

public enum ESellType {// 1购买 2赠送 3测试 4其它

	BUY_CARD(1, "后台购买"), 
	SEND_CARD(2, "后台赠送"),
	TEST_CARD(3, "测试"),
	CENTER_PAY_CARD(4, "公众号充值"),
	OTHER_CARD(5,"其它"),
	GAME_PAY_CARD(6, "游戏内充值"),
	SHOP_PAY_CARD(7, "店铺充值"),
	IOS_PAY_CARD(8, "appstore充值"),
	SHOP_AGENT_BUY_CARD(9, "店铺进货"),
	RECOMMEND_BUY_CARD(10, "推广员充值成为代理"),
	DIAMOND_PAY_AZ(12, "安卓充值钻石"),
	DIAMOND_PAY_IOS(13, "ios充值钻石"),
	GAME_PAY_CARD_ALIPAY(15, "游戏内充值支付宝"),
	DIAMOND_PAY_ALI(16, "ali充值钻石"),
	EJ_PAY(17,"易接支付");

	private int id;

	private String name; // 中文注释

	private ESellType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
