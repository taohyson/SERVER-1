package com.cai.common.domain.json;

import java.io.Serializable;
import java.util.List;

public class RoomDetailJsonModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 游戏大类型名字
	 */
	private String gameName;
	
	/**
	 * 子类型名字
	 */
	private String gameSubName;
	
	private String gameDesc;

	private int roomStatus;

	private int curRound;
	
	private int game_id;
	
	private int game_type_index;
	
	private List<String> players;
	
	private List<String> headPics;
	
	private int club_id;
	
	private String club_name;
	
	private long createAccountId;
	
	private String nickName;
	
	private String createHeadPic;
	
	

	public long getCreateAccountId() {
		return createAccountId;
	}

	public void setCreateAccountId(long createAccountId) {
		this.createAccountId = createAccountId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCreateHeadPic() {
		return createHeadPic;
	}

	public void setCreateHeadPic(String createHeadPic) {
		this.createHeadPic = createHeadPic;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameDesc() {
		return gameDesc;
	}

	public void setGameDesc(String gameDesc) {
		this.gameDesc = gameDesc;
	}

	public List<String> getHeadPics() {
		return headPics;
	}

	public void setHeadPics(List<String> headPics) {
		this.headPics = headPics;
	}

	public int getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(int roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getCurRound() {
		return curRound;
	}

	public void setCurRound(int curRound) {
		this.curRound = curRound;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public List<String> getPlayers() {
		return players;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}

	public String getGameSubName() {
		return gameSubName;
	}

	public void setGameSubName(String gameSubName) {
		this.gameSubName = gameSubName;
	}

	public String getClub_name() {
		return club_name;
	}

	public void setClub_name(String club_name) {
		this.club_name = club_name;
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

}
