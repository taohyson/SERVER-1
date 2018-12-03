/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 *
 * @author wu_hc date: 2017年7月24日 下午6:32:55 <br/>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IServerCmd {
	/**
	 * 协议号
	 * 
	 * @return
	 */
	int code();

	/**
	 * 
	 * @return
	 */
	String desc() default "";
}
