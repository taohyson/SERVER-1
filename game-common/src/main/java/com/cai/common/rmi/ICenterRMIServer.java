package com.cai.common.rmi;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cai.common.define.EAccountParamType;
import com.cai.common.define.EGoldOperateType;
import com.cai.common.define.EMoneyOperateType;
import com.cai.common.define.EServerStatus;
import com.cai.common.define.EServerType;
import com.cai.common.define.EWelfareOperateType;
import com.cai.common.define.IDType;
import com.cai.common.domain.Account;
import com.cai.common.domain.AccountModel;
import com.cai.common.domain.AccountParamModel;
import com.cai.common.domain.AccountRecommendModel;
import com.cai.common.domain.AccountSimple;
import com.cai.common.domain.AddGoldResultModel;
import com.cai.common.domain.AddMoneyResultModel;
import com.cai.common.domain.AddWelfareResultModel;
import com.cai.common.domain.AppItem;
import com.cai.common.domain.ClubRoomModel;
import com.cai.common.domain.ClubRuleModel;
import com.cai.common.domain.ClubStatusModel;
import com.cai.common.domain.HallRecommendModel;
import com.cai.common.domain.LogicRoomInfo;
import com.cai.common.domain.LogicStatusModel;
import com.cai.common.domain.PlayerViewVO;
import com.cai.common.domain.ProxyStatusModel;
import com.cai.common.domain.RankModel;
import com.cai.common.domain.RedActivityModel;
import com.cai.common.domain.RmiDTO;
import com.cai.common.domain.RoomRedisModel;
import com.cai.common.domain.SysGameType;
import com.cai.common.domain.SysParamModel;
import com.cai.common.domain.TurntableRewardModel;
import com.cai.common.domain.TurntableSystemModel;
import com.cai.common.util.DescParams;
import com.google.common.collect.Multiset;

import javolution.util.FastMap;
import protobuf.redis.ProtoRedis.RsAccountModelResponse;
import protobuf.redis.ProtoRedis.RsRMIResultResponse;
import protobuf.redis.ProtoRedis.RsSystemStopReadyResultResponse;
import protobuf.redis.ProtoRedis.RsSystemStopReadyStatusResponse;

public interface ICenterRMIServer extends IRMIServer {

	public void sayHello();

	/**
	 * 不同游戏房间号生成--老方式
	 * 
	 * @param game_id
	 * @return
	 */
	public int randomRoomId(int game_id);

	public int randomRoomId(int game_id, int logicIndex);

	public int[] randomRoomIds(int game_id, int count);

	/**
	 * 金币场房间
	 * 
	 * @param game_id
	 * @return
	 */
	public int moneyRandomRoomId(int game_id);

	/**
	 * 获取账号信息
	 * 
	 * @param account_name
	 * @return
	 */
	public Account getAccount(String account_name);

	/**
	 * 获取simple帐号对象--包含名字 id 头像
	 * 
	 * @param account_id
	 * @return
	 */
	public AccountSimple getSimpleAccount(long account_id);

	/**
	 * 获得代理
	 * 
	 * @param account_id
	 * @return
	 */
	public int getLastAccountProxyIndex(long account_id);

	/**
	 * 获取账号信息
	 * 
	 * @param account_id
	 * @return
	 */
	public Account getAccount(long account_id);

	/**
	 * 更新账号信息
	 * 
	 * @param account
	 * @return
	 */
	public Account updateAccount(Account account);

	/**
	 * 获取参数缓存
	 * 
	 * @return
	 */
	public FastMap<Integer, FastMap<Integer, SysParamModel>> getSysParamModelDictionary();

	/**
	 * 重加载参数缓存
	 * 
	 * @return
	 */
	public boolean reLoadSysParamModelDictionary();

	/**
	 * 重加载系统公告字典
	 * 
	 * @return
	 */
	public boolean reLoadSysNoticeModelDictionary();

	/**
	 * 重加载连续登录配置
	 * 
	 * @return
	 */
	public boolean reLoadContinueLoginDictionary();

	/**
	 * 重加载系统活动
	 * 
	 * @return
	 */
	public boolean reLoadActivityDictionary();

	/**
	 * 重加载游戏玩玩法说明字典
	 */
	public boolean reLoadGameDescDictionary();

