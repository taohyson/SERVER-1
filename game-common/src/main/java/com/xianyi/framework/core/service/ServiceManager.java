/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.service;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.util.Lifecycle;
import com.cai.common.util.LoadPackageClasses;
import com.google.common.collect.Sets;

/**
 * 服务管理中心
 * 
 * @author wu_hc
 */
public final class ServiceManager implements Lifecycle {

	/**
	 * 日志
	 */
	private static Logger log = LoggerFactory.getLogger(ServiceManager.class);

	private static final ServiceManager MGR = new ServiceManager();

	private final Set<AbstractService> services = Sets.newHashSet();

	public static ServiceManager getInstance() {
		return ServiceManager.MGR;
	}

	private ServiceManager() {
	}

	public void loadServices(String[] packagesToScan) {
		LoadPackageClasses loader = new LoadPackageClasses(packagesToScan, IService.class);
		try {
			Set<Class<?>> handlerClassz = loader.getClassSet();
			for (final Class<?> cls : handlerClassz) {
				IService serviceAnnotation = cls.getAnnotation(IService.class);
				if (null == serviceAnnotation)
					throw new RuntimeException(String.format("解析服务[%s]出错，请检查注解是否正确!!", cls.getName()));
				Method getInstance = cls.getMethod("getInstance");
				AbstractService service = (AbstractService) getInstance.invoke(null);
				service.setOrder(serviceAnnotation.order());
				service.setDesc(serviceAnnotation.desc());
				services.add(service);
			}
		} catch (Exception e) {
			log.error("解析服务出错!", e);
			e.printStackTrace();
		}
		log.info("========服务初始化完成========");
	}

	@Override
	public void start() throws Exception {

		List<AbstractService> ss = services.stream().sorted(comparingInt(AbstractService::order)).collect(toList());
		for (AbstractService s : ss) {
			s.start();
		}
	}

	@Override
	public void stop() throws Exception {
		List<AbstractService> ss = services.stream().sorted(comparingInt(AbstractService::order).reversed()).collect(toList());
		ss.forEach((s) -> {
			try {
				s.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		services.clear();
	}

	public static void main(String[] args) {
		ServiceManager.getInstance().loadServices(new String[] { "com.xianyi.framework.core.service" });
	}
}
