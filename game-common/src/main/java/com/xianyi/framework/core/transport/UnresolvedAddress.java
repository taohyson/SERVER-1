/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import static com.google.common.base.Preconditions.*;

/**
 *
 * @author wu_hc
 */
public final class UnresolvedAddress {

	private final String host;
	private final int port;

	public UnresolvedAddress(String host, int port) {
		checkNotNull(host, "host can't be null");
		checkArgument(port > 0 && port < 0xFFFF, "port out of range:" + port);

		this.host = host;
		this.port = port;
	}

	/**
	 * 
	 * @param hostAndPort[host:ip]
	 */
	public UnresolvedAddress(final String hostAndPort) {
		String[] hostPort = hostAndPort.split("\\:");
		String host = hostPort[0];
		int port = Integer.parseInt(hostPort[1]);
		checkNotNull(host, "host can't be null");
		checkArgument(port > 0 && port < 0xFFFF, "port out of range:" + port);
		this.host = host;
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UnresolvedAddress that = (UnresolvedAddress) o;

		return port == that.port && host.equals(that.host);
	}

	@Override
	public int hashCode() {
		int result = host.hashCode();
		result = 31 * result + port;
		return result;
	}

	@Override
	public String toString() {
		return host + ':' + port;
	}
}
