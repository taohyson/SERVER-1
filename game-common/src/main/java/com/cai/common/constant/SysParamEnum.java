/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant;

/**
 * 系统参数表（sys_param）对应参数ID 及用途
 *	
 * @author WalkerGeek 
 * date: 2017年9月8日 上午10:51:47 <br/>
 */
public enum SysParamEnum {
	
	ID_1000(1000,"	开房参数设置新手房卡数val1,新手铜钱数val2,是否允许开房val3(1-允许，0-不允许) val4-版号申请 val5-创建记录条数"),
	ID_1013(1013,"	房卡按钮开放设置val1(1=提示),str1=提示内容 "),
	ID_1014(1014,"	玩家商城开放设置(val=1开放，=0不开放)"),
	ID_1015(1015,"	代理商城开放设置(val=1开放，=0不开放)"),
	ID_1016(1016,"	主界面公告开放设置(val1=1开放，=0不开放) val2 活动开关,分享底图"),
	ID_1106(1106,"	金币兑换铜钱的比例(val1)"),
	ID_1107(1107,"	代开房(val1=代理开房个数,val2=普通玩家开房个数)"),
	ID_1108(1108,"	托管(手动托管val1=1开,0关,val2=超时托管时间，0不超时 val3=出牌速度 毫秒) val4=出牌落地速度 毫秒)"),
	ID_1109(1109,"	代理返利倍利，val1=千分比 "),
	ID_1198(1198,"	红包雨分享链接：(str1 = 链接实际值)"),
	ID_1199(1199,"	红包雨活动参数(val1=过滤万分比，val2=最大延迟时间/分钟)"),
	ID_1301(1301,"	更新游戏，跑得快(val1=1显示,val2=0正常，1新2火热，val3=排序值)"),
	ID_1302(1302,"	更多游戏，碰胡(val1=1显示,val2=0正常，1新2火热，val3=排序值)"),
	ID_1303(1303,"	更多游戏，麻将(val1=1显示,val2=0正常，1新2火热，val3=排序值)"),
	ID_1304(1304,"	更多游戏，六胡抢(val1=1显示,val2=0正常，1新2火热，val3=排序值)"),
	ID_2000(2000,"	微信分享链接(安卓) (val1=0普通，=1活动开启)(val2=强制弹出次数)"),
	ID_2001(2001,"	微信分享链接(IOS) (val1=0普通，=1活动开启)(val2=强制弹出次数)"),
	ID_2002(2002,"	版权相关信息(val1=1时显示)"),
	ID_2003(2003,"	更多游戏(val1=1时显示)"),
	ID_2004(2004,"	推广下载链接，str1=下载地址，str2=招商微信号,val1=每日分享获得金币数,val2=好友下载自己获得金币数，val3=好友下载他获得的金币数,val4=填写推广员获豆数"),
	ID_2222(2222,"	val1一级代理推荐代理充值返利比,val2二级代理推荐代理充值返利比,val3三级代理给一级代理的充值返利比"),
	ID_2223(2223,"	val1一级直属代理充值返利比,val2二级直属代理充值返利比,val3三级直属代理充值返利比,val4一级推广员下的推广员充值返利比,val5二级推广员下的推广员的充值返利比"),
	ID_2224(2224,"	val1推荐用户是否有时间限制0不限制，1限制,val2是否允许代理填写推荐人0不允许1允许"),
	ID_3000(3000,"	VIP场有玩家中途离场，玩家选择等待时间(s)"),
	ID_3001(3001,"	玩家操作时间(s)"),
	ID_3002(3002,"	VIP场有玩家中途离场，玩家选择等待时间(s)"),
	ID_3003(3003,"	vip房间结束时，等待玩家续卡时间(s)"),
	ID_3004(3004,"	vip牌局结束,进入下一把的时间(s)"),
	ID_3005(3005,"	创建Vip房间未开始游戏，房间的存活时间(s)"),
	ID_3007(3007,"	 申请解散等待时间(秒)"),
	ID_1104(1104,"	跑胡子[val1:发牌动画(ms)][val2:停留理牌时间(ms)][val3:发牌到执行跑，扫，提时间(ms)][val4:发牌没有要丢弃时间(ms)][val5:发牌没有要的发牌赶时间]"),
	ID_1105(1105,"	跑胡子 [val1:出牌丢弃牌时间(ms)][val2:出牌后发牌间隔时间(ms)]"),
	;
	private int id;
	
	private String name;

	
	
	/**
	 * @param id
	 * @param name
	 */
	private SysParamEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	} 
	
	
}
