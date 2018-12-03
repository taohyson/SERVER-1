/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.type;

/**
 * 
 *
 * @author wu_hc date: 2018年6月25日 上午11:38:00 <br/>
 */
public interface PlayerRoomStatus {
	int INVALID = 0; // 无效
	int NORMAL = 1; // 正常开房
	int OBSERVER = 2; // 上帝视角
	int GOD_OBSERVER = 3; // 围观
}