	/**
	 * 重新加载服务器列表缓存
	 * 
	 * @return
	 */
	public boolean reLoadSysParamDict();

	/**
	 * 重新加载主界面公告缓存
	 * 
	 * @return
	 */
	public boolean reLoadMainUiNoticeDictionary();

	/**
	 * 重新加载登录公告
	 * 
	 * @return
	 */
	public boolean reLoadLoginNoticeDictionary();

	/**
	 * 重新加载服务器列表
	 * 
	 * @return
	 */
	public boolean reLoadServerDictDictionary();

	/**
	 * 重新加载网关服
	 * 
	 * @return
	 */
	public boolean reLoadGateServerDict();

	/**
	 * 获取redis上的所有房间
	 * 
	 * @return
	 */
	public List<RoomRedisModel> getAllRoomRedisModelList();

	/**
	 * 删除指定房间
	 * 
	 * @param room_id
	 */
	public void delRoomById(int room_id);

	/**
	 * 删除指定房间
	 * 
	 * @param room_id
	 */
	public void delRoomById(int room_id, String desc);

	/**
	 * 查询指定房间
	 * 
	 * @param room_id
	 */
	public RoomRedisModel getRoomById(int room_id);

	/**
	 * 获取账号信息，如果没有自动创建
	 * 
	 * @param pt_flag
	 * @param pt_name
	 * @param ip
	 * @param last_client_flag
	 *            设备标识
	 * @param client_version
	 *            客户端版本 proxy_index 登录的代理服Id 不是登录发-1
	 * @return
	 */
	public Account getAndCreateAccount(String pt_flag, String account_name, String ip, String last_client_flag, String client_version,
			int proxy_index);

	public Account ejGetAndCreateAccount(String uin, String pt_flag, String account_name, String ip, String last_client_flag, String client_version,
			int proxy_index);

	/**
	 * 所有代理服的状态
	 * 
	 * @return
	 */
	public List<ProxyStatusModel> getProxyStatusList();

	/**
	 * 所有逻辑服的状态
	 * 
	 * @return
	 */
	public List<LogicStatusModel> getLogicStatusList();

	/**
	 * 所有club 服务器的状态
	 * 
	 * @return
	 */
	public List<ClubStatusModel> getCLubStatusList();

	/**
	 * 增减玩家房卡
	 * 
	 * @param account_id
	 * @param gold
	 * @param isExceed
	 *            扣卡是否可以超过原来的数量
	 * @param desc
	 * @return
	 */
	public AddGoldResultModel addAccountGold(long account_id, int gold, boolean isExceed, String desc, EGoldOperateType eGoldOperateType);

	public AddGoldResultModel addAccountDiamond(long account_id, int diamond, boolean isExceed, String desc, int ediamondOperateTypeStr);

	/**
	 * 增减玩家房卡
	 * 
	 * @param account_id
	 * @param gold
	 * @param isExceed
	 *            扣卡是否可以超过原来的数量
	 * @param desc
	 * @return
	 */
	public AddGoldResultModel addAccountGold(long account_id, int gold, boolean isExceed, String desc, int eGoldOperateTypeInt);

	/**
	 * 增减玩家福卡
	 */
	public AddWelfareResultModel addAccountWelfare(long account_id, int welfare, String desc, EWelfareOperateType eWelfareOperateType);

	/**
	 * 增减玩家福卡 --eWelfareOperateTypeInt int类型
	 */
	public AddWelfareResultModel addAccountWelfare(long account_id, int welfare, String desc, int eWelfareOperateTypeInt);

	/**
	 * 分配逻辑服
	 * 
	 * @return
	 */
	public int allotLogicId(int game_id);

	public RmiDTO getMaxNumberAllotLogicId(int gameId, DescParams params);

	/**
	 * 压力测试
	 * 
	 * @param type
	 * @param num
	 */
	public void myTest(int type, int num);

	/**
	 * 实时发送游戏公告
	 * 
	 * @param game_id
	 * @param content
	 * @param pay_type
	 */
	public void sendGameNotice(int game_type, String content, int play_type);

	/**
	 * 提供给oss修改数据的,只处理已做的
	 */
	public boolean ossModifyAccountModel(RsAccountModelResponse rsAccountModelResponse);

