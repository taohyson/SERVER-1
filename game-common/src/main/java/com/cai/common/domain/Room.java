package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.constant.GameConstants;
import com.cai.common.type.PlayerRoomStatus;
import com.cai.common.util.DescParams;
import com.cai.common.util.GameDescUtil;
import com.google.protobuf.ByteString;

import protobuf.clazz.Common.CommonGameRuleProto;
import protobuf.clazz.Common.CommonGameRulesProto;
import protobuf.clazz.Protocol.LocationInfor;
import protobuf.clazz.Protocol.RoomRequest;

/**
 * 房间
 * 
 * @author run
 *
 */
public abstract class Room implements Serializable {

	public Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int room_id;

	@SuppressWarnings("rawtypes")
	protected ScheduledFuture _kick_schedule;
	public int _cur_round; // 局数
	public int _player_ready[]; // 准备
	public long _run_player_id;
	private int game_id;
	public int _game_rule_index; // 游戏规则
	public int _game_type_index;

	public int _game_round;

	/**
	 * 房间里的人
	 */
	private Player[] _players;// new RoomPlayer[4];

	public PlayerStatus _playerStatus[];
	/**
	 * 观察者
	 */
	private final GameObserverGroup observers = new GameObserverGroup(this);

	// 上帝视角
	private final GameObserverGroup godViewGroup = new GameObserverGroup(this);

	/**
	 * 房间内的用户
	 */
	private final GameRoomGroup room_players = new GameRoomGroup(this);
	/**
	 * 申请坐下用户
	 * 
	 */
	private final GameRoomGroup apply_seat_players = new GameRoomGroup(this);
	/**
	 * 申请补分用户
	 * 
	 */
	private final GameRoomGroup apply_score_players = new GameRoomGroup(this);

	/**
	 * 房间创建时间[单位S]
	 */
	protected long create_time;

	/**
	 * 真实扣豆时间[单位S]
	 */
	protected long realCostTime;

	/**
	 * 开局时间，跟战绩落地时间一致
	 */
	protected long startGameTime;

	/**
	 * 创建人
	 */
	private long room_owner_account_id;

	private String room_owner_name;

	private long _record_id;

	/**
	 * 最后刷新的时间(通信)
	 */
	private long last_flush_time;

	private int create_type;

	private Player create_player;

	public int _game_status;

	public int _end_reason;
	/**
	 * 游戏index --收费
	 */
	public int game_index;

	// public int real——k

	public volatile int cost_dou = 0;// 扣豆

	public String groupID;

	public String groupName;

	public int isInner;

	public int[] gameRuleIndexEx = new int[4];

	public volatile boolean isStart;
	public volatile boolean isPauseGame; // 是否暂停游戏
	/** 出牌时间 */
	private volatile int play_card_time = 15; // 出牌时间 默认15秒
	private volatile int attach_card_time; // 附加出牌时间  默认0秒
	private volatile boolean isFirstOut = true; //是否第一次出牌
	/** 是否启动机器人 */
	private volatile boolean enableRobot = false; // 是否开启机器人

	public GameRoundRecord GRR;

	public PlayerResult _player_result;

	// 牌桌自定义字段放在这， 比如杠次胡之类的 约定这类的ruleId为200+
	protected final Map<Integer, Integer> ruleMap = new HashMap<>();

	public int getCreate_type() {
		return create_type;
	}

	/** 是否启动机器人 */
	public boolean isEnableRobot() {
		return enableRobot;
	}

	/** 启动机器人 */
	public void enableRobot() {
		this.enableRobot = true;
	}

	public int getPlay_card_time() {
		int opTime = play_card_time;
		if(isFirstOut){
			opTime += getAttach_card_time();
		}
		return opTime;
	}

	protected void setPlay_card_time(int play_card_time) {
		this.play_card_time = play_card_time;
	}

	public int getAttach_card_time() {
		return attach_card_time;
	}

	public void setAttach_card_time(int attach_card_time) {
		this.attach_card_time = attach_card_time;
	}
	
	/** 标记出牌  */
	public void markOutCardFlag() {
		this.isFirstOut = false;
	}

	public void resetOutCardFlag() {
		this.isFirstOut = true;
	}

