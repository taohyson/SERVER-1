package com.cai.common.type;

/**
 * 
 * 商城操作类型
 * 
 * @author zhanglong date: 2018年4月13日 下午12:11:12
 */
public interface StoreOpeType {
	/**
	 * 查询功能状态
	 */
	int QUERY_FUNCTION_STATU = 1;

	/**
	 * 商城界面
	 */
	int STORE_UI = 2;

	/**
	 * 商城界面
	 */
	int STORE_UI_IOS = 7;

	/**
	 * 微信购买
	 */
	int BUY_GOODS = 3;

	/**
	 * 支付成功 客户端返回订单号
	 */
	int PAY_BACK = 4;

	/**
	 * 苹果支付
	 */
	int PAY_IOS = 5;

	/**
	 * ios购买
	 */
	int BUY_GOODS_IOS = 6;

	/**
	 * 金币商城界面
	 */
	int STORE_UI_MONEY = 8;

	/**
	 * 金币商城购买
	 */
	int STORE_UI_MONEY_BUY = 9;

	/**
	 * 实物兑换商店
	 */
	int STORE_ITEM_EXCHANGE = 10;

	/**
	 * 福卡兑换商店
	 */
	int STORE_WELFARE_EXCHANGE = 11;

	/**
	 * 钻石商城
	 */
	int STORE_DIAMOND = 12;

	/**
	 * ios购买-钻石
	 */
	int BUY_DIAMOND_IOS = 13;

	/**
	 * 苹果支付-钻石
	 */
	int PAY_IOS_DIAMOND = 14;

	/**
	 * 安卓购买钻石
	 */
	int BUY_DIAMOND = 15;

	/**
	 * 支付宝购买xianyidou
	 */
	int BUY_GOODS_ALI = 16;

	int PAY_BACK_ALI = 17;

	/**
	 * ali购买钻石
	 */
	int BUY_DIAMOND_ALI = 18;

	int PAY_BACK_ALI_DIAMOND = 19;

	// 易接购买闲逸豆
	int EJ_BUY_GOLD = 20;
	// 易接购买钻石
	int EJ_BUY_DIAMOND = 21;
	
	/**
	 * -钻石-任意金额支付
	 */
	int BUY_DIAMOND_ANY_MONEY = 22;
	

}
