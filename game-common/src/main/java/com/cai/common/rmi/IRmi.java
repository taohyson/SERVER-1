/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.rmi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 *
 * @author wu_hc date: 2017年10月17日 下午4:02:32 <br/>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IRmi {

	/**
	 * 
	 * @return
	 */
	int cmd();

	/**
	 * 
	 * @return
	 */
	String desc() default "";
}
