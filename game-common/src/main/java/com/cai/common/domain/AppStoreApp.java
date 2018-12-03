package com.cai.common.domain;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.cai.common.util.PerformanceTimer;


/**
 */
public class AppStoreApp {
	
	private static Logger logger = Logger.getLogger(AppStoreApp.class);
	

	private static String api_url = "";
	private static String appid = "";
	private static String appkey = "";
	
	
	//app store相关参数
	public static final String APP_RECEIPTS_URL = "https://buy.itunes.apple.com/verifyReceipt";
	public static final String APP_RECEIPTS_URL_SANDBOX = "https://sandbox.itunes.apple.com/verifyReceipt";
	
	
	
	
	/**
	 * 验证app store 票据
	 * @param receiptData
	 * @return
	 */
	public static JSONObject verifyAppStoreReceipts(String receiptData) throws Exception{
		
		
		JSONObject result = AppStoreApp.requestReceipts(APP_RECEIPTS_URL, receiptData);
		if(result.getIntValue("status") == 21007){
			result = AppStoreApp.requestReceipts(APP_RECEIPTS_URL_SANDBOX, receiptData);
		}
			
		return result;
	}

	
	/**
	 * 向苹果服务器请求数据  //TODO 求请方法要优化
	 * @param url
	 * @param receiptData
	 * @return
	 */
	private static JSONObject requestReceipts(String verifyURL,String receiptData) throws Exception{
		JSONObject result = null;
		 
	    URL url = new URL(verifyURL);
	    HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
	    connection.setReadTimeout(1000*60);
	    connection.setRequestMethod("POST");
	    connection.setDoOutput(true);
	    connection.setAllowUserInteraction(false);
	    Map map = new HashMap();
	    map.put("receipt-data", receiptData);
	    JSONObject jsonObject = new JSONObject(map);

	    PrintStream ps = new PrintStream(connection.getOutputStream());
	    ps.print(jsonObject.toString());
	    ps.close();

	    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    String str;
	    StringBuffer sb = new StringBuffer();
	    while ((str = br.readLine()) != null) {
	        sb.append(str);
	    }
	    br.close();
	    String response = sb.toString();
	    
	    result = new JSONObject().parseObject(response);
	    
		
		return result ;
	}
	
	

	
}
