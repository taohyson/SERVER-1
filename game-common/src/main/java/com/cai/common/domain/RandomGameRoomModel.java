package com.cai.common.domain;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.util.MyDateUtil;

/**
 * 用于分配房间号的
 * 
 * @author run
 *
 */
public class RandomGameRoomModel {

	private static Logger logger = LoggerFactory.getLogger(RandomGameRoomModel.class);

	private final Lock normalLock = new ReentrantLock();
	private final Lock moneyLock = new ReentrantLock();

	private int game_id;

	/**
	 * 普通房间id列表
	 */
	private final int[] narmalRoomIdList;

	/**
	 * 金币场房间id列表
	 */
	private final int[] moneyRoomIdList;

	/**
	 * 当前下标
	 */
	private int curMoneyIndex;

	/**
	 * 当前下标
	 */
	private int curIndex;

	public RandomGameRoomModel(int game_id, int[] roomIdList, int[] roomIdMoenyList) {
		this.game_id = game_id;
		this.narmalRoomIdList = roomIdList;
		this.moneyRoomIdList = roomIdMoenyList;
	}

	public int randomRoomId() {
		normalLock.lock();
		try {
			if (curIndex >= narmalRoomIdList.length) {
				curIndex = 0;
				logger.error("普通房间Id轮回已经用完:" + MyDateUtil.getNow());
			}

			final int room_id = narmalRoomIdList[curIndex];
			curIndex++;
			return room_id;

		} catch (Exception e) {
			logger.error("error", e);
		} finally {
			normalLock.unlock();
		}

		return -1;
	}

	/**
	 * 金币场
	 * 
	 * @return
	 */
	public int moneyRandomRoomId() {
		moneyLock.lock();
		try {
			if (curMoneyIndex >= moneyRoomIdList.length) {
				curMoneyIndex = 0;
				logger.error("金币/比赛房间Id轮回已经用完:" + MyDateUtil.getNow());
			}

			final int room_id = moneyRoomIdList[curMoneyIndex];
			curMoneyIndex++;
			return room_id;
		} catch (Exception e) {
			logger.error("error", e);
		} finally {
			moneyLock.unlock();
		}

		return -1;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

}
