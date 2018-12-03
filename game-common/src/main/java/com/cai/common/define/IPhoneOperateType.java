/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 * 手机绑定操作类型
 *
 * @author wu_hc date: 2017年12月1日 下午5:24:20 <br/>
 */
public interface IPhoneOperateType {

	// 1绑定 2解绑 3更换 4是否绑定

	int BIND = 1;

	int UN_BIND = 2;

	int BIND_INFO = 3;

	int SWITCH = 4;

	int HAS_BIND = 5;

}
