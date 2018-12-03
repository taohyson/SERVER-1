package com.cai.common;

import java.io.Serializable;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/22 18:02
 */
public class PhoneCardCallBackInfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String orderId;

	private String tranId;

	private int resultNo;

	private String vstr;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public int getResultNo() {
		return resultNo;
	}

	public void setResultNo(int resultNo) {
		this.resultNo = resultNo;
	}

	public String getVstr() {
		return vstr;
	}

	public void setVstr(String vstr) {
		this.vstr = vstr;
	}
}
