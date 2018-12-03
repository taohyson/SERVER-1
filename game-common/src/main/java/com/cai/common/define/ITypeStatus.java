/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 * 状态管理
 * 
 * @author wu_hc date: 2017年10月18日 下午4:59:06 <br/>
 */
public interface ITypeStatus {

	/**
	 * [0<= position < 32]
	 * 
	 * @return
	 */
	byte position();

	/**
	 * 
	 * @return
	 */
//	<T extends ITypeStatus> List<T> values_();
}
