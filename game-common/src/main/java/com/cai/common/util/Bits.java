/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

/**
 * 位工具类
 *
 * @author wu_hc date: 2017年10月17日 下午8:08:15 <br/>
 */
public final class Bits {
	
	public static final byte byte_negative_3 = (byte) -3;
	public static final byte byte_negative_2 = (byte) -2;
	public static final byte byte_negative_1 = (byte) -1;

	public static final byte byte_0 = (byte) 0;
	public static final byte byte_1 = (byte) 1;
	public static final byte byte_2 = (byte) 2;
	public static final byte byte_3 = (byte) 3;
	public static final byte byte_4 = (byte) 4;
	public static final byte byte_5 = (byte) 5;
	public static final byte byte_6 = (byte) 6;
	public static final byte byte_7 = (byte) 7;
	public static final byte byte_8 = (byte) 8;
	public static final byte byte_9 = (byte) 9;
	public static final byte byte_10 = (byte) 10;
	public static final byte byte_11 = (byte) 11;
	public static final byte byte_12 = (byte) 12;
	public static final byte byte_13 = (byte) 13;
	public static final byte byte_14 = (byte) 14;
	public static final byte byte_15 = (byte) 15;
	public static final byte byte_16 = (byte) 16;
	public static final byte byte_17 = (byte) 17;

	public static final byte byte_18 = (byte) 18;
	public static final byte byte_19 = (byte) 19;
	public static final byte byte_20 = (byte) 20;
	public static final byte byte_21 = (byte) 21;
	public static final byte byte_22 = (byte) 22;
	public static final byte byte_23 = (byte) 23;
	public static final byte byte_24 = (byte) 24;
	public static final byte byte_25 = (byte) 25;
	public static final byte byte_26 = (byte) 26;

	/**
	 * 
	 * @param source
	 * @param pos
	 * @return
	 */
	public static byte getBitValue(byte source, int pos) {
		return (byte) ((source >> pos) & 1);
	}

	/**
	 * 
	 * @param source
	 * @param pos
	 * @param value
	 * @return
	 */
	public static int setBitValue(int source, int pos, byte value) {

		int mask = (int) (1 << pos);
		if (value > 0) {
			source |= mask;
		} else {
			source &= (~mask);
		}

		return source;
	}

	/**
	 * 
	 * @param source
	 * @param pos
	 * @return
	 */
	public static int reverseBitValue(int source, int pos) {
		int mask = (int) (1 << pos);
		return (int) (source ^ mask);
	}

	/**
	 * 
	 * @param source
	 * @param pos
	 * @return
	 */
	public static boolean checkBitValue(int source, int pos) {

		source = (int) (source >>> pos);

		return (source & 1) == 1;
	}

	/**
	 * 
	 * @param source
	 * @return
	 */
	public static Pair<Integer, Integer> getLH(int source) {
		int hig = (int) ((((int) source) & 0xffff0000) >> 16);
		int low = (int) (source & 0x00000ffff);
		return Pair.of(hig, low);
	}

	/**
	 * 入口函数做测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		i = setBitValue(i, 0, (byte) 1);
		i = setBitValue(i, 20, (byte) 1);
		i = setBitValue(i, 21, (byte) 1);
		i = setBitValue(i, 23, (byte) 1);
		i = setBitValue(i, 21, (byte) 0);
		for (int j = 0; j < 32; j++) {
			System.out.println("j:" + j + "\t" + checkBitValue(i, j));
		}
	}
}
