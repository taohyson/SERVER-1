package com.cai.common.domain;

/**
 * @author wu_hc date: 2018年08月10日 下午4:13:27 <br/>
 */
public final class CardCategoryModel extends DBBaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 条件id
	 */
	private int id;

	/**
	 * 游戏id
	 */
	private int gameId;

	/**
	 * 牌型值[0x00000040]
	 */
	private String cardTypeValue;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 引用自哪里
	 */
	private String ref;

	/**
	 * 0关闭，1开启
	 */
	private byte status;

	/**
	 * 如果有此牌型,结算时是否需要展示在客户端
	 */
	private byte isClientShow;

	/**
	 * 排序值
	 */
	private int sort;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getCardTypeValue() {
		return cardTypeValue;
	}

	public void setCardTypeValue(String cardTypeValue) {
		this.cardTypeValue = cardTypeValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getIsClientShow() {
		return isClientShow;
	}

	public void setIsClientShow(byte isClientShow) {
		this.isClientShow = isClientShow;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}
}