	/**
	 * 清除账号缓存
	 * 
	 * @param account_id
	 * @return
	 */
	public boolean clearAccountCache(long account_id);

	/**
	 * 重新加载商品列表
	 */
	public void reloadVailShopList();

	/**
	 * 踢下线
	 * 
	 * @param account_id
	 * @return
	 */
	public boolean offlineAccount(long account_id);

	/**
	 * 当前系统关闭准备状态
	 * 
	 * @return
	 */
	public RsSystemStopReadyStatusResponse systemStopReadyStatus();

	/**
	 * 系统关闭准备
	 */
	public RsSystemStopReadyResultResponse systemStopReady(int minute);

	/**
	 * 取消系统关闭
	 * 
	 * @return
	 */
	public RsSystemStopReadyResultResponse systemStopCancel();

	/**
	 * 刷新微信缓存
	 * 
	 * @param account_id
	 * @return
	 */
	public RsRMIResultResponse flushWxCache(long account_id);

	public String getGameOrderID();

	/**
	 * 代理服验证通过 --这里只负责通知中心服 一次
	 * 
	 * @param gameOrderID
	 *            游戏订单ID
	 */
	public void payCenterCall(String gameOrderID, int rechargeType);

	public void payCenterCallAli(String gameOrderID, int rechargeType, String aliOrderId);

	public void payCenterCallAliDiamond(String gameOrderID, int rechargeType, String aliOrderId);

	/**
	 * 代理服验证通过 --这里只负责通知中心服 一次
	 * 
	 * @param gameOrderID
	 *            游戏订单ID
	 * @param receipt
	 *            票据
	 */
	public boolean payCenterCallIOS(long accountID, String gameOrderID, String receipt, int rechargeType);

	public boolean payCenterCallIOSByTransactionId(long accountID, String gameOrderID, String receipt, String transactionId, int rechargeType);

	/**
	 * 订单修复
	 * 
	 * @param gameOrderID
	 *            游戏订单ID
	 */
	public String orderRepair(String gameOrderID);

	/**
	 * 每日统计修复
	 * 
	 * @param beforeDay
	 *            修复指定日期的数据
	 */
	public void everyDayRepair(int beforeDay);

	/**
	 * 重新加载金币商品列表
	 */
	public void reloadVailMoneyShopList();

	/**
	 * 增减玩家铜钱
	 * 
	 * @param account_id
	 * @param money
	 * @param isExceed
	 *            扣卡是否可以超过原来的数量
	 * @param desc
	 * @return
	 */
	public AddMoneyResultModel addAccountMoney(long account_id, int money, boolean isExceed, String desc, EMoneyOperateType eMoneyOperateType);

	/**
	 * 增减玩家铜钱
	 *
	 * @param account_id
	 * @param money
	 * @param isExceed
	 *            扣卡是否可以超过原来的数量
	 * @param desc
	 * @return
	 */
	public AddMoneyResultModel addAccountMoney(long account_id, int money, boolean isExceed, String desc, int eMoneyOperateTypeInt);

	/**
	 * 增减玩家铜钱2
	 * 
	 * @param account_id
	 * @param money
	 * @param isExceed
	 *            扣卡是否可以超过原来的数量
	 * @param desc
	 * @return
	 */
	public AddMoneyResultModel addAccountMoney(long account_id, int money, boolean isExceed, String desc, EMoneyOperateType eMoneyOperateType,
			int toolsId);

	public AddMoneyResultModel addAccountMoney(long account_id, int money, boolean isExceed, String desc, EMoneyOperateType eMoneyOperateType,
			int toolsId, String strTip);

	/**
	 * 检查金币够不够
	 * 
	 * @param account_id
	 * @param money
	 * @return
	 */
	public boolean checkMoney(long account_id, int money);

	/**
	 * 增减玩家房卡和金币
	 * 
	 * @param account_id
	 * @param gold
	 * @param isExceed
	 *            扣卡是否可以超过原来的数量
	 * @param desc
	 * @return
	 */
	public AddGoldResultModel addAccountGoldAndMoney(long account_id, int gold, boolean isExceed, String desc, EGoldOperateType eGoldOperateType,
			int money, EMoneyOperateType eMoneyOperateType);

