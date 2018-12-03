/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import com.cai.common.util.AbstractRoomBehaviour;
import com.cai.common.util.RoomBehaviour;

/**
 * 房间内的玩家管理
 *
 * @author wu_hc date: 2017年9月12日 下午12:30:45 <br/>
 */
public final class GamePlayerGroup extends AbstractRoomBehaviour implements RoomBehaviour {

	public GamePlayerGroup(Room room) {
		super(room);
	}
}
