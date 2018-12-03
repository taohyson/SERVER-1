package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClubRoomOverModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int clubId;
	
	private int[] win_order;
	
	private List<ClubRoomPlayerModel> players = new ArrayList<>();

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
	
	public List<ClubRoomPlayerModel> getPlayers() {
		return players;
	}

	public int[] getWin_order() {
		return win_order;
	}

	public void setWin_order(int[] win_order) {
		this.win_order = win_order;
	}

	public static class ClubRoomPlayerModel implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private long accountId;
		private int round;
		private float score;
		
		public long getAccountId() {
			return accountId;
		}
		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}
		public int getRound() {
			return round;
		}
		public void setRound(int round) {
			this.round = round;
		}
		public float getScore() {
			return score;
		}
		public void setScore(float score) {
			this.score = score;
		}
	}

}
