package com.cai.common.define;

/**
 * 消息类型
 * @author run
 *
 */
public enum ELogType {
	
	//=======玩家的============
	addGold("addGold","房卡操作",1),
	addMoney("addMoney","铜钱操作",1),
	addWelfare("addWelfare","福卡操作",1),
	proxy_gold("proxy_gold","代理转卡记录",1),
	rmb("rmb","现金操作",1),
	recommendIncome("recommendIncome","推广员获得收益",1),
	recommendOutcome("recommendOutcome","推广员提现",1),
	agentIncome("agentIncome","棋牌代理获得收益",1),
	agentOutcome("agentOutcome","棋牌代理提现",1),
	agentPayback("agentPayback","棋牌代理退单",1),
	addExclusiveGold("addExclusiveGold","俱乐部专属豆操作",1),
	
	addDIAMOND("addDIAMOND","钻石操作",1),
	
	//======系统的============
	dbBatch("dbBatch","批量入库",2),
	dbTime("dbTime","数据入库时间",2), 
	onlinePlayer("onlinePlayer","在线玩家数量",2),
	socketConnect("socketConnect","socket链接数",2),
	gameNotice("gameNotice","游戏公告",2),
	gameOnlinePlayer("gameOnlinePlayer","游戏在线人数",2),
	accountOnline("accountOnline","账号在线人数",2),
	
	redisTopicCenter("redisTopicCenter","topicCenter每分钟数量",2),//只有中心有,name=
	
	socketMsgNum("socketMsgNum","服务器socket每分钟消息量",2),//代理，逻辑有
	
	sysFreeRoom("sysFreeRoom","逻辑服释放房间",2),
	roomLogicNumber("roomLogicNumber","逻辑服房间",2),
	socketStatePack("socketStatePack","socket流量包统计",2),//v1=入口包数量  v2=出口包数量
	socketStateBytes("socketStateBytes","socket流量字节统计",2),//v1=入口流量字节  v2=出口流量字节
	rmiTest("rmiTest","RMI链接测试",2),//v1=失败的数量
	startJvm("startJvm","开启服务器",2),
	stopJvm("stopJvm","关闭服务器",2),
	requestPool("requestPool","请求消息队列情况",2),
	releaseRedisRoom("releaseRedisRoom","释放redis房间",2),
	jvmMemory("jvmMemory","jvm内存",2),
	kickOnlineAccount("kickOnlineAccount","踢下线",2),
	webRequest("webRequest","web请求",2),
	inRoomWay("inRoomWay","进入房间方式",2),
	inRoomWayStat("inRoomWayStat","进入 房间方式统计",2),
	cardTypdCacheStat("cardTypdCacheStat","牌型缓存统计",2),
	playerReleaseRoom("playerReleaseRoom","玩家解散房间",2),
	secondProxyStat("secondProxyStat","二级代理统计",2),
	roomNumber("roomNumber","普通房间数量",2),
	requestPayPool("requestPayPool","微信支付请求消息队列情况",2),
	requestLoginPool("requestLoginPool","微信登陸请求消息队列情况",2),
	requestLogicPool("requestLogicPool","业务逻辑请求消息队列情况",2),
	requestPositionPool("requestPositionPool","百度定位请求消息队列情况",2),
	roomPool("roomPool","房间内业务",2),
	roomPoolback("roomPool","房间内业务备用",2),
	
	matchPool("matchPool","比赛场业务",2),
	
	requestSwitchPool("requestSwitchPool","微信切换请求消息队列情况",2),
	
	requestPtLoginPool("requestPtLoginPool","平台转码登录线程请求消息队列情况",2),
	requestAppStorePool("requestAppStorePool","appstore请求消息队列情况",2),
	
	requestWeiXinFlushPool("requestWeiXinFlushPool","微信用户刷新信息请求线程",2),
	
	requestgameDispatchushPool("requestgameDispatchushPool","内部消息的转发 请求线程",2),
	
	mongodbQueue("mongoDbQueue","mongodb入库情况",2),
	
	blackIpNumber("blackIpNumber","黑名单ip",2),
	
	clearAccountCache("clearAccountCache","清理玩家缓存",2),
	
	countLogicroom("countLogicroom","统计所有的逻辑服房间",2),
	
	//牌局
	parentBrand("parentBrand","大局",3),
	childBrand("childBrand","小局",3),
	accountBrand("accountBrand","玩家牌局索引",3),
	
	
	//玩家的非重要数值记录
	login("login","登录",4),
	register("register","注册",4),
	request("rquest","请求消息",4),
	response("response","消息听响应",4),
	clientNotifyIp("clientNotifyIp","客户端通知ip",4),
	clientNotifyLoginIp("clientLoginIp","客户端登录ip",4),
	serverIp("serverIp","服务器分配ip",4),
	
	
	//手机
	moblileBind("moblileBind","邦定手机",5),
	moblileUnBind("moblileUnBind","解绑手机",5),
	moblileIdentifyCode("moblileIdentifyCode","验证码",5),
	switchWx("switchWx","切换微信",5),
	
	
	clientNotifyIpNEW("clientNotifyIp","客户端通知ip",6),
	
