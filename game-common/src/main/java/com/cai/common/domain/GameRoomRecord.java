package com.cai.common.domain;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.cai.common.constant.GameConstants;

public class GameRoomRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3962864936499226636L;

	private PlayerResult _player;

	private int room_id;
	/**
	 * 房间里的人
	 */
	private Player[] players;// new RoomPlayer[4];

	 /**
	 * 创建时间
	 */
	private long create_time;

	/**
	 * 创建人
	 */
	private long room_owner_account_id;
	/**
	 * 创建人
	 */
	private String room_owner_name;

	private long _record_id;

	public int end_type;

	public int release_players[];

	public int request_player_seat = GameConstants.INVALID_SEAT;

	public int game_id;

	private Player create_player;

	/**
	 * 开局时间,单位秒
	 */
	private int start_time;

	/**
	 * 默认4人
	 */
	public GameRoomRecord() {
		this(4);
	}

	public GameRoomRecord(int maxSize) {
		players = new Player[maxSize];
		release_players = new int[maxSize];
	}

	public String to_json() {
		try {
			String s = JSON.toJSONString(this,SerializerFeature.IgnoreNonFieldGetter);
			return s;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static GameRoomRecord to_Object(String str) {
		try {
			return JSON.parseObject(str, GameRoomRecord.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public PlayerResult get_player() {
		return _player;
	}

	public void set_player(PlayerResult _player) {
		this._player = _player;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
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

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public int getEnd_type() {
		return end_type;
	}

	public void setEnd_type(int end_type) {
		this.end_type = end_type;
	}

	public int[] getRelease_players() {
		return release_players;
	}

	public void setRelease_players(int[] release_players) {
		this.release_players = release_players;
	}

	public int getRequest_player_seat() {
		return request_player_seat;
	}

	public void setRequest_player_seat(int request_player_seat) {
		this.request_player_seat = request_player_seat;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public Player getCreate_player() {
		return create_player;
	}

	public void setCreate_player(Player create_player) {
		this.create_player = create_player;
	}

	public int getStart_time() {
		return start_time;
	}

	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}

}
