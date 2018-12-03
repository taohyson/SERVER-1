package com.cai.common.constant;


import java.util.HashMap;
import java.util.Map;

public class GameConfig {
	public static Map<Integer,String> ruleToGameMap =  null;
	public static Map<String,String> hallToGameMap = null;
	static {
//		红中麻将             激活+01\n转转麻将             激活+02\n长沙麻将             激活+03\n上下鬼麻将           激活+04\n株洲麻将             激活+05\n
		ruleToGameMap =  new HashMap<Integer,String>();
		hallToGameMap =new HashMap<String,String>();
		ruleToGameMap.put(1, "80001_2");//激活对应的规则，红中麻将,    厅号，游戏号
		ruleToGameMap.put(2, "80001_0");//激活对应的规则，转转麻将,    厅号，游戏号
		ruleToGameMap.put(3, "80001_1");//激活对应的规则，长沙麻将,    厅号，游戏号
		ruleToGameMap.put(4, "80001_3");//激活对应的规则，上下鬼麻将,   厅号，游戏号
		ruleToGameMap.put(5, "80001_4");//激活对应的规则，株洲麻将,    厅号，游戏号
		ruleToGameMap.put(11, "80002_3003");//激活对应的规则，河南麻将,    厅号，游戏号
		ruleToGameMap.put(12, "80002_3001");//激活对应的规则，安阳麻将,    厅号，游戏号
		ruleToGameMap.put(13, "80002_3002");//激活对应的规则，林州麻将,    厅号，游戏号
		ruleToGameMap.put(14, "80002_3004");//激活对应的规则，红中麻将,    厅号，游戏号
		ruleToGameMap.put(15, "80002_3005");
		ruleToGameMap.put(16, "80002_3006");
		ruleToGameMap.put(17, "80002_3007");
		ruleToGameMap.put(21, "80003_5001");//激活对应的规则，闲逸福禄寿,    厅号，游戏号
		ruleToGameMap.put(22, "80003_5002");//激活对应的规则，闲逸二十张,    厅号，游戏号
		ruleToGameMap.put(23, "80003_5003");
		ruleToGameMap.put(24, "80003_5004");
		ruleToGameMap.put(25, "80003_5005");
		ruleToGameMap.put(31, "80005_2001");//激活对应的规则，仙桃晃晃
		ruleToGameMap.put(32, "80004_100");//
		ruleToGameMap.put(99, "80006_101");
		ruleToGameMap.put(100, "80007_100");
		//大厅
		ruleToGameMap.put(101, "80008_9001");
		ruleToGameMap.put(102, "80008_9002");
		ruleToGameMap.put(103, "80008_9003");
		ruleToGameMap.put(104, "80008_9004");
		ruleToGameMap.put(105, "80008_9005");
		ruleToGameMap.put(106, "80008_9006");
		ruleToGameMap.put(107, "80008_9007");
		
		//攸县跑胡子
		ruleToGameMap.put(110, "80008_8002");
		//攸县15张跑胡子
		ruleToGameMap.put(111, "80008_8003");
		//攸县红黑胡
		ruleToGameMap.put(112, "80008_8001");
		//湘潭跑胡子
		ruleToGameMap.put(113, "80008_8005");
		//常德跑胡子
		ruleToGameMap.put(114, "80008_8004");
		
		
		
		hallToGameMap.put("80001_2", "1046,2,8,湖南红中麻将");
		hallToGameMap.put("80001_0", "280,0,8,转转麻将");
		hallToGameMap.put("80001_1", "22,1,8,长沙麻将");
		hallToGameMap.put("80001_3", "18,3,8,上下鬼麻将");
		hallToGameMap.put("80001_4", "2072,4,8,株洲麻将");
		hallToGameMap.put("80002_3003", "4148,3003,8,河南麻将");
		hallToGameMap.put("80002_3001", "0,3001,8,安阳麻将");
		hallToGameMap.put("80002_3002", "0,3002,8,林州麻将");
		hallToGameMap.put("80002_3004", "5137,3004,8,河南红中麻将");
		hallToGameMap.put("80002_3005", "4565,3005,8,驻马店麻将");
		hallToGameMap.put("80002_3006", "37333,3006,8,开封麻将");
		hallToGameMap.put("80002_3007", "4565,3007,8,南阳麻将");
		hallToGameMap.put("80003_5001", "34,5001,8,闲逸福禄寿");
		hallToGameMap.put("80003_5002", "34,5002,8,闲逸二十张");
		hallToGameMap.put("80003_5003", "38,5003,8,临湘炒股麻将");
		hallToGameMap.put("80003_5004", "1114112,5004,8,长沙麻将(临)");
		hallToGameMap.put("80003_5005", "1046,5005,8,临湘红中麻将");
		hallToGameMap.put("80004_100", "6,100,16,闲逸碰胡");
		hallToGameMap.put("80005_2001", "50,2001,8,闲逸仙桃晃晃");
		hallToGameMap.put("80006_101", "1,101,16,闲逸偎麻雀");
		hallToGameMap.put("80007_100", "6,100,16,闲逸碰胡俱乐部测试");
		//牛牛
		hallToGameMap.put("80008_9001", "33040,9001,10,房主上庄");
		hallToGameMap.put("80008_9002", "33040,9002,10,牛牛上庄");
		hallToGameMap.put("80008_9003", "33040,9003,10,轮庄牛牛");
		hallToGameMap.put("80008_9004", "35088,9004,10,自由牛牛");
		hallToGameMap.put("80008_9005", "35088,9005,10,明三张抢庄牛牛");
		hallToGameMap.put("80008_9006", "35088,9006,10,看四张抢庄牛牛");
		hallToGameMap.put("80008_9007", "33040,9007,10,通比牛牛");
		//跑胡子
		hallToGameMap.put("80008_8001", "72,8001,8,攸县红黑胡");
		hallToGameMap.put("80008_8002", "78,8002,8,攸县跑胡子");
		hallToGameMap.put("80008_8003", "74,8003,8,攸县15张跑胡子");
		hallToGameMap.put("80008_8005", "34824,8005,10,湘潭跑胡子");
		hallToGameMap.put("80008_8004", "1984,8004,8,常德跑胡子");
		
	
	
	}
	
}
