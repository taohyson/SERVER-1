
/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.List;
import java.util.Map;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import protobuf.clazz.extendCommon.ExtendsProto;

/**
 *
 *
 * @author wu_hc date: 2018年08月02日 下午3:00:19 <br/>
 */
public final class RoomMgr {

	/**
	 *  获取玩家的房间详情
	 * @param redisTemplate
	 * @param accountId
	 * @return
	 */
//	public static Map<Integer, ExtendsProto.RoomCategoryProto> getPlayerAllRoom(RedisTemplate<String, ?> redisTemplate,long accountId){
//
//		Map<byte[], byte[]> roomGroup = redisTemplate.execute((RedisCallback<Map<byte[], byte[]>>) connection -> connection.hGetAll(Longs.toByteArray(accountId)));
//		if(null != roomGroup && !roomGroup.isEmpty()){
//			Map<Integer,ExtendsProto.RoomCategoryProto> builderMap = Maps.newHashMap();
//			roomGroup.forEach((id,bytes)->{
//				try{
//					ExtendsProto.RoomCategoryProto proto = ExtendsProto.RoomCategoryProto.parseFrom(bytes);
//					builderMap.put(Ints.fromByteArray(id),proto);
//				}catch (Exception e){
//					e.printStackTrace();
//				}
//			});
//
//			return builderMap;
//		}
//		return null;
//	}
//
//	public static Map<Integer, ExtendsProto.RoomCategoryProto> getAppointRoom(RedisTemplate<String, ?> redisTemplate,long accountId,int ...roomIds){
//		byte[][] roomIdBytes = new byte[roomIds.length][];
//		for(int i=0 ;i< roomIdBytes.length ; i++){
//			roomIdBytes[i] = Ints.toByteArray(roomIds[i]);
//		}
//		List<byte[]> roomGroup = redisTemplate.execute((RedisCallback<List<byte[]>>) connection -> connection.hMGet(Longs.toByteArray(accountId),roomIdBytes));
//		if(null != roomGroup && !roomGroup.isEmpty()){
//			Map<Integer,ExtendsProto.RoomCategoryProto> builderMap = Maps.newHashMap();
//			for(int i=0;i<roomGroup.size() ;i++){
//				try{
//					ExtendsProto.RoomCategoryProto proto = ExtendsProto.RoomCategoryProto.parseFrom(roomGroup.get(i));
//					builderMap.put(roomIds[i],proto);
//
//				}catch (Exception e){
//					e.printStackTrace();
//				}
//			}
//			return builderMap;
//		}
//		return null;
//	}
//
//	/**
//	 *
//	 * @param redisTemplate
//	 * @param accountId
//	 * @param roomId
//	 * @param status
//	 */
//	public static void setRoomInfo(RedisTemplate<String, ?> redisTemplate,long accountId,int roomId,int status){
//		Map<Integer,ExtendsProto.RoomCategoryProto> builderMap = getAppointRoom(redisTemplate,accountId,roomId);
//		ExtendsProto.RoomCategoryProto proto = builderMap.get(roomId);
//		if(null != proto){
//			proto.toBuilder().setCategory(status);
//			redisTemplate.execute((RedisCallback<Object>) connection -> {
//				connection.hSet(Long.toString(accountId).getBytes(), Ints.toByteArray(roomId), proto.toBuilder().setCategory(status).build().toByteArray());
//				return null;
//			});
//		}
//	}
//
//	/**
//	 * 挑出最适合的房间Id
//	 * @param redisTemplate
//	 * @param accountId
//	 * @return
//	 */
//	public static int selectBetterRoomId(RedisTemplate<String, ?> redisTemplate,long accountId){
//		Map<Integer, ExtendsProto.RoomCategoryProto> rooms = getPlayerAllRoom(redisTemplate,accountId);
//		if(null == rooms && !rooms.isEmpty()){
//			return -1;
//		}
//
//		for (Map.Entry<Integer, ExtendsProto.RoomCategoryProto> entry : rooms.entrySet()) {
//			if(entry.getValue().getStatus() == 1){
//				return entry.getKey();
//			}
//		}
//
//		for (Map.Entry<Integer, ExtendsProto.RoomCategoryProto> entry : rooms.entrySet()) {
//			if(entry.getValue().getCategory() == 1){
//				return entry.getKey();
//			}
//		}
//
//		return -1;
//	}
	private RoomMgr(){}
}
