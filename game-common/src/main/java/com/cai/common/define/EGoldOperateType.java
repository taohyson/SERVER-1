package com.cai.common.define;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 房卡操作类型
 * @author run
 *
 */
public enum EGoldOperateType {

	//不要用 1 -1

	OPEN_ROOM(10,"开房间", "开房扣除"),
	OSS_OPERATE(11,"后台操作加卡", "管理后台添加"),
	PROXY_GIVE(12,"代理赠送", "代理赠送"),
	SHOP_PAY(13,"商店", "商城购买"),
	PAY_CENTER(14,"充值中心", "充值中心"),
	OSS_OPERATE_DEC(11,"后台操作减卡", "管理后台扣除"),
	DAY_SHARE(15,"每日分享得卡", "每日分享获得"),
	FRIEND_DOWN(16,"好友下载", "好友下载"),
	SHARE_DOWN(17,"通过分享下载", "通过分享下载"),
	FAILED_ROOM(18,"开局失败", "开局失败返还"),
	REAL_OPEN_ROOM(19,"真实开房", "真实开房"),
	REAL_RMB_COUNT(20,"每日返利", "每日返利"),
	REAL_RMB_RECEIVER(21,"提现", "提现"),
	MONEY_DUIHUAN(22,"兑换金币", "兑换金币"),
	REAL_INCOME_RECEIVER(23,"推广员提现", "推广员提现"),
	RECOMMEND_PLAYER(24,"推广玩家返利", "推广玩家返利"),
	RECOMMEND_AGENT(25,"推广代理返利", "推广代理返利"),
	AGENT_RECHARGE_RECEIVER(26,"代理充值返利", "代理充值返利"),
	LOGIN_ACTIVITY(27,"登录活动", "登录活动"),
	SHOP_RECHARGE(30,"店铺普通充值", "店铺普通充值"),
	AGENT_RECEIVE(31,"棋牌代理充值返利", "棋牌代理充值返利"),
	AGENT_RECHARGE_DRAWCASH(32,"棋牌代理提现", "棋牌代理提现"),
	PADDING_RECOMMEND_ID(33,"填写推广员", "填写推广员"),
	RECOMMEND_RECHARGE(34,"推广员代充", "推广员代充"),
	ACTIVITY_TURNTABLE(35,"转盘活动中奖获得", "转盘活动获得"),
	AGENT_BALANCE_PAY(36,"棋牌代理余额支付购豆", "代理余额购买"),
	RECOMMEN_RECEIVE(37,"推广玩家获利", "推广玩家获利"),
	MATCH_APPLY(38,"比赛场报名扣豆", "比赛报名"),
	MATCH_FAIL_RETURN(39,"比赛场开局失败返回豆", "开赛失败退还"),
	MATCH_RANK(40,"比赛排名奖励豆", "比赛获奖"),
	CLUB_CONSUME_SENDGOLD(41,"俱乐部消耗送豆", "亲友圈活动奖励"),
	OSS_ADD_EXCLUSIVE_GOLD(42,"后台给用户增加专属豆", "后台给用户增加专属豆"),
	OSS_DESC_EXCLUSIVE_GOLD(43,"后台给用户减少专属豆", "后台给用户减少专属豆"),
	TURNTABLE(44,"转盘奖励", "转盘奖励"),
	EXCLUSIVE_TRANSFER(45,"专属豆转让", "专属豆转让"),
	COIN_RELIEF_REWARD(46,"金币场救济金奖励豆", "金币场救济金奖励豆"),
	XIAN_YI_DOU_EXCHANGE_COIN(47,"闲逸豆兑换金币", "兑换金币"),
	COIN_PAY(48, "金币场充值豆", "金币场充值"),
	COIN_PAY_EXCHANGE(49, "金币场充豆兑换金币", "金币场兑换金币"),
	ACTIVITY_SEND_GOLD(50,"参与活动送豆", "活动奖励"),
	REDPACKET_EXCHANGE_GOLD(51,"红包池金额兑换豆", "红包池兑换"),
	ACTIVITY_RANDOM_GOLD(52,"活动随机送豆", "活动奖励"),
	EMAIL_GOLD(53,"邮件闲逸豆领取", "邮件提取"),
	OPEN_CLUB_MATCH(54,"亲友圈自建赛扣豆", "亲友圈自建赛扣豆"),
	CLUB_MATCH_FAILED(55,"亲友圈自建赛还豆", "亲友圈自建赛还豆"),
	FIRST_BIND_MOBILE(56,"首次绑定手机送豆", "首次绑定手机送豆"),
	EXCLUSIVE_GOLD_EXPIRE(57,"专属豆过期", "专属豆过期"),
	OSS_OPERATE_SEND(58,"后台赠送卡", "管理后台赠送卡"),
	WELFARE_BUY_GOLD(59,"逸卡商城闲逸豆购买", "逸卡商城闲逸豆购买"),
	ZHUZHOU_PROMOTE_SEND_GOLD(60,"株洲活动推广送豆", "株洲活动推广送豆"),
	CLUB_WELFARE_LOTTERY(61, "亲友圈福卡抽奖", "亲友圈福卡抽奖"),
	ALI_SHOP_PAY_DIAMOND(80,"商店", "支付宝商城购买砖石"),
	ALI_SHOP_PAY(81,"商店", "支付宝商城购买"),
	SHOP_PAY_DIAMOND(80,"钻石商店", "商城购买钻石"),
	MATCH_REVIVE(82,"比赛场复活", "比赛场复活扣豆"),
	MATCH_TOP_RESET(83,"冲榜赛清零", "冲榜赛清零扣豆"),
	MATCH_ROUND_RANK(84,"比赛胜局奖励豆", "比赛胜局获奖"),
	
	UNKOWN_TYPE(100,"未知类型", "未知类型");
	;

	private int id;

	private String idstr;

	private String transDesc;

	private static final Map<Integer, EGoldOperateType> map = new ConcurrentHashMap<>();

	static {
		for(EGoldOperateType temp : EGoldOperateType.values()) {
			map.put(temp.getId(), temp);
		}
	}


	EGoldOperateType(int id,String idstr, String transDesc) {
		this.id = id;
		this.idstr = idstr;
		this.transDesc = transDesc;
	}


	public static EGoldOperateType ELogType(int id) {
		for (EGoldOperateType c : EGoldOperateType.values())
		{
			if(c.id==id)
				return c;
		}
		return null;
	}

	/**
	 * id获取枚举
	 * @param id
	 * @param key，在加卡和减卡，因为都是同一个，用正负区分，其他情况无特殊意义
	 * @return
	 */
	public static EGoldOperateType getOperateTypeById(int id, int key) {
		if(id == OSS_OPERATE.id || id == OSS_OPERATE_DEC.id) {
			if(key >= 0) {
				return OSS_OPERATE;
			} else {
				return OSS_OPERATE_DEC;
			}
		}
		return map.get(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdstr() {
		return idstr;
	}

	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}

	public String getTransDesc() {
		return transDesc;
	}


}
