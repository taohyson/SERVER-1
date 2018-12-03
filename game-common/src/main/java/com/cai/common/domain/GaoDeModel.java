package com.cai.common.domain;


import java.io.Serializable;

public class GaoDeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Integer cityParent;
	private String pinYin;
	private Integer adcode;
	private Integer cityCode;
	private String cityName;
	private Integer gpsCityCode;
	private int type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getCityParent() {
		return cityParent;
	}
	public void setCityParent(Integer cityParent) {
		this.cityParent = cityParent;
	}
	
	public String getPinYin() {
		return pinYin;
	}
	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}
	public Integer getAdcode() {
		return adcode;
	}
	public void setAdcode(Integer adcode) {
		this.adcode = adcode;
	}
	public Integer getCityCode() {
		return cityCode;
	}
	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getGpsCityCode() {
		return gpsCityCode;
	}
	public void setGpsCityCode(Integer gpsCityCode) {
		this.gpsCityCode = gpsCityCode;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	

}
