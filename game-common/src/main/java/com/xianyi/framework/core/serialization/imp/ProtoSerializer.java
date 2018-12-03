/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.serialization.imp;

import com.xianyi.framework.core.serialization.Serializer;

/**
 * 
 * protobuf序列化
 *
 * @author wu_hc date: 2017年10月27日 下午5:04:13 <br/>
 */
public class ProtoSerializer extends Serializer {

//	private static final ConcurrentMap<Class<?>, Schema<?>> schemaCache = Maps.newConcurrentMap();
//
//	private static final ThreadLocal<LinkedBuffer> bufThreadLocal = new ThreadLocal<LinkedBuffer>() {
//
//		@Override
//		protected LinkedBuffer initialValue() {
//			return LinkedBuffer.allocate(DEFAULT_BUF_SIZE);
//		}
//	};
//
//	@Override
//	public byte code() {
//		return SerializerType.PROTO.value();
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public <T> byte[] writeObject(T obj) {
//		Schema<T> schema = getSchema((Class<T>) obj.getClass());
//
//		LinkedBuffer buf = bufThreadLocal.get();
//		try {
//			return ProtostuffIOUtil.toByteArray(obj, schema, buf);
//		} finally {
//			buf.clear(); // 复用
//		}
//	}
//
//	@Override
//	public <T> T readObject(byte[] bytes, int offset, int length, Class<T> clazz) {
//
//		try {
//			T msg = clazz.newInstance();
//			Schema<T> schema = getSchema(clazz);
//			ProtostuffIOUtil.mergeFrom(bytes, offset, length, msg, schema);
//			return msg;
//		} catch (InstantiationException | IllegalAccessException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@SuppressWarnings("unchecked")
//	private <T> Schema<T> getSchema(Class<T> clazz) {
//		Schema<T> schema = (Schema<T>) schemaCache.get(clazz);
//		if (schema == null) {
//			Schema<T> newSchema = RuntimeSchema.createFrom(clazz);
//			schema = (Schema<T>) schemaCache.putIfAbsent(clazz, newSchema);
//			if (schema == null) {
//				schema = newSchema;
//			}
//		}
//		return schema;
//	}
//
//	@Override
//	public String toString() {
//		return "proto:(code=" + code() + ")";
//	}

	/* (non-Javadoc)
	 * @see com.xianyi.framework.core.serialization.Serializer#code()
	 */
	@Override
	public byte code() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.xianyi.framework.core.serialization.Serializer#writeObject(java.lang.Object)
	 */
	@Override
	public <T> byte[] writeObject(T obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.xianyi.framework.core.serialization.Serializer#readObject(byte[], int, int, java.lang.Class)
	 */
	@Override
	public <T> T readObject(byte[] bytes, int offset, int length, Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}
}
