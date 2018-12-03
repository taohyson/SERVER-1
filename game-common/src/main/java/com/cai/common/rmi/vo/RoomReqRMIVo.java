/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月25日 上午11:35:23 <br/>
 */
public final class RoomReqRMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 类型 @see com.cai.common.define.IReqRedisRoomType
	 */
	private int type;

	/**
	 * 对应的参数
	 */
	private long value;

	/**
	 * 
	 * @param type
	 * @param value
	 * @return
	 */
	public static RoomReqRMIVo newVo(int type, long value) {
		return new RoomReqRMIVo(type, value);
	}

	private RoomReqRMIVo(int type, long value) {
		super();
		this.type = type;
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public RoomReqRMIVo setType(int type) {
		this.type = type;
		return this;
	}

	public long getValue() {
		return value;
	}

	public RoomReqRMIVo setValue(long value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return "RoomReqRMIVo [type=" + type + ", value=" + value + "]";
	}

}
