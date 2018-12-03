package com.cai.common.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import protobuf.clazz.ClubMsgProto;

public class Test {

	// public static void main(String[] args) {
	// System.out.println("========");
	//
	// RedisResponse.Builder redisResponseBuilder = RedisResponse.newBuilder();
	// redisResponseBuilder.setRsResponseType(RsResponseType.ACCOUNT_UP);
	//
	// RsAccountResponse.Builder rsAccountResponseBuilder =
	// RsAccountResponse.newBuilder();
	// rsAccountResponseBuilder.setAccountId(222L);
	// rsAccountResponseBuilder.setGameId(10);
	//
	// redisResponseBuilder.setRsAccountResponse(rsAccountResponseBuilder.build());
	//
	// System.out.println(redisResponseBuilder.build());
	// byte[] bytes = redisResponseBuilder.build().toByteArray();
	//
	// System.out.println("bytes length=" + bytes.length);
	//
	// System.out.println("==========解码============");
	//
	//
	// PerformanceTimer timer = new PerformanceTimer();
	// int k = 0;
	// try {
	// for(int i=0;i<100000;i++){
	// RedisResponse redisResponse = ProtoRedis.RedisResponse.parseFrom(bytes);
	// //System.out.println(redisResponse.getRsAccountResponse().getAccountId());
	// k++;
	// }
	// System.out.println(timer.getStr());
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	//
	//
	//
	//
	//
	//
	//
	// }
	public static void main(String[] args) {

		Map<Integer, Integer> m = Maps.newHashMap();
		m.put(1, 1);
		m.put(2, 2);
		m.put(3, 3);

		Set<Integer> set = Sets.newHashSet(2);

		Iterator<Map.Entry<Integer, Integer>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> entry = it.next();
			if (set.contains(entry.getKey())) {
				it.remove();
			}
		}

		System.out.println(m);

		ClubMsgProto.ClubAccountProto.Builder builder = ClubMsgProto.ClubAccountProto.newBuilder();
		builder.setNickname("");
		System.out.println(builder.build());

		Consumer<Object> consumer = (o) -> o.toString();
	}

}
