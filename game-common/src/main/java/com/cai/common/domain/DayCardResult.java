package com.cai.common.domain;

import java.io.Serializable;

/**
 * 
 * @author xwy
 * @date 2016年11月9日 -- 下午3:23:19
 *
 *       每日消耗 增加的房卡 数 查询类
 */
public class DayCardResult implements Serializable {

	private static final long serialVersionUID = 5849699393563449329L;

	/**
	 * 类型 对应 GameLogModel v2
	 */
	private Integer v2;

	private Integer v1;
	/**
	 * 总量
	 */
	private Integer total;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getV2() {
		return v2;
	}

	public void setV2(Integer v2) {
		this.v2 = v2;
	}

	public Integer getV1() {
		return v1;
	}

	public void setV1(Integer v1) {
		this.v1 = v1;
	}

}
