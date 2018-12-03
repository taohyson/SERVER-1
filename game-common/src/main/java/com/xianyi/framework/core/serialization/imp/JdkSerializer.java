/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.serialization.imp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xianyi.framework.core.serialization.Serializer;
import com.xianyi.framework.core.serialization.SerializerType;

/**
 * 
 * jdk原生序列化
 *
 * @author wu_hc date: 2017年10月27日 下午5:04:13 <br/>
 */
public class JdkSerializer extends Serializer {

	@Override
	public byte code() {
		return SerializerType.JAVA.value();
	}

	@Override
	public <T> byte[] writeObject(T obj) {
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			// 序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			try {
				oos.close();
				baos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public <T> T readObject(byte[] bytes, int offset, int length, Class<T> clazz) {

		ByteArrayInputStream bais = null;
		ObjectInputStream ois = null;
		try {
			// 反序列化
			bais = new ByteArrayInputStream(bytes, offset, length);
			ois = new ObjectInputStream(bais);
			return clazz.cast(ois.readObject());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			try {
				ois.close();
				bais.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return "jdk:(code=" + code() + ")";
	}
}
