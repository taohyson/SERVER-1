package com.cai.common.util;

import java.util.EnumSet;
import java.util.HashSet;

import com.cai.common.define.EGoldOperateType;
import com.cai.common.define.EWealthCategory;

import protobuf.clazz.s2s.S2SProto.RoomWealthProto;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月10日 上午11:42:51 <br/>
 */
public final class WealthUtil {

	public static final EnumSet<EGoldOperateType> roomGoldType = EnumSet.noneOf(EGoldOperateType.class);
	
	
	public static final HashSet<Integer> roomGoldTypeInteger = new HashSet<>();

	static {
		roomGoldType.add(EGoldOperateType.OPEN_ROOM);
		roomGoldType.add(EGoldOperateType.FAILED_ROOM);
		
		
		
		
		for(EGoldOperateType type:roomGoldType) {
			roomGoldTypeInteger.add(type.getId());
		}
		
	}

	/**
	 * 
	 * @param accountId
	 * @param category
	 * @param chageType
	 * @param value
	 * @return
	 */
	public static RoomWealthProto.Builder newWealthBuilder(long accountId, EWealthCategory category, int chageType, long value) {
		return RoomWealthProto.newBuilder().setAccountId(accountId).setCategory(category.category()).setChangeType(chageType).setValue(value);
	}

	private WealthUtil() {
	}
}
