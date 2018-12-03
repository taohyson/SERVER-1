package com.cai.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

/**
 * 时间工具类
 * 
 * @author run
 *
 */
public class MyDateUtil {

	public static final String Y_M_D_H_m_s = "yyyy-MM-dd HH:mm:ss";
	public static final String Y_M_D = "yyyy-MM-dd";
	public static final String H_m = "HH:mm";

	/**
	 * 相关分钟数
	 * 
	 * @param smdate
	 * @param bdate
	 * @return
	 * @throws ParseException
	 */
	public static int minuteBetween(Date smdate, Date bdate) throws ParseException {
		long between_days = (bdate.getTime() - smdate.getTime()) / (1000 * 60L);
		return (int) between_days;
	}

	/**
	 * 相关小时数
	 * 
	 * @param smdate
	 * @param bdate
	 * @return
	 * @throws ParseException
	 */
	public static int hourBetween(Date smdate, Date bdate) throws ParseException {
		long between_days = (bdate.getTime() - smdate.getTime()) / (1000 * 60 * 60L);
		return (int) between_days;
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
	 * @throws ParseException
	 */
	public static int daysBetween(Date smdate, Date bdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		smdate = sdf.parse(sdf.format(smdate));
		bdate = sdf.parse(sdf.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 零点的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getZeroDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();

	}

	/**
	 * 零点的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getOneDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();

	}

	/**
	 * 零点的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getTomorrowZeroDate(long time) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();

	}

	/**
	 * 零点的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getYesterdayZeroDate(long time) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.DATE, -1);
		return cal.getTime();

	}

	/**
	 * 明天的零点的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getTomorrowZeroDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}

	/// 当天最后一秒的时间
	public static Date getLastTimeDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.DATE, 0);
		return cal.getTime();
	}

	public static Date getNow() {
		return new Date();
	}

	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

	public static Date parse(String datestr) {
		try {
			return dateFormat.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
	}

	public static Date parse(String datestr, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		try {
			return dateFormat.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
	}

	/**
	 * 获取日期年份
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static int getYear(String date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateFormat.parse(date));
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 获取日期月份
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static int getMonth(String date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateFormat.parse(date));
		return (calendar.get(Calendar.MONTH) + 1);
	}

	/**
	 * 获取月份起始日期
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getMinMonthDate(String date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateFormat.parse(date));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}

	/**
	 * 获取月份最后日期
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getMaxMonthDate(String date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateFormat.parse(date));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}

	/**
	 * 获取20171010 0点时间
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getZeroDate(String date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateFormat.parse(date));
		return calendar.getTime();
	}

	/**
	 * 零点的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getHourDate(String hourStr, Date Date) {
		Calendar cal = Calendar.getInstance();
		String[] spit = hourStr.split(":");
		cal.setTime(Date);
		cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(spit[0]));
		cal.set(Calendar.MINUTE, Integer.parseInt(spit[1]));
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();

	}

	public static Date getHmsDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		Calendar nowCalendar = Calendar.getInstance();
		nowCalendar.set(Calendar.HOUR_OF_DAY, hour);
		nowCalendar.set(Calendar.MINUTE, min);
		nowCalendar.set(Calendar.SECOND, second);
		return nowCalendar.getTime();
	}

	public static Date changeDate(String dateMsg, String formatFlag, int day, int hour, int min, int second) {
		return changeDate(false, dateMsg, formatFlag, day, hour, min, second);
	}

	public static Date changeDate(boolean isRestTime, String dateMsg, String formatFlag, int day, int hour, int min, int second) {
		Date date = getDateFormat(dateMsg, formatFlag);
		return changeDate(isRestTime, date, day, hour, min, second);
	}

	/**
	 * 改变日期时间
	 * 
	 * @param isRestTime
	 *            是否重置时分秒
	 * @return
	 */
	public static Date changeDate(boolean isRestTime, Date date, int day, int hour, int min, int second) {
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		if (isRestTime) {
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.MILLISECOND, 0);
		}
		calendar.add(Calendar.DAY_OF_YEAR, day);
		calendar.add(Calendar.HOUR_OF_DAY, hour);
		calendar.add(Calendar.SECOND, min);
		calendar.add(Calendar.MINUTE, second);

		Date newDate = calendar.getTime();
		return newDate;
	}

	public static boolean isSameDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		Date tarDate = calendar.getTime();

		return isSameDay(date, tarDate);
	}
	
	public static boolean isSameDay(Date date,Date tarDate) {
		String dFormat = getDateFormat(date, Y_M_D);
		String cFormat = getDateFormat(tarDate, Y_M_D);
		
		if (cFormat.equals(dFormat)) {
			return true;
		}
		return false;
	}

	public static String getDateFormat(Date date, String formatFlag) {
		SimpleDateFormat format = new SimpleDateFormat(formatFlag);
		String result = format.format(date);
		return result;
	}

	public static Date getDateFormat(String dateMsg, String formatFlag) {
		SimpleDateFormat format = new SimpleDateFormat(formatFlag);
		Date date = null;
		try {
			date = format.parse(dateMsg);
		} catch (ParseException e) {
			e.printStackTrace();
			date = null;
		}
		return date;
	}

	public static boolean isGreater(Date date) {
		Calendar calendar = Calendar.getInstance();
		Date targetDate = calendar.getTime();

		return isGreater(date, targetDate);
	}

	public static boolean isGreater(Date date, Date targetDate) {
		long time = date.getTime();
		long targetTime = targetDate.getTime();

		if (time >= targetTime) {
			return true;
		}
		return false;
	}

	public static int getIntervalDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		Date targetDate = calendar.getTime();
		return getIntervalDay(date, targetDate);
	}

	public static int getIntervalDay(Date date, Date targetDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int day = calendar.get(Calendar.DAY_OF_YEAR);

		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(targetDate);
		int targetYear = startCalendar.get(Calendar.YEAR);
		int targetDay = startCalendar.get(Calendar.DAY_OF_YEAR);

		int result = -1;
		if (year < targetYear) {
			return result;
		}

		if (year > targetYear) {
			int leftYear = year - targetYear;
			for(int i=1;i<= leftYear;i++){
				int lastDay = getDayNumFromYear(year - 1);
				day += lastDay;
			}
		}

		result = day - targetDay;
		return result;
	}
	
	public static int getWeekIndex() {
		return getWeekIndex(new Date());
	}
	
	public static int getWeekIndex(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int index = calendar.get(Calendar.DAY_OF_WEEK);
		return index;
	}
	
	public static int getDayOfYear(){
		return getDayOfYear(new Date());
	}
	
	public static int getDayOfYear(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		return day;
	}
	
	private static int getDayNumFromYear(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		int dayNum = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		return dayNum;
	}

	public static Date getNowMonthFirstDay() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
		// 将小时至0
		c.set(Calendar.HOUR_OF_DAY, 0);
		// 将分钟至0
		c.set(Calendar.MINUTE, 0);
		// 将秒至0
		c.set(Calendar.SECOND, 0);
		// 将毫秒至0
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	// 某月第几天
	public static Date getNowMonthSomeDay(int days) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, days);// 设置为1号,当前日期既为本月第一天
		// 将小时至0
		c.set(Calendar.HOUR_OF_DAY, 0);
		// 将分钟至0
		c.set(Calendar.MINUTE, 0);
		// 将秒至0
		c.set(Calendar.SECOND, 0);
		// 将毫秒至0
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static void main(String[] args) throws ParseException {
		// System.out.println(getMaxMonthDate("201505"));

		System.out.println(getLastTimeDate(DateUtils.addDays(new Date(), -1)));
	}

}
