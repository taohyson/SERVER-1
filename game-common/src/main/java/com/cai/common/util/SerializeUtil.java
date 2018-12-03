package com.cai.common.util;

import com.xianyi.framework.core.serialization.Serializer;
import com.xianyi.framework.core.serialization.imp.JdkSerializer;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年10月27日 下午7:43:18 <br/>
 */
public class SerializeUtil {

	// public static final Serializer serializer = new JdkSerializer();
	public static final Serializer serializer = new JdkSerializer();

	/**
	 * 
	 * @param object
	 * @return
	 */
	public static byte[] serialize(Object object) {
		return serializer.writeObject(object);
	}

	public static <T> T unserialize(byte[] bytes, Class<T> clz) {
		return serializer.readObject(bytes, clz);
	}

	public static Object unserialize(byte[] bytes) {
		return serializer.readObject(bytes, Object.class);
	}

	private SerializeUtil() {
	}
}
