package com.cai.common.domain;

/**
 * 推送上报信息
 * 
 * @author tang
 *
 */
public class AccountPushModel extends DBBaseModel {

	private static final long serialVersionUID = -1;

	/**
	 * 游戏id
	 */
	private long id;

	private long account_id;

	private String equipment_id;

	private int plat;// 1极光，2ios，3信鸽
	private int channel;// EPushChannel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getEquipment_id() {
		return equipment_id;
	}

	public void setEquipment_id(String equipment_id) {
		this.equipment_id = equipment_id;
	}

	public int getPlat() {
		return plat;
	}

	public void setPlat(int plat) {
		this.plat = plat;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

}
