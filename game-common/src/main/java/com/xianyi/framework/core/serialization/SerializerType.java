/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */

package com.xianyi.framework.core.serialization;

/**
 * 
 * 序列化类型
 *
 * @author wu_hc date: 2017年10月27日 下午5:03:15 <br/>
 */
public enum SerializerType {
	JAVA((byte) 0x01), PROTO((byte) 0x02),
	// ...
	;

	SerializerType(byte value) {
		if (0x00 < value && value < 0x10) {
			this.value = value;
		} else {
			throw new IllegalArgumentException("out of range(0x01 ~ 0x0f): " + value);
		}
	}

	private final byte value;

	public byte value() {
		return value;
	}

	public static SerializerType parse(String name) {
		for (SerializerType s : values()) {
			if (s.name().equalsIgnoreCase(name)) {
				return s;
			}
		}
		return null;
	}

	public static SerializerType parse(byte value) {
		for (SerializerType s : values()) {
			if (s.value() == value) {
				return s;
			}
		}
		return null;
	}

	public static SerializerType getDefault() {
		return PROTO;
	}
}
