package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.cai.common.constant.GameConstants;
import com.cai.common.domain.json.MatchBaseScoreJsonModel;
import com.cai.common.type.MatchType;
import com.cai.common.type.PlayerRoomStatus;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import protobuf.clazz.Protocol.LocationInfor;
import protobuf.clazz.Protocol.Response;

public class Player implements Serializable {

	protected static final Logger logger = LoggerFactory.getLogger(Player.class);
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private long account_id;

	private long gold;

	private long money;

	private int proxy_index;

	private long proxy_session_id;

	private String account_icon;

	private String account_ip;

	private String account_ip_addr;

	private String nick_name;

	private int room_id;

	// 比赛场Id
	private int id;

	/**
	 * 性别 1=男 2=女
	 */
	private int sex;

	/**
	 * 每个会话所承载的网络会话实例
	 */
	private transient Channel channel;
	/**
	 * 当前正在进行中的游戏房间
	 */
	@JSONField(serialize = false) private Room curRoom;
	@JSONField(serialize = false) private MatchBaseScoreJsonModel myMatchBase;;

	/**
	 * 位置索引
	 */
	private int _seat_index;

	/**
	 * 是否在线
	 */
	private boolean isOnline = true;

	public transient LocationInfor locationInfor;

	private int round = 0;

	private int day_all_round;

	private int reward_count;
	/**
	 * 申请位置
	 */
	private int _apply_index;
	/**
	 * 离开申请列表时间
	 */
	private long _leave_timer;

	private boolean isRobot;
	private long _carry_score;
	private long _bu_score;
	private long _game_score;
	private boolean _is_join_game;

	// 如果是俱乐部房间内的玩家，存放在俱乐部的牌桌位置
	private int clubJoinId;

	//玩家的创角时间，在逻辑服中涉及到某些数据的保存
	private Date registerTime;

	/**
	 * 语音状态
	 */
	private int gvoiceStatus;

	private int status; // 0正常模式，1上帝视角
	private int myTimes = 1; //我的倍数
	private String myHonorMsg; //我的荣誉信息
	/**
	 * 定位刷新时间
	 */
	private long location_time = System.currentTimeMillis();

	private Position position;
	//比赛相关附加属性开始-------------------
	private boolean isMatch; // 是否比赛场玩家
	private volatile int matchConnectStatus = MatchType.C_STATUS_COMMON; // 比赛场
	private long play_card_time; //出牌时间 毫秒
	//上一局是否托管结束
	private boolean IsTrusteeOver;
	//比赛相关附加属性结束-------------------

	//客户端版本号
	private String clientVersion;

