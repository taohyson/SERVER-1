/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * 数组交换索引工具
 *
 * @author wu_hc date: 2018/8/29 15:37 <br/>
 */
public final class ArrayUtil {

	/**
	 * int[],一维数组
	 *
	 * @param newIdxs 新索引顺序
	 * @param target  目标数组
	 */
	public static final void swapInt1(List<Integer> newIdxs, int[]... target) {
		for (int j = 0; j < target.length; j++) {
			int[] array = target[j];
			int[] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * int[][],二维数组
	 *
	 * @param newIdxs 新索引顺序
	 * @param target  目标数组
	 */
	public static final void swapInt2(List<Integer> newIdxs, int[][]... target) {
		for (int j = 0; j < target.length; j++) {
			int[][] array = target[j];
			int[][] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * long[],一维数组
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 */
	public static final void swapLong1(List<Integer> newIdxs, long[]... target) {
		for (int j = 0; j < target.length; j++) {
			long[] array = target[j];
			long[] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * long[][],二维数组
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 */
	public static final void swapLong2(List<Integer> newIdxs, long[][]... target) {
		for (int j = 0; j < target.length; j++) {
			long[][] array = target[j];
			long[][] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * byte[],一维数组
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 */
	public static final void swapByte1(List<Integer> newIdxs, byte[]... target) {
		for (int j = 0; j < target.length; j++) {
			byte[] array = target[j];
			byte[] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * byte[][],二维数组
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 */
	public static final void swapByte2(List<Integer> newIdxs, byte[][]... target) {
		for (int j = 0; j < target.length; j++) {
			byte[][] array = target[j];
			byte[][] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * float[],一维数组
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 */
	public static final void swapFloat1(List<Integer> newIdxs, float[]... target) {
		for (int j = 0; j < target.length; j++) {
			float[] array = target[j];
			float[] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * float[][],二维数组
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 */
	public static final void swapFloat2(List<Integer> newIdxs, float[][]... target) {
		for (int j = 0; j < target.length; j++) {
			float[][] array = target[j];
			float[][] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * object[]
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 * @param <T>     操作对象类型
	 */
	public static final <T> void swapObjectArray1(List<Integer> newIdxs, T[]... target) {
		for (int j = 0; j < target.length; j++) {
			T[] array = target[j];
			T[] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	/**
	 * object[][]
	 *
	 * @param newIdxs 索引顺序
	 * @param target  目标数组
	 * @param <T>     操作对象类型
	 */
	public static final <T> void swapObjectArray2(List<Integer> newIdxs, T[][]... target) {
		for (int j = 0; j < target.length; j++) {
			T[][] array = target[j];
			T[][] copy = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newIdxs.size(); i++) {
				int oldIdx = i, newIdx = newIdxs.get(i);
				array[oldIdx] = copy[newIdx];
			}
		}
	}

	private ArrayUtil() {
	}

	public static void main(String[] args) {
		int[] xx = new int[] { 1, 2, 3, 4, 5, 6 }, yy = new int[] { 6, 5, 4, 3, 2, 1 };
		ArrayUtil.swapInt1(Lists.newArrayList(3, 5, 1, 0, 2, 4), xx, yy);
		System.out.println(Arrays.toString(xx));
		System.out.println(Arrays.toString(yy));
	}
}
