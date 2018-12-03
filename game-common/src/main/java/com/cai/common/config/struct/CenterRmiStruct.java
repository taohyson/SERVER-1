/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config.struct;

import com.cai.common.config.EnumConfig;
import com.cai.common.config.IConfig;

/**
 *
 * @author wu_hc
 */
@IConfig(tag = EnumConfig.RMI)
public final class CenterRmiStruct implements Config {
	private String hostNode;

	public String getHostNode() {
		return hostNode;
	}

	public void setHostNode(String hostNode) {
		this.hostNode = hostNode;
	}

	@Override
	public String toString() {
		return "CenterRmiStruct [hostNode=" + hostNode + "]";
	}

}
