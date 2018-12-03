package com.cai.common.define;

/**
 * app推送渠道
 * 
 * @author tang 0官方包推送,1OPPO包2VIVO 3HUAWEI,4XIAOMI
 */
public enum EPushChannel {
	OFFICAL(0, "官方包推送"), OPPO(1, "OPPO推送"), VIVO(2, "VIVO推送"), HUAWEI(3, "HUAWEI推送"), XIAOMI(4, "XIAOMI推送");
	private int id;

	private String desc;

	EPushChannel(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

}
