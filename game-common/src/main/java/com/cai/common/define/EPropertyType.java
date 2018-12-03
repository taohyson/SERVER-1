package com.cai.common.define;

/**
 * 属性类型 
 * <1000 玩家  >1000系统
 * @author run
 *
 */
public enum EPropertyType {

	//1-299
	GOLD(1,"房卡"),
	VIP(2,"VIP"),
	IS_NULL_AGENT_PW(3,"是否是空代理密码"),//val1=1空密码  0=有密码
	ACCOUNT_NICK_NAME(4,"玩家昵称"),
	ACCOUNT_HEAR_IMG(5,"玩家头像"),
	BACK_IP_LIST(6,"备用ip组,资源文件"),//val1=端口  str1=ip列表用,分割
	MONEY(7,"铜钱"),
	SLB_IP_LIST(8,"备用ip组,资源文件"),//val1=端口  str1=ip列表用,分割
	SIGNTURE(9,"玩家签名"),
	CERTIFICATION(10,"实名认证推送"),
	PHONE(11,"手机邦定推送"),
	CLUB_EXCLUSIVE_GOLD(12,"俱乐部专属豆"),
	WELFARE_CARD(13,"福卡"),
	DIAMOND(14,"钻石"),
	ACCOUNT_SEX(15,"性别+昵称"),
	//300-399红点
	RED_SYS_NOTIC(300,"系统公告红点"),
	
	;	
	private int id;
	
	private String desc;
	
	EPropertyType(int id,String desc){
		this.id = id;
		this.desc = desc;
	}
	
	
	public static EPropertyType getEMsgType(int id)
	{
		for (EPropertyType c : EPropertyType.values())
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
