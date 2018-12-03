package com.cai.common.domain;

import java.util.Date;

/**
 * 玩家在客户端上传二维码实体
 * @author wuhaoran
 */
public class ClientUploadErWeiMaModel extends DBBaseModel {

	private static final long serialVersionUID = 1L;
	private int id;				//主键
	private long accountId;		//账号ID
	private String image;			//二维码图片
	private int uploadStatus;		//上传状态(1已上传2审核3审核未通过)
	private Date uploadTime;		//上传时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getUploadStatus() {
		return uploadStatus;
	}
	public void setUploadStatus(int uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
}
