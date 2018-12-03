/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import com.cai.common.constant.Symbol;
import com.google.common.primitives.Longs;

/**
 * {@link https://baike.baidu.com/item/%E5%8C%BA%E9%97%B4/1273117?fr=aladdin}
 *
 * @author wu_hc date: 2018年2月5日 下午3:43:21 <br/>
 */
public final class XYRange {

	/**
	 * (3,4]:55
	 */
	private final String rangeDesc;

	private int begin;
	private int end;

	/**
	 * 区间对应的值
	 */
	private long value;

	public XYRange(String rangeCost) {
		this.rangeDesc = rangeCost;
		parse();
	}

	/**
	 * 解析区间 (2,3]:4 (2,3):4 [2,3):4 ，此处不做异常捕获 ，抛给上层捕获
	 */
	private void parse() {
		String[] rangeArray = rangeDesc.split(Symbol.COLON);
		String desc = rangeArray[0];

		if (rangeArray.length > 2) {
			Long value_ = Longs.tryParse(rangeArray[1]);
			if (null != value_) {
				value = value_.longValue();
			}
		}

		char s = desc.charAt(0);
		char e = desc.charAt(desc.length() - 1);
		String tmp = desc.substring(1, desc.length() - 1);
		String[] arr = tmp.split(Symbol.COMMA);

		begin = Integer.parseInt(arr[0]);
		end = Integer.parseInt(arr[1]);
		if (s == '(') {
			begin = Math.max(0, begin + 1);
		}

		if (e == ')') {
			end = Math.max(0, end - 1);
		}

		if (end < begin) {
			throw new IllegalArgumentException(rangeDesc);
		}
	}

	public int getBegin() {
		return begin;
	}

	public int getEnd() {
		return end;
	}

	public long getValue() {
		return value;
	}

	public long getIntValue() {
		return (int) value;
	}

	public XYRange setValue(long value) {
		this.value = value;
		return this;
	}

	public String getRangeCost() {
		return rangeDesc;
	}

	public boolean inRange(int num) {
		return begin <= num && num <= end;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rangeDesc == null) ? 0 : rangeDesc.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ClubCostRange [rangeCost=" + rangeDesc + ", begin=" + begin + ", end=" + end + ", value=" + value + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		XYRange other = (XYRange) obj;
		if (rangeDesc == null) {
			if (other.rangeDesc != null)
				return false;
		} else if (!rangeDesc.equals(other.rangeDesc))
			return false;
		return true;
	}

	public static void main(String[] args) {
		String str = "(3,5]";
		XYRange r = new XYRange(str);
		System.err.println(r.getBegin() + "  " + r.getEnd() + " " + r.getValue());
	}
}
