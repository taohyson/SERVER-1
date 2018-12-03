/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.cai.common.define.EServerType;

/**
 * 用于注解请求处理器
 * 
 * @author wu_hc
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ICmd {

	/**
	 * 协议号
	 * 
	 * @return
	 */
	int code();

	/**
	 * 
	 * protobuf 字段拓展名称
	 */
	String exName() default "";

	/**
	 * 
	 * 如果不是在代理服处理，需要特别指定
	 */
	EServerType msgType() default EServerType.PROXY;

	/**
	 * 
	 * @return
	 */
	String desc() default "";

}
