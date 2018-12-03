package com.cai.common.util;

/**
 * 
 * 自定义运行时异常
 *
 * @author wu_hc date: 2017年10月13日 上午11:11:29 <br/>
 */
public final class XYGameException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public XYGameException() {
		super();
	}

	public XYGameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public XYGameException(String message, Throwable cause) {
		super(message, cause);
	}

	public XYGameException(String message) {
		super(message);
	}

	public XYGameException(Throwable cause) {
		super(cause);
	}

}
