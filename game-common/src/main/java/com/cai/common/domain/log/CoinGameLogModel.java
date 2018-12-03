/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain.log;

import java.util.Date;
import java.util.Map;

import com.cai.common.define.EClubEventType;
import com.cai.common.define.ECoinCategory;
import com.google.common.collect.Maps;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 金币场子游戏日志,不针对场次
 *
 * @author wu_hc date: 2018/11/20 16:30 <br/>
 */
@Document(collection = "coin_game_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_gameTypIndex", def = "{'gameTypIndex': 1}") })
public final class CoinGameLogModel extends BaseLogModel {

	private String _id;

	private int gameTypIndex; //子游戏

	private Date create_time;

	@Transient private final Map<ECoinCategory, CoinBoxData> boxDataMap = Maps.newHashMap();
	private String boxData;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getGameTypIndex() {
		return gameTypIndex;
	}

	public void setGameTypIndex(int gameTypIndex) {
		this.gameTypIndex = gameTypIndex;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getBoxData() {
		return boxData;
	}

	public void setBoxData(String boxData) {
		this.boxData = boxData;
	}

}
