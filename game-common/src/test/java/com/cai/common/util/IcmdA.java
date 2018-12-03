/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.util;

import com.xianyi.framework.core.service.AbstractService;
import com.xianyi.framework.core.service.IService;

/**
 *
 * @author wu_hc
 */
@IService(order = 12, desc = "")
public final class IcmdA extends AbstractService {
	public static IcmdA getInstance() {
		return new IcmdA();
	}

	@Override
	public void start() throws Exception {

	}

	@Override
	public void stop() throws Exception {

	}
}
