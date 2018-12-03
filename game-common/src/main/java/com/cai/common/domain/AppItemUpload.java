package com.cai.common.domain;

public class AppItemUpload {
	private AppItem appItem;
	private String fullFilePath;
	private String diffFilePath;
	private String picPath;
	public AppItem getAppItem() {
		return appItem;
	}
	public void setAppItem(AppItem appItem) {
		this.appItem = appItem;
	}
	public String getFullFilePath() {
		return fullFilePath;
	}
	public void setFullFilePath(String fullFilePath) {
		this.fullFilePath = fullFilePath;
	}
	public String getDiffFilePath() {
		return diffFilePath;
	}
	public void setDiffFilePath(String diffFilePath) {
		this.diffFilePath = diffFilePath;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
}