	/**
	 * 后台测试牌型
	 * 
	 * @param cards
	 */
	public String testCard(String cards);

	/**
	 * 添加历史小牌局次数
	 * 
	 * @param num
	 * @return
	 */
	public boolean addHistorySamllBrandTimes(long account_id, int num);

	/**
	 * 添加历史大牌局次数
	 * 
	 * @param num
	 * @return
	 */
	public boolean addHistoryBigBrandTimes(long account_id, int num);

	// public boolean addHistoryBrandSuccess(long account_id,int num);

	/**
	 * 新增邀请记录
	 * 
	 * @param accountRecommendModel
	 */
	public boolean addAccountRecommendModel(AccountRecommendModel accountRecommendModel);

	// /**
	// * 新增代理开房间
	// * @param prxoyPlayerRoomModel
	// * @return
	// */
	// public boolean addAccountPrxoyPlayerRoomModel(PrxoyPlayerRoomModel
	// prxoyPlayerRoomModel);

	/**
	 * 增减玩家RMB
	 * 
	 * @param account_id
	 * @param rmb
	 * @param isExceed
	 *            扣卡是否可以超过原来的数量
	 * @param desc
	 * @return
	 */
	public AddGoldResultModel addAccountRMB(long account_id, double gold, boolean isExceed, String desc, EGoldOperateType eGoldOperateType);

	/**
	 * 重新dao列表
	 */
	public void reloadVailGoodsList();

	public AccountParamModel getAccountParamModelLoginReward(long account_id, EAccountParamType type);

	/**
	 * 
	 * @return
	 */
	public boolean reLoadIPModelDictionary();

	/**
	 * 增减推广员收入
	 * 
	 * @param account_id
	 * @param income
	 * @param level
	 *            //0自己推荐的，2，二级代理推荐，3，三级代理推荐,4,一级推广员的代理充值返利，5，二级推广员的代理充值返利，6三级推广员的代理充值返现
	 * @param desc
	 * @param eGoldOperateType
	 * @return
	 */
	public AddGoldResultModel doRecommendIncome(long account_id, double income, long level, String desc, EGoldOperateType eGoldOperateType,
			long targetId, long money);

	/**
	 * 增减推广员收入
	 * 
	 * @param account_id
	 * @param income
	 * @param level
	 *            //0自己推荐的，2，二级代理推荐，3，三级代理推荐,4,一级推广员的代理充值返利，5，二级推广员的代理充值返利，6三级推广员的代理充值返现
	 * @param desc
	 * @param eGoldOperateType
	 * @return
	 */
	public AddGoldResultModel doRecommendIncome(long account_id, double income, long level, String desc, EGoldOperateType eGoldOperateType,
			long targetId);

	/**
	 * 更新推广员昨日收益
	 * 
	 * @param account_id
	 * @param yesterday_income
	 * @return
	 */
	public AddGoldResultModel updateYesterdayRecommendIncome(long account_id, double yesterday_income);

	/**
	 * 查询推广员信息总览
	 * 
	 * @param account_id
	 * @return
	 */
	public Map<String, Object> queryRecommendAll(long account_id);

	/**
	 * 查询下级推广员详情
	 * 
	 * @param account_id
	 * @param date
	 * @return
	 */
	public Map<String, Object> queryDownRecommendByMonth(long account_id, String startTime, String endTime);

	public String orderRepairIOS(long accountID, String orderID, String recepit);

	/**
	 * 下级代理充值返利
	 * 
	 * @param account
	 * @param money
	 */
	public void doAgentReceived(Account account, int money);

	public boolean reLoadAppItemDictionary();

	public List<AppItem> getAllAppItemList();

	public List<AppItem> getAppItemListByAppId(int appId);

	public void insertAppItem(AppItem appItem);

	public void updateAppItem(AppItem appItem);

	/**
	 * 获取排行榜数据
	 * 
	 * @param type
	 * @return
	 */
	public List<RankModel> queryRank(int type);

	/**
	 * 修改签名
	 * 
	 * @param accountId
	 * @param newSign
	 * @return
	 */
	public int modifySigntrue(final long accountId, String newSign);

	/**
	 * 查看玩家信息
	 * 
	 * @param accountId
	 * @return
	 */
	public PlayerViewVO getPlayerViewVo(long accountId);

