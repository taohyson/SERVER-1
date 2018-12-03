/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.List;

import com.cai.common.define.ITypeStatus;
import com.cai.common.domain.StatusModule;
import com.google.common.collect.Lists;

import protobuf.clazz.Common.CommonII;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月13日 上午10:00:57 <br/>
 */
public final class StatusUtil {

	/**
	 * 
	 * @param statusModule
	 * @param status
	 * @return
	 */
	public static List<CommonII> toStatusBuilder(StatusModule statusModule, ITypeStatus[] status) {
		List<CommonII> list = Lists.newArrayList();
		for (ITypeStatus s : status) {
			if (s.position() < 0)
				continue;
			list.add(CommonII.newBuilder().setK(s.position()).setV(statusModule.isStatusTrue(s) ? 1 : 0).build());
		}
		return list;
	}

	private StatusUtil() {
	}
}
