/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.core.serialization;

import java.util.HashMap;
import java.util.Map;

import com.cai.common.constant.RedisConstant;
import com.cai.common.dictionary.DictHolder;
import com.cai.common.domain.Account;
import com.cai.common.domain.ActivityModel;
import com.cai.common.domain.LogicGameServerModel;
import com.google.common.collect.Maps;
import com.xianyi.framework.core.serialization.Serializer;
import com.xianyi.framework.core.serialization.imp.ProtoSerializer;

/**
 * 
 *
 * @author wu_hc date: 2017年10月27日 下午5:12:58 <br/>
 */
public final class SerializationTest2 {

	static {
		// System.setProperty("protostuff.runtime.always_use_sun_reflection_factory",
		// "true");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Serializer serializer = new ProtoSerializer();

		LogicGameServerModel model = new LogicGameServerModel();
		model.setInner_ip("2222222222");
		Map<Integer, LogicGameServerModel> maps = new HashMap<>();
		maps.put(23, model);
		model = new LogicGameServerModel();
		model.setInner_ip("33333333333333333333");
		maps.put(24, model);
		DictHolder holder = DictHolder.newHolder("", maps);
		byte[] bytes = serializer.writeObject(holder);
		Object o = serializer.readObject(bytes, DictHolder.class);
		System.out.println(o);
	}

}
