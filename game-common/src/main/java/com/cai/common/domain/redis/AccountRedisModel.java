/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain.redis;

import java.io.Serializable;

/**
 * 
 * 
 *
 * @author wu_hc date: 2018年5月18日 下午3:00:35 <br/>
 */
public final class AccountRedisModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long accountId;

	private int roomId;
	private byte roomType; // 1普通房间，2金币场 3比赛场
	private int logicIndex;
}
