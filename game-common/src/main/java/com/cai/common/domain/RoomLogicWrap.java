/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 房间&逻辑服关系
 *
 * @author wu_hc date: 2017年8月12日 下午1:24:32 <br/>
 */
public class RoomLogicWrap {

	public final int roomId;
	public final int logicIndex;

	/**
	 * @param roomId
	 * @param logicIndex
	 */
	private RoomLogicWrap(int roomId, int logicIndex) {
		this.roomId = roomId;
		this.logicIndex = logicIndex;
	}

	/**
	 * 
	 * @param roomId
	 * @param logicIndex
	 * @return
	 */
	public static final RoomLogicWrap of(int roomId, int logicIndex) {
		return new RoomLogicWrap(roomId, logicIndex);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		RoomLogicWrap that = (RoomLogicWrap) o;

		return this.toString().equals(that.toString());
	}

	@Override
	public int hashCode() {
		return 31 * roomId + logicIndex;
	}

	@Override
	public String toString() {
		return Integer.toString(roomId) + ':' + logicIndex;
	}
}
