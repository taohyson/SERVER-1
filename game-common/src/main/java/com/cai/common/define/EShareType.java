package com.cai.common.define;

/**
 * app分享类别
 * 
 * @author tang
 *
 */
public enum EShareType {
	TYPE_SHARE_WXHY(2, "分享微信好友"), 
	TYPE_SHARE_WXPYQ(3, "分享微信朋友圈"),
	TYPE_SHARE_QQ(5, "分享QQ"),
	TYPE_SHARE_ZFB(6, "分享支付宝"),
	TYPE_SHARE_YX(7, "分享易信"),
	TYPE_SHARE_DD(8, "分享钉钉"),
	TYPE_SHARE_ML(9, "分享米聊"),
	TYPE_SHARE_XL(10, "分享闲聊");
	private int id;

	private String desc;

	EShareType(int id, String desc) {
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
