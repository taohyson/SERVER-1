package com.cai.common.util;

public final class PairTest {

	public static void main(String[] args) {
		Pair<Integer, String> xx1 = Pair.of(1232323, "654w4324r12");
		Pair<Integer, String> xx2 = Pair.of(1232323, "654w4324r12");
		System.out.println(xx1.equals(xx2));
	}
}
