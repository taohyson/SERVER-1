package com.cai.common.util;

public class FvMask {
	public static int mask(long flag){
		return (0X01 << (flag));
	}
	
	
	public static int make_word(int a,int b){
		return (a&0xff)|((b&0xff)<<8);
	}
	
	public static int make_long(int a,int b){
		return (a&0xffff)|((b&0xffff)<<16);
	}
	
	public static boolean has_any(int flag, int mask)
	{
		return ((flag&mask) != 0);
	}
}
