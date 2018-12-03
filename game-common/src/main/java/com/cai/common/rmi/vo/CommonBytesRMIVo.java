/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 
 * 传输字节流通用
 *
 * @author wu_hc date: 2017年11月25日 上午11:35:23 <br/>
 */
public final class CommonBytesRMIVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int status;
	private byte[] bytes;
	private String msg;

	/**
	 * 
	 * @param status
	 * @param msg
	 * @return
	 */
	public static CommonBytesRMIVo newVo(int status, String msg) {
		return new CommonBytesRMIVo(status, null, msg);
	}

	/**
	 * 
	 * @param status
	 * @param message
	 * @param msg
	 * @return
	 */
	public static CommonBytesRMIVo newVo(int status, byte[] bytes, String msg) {
		return new CommonBytesRMIVo(status, bytes, msg);
	}

	public CommonBytesRMIVo(int status, byte[] bytes, String msg) {
		this.status = status;
		this.bytes = bytes;
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CommonBytesRMIVo [status=" + status + ", bytes=" + Arrays.toString(bytes) + ", msg=" + msg + "]";
	}

}
