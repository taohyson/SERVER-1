package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 胡牌类型
 * @author run
 *
 */
public final class HuTypeModel implements Serializable{

	/**
	 * 创建时间
	 */
	private Date create_time;

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
}
