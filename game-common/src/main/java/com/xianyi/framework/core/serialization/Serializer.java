/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.serialization;

/**
 * 
 * 序列化接口
 *
 * @author wu_hc date: 2017年10月27日 下午5:02:09 <br/>
 */
public abstract class Serializer {

	/**
	 * 最大缓存大小
	 */
	public static final int MAX_CACHED_BUF_SIZE = 256 * 1024;

	/**
	 * 默认缓存大小
	 */
	public static final int DEFAULT_BUF_SIZE = 512;

	/**
	 * 编码类型
	 * 
	 * @return
	 */
	public abstract byte code();

	/**
	 * 写
	 * 
	 * @param obj
	 * @return
	 */
	public abstract <T> byte[] writeObject(T obj);

	/**
	 * 读
	 * 
	 * @param bytes
	 * @param offset
	 * @param length
	 * @param clazz
	 * @return
	 */
	public abstract <T> T readObject(byte[] bytes, int offset, int length, Class<T> clazz);

	public <T> T readObject(byte[] bytes, Class<T> clazz) {
		return readObject(bytes, 0, bytes.length, clazz);
	}
}
