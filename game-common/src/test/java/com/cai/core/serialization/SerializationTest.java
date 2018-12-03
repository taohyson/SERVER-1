/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.core.serialization;

import java.util.Map;

import com.cai.common.domain.Account;
import com.cai.common.domain.RoomRedisModel;
import com.cai.common.util.SerializeUtil;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.xianyi.framework.core.serialization.Serializer;
import com.xianyi.framework.core.serialization.imp.ProtoSerializer;

import javolution.util.FastMap;

/**
 * 
 *
 * @author wu_hc date: 2017年10月27日 下午5:12:58 <br/>
 */
public final class SerializationTest {

	static {
		System.setProperty("protostuff.runtime.always_use_sun_reflection_factory", "true");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RoomRedisModel redisModel = new RoomRedisModel();
		redisModel.setBase_score(1);
		redisModel.setClub_id(34434);
		redisModel.setClubName("xxxxxxxxxxx23");
		redisModel.setCreate_account_id(243652352352L);
		redisModel.setCreate_time(3462222222222L);
		redisModel.setCur_player_num(5);
		redisModel.setGame_id(523234);
		redisModel.setGame_round(634);
		redisModel.setGame_rule_index(652332123);
		redisModel.setGame_type_index(63232332);
		redisModel.setGameName("6y23gasdqyhqeardvgaz");
		redisModel.setGameRuleDes("2222222222222222222222222222222cccccccccccad");
		redisModel.setGroupID("62342342");
		redisModel.setIpSet(Sets.newHashSet("whc", "xxx"));
		redisModel.setPlayersIdSet(Sets.newHashSet(23L, 566L, 623L));
		Map<Integer, String> map = new FastMap<>();
		map.put(434, "xiao");
		map.put(435, "xxxx");
//		redisModel.setMap(map);
		int loop = 1;
		Serializer serializer = new ProtoSerializer();
		serializer.writeObject(redisModel);

		long cur = 0L;
		long size = 0L;
		cur = System.currentTimeMillis();

		for (int i = 0; i < loop; i++) {
			byte[] bytes = serializer.writeObject(redisModel);
			size = bytes.length;
			RoomRedisModel model = serializer.readObject(bytes, RoomRedisModel.class);
			int x = 3;
		}
		System.out.println("time:" + (System.currentTimeMillis() - cur) + " size:" + size);

		cur = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			byte[] bytes = SerializeUtil.serialize(redisModel);
			size = bytes.length;
			RoomRedisModel model = SerializeUtil.unserialize(bytes, RoomRedisModel.class);
			int x = 3;
		}
		System.out.println("time:" + (System.currentTimeMillis() - cur) + " size:" + size);

		Account account = new Account();
		account.setCacheCreateTime(23452342L);
		account.setAccountRecommendModelMap(Maps.newHashMap());
		byte[] bytes = serializer.writeObject(account);
		serializer.readObject(bytes, Account.class);
	}

}
