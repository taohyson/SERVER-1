/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 玩家状态
 *
 * @author wu_hc date: 2017年7月25日 下午12:17:47 <br/>
 */
public enum ERoomStatus {
	/**
	 * 
	 */
	NONE((byte) -1, "-"),

	/**
	 * 
	 */
	CREATE((byte) 1, "创建"),

	/**
	 * 
	 */
	WAIT((byte) 2, "等待开局"),

	/**
	 * 
	 */
	PLAYER_ENTER((byte) 3, "玩家加入"),

	/**
	 * 
	 */
	PLAYER_EXIT((byte) 4, "玩家离开"),

	/**
	 * 
	 */
	PLAYER_READY((byte) 5, "玩家准备"),

	/**
	 * 
	 */
	START((byte) 6, "开始"),

	/**
	 * 
	 */
	END((byte) 7, "结束"),

	/**
	 * 
	 */
	NEXT((byte) 8, "下一局"),

	/**
	 * 
	 */
	UPDATE_RULE((byte) 9, "修改玩法"),

	/**
	 * 删除俱乐部
	 */
	DEL((byte) 10, "删除"),

	/**
	 * 
	 */
	DELETE_RULE((byte) 11, "-删除玩法"),

	/**
	 * 
	 */
	L_2_CLUB_ROOM_SYNC((byte) 12, "状态同步"),

	/**
	 * 
	 */
	SNAPSHOT((byte) 13, "结算快照"),

	/**
	 * 
	 */
	OBERSER((byte) 14, "加入观战"),

	/**
	 * 
	 */
	TABLE_REFRESH((byte) 15, "整个牌桌刷新"),

	/**
	 * 
	 */
	KICK_PLAYER((byte) 16, "踢出桌子玩家，为开始放可以"),

	/**
	 * 
	 */
	TABLE_MIN_PLAYER_COUNT((byte) 17, "桌子最小开局人数"),

	ADD_RULE((byte) 18, "添加玩法/包间"),

	ROUND_SNAPSHOT((byte) 19, "俱乐部比赛分数统计");

	private final byte status;
	private final String desc;

	private ERoomStatus(byte status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	/**
	 * @return the status
	 */
	public byte status() {
		return status;
	}

	/**
	 * @return the desc
	 */
	public String desc() {
		return desc;
	}

	public static ERoomStatus of(int status) {
		for (ERoomStatus t : ERoomStatus.values()) {
			if (status == t.status)
				return t;
		}
		return NONE;
	}

}
