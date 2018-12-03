package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

/**
 * 存放在redis上的房间
 * 
 * @author run
 *
 */
public class RoomRedisModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 房间号
	 */
	private int room_id;

	private String passwd = "123456";

	/**
	 * 逻辑服
	 */
	private int logic_index;

	/**
	 * 所有玩家
	 */
	private Set<Long> playersIdSet = Sets.newConcurrentHashSet();

	/**
	 * 创建时间
	 */
	private long create_time;

	/**
	 * 局数
	 */
	private int game_round;

	/**
	 * 玩法
	 */
	private int game_rule_index;

	/**
	 * 麻将类型,小id
	 */
	private int game_type_index;

	private int pass;

	/**
	 * 最后刷新的时间,10分钟只刷新一次
	 */
	private long last_flush_time;

	/**
	 * 所有ip
	 */
	private Set<String> ipSet = Sets.newConcurrentHashSet();

	/**
	 * 
	 */
	private List<String> names = new ArrayList<>();

	private boolean isStart = false;
	/**
	 * 玩法
	 */
	private String gameRuleDes;

	// 大id
	private int game_id;

	/**
	 * 状态
	 */
	private int roomStatus;

	/**
	 * 最大人数
	 */
	private int player_max;

	/**
	 * 当前人数
	 */
	private int cur_player_num;

	/**
	 * 就不是代开
	 */
	private boolean proxy_room = false;

	/**
	 * 代理人id
	 */
	private long create_account_id;

	/**
	 * 是否金币场
	 */
	private boolean isMoneyRoom;

	private String groupID;

	private int isInner;

	private int base_score;// 底分

	private int max_times;// 最大倍数

	private int club_id;

	private int rule_id;

	private int table_index;

	private String clubName;

	private int[] gameRuleIndexEx;

	private String gameName;
	
	private int createType;
	
	private int cur_round;

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int[] getGameRuleIndexEx() {
		return gameRuleIndexEx;
	}

	public void setGameRuleIndexEx(int[] gameRuleIndexEx) {
		this.gameRuleIndexEx = gameRuleIndexEx;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getLogic_index() {
		return logic_index;
	}

	public void setLogic_index(int logic_index) {
		this.logic_index = logic_index;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Set<Long> getPlayersIdSet() {
		return playersIdSet;
	}

	public void setPlayersIdSet(Set<Long> playersIdSet) {
		this.playersIdSet = playersIdSet;
	}

	public long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}

	public int getGame_round() {
		return game_round;
	}

	public void setGame_round(int game_round) {
		this.game_round = game_round;
	}

	public int getBase_score() {
		return base_score;
	}

	public void setBase_score(int base_score) {
		this.base_score = base_score;
	}

	public int getMax_times() {
		return max_times;
	}

	public void setMax_times(int max_times) {
		this.max_times = max_times;
	}

	public int getGame_rule_index() {
		return game_rule_index;
	}

	public void setGame_rule_index(int game_rule_index) {
		this.game_rule_index = game_rule_index;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public int getPass() {
		pass = (int) (System.currentTimeMillis() - create_time);
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public long getLast_flush_time() {
		return last_flush_time;
	}

	public void setLast_flush_time(long last_flush_time) {
		this.last_flush_time = last_flush_time;
	}

	public Set<String> getIpSet() {
		return ipSet;
	}

	public void setIpSet(Set<String> ipSet) {
		this.ipSet = ipSet;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public String getGameRuleDes() {
		return gameRuleDes;
	}

	public void setGameRuleDes(String gameRuleDes) {
		this.gameRuleDes = gameRuleDes;
	}

	public int getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(int roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getPlayer_max() {
		return player_max;
	}

	public void setPlayer_max(int player_max) {
		this.player_max = player_max;
	}

	public int getCur_player_num() {
		return cur_player_num;
	}

	public void setCur_player_num(int cur_player_num) {
		this.cur_player_num = cur_player_num;
	}

	public boolean isProxy_room() {
		return proxy_room;
	}

	public void setProxy_room(boolean proxy_room) {
		this.proxy_room = proxy_room;
	}

	public long getCreate_account_id() {
		return create_account_id;
	}

	public void setCreate_account_id(long create_account_id) {
		this.create_account_id = create_account_id;
	}

	public boolean isMoneyRoom() {
		return isMoneyRoom;
	}

	public void setMoneyRoom(boolean isMoneyRoom) {
		this.isMoneyRoom = isMoneyRoom;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public int getIsInner() {
		return isInner;
	}

	public void setIsInner(int isInner) {
		this.isInner = isInner;
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public boolean isStart() {
		return isStart;
	}

	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getRule_id() {
		return rule_id;
	}

	public void setRule_id(int rule_id) {
		this.rule_id = rule_id;
	}

	public int getTable_index() {
		return table_index;
	}

	public void setTable_index(int table_index) {
		this.table_index = table_index;
	}

	public int getCur_round() {
		return cur_round;
	}

	public void setCur_round(int cur_round) {
		this.cur_round = cur_round;
	}

	public int getCreateType() {
		return createType;
	}

	public void setCreateType(int createType) {
		this.createType = createType;
	}

}