	public int getDelay_play_card_time() {
		return getDelay_play_card_time(0);
	}
	
	public int getDelay_play_card_time(int cmd) {
		int opTime = play_card_time;
		if(isFirstOut){
			opTime += getAttach_card_time();
		}
		int delay = opTime * 1000;
		return delay;
	}

	public void setCreate_type(int create_type) {
		this.create_type = create_type;
	}

	private ReentrantLock roomLock = new ReentrantLock();

	/**
	 * 房间类型枚举
	 */
	private RoomType roomType;

	public int club_id;
	public final RoomClubInfo clubInfo = new RoomClubInfo();
	public final StatusModule setsModel = StatusModule.newWithStatus(0);
	public boolean isVoice = false;

	protected CommonGameRulesProto commonGameRuleProtos = null;

	public enum RoomType {
		MJ, FLS, ZP, HH, OX, HJK, SG, GZP,
	}

	public Room(RoomType roomType, int maxNumber) {
		this.roomType = roomType;
		create_time = System.currentTimeMillis();
		last_flush_time = create_time;
		_end_reason = GameConstants.INVALID_VALUE;
		_players = new Player[maxNumber];
	}

	// =================================================================

	abstract public boolean process_flush_time();

	/**
	 * 强制结算
	 * 
	 * @return
	 */
	public abstract boolean force_account(String tips);

	public final boolean force_account() {
		return force_account("房间已被系统解散");
	}

	/**
	 * 最大数目 手牌
	 * 
	 * @return
	 */
	public int getMaxCount() {
		if (roomType == RoomType.MJ) {
			return GameConstants.MAX_COUNT;
		} else if (roomType == RoomType.FLS) {
			return GameConstants.MAX_FLS_COUNT;
		} else if (roomType == RoomType.ZP) {
			return GameConstants.MAX_ZP_COUNT;
		} else if (roomType == RoomType.HH) {
			return GameConstants.MAX_HH_COUNT;
		} else if (roomType == RoomType.GZP) {
			return GameConstants.GZP_MAX_COUNT;
		}
		return 0;
	}