	/**
	 * 俱乐部申请组局
	 * 
	 * @param account
	 * @param club_id
	 * @param game_index
	 * @return
	 */
	public ClubRoomModel createClubRoom(long account, int club_id, ClubRuleModel roomRule, long club_account, String clubName, boolean ruleRepair,
			int tableIndex, int clubMemberSize, int debugLogicId);

	/**
	 * 检测是否在某个俱乐部中
	 */
	public boolean checkIsInClub(long accountId, int club_id);

	/**
	 * 返回俱乐部绑定的群
	 * 
	 * @param club_id
	 * @return
	 */
	public List<String> getGroupsByClub(int club_id);

	/**
	 * 分配ID
	 * 
	 * @param idType
	 * @param serverIdx
	 * @return
	 */
	public long allocateId(IDType idType, int serverIdx);

	/**
	 * 服务器上线/下线/维护状态登记
	 * 
	 * @param serverType
	 * @param status
	 * @param serverIndex
	 */
	boolean serverStatusUpdate(EServerType serverType, EServerStatus status, int serverIndex);

	/**
	 * 服务器ping
	 * 
	 * @param serverType
	 * @param serverIndex
	 */
	boolean serverPing(EServerType serverType, int serverIndex);

	/**
	 * 钻石推广员下级代理充值返利
	 * 
	 * @param account
	 * @param money
	 */
	public void doAgentRecommendReceived(Account account, int money);

	/**
	 * 钻石推广员收益操作
	 * 
	 * @param account_id
	 * @param income
	 * @param level
	 * @param desc
	 * @param eGoldOperateType
	 * @param targetId
	 * @return
	 */
	public AddGoldResultModel doAgentIncome(long account_id, double income, long level, String desc, EGoldOperateType eGoldOperateType, long targetId,
			long rechargeMoney);

	/**
	 * 钻石推广员信息总览
	 * 
	 * @param account_id
	 * @return
	 */
	public Map<String, Object> queryAgentRecommendAll(long account_id);

	/**
	 * 查询下级代理详情
	 * 
	 * @param account_id
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Map<String, Object> queryDownRecommend(long account_id, Date startDate, Date endDate);

	public Map<String, Object> queryDownPlayerByMonth(long account_id, String startTime, String endTime, int type);

	/**
	 * 通知重载推荐位信息
	 */
	boolean reloadGameRecommendIndexDict();

	/**
	 * 通知重载指定子游戏运行逻辑服配置
	 */
	boolean reloadServerBalanceDict();

	/**
	 * 大厅下级推广员
	 * 
	 * @param account_id
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	Map<String, Object> queryHallDownRecommend(long account_id, Date startDate, Date endDate);

	public Map<String, Object> queryHallDownAgent(long account_id, Date startDate, Date endDate);

	public Map<String, Object> queryMyPlayers(long account_id, Date startDate, Date endDate);

	/**
	 * 大厅钻石黄金白银推广员返利操作
	 * 
	 * @param account_id
	 * @param income
	 * @param level
	 * @param desc
	 * @param eGoldOperateType
	 * @param targetId
	 * @param rechargeMoney
	 * @return
	 */
	AddGoldResultModel doHallRecommendIncome(long account_id, double income, long level, String desc, EGoldOperateType eGoldOperateType,
			long targetId, long rechargeMoney);

	public boolean addHallRecommendModel(HallRecommendModel hallRecommendModel);

	/**
	 * 通知重新加载游戏类型对应收费索引 游戏类型 描述字典
	 * 
	 * @return
	 */
	public boolean reLoadSysGameTypeDictionary();

	/**
	 * 通知重新加载游戏规则
	 * 
	 * @return
	 */
	public boolean reLoadGameGroupRuleDictionary();

	/**
	 * 通知重新加载红包规则
	 * 
	 * @return
	 */
	public boolean reLoadRedPackageRuleDictionary();

	/**
	 * 通知加载转盘活动规则
	 * 
	 * @return
	 */
	public boolean reLoadTurntableDictionary();

	/**
	 * 转盘开启
	 * 
	 * @return
	 */
	public TurntableSystemModel startTurntableRound();

	/**
	 * 分配红包库存
	 */
	public void dispatchRedPackage();

