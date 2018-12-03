package com.cai.common.util;
/**
 * 
 * @author WalkerGeek
 *
 */
public class TrackUtils {
	
	
	/**
	 * 打印当前线程的调用堆栈
	 * 
	 */
	public static String printTrack(){
		StackTraceElement[] st = Thread.currentThread().getStackTrace();
		if(st==null){
			return "";
		}
		StringBuffer sbf =new StringBuffer();
		sbf.append("\r\n");
		sbf.append("----------------------------------  调用堆栈开始----------------------------------");
		for(StackTraceElement e:st){
			if(sbf.length()>0){
				sbf.append(" <- ");
				sbf.append(System.getProperty("line.separator"));
			}
			sbf.append(java.text.MessageFormat.format("{0}.{1}() {2}"
					,e.getClassName()
					,e.getMethodName()
					,e.getLineNumber()));
		}
		sbf.append("\r\n");
		sbf.append("---------------------------------- 调用堆栈结束----------------------------------");
		return sbf.toString();
	}
}
