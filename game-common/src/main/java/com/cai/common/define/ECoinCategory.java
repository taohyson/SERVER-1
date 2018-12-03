package com.cai.common.define;

/**
 * 金币场次类型
 *
 * @author wu_hc date: 2018年08月10日 下午2:34:57 <br/>
 */
public enum ECoinCategory {

	/**
	 * 初级
	 */
	PRIMARY(1, "初级场"),

	/**
	 * 中级
	 */
	INTERMEDIATE(2, "中级场"),

	/**
	 * 高级
	 */
	SENIOR(3, "高级场"),

	/**
	 * 刺激场
	 */
	EXCITE(4, "刺激场"),
	;

	final int category;
	final String description;

	private ECoinCategory(int category, String description) {
		this.category = category;
		this.description = description;
	}

	public final int category() {
		return this.category;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * @param category
	 * @return
	 */
	public static ECoinCategory of(int category) {
		for (ECoinCategory type : ECoinCategory.values()) {
			if (category == type.category) {
				return type;
			}
		}
		return null;
	}
}
