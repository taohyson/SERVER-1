package com.cai.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring util
 * 
 * @author run
 * @date 2013-6-11
 */
public class SpringService {

	private static final Logger logger = LoggerFactory.getLogger(SpringService.class);

	private static ApplicationContext ctx = null;

	static {
		logger.info("==========spring 启动中============");
		PerformanceTimer timer = new PerformanceTimer();
		ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		logger.info("===================spring 启动完成" + timer.getStr() + "==============================");

		// //调试信息
		// StringBuffer buf = new StringBuffer();
		// buf.append("\r\n===========spring bean
		// 详细信息(调试)========================================================\r\n");
		// buf.append("bean数量:" + ctx.getBeanDefinitionCount() + "\r\n");
		// buf.append("bean list:\r\n");
		// for(String name : ctx.getBeanDefinitionNames()){
		// buf.append(name+"\r\n");
		// }
		// buf.append("=======================================================================================");
		// logger.info(buf.toString());

	}

	// 马上启动，调不调用都不会影响
	public static void start() {

	}

	public static Object getBean(String name) {
		return ctx.getBean(name);
	}

	public static <T> T getBean(String name, Class<T> requiredType) {
		return ctx.getBean(name, requiredType);
	}

	public static <T> T getBean(Class<T> requiredType) {
		return ctx.getBean(requiredType);
	}

	// 不要对外，保证ctx引用不会被更改
	public static ApplicationContext getCtx() {
		return ctx;
	}

}
