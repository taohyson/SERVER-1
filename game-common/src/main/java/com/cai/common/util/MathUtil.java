package com.cai.common.util;

import java.math.BigDecimal;

/**
 * 运算
 * @author chansonyan
 * 2018年6月20日
 */
public class MathUtil {

	/**
	 * 基于base值求增长率
	 * @param current
	 * @param base
	 * @return
	 */
	public static double getGrowthRate(double current, double base) {
		if(base == 0) {
			base = 1;
		}
		BigDecimal bigDecimal = new BigDecimal(current);
		BigDecimal bigDecimal2 = new BigDecimal(base);
		return bigDecimal.subtract(bigDecimal2).divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 基于base值求增长率
	 * @param current
	 * @param base
	 * @return
	 */
	public static double getGrowthRate(int current, int base) {
		if(base == 0) {
			base = 1;
		}
		BigDecimal bigDecimal = new BigDecimal(current);
		BigDecimal bigDecimal2 = new BigDecimal(base);
		return bigDecimal.subtract(bigDecimal2).divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 基于base值求增长率
	 * @param current
	 * @param base
	 * @return
	 */
	public static double getGrowthRate(long current, long base) {
		if(base == 0) {
			base = 1;
		}
		BigDecimal bigDecimal = new BigDecimal(current);
		BigDecimal bigDecimal2 = new BigDecimal(base);
		return bigDecimal.subtract(bigDecimal2).divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 除
	 * @param current
	 * @param base
	 * @return
	 */
	public static double divide(long current, long base) {
		if(base == 0) {
			base = 1;
		}
		BigDecimal bigDecimal = new BigDecimal(current);
		BigDecimal bigDecimal2 = new BigDecimal(base);
		return bigDecimal.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 除
	 * @param current
	 * @param base
	 * @return
	 */
	public static double divide(int current, int base) {
		if(base == 0) {
			base = 1;
		}
		BigDecimal bigDecimal = new BigDecimal(current);
		BigDecimal bigDecimal2 = new BigDecimal(base);
		return bigDecimal.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 除
	 * @param current
	 * @param base
	 * @return
	 */
	public static double divide(double current, double base) {
		if(base == 0) {
			base = 1;
		}
		BigDecimal bigDecimal = new BigDecimal(current);
		BigDecimal bigDecimal2 = new BigDecimal(base);
		return bigDecimal.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
}
