package com.cai.common.domain;

public class PushKeyModel {
	private String appKey;
	private String masterSecret;
	private String certFile;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getMasterSecret() {
		return masterSecret;
	}

	public void setMasterSecret(String masterSecret) {
		this.masterSecret = masterSecret;
	}

	public String getCertFile() {
		return certFile;
	}

	public void setCertFile(String certFile) {
		this.certFile = certFile;
	}

	public PushKeyModel(String appKey, String masterSecret, String certFile) {
		super();
		this.appKey = appKey;
		this.masterSecret = masterSecret;
		this.certFile = certFile;
	}
}