	public long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}

	public long getRoom_owner_account_id() {
		return room_owner_account_id;
	}

	public void setRoom_owner_account_id(long room_owner_account_id) {
		this.room_owner_account_id = room_owner_account_id;
	}

	public int getRoom_id() {
		return room_id;
	}

	public int[] getGameRuleIndexEx() {
		return gameRuleIndexEx;
	}

	public void setGameRuleIndexEx(int[] gameRuleIndexEx) {
		this.gameRuleIndexEx = gameRuleIndexEx;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public Player[] get_players() {
		return _players;
	}

	public Player[] set_players(Player[] player) {
		return _players = player;
	}

	public int getPlayerCount() {
		int count = 0;
		for (Player player : _players) {
			if (player == null)
				continue;
			count++;
		}
		return count;
	}

	public Player getPlayerBySeatId(int seatId) {
		if (_players == null) {
			return null;
		}
		Player player = null;
		if (seatId < _players.length) {
			player = _players[seatId];
		}
		return player;
	}

	public List<Player> getAllPlayers() {
		List<Player> list = new ArrayList<>();
		if (_players == null || _players.length <= 0) {
			return list;
		}
		Player player = null;
		for (int i = 0; i < getTablePlayerNumber(); i++) {
			player = _players[i];
			if (player == null) {
				continue;
			}
			list.add(player);
		}
		return list;
	}

	public Player getPlayer(long accountId) {
		for (Player p : getAllPlayers()) {
			if (p.getAccount_id() == accountId) {
				return p;
			}
		}
		return null;
	}

	/**
	 * 重新分配座位
	 * 
	 * @return
	 */
	public boolean changePlayer() {
		Player[] players = new Player[_players.length];
		int count = 0;
		for (Player player : _players) {
			if (player == null) {
				continue;
			}
			player.set_seat_index(count);
			players[count] = player;
			count++;
		}
		_players = players;
		return true;
	}

	public long get_record_id() {
		return _record_id;
	}

	public void set_record_id(long _record_id) {
		this._record_id = _record_id;
	}

	public String getRoom_owner_name() {
		return room_owner_name;
	}

	public void setRoom_owner_name(String room_owner_name) {
		this.room_owner_name = room_owner_name;
	}

	public long getLast_flush_time() {
		return last_flush_time;
	}

	public void setLast_flush_time(long last_flush_time) {
		this.last_flush_time = last_flush_time;
	}

	public ReentrantLock getRoomLock() {
		return roomLock;
	}

	public void setRoomLock(ReentrantLock roomLock) {
		this.roomLock = roomLock;
	}

	/**
	 * @return the observers
	 */
	public GameObserverGroup observers() {
		return observers;
	}

	/**
	 * @return the room_players
	 */
	public GameRoomGroup room_players() {
		return room_players;
	}

	/**
	 * @return the apply_seat_players
	 */
	public GameRoomGroup apply_seat_players() {
		return apply_seat_players;
	}

	/**
	 * @return the apply_score_players
	 */
	public GameRoomGroup apply_score_players() {
		return apply_score_players;
	}

	/******************************
	 * 以下方法需要在所有的table中改一下
	 ****************************************************************************/
	/**
	 * @param player
	 * @return
	 */
	public abstract boolean handler_reconnect_room(Player player);

	/**
	 * @param get_seat_index
	 * @param out_cards[]
	 * @param card_count
	 * @param b_out_card
	 * @return
	 */
	public abstract boolean handler_operate_out_card_mul(int get_seat_index, List<Integer> list, int card_count,
			int b_out_card, String desc);

	/**
	 * 清除少人模式状态
	 */
	public abstract void clear_open_less();

	/**
	 * @param get_seat_index
	 * @param operateCode
	 * @param operateCard
	 * @return
	 */
	public abstract boolean handler_operate_card(int get_seat_index, int operateCode, int operateCard, int luoCode);

	public boolean handler_status_operate_card(int get_seat_index, int operateCode, int operateCard, int luoCode,
			int handler_status) {
		return false;
	}

	/**
	 * @param get_seat_index
	 * @param operate_code
	 * @return
	 */
	public abstract boolean handler_operate_button(int seat_index, int operate_code);

	/**
	 * 移除中心牌(癞子)操作 本方法在AbstractRoom子类会实现一个空方法 : 有具体逻辑需求的需要在自己的子类重写以使功能正常
	 * 
	 * @param seat_index
	 * @return
	 */
	public abstract boolean runnable_remove_middle_cards_general(int seat_index);

	/**
	 * @param get_seat_index
	 * @param call_banker
	 * @return
	 */
	public abstract boolean handler_call_banker(int seat_index, int call_banker);

	/**
	 * @param seat_index
	 * @param jetton
	 * @return
	 */
	public abstract boolean handler_add_jetton(int seat_index, int jetton);

	/**
	 * @param seat_index
	 * @param open_flag
	 * @return
	 */
	public abstract boolean handler_open_cards(int seat_index, boolean open_flag);

	/**
	 * @param account_id
	 * @return
	 */
	public abstract Player get_player(long account_id);

	/**
	 * @param get_seat_index
	 * @param operateCard
	 * @return
	 */
	public abstract boolean handler_player_out_card(int get_seat_index, int operateCard);

	/**
	 * @param get_seat_index
	 * @return
	 */
	public abstract boolean handler_player_be_in_room(int get_seat_index);

	/**
	 * 围观者是没有位置的
	 * 
	 * @param player
	 * @return
	 */
	public boolean handler_observer_be_in_room(Player player) {
		player.setStatus(PlayerRoomStatus.OBSERVER);
		return false;
	}

	/**
	 * 上帝视角围观者进入房间
	 */
	public boolean handler_god_view_observer_enter(Player player) {
		player.setStatus(PlayerRoomStatus.GOD_OBSERVER);
		return true;
	}

	/**
	 * 上帝视角围观者离开房间
	 */
	public boolean handler_god_view_observer_exit(Player player) {
		player.setStatus(PlayerRoomStatus.INVALID);
		return true;
	}

	/**
	 * 围观者是没有位置的
	 * 
	 * @param player
	 * @return
	 */
	public boolean handler_god_observer_be_in_room(Player player) {
		player.setStatus(PlayerRoomStatus.GOD_OBSERVER);
		return false;
	}

	/**
	 * @param get_seat_index
	 * @return
	 */
	public abstract boolean handler_player_ready(int get_seat_index, boolean is_cancel);

	// 金币场 玩家准备
	public abstract boolean handler_player_ready_in_gold(int get_seat_index, boolean is_cancel);

	/**
	 * @param player
	 * @param operateCode
	 * @return
	 */
	public abstract boolean handler_release_room(Player player, int operateCode);

	/**
	 * @param player
	 * @return
	 */
	public abstract boolean handler_enter_room(Player player);

	/**
	 * @param player
	 * @return
	 */
	public boolean handler_enter_room(Player player, int seat_index) {
		return false;
	}

	/**
	 * 进入观战
	 * 
	 * @param player
	 * @param observer
	 * @return
	 */
	public boolean handler_enter_room_observer(Player player) {
		return false;
	}

	/**
	 * 离开观战
	 * 
	 * @param player
	 * @return
	 */
	public boolean handler_exit_room_observer(Player player) {
		return false;
	}

	/**
	 * 游戏开始
	 * 
	 * @param room_id
	 * @param account_id
	 * @return
	 */
	public boolean handler_ox_game_start(int room_id, long account_id) {
		return true;
	}

	/**
	 * 游戏开始
	 * 
	 * @param room_id
	 * @param account_id
	 * @return
	 */
	public boolean handler_ask_player(int seat_index, boolean is_ask) {
		return true;
	}
	public boolean handler_online(int seat_index, boolean is_online) {
		return true;
	}
	public boolean handler_yang_operate_card(int seat_index, boolean is_yang) {
		return true;
	}

	public boolean handler_requst_record_info(int seat_index, int round) {
		return true;
	}

	/**
	 * @param player
	 * @param audioChat
	 * @param audioSize
	 * @param audioLen
	 * @return
	 */
	public abstract boolean handler_audio_chat(Player player, ByteString audioChat, int audioSize, float audioLen);

	/**
	 * @param player
	 * @param emjoyId
	 * @return
	 */
	public abstract boolean handler_emjoy_chat(Player player, int emjoyId);

	/**
	 * @param player
	 * @param pao
	 * @param qiang
	 * @return
	 */
	public abstract boolean handler_requst_pao_qiang(Player player, int pao, int qiang);
	
	public boolean handler_requst_pao_qiang_biaoyan(Player player, int pao, int qiang, int biaoyan) {
		return false;
	}

	/**
	 * @param player
	 * @param pao
	 * @param qiang
	 * @return
	 */
	public abstract boolean handler_requst_xia_ba(Player player, int pao, int ziBa, int duanmen);

	/**
	 * 
	 * @param player
	 * @param operate_code
	 * @param operate_card
	 * @param Linag_cards
	 * @param liang_cards_count
	 * @return
	 */
	public abstract boolean handler_requst_liang_zhang(int seat_index, int operate_code, int operate_card,
			List<Integer> linag_cards, int liang_cards_count);

	/**
	 * 
	 * @param player
	 * @param operate_code
	 * @param operate_card
	 * @param Linag_cards
	 * @param liang_cards_count
	 * @return
	 */
	public abstract boolean handler_requst_chu_zi(int seat_index, List<Integer> canCards, int type);

	/**
	 * @param player
	 * @param nao
	 * @return
	 */
	public abstract boolean handler_requst_nao_zhuang(Player player, int nao);

	/**
	 * @param seat_index
	 * @param call_banker
	 * @param qiang_banker
	 * @return
	 */
	public abstract boolean handler_requst_message_deal(Player player, int seat_index, RoomRequest room_rq, int type);

	/**
	 * @param player
	 * @param locationInfor
	 * @return
	 */
	public abstract boolean handler_requst_location(Player player, LocationInfor locationInfor);

	/**
	 * @param player
	 * @param locationInfor
	 * @return
	 */
	public abstract boolean handler_requst_location_new(Player player, LocationInfor locationInfor);

	/**
	 * @param player
	 */
	public abstract boolean handler_player_offline(Player player);

	/**
	 * @param player
	 */
	public abstract boolean handler_create_room(Player player, int type, int maxNumber);

	public abstract boolean dispatch_card_data(int cur_player, int type, boolean tail);

	public boolean dispatch_card_data_xiao(int cur_player, int type, boolean tail) {
		return false;
	}

	public boolean display_card(int seat_index, int card, boolean is_out_card) {
		return false;
	}

	/**
	 * @param _seat_index
	 * @param _reason
	 */
	public abstract boolean handler_game_finish(int _seat_index, int _reason);

	/**
	 * @param _seat_index
	 * @param _reason
	 */
	public boolean handler_game_start() {
		return true;
	}

	protected abstract boolean on_handler_game_start();

	/**
	 * @param _seat_index
	 * @param _type
	 * @param _tail
	 */
	public abstract boolean runnable_dispatch_last_card_data(int _seat_index, int _type, boolean _tail);

	/**
	 * @param _seat_index
	 * @param _type
	 * @param _tail
	 */
	public abstract boolean runnable_chuli_first_card_data(int _seat_index, int _type, boolean _tail);

	public boolean runnable_da_yi_piao(int _seat_index, int _type, boolean _tail) {
		return false;
	}

	/**
	 * @param _seat_index
	 * @param _type
	 * @param _tail
	 */
	public boolean runnable_add_first_card_data(int _seat_index, int _type, boolean _tail) {

		return false;
	}

	public boolean runnable_Dispatch_tou_card_data(int _seat_index, int _type, boolean _tail) {
		return false;
	}

	public boolean dispatch_card_add_data(int _seat_index, int _type, boolean _tail) {
		return false;
	}

	/**
	 * @param _seat_index
	 * @param _type
	 * @param _tail
	 */
	public abstract boolean runnable_dispatch_first_card_data(int _seat_index, int _type, boolean _tail);

	/*
	 * @param seat_index
	 * 
	 * @param provide_player
	 * 
	 * @param center_card
	 * 
	 * @param action
	 * 
	 * @param type //共杠还是明杠
	 * 
	 * @param self 自己摸的
	 * 
	 * @param d 双杠
	 * 
	 * @return
	 */
	public abstract boolean runnable_gang_card_data(int seat_index, int provide_player, int center_card, int action,
			int type, boolean depatch, boolean self, boolean d);
	/*
	 * @param seat_index
	 * 
	 * @param provide_player
	 * 
	 * @param center_card
	 * 
	 * @param action
	 * 
	 * 
	 * @param self 自己摸的

	 * 
	 * @return
	 */
	public  boolean runnable_chi_peng_card_data(int _seat_index, int _provide_player, int _center_card, int _action, int _depatch){
		return true;
	}
	/**
	 * @param _seat_index
	 * @param _type
	 */
	public abstract void runnable_remove_out_cards(int _seat_index, int _type);

	public abstract void runnable_set_trustee(int _seat_index);

	/**
	 * @param _seat_index
	 * @param _card_count
	 * @param _card_data
	 * @param _send_client
	 */
	public abstract void runnable_add_discard(int _seat_index, int _card_count, int[] _card_data, boolean _send_client);

	/**
	 * 
	 */
	public abstract void runnable_create_time_out();

	/**
	 * 
	 */
	public abstract boolean refresh_room_redis_data(int type, boolean notifyRedis);

	public abstract boolean exe_finish(int reason);

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	/** 是否旧金币场 */
	public boolean is_sys() {
		return this.create_type == GameConstants.CREATE_ROOM_SYS;
	}

	/** 是否比赛场 */
	public boolean is_match() {
		return this.create_type == GameConstants.CREATE_ROOM_MATCH;
	}

	/** 是否新金币场 */
	public boolean isCoinRoom() {
		return this.create_type == GameConstants.CREATE_ROOM_NEW_COIN;
	}

	/**
	 * 开房者没有进入房间
	 * 
	 * @return
	 */
	public boolean isOpenPlayerInRoom() {
		boolean flag = false;
		for (Player p : _players) {
			if (p == null) {
				continue;
			}
			if (p.getAccount_id() == room_owner_account_id) {
				flag = true;
			}
		}
		return flag;
	}

	/**
	 * 开房玩家在房间中的位置 在房间中就返回位置否则返回第一个进入房间的位置
	 * 
	 * @return
	 */
	public int getOpenRoomIndex() {
		for (Player p : _players) {
			if (p == null) {
				continue;
			}
			if (p.getAccount_id() == room_owner_account_id) {
				return p.get_seat_index();
			}
		}
		return 0;
	}

	/** 是否需要分数结算 */
	public boolean isNeedScoreSettle() {
		if (create_type == GameConstants.CREATE_ROOM_MATCH || create_type == GameConstants.CREATE_ROOM_NEW_COIN) {
			return true;
		}
		return false;
	}

	public abstract int getTablePlayerNumber();

	/**
	 * @param player
	 * @param openThree
	 * @return
	 */
	public abstract boolean handler_requst_open_less(Player player, boolean openThree);

	/**
	 * @param player
	 * @param openThree
	 * @return
	 */
	public abstract boolean handler_requst_open_less(Player player, int playerNumber);

	/**
	 * @param get_seat_index
	 * @param isTrustee
	 * @return
	 */
	public abstract boolean handler_request_trustee(int get_seat_index, boolean isTrustee, int Trustee_type);

	/**
	 * 
	 * @param seat_index
	 * @param effect_type
	 * @param effect_count
	 * @param effect_indexs
	 * @param time
	 * @return
	 */
	public abstract boolean record_effect_action(int seat_index, int effect_type, int effect_count,
			long effect_indexs[], int time);

	public Player getCreate_player() {
		return create_player;
	}

	public void setCreate_player(Player create_player) {
		this.create_player = create_player;
	}

	/**
	 * 31位之前的
	 * 
	 * @param cbRule
	 * @return
	 */
	public boolean has_rule(int cbRule) {
		return GameDescUtil.has_rule(_game_rule_index, cbRule);
	}

	/**
	 * 32位之后的
	 * 
	 * @param cbRule
	 * @return
	 */
	public boolean has_rule_ex(int cbRule) {
		return GameDescUtil.has_rule(gameRuleIndexEx, cbRule);
	}

	/**
	 * @param get_seat_index
	 * @param room_rq
	 * @return
	 */
	public abstract boolean handler_request_goods(int get_seat_index, RoomRequest room_rq);

	public void log_player_info(int seat_index, long accountID, String msg) {
		logger.info("房间[" + this.getRoom_id() + "]" + " 玩家[" + accountID + "seat:" + seat_index + "]" + msg);
	}

	public int getGameTypeIndex() {
		return _game_type_index;
	}

	public int getGameRuleIndex() {
		return _game_rule_index;
	}

	public abstract void clear_score_in_gold_room();

	public abstract boolean handler_refresh_player_data(int seat);

	public abstract boolean kickout_not_ready_player();

	public boolean handler_refresh_all_player_data() {
		return false;
	}

	public abstract boolean open_card_timer();

	public abstract boolean robot_banker_timer();

	public abstract boolean ready_timer();

	public boolean liang_card_timer(int seat_index) {
		return false;
	}

	public boolean animation_timer(int timer_id) {
		return false;
	}

	public boolean animation_timer(int timer_id, Object obj_one, Object obj_two) {
		return false;
	}

	public boolean Banker_Operate_timer() {
		return false;
	}

	public void initNewRule(CommonGameRulesProto commonGameRuleProtos) {
		this.commonGameRuleProtos = commonGameRuleProtos;
		for (CommonGameRuleProto rule : commonGameRuleProtos.getRulesList()) {
			ruleMap.put(rule.getRuleId(), rule.getValue());
			if (rule.getRuleId() < 32) {
				_game_rule_index = _game_rule_index | (1 << rule.getRuleId());
			}
			//
			int mod = rule.getRuleId() % 32;
			int index = (rule.getRuleId() - mod) / 32;
			if (index < gameRuleIndexEx.length) {
				gameRuleIndexEx[index] = gameRuleIndexEx[index] | (1 << mod);
			}
		}
	}

	/**
	 * 兼容旧玩法
	 * 
	 * @param rules
	 * @return
	 */
	public static int getNewRuleIndex(CommonGameRulesProto commonGameRuleProtos) {
		int index = 0;
		for (CommonGameRuleProto rule : commonGameRuleProtos.getRulesList()) {
			if (rule.getRuleId() < 32) {
				index = index | (1 << rule.getRuleId());
			}
		}
		return index;
	}

	public void initRobotRule(Map<Integer, Integer> rules) {
		CommonGameRulesProto.Builder proto = CommonGameRulesProto.newBuilder();
		rules.forEach((key, value) -> {
			ruleMap.put(key, value);
			if (key < 32) {
				_game_rule_index = _game_rule_index | (1 << key);
			}

			int mod = key % 32;
			int index = (key - mod) / 32;
			if (index < gameRuleIndexEx.length) {
				gameRuleIndexEx[index] = gameRuleIndexEx[index] | (1 << mod);
			}
			proto.addRules(CommonGameRuleProto.newBuilder().setRuleId(key).setValue(value));
		});
		this.commonGameRuleProtos = proto.build();
	}

	/**
	 * 兼容旧玩法
	 * 
	 * @param rules
	 * @return
	 */
	public static int game_rule_index(Map<Integer, Integer> rules) {
		int index = 0;
		for (Iterator<Map.Entry<Integer, Integer>> iterator = rules.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<Integer, Integer> next = iterator.next();
			if (next.getKey() < 32) {
				index = index | (1 << next.getKey());
			}

		}
		return index;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(10, 1);
		map.put(12, 1);
		map.put(205, 5);
		System.out.println(game_rule_index(map));
	}

	public boolean banker_jetton_timer() {
		return true;
	}

	public boolean yao_card_timer() {
		return false;
	}

	public abstract boolean add_jetton_timer();

	public abstract boolean trustee_timer(int operate_id, int seat_index);

	public boolean hu_pai_timer(int seat_index, int operate_code, int wik_kind) {
		return false;
	}

	public int getRuleValue(int game_rule) {
		if (!ruleMap.containsKey(game_rule)) {
			return 0;
		}
		return ruleMap.get(game_rule);
	}

	public void putRule(int game_rule, int value) {
		ruleMap.put(game_rule, value);
	}

	protected void putDescParam(DescParams params) {
		params.setRuleMap(ruleMap);
	}

	public boolean handler_requst_chat(int seat_index, RoomRequest room_rq, int type) {
		return true;
	}

	/**
	 * 
	 * @return
	 */
	public abstract boolean reset_init_data();

	/**
	 * 貌似存在player#_seat_index 和 _players[x]索引不一致？？？
	 * 
	 * @param accountId
	 * @return
	 */
	public int getPlayerIndex(long accountId) {
		for (int i = 0; i < this.getTablePlayerNumber(); i++) {
			Player p = this._players[i];
			if (null != p && p.getAccount_id() == accountId) {
				return i;
			}
		}
		return GameConstants.INVALID_SEAT;
	}

	public boolean send_error_notify(Player player, int type, String msg) {
		return false;
	}

	public boolean handler_switch_screen(int type, int seat_index) {
		return true;
	}

	public long getStartGameTime() {
		return startGameTime;
	}

	public void setStartGameTime(long startGameTime) {
		this.startGameTime = startGameTime;
	}

	public long getRealCostTime() {
		return realCostTime;
	}

	public void setRealCostTime(long realCostTime) {
		this.realCostTime = realCostTime;
	}

	public GameObserverGroup godViewObservers() {
		return godViewGroup;
	}

	/**
	 * 房间暂停时 子游戏相关逻辑处理
	 */
	public void handler_pause_room() {
	}

	/**
	 * 房间继续时 子游戏相关逻辑处理
	 */
	public void handler_continue_room() {
	}

	/**
	 * 房间内 指定座位玩家托管处理
	 */
	public void handler_player_trustee(int seat_index, boolean isTrustee, int Trustee_type) {

	}

	public Map<Integer, Integer> getRuleMap() {
		return ruleMap;
	}

	/**
	 * 自动准备
	 */
	public abstract void handler_player_auto_ready(int seat_index);
	
	/**
	 * 是否出牌指令
	 */
	public boolean isOutCardCmd(int cmd){
		return false;
	}

}