	public Position getPosition() {
		if (locationInfor != null) {
			position = new Position(locationInfor.getPosX(), locationInfor.getPosY());
			return position;
		}
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public long getLocation_time() {
		return location_time;
	}

	public void setLocation_time(long location_time) {
		this.location_time = location_time;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public int getProxy_index() {
		return proxy_index;
	}

	public void setProxy_index(int proxy_index) {
		this.proxy_index = proxy_index;
	}

	public long getProxy_session_id() {
		return proxy_session_id;
	}

	public void setProxy_session_id(long proxy_session_id) {
		this.proxy_session_id = proxy_session_id;
	}

	public int getDay_all_round() {
		return day_all_round;
	}

	public void setDay_all_round(int day_all_round) {
		this.day_all_round = day_all_round;
	}

	public int getReward_count() {
		return reward_count;
	}

	public void setReward_count(int reward_count) {
		this.reward_count = reward_count;
	}

	public String getAccount_icon() {
		return account_icon == null ? "" : account_icon;
	}

	public void setAccount_icon(String account_icon) {
		this.account_icon = account_icon;
	}

	public String getAccount_ip() {
		return account_ip == null ? "" : account_ip;
	}

	public void setAccount_ip(String account_ip) {
		this.account_ip = account_ip;
	}

	public String getNick_name() {
		return nick_name == null ? "" : nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public int get_seat_index() {
		return _seat_index;
	}

	public void set_seat_index(int _seat_index) {
		this._seat_index = _seat_index;
	}

	public void clear() {
		this.room_id = 0;
		this._seat_index = GameConstants.INVALID_SEAT;
		this.channel = null;
		this.status = PlayerRoomStatus.INVALID;
		this.isOnline = false;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public int getSex() {
		if (sex == 1 || sex == 2) {
			return sex;
		}
		return 2;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAccount_ip_addr() {
		return account_ip_addr == null ? "" : account_ip_addr;
	}

	public void setAccount_ip_addr(String account_ip_addr) {
		this.account_ip_addr = account_ip_addr;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public int get_apply_index() {
		return _apply_index;
	}

	public void set_apply_index(int apply_index) {
		this._apply_index = apply_index;
	}

	public long getLeave_timer() {
		return this._leave_timer;
	}

	public void setLeave_timer(long leave_timer) {
		this._leave_timer = leave_timer;
	}

	public long getCarry_score() {
		return this._carry_score;
	}

	public void setCarry_score(long carry_score) {
		this._carry_score = carry_score;
	}

	public long getBu_score() {
		return this._bu_score;
	}

	public void setBu_score(long bu_score) {
		this._bu_score = bu_score;
	}

	public long getGame_score() {
		return this._game_score;
	}

	public void setGame_score(long game_score) {
		this._game_score = game_score;
	}

	public void setJoin_game(boolean is_join_game) {
		this._is_join_game = is_join_game;
	}

	public boolean getJoin_game() {
		return this._is_join_game;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [account_id=" + account_id + ", gold=" + gold + ", money=" + money + ", proxy_index=" + proxy_index + ", proxy_session_id="
				+ proxy_session_id + ", account_icon=" + account_icon + ", account_ip=" + account_ip + ", account_ip_addr=" + account_ip_addr
				+ ", nick_name=" + nick_name + ", room_id=" + room_id + ", sex=" + sex + ", _seat_index=" + _seat_index + ", isOnline=" + isOnline
				+ ", apply_index=" + _apply_index + "leave_timer = " + _leave_timer + "]";
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isRobot() {
		return isRobot;
	}

	public void setRobot(boolean isRobot) {
		this.isRobot = isRobot;
	}

	/**
	 * 准备游戏
	 *
	 * @param get_seat_index 座位
	 */
	public void readyGame(int seat_index) {
	}

	/**
	 * 调用相关机器人操作
	 */
	public void useAi(Response response) {
	}

	/**
	 * AI操作
	 */
	public void operationAi() {
	}

	public void pauseAi() {

	}

	public void continueAi() {

	}

	public int getClubJoinId() {
		return clubJoinId;
	}

	public void setClubJoinId(int clubJoinId) {
		this.clubJoinId = clubJoinId;
	}

	public int getGvoiceStatus() {
		return gvoiceStatus;
	}

	public void setGvoiceStatus(int gvoiceStatus) {
		this.gvoiceStatus = gvoiceStatus;
	}

	public boolean isMatch() {
		return isMatch;
	}

	public void setMatch(boolean isMatch) {
		this.isMatch = isMatch;
	}

	public int getMatchConnectStatus() {
		return matchConnectStatus;
	}

	public void setMatchConnectStatus(int matchConnectStatus) {
		this.matchConnectStatus = matchConnectStatus;
	}

	public static class Position {

		private double pos_x;
		private double pos_y;

		public Position() {
		}

		/**
		 * @param pos_x
		 * @param pos_y
		 */
		public Position(double pos_x, double pos_y) {
			this.pos_x = pos_x;
			this.pos_y = pos_y;
		}

		public double getPos_x() {
			return pos_x;
		}

		public void setPos_x(double pos_x) {
			this.pos_x = pos_x;
		}

		public double getPos_y() {
			return pos_y;
		}

		public void setPos_y(double pos_y) {
			this.pos_y = pos_y;
		}

		@Override
		public String toString() {
			return "Position [pos_x=" + pos_x + ", pos_y=" + pos_y + "]";
		}
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * 剩余出牌时间 单位秒
	 *
	 * @return
	 */
	public int getLeft_card_time(Room room) {
		int maxCardTime = room.getPlay_card_time();
		if (play_card_time <= 0) {
			return maxCardTime;
		}
		long now = System.currentTimeMillis();
		int missTime = (int) ((now - play_card_time) / 1000);
		int leftTime = maxCardTime - missTime;
		if (leftTime < 0) {
			leftTime = 0;
		}
		if (leftTime > maxCardTime) {
			leftTime = maxCardTime;
		}
		return leftTime;
	}

	public void setPlay_card_time(long play_card_time) {
		this.play_card_time = play_card_time;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Room getCurRoom() {
		return curRoom;
	}

	public void setCurRoom(Room curRoom) {
		this.curRoom = curRoom;
	}

	public boolean isIsTrusteeOver() {
		return IsTrusteeOver;
	}

	public void setIsTrusteeOver(boolean isTrusteeOver) {
		IsTrusteeOver = isTrusteeOver;
	}

	public int getMyTimes() {
		return myTimes;
	}

	public void setMyTimes(int myTimes) {
		this.myTimes = myTimes;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public MatchBaseScoreJsonModel getMyMatchBase() {
		return myMatchBase;
	}

	public void setMyMatchBase(MatchBaseScoreJsonModel myMatchBase) {
		this.myMatchBase = myMatchBase;
	}

	public String getMyHonorMsg() {
		return myHonorMsg;
	}

	public void setMyHonorMsg(String myHonorMsg) {
		this.myHonorMsg = myHonorMsg;
	}
}