	/**
	 * 取红包
	 * 
	 * @param type
	 *            1取红包雨红包，2取运财童子红包
	 * @param activeId
	 *            活动id
	 * 
	 * @return 返回0表示红包已经领完，分为单位
	 */
	public int takeRedPackage(int type, int activeId);

	/**
	 * 加载参数到sshe
	 * 
	 * @return
	 */
	public ConcurrentHashMap<Integer, SysGameType> loadSysGameTypeMapToSSH();

	/**
	 * 增加玩家一天玩的局数
	 * 
	 * @param accountId
	 * @return
	 */
	public int addDayPlayRound(long accountId);

	/**
	 * 
	 * @param money
	 *            操作金额
	 * @param operateType
	 *            1表示发送红包，2表示提现红包
	 * @return
	 */
	public boolean operateRedActivityModel(long account_id, int money, int operateType, int activity_type);

	/**
	 * 加载服务段参数列表
	 * 
	 * @return
	 */
	public boolean reLoadSysParamServerDict();

	/**
	 * 账号id换靓号辅助方法，修改上下级推荐关系等等，不修改旧账号的id
	 * 
	 * @param accountId
	 * @param newAccountId
	 * @return
	 */
	public boolean updateAccountId(long accountId, long newAccountId);

	/**
	 * 转盘---获取已中奖名单
	 * 
	 * @return
	 */
	public List<TurntableRewardModel> tokenTurntableRewardRank();

	/**
	 * 转盘---纪录中奖
	 * 
	 * @param accountId
	 * @param goodsId
	 * @param goodsDesc
	 */
	public void addTurntableRewardLog(long accountId, int goodsId, String goodsDesc);

	/**
	 * 
	 * @param newAccountId
	 * @return
	 */
	public Multiset<Integer> getRedPackReceiveCount(long newAccountId);

	/**
	 * 通知加载客服公告
	 * 
	 * @return
	 */
	public boolean reLoadCustomerSerNoticeDict();

	/**
	 * 推荐人数+1
	 * 
	 * @param recommendId
	 */
	public void increRecommenderCount(long recommendId);

	/**
	 * 扫码设置推广员
	 * 
	 * @param unionId
	 * @return
	 */
	public int setRecommender(String unionId);

	public void setShareTime(long account_id);

	public boolean reLoadItemDictionary();

	/**
	 * 江苏棋牌推广玩家返利
	 * 
	 * @param account
	 * @param money
	 */
	public void doRecommendPlayerReceive(Account account, int money);

	/**
	 * 退单退返利
	 * 
	 * @param account_id
	 * @param money
	 */
	public void paybackReceive(long account_id, int money);

	/**
	 * 修改玩家最后拉取系统邮件的ID
	 * 
	 * @param account
	 * @param emailId
	 */
	public void updateEmailId(long accountId, int emailId);

	/**
	 * 获取房间拼接信息
	 * 
	 * @return
	 */
	public String getAllRoomRedisModelListWithStr();

	/**
	 * 报名线下赛，根据参赛券获取分配的参赛序号
	 * 
	 * @param itemId
	 * @return
	 */
	public int getMatchMaxSeqByItemId(int itemId);

	/**
	 * 红包雨是否满足局数 RedPackTongZiService=filterPlayer
	 * 
	 * @return
	 */
	public boolean isLessRoundNum(long account_id, int bigRoundNum);

	/**
	 * 获取红包记录
	 * 
	 * @param account_id
	 * @return
	 */
	public RedActivityModel getRedActivityModel(long account_id);

	public boolean isExistAccount(long account_id);

	/**
	 * 
	 * @param account_id
	 * @return
	 */
	public AccountModel getAccountModel(long account_id);

	/**
	 * 获取推广员id
	 * 
	 * @param account_id
	 * @return
	 */
	public long getRecommendId(long account_id);

	/**
	 * @param cmd
	 *            协议id
	 * @param message
	 *            消息体
	 * @return
	 */
	<T, R> R rmiInvoke(final int cmd, T message);

	public String getDiamondUniqueID();

	public List<LogicRoomInfo> getLogicRoomInfoList();

	public LogicRoomInfo getLogicRoomInfo(int roomId);

	/**
	 * 
	 * @param dictType
	 */
	public void reloadDistributeDict(String dictType);

}