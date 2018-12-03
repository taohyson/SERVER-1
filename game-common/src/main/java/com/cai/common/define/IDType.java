/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *
 * @author wu_hc date: 2017年8月4日 下午2:25:02 <br/>
 */
public enum IDType {

	/**
	 * 牌局
	 */
	BRAND,

	/**
	 * 普通房间ID
	 */
	NORMAL_ROOM,

	/**
	 * 金币场房间ID
	 */
	COIN_ROOM,

	;//上面的顺序不准乱动，只能往后加，默认使用了ordinal的
	public static IDType getIDType(int ordinal)
	{
		for (IDType c : IDType.values())
		{
			if(c.ordinal()==ordinal)
				return c;
		}
		return null;
	}

}
