package com.cai.common.type;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/24 15:01
 */
public interface PhoneChargeCode {
	/**
	 * 提交成功
	 */
	String COMMIT_SUCCESS = "0";
	/**
	 * 充值中
	 */
	String CHARGING = "1";
	/**
	 * 充值成功
	 */
	String CHARGE_SUCCESS = "2";
	/**
	 * 充值失败
	 */
	String CHAGE_FAIL = "3";

	//====================================
	/**
	 * 充值平台域名
	 */
	String PLATFORM_DOMIN = "http://api.j-pay.com.cn/";

	/**
	 * 商户编号
	 */
	int USER_ID = 95;

	/**
	 * 商品类型
	 */
	int SHOP_TYPE = 11;

	/**
	 * 密钥
	 */
	String KEY = "08319108795bb0d038428007fb5adac6";

	/**
	 * 充值请求接口
	 */
	String SUBMIT_REQUEST = "merchant/submit.php";

	/**
	 * 余额查询接口
	 */
	String QUERY_BALANCE = "merchant/balance.php";

	/**
	 * 订单查询接口
	 */
	String ORDER_SEARCH = "merchant/search.php";

	/**
	 * 状态码-余额不足
	 */
	String BALANCE_NOT_ENOUGH_RET = "84";
}
