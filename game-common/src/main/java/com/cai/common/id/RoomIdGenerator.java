/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.id;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.define.IDType;

/**
 * 
 * 房间id
 * 
 * @author wu_hc date: 2018年5月15日 下午9:25:06 <br/>
 */
public final class RoomIdGenerator implements IDGenerator {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory.getLogger(RoomIdGenerator.class);

	/**
	 * 
	 */
	private final int[] idGroup;



	/**
	 * 
	 */
	private final IDType type;

	/**
	 * 游标
	 */
	private int cursor = 0;


	/**
	 * @param idList
	 */
	public RoomIdGenerator(int[] idGroup, IDType type) {
		this.idGroup = idGroup;
		this.type = type;
	}

	@Override
	public long nextId() {
		synchronized (this) {
			try {
				if (cursor >= idGroup.length) {
					cursor = 0;
					logger.warn("ID生成器[ {} ] 在[ {} ]完成一次轮回！", type, new Date());
				}

				final int id = idGroup[cursor];
				cursor++;
				return id;

			} catch (Exception e) {
				logger.error("error", e);
			}
		}
		return -1;
	}
	
	
	public int getCursor() {
		return cursor;
	}
	
	//仅系统初始化的时候调用
	public void setCursor(int cursor ) {
		synchronized(this) {
			this.cursor= cursor;
		}
	}
	
	public int[] getIdGroup() {
		return idGroup;
	}
	
	
	public IDType getType() {
		return type;
	}



}
