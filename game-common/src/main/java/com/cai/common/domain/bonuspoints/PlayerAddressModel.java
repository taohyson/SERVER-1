package com.cai.common.domain.bonuspoints;

/**
 * 
 * 玩家地址
 *
 * @author tang date: 2018年7月3日 上午11:46:34 <br/>
 */
public class PlayerAddressModel {
	private long account_id;

	private String name;

	private long phone;

	private String address;

	private int postcode;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
}