	clientNotifyLoginIpNEW("clientLoginIp","客户端登录ip",7),
	
	serverIpNEW("serverIp","服务器分配ip",8),
	
	
	
	addMoneyNew("addMoneyNew","铜钱操作",9),
	
	
	requestPool_new("requestPoolnew","请求消息队列情况",10),
	requestPayPool_new("requestPayPoolnew","微信支付请求消息队列情况",10),
	requestLoginPool_new("requestLoginPoolnew","微信登陸请求消息队列情况",10),
	requestLogicPool_new("requestLogicPoolnew","业务逻辑请求消息队列情况",10),
	requestPositionPool_new("requestPositionPoolnew","百度定位请求消息队列情况",10),
	
	requestSwitchPool_new("requestSwitchPoolnew","微信切换请求消息队列情况",10),
	
	requestPtLoginPool_new("requestPtLoginPoolnew","平台转码登录线程请求消息队列情况",10),
	requestAppStorePool_new("requestAppStorePoolnew","appstore请求消息队列情况",10),
	
	requestWeiXinFlushPool_new("requestWeiXinFlushPoolnew","微信用户刷新信息请求线程",10),
	
	requestgameDispatchushPool_new("requestgameDispatchushPoolnew","内部消息的转发 请求线程",10),
	
	
	centerDatapool("centerDatapool","数据库入库线程池",10),
	
	
	GlobalExecutor("GlobalExecutor","xy-game-global-thread",10),
	
	GlobalExecutorASYN("GlobalExecutorAsyn","GlobalExecutorAsyn",10),
	
	GlobalExecutorDBASYN("GlobalExecutorDBASYN","GlobalExecutorDBASYN",10),
	
	
	requestRoomExtra_new("requestRoomExtra_new","房间内附属线程",10),
	
	requestRoomSessionWorker("requestRoomSessionWorker","连接上的房间线程",10),
	
	requestLogicPool_NEW("requestLogicPool_new","业务逻辑处理耗时任务",2),
	
	onlinePlayerNew("onlinePlayerNew","在线玩家数量",11),
	
	
	roomLogicError("roomLogicError","房间逻辑错误",12),
	proxyError("proxyError","转发服错误",12),
	mongoSlow("mongoSlow","mongodb执行缓慢",12),
	unkownError("unkownError","未知异常",12),
	clubError("clubError","俱乐部异常",12),
	matchError("matchError","比赛场异常",12),
	coinError("coinError","金币场场异常",12),
	roomLogicSlow("roomLogicSlow","房间逻辑执行缓慢",12),
	proxySlow("proxySlow","转发逻辑执行缓慢",12),
	coinSlow("coinSlow","金币场逻辑执行缓慢",12),
	matchSlow("matchSlow","比赛场逻辑执行缓慢",12),
	foundationSlow("foundationSlow","基础服辑执行缓慢",12),
	clubSlow("clubSlow","俱乐部服辑执行缓慢",12),
	roomIdError("roomIdError","房间号清理错误",12),
	roomIdCreateError("roomIdCreateError","房间号创建时错误",12),
	redisTimeLong("redisTimeLong","redis耗时过长",12),
	logicSlow("logicSlow","逻辑执行缓慢",12),
	roomIdNotEqual("roomIdNotEqual","房间号不一致",12),
	playerIdRemove("playerIdRemove","玩家对象移除失败",12),
	leftRoom("leftRoom","剩余房间",12),
	roomAutoDiverQueue("roomAutoDiverQueue","房间新驱动队列",12),
	roomLogicWait("roomLogicWait","房间逻辑等待",12),
	
	roomRequestLong("roomRequestLong","客户端字节流太长",12),
	roomRequestRoomLong("roomRequestRoomLong","房间内字节流太长",12),
	roomResponeLong("roomResponeLong","服务器返回字节流太长",12),
	SSHActionLong("SSHActionLong","sshe服务器action执行时间过长",12),
	;
	private String id;
	
	private String desc;
	
	/**
	 * 类型  1玩家  2系统  3牌局 
	 */
	private int type;
	
	ELogType(String id,String desc,int type){
		this.id = id;
		this.desc = desc;
		this.type = type;
	}
	
	
	public static ELogType ELogType(String id)
	{
		for (ELogType c : ELogType.values())
		{
			if(c.id==id)
				return c;
		}
		return null;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}

	
	
	
}
