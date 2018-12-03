package com.cai.common.util;

import java.util.UUID;

public class UUIDUtils {

	public static String getUUID32() {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		return uuid;
	}

}
