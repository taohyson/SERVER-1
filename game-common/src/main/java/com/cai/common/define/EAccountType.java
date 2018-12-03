/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *活动对象：0所有用户，1新用户，2所有代理，3所有推广员，4白银推广员，5黄金推广员6钻石推广员7普通代理8普通玩家9指定ID
 * @author tang 
 */
public enum EAccountType {
	//ORDINARY_AGENT非推广员身份的代理
	ALL_PLAYER( 0, "所有用户"),NEW_PLAYER(1,"新用户"), AGENT( 2, "所有代理"), PROMOTER( 3, "所有推广员"),
	BY_PROMOTER(4, "白银推广员"),HJ_PROMOTER(5, "黄金推广员"),ZS_PROMOTER(6, "钻石推广员"),ORDINARY_AGENT(7,"普通代理")
	,ORDINARY_PLAYER(8,"普通玩家"),APPOINT_ACCOUNT_ID(9,"指定ID");
	

	private final int status;
	private final String desc;

	private EAccountType(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	/**
	 * @return the status
	 */
	public int status() {
		return status;
	}

	/**
	 * @return the desc
	 */
	public String desc() {
		return desc;
	}

}
