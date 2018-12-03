/**
 * 
 */
package com.cai.common.util;

/**
 * @author xwy
 *
 */
public class ThreadUtil {
	/**
	 * 获取当前线程的堆栈信息
	 * 
	 * @return
	 */
	public static String getStack() {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		StringBuffer buf = new StringBuffer();
		for (StackTraceElement item : stackTrace) {
			buf.append(item.getClassName()).append(".");
			buf.append(item.getMethodName()).append("()#");
			buf.append(item.getLineNumber()).append("\n");
		}
		return buf.toString();
	}
	
	/**
	 * 获取当前线程的堆栈信息
	 * 
	 * @return
	 */
	public static String getStack(Exception e) {
		StringBuffer stringBuffer = new StringBuffer(e.toString() + "\n");
		StackTraceElement[] messages = e.getStackTrace();
		int length = messages.length;
		for (int i = 0; i < length; i++) {
			stringBuffer.append("\t" + messages[i].toString() + "\n");
		}
		return stringBuffer.toString();
	}
	
	
	public static void main(String[] args) {
		try {
			Integer a = new Integer(12);
			int b = a/0;
			 
		}catch(Exception e) {
			System.out.println(getStack(e));
			System.out.println(getStack());
		}
	}
}
