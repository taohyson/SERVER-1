/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;

/**
 * @author wu_hc date: 2017年8月15日 上午10:49:55 <br/>
 */
public final class StringUtil {

	private StringUtil() {
	}

	/**
	 * string->list<int>
	 *
	 * @param source
	 * @param symbol
	 * @return
	 */
	public static Set<Integer> toIntSet(String source, String symbol) {
		if (Strings.isNullOrEmpty(source) || Strings.isNullOrEmpty(symbol))
			return null;
		String[] result = source.split(symbol);
		Set<Integer> list = Sets.newHashSet();

		for (final String s : result) {
			list.add(Ints.tryParse(s.trim()));
		}
		return list;
	}

	/**
	 * string->list<int>
	 *
	 * @param source
	 * @param symbol
	 * @return
	 */
	public static Set<Long> toLongSet(String source, String symbol) {
		if (Strings.isNullOrEmpty(source) || Strings.isNullOrEmpty(symbol))
			return null;
		String[] result = source.split(symbol);
		Set<Long> list = Sets.newHashSet();

		for (final String s : result) {
			list.add(Longs.tryParse(s));
		}
		return list;
	}

	/**
	 * string->list<int>
	 *
	 * @param source
	 * @param symbol
	 * @return
	 */
	public static List<Integer> toIntList(String source, String symbol) {
		if (Strings.isNullOrEmpty(source) || Strings.isNullOrEmpty(symbol))
			return null;
		String[] result = source.split(symbol);
		List<Integer> list = Lists.newArrayListWithCapacity(result.length);

		for (final String s : result) {
			list.add(Ints.tryParse(s));
		}
		return list;
	}

	/**
	 * string->list<int>
	 *
	 * @param source
	 * @param symbol
	 * @return
	 */
	public static int[] toIntArray(String source, String symbol) {
		List<Integer> list = toIntList(source, symbol);
		if (null == list)
			return null;
		int[] ret = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ret[i] = list.get(i).intValue();
		}
		return ret;
	}

	public static <T> String coletToString(Collection<T> objects, String symbol) {
		StringBuilder sb = new StringBuilder(Math.min(objects.size(), 16));
		for (T o : objects) {
			sb.append(o).append(symbol);
		}
		if (sb.length() > 0) {
			return sb.deleteCharAt(sb.length() - 1).toString();
		}
		return null;
	}

	/**
	 * @param source
	 * @param symbol
	 * @return
	 */
	public static int[] toIntArrayByStream(String source, String symbol) {
		return Arrays.stream(source.split(symbol)).mapToInt(s -> Integer.parseInt(s)).toArray();
	}

	// public <T extends Number> List<T> toList(String source, String symbol) {
	// if (Strings.isNullOrEmpty(symbol) || Strings.isNullOrEmpty(symbol))
	// return null;
	// String[] result = source.split(symbol);
	// return null;
	// }
	public static final String chinese = "[\u4e00-\u9fa5]";

	public static int getLength(String value) {
		int valueLength = 0;
		for (int i = 0; i < value.length(); i++) {
			String temp = value.substring(i, i + 1);
			if (temp.matches(chinese)) {
				valueLength += 1;
			} else {
				valueLength += 1;
			}
		}
		return valueLength;
	}

	public static boolean isChinese(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			char c = ch[i];

			if (!isChinese(c)) {
				return false;
			}

		}
		return true;
	}

	public static boolean isChinese(char c) {

		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);

		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS

				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS

				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A

				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION

				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION

				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {

			return true;

		}

		return false;

	}

	public static boolean isValidEmail(String email) {
		String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		return Pattern.matches(EMAIL_REGEX, email.trim());
	}

}
