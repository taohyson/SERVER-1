package com.cai.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class IDGeneratorOrder {

	private static final IDGeneratorOrder generator = new IDGeneratorOrder();

	public static IDGeneratorOrder getInstance() {
		return generator;
	}

	private static final Logger logger = Logger.getLogger(IDGeneratorOrder.class);

	private SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmss");

	private static final String GC_INDEX = "gc";

	private static final String GAMEPAY_INDEX = "mg";

	private static final String OSS_INDEX = "os";

	private static final String RP_INDEX = "rp";
	
	
	public static final String DIAMOND_INDEX = "diamond";

	private static final String PC_INDEX = "pc";

	private String lastDateStr;

	private int index;

	/**
	 * 此方法用于后台售卡 生成订单号
	 * 
	 * @return
	 */
	public synchronized String getUniqueID() {
		try {

			Date date = new Date();
			String newDateStr = df.format(date);
			if (newDateStr.equals(lastDateStr)) {
				index++;
				if (index > 9999) {
					Thread.sleep(1000L);
					newDateStr = df.format(date);
					lastDateStr = newDateStr;
					index = 1;
				}

			} else {
				index = 1;
				lastDateStr = newDateStr;
			}
			// 日期 + index + 3位随机
			StringBuffer buf = new StringBuffer(22);
			buf.append(OSS_INDEX).append(newDateStr).append(String.format("%04d", index)).append(RandomUtil.generateRandomNumber(100, 999));
			return buf.toString();
		} catch (Exception e) {
			logger.error(e);
		}
		return Math.abs(RandomUtil.getRandomNumber(Integer.MAX_VALUE)) + "";
	}

	/**
	 * 此方法用于游戏(充值中心回调)充值生成订单号
	 * 
	 * @return
	 */
	public synchronized String getWPayUniqueID() {
		try {
			Date date = new Date();
			String newDateStr = df.format(date);
			if (newDateStr.equals(lastDateStr)) {
				index++;
				if (index > 9999) {
					Thread.sleep(1000L);
					newDateStr = df.format(date);
					lastDateStr = newDateStr;
					index = 1;
				}

			} else {
				index = 1;
				lastDateStr = newDateStr;
			}
			// GPAY_INDEX + 日期 + index + 3位随机
			StringBuffer buf = new StringBuffer(22);
			buf.append(GC_INDEX).append(newDateStr).append(String.format("%04d", index)).append(RandomUtil.generateRandomNumber(1000, 9999));
			return buf.toString();
		} catch (Exception e) {
			logger.error(e);
		}
		return Math.abs(RandomUtil.getRandomNumber(Integer.MAX_VALUE)) + "";
	}

	/**
	 * 此方法用于游戏内充值生成订单号
	 * 
	 * @return
	 */
	public synchronized String getGamePayUniqueID() {
		try {
			Date date = new Date();
			String newDateStr = df.format(date);
			if (newDateStr.equals(lastDateStr)) {
				index++;
				if (index > 9999) {
					Thread.sleep(1000L);
					newDateStr = df.format(date);
					lastDateStr = newDateStr;
					index = 1;
				}

			} else {
				index = 1;
				lastDateStr = newDateStr;
			}
			// GPAY_INDEX + 日期 + index + 3位随机
			StringBuffer buf = new StringBuffer(22);
			buf.append(GAMEPAY_INDEX).append(newDateStr).append(String.format("%04d", index)).append(RandomUtil.generateRandomNumber(1000, 9999));
			return buf.toString();
		} catch (Exception e) {
			logger.error(e);
		}
		return Math.abs(RandomUtil.getRandomNumber(Integer.MAX_VALUE)) + "";
	}
	
	
	
	/**
	 * 此方法用于游戏内充值生成订单号
	 * 
	 * @return
	 */
	public synchronized String getDiamondUniqueID() {
		try {
			Date date = new Date();
			String newDateStr = df.format(date);
			if (newDateStr.equals(lastDateStr)) {
				index++;
				if (index > 9999) {
					Thread.sleep(1000L);
					newDateStr = df.format(date);
					lastDateStr = newDateStr;
					index = 1;
				}

			} else {
				index = 1;
				lastDateStr = newDateStr;
			}
			// GPAY_INDEX + 日期 + index + 3位随机
			StringBuffer buf = new StringBuffer(22);
			buf.append(DIAMOND_INDEX).append(newDateStr).append(String.format("%04d", index)).append(RandomUtil.generateRandomNumber(1000, 9999));
			return buf.toString();
		} catch (Exception e) {
			logger.error(e);
		}
		return Math.abs(RandomUtil.getRandomNumber(Integer.MAX_VALUE)) + "";
	}


	/**
	 * 此方法用于使用红包 生成订单号
	 * 
	 * @return
	 */
	public synchronized String getUseRedPacketUniqueID() {
		try {

			Date date = new Date();
			String newDateStr = df.format(date);
			if (newDateStr.equals(lastDateStr)) {
				index++;
				if (index > 9999) {
					Thread.sleep(1000L);
					newDateStr = df.format(date);
					lastDateStr = newDateStr;
					index = 1;
				}

			} else {
				index = 1;
				lastDateStr = newDateStr;
			}
			// 日期 + index + 3位随机
			StringBuffer buf = new StringBuffer(22);
			buf.append(RP_INDEX).append(newDateStr).append(String.format("%04d", index)).append(RandomUtil.generateRandomNumber(1000, 9999));
			return buf.toString();
		} catch (Exception e) {
			logger.error(e);
		}
		return Math.abs(RandomUtil.getRandomNumber(Integer.MAX_VALUE)) + "";
	}

	/**
	 * 此方法用于使用话费卡生成订单号
	 *
	 * @return
	 */
	public synchronized String getUsePhoneCardUniqueID() {
		try {
			Date date = new Date();
			String newDateStr = df.format(date);
			if (newDateStr.equals(lastDateStr)) {
				index++;
				if (index > 9999) {
					Thread.sleep(1000L);
					newDateStr = df.format(date);
					lastDateStr = newDateStr;
					index = 1;
				}
			} else {
				index = 1;
				lastDateStr = newDateStr;
			}
			// 日期 + index + 3位随机
			StringBuffer buf = new StringBuffer(22);
			buf.append(PC_INDEX).append(newDateStr).append(String.format("%04d", index)).append(RandomUtil.generateRandomNumber(1000, 9999));
			return buf.toString();
		} catch (Exception e) {
			logger.error(e);
		}
		return Math.abs(RandomUtil.getRandomNumber(Integer.MAX_VALUE)) + "";
	}
}
