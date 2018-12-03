package com.cai.common.define;

/**
 * 
 * 
 * 积分操作类型
 * @author tang 
 * date: 2018年7月3日 上午10:31:13 <br/>
 */
public enum EBonusPointsType {

	RECHARGE_SEND_BP(1, "充值"), 
	EXCHANGE_CONSUME_BP(2, "兑换"),
	BACKUP_ADD(3, "后台增加"),
	BACKUP_DEC(4, "后台扣除"),
	PAYBACK_DEC(5, "后台退单"),
	PROMOTER_OPENAGENT_BP(6, "推广员开通代理送积分"),
	SELF_OPENAGENT_BP(7, "自助开通代理送积分"),
	FIRST_RECHARGE_BP(8, "开通代理首充送积分");
//	SSHE_RECHARGE_BP(9, "后台充值");

	private int id;

	private String name; // 中文注释

	private EBonusPointsType(int id, String name) {
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
