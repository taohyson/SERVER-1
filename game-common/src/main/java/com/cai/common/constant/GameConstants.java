package com.cai.common.constant;

public class GameConstants {

	// 红中麻将比赛场胡牌类型
	public static final int ZI_MO = 1; // 自摸
	public static final int QIANG_GANG_HU = 2; // 抢杠胡
	public static final int QIANG_GANG_HU_ALL = 3; // 抢杠胡全包
	public static final int JIE_PAO = 4; // 接炮
	public static final int FAN_PAO = 5; // 放炮

	// Weaveitem公开表示
	public static final int PUBLIC_CARD_OPEN = 1;// 公开
	public static final int PUCLIC_CARD_CLOSE = 2; // 不公开

	// 参数定义
	public static final int INVALID_VALUE = 0; // 无效椅子
	public static final int INVALID_SEAT = -1; // 无效椅子
	public static final int LEAVE_SEAT = -2; // 离开椅子
	public static final int BLACK_CARD = -2; // 牌背
	public static final int INVALID_CARD = -3; // 无效牌值
	public static final int RANG_CARD = -4; // 让牌牌值
	// 参数索引,正式收费的时候一定要检查
	public static final int SYS_GAME_TYPE_ZZ = 1201;
	public static final int SYS_GAME_TYPE_CS = 1202;
	public static final int SYS_GAME_TYPE_HZ = 1203;
	public static final int SYS_GAME_TYPE_SHUANGGUI = 1204;// 双鬼麻将
	public static final int SYS_GAME_TYPE_ZHUZHOU = 1205;// 株洲
	public static final int SYS_GAME_TYPE_XTHH = 1206;// 仙桃晃晃麻将

	public static final int SYS_GAME_TYPE_HENAN_AY = 1207;// 河南安阳
	public static final int SYS_GAME_TYPE_HENAN_LZ = 1208;// 河南安阳 -林州
	public static final int SYS_GAME_TYPE_HENAN = 1209;// 河南麻将
	public static final int SYS_GAME_TYPE_FLS_LX = 1210;// 临湘福禄寿
	public static final int SYS_GAME_TYPE_HENAN_HZ = 1211;// 河南红中麻将
	public static final int SYS_GAME_TYPE_YX_HH = 1212;// 攸县红黑胡
	public static final int SYS_GAME_TYPE_FLS_LX_TWENTY = 1213;// 福禄寿20张
	public static final int SYS_GAME_TYPE_YX_PHZ = 1214;// 攸县跑胡子

	public static final int SYS_GAME_TYPE_SEVER_OX = 1215;// 房主牛牛
	public static final int SYS_GAME_TYPE_SZOX = 1216;// 牛牛上庄
	public static final int SYS_GAME_TYPE_LZOX = 1217;// 轮流牛牛
	public static final int SYS_GAME_TYPE_ZYQOX = 1218;// 自由牛牛
	public static final int SYS_GAME_TYPE_MSZOX = 1219;// 明三张抢庄牛牛
	public static final int SYS_GAME_TYPE_MFZOX = 1220;// 看四张抢庄牛牛
	public static final int SYS_GAME_TYPE_TBOX = 1221;// 通比牛牛
	public static final int SYS_GAME_TYPE_FLS_LX_CG = 1222;// 临湘炒股
	public static final int SYS_GAME_TYPE_YX_FPHZ = 1223;// 攸县跑胡子
	public static final int SYS_GAME_TYPE_LX_CS = 1224;// 长沙麻将(临)
	public static final int SYS_GAME_TYPE_HJK = 1225;// 黑杰克
	public static final int SYS_GAME_TYPE_PHZ_CHD = 1226;// 常德跑胡子

	public static final int SYS_GAME_TYPE_HENAN_ZMD = 1227;// 河南麻将-驻马店
	public static final int SYS_GAME_TYPE_HENAN_KF = 1228;// 河南麻将-开封
	public static final int SYS_GAME_TYPE_HENAN_NY = 1229;// 河南麻将-南阳
	public static final int SYS_GAME_TYPE_HENAN_XC = 1230;// 河南麻将-许昌
	public static final int SYS_GAME_TYPE_PHZ_XT = 1231;// 湘谭跑胡子
	public static final int SYS_GAME_TYPE_HENAN_LYGC = 1232;// 洛阳杠次
	public static final int SYS_GAME_TYPE_HENAN_XX = 1233;// 河南麻将-新乡
	public static final int SYS_GAME_TYPE_PDK_JD = 1234; // 经典跑得快
	public static final int SYS_GAME_TYPE_PDK_YW = 1235; // 15张玩法跑得快
	public static final int SYS_GAME_TYPE_PDK_LZ = 1236; // 癞子玩法跑得快
	public static final int SYS_GAME_TYPE_PDK_FP = 1237; // 四人玩法跑得快
	public static final int SYS_GAME_TYPE_HENAN_XY = 1238; // 信阳麻将
	public static final int SYS_GAME_TYPE_HENAN_ZHUAN_ZHUAN = 1239; // 河南转转麻将
	public static final int SYS_GAME_TYPE_HENAN_PDS = 1240; // 河南平顶山麻将
	public static final int SYS_GAME_TYPE_HENAN_SMX = 1241; // 三门峡麻将
	public static final int SYS_GAME_TYPE_LHQ_HD = 1242; // 衡东六胡抢
	public static final int SYS_GAME_TYPE_DDZ_JD = 1243; // 经典斗地主
	public static final int SYS_GAME_TYPE_THK_HY = 1244; // 衡阳十胡卡
	public static final int SYS_GAME_TYPE_HENAN_ZHOU_KOU = 1245; // 河南周口麻将
	public static final int SYS_GAME_TYPE_HENAN_JZ = 1246; // 河南焦作
	public static final int SYS_GAME_TYPE_PHZ_HS = 1247; // 汉寿跑胡子
	public static final int SYS_GAME_TYPE_PHZ_AH = 1248; // 安化跑胡子
	public static final int SYS_GAME_TYPE_PHZ_XX = 1249; // 湘乡跑胡子

	public static final int SYS_GAME_TYPE_FLS_LX_DP = 1250;// 临湘福禄寿-带p
	public static final int SYS_GAME_TYPE_BTZ_YY = 1251;// 扳坨子
	public static final int SYS_GAME_TYPE_HUNAN_CHENZHOU = 1252;// 湖南郴州
	public static final int SYS_GAME_TYPE_ZJH_JD = 1253;// 炸金花
	public static final int SYS_GAME_TYPE_HENAN_LUO_HE = 1254; // 河南漯河麻将
	public static final int SYS_GAME_TYPE_WMQ_AX = 1255; // 偎麻雀
	public static final int SYS_GAME_TYPE_HU_NAN_CHANG_DE = 1256; // 湖南常德麻将
	public static final int SYS_GAME_TYPE_HU_NAN_SHAO_YANG = 1257; // 湖南邵阳麻将
	public static final int SYS_GAME_TYPE_HU_NAN_YI_YANG = 1258; // 湖南益阳麻将
	public static final int SYS_GAME_TYPE_YUEYANG_TDH = 1259; // 岳阳推倒胡
	public static final int SYS_GAME_TYPE_YYZXZ = 1260; // 岳阳抓虾子
	public static final int SYS_GAME_TYPE_QJQF = 1261; // 潜江千分
	public static final int SYS_GAME_TYPE_HUNAN_HENGYANG = 1262; // 湖南衡阳麻将
	public static final int SYS_GAME_TYPE_HUNAN_XIANG_TAN = 1263; // 湖南湘潭麻将
	public static final int SYS_GAME_TYPE_HUNAN_YONG_ZHOU = 1264; // 湖南永州麻将

	public static final int SYS_GAME_TYPE_PHU_YX = 1264; // 攸县碰胡
	public static final int SYS_GAME_TYPE_JDOX_YY = 1265; // 岳阳经典牛牛
	public static final int SYS_GAME_TYPE_PHZ_YYWHZ = 1266;// 岳阳歪胡子
	public static final int SYS_GAME_TYPE_JIANGSU_ZZ = 1267;// 江苏镇江麻将

	public static final int SYS_GAME_TYPE_PHZ_CHEN_ZHOU = 1268; // 湖南郴州字牌
	public static final int SYS_GAME_TYPE_LHQ_HY = 1269; // 衡阳六胡抢
	public static final int SYS_GAME_TYPE_LHQ_QD = 1270; // 祁东六胡抢
	public static final int SYS_GAME_TYPE_HGW_HH = 1271; // 怀化红拐弯
	public static final int SYS_GAME_TYPE_HH_YYZHZ = 1272; // 岳阳捉红字
	public static final int SYS_GAME_TYPE_HH_NXPHZ = 1273; // 宁乡跑胡子

	public static final int SYS_GAME_TYPE_PHZ_LEI_YANG = 1274; // 耒阳字牌
	public static final int SYS_GAME_TYPE_PHZ_SYBP = 1275; // 邵阳剥皮
	public static final int SYS_GAME_TYPE_PHZ_HC = 1276; // 河池字牌

	public static final int SYS_GAME_TYPE_PHZ_SY = 1277; // 邵阳字牌
	public static final int SYS_GAME_TYPE_PHZ_CS = 1278; // 长沙跑胡子
	public static final int SYS_GAME_TYPE_GHZ_NX = 1279; // 南县鬼胡子

	public static final int SYS_GAME_TYPE_PHZ_CZ_SR = 1280; // 湖南郴州三人字牌
	public static final int SYS_GAME_TYPE_PHZ_YONG_ZHOU = 1281; // 湖南永州扯胡子
	public static final int SYS_GAME_TYPE_DBN = 1282; // 斗板牛
	public static final int SYS_GAME_TYPE_HALL_ZHUAN_ZHUAN_MJ = 1283; // 转转麻将(大厅)
	public static final int SYS_GAME_TYPE_ER_REN = 1284; // 二人跑胡子
	public static final int SYS_GAME_TYPE_HALL_HONG_ZHONG_MJ = 1285; // 红中麻将(大厅)
	public static final int SYS_GAME_TYPE_PHZ_LOU_DI_FANG_PAO_FA = 1286; // 娄底放炮罚
	public static final int SYS_GAME_TYPE_HALL_LIU_ZHOU_MJ = 1287; // 大厅广西柳州麻将
	public static final int SYS_GAME_TYPE_PHZ_GUILIN_ZP = 1288; // 桂林字牌
	public static final int SYS_GAME_TYPE_PHZ_BAIYI_ZP = 1289; // 八一字牌
	public static final int SYS_GAME_TYPE_HALL_CHANG_SHA_MJ = 1290; // 长沙麻将(大厅)
	public static final int SYS_GAME_TYPE_FKN = 1291; // 疯狂牛牛

	public static final int SYS_GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI_DT = 1292; // 岳阳抓虾子(大厅)
	public static final int SYS_GAME_TYPE_YUE_YANG_TDH_DT = 1293; // 岳阳推到胡(大厅)
	public static final int SYS_GAME_TYPE_XUPU_LAOPAI = 1294; // 溆浦老牌

	public static final int SYS_GAME_TYPE_SANDAHA = 1295; // 三打哈
	public static final int SYS_GAME_TYPE_PHZ_WU_GANG = 1296; // 湖南武冈字牌

	public static final int SYS_GAME_TYPE_TTZ = 1297; // 推筒子

	public static final int SYS_GAME_TYPE_XUPU_SSZ = 1298; // 溆浦十三张
	public static final int SYS_GAME_TYPE_HUNAN_LILING = 1299; // 湖南醴陵麻将
	public static final int SYS_GAME_TYPE_PHZ_WANG_CHENG = 1300; // 望城跑胡子
	public static final int SYS_GAME_TYPE_MJ_SHANG_XIA_GUI = 1301; // 上下鬼(大厅)
	public static final int SYS_GAME_TYPE_HUNAN_CHANGDE_DT = 1302; // 湖南常德麻将(大厅)

	public static final int SYS_GAME_TYPE_SG_JD = 1303; // 经典三公
	public static final int SYS_GAME_TYPE_SG_BJH = 1304; // 三公比金花
	public static final int SYS_GAME_TYPE_SG_SW = 1305; // 双王三公
	public static final int SYS_GAME_TYPE_MJ_JI_YUAN = 1306; // 河南济源麻将

	public static final int SYS_GAME_TYPE_TDZ_SHAN_XI = 1307; // 陕西推对子
	public static final int SYS_GAME_TYPE_MJ_PY = 1308; // 濮阳麻将
	public static final int SYS_GAME_TYPE_HUNAN_XIANG_TAN_DT = 1309; // 湖南湘潭麻将(大厅)
	public static final int SYS_GAME_TYPE_DDZ_HENAN = 1310; // 河南斗地主
	public static final int SYS_GAME_TYPE_HH_CHD = 1311; // 常德红黑点
	public static final int SYS_GAME_TYPE_DHD_CHD = 1312; // 常德多红对
	public static final int SYS_GAME_TYPE_MJ_GX_NAN_NING = 1313; // 广西南宁麻将(大厅)
	public static final int SYS_GAME_TYPE_DT_MJ_HUNAN_CHEN_ZHOU = 1315; // 湖南郴州麻将(大厅)
	public static final int SYS_GAME_TYPE_MJ_JX_LE_PING = 1316; // 江西乐平麻将
	public static final int SYS_GAME_TYPE_MJ_SHANG_QIU = 1317; // 商丘麻将
	public static final int SYS_GAME_TYPE_QF_YY = 1318; // 益阳千分
	public static final int SYS_GAME_TYPE_PHZ_XP = 1319; // 溆浦跑胡子
	public static final int SYS_GAME_TYPE_LX_CS_DT = 1320; // 临湘长沙(大厅)
	public static final int SYS_GAME_TYPE_JS_YANG_ZHONG = 1321; // 江苏扬中麻将
	public static final int SYS_GAME_TYPE_WSK_DMZ = 1322; // 打码子
	public static final int SYS_GAME_TYPE_GDY = 1323; // 干瞪眼
	public static final int SYS_GAME_TYPE_BTZ_TB = 1324; // 推饼(规则跟扳砣子一模一样)
	public static final int SYS_GAME_TYPE_GZP = 1325; // 个子牌
	public static final int SYS_GAME_TYPE_JDB = 1326; // 九点半
	public static final int SYS_GAME_TYPE_DZH = 1327; // 定庄九点半
	public static final int SYS_GAME_TYPE_XYKL = 1328; // 闲逸咔陇
	public static final int SYS_GAME_TYPE_HU_BEI_HUANG_ZHOU = 1329; // 湖北黄州晃晃
	public static final int SYS_GAME_TYPE_MJ_JIANG_SU_JIN_HU = 1330; // 江苏金湖麻将
	public static final int SYS_GAME_TYPE_HU_BEI_HZ_LAI_GANG = 1331; // 红中赖子杠
	public static final int SYS_GAME_TYPE_SANDAHA_XT = 1332; // 湘潭三打哈
	public static final int SYS_GAME_TYPE_DBD = 1333; // 斗板凳
	public static final int SYS_GAME_TYPE_HE_NAN_HUA_XIAN = 1334; // 河南滑县麻将
	public static final int SYS_GAME_TYPE_DZD = 1335; // 打炸弹
	public static final int SYS_GAME_TYPE_JD_CHANG_SHA = 1336; // 经典长沙麻将
	public static final int SYS_GAME_TYPE_SSZ_JD = 1337; // 经典十三张
	public static final int SYS_GAME_TYPE_SSZ_ZZ = 1338; // 镇江十三张
	public static final int SYS_GAME_TYPE_HENAN_MJ_KLDS = 1339; // 窟窿带神(河南)
	public static final int SYS_GAME_TYPE_ER_ZHOU = 1340; // 鄂州晃晃
	public static final int SYS_GAME_TYPE_HAN_SHOU_WANG = 1341; // 汉寿王
	public static final int SYS_GAME_TYPE_GUI_YANG = 1342; // 贵阳麻将
	public static final int SYS_GAME_TYPE_COU_YI_SE = 1343; // 鄂州凑一色
	public static final int SYS_GAME_TYPE_NEW_PHZ_CHEN_ZHOU = 1344; // 湖南新郴州字牌
	public static final int SYS_GAME_TYPE_HU_BEI_HUANG_SHI = 1345; // 湖北黄石麻将
	public static final int SYS_GAME_TYPE_HENG_YANG_258 = 1346; // 衡阳258
	public static final int SYS_GAME_TYPE_KSZOX = 1347; // 看三张抢张
	public static final int SYS_GAME_TYPE_KLJDOX = 1348; // 快乐经典牛牛
	public static final int SYS_GAME_TYPE_KLFKOX = 1349; // 快乐疯狂张牛牛
	public static final int SYS_GAME_TYPE_KLTBOX = 1350; // 快乐通比牛牛
	public static final int SYS_GAME_TYPE_KLDGOX = 1351; // 快乐斗公牛牛
	public static final int SYS_GAME_TYPE_CZWXOX = 1352; // 郴州五小牛
	public static final int SYS_GAME_TYPE_BAO_DING = 1353; // 河北保定
	public static final int SYS_GAME_TYPE_DEH_JD = 1354; // 丁二红经典
	public static final int SYS_GAME_TYPE_DEH_MQ = 1355; // 丁二红芒圈
	public static final int SYS_GAME_TYPE_SHAN_WEI = 1355; // 汕尾麻将
	public static final int SYS_GAME_TYPE_LBA_CHD = 1356; // 常德六八番
	public static final int SYS_GAME_TYPE_WMQ_AX_S = 1357;// 安乡偎麻雀南
	public static final int SYS_GAME_TYPE_OX_YY = 1358;// 岳阳牛牛
	public static final int SYS_GAME_TYPE_ZJH_HB = 1359;// 湖北炸金花
	public static final int SYS_GAME_TYPE_CZBG = 1360;// 郴州八怪
	public static final int SYS_GAME_TYPE_BTZ_TB_BEGIN = 1361; // 推饼划分
																// 1361-1378都已被推饼占用,
																// 新增的请从1379开始
	public static final int SYS_GAME_TYPE_BTZ_TB_END = 1378; // 推饼划分
																// 1361-1378都已被推饼占用,
																// 新增的请从1379开始
	public static final int SYS_GAME_TYPE_GDY_HU = 1379; // 推饼划分
															// 1361-1378都已被推饼占用,
															// 新增的请从1379开始

	public static final int SYS_GAME_TYPE_TAO_JIANG = 1380; // 湖南桃江麻将
	public static final int SYS_GAME_TYPE_EIGHT_OX = 1381; // 8人牛牛
	public static final int SYS_GAME_TYPE_LU_HE = 1382; // 陆河麻将
	public static final int SYS_GAME_TYPE_WSK_NSB = 1383; // 牛十别
	public static final int SYS_GAME_TYPE_3D_HUANG_SHI = 1384; // 3D-黄石

	public static final int SYS_GAME_TYPE_HUNAN_YIYANG_SZG = 1385; // 益阳梭子杠
	public static final int SYS_GAME_TYPE_GZCG = 1386; // 赣州冲关

	public static final int SYS_GAME_TYPE_NINGDU = 1387; // 宁都麻将

	public static final int SYS_GAME_TYPE_LILING_ZZ = 1388; // 醴陵转转

	public static final int SYS_GAME_TYPE_ZHUZHOU_ZZ = 1389; // 株洲转转

	public static final int SYS_GAME_TYPE_WEINAN_MJ = 1390; // 渭南麻将

	public static final int SYS_GAME_TYPE_MJ_RUIJIN = 1391; // 瑞金麻将

	public static final int SYS_GAME_TYPE_MJ_LILING_TH = 1392; // 醴陵麻将土豪版
	public static final int SYS_GAME_TYPE_HONG_ER_SHI = 1393; // 红二十
	public static final int SYS_GAME_TYPE_WSK_GF = 1394; // 广丰510K
	public static final int SYS_GAME_TYPE_MJ_XU_PU = 1395; // 溆浦麻将
	public static final int SYS_GAME_TYPE_MJ_LV_LIANG = 1396; // 吕梁麻将
	public static final int SYS_GAME_TYPE_MJ_XTDGK = 1397; // 幺筒断勾卡麻将
	public static final int SYS_GAME_TYPE_MJ_MYG = 1398; // 耒阳鬼麻将
	public static final int SYS_GAME_TYPE_YI_YANG_BA_SHI = 1399; // 益阳巴十
	public static final int SYS_GAME_TYPE_MJ_YI_FENG = 1400; // 宜丰麻将

	// 通用斗牛，收费索引占位，一个通用类型100个位置，一共10种，站位1000个
	// 房主上庄
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_FANG_ZHU = 1401;
	public static final int SYS_GAME_TYPE_U_BULL_END_FANG_ZHU = 1500;
	// 牛牛上庄
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_NIU_NIU = 1501;
	public static final int SYS_GAME_TYPE_U_BULL_END_NIU_NIU = 1600;
	// 轮流上庄
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_LUN_LIU = 1601;
	public static final int SYS_GAME_TYPE_U_BULL_END_LUN_LIU = 1700;
	// 自由抢庄
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_ZI_YOU = 1701;
	public static final int SYS_GAME_TYPE_U_BULL_END_ZI_YOU = 1800;
	// 明三张抢庄
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_MING_SAN = 1801;
	public static final int SYS_GAME_TYPE_U_BULL_END_MING_SAN = 1900;
	// 看四张抢庄
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_KAN_SI = 1901;
	public static final int SYS_GAME_TYPE_U_BULL_END_KAN_SI = 2000;
	// 通比牛牛
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_TONG_BI = 2001;
	public static final int SYS_GAME_TYPE_U_BULL_END_TONG_BI = 2100;
	// 斗板牛
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_DOU_BAN = 2101;
	public static final int SYS_GAME_TYPE_U_BULL_END_DOU_BAN = 2200;
	// 疯狂牛牛
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_FENG_KUANG = 2201;
	public static final int SYS_GAME_TYPE_U_BULL_END_FENG_KUANG = 2300;
	// 暗三张抢庄
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_AN_SAN = 2301;
	public static final int SYS_GAME_TYPE_U_BULL_END_AN_SAN = 2400;
	// 新增的请从2401开始

	public static final int SYS_GAME_TYPE_FLS_LX_THREE = 2401;

	public static final int SYS_GAME_TYPE_FLS_LX_TWO = 2402;
	public static final int SYS_GAME_TYPE_LL_PDK_JD = 2403;

	public static final int SYS_GAME_TYPE_NEW_AN_YANG = 2404; // 新安阳麻将
	public static final int SYS_GAME_TYPE_NEW_LIN_ZHOU = 2405; // 新林州麻将
	public static final int SYS_GAME_TYPE_NEW_HE_NAN = 2406; // 新河南麻将
	public static final int SYS_GAME_TYPE_NEW_HN_HONG_ZHONG = 2407; // 新河南红中麻将
	public static final int SYS_GAME_TYPE_NEW_ZHU_MA_DIAN = 2408; // 新驻马店麻将
	public static final int SYS_GAME_TYPE_NEW_KAI_FENG = 2409; // 新开封麻将
	public static final int SYS_GAME_TYPE_NEW_NAN_YANG = 2410; // 新南阳麻将
	public static final int SYS_GAME_TYPE_NEW_XU_CHANG = 2411; // 新许昌麻将
	public static final int SYS_GAME_TYPE_NEW_LUO_YANG_GANG_CI = 2412; // 新洛阳杠次
	public static final int SYS_GAME_TYPE_NEW_XIN_XIANG = 2413; // 新新乡麻将
	public static final int SYS_GAME_TYPE_NEW_SAN_MEN_XIA = 2414; // 新三门峡麻将
	public static final int SYS_GAME_TYPE_NEW_PING_DING_SHAN = 2415; // 新平顶山麻将
	public static final int SYS_GAME_TYPE_NEW_ZHOU_KOU = 2416; // 新周口麻将
	public static final int SYS_GAME_TYPE_NEW_LUO_HE = 2417; // 新漯河麻将
	public static final int SYS_GAME_TYPE_NEW_JI_YUAN = 2418; // 新济源麻将
	public static final int SYS_GAME_TYPE_NEW_PU_YANG = 2419; // 新濮阳麻将
	public static final int SYS_GAME_TYPE_NEW_SHANG_QIU = 2420; // 新商丘麻将
	public static final int SYS_GAME_TYPE_NEW_HUA_ZHOU = 2421; // 新滑州麻将
	public static final int SYS_GAME_TYPE_NEW_LU_YI = 2422; // 新鹿邑麻将
	public static final int SYS_GAME_TYPE_NEW_JIAO_ZUO = 2423; // 新焦作麻将
	public static final int SYS_GAME_TYPE_LL_PDK_SW = 2424;// 醴陵十五张
	public static final int SYS_GAME_TYPE_MJ_HUO_JIA = 2425; // 河南获嘉麻将

	public static final int SYS_GAME_TYPE_KLJX_NNSZ = 2426; // 江西快乐牛牛上庄
	public static final int SYS_GAME_TYPE_KLJX_ZYQZ = 2427; // 江西快乐自由抢庄
	public static final int SYS_GAME_TYPE_KLJX_SIX_MPQZ = 2428; // 明牌抢庄6人
	public static final int SYS_GAME_TYPE_KLJX_EIGHT_MPQZ = 2429;// 明牌抢庄8 人
	public static final int SYS_GAME_TYPE_KLJX_DGOX = 2430; // 公牌牛牛
	public static final int SYS_GAME_TYPE_YIYANG_WHZ = 2431; // 益阳歪胡子
	public static final int SYS_GAME_TYPE_MJ_TDH = 2432; // 推倒胡

	public static final int SYS_GAME_TYPE_CP_DZHUI = 2433; // 长牌打追
	public static final int SYS_GAME_TYPE_CP_DZHUA = 2434; // 长牌打抓
	public static final int SYS_GAME_TYPE_CP_DSHISI = 2435;// 长牌斗十四
	public static final int SYS_GAME_TYPE_PDK_SC = 2436; // 四川跑得快
	public static final int SYS_GAME_TYPE_MJ_XUE_ZHAN_DAO_DI = 2437; // 四川血战到底
	public static final int SYS_GAME_TYPE_MJ_KA_WU_XING = 2438; // 卡五星
	public static final int SYS_GAME_TYPE_PDK_ZN = 2439; // 扎鸟跑得快
	public static final int SYS_GAME_TYPE_MJ_GD_HUNDRED = 2440; // 广东100张
	public static final int SYS_GAME_TYPE_PDK_YY = 2441; // 益阳跑得快
	public static final int SYS_GAME_TYPE_MH_GD_HUIZHOUZHUANG = 2442; // 广东惠州庄麻将
	public static final int SYS_GAME_TYPE_PDK_SW_YY = 2443; // 益阳十五张跑得快
	public static final int SYS_GAME_TYPE_PUKE_ABZ_THREE = 2444; // A包子
	public static final int SYS_GAME_TYPE_PUKE_ABZ_FOUR = 2445; // A包子
	public static final int SYS_GAME_TYPE_JIAO_ZHUO_HUAN_HUAN = 2446; // 焦作晃晃
	public static final int SYS_GAME_TYPE_DN_YI_YANG = 2448; // 益阳无花牛
	public static final int SYS_GAME_TYPE_SHI_DIAN_BAN = 2447;// 十点半
	public static final int SYS_GAME_TYPE_DEH_MG = 2449;// 丁二皇芒果
	public static final int SYS_GAME_TYPE_HB_DYZP = 2450;// 湖北大冶字牌
	public static final int SYS_GAME_TYPE_XF_GD = 2451;// 信丰挂挡
	public static final int SYS_GAME_TYPE_DMZ_YY = 2452;// 打码子语音
	public static final int SYS_GAME_TYPE_CP_DSS_QL = 2453; // 四川-斗十四-邛崃
	public static final int SYS_GAME_TYPE_CP_DSS_DY = 2454; // 四川-斗十四-大邑
	public static final int SYS_GAME_TYPE_CP_DSS_DY_THREE = 2455; // 四川-斗十四-大邑三人
	public static final int SYS_GAME_TYPE_CP_DSS_DY_FOUR = 2456; // 四川-斗十四-大邑四人
	public static final int SYS_GAME_TYPE_MJ_GUANG_CHANG = 2457; // 广昌麻将
	public static final int SYS_GAME_TYPE_XF_GD_THREE = 2459;// 信丰挂挡三人
	public static final int SYS_GAME_TYPE_MJ_XI_AN = 2458; // 西安麻将
	public static final int SYS_GAME_TYPE_MJ_HUA_RONG = 2460; // 华容逞癞子
	public static final int SYS_GAME_TYPE_MJ_HUA_RONG3 = 2461; // 3人华容逞癞子

	public static final int SYS_GAME_TYPE_HONG_ZHONG_MJ_TH = 2462; // 3D红中麻将(大厅)
	public static final int SYS_GAME_TYPE_MJ_XIN_YANG = 2463; // 信阳麻将
	public static final int SYS_GAME_TYPE_MJ_ZHENG_ZHOU = 2464; // 郑州麻将
	public static final int SYS_GAME_TYPE_PK_TONG_CHENG = 2465; // 通城打滚
	public static final int SYS_GAME_TYPE_MJ_TIAO_TIAO = 2466; // 跳跳麻将(万载红中)
	public static final int SYS_GAME_TYPE_MJ_SAN_MEN_XIA_NEW = 2467; // 三门峡
	public static final int SYS_GAME_TYPE_PHZ_LD_FANG_PAO_FA = 2468; // 娄底放炮罚
	public static final int SYS_GAME_TYPE_MJ_YUYANG_HONGZHON = 2469; // 岳阳红中

	// 八人牛牛玩法 start
	public static final int SYS_GAME_TYPE_U_BULL_BEGIN_BA_REN = 2501;
	public static final int SYS_GAME_TYPE_U_BULL_END_BA_REN = 2600;
	// 八人牛牛end

	public static final int SYS_GAME_TYPE_SX_TUIDAOHU = 2700;// 山西推倒胡
	public static final int SYS_GAME_TYPE_MJ_XIAN_NING = 2701;// 咸宁麻将
	public static final int SYS_GAME_TYPE_MJ_LYGC_DIAN_PAO = 2702; // 洛阳杠次-点炮胡
	public static final int SYS_GAME_TYPE_SX_JINGYUE = 2703;// 山西静乐麻将
	public static final int SYS_GAME_TYPE_HUAIHUA_OX = 2704;// 怀化牛牛
	public static final int SYS_GAME_TYPE_MJ_JX_YUDU = 2705; // 江西于都麻将
	public static final int SYS_GAME_TYPE_MJ_KA_WU_XING_XG = 2706; // 孝感卡五星
	public static final int SYS_GAME_TYPE_WSK_HS_510K = 2707; // 黄石WSK
	public static final int SYS_GAME_TYPE_LLDAQI = 2708; // 吕梁打七
	public static final int SYS_GAME_TYPE_AHPDK_JD = 2709; // 安化经典跑得快
	public static final int SYS_GAME_TYPE_AHPDK_SW = 2710; // 安化十五张跑得快
	public static final int SYS_GAME_TYPE_3D_E_ZHOU = 2711; // 3D鄂州晃晃
	public static final int SYS_GAME_TYPE_THJ_CS = 2712; // 土豪金长沙
	public static final int SYS_GAME_TYPE_THJ_JD_CS = 2713; // 土豪金经典长沙
	public static final int SYS_GAME_TYPE_MJ_SHANXI = 2714; // 陕西麻将
	public static final int SYS_GAME_TYPE_MJ_AN_HUA = 2715; // 安化麻将
	public static final int SYS_GAME_TYPE_JX_DDZ = 2716; // 吉县斗地主
	public static final int SYS_GAME_TYPE_QIONG_LAI = 2717; // 邛崃麻将
	public static final int SYS_GAME_TYPE_TONG_CHENG = 2718; // 通城麻将
	public static final int SYS_GAME_TYPE_XNDG = 2719; // 咸宁打拱
	public static final int SYS_GAME_TYPE_HUANG_SHAN_TUN_XI = 2720; // 黄山屯溪麻将
	public static final int SYS_GAME_TYPE_MJ_JI_XIAN = 2721; // 山西吉县
	public static final int SYS_GAME_TYPE_THJ_YI_YANG = 2722; // 土豪金益阳麻将
	public static final int SYS_GAME_TYPE_THJ_YI_YANG_SGZ = 2723; // 土豪金益阳梭杠子
	public static final int SYS_GAME_TYPE_PDK_YUEY_JD = 2724; // 岳阳跑得快
	public static final int SYS_GAME_TYPE_PDK_YUEY_SW = 2725; // 岳阳跑得快
	public static final int SYS_GAME_TYPE_PSH_OX = 2726; // 拼十
	public static final int SYS_GAME_TYPE_PSH_FK_OX = 2727;// 疯狂拼十
	public static final int SYS_GAME_TYPE_MJ_SRLF = 2728; // 三人两房
	public static final int SYS_GAME_TYPE_MJ_WU_YUAN = 2729; // 婺源麻将
	public static final int SYS_GAME_TYPE_MJ_YUAN_JIANG = 2730; // 沅江麻将
	public static final int SYS_GAME_TYPE_MJ_HE_ZE = 2731; // 山东·菏泽麻将
	public static final int SYS_GAME_TYPE_XP_BOHU = 2732; // 溆浦博胡
	public static final int SYS_GAME_TYPE_KWX_SZ = 2733; // 随州卡五星
	public static final int SYS_GAME_TYPE_KWX_SY = 2734; // 十堰卡五星
	public static final int SYS_GAME_TYPE_KWX_YC = 2735; // 宜城卡五星
	public static final int SYS_GAME_TYPE_GHZ_YJ = 2736; // 沅江鬼胡子
	public static final int SYS_GAME_TYPE_MJ_WAN_ZAI = 2737; // 宜春万载麻将
	public static final int SYS_GAME_TYPE_KL_DDZ = 2738; // 快乐斗地主
	public static final int SYS_GAME_TYPE_SX_HUA_SHUI = 2739;// 陕西滑水麻将
	public static final int SYS_GAME_TYPE_PK_DTZ = 2740; // 打筒子
	public static final int SYS_GAME_TYPE_PDK_CZ_SW = 2741; // 郴州十五张跑得快
	public static final int SYS_GAME_TYPE_PDK_CZ_JD = 2742; // 郴州经典跑得快
	public static final int SYS_GAME_TYPE_PDK_DT_JD = 2743; // 洞庭经典跑得快
	public static final int SYS_GAME_TYPE_PDK_DT_SW = 2744; // 洞庭十五张跑得快
	public static final int SYS_GAME_TYPE_MJ_DT_SHA_MA = 2745; // 洞庭沙麻
	public static final int SYS_GAME_TYPE_MJ_DT_HONG_ZHONG = 2746; // 洞庭红中
	public static final int SYS_GAME_TYPE_PHZ_CHD_DT = 2747; // 常德跑胡子
	public static final int SYS_GAME_TYPE_HH_CHD_DT = 2748; // 常德红黑点
	public static final int SYS_GAME_TYPE_DHD_CHD_DT = 2749; // 常德多红对
	public static final int SYS_GAME_TYPE_LBA_CHD_DT = 2750; // 常德六八番
	public static final int SYS_GAME_TYPE_PDK_ZN_CZ = 2751; // 郴州四人跑得快
	public static final int SYS_GAME_TYPE_468_HONG_GUAI_WAN = 2752; // 468红拐弯
	public static final int SYS_GAME_TYPE_QIONG_LAI_HONG = 2753; // 邛崃烘
	public static final int SYS_GAME_TYPE_CHANG_CHUN = 2754; // 吉林长春
	public static final int SYS_GAME_TYPE_SONG_YUAN = 2755; // 吉林松原
	public static final int SYS_GAME_TYPE_MJ_YI_YANG_QIN_YOU = 2756; // 益阳麻将亲友版
	public static final int SYS_GAME_TYPE_SHANG_RAO_DA_ZHA = 2757; // 上饶打炸
	public static final int SYS_GAME_TYPE_MJ_HUAI_HUA = 2758; // 怀化麻将
	public static final int SYS_GAME_TYPE_PDK_KL = 2759; // 快乐跑得快
	public static final int SYS_GAME_TYPE_MJ_PJ_ZHA_NIAO = 2760; // 平江扎鸟
	public static final int SYS_GAME_TYPE_MJ_SHAN_XI_XIANG_NING = 2761; // 山西乡宁摔金
	public static final int SYS_GAME_TYPE_GZP_DDWF = 2762; // 地道玩法个子牌
	public static final int SYS_GAME_TYPE_PDK_SW_KL = 2763; // 十五张快乐跑得快
	public static final int SYS_GAME_TYPE_PDK_ZN_KL = 2764; // 扎鸟快乐跑得快
	public static final int SYS_GAME_TYPE_SX_LANXIAN = 2765; // 山西岚县麻将
	public static final int SYS_GAME_TYPE_SX_LOUFAN = 2766; // 山西娄烦麻将
	public static final int SYS_GAME_TYPE_SX_NINGWU = 2767; // 山西宁武麻将
	public static final int SYS_GAME_TYPE_MJ_NING_XIANG = 2768; // 宁乡麻将
	public static final int SYS_GAME_TYPE_PK_HES_PJ = 2769; // 浦江红二十
	public static final int SYS_GAME_TYPE_PK_HES_HY = 2770; // 汉源红二十
	public static final int SYS_GAME_TYPE_SJ_XP_240 = 2771; // 溆浦240
	public static final int SYS_GAME_TYPE_SJ_WZ_DD = 2772; // 万载倒段
	public static final int SYS_GAME_TYPE_SX_KOU_DIAN = 2773;// 山西扣点麻将
	public static final int SYS_GAME_TYPE_HENAN_WU_ZHI = 2774; // 河南武陟麻将
	public static final int SYS_GAME_TYPE_LPS2_DDZ = 2775; // 六盘水2人斗地主
	public static final int SYS_GAME_TYPE_LPS3_DDZ = 2776; // 六盘水3人斗地主
	public static final int SYS_GAME_TYPE_GY_ZJ_NEW = 2777; // 新贵阳捉鸡
	public static final int SYS_GAME_TYPE_GY_EDG = 2778; // 贵阳捉鸡-二丁拐
	public static final int SYS_GAME_TYPE_GT_SDG = 2779; // 贵阳捉鸡-三丁拐
	public static final int SYS_GAME_TYPE_MJ_JING_DE_ZHEN = 2780; // 景德镇麻将
	public static final int SYS_GAME_TYPE_MJ_HONG_ZHONG_FEI = 2781; // 邵阳3D红中飞
	public static final int SYS_GAME_TYPE_MJ_PING_XIANG_ZZ = 2782; // 萍乡转转
	public static final int SYS_GAME_TYPE_MJ_HAI_NAN = 2783; // 海南麻将
	public static final int SYS_GAME_TYPE_WSK_PC_ZD = 2784; // 蒲城炸弹
	public static final int SYS_GAME_TYPE_WSK_XQ_TH = 2785; // 蒲城炸弹
	public static final int SYS_GAME_TYPE_LIN_FENG = 2786; // 临汾硬三组
	public static final int SYS_GAME_TYPE_MJ_SX = 2787; // 松溪麻将
	public static final int SYS_GAME_TYPE_MJ_SXKDD = 2788; // 山西扣点点
	public static final int SYS_GAME_TYPE_WSK_DY_510K = 2789; // 大冶WSK
	public static final int SYS_GAME_TYPE_GDY_NP = 2790; // 南平干瞪眼
	public static final int SYS_GAME_TYPE_LF_YI_MEN_PAI = 2791; // 临汾一门牌
	public static final int SYS_GAME_TYPE_MJ_PU_CHENG = 2792;// 蒲城麻将
	public static final int SYS_GAME_TYPE_GUANG_AN = 2793; // 广安麻将
	public static final int SYS_GAME_TYPE_PDK_SXSD = 2794; // 陕西三代
	public static final int SYS_GAME_TYPE_CHQ_YDR = 2795; // 重启幺地人
	public static final int SYS_GAME_TYPE_MS_EQS = 2796; // 眉山二七十
	public static final int SYS_GAME_TYPE_YSDZ = 2797; // 玉山打炸
	public static final int SYS_GAME_TYPE_LE_SHAN_YAO_JI = 2798; // 乐山幺鸡麻将
	public static final int SYS_GAME_TYPE_PDK_JD_XY = 2799; // 经典襄阳跑得快
	public static final int SYS_GAME_TYPE_PDK_SW_XY = 2800; // 十五张襄阳跑得快
	public static final int SYS_GAME_TYPE_YJ_EQS = 2801; // 荥经二七十
	public static final int SYS_GAME_TYPE_MJ_PING_XING_258 = 2802; // 萍乡258
	public static final int SYS_GAME_TYPE_MJ_GUANG_ZE = 2803; // 福建光泽麻将
	public static final int SYS_GAME_TYPE_MJ_YING_JING = 2804; // 荥经麻将
	public static final int SYS_GAME_TYPE_MJ_ZYZJ = 2805; // 遵义捉鸡
	public static final int SYS_GAME_TYPE_PDK_JD_NP = 2806; // 南平经典跑得快
	public static final int SYS_GAME_TYPE_PDK_SW_NP = 2807; // 南平十五张跑得快
	public static final int SYS_GAME_TYPE_KFZZ = 2808; // 开封郑州麻将
	public static final int SYS_GAME_TYPE_HTS = 2809; // 黑桃三
	public static final int SYS_GAME_TYPE_MJ_HDWP = 2810; // 山西洪洞王牌麻将
	public static final int SYS_GAME_TYPE_MJ_NEW_HN_ZHEN_ZHOU = 2811; // 河南郑州麻将
	public static final int SYS_GAME_TYPE_MJ_QUAN_ZHOU = 2812; // 泉州麻将
	public static final int SYS_GAME_TYPE_WSK_PING_XIANG_2 = 2813; // 萍乡2滚筒
	public static final int SYS_GAME_TYPE_WSK_PING_XIANG_3 = 2814; // 萍乡3滚筒
	public static final int SYS_GAME_TYPE_WSK_PING_XIANG_6 = 2815; // 萍乡6滚筒
	public static final int SYS_GAME_TYPE_PDK_JD_LD = 2816; // 娄底经典跑得快
	public static final int SYS_GAME_TYPE_PDK_SW_LD = 2817; // 娄底十五张跑得快
	public static final int SYS_GAME_TYPE_LU_ZHOU_GUI = 2818; // 泸州鬼麻将
	public static final int SYS_GAME_TYPE_NX_HUA_SHUI = 2819;// 宁夏滑水麻将
	public static final int SYS_GAME_TYPE_CP_YANZH = 2820; // 阎中长牌
	public static final int SYS_GAME_TYPE_DDZ_LF = 2821; // 临汾斗地主
	public static final int SYS_GAME_TYPE_MJ_DCWDH = 2822; // 都昌无档胡
	public static final int SYS_GAME_TYPE_MJ_PING_XIANG_HZ = 2823; // （萍乡）红中麻将
	public static final int SYS_GAME_TYPE_DSS_MS = 2824; // 斗十四眉山
	public static final int SYS_GAME_TYPE_MJ_JIUJIANG_HZ = 2825; // 九江红中
	public static final int SYS_GAME_TYPE_MJ_JX_DUCHANG_ZB = 2826; // 江西都昌栽宝麻将
	public static final int SYS_GAME_TYPE_YZBP = 2827; // 永州包牌
	public static final int SYS_GAME_TYPE_MJ_XY = 2828; // 兴义麻将
	public static final int SYS_GAME_TYPE_LHQ_QD_SAPP = 2829; // 祁东六胡抢
	public static final int SYS_GAME_TYPE_MJ_NANCHANG = 2830; // 南昌麻将
	public static final int SYS_GAME_TYPE_PHZ_SY_DE = 2831; // 绥阳大贰
	public static final int SYS_GAME_TYPE_MJ_NEW_DLQH = 2832; // 大连穷胡麻将
	public static final int SYS_GAME_TYPE_MJ_HEYUAN_JD = 2833; // 河源鸡搭麻将
	public static final int SYS_GAME_TYPE_GZH_BZP = 2834; // 贵阳板子炮
	public static final int SYS_GAME_TYPE_WSK_NCST = 2835; // 南昌四团
	public static final int SYS_GAME_TYPE_XUE_LIU_CHENG_HE = 2836; // 血流成河
	public static final int SYS_GAME_TYPE_MJ_TDH_3D = 2837; // 推倒胡3D
	public static final int SYS_GAME_TYPE_MJ_XIANG_YUAN = 2838; // 山西襄垣麻将
	public static final int SYS_GAME_TYPE_MJ_HN_HUAZHOU = 2839; // 河南滑州麻将
	public static final int SYS_GAME_TYPE_MJ_MJ_GY = 2840; // 麻友——贵阳捉鸡
	public static final int SYS_GAME_TYPE_MJ_MJ_GY_TWO = 2841; // 麻友——贵阳捉鸡 二丁拐
	public static final int SYS_GAME_TYPE_MJ_MJ_GY_THREE = 2842; // 麻友——贵阳捉鸡 三丁拐
	public static final int SYS_GAME_TYPE_MJ_YZ = 2843; // 永州麻将
	public static final int SYS_GAME_TYPE_MJ_HEYUAN_HD = 2844; // 河源惠搭麻将
	public static final int SYS_GAME_TYPE_SJ_YZ240 = 2845; // 永州240
	public static final int SYS_GAME_TYPE_HL_GDY = 2846; // 欢乐干瞪眼
	public static final int SYS_GAME_TYPE_MJ_CS_QY = 2847; // 亲友长沙麻将
	public static final int SYS_GAME_TYPE_YXZD = 2848; // 永兴炸弹
	public static final int SYS_GAME_TYPE_MJ_GY_3 = 2849; // 贵阳捉鸡3
	public static final int SYS_GAME_TYPE_WSK_XTXZ = 2850; // 湘潭消造
	public static final int SYS_GAMR_TYPE_GY_TWO_3 = 2851; // 贵阳捉鸡二丁拐3
	public static final int SYS_GAMR_TYPE_GY_THREE_3 = 2852; // 贵阳捉鸡三丁拐3
	public static final int SYS_GAMR_TYPE_TXW = 2853; // 贵阳捉鸡三丁拐3
	public static final int SYS_GAME_TYPE_MJ_HLKDD = 2854; // 欢乐扣点点
	public static final int SYS_GAMR_TYPE_DDZ_DL = 2855; // 大连斗地主
	public static final int SYS_GAMR_TYPE_PDK_DL_JD = 2856; // 大连经典跑得快
	public static final int SYS_GAMR_TYPE_PDK_DL_SW = 2857; // 大连经典跑得快
	public static final int SYS_GAME_TYPE_MJ_ZHUZHOU_WANG = 2858; // 株洲王麻将
	public static final int SYS_GAME_TYPE_MJ_ZZSHA = 2859; // 株洲双红A
	public static final int SYS_GAMR_TYPE_MJ_GY_TRZJ = 2860; // 铜仁贵阳捉鸡
	public static final int SYS_GAMR_TYPE_ZD_NCGZ = 2861; // 南昌过炸
	public static final int SYS_GAME_TYPE_WSK_GF_BAWANG = 2862; // 广丰510K八王玩法
	public static final int SYS_GAME_TYPE_PDK_JD_HN = 2863; // 河南跑得快
	public static final int SYS_GAME_TYPE_PDK_SW_HN = 2864; // 河南跑得快
	public static final int SYS_GAME_TYPE_MJ_ZPTDH = 2865; // 做牌推倒胡
	public static final int SYS_GAMR_TYPE_MJ_LX_QY_CS = 2866; // 临湘亲友长沙
	public static final int SYS_GAME_TYPE_YL_PHZ = 2867; // 沅陵跑胡子
	public static final int SYS_GAME_TYPE_NCEQW = 2868; // 南昌二七王
	public static final int SYS_GAME_TYPE_DCTS = 2869; // 都昌讨赏
	public static final int SYS_GAME_TYPE_HL_XUE_LIU = 2870; // 欢乐血流麻将
	public static final int SYS_GAME_TYPE_PK_YJQF = 2871; // 沅江千分
	public static final int SYS_GAME_TYPE_MJ_YAAN = 2872; // 雅安麻将
	public static final int SYS_GAME_TYPE_GY_ZJ_NEW_3D = 2873;// 微乐贵阳捉鸡3D版
	public static final int SYS_GAME_TYPE_GY_EDG_3D = 2874;// 微乐贵阳捉鸡3D版-二丁拐
	public static final int SYS_GAME_TYPE_GY_SDG_3D = 2875;// 微乐贵阳捉鸡3D版-三丁拐
	public static final int SYS_GAME_TYPE_MJ_ZH_QIANG_HU = 2876;// 庄河穷胡
	public static final int SYS_GAME_TPPE_MJ_AS = 2877; // 安顺麻将
	public static final int SYS_GAME_TYPE_AN_YANG_ZZ = 2878; // 安阳郑州麻将
	public static final int SYS_GAME_TYPE_ZJK_HZ = 2879; // 张家口红中麻将
	public static final int SYS_GAME_TYPE_GX_BEI_HAI = 2880; // 广西北海麻将
	public static final int SYS_GAME_TYPE_PDK_JD_ZZ = 2881; // 漳州经典跑得快
	public static final int SYS_GAME_TYPE_PDK_SW_ZZ = 2882; // 漳州十五张跑得快
	public static final int SYS_GAME_TYPE_MJ_NINGXIANG_KAI_WANG = 2883; // 宁乡开王麻将
	public static final int SYS_GAME_TYPE_MJ_XING_TAI = 2884; // 河北邢台麻将
	public static final int SYS_GAME_TYPE_MJ_ZHANG_ZHOU = 2885; // 漳州麻将
	public static final int SYS_GAME_TYPE_MJ_SY = 2886; // 绥阳麻将
	public static final int SYS_GAME_TYPE_MJ_DLTDH = 2887; // 大连推倒胡
	public static final int SYS_GAME_TYPE_SWK_HRDZ = 2888; // 华容打炸弹
	public static final int SYS_GAME_TYPE_LD_SDH = 2889; // 娄底三打哈
	public static final int SYS_GAME_TYPE_XP_BF = 2890; // 溆浦包分
	public static final int SYS_GAME_TYPE_SWK_HCNG = 2891; // 河池牛鬼
	public static final int SYS_GAME_TYPE_MJ_MEN_HU_XUE_LIU = 2892; // 贵阳 闷胡血流
	public static final int SYS_GAME_TYPE_MJ_NEW_3D_XYKWX = 2893; // 新襄阳3D卡五星
	public static final int SYS_GAME_TYPE_MJ_NEW_3D_XGKWX = 2894; // 新孝感3D卡五星
	public static final int SYS_GAME_TYPE_WSK_YUGAN = 2895; // 余干五十K
	public static final int SYS_GAME_TYPE_MJ_LF = 2896; // 两房麻将
	public static final int SYS_GAME_TYPE_JX_TUIDAOHU = 2897;// 江西推倒胡
	public static final int SYS_GAME_TYPE_JX_YUGANGFEIBAO = 2898;// 余干飞宝
	public static final int SYS_GAME_TYPE_HN_FAN_JIN = 2899; // 湖南 翻金麻将
	public static final int SYS_GAME_TYPE_NCWL = 2900;// 南昌窝龙
	public static final int SYS_GAMR_TYPE_ZD_FCGZ = 2901; // 丰城过炸
	public static final int SYS_GAME_TYPE_PHZ_XINHUA = 2902; // 新化跑胡子
	public static final int SYS_GAME_TYPE_YGGP = 2903; // 余干关牌
	public static final int SYS_GAME_DENG_ZHOU_19_ZHANG = 2904; // 邓州十九张
	public static final int SYS_GAME_TYPE_MJ_ZHANG_PU = 2905; // 漳浦麻将
	public static final int SYS_GAME_TYPE_MJ_THGJ = 2906; // 泰和滚精
	public static final int SYS_GAME_TYPE_PDK_JZ_JD = 2907; // 荆州经典跑得快
	public static final int SYS_GAME_TYPE_PDK_JZ_SW = 2908; // 荆州十五张跑得快
	public static final int SYS_GAME_TYPE_MJ_FC = 2909; // 丰城麻将
	public static final int SYS_GAME_TYPE_MJ_ZJ = 2910; // 织金麻将
	public static final int SYS_GAME_TYPE_MJ_YGJZ = 2911; // 余干夹子麻将
	public static final int SYS_GAME_TYPE_WSK_FCSJ = 2912; // 丰城双剑
	public static final int SYS_GAMR_TYPE_ZD_THGZ = 2913; // 泰和过炸
	public static final int SYS_GAMR_TYPE_MJ_FCHZ = 2914; // 丰城红中
	public static final int SYS_GAME_TYPE_PDK_CD_JD = 2915; // 常德经典跑得快
	public static final int SYS_GAME_TYPE_PDK_CD_SW = 2916; // 常德十五张跑得快
	public static final int SYS_GAME_TYPE_PDS_ZHENG_ZHOU = 2917; // 平顶山郑州麻将
	public static final int SYS_GAME_TYPE_PHZ_GUILIN_ZP_F = 2918; // 桂林字牌4人玩法
	public static final int SYS_GAME_TYPE_MJ_GLZZ = 2919; // 桂林转转
	public static final int SYS_GAME_TYPE_MJ_NEW_XIAN_NING = 2920;// 新咸宁麻将
	public static final int SYS_GAME_TYPE_WSK_XYSK = 2921;// 闲逸双扣
	public static final int SYS_GAME_TYPE_MJ_TC_NEW = 2922; // 通城麻将新
	public static final int SYS_GAME_TYPE_BAO_DING_BA_ZHANG = 2923; // 保定八张
	public static final int SYS_GAME_TYPE_MJ_SHUN_PING = 2924; // 顺平麻将

	public static final int GAME_ID_HUNAN = 1; // 湖南
	public static final int GAME_ID_HUBEI = 2; // 湖北
	public static final int GAME_ID_HENAN = 3;// 河南麻将H
	public static final int GAME_ID_HENGYANG = 4;// 衡阳麻将

	public static final int GAME_ID_FLS_LX = 5;// 临湘福禄寿

	public static final int GAME_ID_GUANGDONG = 6;// 广东麻将

	public static final int GAME_ID_ZP_XY = 7;// 湘阴字牌

	public static final int GAME_ID_HH_YX = 8;// 攸县红黑胡

	public static final int GAME_ID_OX = 9; // 牛牛

	public static final int GAME_ID_HJK = 10; // 黑杰克

	public static final int GAME_ID_PDK = 11; // 跑得快

	public static final int GAME_ID_GUANG_XI = 12; // 广西麻将

	public static final int GAME_ID_PHZ_CHD = 200; // 常德跑胡子
	public static final int GAME_ID_PHZ_XT = 201; // 湘潭跑胡子
	public static final int GAME_ID_DDZ = 228; // 斗地主

	public static final int GAME_TYPE_ZZ = 0;
	public static final int GAME_TYPE_CS = 1;
	public static final int GAME_TYPE_HZ = 2;
	public static final int GAME_TYPE_SHUANGGUI = 3;// 双鬼麻将
	public static final int GAME_TYPE_ZHUZHOU = 4;// 株洲
	public static final int GAME_TYPE_CHENZHOU = 6;// 郴洲麻将

	// 湖北子游戏分支--Begin
	public static final int GAME_TYPE_XTHH = 2001;// 仙桃晃晃麻将
	public static final int GAME_TYPE_HU_BEI_HUANG_ZHOU = 2002; // 湖北黄州晃晃
	// 湖北子游戏分支--End

	// 四川麻将
	public static final int GAME_TYPE_MJ_XUE_ZHAN_DAO_DI = 2051; // 四川血战到底
	// 四川麻将

	public static final int GAME_TYPE_HENAN_AY = 3001;// 河南安阳
	public static final int GAME_TYPE_HENAN_LZ = 3002;// 河南安阳 -林州
	public static final int GAME_TYPE_HENAN = 3003;// 河南麻将
	public static final int GAME_TYPE_HENAN_HZ = 3004;// 河南红中

	public static final int GAME_TYPE_HENAN_ZMD = 3005;// 驻马店麻将
	public static final int GAME_TYPE_HENAN_KF = 3006;// 开封麻将
	public static final int GAME_TYPE_HENAN_NY = 3007;// 南阳麻将
	public static final int GAME_TYPE_HENAN_XC = 3008;// 许昌麻将
	public static final int GAME_TYPE_HENAN_ZHUAN_ZHUAN = 3009; // 河南转转麻将
	public static final int GAME_TYPE_HENAN_XX = 3010;// 新乡麻将
	public static final int GAME_TYPE_HENAN_XY = 3011;// 信阳麻将
	public static final int GAME_TYPE_HENAN_LYGC = 3012;// 洛阳杠次
	public static final int GAME_TYPE_HENAN_PDS = 3013;// 河南平顶山麻将
	public static final int GAME_TYPE_HENAN_LH = 3014; // 漯河麻将
	public static final int GAME_TYPE_HENAN_SMX = 3015; // 三门峡麻将
	public static final int GAME_TYPE_HENAN_JZ = 3017; // 焦作
	public static final int GAME_TYPE_HENAN_ZHOU_KOU = 3019; // 河南周口麻将
	public static final int GAME_TYPE_HUNAN_SHAOYANG = 3020; // 湖南邵阳麻将
	public static final int GAME_TYPE_HU_NAN_CHANG_DE = 3021; // 湖南常德麻将
	public static final int GAME_TYPE_HUNAN_YIYANG = 3022; // 湖南益阳麻将
	public static final int GAME_TYPE_HUNAN_YONGZHOU = 3023; // 湖南永州麻将
	public static final int GAME_TYPE_HUNAN_HENGYANG = 3024; // 湖南衡阳麻将
	public static final int GAME_TYPE_HUNAN_XIANG_TAN = 3025; // 湖南湘潭麻将
	public static final int GAME_TYPE_JIANGSU_ZHENJIANG = 3026; // 江苏镇江麻将

	public static final int GAME_TYPE_HALL_ZHUAN_ZHUAN_MJ = 3027; // 转转麻将(大厅)
	public static final int GAME_TYPE_HALL_HONG_ZHONG_MJ = 3028; // 红中麻将(大厅)
	public static final int GAME_TYPE_HALL_CHANG_SHA_MJ = 3029; // 长沙麻将(大厅)
	public static final int GAME_TYPE_HUNAN_LILING = 3030; // 湖南醴陵麻将
	public static final int GAME_TYPE_HUNAN_SHANG_XIA_GUI = 3031; // 上下鬼(大厅)
	public static final int GAME_TYPE_HUNAN_MJ_CD_DT = 3032; // 湖南常德麻将(大厅)
	public static final int GAME_TYPE_MJ_JI_YUAN = 3033; // 河南济源麻将
	public static final int GAME_TYPE_MJ_PU_YANG = 3034; // 濮阳麻将麻将
	public static final int GAME_TYPE_HUNAN_XIANG_TAN_DT = 3035; // 湖南湘潭麻将(大厅)
	public static final int GAME_TYPE_DT_MJ_HUNAN_CHEN_ZHOU = 3036; // 湖南郴州麻将(大厅)
	public static final int GAME_TYPE_MJ_SHANG_QIU = 3037; // 商丘麻将
	public static final int GAME_TYPE_HE_NAN_HUA_XIAN = 3038; // 河南滑县麻将
	public static final int GAME_TYPE_JD_CHANG_SHA = 3039; // 经典长沙麻将
	public static final int GAME_TYPE_HENNAN_MJ_KLDS = 3040; // 河南窟窿带神
	public static final int GAME_TYPE_ER_ZHOU = 3041; // 鄂州晃晃
	public static final int GAME_TYPE_COU_YI_SE = 3042; // 鄂州凑一色
	public static final int GAME_TYPE_HU_BEI_HUANG_SHI = 3043; // 湖北黄石麻将
	public static final int GAME_TYPE_HENG_YANG_258 = 3044; // 衡阳258
	public static final int GAME_TYPE_HUNAN_TAO_JIANG = 3045; // 湖南桃江麻将
	public static final int GAME_TYPE_3D_HUANG_SHI = 3046; // 3D-黄石
	public static final int GAME_TYPE_HUNAN_YIYANG_SZG = 3047; // 湖南益阳梭子杠
	public static final int GAME_TYPE_MJ_GZCG = 3048; // 赣州冲关
	public static final int GAME_TYPE_MJ_NINGDU = 3049; // 宁都麻将

	public static final int GAME_TYPE_LILING_ZZ = 3050; // 醴陵转转
	public static final int GAME_TYPE_ZHUZHOU_ZZ = 3051; // 株洲转转
	public static final int GAME_TYPE_MJ_HUO_JIA = 3052; // 河南获嘉麻将
	public static final int GAME_TYPE_MJ_TDH = 3053; // 推倒胡
	public static final int GAME_TYPE_MJ_WEINAN = 3054; // 渭南麻将
	public static final int GAME_TYPE_MJ_KA_WU_XING = 3055; // 卡五星
	public static final int GAME_TYPE_MJ_RUI_JIN = 3056; // 瑞金麻将
	public static final int GAME_TYPE_MJ_LI_LLING_TH = 3057; // 醴陵麻将土豪版
	public static final int GAME_TYPE_MJ_XU_PU = 3058; // 溆浦麻将
	public static final int GAME_TYPE_MJ_XTDGK = 3059; // 幺筒断勾卡麻将
	public static final int GAME_TYPE_HONG_ZHONG_MJ_TH = 3060; // 3D红中麻将

	///////////
	public static final int GAME_TYPE_SXG = 4001;// 上下鬼麻将

	public static final int GAME_TYPE_NEW_AN_YANG = 4100; // 新安阳麻将
	public static final int GAME_TYPE_NEW_LIN_ZHOU = 4101; // 新林州麻将
	public static final int GAME_TYPE_NEW_HE_NAN = 4102; // 新河南麻将
	public static final int GAME_TYPE_NEW_HN_HONG_ZHONG = 4103; // 新河南红中麻将
	public static final int GAME_TYPE_NEW_ZHU_MA_DIAN = 4104; // 新驻马店麻将
	public static final int GAME_TYPE_NEW_KAI_FENG = 4105; // 新开封麻将
	public static final int GAME_TYPE_NEW_NAN_YANG = 4106; // 新南阳麻将
	public static final int GAME_TYPE_NEW_XU_CHANG = 4107; // 新许昌麻将
	public static final int GAME_TYPE_NEW_LUO_YANG_GANG_CI = 4108; // 新洛阳杠次
	public static final int GAME_TYPE_NEW_XIN_XIANG = 4109; // 新新乡麻将
	public static final int GAME_TYPE_NEW_SAN_MEN_XIA = 4110; // 新三门峡麻将
	public static final int GAME_TYPE_NEW_PING_DING_SHAN = 4111; // 新平顶山麻将
	public static final int GAME_TYPE_NEW_ZHOU_KOU = 4112; // 新周口麻将
	public static final int GAME_TYPE_NEW_LUO_HE = 4113; // 新漯河麻将
	public static final int GAME_TYPE_NEW_JI_YUAN = 4114; // 新济源麻将
	public static final int GAME_TYPE_NEW_PU_YANG = 4115; // 新濮阳麻将
	public static final int GAME_TYPE_NEW_SHANG_QIU = 4116; // 新商丘麻将
	public static final int GAME_TYPE_NEW_HUA_ZHOU = 4117; // 新滑州麻将
	public static final int GAME_TYPE_NEW_LU_YI = 4118; // 新鹿邑麻将
	public static final int GAME_TYPE_NEW_JIAO_ZUO = 4119; // 新焦作麻将
	public static final int GAME_TYPE_JIAO_ZUO_HUAN_HUAN = 4120; // 焦作晃晃
	public static final int GAME_TYPE_MJ_LYGC_DIAN_PAO = 4121; // 洛阳杠次-点炮胡
	public static final int GAME_TYPE_NEW_LV_LIANG = 4122; // 吕梁麻将
	public static final int GAME_TYPE_NEW_MOYANG_GUI = 4123; // 耒阳鬼麻将
	public static final int GAME_TYPE_NEW_YI_FENG = 4124; // 宜丰麻将
	public static final int GAME_TYPE_NEW_SAN_MEN_XIA_NEW = 4125; // 三门峡
	public static final int GAME_TYPE_NEW_CHANG_CHUN = 4126; // 吉林长春麻将
	public static final int GAME_TYPE_NEW_SONG_YUAN = 4127; // 吉林松原麻将

	///////////////
	public static final int GAME_TYPE_FLS_LX = 5001;// 临湘福禄寿
	public static final int GAME_TYPE_FLS_LX_TWENTY = 5002;// 临湘福禄寿20张
	public static final int GAME_TYPE_FLS_LX_CG = 5003;// 临湘炒股
	public static final int GAME_TYPE_FLS_CS_LX = 5004;// 临(长沙)
	public static final int GAME_TYPE_FLS_HZ_LX = 5005;// 临(红中)
	public static final int GAME_TYPE_SEVER_OX_LX = 5006;// 房主牛牛
	public static final int GAME_TYPE_SZOX_LX = 5007;// 牛牛上庄
	public static final int GAME_TYPE_LZOX_LX = 5008;// 轮庄牛牛
	public static final int GAME_TYPE_ZYQOX_LX = 5009;// 自由牛牛
	public static final int GAME_TYPE_MSZOX_LX = 5010;// 明三张抢庄牛牛
	public static final int GAME_TYPE_MFZOX_LX = 5011;// 看四张抢庄牛牛
	public static final int GAME_TYPE_TBOX_LX = 5012;// 通比牛牛
	public static final int GAME_TYPE_JDOX_YY = 5013; // 经典牛牛

	public static final int GAME_TYPE_FLS_LX_DP = 5015;// 临湘福禄寿赖子
	public static final int GAME_TYPE_BTZ_YY = 5016;// 扳坨子
	public static final int GAME_TYPE_TTZ = 5017;// 推筒子
	public static final int GAME_TYPE_FLS_CS_LX_DT = 5018;// 临湘长沙(大厅)

	public static final int GAME_TYPE_FLS_LX_THREE = 5020;// 临湘福禄寿三人场
	public static final int GAME_TYPE_FLS_LX_TWO = 5021;// 临湘福禄寿2人场

	public static final int GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI = 5050; // 岳阳抓虾子
	public static final int GAME_TYPE_YUE_YANG_TDH = 5051;// 岳阳推到胡
	/////////////////////
	public static final int GAME_TYPE_GD_SHAO_GUAN = 6001;// 韶关麻将

	///////////////
	public static final int GAME_TYPE_ZP_XY = 7001;// 湘阴字牌

	public static final int GAME_TYPE_HH_YX = 8001;// 攸县红黑胡
	public static final int GAME_TYPE_PHZ_YX = 8002; // 攸县跑胡子
	public static final int GAME_TYPE_FPHZ_YX = 8003; // 攸县15张跑胡子
	public static final int GAME_TYPE_PHZ_CHD = 8004; // 常德跑胡子
	public static final int GAME_TYPE_PHZ_XT = 8005; // 湘谭跑胡子
	public static final int GAME_TYPE_LHQ_HD = 8006; // 衡东六胡抢
	public static final int GAME_TYPE_THK_HY = 8007; // 衡阳十胡卡
	public static final int GAME_TYPE_WMQ_AX = 8008; // 偎麻雀
	public static final int GAME_TYPE_PHU_YX = 8009; // 碰胡
	public static final int GAME_TYPE_WHZ_YY = 8010; // 岳阳歪胡子
	public static final int GAME_TYPE_PHZ_HS = 8011; // 汉寿跑胡子
	public static final int GAME_TYPE_PHZ_CHEN_ZHOU = 8012; // 湖南郴州字牌
	public static final int GAME_TYPE_LHQ_QD = 8013; // 祁东六胡抢
	public static final int GAME_TYPE_LHQ_HY = 8014; // 衡阳六胡抢
	public static final int GAME_TYPE_PHZ_AH = 8015; // 安化跑胡子
	public static final int GAME_TYPE_HGW_HH = 8016; // 怀化红拐弯
	public static final int GAME_TYPE_HH_YYZHZ = 8017; // 岳阳捉红字
	public static final int GAME_TYPE_PHZ_XX = 8018; // 湘乡跑胡子
	public static final int GAME_TYPE_PHZ_NX = 8019; // 宁乡跑胡子
	public static final int GAME_TYPE_PHZ_LEI_YANG = 8020; // 耒阳字牌
	public static final int GAME_TYPE_PHZ_SYBP = 8021; // 邵阳剥皮
	public static final int GAME_TYPE_PHZ_HC = 8022; // 河池字牌
	public static final int GAME_TYPE_PHZ_SY = 8023; // 邵阳字牌
	public static final int GAME_TYPE_PHZ_CS = 8024; // 长沙跑胡子
	public static final int GAME_TYPE_PHZ_WU_GANG = 8025; // 湖南武冈字牌
	public static final int GAME_TYPE_GHZ_NX = 8026;// 南县鬼胡子
	public static final int GAME_TYPE_PHZ_CZ_SR = 8027; // 湖南郴州三人字牌
	public static final int GAME_TYPE_PHZ_YONG_ZHOU = 8028; // 湖南永州扯胡子
	public static final int GAME_TYPE_PHZ_ER_REN = 8029; // 二人跑胡子
	public static final int GAME_TYPE_PHZ_LOU_DI_FANG_PAO_FA = 8030; // 娄底放炮罚
	public static final int GAME_TYPE_PHZ_GUILIN_ZP = 8031; // 桂林字牌
	public static final int GAME_TYPE_PHZ_BAYI_ZP = 8032; // 八一字牌
	public static final int GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI_DT = 8033; // 岳阳抓虾子(大厅)
	public static final int GAME_TYPE_YUE_YANG_TDH_DT = 8034;// 岳阳推到胡(大厅)
	public static final int GAME_TYPE_LAOPAI_XUPU = 8035; // 溆浦老牌
	public static final int GAME_TYPE_SANDAHA = 8036; // 三打哈
	public static final int GAME_TYPE_PHZ_WANG_CHENG = 8037; // 望城跑胡子
	public static final int GAME_TYPE_TDZ_SHAN_XI = 8038; // 陕西推对子
	public static final int GAME_TYPE_HH_CHD = 8039; // 常德红黑点
	public static final int GAME_TYPE_DHD_CHD = 8040; // 常德多红对
	public static final int GAME_TYPE_QF_YY = 8041; // 益阳千分
	public static final int GAME_TYPE_PHZ_XP = 8042; // 溆浦跑胡子
	public static final int GAME_TYPE_BTZ_TB = 8043; // 推饼(规则跟扳砣子一模一样)
	public static final int GAME_TYPE_MJ_JIANG_SU_JIN_HU = 8044; // 江苏金湖麻将
	public static final int GAME_TYPE_HU_BEI_HZ_LAI_GANG = 8045; // 红中赖子杠
	public static final int GAME_TYPE_SANDAHA_XT = 8046; // 湘潭三打哈
	public static final int GAME_TYPE_DZD = 8047; // 打炸弹
	public static final int GAME_TYPE_HAN_SHOU_WANG = 8048; // 汉寿王
	public static final int GAME_TYPE_GUI_YANG = 8049; // 贵阳麻将
	public static final int GAME_TYPE_NEW_PHZ_CHEN_ZHOU = 8050; // 湖南新郴州字牌
	public static final int GAME_TYPE_BAO_DING = 8051; // 河北保定
	public static final int GAME_TYPE_SHAN_WEI = 8052; // 汕尾麻将
	public static final int GAME_TYPE_LBA_CHD = 8053; // 常德六八番
	public static final int GAME_TYPE_WMQ_AX_S = 8054; // 安乡偎麻雀南
	public static final int GAME_TYPE_CZBG = 8055; // 郴州八怪
	public static final int GAME_TYPE_BTZ_TB_BEGIN = 8056; // 推饼划分
															// 8056-8073都已被推饼占用,
															// 新增的请从8074开始
	public static final int GAME_TYPE_BTZ_TB_END = 8073; // 推饼划分
															// 8056-8073都已被推饼占用,
															// 新增的请从8074开始

	public static final int GAME_TYPE_LU_HE = 8074; // 陆河麻将
	public static final int GAME_TYPE_WHZ_YIYANG = 8075; // 益阳歪胡子
	public static final int GAME_TYPE_HB_DYZP = 8076; // 湖北大冶字牌
	public static final int GAME_TYPE_YI_YANG_BA_SHI = 8077; // 益阳巴十
	public static final int GAME_TYPE_PHZ_CHD_DT = 8078; // 常德跑胡子
	public static final int GAME_TYPE_HH_CHD_DT = 8079; // 常德红黑点
	public static final int GAME_TYPE_DHD_CHD_DT = 8080; // 常德多红对
	public static final int GAME_TYPE_LBA_CHD_DT = 8081; // 常德六八番

	public static final int GAME_TYPE_SEVER_OX = 9001;// 房主牛牛
	public static final int GAME_TYPE_SZOX = 9002;// 牛牛上庄
	public static final int GAME_TYPE_LZOX = 9003;// 轮庄牛牛
	public static final int GAME_TYPE_ZYQOX = 9004;// 自由牛牛
	public static final int GAME_TYPE_MSZOX = 9005;// 明三张抢庄牛牛
	public static final int GAME_TYPE_MFZOX = 9006;// 看四张抢庄牛牛
	public static final int GAME_TYPE_TBOX = 9007;// 通比牛牛
	public static final int GAME_TYPE_DBN = 9008; // 斗板牛
	public static final int GAME_TYPE_FKN = 9009; // 疯狂牛牛
	public static final int GAME_TYPE_KSZOX = 9010; // 看三张牛牛
	public static final int GAME_TYPE_EIGHT_OX = 9011;// 八人玩法

	public static final int GAME_TYPE_KLJDOX = 9020; // 快乐经典牛牛
	public static final int GAME_TYPE_KLFKOX = 9021; // 快乐疯狂张牛牛
	public static final int GAME_TYPE_KLTBOX = 9022; // 快乐通比牛牛
	public static final int GAME_TYPE_KLDGOX = 9023; // 快乐斗公牛牛
	public static final int GAME_TYPE_CZWXOX = 9030; // 郴州五小牛
	public static final int GAME_TYPE_OX_YY = 9040; // 岳阳牛牛
	public static final int GAME_TYPE_KLJX_NNSZ = 9050; // 江西快乐牛牛上庄
	public static final int GAME_TYPE_KLJX_ZYQZ = 9051; // 江西快乐自由抢庄
	public static final int GAME_TYPE_KLJX_SIX_MPQZ = 9052; // 明牌抢庄6人
	public static final int GAME_TYPE_KLJX_EIGHT_MPQZ = 9053;// 明牌抢庄8 人
	public static final int GAME_TYPE_KLJX_DGOX = 9054; // 公牌牛牛
	public static final int GAME_TYPE_HUAIHUA_OX = 9060; // 怀化牛牛

	public static final int GAME_TYPE_PSH_OX = 9070; // 拼十
	public static final int GAME_TYPE_PSH_FK_OX = 9071;// 疯狂拼十
	public static final int GAME_TYPE_HJK = 10001;// 黑杰克
	public static final int GAME_TYPE_PDK_JD = 11001; // 经典跑得快
	public static final int GAME_TYPE_PDK_SW = 11002; // 15张玩法跑得快
	public static final int GAME_TYPE_PDK_LZ = 11003; // 癞子玩法跑得快
	public static final int GAME_TYPE_PDK_FP = 11004; // 四人玩法跑得快
	public static final int GAME_TYPE_PDK_JD_LL = 11005; // 醴陵经典跑得快
	public static final int GAME_TYPE_PDK_SW_LL = 11006; // 醴陵15张玩法跑得快
	public static final int GAME_TYPE_PDK_SC = 11007; // 四川经典跑得快
	public static final int GAME_TYPE_PDK_ZN = 11008; // 扎鸟经典跑得快
	public static final int GAME_TYPE_PDK_JD_YY = 11009; // 益阳经典跑得快
	public static final int GAME_TYPE_PDK_SW_YY = 11010; // 益阳经典跑得快
	public static final int GAME_TYPE_PDK_JD_AH = 11011; // 安化经典跑得快
	public static final int GAME_TYPE_PDK_SW_AH = 11012; // 安化经典跑得快
	public static final int GAME_TYPE_PDK_JD_YUEY = 11013; // 岳阳经典跑得快
	public static final int GAME_TYPE_PDK_SW_YUEY = 11014; // 岳阳十五张跑得快
	public static final int GAME_TYPE_PDK_JD_CZ = 11015; // 郴州经典跑得快
	public static final int GAME_TYPE_PDK_SW_CZ = 11016; // 郴州十五张跑得快
	public static final int GAME_TYPE_PDK_JD_DT = 11017; // 洞庭经典跑得快
	public static final int GAME_TYPE_PDK_SW_DT = 11018; // 洞庭十五张跑得快
	public static final int GAME_TYPE_PDK_ZN_CZ = 11019; // 郴州四人跑得快
	public static final int GAME_TYPE_PDK_KL = 11020; // 快乐跑得快
	public static final int GAME_TYPE_PDK_SW_KL = 11021; // 十五张快乐跑得快
	public static final int GAME_TYPE_PDK_ZN_KL = 11022; // 扎鸟快乐跑得快
	public static final int GAME_TYPE_PDK_JD_XY = 11023; // 襄阳经典跑得快
	public static final int GAME_TYPE_PDK_SW_XY = 11024; // 襄阳十五张跑得快
	public static final int GAME_TYPE_PDK_JD_NP = 11025; // 南平经典跑得快
	public static final int GAME_TYPE_PDK_SW_NP = 11026; // 南平十五张跑得快
	public static final int GAME_TYPE_PDK_JD_LD = 11027; // 娄底经典跑得快
	public static final int GAME_TYPE_PDK_SW_LD = 11028; // 娄底十五张跑得快
	public static final int GAME_TYPE_PDK_JD_DL = 11029; // 大连经典跑得快
	public static final int GAME_TYPE_PDK_SW_DL = 11030; // 大连十五张跑得快
	public static final int GAME_TYPE_PDK_JD_HN = 11031; // 河南经典跑得快
	public static final int GAME_TYPE_PDK_SW_HN = 11032; // 河南十五张跑得快
	public static final int GAME_TYPE_PDK_JD_ZZ = 11033; // 漳州经典跑得快
	public static final int GAME_TYPE_PDK_SW_ZZ = 11034; // 漳州十五张跑得快
	public static final int GAME_TYPE_YGGP = 11035; // 余干关牌
	public static final int GAME_TYPE_PDK_JD_JZ = 11036; // 荆州经典跑得快
	public static final int GAME_TYPE_PDK_SW_JZ = 11037; // 荆州十五张跑得快
	public static final int GAME_TYPE_PDK_JD_CD = 11038; // 常德经典跑得快
	public static final int GAME_TYPE_PDK_SW_CD = 11039; // 常德十五张跑得快
	// 炸金花
	public static final int GAME_TYPE_ZJH_JD = 12001; // 炸金花
	public static final int GAME_TYPE_ZJH_HB = 12002; // 湖北炸金花

	// 潜江千分
	public static final int GAME_TYPE_QJQF = 13002; // 潜江千分

	// 广西麻将、江苏麻将分支 -- Begin
	public static final int GAME_TYPE_GX_LIU_ZHOU = 14001; // 大厅广西柳州麻将
	public static final int GAME_TYPE_GX_NAN_NING = 14002; // 大厅广西南宁麻将

	public static final int GAME_TYPE_JS_YANG_ZHONG = 14101; // 大厅江苏扬中麻将
	// 广西麻将、江苏麻将分支 -- End

	public static final int GAME_TYPE_DDZ_JD = 15001; // 斗地主
	public static final int GAME_TYPE_DDZ_HENAN = 15002; // 河南斗地主
	public static final int GAME_TYPE_DDZ_JX = 15003;// 吉县斗地主
	public static final int GAME_TYPE_DDZ_LF = 15004;// 临汾斗地主
	public static final int GAME_TYPE_TXW = 15005;// 踢小五
	public static final int GAME_TYPE_DDZ_DL = 15006;// 大连斗地主
	public static final int GAME_TYPE_DBD_JD = 15101; // 斗板凳

	public static final int GAME_TYPE_SSZ_XUPU = 16001; // 溆浦十三张
	public static final int GAME_TYPE_SSZ_JD = 16002; // 经典十三张
	public static final int GAME_TYPE_SSZ_ZZ = 16003; // 镇江十三张
	public static final int GAME_TYPE_SSZ_CZ = 16004; // 郴州十三张
	public static final int GAME_TYPE_BAGUAI_CZ = 16005; // 郴州八怪

	public static final int GAME_TYPE_SG_JD = 17001; // 经典三公
	public static final int GAME_TYPE_SG_BJH = 17002; // 三公比金花
	public static final int GAME_TYPE_SG_SW = 17003; // 双王三公

	// 江西麻将分支
	public static final int GAME_TYPE_JX_LE_PING = 19001; // 江西乐平麻将

	//
	public static final int GAME_TYPE_WSK_DMZ = 18001; // 打码子
	public static final int GAME_TYPE_WSK_NSB = 18002; // 牛十别
	public static final int GAME_TYPE_WSK_DMZ_YY = 18003; // 打码子语音
	public static final int GAME_TYPE_WSK_XNDG = 18004; // 咸宁打拱
	public static final int GAME_TYPE_WSK_YSDZ = 18005; // 玉山打炸
	public static final int GAME_TYPE_WSK_HTS = 18006; // 黑桃三
	public static final int GAME_TYPE_WSK_YXZD = 18007; // 永兴炸弹
	public static final int GAME_TYPE_WSK_ZZSHA = 18008; // 株洲双红A
	public static final int GAME_TYPE_WSK_GF_BAWANG = 18009; // 株广丰510K8王玩法
	public static final int GAME_TYPE_WSK_DCTS = 18010; // 都昌讨赏

	public static final int GAME_TYPE_GDY = 20001; // 干瞪眼
	public static final int GAME_TYPE_GDY_HB = 20002; // 干瞪眼
	public static final int GAME_TYPE_GDY_NP = 20003; // 南平干瞪眼干瞪眼
	public static final int GAME_TYPE_GDY_RAR = 20004; // 肉挨肉干瞪眼
	public static final int GAME_TYPE_GZP = 21001; // 个子牌
	public static final int GAME_TYPE_GZP_DDWF = 21002; // 个子牌地道玩法
	public static final int GAME_TYPE_JDB = 22001; // 经典九点半
	public static final int GAME_TYPE_DZH = 22002; // 定庄九点半
	public static final int GAME_TYPE_XYKL = 23001; // 闲逸咔陇
	public static final int GAME_TYPE_DEH_JD = 24001; // 丁二红经典
	public static final int GAME_TYPE_DEH_MQ = 24002; // 丁二红芒圈
	public static final int GAME_TYPE_DEH_MG = 24003; // 丁二红芒果

	public static final int GAME_TYPE_CP_DZHUI = 25001; // 长牌打追
	public static final int GAME_TYPE_CP_DZHUA = 26001; // 长牌打抓
	public static final int GAME_TYPE_CP_DSHISI = 27001;// 长牌斗十四

	public static final int GAME_TYPE_PUKE_ABZ_THREE = 28001;// A包子
	public static final int GAME_TYPE_PUKE_ABZ_FOUR = 28002;// A包子

	public static final int GAME_TYPE_MJ_GD_HUNDRED = 30001; // 广东100张
	public static final int GAME_TYPE_HONG_ER_SHI = 30002; // 红二十
	public static final int GAME_TYPE_MJ_GD_HUIZHOUZHUANG = 30003; // 广东惠州庄
	public static final int GAME_TYPE_DN_YI_YANG = 30004;
	// 十点半
	public static final int GAME_TYPE_SHI_DIAN_BAN = 30005;
	public static final int GAME_TYPE_WSK_GF = 30006; // 广丰510K
	public static final int GAME_TYPE_MJ_XIAN_NING = 30007; // 咸宁麻将
	public static final int GAME_TYPE_MJ_XIN_YANG = 30008; // 信阳麻将

	public static final int GAME_TYPE_SX_TUIDAOHU = 30010;// 山西推倒胡
	public static final int GAME_TYPE_SX_JINGYUE = 30011;// 山西静乐
	public static final int GAME_TYPE_CP_DSS_QL = 30012; // 四川-斗十四-邛崃三人
	public static final int GAME_TYPE_CP_DSS_DY = 30013; // 四川-斗十四-大邑三人
	public static final int GAME_TYPE_MJ_GUANG_CHANG = 30016; // 广昌麻将
	public static final int GAME_TYPE_MJ_JX_YUDU = 30017; // 江西于都麻将
	public static final int GAME_TYPE_MJ_KA_WU_XING_XG = 30018; // 孝感卡五星
	public static final int GAME_TYPE_WSK_HS_510K = 30019; // 黄石五十K
	public static final int GAME_TYPE_LLDAQI = 30020; // 吕梁打七
	public static final int GAME_TYPE_3D_E_ZHOU = 30021; // 3D鄂州晃晃
	public static final int GAME_TYPE_THJ_CS = 30022; // 土豪金长沙
	public static final int GAME_TYPE_THJ_JD_CS = 30023; // 土豪金经典长沙
	public static final int GAME_TYPE_MJ_SHANXI = 30024; // 陕西麻将
	public static final int GAME_TYPE_MJ_AN_HUA = 30025; // 安化麻将
	public static final int GAME_TYPE_MJ_XI_AN = 30026; // 西安麻将
	public static final int GAME_TYPE_QIONG_LAI = 30027; // 邛崃麻将
	public static final int GAME_TYPE_TONG_CHENG = 30028; // 通城麻将
	public static final int GAME_TYPE_MJ_HUANG_SHAN_TUN_XI = 30029; // 黄山屯溪麻将
	public static final int GAME_TYPE_MJ_JI_XIAN = 30030; // 山西吉县
	public static final int GAME_TYPE_THJ_YI_YANG = 30031; // 土豪金益阳麻将
	public static final int GAME_TYPE_THJ_YI_YANG_SGZ = 30032; // 土豪金益阳梭杠子
	public static final int GAME_TYPE_MJ_HUA_RONG = 30033; // 华容逞癞子
	public static final int GAME_TYPE_MJ_HUA_RONG3 = 30034; // 3人华容逞癞子
	public static final int GAME_TYPE_MJ_SRLF = 30035; // 三人两房
	public static final int GAME_TYPE_MJ_WU_YUAN = 30036; // 婺源麻将
	public static final int GAME_TYPE_MJ_YUAN_JIANG = 30037; // 沅江麻将
	public static final int GAME_TYPE_MJ_HE_ZE = 30038; // 山东·菏泽麻将
	public static final int GAME_TYPE_XP_BOHU = 30039; // 溆浦博胡
	public static final int GAME_TYPE_KWX_SZ = 30040; // 随州卡五星
	public static final int GAME_TYPE_KWX_SY = 30041; // 十堰卡五星
	public static final int GAME_TYPE_KWX_YC = 30042; // 宜城卡五星
	public static final int GAME_TYPE_GHZ_YJ = 30043; // 沅江鬼胡子
	public static final int GAME_TYPE_MJ_ZHENG_ZHOU = 30044; // 郑州麻将
	public static final int GAME_TYPE_PK_TONG_CHENG = 30045; // 通城打滚
	public static final int GAME_TYPE_MJ_WAN_ZAI = 30046; // 宜春万载麻将
	public static final int GAME_TYPE_MJ_TIAO_TIAO = 30047; // 跳跳麻将
	public static final int GAME_TYPE_DDZ_KL = 30048;// 快乐斗地主
	public static final int GAME_TYPE_MJ_SX_HUA_SHUI = 30049; // 陕西滑水麻将
	public static final int GAME_TYPE_PK_DTZ = 30050; // 打筒子
	public static final int GAME_TYPE_MJ_DT_SHA_MA = 30051; // 洞庭沙麻
	public static final int GAME_TYPE_MJ_DT_HONG_ZHONG = 30052; // 洞庭红中
	public static final int GAME_TYPE_PHZ_LD_FANG_PAO_FA = 30053; // 娄底放炮罚
	public static final int GAME_TYPE_468_HONG_GUAI_WAN = 30054; // 468红拐弯
	public static final int GAME_TYPE_QIONG_LAI_HONG = 30055; // 邛崃烘
	public static final int GAME_TYPE_MJ_YI_YANG_QIN_YOU = 30056; // 益阳麻将亲友版
	public static final int GAME_TYPE_SHANG_RAO_DA_ZHA = 30057; // 上饶打炸
	public static final int GAME_TYPE_MJ_HUAI_HUA = 30058; // 怀化麻将
	public static final int GAME_TYPE_KWX_SZ_2D = 30059; // 随州卡五星
	public static final int GAME_TYPE_KWX_SY_2D = 30060; // 十堰卡五星
	public static final int GAME_TYPE_KWX_YC_2D = 30061; // 宜城卡五星
	public static final int GAME_TYPE_KWX_XG_2D = 30062; // 孝感卡五星
	public static final int GAME_TYPE_KWX_2D = 30063; // 襄阳卡五星
	public static final int GAME_TYPE_MJ_PJ_ZHA_NIAO = 30064; // 平江扎鸟
	public static final int GAME_TYPE_MJ_SHAN_XI_XIANG_NING = 30065; // 山西乡宁摔金

	public static final int GAME_TYPE_MJ_SX_LAN_XIAN = 30066; // 山西岚县麻将
	public static final int GAME_TYPE_MJ_NING_XIANG = 30067; // 宁乡麻将
	public static final int GAME_TYPE_MJ_YUYANG_HONGZHON = 30068; // 岳阳红中
	public static final int GAME_TYPE_PK_HES_PJ = 30069; // 浦江红二十
	public static final int GAME_TYPE_PK_HES_HY = 30070; // 汉源红二十
	public static final int GAME_TYPE_MJ_SX_KOU_DIAN = 30071; // 山西扣点麻将
	public static final int GAME_TYPE_HENAN_WU_ZHI = 30072; // 河南武陟麻将
	public static final int GAME_TYPE_DDZ_LPS2 = 30073;// 六盘水2人斗地主
	public static final int GAME_TYPE_DDZ_LPS3 = 30074;// 六盘水3人斗地主
	public static final int GAME_TYPE_GY_ZJ_NEW = 30075; // 新贵阳捉鸡
	public static final int GAME_TYPE_GY_EDG = 30076; // 贵阳捉鸡-二丁拐
	public static final int GAME_TYPE_GT_SDG = 30077; // 贵阳捉鸡-三丁拐
	public static final int GAME_TYPE_MJ_JING_DE_ZHEN = 30078; // 景德镇麻将
	public static final int GAME_TYPE_MJ_HONG_ZHONG_FEI = 30082; // 邵阳3D红中飞
	public static final int GAME_TYPE_MJ_PING_XIANG_ZZ = 30083; // 萍乡转转
	public static final int GAME_TYPE_MJ_HAI_NAN = 30084; // 海南麻将
	public static final int GAME_TYPE_MJ_SX_LOU_FAN = 30085; // 山西娄烦麻将
	public static final int GAME_TYPE_MJ_SX_NING_WU = 30086; // 山西宁武麻将
	public static final int GAME_TYPE_WSK_PC_ZD = 30087; // 蒲城炸弹
	public static final int GAME_TYPE_WSK_XQ_TH = 30088; // 松溪同花
	public static final int GAME_TYPE_LIN_FENG = 30089; // 临汾硬三组
	public static final int GAME_TYPE_MJ_SX = 30090; // // 松溪麻将
	public static final int GAME_TYPE_MJ_SXKDD = 30091; // 山西扣点点
	public static final int GAME_TYPE_WSK_DY_510K = 30092; // 大冶五十K
	public static final int GAME_TYPE_LF_YI_MEN_PAI = 30093; // 临汾一门牌
	public static final int GAME_TYPE_MJ_PU_CHENG = 30094;// 蒲城麻将
	public static final int GAME_TYPE_GUANG_AN = 30095; // 广安麻将
	public static final int GAME_TYPE_PDK_SXSD = 30096; // 陕西三代
	public static final int GAME_TYPE_LE_SHAN_YAO_JI = 30097; // 乐山幺鸡麻将
	public static final int GAME_TYPE_MJ_PING_XIANG_258 = 30098; // 萍乡258
	public static final int GAME_TYPE_KFZZ = 30099; // 开封郑州麻将
	public static final int GAME_TYPE_LU_ZHOU_GUI = 30100; // 泸州鬼麻将
	public static final int GAME_TYPE_MJ_PING_XIANG_HZ = 30101; // （萍乡）红中麻将
	public static final int GAME_TYPE_MJ_TDH_3D = 30102; // 推倒胡3D
	// 升级
	public static final int GAME_TYPE_XF_GD_FOUR = 31001; // 信丰挂挡四人
	public static final int GAME_TYPE_XF_GD_THREE = 31002; // 信丰挂挡三人
	public static final int GAME_TYPE_XP_240 = 31003; // 溆浦240
	public static final int GAME_TYPE_WZ_DD = 31004; // 万载倒段
	public static final int GAME_TYPE_CHQ_YDR = 31005; // 重启幺地人
	public static final int GAME_TYPE_MS_EQS = 31006; // 眉山二七十
	public static final int GAME_TYPE_YJ_EQS = 31007; // 荥经二七十
	public static final int GAME_TYPE_MJ_FJ_GUANG_ZE = 31008; // 福建光泽麻将
	public static final int GAME_TYPE_MJ_YING_JING = 31009; // 荥经麻将
	public static final int GAME_TYPE_MJ_ZHZJ = 31010; // 遵义捉鸡
	public static final int GAME_TYPE_MJ_SX_HDWP = 31011; // 山西洪洞王牌麻将
	public static final int GAME_TYPE_MJ_NEW_HN_ZHEN_ZHOU = 31012; // 河南郑州麻将
	public static final int GAME_TYPE_MJ_QUAN_ZHOU = 31013; // 泉州麻将
	public static final int GAME_TYPE_WSK_PING_XIANG_2 = 31014; // 萍乡2滚筒
	public static final int GAME_TYPE_WSK_PING_XIANG_3 = 31015; // 萍乡3滚筒
	public static final int GAME_TYPE_WSK_PING_XIANG_6 = 31016; // 萍乡6滚筒
	public static final int GAME_TYPE_MJ_NX_HUA_SHUI = 31017; // 宁夏滑水麻将
	public static final int GAME_TYPE_CP_YANZH = 31018; // 阎中长牌
	public static final int GAME_TYPE_MJ_DCWDH = 31019; // 都昌无档胡
	public static final int GAME_TYPE_DSS_MS = 31020; // 斗十四眉山
	public static final int GAME_TYPE_MJ_JIUJIANG_HZ = 31021; // 九江红中
	public static final int GAME_TYPE_MJ_JX_DUCHANG_ZB = 31022; // 江西都昌栽宝麻将
	public static final int GAME_TYPE_YZBP = 31023; // 永州包牌
	public static final int GAME_TYPE_MJ_XY = 31024; // 兴义麻将
	public static final int GAME_TYPE_LHQ_QD_SAPP = 31025; // 祁东六胡抢
	public static final int GAME_TYPE_MJ_NANCHANG = 31026; // 南昌麻将
	public static final int GAME_TYPE_PHZ_SY_DE = 31027; // 绥阳大贰
	public static final int GAME_TYPE_NEW_MJ_DLQH = 31028; // 大连穷胡麻将
	public static final int GAME_TYPE_MJ_HEYUAN_JD = 31029; // 河源鸡搭麻将
	public static final int GAME_TYPE_GZH_BZP = 31030; // 贵阳板子炮
	public static final int GAME_TYPE_WSK_NCST = 31031; // 南昌四团
	public static final int GAME_TYPE_XUE_LIU_CHENG_HE = 31032; // 血流成河
	public static final int GAME_TYPE_XIANG_YUAN = 31033; // 山西襄垣麻将
	public static final int GAME_TYPE_MJ_HN_HUAZHOU = 31034; // 河南滑州麻将
	public static final int GAME_TYPE_MJ_MJ_GY = 31035; // 麻友——贵阳捉鸡
	public static final int GAME_TYPE_MJ_MJ_GY_TWO = 31036; // 麻友——贵阳捉鸡 二丁拐
	public static final int GAME_TYPE_MJ_MJ_GY_THREE = 31037; // 麻友——贵阳捉鸡 三丁拐
	public static final int GAME_TYPE_MJ_YZ = 31038; // 永州麻将
	public static final int GAME_TYPE_MJ_HEYUAN_HD = 31039; // 河源惠搭麻将
	public static final int GAME_TYPE_SJ_YZ240 = 31040; // 永州240
	public static final int GAME_TYPE_MJ_CS_QY = 31041; // 亲友长沙麻将
	public static final int GAME_TYPE_MJ_GY_3 = 31042; // 贵阳捉鸡3
	public static final int GAME_TYPE_WSK_XTXZ = 31043; // 湘潭消造
	public static final int GAMR_TYPE_GY_TWO_3 = 31044; // 贵阳捉鸡二丁拐3
	public static final int GAMR_TYPE_GY_THREE_3 = 31045; // 贵阳捉鸡三丁拐3
	public static final int GAME_TYPE_MJ_HLKDD = 31046; // 欢乐扣点点
	public static final int GAME_TYPE_MJ_ZHUZHOU_WANG = 31047; // 株洲王麻将
	public static final int GAMR_TYPE_MJ_GY_TRZJ = 31048; // 铜仁贵阳捉鸡
	public static final int GAMR_TYPE_ZD_NCGZ = 31049; // 南昌过炸
	public static final int GAME_TYPE_MJ_ZPTDH = 31050; // 做牌推倒胡
	public static final int GAMR_TYPE_MJ_LX_QY_CS = 31051; // 临湘亲友长沙
	public static final int GAME_TYPE_YL_PHZ = 31052; // 沅陵跑胡子
	public static final int GAME_TYPE_NC_EQW = 31053; // 南昌二七王
	public static final int GAME_TYPE_HL_XUE_LIU = 31054; // 欢乐血流麻将
	public static final int GAME_TYPE_PK_YJQF = 31055; // 沅江千分
	public static final int GAME_TYPE_MJ_YAAN = 31056; // 雅安麻将
	public static final int GAME_TYPE_GY_ZJ_NEW_3D = 31057;// 微乐贵阳捉鸡3D版
	public static final int GAME_TYPE_GY_EDG_3D = 31058;// 微乐贵阳捉鸡3D版
	public static final int GAME_TYPE_GY_SDG_3D = 31059;// 微乐贵阳捉鸡3D版
	public static final int GAME_TYPE_MJ_ZH_QIANG_HU = 31060;// 庄河穷胡
	public static final int GAME_TPPE_MJ_AS = 31061; // 安顺麻将
	public static final int GAME_TYPE_AN_YANG_ZZ = 31062; // 安阳郑州麻将
	public static final int GAME_TYPE_ZJK_HZ = 31063; // 张家口红中麻将
	public static final int GAME_TYPE_GX_BEI_HAI = 31064; // 广西北海麻将
	public static final int GAME_TYPE_MJ_NINGXIANG_KAI_WANG = 31065; // 宁乡开王麻将
	public static final int GAME_TYPE_MJ_XING_TAI = 31066; // 河北邢台麻将
	public static final int GAME_TYPE_MJ_ZHANG_ZHOU = 31067; // 漳州麻将
	public static final int GAME_TYPE_MJ_SY = 31068; // 绥阳麻将
	public static final int GAME_TYPE_MJ_DLTDH = 31069; // 大连推倒胡
	public static final int GAME_TYPE_WSK_HRDZD = 31070; // 华容打炸弹
	public static final int GAME_TYPE_LD_SDH = 31071; // 娄底三打哈
	public static final int GAME_TYPE_XP_BF = 31072; // 溆浦包分
	public static final int GAME_TYPE_WSK_HCNG = 31073; // 河池牛鬼
	public static final int GAME_TYPE_MJ_MEN_HU_XUE_LIU = 31074; // 贵阳 闷胡血流
	public static final int GAME_TYPE_MJ_NEW_3D_XYKWX = 31075; // 新襄阳3D卡五星
	public static final int GAME_TYPE_MJ_NEW_3D_XGKWX = 31076; // 新孝感3D卡五星
	public static final int GAME_TYPE_WSK_YUGAN = 31077; // 余干五十K
	public static final int GAME_TYPE_MJ_LF = 31078; // 两房麻将
	public static final int GAME_TYPE_JX_TUIDAOHU = 31079;// 江西推倒胡
	public static final int GAME_TYPE_JX_YUGANGFEIBAO = 31080;// 余干飞宝
	public static final int GAME_TYPE_HN_FAN_JIN = 31081; // 湖南 翻金麻将
	public static final int GAMR_TYPE_NCWL = 31082; // 南昌窝龙
	public static final int GAMR_TYPE_ZD_FCGZ = 31083; // 丰城过炸
	public static final int GAME_TYPE_PHZ_XINHUA = 31084; // 新化跑胡子
	public static final int GAME_TYPE_DENG_ZHOU_19_ZHANG = 31085; // 邓州十九张
	public static final int GAME_TYPE_MJ_ZHANG_PU = 31086; // 漳浦麻将
	public static final int GAME_TYPE_MJ_TC_NEW = 31087; // 通城麻将新
	public static final int GAME_TYPE_MJ_THGJ = 31088; // 泰和滚精
	public static final int GAME_TYPE_MJ_FC = 31089; // 丰城麻将
	public static final int GAME_TYPE_MJ_ZJ = 31090; // 织金麻将
	public static final int GAME_TYPE_MJ_YGJZ = 31091; // 余干夹子麻将
	public static final int GAME_TYPE_WSK_FCSJ = 31092; // 丰城双剑
	public static final int GAMR_TYPE_ZD_THGZ = 31093; // 泰和过炸
	public static final int GAMR_TYPE_MJ_FCHZ = 31094; // 丰城红中
	public static final int GAME_TYPE_PDS_ZHENG_ZHOU = 31095; // 平顶山郑州麻将
	public static final int GAME_TYPE_PHZ_GUILIN_ZP_F = 31096; // 桂林字牌4人玩法
	public static final int GAME_TYPE_MJ_GLZZ = 31097; // 桂林转转
	public static final int GAME_TYPE_MJ_NEW_XIAN_NING = 31098; // 新咸宁麻将
	public static final int GAME_TYPE_WSK_XYSK = 31099; // 闲逸双扣
	public static final int GAME_TYPE_BAO_DING_BA_ZHANG = 31100; // 保定八张
	public static final int GAME_TYPE_MJ_SHUN_PING = 31101; // 顺平麻将

	// 通用斗牛，GAME_GYPE索引占位，一个通用类型100个位置，一共10种，站位1000个
	// 房主上庄
	public static final int GAME_TYPE_U_BULL_BEGIN_FANG_ZHU = 201401;
	public static final int GAME_TYPE_U_BULL_END_FANG_ZHU = 201500;
	// 牛牛上庄
	public static final int GAME_TYPE_U_BULL_BEGIN_NIU_NIU = 201501;
	public static final int GAME_TYPE_U_BULL_END_NIU_NIU = 201600;
	// 轮流上庄
	public static final int GAME_TYPE_U_BULL_BEGIN_LUN_LIU = 201601;
	public static final int GAME_TYPE_U_BULL_END_LUN_LIU = 201700;
	// 自由抢庄
	public static final int GAME_TYPE_U_BULL_BEGIN_ZI_YOU = 201701;
	public static final int GAME_TYPE_U_BULL_END_ZI_YOU = 201800;
	// 明三张抢庄
	public static final int GAME_TYPE_U_BULL_BEGIN_MING_SAN = 201801;
	public static final int GAME_TYPE_U_BULL_END_MING_SAN = 201900;
	// 看四张抢庄
	public static final int GAME_TYPE_U_BULL_BEGIN_KAN_SI = 201901;
	public static final int GAME_TYPE_U_BULL_END_KAN_SI = 202000;
	// 通比牛牛
	public static final int GAME_TYPE_U_BULL_BEGIN_TONG_BI = 202001;
	public static final int GAME_TYPE_U_BULL_END_TONG_BI = 202100;
	// 斗板牛
	public static final int GAME_TYPE_U_BULL_BEGIN_DOU_BAN = 202101;
	public static final int GAME_TYPE_U_BULL_END_DOU_BAN = 202200;
	// 疯狂牛牛
	public static final int GAME_TYPE_U_BULL_BEGIN_FENG_KUANG = 202201;
	public static final int GAME_TYPE_U_BULL_END_FENG_KUANG = 202300;
	// 暗三张抢庄
	public static final int GAME_TYPE_U_BULL_BEGIN_AN_SAN = 202301;
	public static final int GAME_TYPE_U_BULL_END_AN_SAN = 202400;
	// 八人玩法
	public static final int GAME_TYPE_U_BULL_BEGIN_BA_REN = 202501;
	public static final int GAME_TYPE_U_BULL_END_BA_REN = 202600;

	public static final int MAX_CHI_HU_TYPE = 30;

	public static final int DELAY_SEND_CARD_DELAY = 0;
	public static final int DELAY_ADD_CARD_DELAY = 250;
	public static final int DELAY_AUTO_OUT_CARD = 260;
	public static final int DELAY_JIAN_PAO_HU = 260;
	public static final int DELAY_JIAN_PAO_HU_NEW = 1000; // 新的见炮胡的延时
	public static final int DELAY_AUTO_GUO = 260;

	public static final int XIAO_HU_DELAY = 5;
	public static final int GAME_FINISH_DELAY = 2;
	public static final int GANG_CARD_CS_DELAY = 1200;
	public static final int GANG_LAST_CARD_DELAY = 1000;
	public static final int DELAY_CARD_OUT = 450;
	public static final int GAME_FINISH_DELAY_FLS = 1;
	public static final int DELAY_AUTO_OUT_CARD_TRUTESS = 1000;

	// 玩家的状态
	public static final int Player_Status_NULL = 0; // 没有状态
	public static final int Player_Status_OUT_CARD = 1; // 等待出牌
	public static final int Player_Status_OPR_CARD = 2; // 等待操作牌
	public static final int Player_Status_OPR_OUT_CARD = 3;
	public static final int Player_Status_WAITTING_TURN = 4;
	public static final int Player_Status_WAITTING_GANG_CARD = 5;// 杠后等摸牌
	public static final int Player_Status_GANG_CARD = 6;// 杠后不能换章
	public static final int Player_Status_TRUTESS = 7;// 托管状态
	public static final int Player_Status_OPR_OR_OUT_CARD = 8; // 可操作也可出牌的一种特殊状态
	public static final int PLAYER_STAUTS_CHI_PENG_CHU_PAI = 9; // 吃碰之后出牌
	public static final int Player_Status_Gang_Hu_Pai = 10; // 特殊的，杠上花抓的牌是王牌是，胡牌时，不能点过
	public static final int Player_Status_Bao_Hu = 11;// 报胡状态

	// 游戏状态
	public static final int GAME_STATUS_FREE = 0; // 空闲状态
	public static final int GAME_STATUS_PLAY = 100; // 游戏状态
	public static final int GAME_STATUS_WAIT = 200; // 等待状态

	// 游戏状态
	public static final int GS_MJ_FREE = GAME_STATUS_FREE; // 空闲状态
	public static final int GS_MJ_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_MJ_XIAOHU = GAME_STATUS_PLAY + 2; // 小胡状态
	public static final int GS_MJ_PAO_QIANG = GAME_STATUS_PLAY + 3; // 跑呛状态
	public static final int GS_MJ_PAO = GAME_STATUS_PLAY + 4; // 跑状态
	public static final int GS_MJ_PIAO = GAME_STATUS_PLAY + 5; // 福禄寿飘状态
	public static final int GS_MJ_XIPAI = GAME_STATUS_PLAY + 6; // 福禄寿洗牌状态
	public static final int GS_MJ_NAO = GAME_STATUS_PLAY + 7; // 闹状态
	public static final int GS_MJ_PAO_KOU = GAME_STATUS_PLAY + 8; // 跑扣的状态
	public static final int GS_CALL_BANKER = GAME_STATUS_PLAY + 9; // 叫地主状态
	public static final int GS_MJ_BIAOYAN = GAME_STATUS_PLAY + 10; // 表演状态
	public static final int GS_DDZ_ADD_TIMES = GAME_STATUS_PLAY + 11; // 加倍状态
	public static final int GS_MJ_WAIT_GU_CHOU = GAME_STATUS_PLAY + 12; // 加倍状态
	public static final int GS_MJ_DING_QUE = GAME_STATUS_PLAY + 13; // 四川麻将，定缺
	public static final int GS_MJ_SWITCH_CARD = GAME_STATUS_PLAY + 14; // 四川麻将，换三张
	public static final int GS_MJ_CHU_ZI = GAME_STATUS_PLAY + 15; // 孝感麻将，出子
	public static final int GS_MJ_YAO_TOU_ZI = GAME_STATUS_PLAY + 16; // 摇骰子
	public static final int GS_MJ_QIE_PAI = GAME_STATUS_PLAY + 17; // 切牌
	public static final int GS_DDZ_ADD_TIMES_AGAIN = GAME_STATUS_PLAY + 18; // 再次加倍状态
	public static final int GS_MJ_BAO_TING = GAME_STATUS_PLAY + 19; // 报听状态
	public static final int GS_RAND_BANKER = GAME_STATUS_PLAY + 20;// 随机庄

	public static final int GS_ABZ_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,A包子
	public static final int GS_ABZ_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态,A包子
	public static final int GS_ABZ_CHANGE_CARD = GAME_STATUS_PLAY + 3; // 换牌状态,A包子

	//
	public static final int GS_GFWSK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,广丰510K
	public static final int GS_GFWSK_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态,广丰510K
	public static final int GS_GFWSK_LIANG_PAI = GAME_STATUS_PLAY + 3; // 亮牌状态,广丰510K
	public static final int GS_GFWSK_TOU_XIANG = GAME_STATUS_PLAY + 4; // 游戏状态,广丰510K

	public static final int GS_PCWSK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,浦城炸弹
	public static final int GS_PCWSK_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态,浦城炸弹
	public static final int GS_PCWSK_LIANG_PAI = GAME_STATUS_PLAY + 3; // 亮牌状态,浦城炸弹
	// 通城打滚
	public static final int GS_TC_WSK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_TC_WSK_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态
	public static final int GS_TC_WSK_LIANG_PAI = GAME_STATUS_PLAY + 3; // 亮牌状态
	public static final int GS_TC_WSK_PIAO = GAME_STATUS_PLAY + 4; // 飘分状态

	// 信丰挂挡
	public static final int GS_XFGD_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,信丰挂挡
	public static final int GS_XFGD_SEND_CARD = GAME_STATUS_PLAY + 2;
	public static final int GS_XFGD_CALL_BANKER = GAME_STATUS_PLAY + 3;
	public static final int GS_XFGD_DING_ZHU = GAME_STATUS_PLAY + 4;
	public static final int GS_XFGD_MAI_DI = GAME_STATUS_PLAY + 5;

	// 吕梁打七
	public static final int GS_LLDQ_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,吕梁打七
	public static final int GS_LLDQ_SEND_CARD = GAME_STATUS_PLAY + 2;
	public static final int GS_LLDQ_CALL_BANKER = GAME_STATUS_PLAY + 3;
	public static final int GS_LLDQ_MAI_DI = GAME_STATUS_PLAY + 4;
	public static final int GS_LLDQ_MAI_DI_WAIT = GAME_STATUS_PLAY + 5;// 等待拿底牌

	// 六盘水斗地主
	public static final int GS_LPS3_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_LPS3_FEN_LUO = GAME_STATUS_PLAY + 2; // 分摞状态
	public static final int GS_LPS3_CALL_BANKER = GAME_STATUS_PLAY + 3;// 定庄状态
	public static final int GS_LPS3_ADD_TIMES = GAME_STATUS_PLAY + 4;// 加倍状态
	public static final int GS_LPS3_SWAP_CARD = GAME_STATUS_PLAY + 5;// 换三张状态
	public static final int GS_LPS3_RANG_PAI = GAME_STATUS_PLAY + 6;// 让牌状态

	// 跑得快
	public static final int GS_MJ_PAO_PDK = GAME_STATUS_PLAY + 2; // 飘分状态

	// 信丰挂挡
	public static final int GS_WZDD_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,信丰挂挡
	public static final int GS_WZDD_SEND_CARD = GAME_STATUS_PLAY + 2;
	public static final int GS_WZDD_CALL_BANKER = GAME_STATUS_PLAY + 3;
	public static final int GS_WZDD_DING_ZHU = GAME_STATUS_PLAY + 4;
	public static final int GS_WZDD_MAI_DI = GAME_STATUS_PLAY + 5;
	// 松溪同花
	public static final int GS_SXTH_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,信丰挂挡
	public static final int GS_SXTH_SEND_CARD = GAME_STATUS_PLAY + 2;
	public static final int GS_SXTH_TOU_XIANG = GAME_STATUS_PLAY + 3;

	// 南平跑得快
	// 信丰挂挡
	public static final int GS_NPPDK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态,南平跑得快
	public static final int GS_NPPDK_PIAO = GAME_STATUS_PLAY + 2;
	public static final int GS_NPPDK_CALL = GAME_STATUS_PLAY + 3;
	public static final int GS_NPPDK_MING = GAME_STATUS_PLAY + 4;
	// 黑桃3
	public static final int GS_HTS_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_HTS_SEND_CARD = GAME_STATUS_PLAY + 2;// 发牌
	public static final int GS_HTS_CHENG_BAO = GAME_STATUS_PLAY + 3;// 承包

	// 贵州板子炮
	public static final int GS_GZH_BZP_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_GZH_BZP_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态
	public static final int GS_GZH_BZP_LIANG_PAI = GAME_STATUS_PLAY + 3; // 亮牌状态
	public static final int GS_GZH_BZP_PIAO = GAME_STATUS_PLAY + 4; // 飘分状态

	// 湘潭消造
	public static final int GS_XTXZ_WSK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_XTXZ_WSK_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态
	public static final int GS_XTXZ_WSK_LIANG_PAI = GAME_STATUS_PLAY + 3; // 亮牌状态
	public static final int GS_XTXZ_WSK_BIAOTAI = GAME_STATUS_PLAY + 4; // 表态状态

	// 沅江千分
	public static final int GS_YJQF_WSK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_YJQF_WSK_QIPAI = GAME_STATUS_PLAY + 2; // 切牌状态

	// 华容打炸弹
	public static final int GS_HRDZ_WSK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_HRDZ_WSK_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态
	public static final int GS_HRDZ_WSK_LIANG_PAI = GAME_STATUS_PLAY + 3; // 亮牌状态

	// 丰城双剑
	public static final int GS_FCSJ_WSK_PLAY = GAME_STATUS_PLAY + 1; // 游戏状态
	public static final int GS_FCSJ_WSK_CALLBANKER = GAME_STATUS_PLAY + 2; // 叫庄状态
	public static final int GS_FCSJ_WSK_LIANG_PAI = GAME_STATUS_PLAY + 3; // 亮牌状态
	public static final int GS_FCSJ_WSK_MING_PAI = GAME_STATUS_PLAY + 4; // 明牌状态

	public static final int GS_MJ_WAIT = GAME_STATUS_WAIT; // 等待状态

	// public static final int GS_MJ_CS_GANG= GAME_STATUS_PLAY+4; //长沙麻将杠

	public static final int CELL_SCORE = 1; // 基础单位分数

	public static final int HZ_MAGIC_CARD = 0x35; // 红中癞子

	public static final int GAME_PLAYER = 4; // 游戏人数
	public static final int GAME_PLAYER_HH = 3; // 红黑胡人数据 岳阳抓虾子
	public static final int GAME_PLAYER_FPHZ = 4; // 4人跑胡子
	public static final int GAME_PLAYER_FIVE = 5;
	public static final int GAME_PLAYER_SIX = 6;

	public static final int MAX_ZI = 27;// 34;//最大索引
	public static final int MAX_FENG = 31;// 31;//带风牌最大索引
	public static final int MAX_ZI_FENG = 34;// 34;//带风带中发白最大索引
	public static final int MAX_INDEX = 42;// 34;//最大索引
	public static final int MAX_COUNT = 14; // 最大数目 手牌
	public static final int MAX_COUNT_DENG_ZHOU = 20; // 邓州十九张
	public static final int MAX_WEAVE = 4; // 最大组合
	public static final int MAX_WEAVE_DENG_ZHOU = 7; // 邓州十九张
	public static final int MAX_WEAVE_LAOPAI = 5; // 最大组合
	public static final int MAX_INDEX_LAOPAI = 30;// 34;//最大索引
	public static final int MAX_ZI_LAOPAI = 27;// 34;//最大索引
	public static final int MAX_FENG_LAOPAI = 30;// 31;//带风牌最大索引

	public static final int MAX_DISCARD_CARDS = 70;// 70 废牌堆最大长度

	public static final int MAX_ABANDONED_CARDS_COUNT = 12; // 本圈最大能漏胡的牌12张，因为每人最多能碰4碰

	public static final int MAX_FLS_INDEX = 24;//// 最大索引(福禄寿)
	public static final int MAX_FLS_COUNT = 20; // 最大数目 手牌(福禄寿)
	public static final int MIN_SCORE_FLS = 11; // 福禄寿最低胡牌分数
	public static final int MAX_WEAVE_FLS = 6; // 最大组合

	public static final int MAX_FLS_INDEX_DP = 32;//// 最大索引(福禄寿-带混)

	public static final int MAX_ZP_INDEX = 20; // 最大索引数据（湘阴字牌）
	public static final int MAX_ZP_COUNT = 14; // 最大数目手牌（字牌）
	public static final int MAX_WEAVE_ZP = 4; // 最大组合

	public static final int MAX_HH_INDEX = 20; // 最大索引数据（攸县红黑胡）
	public static final int MAX_HH_COUNT = 21; // 最大数目手牌（字牌）
	public static final int MAX_YONG_ZHOU_HH_COUNT = 30; // 最大数目手牌--永州扯胡子
	public static final int MAX_WEAVE_HH = 7; // 最大组合
	public static final int MAX_FPHZ_INDEX = 14; // 最大索引数据（攸县红黑胡）
	public static final int MAX_FPHZ_COUNT = 15; // 最大数目手牌（字牌）
	public static final int MAX_WEAVE_FPHZ = 5; // 最大组合
	public static final int MAX_WMQ_COUNT = 20; // 最大数目手牌
	public static final int MAX_YYWHZ_COUNT = 20; // 最大数目手牌
	public static final int MAX_GXZP_COUNT = 22;// 最大数目手牌，可能加 补张
	public static final int MAX_WEAVE_HH_XP = 10; // 最大组合
	public static final int WMQ_SEND_CARD = 0x1000; // 发的牌
	public static final int WMQ_OUT_CARD = 0x2000; // 出的牌

	public static final int MAX_LAOPAI_COUNT = 17; // 最大数目 手牌
	//////////////////////////////////////////////////////////////////////////// 个子牌
	public static final int GZP_MAX_INDEX = 27; // 最大索引数据
	public static final int GZP_MAX_COUNT = 24; // 最大数目手牌
	public static final int GZP_MAX_WEAVE = 7; // 最大组合
	public static final int GZP_MAX_HU_WEAVE = 10; // 最大组合
	public static final int GZP_CARD_COUNT = 110; // 牌张数
	public static final int GZP_MAX_LOGIC_INDEX = 22; // 解析最大逻索引
	/////////////////////////////////////////////////////////////////////////// 麻将牌数量
	public static final int CARD_COUNT_HU_NAN = 108; // 湖南麻将
	public static final int CARD_COUNT_HZ = 112; // 红中麻将

	public static final int CARD_COUNT_HE_NAN_ZHOU_KOU = 108;
	public static final int CARD_COUNT_HE_NAN_ZHOU_KOU_HONG_ZHONG_LAI_ZI = 112;
	public static final int CARD_COUNT_HE_NAN_ZHOU_KOU_DAI_FENG = 136;

	public static final int CARD_COUNT_DAI_FENG_AY = 137; // 安阳带风麻将数量--多张花牌
	public static final int CARD_COUNT_BU_DAI_FENG_AY = 109; // 安阳不带风麻将数量--多张花牌

	public static final int CARD_COUNT_DAI_FENG_LZ = 136; // 安阳带风麻将数量
	public static final int CARD_COUNT_BU_DAI_FENG_LZ = 108; // 安阳不带风麻将数量

	public static final int CARD_COUNT_DAI_FENG_SY = 136; // 邵阳带风麻将数量
	public static final int CARD_COUNT_BU_DAI_FENG_SY = 108; // 邵阳不带风麻将数量

	public static final int CARD_COUNT_XY = 136; // 信阳麻将

	public static final int CARD_COUNT_DAI_FENG_SMX = 136; // 三门峡带风麻将数量
	public static final int CARD_COUNT_BU_DAI_FENG_SMX = 108; // 三门峡不带风麻将数量

	public static final int CARD_COUNT_DAI_FENG_HNHZ = 136; // 河南红中带风麻将数量
	public static final int CARD_COUNT_BU_DAI_FENG_HNHZ = 112; // 河南红中不带风麻将数量

	public static final int CARD_COUNT_JIANGSU_ZZ = 136; // 江苏镇江麻将数量

	public static final int CARD_COUNT_DAI_FENG_PY = 136; // 濮阳带风麻将数量
	public static final int CARD_COUNT_BU_DAI_FENG_PY = 108; // 濮阳不带风麻将数量

	public static final int CARD_COUNT_XUPU_DAIFENG = 120; // 溆浦老牌带风数量
	public static final int CARD_COUNT_XUPU = 108; // 溆浦老牌带风数量

	public static final int CARD_FENG_COUNT = 7; // 麻将风牌数量
	public static final int CARD_HUA_COUNT = 8; // 麻将花牌数量

	public static final int MAX_CARD_COUNT = 168; // 麻将最大数量

	public static final int CARD_COUNT_FLS_LX = 96; // 临湘福禄寿

	public static final int CARD_COUNT_FLS_LX_DP = 104; // 临湘福禄寿-混

	public static final int CARD_COUNT_ZP_XY = 80; // 湘阴字牌

	public static final int CARD_COUNT_HH_YX = 80; // 攸县红黑胡

	public static final int CARD_COUNT_PHZ_HS = 80; // 汉寿跑胡子

	public static final int CARD_COUNT_PDK_JD = 48; // 跑得快经典
	public static final int CARD_COUNT_PDK_FIFTEEN = 45; // 跑得快15张
	public static final int CARD_COUNT_PDK_SR_ONE = 52; // 跑得快4人一副牌
	public static final int CARD_COUNT_PDK_SR_TWO = 108;// 跑得快4人两副牌
	public static final int CARD_COUNT_PDK_SR_SC = 40; // 四川跑得快三人四人
	public static final int CARD_COUNT_PDK_SR_SC_ER = 30; // 四川跑得快二人
	///////////////////////////////////////////////////////////////////////////////// 长牌
	public static final int CP_WIK_NULL = 0x00; // 没有类型
	public static final int CP_WIK_LEFT = 0x01; // 左吃类型
	public static final int CP_WIK_CENTER = 0x02; // 中吃类型
	public static final int CP_WIK_RIGHT = 0x04; // 右吃类型
	public static final int CP_WIK_CHE = 0x08; // 扯类型

	public static final int CP_WIK_HUA = 0x10; // 内滑
	public static final int CP_WIK_LONG = 0x20; // 龙
	public static final int CP_WIK_CHI_HU = 0x40; // 吃胡
	public static final int CP_WIK_ZI_MO = 0x80; // 自摸
	public static final int CP_WIK_KAN = 0x100; // 坎
	public static final int CP_WIK_ZHAO = 0x200;// 召
	public static final int CP_WIK_TOU = 0x400; // 偷
	public static final int CP_WIK_DH_ONE = 0x800; // 丁斧
	public static final int CP_WIK_DH_TWO = 0x1000; // 丁斧
	public static final int CP_WIK_DH_THREE = 0x2000; // 丁斧
	public static final int CP_WIK_DH_FOUR = 0x4000; // 丁斧
	public static final int CP_WIK_PENG = 0x8000; // 碰
	public static final int CP_WIK_DUI = 0x10000; // 成对

	///////////////////////////////////////////////////////////////////////////////// 长牌斗十四
	public static final int DSS_WIK_NULL = 0x00; // 没有类型
	public static final int DSS_WIK_LEFT = 0x01; // 左吃类型
	public static final int DSS_WIK_CENTER = 0x02; // 中吃类型
	public static final int DSS_WIK_RIGHT = 0x04; // 右吃类型
	public static final int DSS_WIK_PENG = 0x08; // 碰
	public static final int DSS_WIK_CHI_HU = 0x40; // 吃胡
	public static final int DSS_WIK_ZI_MO = 0x80; // 自摸
	public static final int DSS_WIK_DH_ONE = 0x100; // 丁斧
	public static final int DSS_WIK_DH_TWO = 0x200; // 丁斧
	public static final int DSS_WIK_DH_THREE = 0x400; // 丁斧
	public static final int DSS_WIK_DH_FOUR = 0x800; // 丁斧
	public static final int DSS_WIK_BAO_TING = 0x1000; // 报听
	public static final int DSS_WIK_PIAO = 0x2000;// 飘分
	public static final int DSS_WIK_TOU = 0x4000; // 偷
	public static final int DSS_WIK_WUCHENG = 0x8000; // 无成

	///////////////////////////////////////////////////////////////////////////////// 长牌打抓
	public static final int DZ_WIK_NULL = 0x00; // 没有类型

	public static final int DZ_WIK_DUI_LEFT = 0x01; // 左对吃类型 自己有一对 吃一张 BB A
	public static final int DZ_WIK_DUI_CENTER = 0x02; // 中吃对吃类型
	public static final int DZ_WIK_DUI_RIGHT = 0x04; // 右吃对吃类型
	public static final int DZ_WIK_SINGLE_LEFT = 0x08; // 左吃单类型
														// 自己只有一张，吃一对(吃的牌是一对，
														// 一张自已，一张桌上的）BA A
	public static final int DZ_WIK_SINGLE_CENTER = 0x10; // 中吃单类型
	public static final int DZ_WIK_SINGLE_RIGHT = 0x20; // 右吃单类型
	public static final int DZ_WIK_CHI_HU = 0x40; // 吃胡
	public static final int DZ_WIK_ZI_MO = 0x80; // 自摸
	public static final int DZ_WIK_PENG = 0x100; // 碰
	public static final int DZ_WIK_SHA_QIANG = 0x200; // 杀抢
	public static final int DZ_WIK_SHA = 0x400; // 杀
	public static final int DZ_WIK_TU_HUO = 0x800; // 吐火
	public static final int DZ_WIK_MTU_HUO = 0x1000; // 明吐火
	public static final int DZ_WIK_TUX_HUO = 0x2000; // 吐火响
	public static final int DZ_WIK_QI = 0x4000; // 起
	public static final int DZ_WIK_YANG = 0x8000; // 仰
	public static final int DZ_WIK_OTHER = 0x10000;// 吃牌所有的都不一样
	public static final int DZ_BAO_ZI = 0x20000; // 包子
	public static final int DZ_NO_PENG_TO_KAN = 0x40000;// 末碰成坎
	public static final int DZ_NOW_PENG_TO_PENG = 0x80000;// 现过过碰

	public static final int CARD_KIND_DDZ = 15; // 斗地主牌种类
	public static final int CARD_COUNT_DDZ_JD = 54; // 斗地主
	public static final int CARD_COUNT_DDZ_JX = 53; // 斗地主
	public static final int CARD_COUNT_DDZ_ER = 46; // 二人斗地主
	public static final int CARD_COUNT_PHZ_YYWHZ = 80; // 岳阳歪胡子
	public static final int CARD_COUNT_SDH = 92; // 三打哈
	public static final int MAX_RIGHT_COUNT = 1;// 最大权位DWORD个数
	public static final int CARD_COUNT_WSK = 108; // 510K排数
	public static final int CARD_COUNT_GDY = 54; // 干瞪眼
	public static final int CARD_COUNT_DBD = 53; // 斗板凳
	public static final int CARD_COUNT_SXTH = 164; // 松溪同花
	//////////////////////////////////////////////////// 浦城炸弹
	public static final int CARD_COUNT_WSK_PC = 108; // 510K排数
	public static final int CARD_COUNT_WSK_PC_NO_W = 104; // 510K排数
	public static final int CARD_COUNT_WSK_PC_MAX = 8; // 每一种牌最多有多少张
	// 数值掩码
	public static final int LOGIC_MASK_COLOR = 0xF0; // 花色掩码
	public static final int LOGIC_MASK_VALUE = 0x0F; // 数值掩码
	public static final int LOGIC_MASK_FLOWER = 0xF00; // 是否是花牌
	public static final int LOGIC_MASK = 0xFF; // 掩码

	public static final int MAX_NIAO_CARD = 10; // 最大中鸟数
	// 湖北麻将，癞子痞子杠，数量设置成16
	public static final int MAX_LAI_ZI_PI_ZI_GANG = 16;

	public static final int CARD_COUNT_LEFT_HUANGZHUANG = 14; // 河南麻将剩余牌荒张

	///////////////////////////////////////////////////////////////////////////////// 个子牌标示
	public static final int GZP_WIK_NULL = 0x00; // 没有类型
	public static final int GZP_WIK_LEFT = 0x01; // 左吃类型
	public static final int GZP_WIK_CETNER = 0x02; // 中吃类型
	public static final int GZP_WIK_RIGHT = 0x04; // 右吃类型
	public static final int GZP_WIK_PICKUP = 0x08; // 捡牌操作
	public static final int GZP_WIK_PENG = 0x10; // 碰牌类型
	public static final int GZP_WIK_ZHAO = 0x20; // 招牌类型
	public static final int GZP_WIK_CHI_HU = 0x40; // 吃胡类型
	public static final int GZP_WIK_ZI_MO = 0x80; // 自摸
	public static final int GZP_WIK_BU_ZHNAG = 0x100; // 补张
	public static final int GZP_WIK_KAN = 0x200; // 坎
	public static final int GZP_WIK_HUA = 0x400; // 滑
	public static final int GZP_WIK_GUAN = 0x800; // 观生
	public static final int GZP_WIK_JIAN = 0x1000;// 捡
	public static final int GZP_WIK_BAN_JIU = 0x2000;// 半句
	public static final int GZP_WIK_DUI_ZI = 0x4000; // 对子
	public static final int GZP_WIK_YI_JU_HUA = 0x8000; // 一句话

	///////////////////////////////////////////////////////////////////////////////// 操作标示
	// 动作标志
	public static final int WIK_NULL = 0x00; // 没有类型
	public static final int WIK_LEFT = 0x01; // 左吃类型
	public static final int WIK_CENTER = 0x02; // 中吃类型
	public static final int WIK_RIGHT = 0x04; // 右吃类型
	public static final int WIK_PENG = 0x08; // 碰牌类型
	public static final int WIK_GANG = 0x10; // 杠牌类型
	public static final int WIK_XIAO_HU = 0x20;// 小胡 //吃牌类型
	public static final int WIK_CHI_HU = 0x40; // 吃胡类型
	public static final int WIK_ZI_MO = 0x80; // 自摸
	public static final int WIK_FENG_CHI = 0x100; // 风吃、风成句
	public static final int WIK_BU_ZHNAG = 0x100; // 补张
	public static final int WIK_YAO_HAI_DI = 0x200; // 要海底
	public static final int WIK_SI_DUI = 0x200; // 四对
	public static final int WIK_XIA_ZI_BU = 0x201; // 虾子牌
	public static final int WIK_YAO_JIU = 0x400; // 幺九
	public static final int WIK_HUANG_SHENG = 0x400; // 换神
	public static final int WIK_ZI_MO_SPCE = 0x400; // 汉寿王麻将，特殊的胡按钮（只有胡按钮，没有过按钮）
	public static final int WIK_LIANG = 0x400; // 卡五星，亮操作，复用0x400
	public static final int WIK_NO_WIN = 0x400; // 没胡到
	public static final int WIK_HAI_DI = 0x400; // 海底
	public static final int WIK_BAO_QING_HU = 0x400; // 幺筒断勾卡 报请胡
	public static final int WIK_TIAO = 0x400; // 挑
	public static final int WIK_QIANG_GANG_HU_ND = 0x4000; // 宁都麻将抢杠胡

	// 永州扯胡子
	public static final int WIK_WANG_ZHA = 0x1000; // 王炸
	public static final int WIK_WANG_CHUANG = 0x2000; // 王闯
	public static final int WIK_WANG_DIAO = 0x4000; // 王钓

	public static final int WIK_CHI_TING_LEFT = 0x401; // 左吃听类型
	public static final int WIK_CHI_TING_CENTER = 0x402; // 中吃听类型
	public static final int WIK_CHI_TING_RIGHT = 0x404; // 右吃听类型
	public static final int WIK_PENG_TING = 0x408; // 碰听类型

	// 吉县1928夹
	public static final int WIK_PENG_CENTER_FIVE = 0x1000; // 中心五-坎
	public static final int WIK_CHI_CENTER_FIVE = 0x2000; // 中心五-吃
	public static final int WIK_ONE_NINE_MIX = 0x4000; // 19夹
	public static final int WIK_TWO_EIGHT_MIX = 0x8000; // 28夹

	public static final int WIK_ZI_MO_SL = 0x100; // 碰胡双龙
	public static final int WIK_ZI_MO_QXD = 0x200; // 七小对
	public static final int WIK_ZI_MO_WH = 0x400; // 五福
	public static final int WIK_FENG_GANG = 0x400; // 风杠
	// 湖北子游戏，暗杠
	public static final int WIK_AN_GANG_HB = 0x100;
	// 湖北子游戏，明杠/接杠
	public static final int WIK_JIE_GANG_HB = 0x200;
	// 湖北子游戏，碰杠/续杠/回头杠
	public static final int WIK_ADD_GANG_HB = 0x800;
	// 黄石麻将，亮中发白
	public static final int WIK_SHOW_CARD = 0x00000400;
	// 锁吃，左吃，一个癞子参与，出的牌+癞子+牌
	public static final int WIK_SUO_CHI_LEFT_1 = 0x00001000;
	// 锁吃，左吃，一个癞子参与，出的牌+牌+癞子
	public static final int WIK_SUO_CHI_LEFT_2 = 0x00002000;
	// 锁吃，中吃，一个癞子参与，癞子+出的牌+牌
	public static final int WIK_SUO_CHI_CENTER_1 = 0x00004000;
	// 锁吃，中吃，一个癞子参与，牌+出的牌+癞子
	public static final int WIK_SUO_CHI_CENTER_2 = 0x00008000;
	// 锁吃，右吃，一个癞子参与，癞子+牌+出的牌
	public static final int WIK_SUO_CHI_RIGHT_1 = 0x00010000;
	// 锁吃，右吃，一个癞子参与，牌+癞子+出的牌
	public static final int WIK_SUO_CHI_RIGHT_2 = 0x00020000;
	// 锁碰 一个癞子参与
	public static final int WIK_SUO_PENG_1 = 0x00040000;
	// 黄州晃晃，亮癞子
	public static final int WIK_LIANG_LAI_ZI = 0x00080000;
	// 湖北麻将里的红中杠、癞子杠、痞子杠等统一处理
	public static final int WIK_LAI_ZI_PI_ZI_GANG = 0x00100000;
	// 锁碰， 两个癞子参与
	public static final int WIK_SUO_PENG_2 = 0x00200000;
	// 锁杠 一个癞子参与
	public static final int WIK_SUO_GANG_1 = 0x00400000;
	// 锁杠 两个癞子参与
	public static final int WIK_SUO_GANG_2 = 0x00800000;
	// 锁杠 三个癞子参与
	public static final int WIK_SUO_GANG_3 = 0x01000000;
	// 锁杠 四个癞子参与
	public static final int WIK_SUO_GANG_4 = 0x02000000;
	// 鄂州晃晃，杠打靠张
	public static final int WIK_GANG_DA_KAO = 0x04000000;
	// 鄂州晃晃，流局
	public static final int WIK_LIU_JU = 0x08000000;
	// 湖北子游戏，红中杠
	public static final int WIK_HONG_ZHONG_GANG = 0x10000000;
	// 湖北子游戏，发财杠
	public static final int WIK_FA_CAI_GANG = 0x20000000;
	// 湖北子游戏，痞子杠
	public static final int WIK_PI_ZI_GANG = 0x20000000;
	// 湖北子游戏，癞子杠
	public static final int WIK_LAI_ZI_GANG = 0x40000000;
	// 湖北子游戏，癞子吃
	public static final int WIK_LAI_ZI_CHI = 0x80000000;

	// 笑
	public static final int WIK_MENG_XIAO = 0x400; // 闷笑
	public static final int WIK_DIAN_XIAO = 0x800; // 点笑
	public static final int WIK_HUI_TOU_XIAO = 0x1000; // 回头笑
	public static final int WIK_XIAO_CHAO_TIAN = 0x2000; // 小朝天
	public static final int WIK_DA_CHAO_TIAN = 0x4000; // 大朝天
	public static final int WIK_PIAO_LAI = 0x8000; // 飘赖

	public static final int WIK_BAO_TING = 0x10000; // 报听
	public static final int WIK_BU_HUA = 0x20000; // 补花
	public static final int WIK_ZHAO = 0x40000; // 招-福禄寿

	public static final int WIK_LYGC_PI_CI = 0x400000; // 洛阳杠次 皮次动作(特殊处理，不需要过操作)

	public static final int WIK_LYGC_CI = 0x800000; // 洛阳杠次 次动作

	public static final int WIK_YAO_YI_SE = 0x1000000; // 摇一色(湖南)

	public static final int WIK_ZT_SI_XI = 0x2000000; // 中途四喜

	public static final int WIK_YING_KUO = 0x20000000; // 硬扣
	public static final int WIK_AN_GANG_SHUO_SI = 0x40000000; // 暗杆锁死

	public static final int WIK_ZT_LLS = 0x04000000; // 中途六六顺

	public static final int GAME_LIANG_ZHANG_MAX = 4;
	public static final int GAME_HUA_CARD_MAX = 12;
	public static final int WIK_XIAO_QI_DUI = 0x100; // 胡小七对
	public static final int WIK_SHUANG_LONG = 0x200; // 胡双龙
	// --下面是跑胡子的
	public static final int WIK_SAO = 0x80000; // 扫-红黑胡
	public static final int WIK_PAO = 0x100000; // 跑-红黑胡
	public static final int WIK_AN_LONG = 0x200000; // 暗龙-红黑胡
	public static final int WIK_TI_LONG = 0x400000; // 提龙-红黑胡
	public static final int WIK_XXD = 0x800000; // 小小吃类型
	public static final int WIK_DDX = 0x1000000; // 大大吃类型
	public static final int WIK_EQS = 0x4000000; // 吃二七十
	public static final int WIK_CHOU_SAO = 0x8000000; // 臭扫
	public static final int WIK_DUI_ZI = 0x10000000; // 对子
	public static final int WIK_YWS = 0x20000000; // 一五十
	public static final int WIK_KAN = 0x40000000; // 坎
	public static final int WIK_SAO_SI_QING = 0x100; // 扫四清
	public static final int WIK_PENG_SI_QING = 0x200; // 碰四清
	public static final int WIK_SAO_SAN_DA = 0x400; // 扫三大
	public static final int WIK_PENG_SAN_DA = 0x800;// 碰三大
	public static final int WIK_PENG_OUT = 0x1000; // 碰别人出的牌
	public static final int WIK_AN_LONG_LIANG = 0x2000; // 暗龙自己全亮
	public static final int WIK_CHOU_XIAO = 0x4000; // 臭笑
	public static final int WIK_LOU = 0x8000; // 落牌
	public static final int WIK_WEI = 0x10000; // 喂
	public static final int WIK_CHOU_WEI = 0x20000; // 臭喂
	public static final int WIK_XIAO = 0x40000; // 笑
	public static final int WIK_TUO = 0x800; // 舵
	public static final int WIK_ZHE_WMQ = 0x10; // 啫
	public static final int WIK_DOUBLE_PAO = 0x100; // 重跑

	/////////////////////////////////////////////////////////////////// 博胡
	public static final int WIK_BH_NULL = 0x0000000; // null
	public static final int WIK_BH_CHI_HU = 0x0000040; // 吃胡
	public static final int WIK_BH_ZI_MO = 0x0000080; // 自摸
	public static final int WIK_BH_CHI_L = 0x0000100; // 树着吃 123 左吃
	public static final int WIK_BH_CHI_C = 0x0000200; // 树着吃 123 中
	public static final int WIK_BH_CHI_R = 0x0000400; // 树着吃 123 右
	public static final int WIK_BH_CHI_H = 0x0000800; // 横着吃 五万五条五本
	public static final int WIK_BH_CHI_A98 = 0x0001000; // ①（飘花、九万、八条）
	public static final int WIK_BH_CHI_A99 = 0x0002000; // ①（牛婆、九万、九条）
	public static final int WIK_BH_CHI_AA9 = 0x0004000; // ①（牛婆、老千、九条）
	public static final int WIK_BH_CHI_119 = 0x0008000; // ①（一万、一条、九本）
	public static final int WIK_BH_CHI_337 = 0x0010000; // ①（三万、三条、七本）
	public static final int WIK_BH_CHI_228 = 0x0020000; // ①（二万、二条、八本）
	public static final int WIK_BH_PENG = 0x0040000; // 碰
	public static final int WIK_BH_SHE = 0x0080000; // 舍
	public static final int WIK_BH_DAGUN = 0x0100000; // 打滚
	public static final int WIK_BH_KAIZ = 0x0200000; // 开斋
	public static final int WIK_BH_ZHUA_LONG = 0x0400000;// 抓龙
	public static final int WIK_BH_SHANG = 0x0800000; // 上
	public static final int WIK_BH_XIA = 0x1000000; // 下
	public static final int WIK_BH_LUO_YAO = 0x2000000; // 落下去的妖牌
	public static final int WIK_BH_CHI_LUO = 0x4000000; // 吃一个落一个
	public static final int WIK_BH_SHANG_TWO = 0x8000000; // 上两张
	public static final int WIK_BH_XIA_TWO = 0x10000000; // 下两张

	public static final int PH_STATUS_ADD_FIRST_CARD = 1;
	public static final int PH_STATUS_CHU_LI_CARD = 2;
	public static final int PH_STATUS_FRIST_DISPATCH = 3;
	public static final int PH_STATUS_DISPATCH = 4;
	public static final int PH_STATUS_CHI_PENG = 5;
	public static final int PH_STATUS_GANG = 6;
	public static final int PH_STATUS_OUT_CARD = 7;

	public static final int WIK_SPECIAL_DAN = 0x0010; // 新郴州字牌的结算页面，显示‘单’牌数据

	// 岳阳歪胡子
	public static final int WIK_YYWHZ_LIU_WAI = 0x1000; // 溜 岳阳歪胡子
	public static final int WIK_YYWHZ_LIU_NEI = 0x2000; // 溜 岳阳歪胡子
	public static final int WIK_YYWHZ_SHUNZI = 0x4000; // 顺子 岳阳歪胡子
	public static final int WIK_YYWHZ_MENZI = 0x8000; // 门子 岳阳歪胡子
	public static final int WIK_YYWHZ_WAI = 0x10000; // 歪 岳阳歪胡子
	public static final int WIK_YYWHZ_KAN = 0x20000; // 坎 岳阳歪胡子
	public static final int WIK_YYWHZ_SHUNZI_EQS = 0x40000; // 顺子二七十 岳阳歪胡子
	public static final int WIK_YYWHZ_MENZI_GUANG = 0x80000; // 门子 岳阳歪胡子
	// 益阳歪胡子
	public static final int WIK_YIYANGWHZ_QING_NEI = 0x1000; // 清 益阳歪胡子
	public static final int WIK_YIYANGWHZ_QING_WAI = 0x2000; // 清 益阳歪胡子
	public static final int WIK_YIYANGWHZ_WAI = 0x10000; // 歪 益阳歪胡子
	public static final int WIK_YIYANGWHZ_KAN = 0x20000; // 坎 益阳歪胡子
	public static final int WIK_YIYANGWHZ_PIAO = 0x100000; // 飘 益阳歪胡子
	public static final int WIK_YIYANGWHZ_HU = 0x200000; // 胡 益阳歪胡子
	public static final int WIK_DAN_PENG = 0x400000; // 单碰
	public static final int WIK_DAN_WAI = 0x800000; // 单歪
	// 湖北大冶字牌
	public static final int WIK_HBZP_NULL = 0x00000000; //
	public static final int WIK_HBZP_LEFT = 0x00000001;// 左吃
	public static final int WIK_HBZP_CENTER = 0x00000002;// 中吃
	public static final int WIK_HBZP_RIGHT = 0x00000004;// 右吃
	public static final int WIK_HBZP_EQS = 0x00000008; // 二七十
	public static final int WIK_HBZP_XXD = 0x00000010; // 小小吃
	public static final int WIK_HBZP_DDX = 0x00000020; // 大大吃
	public static final int WIK_HBZP_CHI_HU = 0x00000040; // 吃胡
	public static final int WIK_HBZP_ZI_MO = 0x00000080; // 自摸
	public static final int WIK_HBZP_PENG = 0x00000100; // 碰
	public static final int WIK_HBZP_ZHAO = 0x00000200; // 一朝牌
	public static final int WIK_HBZP_DUI = 0x00000400; // 一对牌
	public static final int WIK_HBZP_LONG = 0x00000800; // 一垅牌
	public static final int WIK_HBZP_KAN = 0x00001000; // 一坎牌
	public static final int WIK_HBZP_LOU = 0x00002000; // 吃一个落一个
	public static final int WIK_HBZP_OUT_CARD = 0x00004000; // 出牌操作
	// public static final int WIK_HUXI_CHI= 0x8000000; //有胡息吃
	// public static final int WIK_CHI= 0x10000000; //没有胡息吃

	public static final int MASK_CHI_HU_RIGHT = 0x0fffffff;
	public static final long MASK_CHI_HU_RIGHT_LONG = 0x0fffffffffffffffL;
	public static final int ZHANIAO_0 = 0; // 扎鸟2个
	public static final int ZHANIAO_1 = 1; // 扎鸟1个
	public static final int ZHANIAO_2 = 2; // 扎鸟2个
	public static final int ZHANIAO_3 = 3; // 扎鸟3个
	public static final int ZHANIAO_4 = 4; // 扎鸟4个
	public static final int ZHANIAO_6 = 6; // 扎鸟6个
	public static final int ZHANIAO_8 = 8; // 扎鸟8个

	public static final int FEINIAO_1 = 1; // 飞鸟1个
	public static final int FEINIAO_2 = 2; // 飞鸟2个
	public static final int FEINIAO_3 = 3; // 飞鸟3个
	public static final int FEINIAO_4 = 4; // 飞鸟4个

	public static final float DI_FEN_05 = 0.5f; // 0.5
	public static final float DI_FEN_10 = 1.f; // 1
	public static final float DI_FEN_20 = 2.f; // 2

	public static final int ZUOPIAO_1 = 1;
	public static final int ZUOPIAO_2 = 2;
	public static final int ZUOPIAO_3 = 3;

	/** 兼容旧游戏 特殊rule **/
	// 游戏底分
	public static final int GAME_RULE_BASE_SCORE = 201;
	// 洛阳杠
	public static final int GAME_RULE_BASE_SCORE_GANG = 202;
	// 洛阳次
	public static final int GAME_RULE_BASE_SCORE_CI = 203;
	// 最大底分
	public static final int GAME_RULE_MAX_TIMES = 204;
	// 洛阳杠次-点炮底
	public static final int GAME_RULE_BASE_SCORE_PAO = 205;

	// 通用检测相同ip玩法Id
	public static final int GAME_RULE_IP = 2048;
	// 通用允许少人模式
	public static final int GAME_RULE_CAN_LESS = 2049;
	// 通用打乱座位
	public static final int GAME_RULE_RANDOM_SEAT = 2050;
	// 强制开启定位
	public static final int GAME_RULE_FORCE_LOCATING = 2051;
	// 语音房
	public static final int GAME_RULE_VOICE_ROOM = 2052;
	// 玩法人数
	public static final int GAME_RULE_NUM = 2053;
	// 倍率
	public static final int GAME_RULE_ALL_BEI_LV = 2054;
	// 缺万子
	public static final int GAME_RULE_ALL_QUE_WAN_ZI = 2055;

	// 2人
	public static final int GAME_RULE_ALL_GAME_TWO_PLAYER = 3002; // 2人
	public static final int GAME_RULE_ALL_GAME_THREE_PLAYER = 3003; // 3人
	public static final int GAME_RULE_ALL_GAME_FOUR_PLAYER = 3004; // 4人
	public static final int GAME_RULE_ALL_GAME_FIVE_PLAYER = 3005; // 5人
	public static final int GAME_RULE_ALL_GAME_SIX_PLAYER = 3006; // 6人
	public static final int GAME_RULE_ALL_GAME_SEVEN_PLAYER = 3007; // 7人
	public static final int GAME_RULE_ALL_GAME_EIGHT_PLAYER = 3008; // 8人
	public static final int GAME_RULE_ALL_GAME_NINE_PLAYER = 3009; // 9人
	public static final int GAME_RULE_ALL_GAME_TEN_PLAYER = 3010; // 10人
	////////////////////////////////////////////////////////////////////////// 湖南的玩法，转转、红中、双鬼、株洲、长沙

	public static final int GAME_RULE_HUNAN_258 = 0; // 只能258做将
	public static final int GAME_RULE_HUNAN_ZIMOHU = 1; // 只能自模胡
	public static final int GAME_RULE_HUNAN_QIDUI = 2; // 可胡七对
	public static final int GAME_RULE_HUNAN_QIANGGANGHU = 3; // 可炮胡
	public static final int GAME_RULE_HUNAN_ZHANIAO2 = 4; // 扎鸟2个
	public static final int GAME_RULE_HUNAN_ZHANIAO4 = 5; // 扎鸟4个
	public static final int GAME_RULE_HUNAN_ZHANIAO6 = 6; // 扎鸟6个
	public static final int GAME_RULE_HUNAN_HONGZHONG = 7; // 红中玩法
	public static final int GAME_RULE_HUNAN_JIANPAOHU = 8; // 见炮胡
	public static final int GAME_RULE_HUNAN_ZHANIAO1 = 9; // 扎鸟1个
	public static final int GAME_RULE_HUNAN_GANG_HU = 10; // 抢杠胡
	public static final int GAME_RULE_DUO_PAO = 10; // 郴州麻将添加一炮多响（未用到10郴州麻将，此处复用

	public static final int GAME_RULE_HUNAN_SCORE_ADD = 11; // 加法记分
	public static final int GAME_RULE_HUNAN_SCORE_MUTIP = 12; // 乘法记分

	// 长沙麻将 新抓鸟--定鸟2 4 6 用之前的扎鸟字段
	public static final int GAME_RULE_HUNAN_CS_ZUOPIAO1 = 13; // 坐飘1分
	public static final int GAME_RULE_HUNAN_CS_ZUOPIAO2 = 14; // 坐飘2分
	public static final int GAME_RULE_HUNAN_CS_ZUOPIAO3 = 15; // 坐飘3分

	public static final int GAME_RULE_HUNAN_CS_DING_NIAO1 = 16; // 定鸟1个乘法
	public static final int GAME_RULE_HUNAN_CS_DING_NIAO2 = 17; // 定鸟2个乘法

	public static final int GAME_RULE_HUNAN_CS_FEI_NIAO2 = 18; // 飞鸟2个
	public static final int GAME_RULE_HUNAN_CS_FEI_NIAO4 = 19; // 飞鸟4个

	public static final int GAME_RULE_HUNAN_CS_PIAO = 20; // 0-不飘 1-飘分

	public static final int GAME_RULE_CS_BU_PIAO = 33; // 不飘
	public static final int GAME_RULE_CS_PIAO_1 = 34; // 飘1
	public static final int GAME_RULE_CS_PIAO_2 = 35; // 飘2
	public static final int GAME_RULE_CS_PIAO_3 = 36; // 飘3
	public static final int GAME_RULE_CS_PIAO_4 = 37; // 飘4
	public static final int GAME_RULE_CS_PIAO_5 = 38; // 飘5

	public static final int GAME_RULE_HUNAN_FLS_IP = 21; // 是否允许相同ip进入(默认允许0)

	public static final int GAME_RULE_HUNAN_FLS_ZHUANG = 22; // 0-胡牌者庄 1-轮庄

	public static final int GAME_RULE_HUNAN_ONE_GANG = 23; // 0-一杠到底 1-否

	public static final int GAME_RULE_HUNAN_SCORE_TOP = 24; // 0-否 1-60分封顶

	public static final int GAME_RULE_HUNAN_THREE = 25; // 三人场麻将

	public static final int GAME_RULE_HUNAN_ALL_OPEN = 26; // 0-半开放 1-全开放

	public static final int GAME_RULE_HUNAN_ZHUANG_XIAN = 27; // liuyan 2017/7/8
																// 庄闲
	public static final int GAME_RULE_HUNAN_JINNIAO = 28; // 金鸟

	public static final int GAME_RULE_HUNAN_HUANG_ZHUANG_HUANG_GANG = 29; // 湖南荒庄荒杠

	public static final int GAME_RULE_HUNAN_QIANG_GANG_HU_JIANG_MA = 30; // 湖南抢杠胡奖码

	@Deprecated // 没有用到 客户端31位也不能用
	public static final int GAME_RULE_HUNAN_159_JIANG_MA = 31; // 湖南159奖码

	public static final int GAME_RULE_HUNAN_MO_JI_JIANG_JI = 32; // 湖南奖码-摸几奖几

	public static final int GAME_RULE_HUNAN_DAIFENG = 33; // 带风
	/** 岳阳棋牌长沙麻将新增小胡类型 */
	public static final int GAME_RULE_HUNAN_CS_XIAOHU_JTYN = 34; // 金童玉女
	public static final int GAME_RULE_HUNAN_CS_XIAOHU_ST = 35; // 三同
	public static final int GAME_RULE_HUNAN_CS_XIAOHU_YZH = 36; // 一枝花
	public static final int GAME_RULE_HUNAN_CS_XIAOHU_BBG = 37; // 步步高
	public static final int GAME_RULE_HUNAN_EAT = 38; // 吃

	public static final int GAME_RULE_HUNAN_JIANGJIANGHU = 39; // 将将胡(只自摸)
	public static final int GAME_RULE_HUNAN_QING_YI_SE_CHI = 40; // 清一色可吃

	public static final int GAME_RULE_HUNAN_CS_FEI_NIAO1 = 39; // 飞鸟1个
	public static final int GAME_RULE_HUNAN_CS_FEI_NIAO3 = 40; // 飞鸟3个
	public static final int GAME_RULE_HUNAN_ZHANIAO3 = 41; // 扎鸟3个
	public static final int GAME_RULE_HUNAN_ZHANIAO = 42; // 扎鸟
	public static final int GAME_RULE_HUNAN_FEI_NIAO = 43; // 飞鸟
	public static final int GAME_RULE_HUNAN_BAO_TING = 44; // 报听
	public static final int GAME_RULE_HUNAN_MEN_QING = 55; // 门清
	public static final int GAME_RULE_HUNAN_M_Q_J_J_HU = 56; // 门清将将胡
	public static final int GAME_RULE_HUNAN_HONZLAIZI = 57; // 红中癞子
	public static final int GAME_RULE_HUNAN_WANGBAPAI = 58; // 王霸牌
	public static final int GAME_RULE_HUNAN_WOWONIAO = 59; // 窝窝鸟
	public static final int GAME_RULE_HUNAN_GANG_SUI_HU = 60; // 杠随胡

	public static final int GAME_RULE_HUNAN_YI_MA_QUAN_ZHONG = 61; // 湖南红中麻将，新增一码全中玩法
	public static final int GAME_RULE_HUNAN_BU_TONG_PAO = 62; // 不通炮
	// 跳过63这个特殊的值
	public static final int GAME_RULE_HUNAN_HONG_ZHONG_BU_JIE_PAO = 64; // 手里有红中时，只能自摸
	public static final int GAME_RULE_HUNAN_HONG_ZHONG_8_HZ = 65;

	public static final int GAME_RULE_HUNAN_NIAO_FEN_2 = 65; // 鸟2分

	public static final int GAME_RULE_HUNAN_TWO = 26; // 二人场麻将
	public static final int GAME_RULE_HUNAN_CS_PIAO_3 = 67; // 飘3分
	public static final int GAME_RULE_HUNAN_CS_PIAO_5 = 68; // 飘5分
	public static final int GAME_RULE_DA_HU_FENG_DING = 69; // 大胡（10分封顶）
	public static final int GAME_RULE_WU_MAGIC_ADD_FAN = 70; // 无红中加倍
	public static final int GAME_RULE_HUNAN_ZHANIAO0 = 71; // 扎鸟0个(不扎鸟)
	public static final int GAME_RULE_FEI_NIAO = 72; // 飞鸟
	public static final int GAME_RULE_NON_PIAO_FEN = 73; // 不飘分
	public static final int GAME_RULE_WU_MAGIC_QIANG_GANG_HU = 74; // 无红中抢杠胡
	public static final int GAME_RULE_GANG_BAO_QUAN_BAO = 75; // 杠爆全包
	public static final int GAME_RULE_NIAO_FEN_1 = 76; // 鸟1分
	public static final int GAME_RULE_NIAO_FEN_2 = 77; // 鸟2分
	public static final int GAME_RULE_ZHUANG_NIAO = 78; // 按庄家中鸟

	public static final int GAME_RULE_NIAO_BU_ZHONG_SUAN_QUAN_ZHONG = 79; // 抓鸟不中算全中
	public static final int GAME_RULE_HZ_KE_CHI_PAI = 80;// 萍乡转转可吃牌
	public static final int GAME_RULE_HUNAN_ZHANIAO8 = 81;// 抓8鸟
	public static final int GAME_RULE_JIA_CHUI = 82; // 邵阳麻将加锤
	public static final int GAME_RULE_BEI_LV = 83; // 湖南红中/株洲转转倍率
	public static final int GAME_RULE_WU_DI_FEN = 84; // 无底分
	public static final int GAME_RULE_XING_YI_MA_QUAN_ZHON = 85; // 新一码全中
	public static final int GAME_RULE_JI_SHI_GANG_FEN = 86; // 及时算杠分 / 株洲转转
	public static final int GAME_RULE_QING_YI_SE_KE_CHI = 87; // 邵阳麻将清一色可吃

	public static final int GAME_RULE_ALL_RANDOM_INDEX = 99; // 随机座位 各游戏通用

	///////////////////////////////////////////////////////////////////////////// 湖北的玩法,晃晃
	public static final int GAME_RULE_HEBEI_DI_FEN_05 = 0; // 0.5
	public static final int GAME_RULE_HEBEI_DI_FEN_10 = 1; // 1
	public static final int GAME_RULE_HEBEI_DI_FEN_20 = 2; // 2

	public static final int GAME_RULE_HEBEI_GAN_DENG_YAN = 3; // 干瞪眼
	public static final int GAME_RULE_HEBEI_YI_LAI_DAO_DI = 4; // 一赖到底
	public static final int GAME_RULE_HEBEI_PIAO_LAI_YOU_JIANG = 5; // 飘赖有奖
	public static final int GAME_RULE_HEBEI_TU_HAO_BI_GANG = 6; // 土豪必杠

	/////////////////////////////////////////////////////////////////////////////// 河南麻将玩法，河南、安阳、林州、
	public static final int GAME_RULE_HENAN_DAIFENG = 0; // 带风
	public static final int GAME_RULE_HENAN_XIAPAO = 1; // 庄家能不能下跑
	public static final int GAME_RULE_HENAN_DAI_HUN = 2; // 带混
	public static final int GAME_RULE_HENAN_HENAN_PAO_HU = 3; // 可炮胡
	public static final int GAME_RULE_HENAN_DAI_PAO = 4; // 带跑

	public static final int GAME_RULE_HENAN_GANG_PAO = 5; // 杆跑
	public static final int GAME_RULE_HENAN_JIA_DI = 6; // 庄家加底
	public static final int GAME_RULE_HENAN_GANGHUA_DOUBLE = 7; // 杆上花加倍
	public static final int GAME_RULE_HENAN_QIDUI_DOUBLE = 8; // 七对加倍
	public static final int GAME_RULE_HENAN_ZHANIAO2 = 9; // 扎鸟2个
	public static final int GAME_RULE_HENAN_ZHANIAO4 = 10; // 扎鸟4个
	public static final int GAME_RULE_HENAN_ZHANIAO6 = 11; // 扎鸟6个
	public static final int GAME_RULE_HENAN_ZIMOHU = 12; // 只能自模胡，可泡胡
	public static final int GAME_RULE_HENAN_HZBHG = 13; // 荒庄不荒杠--1规则
	public static final int GAME_RULE_HENAN_258 = 14; // 258作将--默认不选-0 选择了-1
	public static final int GAME_RULE_HENAN_HAOQI = 15; // 豪七四倍
	public static final int GAME_RULE_HENAN_QUE_MEN = 16; // 缺门/断门：最后胡牌时必须缺一门（发牌时不选定缺）0-默认不选
															// 1-选
	public static final int GAME_RULE_HENAN_HTG = 17; // 回头杠 0-默认不选 1-选
	public static final int GAME_RULE_HENAN_SHUAIHUN = 18; // 甩混 0-默认不选 1-选
	public static final int GAME_RULE_HENAN_ZHUANG_XIAN = 19; // 庄闲
	public static final int GAME_RULE_HENAN_QIANG_ZHI_HU = 20; // 强制胡牌
	public static final int GAME_RULE_HENAN_IP = 21; // 是否允许相同ip进入(默认允许0)
	public static final int GAME_RULE_HENAN_YCI = 22; // 硬次
	public static final int GAME_RULE_HENAN_BUCIFENG = 23; // 不次风
	public static final int GAME_RULE_HENAN_BAOCI = 24; // 包次
	public static final int GAME_RULE_HENAN_THREE = 25; // 三人场麻将
	public static final int GAME_RULE_HENAN_TUIDAOHU = 26;
	public static final int GAME_RULE_HENAN_NAOZHUAN = 27;
	public static final int GAME_RULE_HENAN_LCI = 28; // 软次
	public static final int GAME_RULE_HENAN_PICI = 29; // 皮次
	public static final int GAME_RULE_HENAN_HEI_ZI = 29; // 黑子
	public static final int GAME_RULE_HENAN_QIANG_GANG_HU = 30; // 抢杠胡1-是 0-否
	public static final int GAME_RULE_HENAN_CHU_FENG_BAO_TING = 32;
	public static final int GAME_RULE_HENAN_SMX_SHANG_HUN = 33; // 上混
	public static final int GAME_RULE_HENAN_SMX_ANGANG_DOUBLE = 34; // 暗杠加倍
	public static final int GAME_RULE_HENAN_SMX_ZHUANG_NO_DOUBLE = 35; // 庄家不加倍
	public static final int GAME_RULE_HENAN_SMX_GAGN_SUI_HU_ZOU = 36; // 杠随胡走
	public static final int GAME_RULE_HENAN_SMX_BIAO_YAN = 37; // 表演
	public static final int GAME_RULE_HENAN_SMX_BIAO_YAN_FEN = 38; // 下表演

	public static final int GAME_RULE_HENAN_DU_TING = 39; // 独听
	public static final int GAME_RULE_HENAN_SIX_LIAN = 40; // 连6连9
	public static final int GAME_RULE_HENAN_DOUBLE_TO_QING_YI_SE = 41; // 清一色翻倍
	public static final int GAME_RULE_HENAN_HONG_ZHONG_LAI_ZI = 42;
	public static final int GAME_RULE_HENAN_FOUR = 43; // 四人场
	public static final int GAME_RULE_HENAN_YOU_HUA_WU_SHU = 44; // 有花无树
	public static final int Game_Rule_henan_you_cai_wu_hua = 45; // 有树无花
	public static final int Game_rule_henan_wu_hua_wu_shu = 46; // 无花无树
	public static final int Game_rule_henan_an_Gang_Shuo_si = 47; // 暗杆锁死
	public static final int Game_Rule_henan_qing_yi_se = 48; // 清一色 断两门
	public static final int GAME_RULE_HENAN_BAO_TING = 49; // 周口麻将--报听
	public static final int GAME_RULE_ZI_MO_FAN_BEI = 50; // 焦作晃晃--自摸翻倍
	public static final int GAME_RULE_HENAN_KUAI_SU_CHANG = 51; // 快速场
	public static final int GAME_RULE_HENAN_TWO_PLAYER = 52; // 二人场
	public static final int GAME_RULE_HENAN_BU_DAI_FENG = 53; // 不带风
	public static final int GAME_RULE_HENAN_KE_HU_QI_DUI = 54; // 可胡七对
	public static final int GAME_RULE_HENAN_CI_FENG_DOUBLE = 55; // 次风翻倍

	public static final int GAME_RULE_HENAN_THIRTY_SECONDS = 56; // 30秒解散
	public static final int GAME_RULE_HENAN_ONE_MINUTE = 57; // 1分钟解散
	public static final int GAME_RULE_HENAN_TWO_MINUTE = 58; // 2分钟解散
	public static final int GAME_RULE_HENAN_THREE_MINUTE = 59; // 3分钟解散

	public static final int GAME_RULE_HENAN_GUO_PENG = 60; // 过手碰
	public static final int GAME_RULE_HENAN_LI_XIAN_TUO_GUAN = 61; // 离线托管

	///////////////////////////////////////////////////////////////////////////////// 江苏镇江麻将
	public static final int GAME_RULE_JIANGSU_BAO_CHONG = 1; // 包冲
	public static final int GAME_RULE_JIANGSU_PEI_CHONG = 2; // 陪冲
	public static final int GAME_RULE_JIANGSU_YUAN_ZI = 3; // 园子
	public static final int GAME_RULE_JIANGSU_JIN_CHONG = 4; // 紧冲
	public static final int GAME_RULE_JIANGSU_DOUBLE = 5; // 翻倍

	///////////////////////////////////////////////////////////////////////////////// 濮阳麻将
	public static final int GAME_RULE_PUYANG_DAIPU = 1; // 带扑
	public static final int GAME_RULE_PUYANG_HUANGHUNAG = 2; // 晃晃
	public static final int GAME_RULE_PUYANG_YAOJIUPU = 3; // 幺九扑
	public static final int GAME_RULE_PUYANG_FENGPU = 4; // 风扑
	public static final int GAME_RULE_PUYANG_JIANGPU = 5; // 将扑
	public static final int GAME_RULE_PUYANG_ZIMOHU = 6; // 自摸胡
	public static final int GAME_RULE_PUYANG_KEPAOHU = 7; // 可炮胡
	public static final int GAME_RULE_PUYANG_DAIFENG = 8; // 带风
	public static final int GAME_RULE_PUYANG_BUDAIFENG = 9; // 不带风
	public static final int GAME_RULE_PUYANG_BAOTING = 10; // 报听
	public static final int GAME_RULE_PUYANG_BUBAOTING = 11; // 不报听
	public static final int GAME_RULE_PUYANG_DANDIAOJIAFEN = 12; // 单吊加分
	public static final int GAME_RULE_PUYANG_KAZHANGJIAFEN = 13; // 卡张加分
	public static final int GAME_RULE_PUYANG_QUEMENJIAFEN = 14; // 缺门加分
	public static final int GAME_RULE_PUYANG_HUANGZHUANGHUANGGANG = 15; // 荒庄荒杠
	public static final int GAME_RULE_PUYANG_QIDUIDOUBLE = 16; // 7对加倍
	public static final int GAME_RULE_PUYANG_SANREN = 18; // 三人场
	public static final int GAME_RULE_PUYANG_SIREN = 19; // 四人场
	public static final int GAME_RULE_PUYANG_DI_FEN_ONE = 20; // 底分一分
	public static final int GAME_RULE_PUYANG_DI_FEN_TWO = 21; // 底分二分
	public static final int GAME_RULE_PUYANG_DI_FEN_THREE = 22; // 底分三分
	public static final int GAME_RULE_PUYANG_DI_FEN_FOUR = 23; // 底分四分

	public static final int EFFECT_GENZHANG = 0x100; // 跟张
	public static final int EFFECT_BEIDONGDA = 0x200; // 被动搭
	public static final int EFFECT_ERDA = 0x400; // 二搭
	public static final int EFFECT_GUANERDA = 0x800; // 管二搭
	public static final int EFFECT_ZIDAANGANG = 0x1000; // 自打暗杠
	public static final int EFFECT_TOUDA = 0x2000; // 头搭
	public static final int WIK_AN_GANG = 0x4000; // 暗杠牌类型
	public static final int WIK_MING_GANG = 0x8000; // 明杠类型

	/////////////////////////////////////////////////////////////////////////////// 临湘玩法，福禄寿
	public static final int GAME_RULE_LIXIANG_FLS_PIAO = 1; // 1-飘(默认不飘 0 )
	public static final int GAME_RULE_LIXIANG_FLS_IP = 2; // 是否允许相同ip进入(默认允许0)
	public static final int GAME_RULE_LIXIANG_FLS_JIANPAOHU = 3; // 强制胡牌
																	// 1-默认强制胡牌
																	// 0-否
	public static final int GAME_RULE_LIXIANG_FLS_IS_TWO = 4; // 是否2底分(默认1分低)
	public static final int GAME_RULE_LIXIANG_FLS_ZHUANG = 5; // 0-胡牌者庄 1-轮庄
	public static final int GAME_RULE_LIXIANG_FLS_TONGPAO = 6; // 0-不通炮 1-通炮
	public static final int GAME_RULE_LIXIANG_FLS_QUE_YI_SE = 7; // 小胡-缺一色
	public static final int GAME_RULE_LIXIANG_FLS_BAN_BAN_HU = 8; // 小胡-板板胡
	public static final int GAME_RULE_LIXIANG_FLS_LIU_LIU_SHUN = 9; // 小胡-六六顺
	public static final int GAME_RULE_LIXIANG_FLS_DA_HONG_SI_XI = 10; // 小胡-大红四喜
	public static final int GAME_RULE_LIXIANG_FLS_BU_PIAO = 11; // 不飘
	public static final int GAME_RULE_LIXIANG_FLS_PIAO1 = 12; // 飘1
	public static final int GAME_RULE_LIXIANG_FLS_PIAO2 = 13; // 飘2
	public static final int GAME_RULE_LIXIANG_FLS_PIAO3 = 14; // 飘3
	public static final int GAME_RULE_LIXIANG_FLS_PIAO5 = 15; // 飘5

	// (20张玩法)
	public static final int GAME_RULE_FLS_THREE = 25; // 三人场

	/////////////////////////////////////////////////////////////////////////////// 攸县玩法，
	/////////////////////////////////////////////////////////////////////////////// 跑胡子
	public static final int GAME_RULE_YOUXIAN_PHZ_SELECT_YWS = 1; // 1-选择类型（0普通，
																	// 1 一五十）
	public static final int GAME_RULE_YOUXIAN_PHZ_SELECT_HUXI = 2; // 2-选择胡息（0是15胡息，1
																	// 18胡息）
	public static final int GAME_RULE_DI_FEN_SELECT_ONE = 3; // 1底分
	public static final int GAME_RULE_DI_FEN_SELECT_TWO = 4; // 2底分
	public static final int GAME_RULE_DI_FEN_SELECT_THREE = 5; // 3底分
	public static final int GAME_RULE_DI_ERZI_LIANG_PAI = 6; // 0不亮牌，1亮牌
	public static final int GAME_RULE_DI_SHUA_HOU = 7; // 耍猴
	public static final int GAME_RULE_DI_HUANG_FAN = 8; // 黄番
	public static final int GAME_RULE_DI_TUAN_YUAN = 9; // 团圆
	public static final int GAME_RULE_DI_HANG_HANG_XI = 10; // 行行息
	public static final int GAME_RULE_DI_AN_WEI = 11; // 暗偎
	public static final int GAME_RULE_DI_MING_WEI = 12; // 明偎
	public static final int GAME_RULE_NO_MING_TANG = 13; // 无明堂
	public static final int GAME_RULE_ZI_MO_ADD_THREE = 14; // 自摸加3息
	public static final int GAME_RULE_JI_BENMING_TANG = 15; // 基本名堂
	public static final int GAME_RULE_ALL_MING_TANG = 16; // 全名堂
	public static final int GAME_RULE_SI_QI_ZHANG_HONG_HU = 17; // 四七张红胡
	public static final int GAME_RULE_HONG_HEI_DIAN = 18; // 红黑点
	public static final int GAME_RULE_HAI_DI_LAO_YUE = 19; // 海底捞月
	public static final int GAME_RULE_QIANG_ZHI_HU_PAI = 20; // 强制胡牌
	public static final int GAME_RULE_NO_XING = 21; // 不带醒
	public static final int GAME_RULE_FAN_XING = 22; // 翻醒
	public static final int GAME_RULE_SUI_XING = 23; // 随醒
	public static final int GAME_RULE_ONE_TUN_ONE_FEN = 24; // 一囤一分
	public static final int GAME_RULE_ONE_HU_ONE_FEN = 25; // 一胡一分
	public static final int GAME_RULE_LHQ_HD_SAN_REN = 26; // 衡东六胡抢三人
	public static final int GAME_RULE_TEN_HU_XI_XT = 26;// 湘潭跑胡子10胡息
	public static final int GAME_RUEL_FIFTEEN_HU_XI_XT = 27; // 湘潭跑胡子15胡息
	public static final int GAME_RULE_NO_FEN_DING = 28; // 怀化红拐弯 不封顶
	public static final int GAME_RULE_FIVE_FAN = 29; // 5番封顶
	public static final int GAME_RULE_TEN_FAN = 30; // 10番封项
	public static final int GAME_RULE_ZI_MO_TWO_BEI = 0; // 自摸2倍
	public static final int GAME_RULE_ADD_SPEED = 7; // 加速
	public static final int GAME_RULE_30_HU_FAN_FAN = 22; // 30胡翻番
	public static final int GAME_RULE_3_XI_YI_TUN = 23; // 3息一囤

	public static final int GAME_RULE_HGW_TH_4_F = 31;
	public static final int GAME_RULE_HGW_TH_5_F = 32;
	public static final int GAME_RULE_HGW_DH_3_F = 33;
	public static final int GAME_RULE_HGW_DH_4_F = 34;
	public static final int GAME_RULE_HGW_PPH_4_F = 35;
	public static final int GAME_RULE_HGW_PPH_5_F = 36;
	public static final int GAME_RULE_HGW_ZMH_15 = 37;
	public static final int GAME_RULE_HGW_TWO_PLAYER = 15; // 两人
	public static final int GAME_RULE_HGW_THREE_PLAYER = 16; // 三人
	public static final int GAME_RULE_HGW_SPEED_ADD = 40; // 加快
	public static final int GAME_RULE_LHQ_MINUE_20_CARD = 41; // 抽取20张
	public static final int GAME_RULE_THK_KHLZ_CARD = 42; // 可胡亮张牌
	public static final int GAME_RULE_HGW_16XH_4_F = 43;
	public static final int GAME_RULE_HGW_16XH_5_F = 44;
	public static final int GAME_RULE_HGW_18DH_4_F = 45;
	public static final int GAME_RULE_HGW_18DH_5_F = 46;
	public static final int GAME_RULE_HGW_ZIMO_ADD_1 = 47;
	public static final int GAME_RULE_HGW_ZIMO_1_F = 48;
	public static final int GAME_RULE_HGW_MINUE_20_CARD = 49;
	public static final int GAME_RULE_XH_PHZ_ADD_SCORE = 50; // 加分
	public static final int GAME_RULE_XH_PHZ_GO_TO_BANKER = 51;// 连庄
	public static final int GAME_RULE_XH_PHZ_ZIMO_ADD_ONE = 52; // 自摸加1
	public static final int GAME_RULE_XH_PHZ_ZIMO_DOUBLE = 53; // 自摸翻倍
	public static final int GAME_RULE_XH_PHZ_5_ADD_JUMP = 54; // 5息一跳
	public static final int GAME_RULE_XH_PHZ_3_ADD_JUMP = 55; // 3息一跳
	public static final int GAME_RULE_HH_4_TIME_SCORE = 56; // 4倍
	public static final int GAME_RULE_HH_5_TIME_SCORE = 57; // 5倍
	public static final int GAME_RULE_HH_HAI_DI_BANKER = 58; // 海底庄
	public static final int GAME_RULE_HH_ZI_MO_ADD_3_HU = 59; // 自摸加3胡
	public static final int GAME_RULE_HH_PASS_BUTTON = 60; // 加过按钮
	public static final int GAME_RULE_HH_HU_PAI_SUBMIT = 61; // 胡牌提示
	public static final int GAME_RULE_HH_RAND_SEAT = 62; // 随机位置

	/////////////////////////////////////////////////////////////////////////////////// 偎麻雀
	public static final int GAME_RULE_XIAO_ZHUO_BAN = 1; // 小桌版
	public static final int GAME_RULE_DA_ZHUO_BAN = 2; // 大桌版
	public static final int GAME_RULE_QUAN_MING_TANG = 3; // 全名堂
	public static final int GAME_RULE_LAO_MING_TANG = 4; // 老名堂 //钻石版
	public static final int GAME_RULE_QIANG_HU_PAI = 5; // 强制胡牌
	public static final int GAME_RULE_DOU_LIU_ZI_OFF = 6; // 逗溜子关
	public static final int GAME_RULE_DOU_LIU_ZI_ON = 7; // 逗溜子开
	public static final int GAME_RULE_ZHX_ONE_FEN = 8; // 庄闲30/20/20
	public static final int GAME_RULE_ZHX_TWO_FEN = 9; // 庄闲 40/30/30
	public static final int GAME_RULE_ZHX_THREE_FEN = 10; // 庄闲50/50/50
	public static final int GAME_RULE_ONE_DENG = 11; // 一登200分
	public static final int GAME_RULE_TWO_DENG = 12; // 二登300分
	public static final int GAME_RULE_THREE_DENG = 13; // 三登450分
	public static final int GAME_RULE_QUAN_QIU_REN = 14; // 全球人
	public static final int GAME_RULE_SHANG_XIA_WU_QNIAN = 15;// 上下五千年
	public static final int GAME_RULE_DA_LONG_BAI_WEI = 16; // 大龙摆尾
	public static final int GAME_RULE_ZI_MO_WMQ = 18; // 自摸
	public static final int GAME_RULE_XING_LIAN_XING = 19; // 心连心
	public static final int GAME_RULE_DUI_DAO_HU = 20; // 对倒胡
	public static final int GAME_RULE_HUO_ZHOU_XIAO_SAN = 21;// 活捉小三
	public static final int GAME_RULE_LIANG_HONG_LIANG_HEI = 22; // 两红两黑
	public static final int GAME_RULE_YI_TIAO_LONG = 23; // 一条龙
	public static final int GAME_RULE_GE_SAN_DA_NIU = 24; // 隔三打牛
	public static final int GMAE_RULE_GA_NUAN_DA = 25; // 嘎暖哒
	public static final int GAME_RULE_WMQ_TWO_PLAYER = 26; // 2 人
	public static final int GAME_RULE_WMQ_THREE_PLAYER = 27;// 3 人
	/////////////////////////////////////////////////////////////////////////////// 碰胡
	public static final int GAME_RULE_LIAN_ZHONG = 1; // 连中
	public static final int GAME_RULE_ZHONG_BANKER = 2; // 中庄*2
	public static final int GAME_RULE_QZ_HU_PAI_OFF = 3; // 否强制胡牌
	public static final int GAME_RULE_QZ_HU_PAI_ON = 4; // 是强制胡牌
	public static final int GAME_RULE_NORMAL_SPEED = 5; // 正常速度
	public static final int GAME_RULE_QUICK_SPEED = 6; // 快速
	public static final int GAME_RULE_DISPLAY_TING = 7; // 显示听牌
	public static final int GAME_RULE_PAO_BANKER = 8; // 炮 庄
	public static final int GAME_RULE_DISORDER_SEAT = 9; // 乱序坐位
	public static final int GAME_RULE_TWO_PLAYER_PH = 11;// 2人
	public static final int GAME_RULE_THREE_PLAYER_PH = 12;// 3人
	public static final int GAME_RULE_FOUR_PLAYER_PH = 13; // 4 人
	public static final int GAME_RULE_FOUR_FIRST_MUL = 14; // 四首相乘
	////////////////////////////////////////////////////////////////////////////// 岳阳歪胡子
	public static final int GAME_RULE_YYWHZ_KA_WAI = 1; // 卡歪
	public static final int GAME_RULE_YYWHZ_BANKER_DI_HU = 3; // 庄家地胡
	public static final int GAME_RULE_YYWHZ_HAO_102030 = 5; // 豪
	public static final int GAME_RULE_YYWHZ_ADD_XI = 7; // 豪
	public static final int GAME_RULE_YYWHZ_WAI_FIRST = 10; // 歪优先
	public static final int GAME_RULE_YYWHZ_HU_FIRST = 9; // 胡优先
	public static final int GAME_RULE_YYWHZ_TWO_PEOPLE = 11; // 二人
	public static final int GAME_RULE_YYWHZ_THREE_PEOPLE = 12; // 三人
	public static final int GAME_RULE_YYWHZ_QU_PAI = 13;// 去牌
	////////////////////////////////////////////////////////////////////////////// 益阳歪胡子
	public static final int GAME_RULE_YIYANG_WHZ_MING_TANG = 1; // 名堂
	public static final int GAME_RULE_YIYANG_WHZ_DA_XIAO_ZI_HU = 2; // 大小字胡
	public static final int GAME_RULE_YIYANG_WHZ_TIAN_DI_HU = 3; // 天地胡
	public static final int GAME_RULE_YIYANG_WHZ_BAO_TING = 4; // 报听
	public static final int GAME_RULE_YIYANG_WHZ_NEI_YUAN_KE_JIAN = 5; // 内元别人可见
	public static final int GAME_RULE_YIYANG_WHZ_XI_MAX_100 = 6; // 息数封顶
	public static final int GAME_RULE_YIYANG_WHZ_XI_MAX_200 = 7; // 息数封顶
	public static final int GAME_RULE_YIYANG_WHZ_XI_MAX_300 = 8; // 息数封顶
	public static final int GAME_RULE_YIYANG_WHZ_XI_MAX_400 = 9; // 息数封顶
	public static final int GAME_RULE_YIYANG_WHZ_XI_MAX_500 = 10; // 息数封顶
	public static final int GAME_RULE_YIYANG_WHZ_BASE_XI_ONE = 11; // 基础息
	public static final int GAME_RULE_YIYANG_WHZ_BASE_XI_TWO = 12; // 基础息
	public static final int GAME_RULE_YIYANG_WHZ_FAN_CAL = 13; // 翻数计分
	public static final int GAME_RULE_YIYANG_WHZ_XI_CAL = 14; // 息数计分
	public static final int GAME_RULE_HU_ADD_XI = 15; // 胡牌加息
	public static final int GAME_RULE_YIYANG_WHZ_HAIDI_2 = 16; // 海底2倍
	public static final int GAME_RULE_YIYANG_WHZ_HAIDI_4 = 17; // 海底4倍
	public static final int GAME_RULE_YIYANG_TWO_PEOPLE = 18; // 二人
	public static final int GAME_RULE_YIYANG_THREE_PEOPLE = 19; // 三人
	public static final int GAME_RULE_YIYANG_PIAO_TING_HU = 20;// 飘算听胡
	public static final int GAME_RULE_YIYANG_QU_PAI = 21;// 去牌
	public static final int GAME_RULE_YIYANG_CAN_EAT = 23;// 不能吃
	/////////////////////////////////////////////////////////////////////////////// 常德跑胡子
	public static final int GAME_RULE_NO_MAX_CHD = 1; // 不封顶
	public static final int GAME_RULE_100_MAX_CHD = 2; // 单局100
	public static final int GAME_RULE_200_MAX_CHD = 3; // 单局200
	public static final int GAME_RULE_500_MAX_CHD = 4; // 单局500
	public static final int GAME_RULE_ONE_DI_CHD = 5; // 底分1
	public static final int GAME_RULE_TWO_DI_CHD = 6; // 底分2
	public static final int GAME_RULE_THREE_DI_CHD = 7; // 底分3
	public static final int GAME_RULE_FOUR_DI_CHD = 8; // 底分4
	public static final int GAME_RULE_WAN_FA_CHD = 9; // 玩法
	public static final int GAME_RULE_TUAN_CHD = 10; // 团
	public static final int GAME_RULE_TUAN_YUAN_CHD = 11;// 团圆
	public static final int GAME_RULE_MTH_CHD = 12; // 满堂红
	public static final int GAME_RULE_HFT_CHD = 13; // 红翻天
	public static final int GAME_RULE_DIAN_DENG_CHD = 14;// 点灯
	public static final int GAME_RULE_SI_QI_HONG_CHD = 15; // 四七红
	public static final int GAME_RULE_HHX_CHD = 16; // 行行息
	public static final int GAME_RULE_ZERO_DI_CHD = 17;// 不埋底
	public static final int GAME_RULE_GAI_CHD = 18; // 盖
	public static final int GAME_RULE_BEI_CHD = 19; // 背
	public static final int GAME_RULE_MAN_YUAN_HUA = 20; // 满园花
	public static final int GAME_RULE_QIANG_HU_CHD = 21; // 强制胡牌
	public static final int GAME_RULE_10_MAX_CHD = 22; // 单局10
	public static final int GAME_RULE_20_MAX_CHD = 23; // 单局20
	public static final int GAME_RULE_WAN_FA_TWO_CHD = 24; // 玩法
	public static final int GAME_RULE_PIAO_CHD = 25; // 漂
	public static final int GAME_RULE_SHUN_CHD = 26; // 顺
	public static final int GAME_RULE_YING_CHD = 27; // 印
	public static final int GAME_RULE_YWS_CHD = 30; // 一五十
	public static final int GAME_RULE_JIA_HHX_CHD = 28; // 假行行息
	public static final int GAME_RULE_MING_WEI_CHD = 31; // 明偎
	public static final int GAME_RULE_AN_WEI_CHD = 29; // 暗偎
	public static final int GAME_RULE_WU_DI_CHD = 32; // 底分5
	public static final int GAME_RULE_TIAN_HU_CHD = 33; // 天胡
	public static final int GAME_RULE_DI_HU_CHD = 34; // 地胡
	public static final int GAME_RULE_HONG_HU_CHD = 35; // 红胡
	public static final int GAME_RULE_ONE_HONG_CHD = 36; // 一点红
	public static final int GAME_RULE_ALL_HEI_CHD = 37; // 全黑
	public static final int GAME_RULE_DA_HU_CHD = 38; // 大胡
	public static final int GAME_RULE_XIAO_HU_CHD = 39; // 小胡
	public static final int GAME_RULE_PENG_PENG_CHD = 40; // 碰碰胡
	public static final int GAME_RULE_SHUA_HOU_CHD = 41; // 耍猴
	public static final int GAME_RULE_TING_HU_CHD = 42; // 听胡
	public static final int GAME_RULE_HAI_HU_CHD = 43; // 海胡
	/////////////////////////////////////////////////////////////////////////////// 广西字牌
	public static final int GAME_RULE_10_YOU_HU = 1; // 十油起胡
	public static final int GAME_RULE_15_YOU_HU = 2; // 15油起胡
	public static final int GMAE_RULE_5_YOU_1_ZI = 3; // 5油一子
	public static final int GAME_RULE_3_YOU_1_ZI = 4; // 3油一子
	public static final int GAME_RULE_HONG_PENG = 5; // 红碰
	public static final int GAME_RULE_DIAN_PAO = 6; // 可以点炮
	public static final int GAME_RULE_NO_DIAN_PAO = 7; // 不可以点炮
	public static final int GAME_RULE_SHANG_XING = 8; // 上醒
	public static final int GAME_RULE_BEN_XING = 9; // 本醒
	public static final int GAME_RULE_XIA_XING = 10; // 下醒
	public static final int GAME_RULE_SI_XING = 11; // 四醒连翻熬
	public static final int GAME_RULE_ZM_YI_ZI = 12; // 自摸加一子
	public static final int GAME_RULE_ZM_FAN_BEI = 13; // 自摸翻倍
	public static final int GAME_RULE_YPSHX = 14; // 一炮双响
	public static final int Game_RULE_HU_XING = 15; // 胡醒
	public static final int GAME_RULE_SDDH = 16; // 手动点胡
	public static final int GAME_RULE_DIAN_PAO_2_TIMES = 17; // 可以点炮2倍
	public static final int GAME_RULE_DIAN_PAO_4_TIMES = 18; // 可以点炮4倍
	public static final int GAME_RULE_SI_XING_NO = 19; // 不翻重醒
	public static final int GAME_RULE_MID_XING = 20; // 中醒
	public static final int GAME_RULE_FOLLOW_XING = 21; // 跟 醒
	public static final int GAME_RULE_XING_PLAYER_LOOK_BANKER_CARDS = 22; // 醒家可看家庄牌
	public static final int GAME_RULE_TING_CARS_DISPLAY = 23; // 显示听牌提示

	/////////////////////////////////////////////////////////////////////////////// 湖北大冶字牌
	public static final int GAME_RULE_HBDY_TWO_PLAYER = 1; // 2人
	public static final int GAME_RULE_HBDY_THREE_PLAYER = 2; // 3人
	public static final int GAME_RULE_HBDY_ONE_FEN = 3; // 1底分
	public static final int GAME_RULE_HBDY_TWO_FEN = 4; // 2底分
	public static final int GAME_RULE_HBDY_THREE_FEN = 5; // 3底分
	/////////////////////////////////////////////////////////////////////////////// 眉山字牌
	public static final int GAME_RULE_MS_TIAN_HU = 1; // 天胡
	public static final int GAME_RULE_MS_DI_HU = 2; // 地胡
	/////////////////////////////////////////////////////////////////////////////// 荥经二七十
	public static final int GAME_RULE_PHZ_YJ_3_FD = 1; // 3番封顶
	public static final int GAME_RULE_PHZ_YJ_4_FD = 2; // 4番封顶

	/////////////////////////////////////////////////////////////////////////////// 绥阳大贰
	public static final int GAME_RULE_PHZ_SY_5_HD = 1; // 5海底
	public static final int GAME_RULE_PHZ_SY_10_HD = 2; // 10海底
	public static final int GAME_RULE_PHZ_SY_DAN_JI = 3; // 单鸡
	public static final int GAME_RULE_PHZ_SY_MAN_JI = 4; // 满鸡
	public static final int GAME_RULE_PHZ_SY_SZ_JI = 5; // 数字鸡
	public static final int GAME_RULE_PHZ_SY_PK_DISPLAER = 6; // 碰开显示
	public static final int GAME_RULE_PHZ_SY_PK_NO_DISPLAYER = 7; // 碰开不显示

	/////////////////////////////////////////////////////////////////////////////// 通城子个牌
	public static final int GAME_RULE_TC_ONE_FEN = 1; // 1分
	public static final int GAME_RULE_TC_TWO_FEN = 2; // 2分
	public static final int GAME_RULE_TC_THREE_FEN = 3; // 3分
	public static final int GAME_RULE_TC_FOUR_FEN = 4; // 4分
	public static final int GAME_RULE_TC_FIVE_FEN = 5; // 5分
	public static final int GAME_RULE_TC_THREE_PEOPLE = 6;// 三人
	public static final int GAME_RULE_TC_FOUR_PEOPLE = 7;// 四人
	public static final int GAME_RULE_TC_TEN_HUA = 8; // 十个花
	public static final int GAME_RULE_TC_LIU_HUA = 9; // 溜花
	public static final int GAME_RULE_TC_ONE_PAO_DUO_HU = 10; // 一炮多响
	public static final int GAME_RULE_TC_DIA_PAO = 11; // 带跑
	public static final int GAME_RULE_TC_SHI_DUI = 12; // 十对
	public static final int GAME_RULE_TC_HAI_DI_ADD_DI = 13; // 海底捞加一底
	public static final int GAME_RULE_TC_SEVEN_COUNT = 14; // 七个个子数
	public static final int GAME_RULE_TC_NINE_COUNT = 15; // 九个个子数
	public static final int GAME_RULE_TC_NO_DIA_PAO = 16; // 不带跑
	public static final int GAME_RULE_TC_DING_PAO = 17; // 定跑
	public static final int GAME_RULE_TC_DING_ONE = 18; // 定跑1分
	public static final int GAME_RULE_TC_DING_TWO = 19; // 定跑2分
	public static final int GAME_RULE_TC_DING_THREE = 20; // 定跑3分
	public static final int GAME_RULE_TC_DING_FOUR = 21; // 定跑4分
	public static final int GAME_RULE_TC_DING_FIVE = 22; // 定跑5分
	public static final int GAME_RULE_TC_ALL_HEI_2 = 23; // 全黑2倍
	public static final int GAME_RULE_TC_ALL_HEI_3 = 24; // 全黑3倍
	public static final int GAME_RULE_TC_ZI_MO_HU = 25; // 自摸必胡
	public static final int GAME_RULE_TC_QUANQ_SHU = 26; // 圈圈数
	/////////////////////////////////////////////////////////////////////////////// 四川长牌
	/////////////////////////////////////////////////////////////////////////////// 打追
	public static final int GAME_RULE_SCHCP_ONE_FEN = 1; // 1底分
	public static final int GAME_RULE_SCHCP_TWO_FEN = 2; // 2底分
	//////////////////////////////////////////////////////////////////////////////// 长牌阎中
	public static final int GAME_RULE_CP_YZ_THREE_PLAYER = 1; // 3人
	public static final int GAME_RULE_CP_YZ_FOUR_PLAYER = 2; // 4人
	public static final int GAME_RULE_CP_YZ_FD_3_F = 3; // 封顶3番
	public static final int GAME_RULE_CP_YZ_FD_4_F = 4; // 封顶4番
	public static final int GAME_RULE_CP_YZ_FD_5_F = 5; // 封顶5番
	public static final int GAME_RULE_CP_YZ_DP_BAO_2J = 6; // 点炮包两家
	public static final int GAME_RULE_CP_YZ_DP_JIA_1F = 7; // 点炮加一番
	public static final int GAME_RULE_CP_YZ_DP_BAO_3J = 8; // 点炮包三家
	public static final int GAME_RULE_CP_YZ_LC_LD = 9; // 乱吃乱打
	public static final int GAME_RULE_CP_YZ_ZC_ZD = 10; // 正吃正打
	public static final int GAME_RULE_CP_YZ_RYGY = 11; // 软硬各一
	public static final int GAME_RULE_CP_YZ_SSSF = 12; // 叁肆算番
	public static final int GAME_RULE_CP_YZ_SHKSF = 13; // 三黑坎算番
	/////////////////////////////////////////////////////////////////////////////// 四川长牌
	/////////////////////////////////////////////////////////////////////////////// 斗十四
	public static final int GAME_RULE_DSS_HONG_DIAN = 1; // 红点算分
	public static final int GAME_RULE_DSS_DHHZ = 2; // 打火火子
	public static final int GAME_RULE_DSS_JSG = 3; // 见四滚
	public static final int GAME_RULE_DSS_FOUR = 4; // 四人玩法
	public static final int GAME_RULE_DSS_THREE = 5; // 三人玩法
	public static final int GAME_RULE_DSS_1000_FD = 6; // 1000封顶
	public static final int GAME_RULE_DSS_2000_FD = 7; // 2000封顶
	public static final int GAME_RULE_DSS_4_TFD = 8; // 4番封顶
	public static final int GAME_RULE_DSS_5_TFD = 9; // 5番封顶
	public static final int GAME_RULE_DSS_6_TFD = 10; // 6番封顶
	public static final int GAME_RULE_DSS_30_YA = 11; // 30起番
	public static final int GAME_RULE_DSS_GGF = 12; // 滚滚番
	public static final int GAME_RULE_DSS_TTF = 13; // 梯梯番
	public static final int GAME_RULE_DSS_NON_TFD = 14; // 不封顶
	public static final int GAME_RULE_DSS_SHUANG_FAN = 15; // 双番
	/////////////////////////////////////////////////////////////////////////////// 斗十四
	public static final int GAME_RULE_DSS_MS_BANKER_PIAO = 1; // 庄家必飘
	public static final int GAME_RULE_DSS_MS_BANKER_X_PIAO = 2; // 庄家选飘
	public static final int GAME_RULE_DSS_MS_4_F_DF = 3; // 4番封顶
	public static final int GAME_RULE_DSS_MS_5_F_DF = 4; // 5番封顶
	/////////////////////////////////////////////////////////////////////////////// 长牌打抓
	public static final int GAME_RULE_DZ_BAO_ZI_PEI = 1; // 包子全赔
	public static final int GAME_RULE_DZ_BAO_ZI_BU_PEI = 2;// 包子不赔
	public static final int GAME_RULE_DZ_BU_FENG_DING = 3;// 不封顶
	public static final int GAME_RULE_DZ_3_FENG_DING = 4; // 3番
	public static final int GAME_RULE_DZ_4_FENG_DING = 5; // 4番
	public static final int GAME_RULE_DZ_GGF = 6; // 滚滚番
	public static final int GAME_RULE_DZ_TTF = 7; // 梯梯番
	public static final int GAME_RULE_DZ_BAO_ZI_PEI_4 = 8; // 包子全赔4 分
	public static final int GAME_RULE_DZ_BAO_ZI_PEI_2 = 9; // 包子全赔2 分

	/////////////////////////////////////////////////////////////////////////////// 山西吕梁
	public static final int GAME_RULE_PING_HU = 1; // 平胡
	public static final int GAME_RULE_DAN_HAO = 2; // 单耗
	public static final int GAME_RULE_SHUANG_HAO = 3; // 双耗
	public static final int GAME_RULE_TE_SHU_HU = 4; // 特殊牌型
	public static final int GAME_RULE_DAI_ZHUANHG = 5; // 带庄
	public static final int GAME_RULE_BAO_GANG = 6; // 点杠包杠
	public static final int GAME_RULE_QIANG_HU = 7; // 强制胡牌
	public static final int GAME_RULE_DA_GUO_ZI = 8; // 打锅子
	public static final int GAME_RULE_DA_BAO_HU = 9; // 点炮包胡

	/////////////////////////////////////////////////////////////////////////////// 耒阳鬼
	public static final int GAME_RULE_RENSHU_FOUR = 1; // 4人
	public static final int GAME_RULE_RENSHU_THREE = 2; // 3人
	public static final int GAME_RULE_RENSHU_TWO = 3; // 2人
	public static final int GAME_RULE_SUIJIFAN_GUI = 4; // 随机翻鬼
	public static final int GAME_RULE_HONGZHONG_GUI = 5; // 红中鬼
	public static final int GAME_RULE_BUSHA_GUI = 6; // 不杀鬼
	public static final int GAME_RULE_SHA_GUI = 7; // 杀鬼翻番
	public static final int GAME_RULE_SUIJIZUO = 8; // 随机坐

	/////////////////////////////////////////////////////////////////////////////// 宜丰麻将
	public static final int GAME_RULE_YF_FOUR = 1; // 4人
	public static final int GAME_RULE_YF_THREE = 2; // 3人
	public static final int GAME_RULE_YF_TWO = 3; // 2人
	public static final int GAME_RULE_GUI_HUO = 4; // 对火
	public static final int GAME_RULE_BU_DUI_HUO = 5; // 不对火
	public static final int GAME_RULE_DUI_PIAO = 6; // 对瓢
	public static final int GAME_RULE_BU_DUI_PIAO = 7; // 不对瓢
	public static final int GAME_RULE_ZHUI_ZHUANG = 8; // 追庄
	public static final int GAME_RULE_BU_ZHUI_ZHUANG = 9; // 不追庄

	/////////////////////////////////////////////////////////////////////////////// 三门峡麻将
	public static final int GAME_RULE_ZI_MO_HU_SMX = 1; // 自摸胡
	public static final int GAME_RULE_DIAN_PAO_HU_SMX = 2; // 点炮胡
	public static final int GAME_RULE_BU_DAI_HUN_SMX = 3; // 不带混
	public static final int GAME_RULE_SHANG_HUN_SMX = 4; // 上混
	public static final int GAME_RULE_YUAN_HUN_SMX = 5; // 原混
	public static final int GAME_RULE_DAI_FENG_SMX = 6; // 带风牌
	public static final int GAME_RULE_BIAO_YAN_SMX = 7; // 表演
	public static final int GAME_RULE_MAI_PAO_SMX = 8; // 买跑
	public static final int GAME_RULE_DAI_GANG_PAO_SMX = 9; // 杠带跑
	public static final int GAME_RULE_AN_JIA_BEI_SMX = 10; // 暗杠加倍
	public static final int GAME_RULE_GANG_SUI_HU_SMX = 11; // 杠随胡走
	public static final int GAME_RULE_HAVE_QI_DUI_SMX = 12; // 可胡七对
	public static final int GAME_RULE_DOUBLE_QI_DUI_SMX = 13; // 七对加倍
	public static final int GAME_RULE_BANKER_JIA_DI_SMX = 14; // 庄家加底

	//////////////////////////////////////////////////////////////////////// 吉林麻将蛋定义
	public static final int GANG_TYPE_YAO_DAN = 1; // 幺蛋
	public static final int GANG_TYPE_JIU_DAN = 2; // 九蛋
	public static final int GANG_TYPE_XI_DAN = 3; // 喜蛋
	public static final int GANG_TYPE_DA_DAN = 4; // 大蛋
	public static final int GANG_TYPE_MING_DAN = 5; // 明蛋
	public static final int GANG_TYPE_AN_DAN = 6; // 暗蛋
	public static final int GANG_TYPE_SAN_FENG_DAN = 7; // 三风蛋
	public static final int GANG_TYPE_XUAN_FENG_DAN = 8; // 旋风蛋
	public static final int GANG_TYPE_XIAO_JI_FEI_DAN = 9; // 小鸡飞蛋

	/////////////////////////////////////////////////////////////////////////////// 吉林长春麻将
	public static final int GAME_RULE_FOUR_CC = 1; // 四人
	public static final int GAME_RULE_THREE_CC = 2; // 三人
	public static final int GAME_RULE_TWO_CC = 3; // 二人
	public static final int GAME_RULE_BAO_PEI_CC = 4; // 未上听点炮包赔
	public static final int GAME_RULE_FEI_DAO_CC = 5; // 小鸡飞蛋
	public static final int GAME_RULE_SAN_FENG_CC = 6; // 三风蛋
	public static final int GAME_RULE_XIA_DAN_ZHAN_CC = 7; // 下蛋算站立
	public static final int GAME_RULE_DAI_QUE_MEN_CC = 8; // 带缺门
	public static final int GAME_RULE_CHONG_BAO_FAN_CC = 9; // 冲宝翻倍
	public static final int GAME_RULE_HAO_QI_FAN_CC = 10; // 豪华七对翻倍
	public static final int GAME_RULE_HU_XU_TING_CC = 11; // 胡牌必须上听
	public static final int GAME_RULE_BU_XIAN_CC = 12; // 飘胡七对不限三色和幺九
	public static final int GAME_RULE_ZHUA_WAN_HUANG_CC = 13; // 抓完荒庄
	public static final int GAME_RULE_LIU_QI_DUN_CC = 14; // 留七墩

	/////////////////////////////////////////////////////////////////////////////// 吉林松原麻将
	public static final int GAME_RULE_FOUR_SY = 1; // 四人
	public static final int GAME_RULE_THREE_SY = 2; // 三人
	public static final int GAME_RULE_TWO_SY = 3; // 二人
	public static final int GAME_RULE_SAN_QI_SY = 4; // 三七夹
	public static final int GAME_RULE_SI_QING_SY = 5; // 四清
	public static final int GAME_RULE_KUAI_BAO_SY = 6; // 快宝
	public static final int GAME_RULE_BAO_PEI_SY = 7; // 未报听点炮点炮包赔三家
	public static final int GAME_RULE_KAN_DUI_BAO_SY = 8; // 坎对宝
	public static final int GAME_RULE_GANG_KAI_SY = 9; // 杠上开花
	public static final int GAME_RULE_QI_DUI_SY = 10; // 七小对
	public static final int GAME_RULE_DUI_BAO_FAN_SY = 11; // 对宝翻倍

	/////////////////////////////////////////////////////////////////////////////// 大连穷胡麻将
	public static final int GAME_RULE_PIAO_HU_DLQH = 1; // 飘胡
	public static final int GAME_RULE_XIAO_JI_DLQH = 2; // 小鸡满天飞
	public static final int GAME_RULE_ZFB_PENG_DLQH = 3; // 中发白可碰
	public static final int GAME_RULE_JIA_HU_DLQH = 4; // 夹胡
	public static final int GAME_RULE_GANG_KAI_DLQH = 5; // 杠上开花加番
	public static final int GAME_RULE_QIANG_GANG_DLQH = 6; // 抢杠胡加番
	public static final int GAME_RULE_20_FEN_DLQH = 7; // 20分
	public static final int GAME_RULE_40_FEN_DLQH = 8; // 40分
	public static final int GAME_RULE_80_FEN_DLQH = 9; // 80分
	public static final int GAME_RULE_160_FEN_DLQH = 10; // 160分
	public static final int GAME_RULE_320_FEN_DLQH = 11; // 320分
	public static final int GAME_RULE_WU_FENG_DLQH = 12; // 无封顶

	/////////////////////////////////////////////////////////////////////////////// 牛牛，玩法
	public static final int GAME_RULE_OX_WUHUANIU = 1; // 1-五花牛
	public static final int GAME_RULE_OX_BOOM = 2; // 1-炸蛋
	public static final int GAME_RULE_OX_WUXIAONIU = 3; // 1-五小牛
	public static final int GAME_RULE_SELECT_OX_VALUSE_ONE = 4; // 选择牛值倍数
	public static final int GAME_RULE_SELECT_OX_VALUSE_TWO = 5;
	public static final int GAME_RULE_PlAYER_TUI_ZHU = 6; // 闲家可推注
	public static final int GAME_RULE_START_FORBID_JOIN = 7; // 游戏开始后禁止加入
	public static final int GAME_RULE_HUA_SE_COMPARE = 8; // 按花色比牌
	public static final int GAME_RULE_EQUAL_PING = 9; // 打和算平
	public static final int GAME_RULE_ZHUANG_WIN = 10; // 算庄家赢
	public static final int GAME_RULE_MAX_ONE_TIMES = 11; // 1倍
	public static final int GAME_RULE_MAX_TWO_TIMES = 12; // 2倍
	public static final int GAME_RULE_MAX_THREE_TIMES = 13; // 3倍
	public static final int GAME_RULE_MAX_FOUR_TIMES = 14; // 4倍
	public static final int GAME_RULE_ONE_TWO = 15; // 1/2
	public static final int GAME_RULE_TWO_FOUR = 16; // 2/4
	public static final int GAME_RULE_FOUR_EIGHT = 17; // 4/8
	public static final int GAME_RULE_CONTORL_START = 18;// 是否控制游戏开始
	public static final int GAME_RULE_FORBID_CHOU_PAI = 19;// 禁止搓牌
	public static final int GAME_RULE_TONG_HUA_SHUN = 20; // 同花顺
	public static final int GAME_RULE_HU_LU_NIU = 21; // 葫芦牛
	public static final int GAME_RULE_TONG_HUA_NIU = 22; // 同花牛
	public static final int GAME_RULE_SHUN_ZI_NIU = 23; // 顺子牛
	public static final int GAME_RULE_THREE_SIX = 24; // 3/6;
	public static final int GAME_RULE_ONE_TO_FIVE = 25; // 1/2/3/4/5
	public static final int GAME_RULE_NO_TUI_ZHU = 26; // 不可以推注
	public static final int GAME_RULE_FIVE_TUI_ZHU = 27; // 5倍
	public static final int GAME_RULE_FIFTEEN_TUI_ZHU = 28; // 15倍
	public static final int GAME_RULE_KSZQZ_OX = 29; // 看四张抢庄
	public static final int GAME_RULE_LLSZ_OX = 30; // 轮庄牛牛
	public static final int GAME_RULE_NNSZ_OX = 31; // 牛牛上庄
	public static final int GAME_RULE_MSZQZ_OX = 32; // 明三张抢庄
	public static final int GAME_RULE_ASZQZ_OX = 33; // 暗三张抢庄
	public static final int GAME_RULE_ZYQZ_OX = 34; // 自由抢庄
	public static final int GAME_RULE_FIVE_TO_TEN = 35;// 5/10
	public static final int GAME_RULE_ROOM_OX = 36; // 房主上庄
	public static final int GAME_RULE_TB_OX = 37; // 通比牛牛

	public static final int GAME_RULE_TWENTY_TUI_ZHU = 100; // 20倍 //33-54
															// 是岳阳牛牛玩法
	/////////////////////////////////////////////////////////////////////////////// 牛牛，经典玩法
	public static final int GAME_RULE_JDOX_FAN_BEN = 33; // 翻倍
	public static final int GAME_RULE_JDOX_PING_BEN = 34; // 平倍
	public static final int GAME_RULE_JDOX_RBOX = 35; // 抢庄牛牛
	public static final int GAME_RULE_JDOX_LBOX = 36; // 轮庄牛牛
	public static final int GAME_RULE_JDOX_ZBOX = 37; // 牛牛坐庄
	public static final int GAME_RULE_JDOX_MBOX = 38; // 牌大坐庄
	public static final int GAME_RULE_JDOX_BBOX = 39; // 霸王庄
	public static final int GAME_RULE_JDOX_MSOX = 40; // 开三张牛牛
	public static final int GAME_RULE_JDOX_KFOX = 41; // 看四张牛牛
	public static final int GAME_RULE_JDOX_NOKEJIN = 42; // 中途不可进
	public static final int GAME_RULE_JDOX_KPTX = 43; // 开牌特效
	public static final int GAME_RULE_JDOX_GDYF = 44; // 固定压分
	public static final int GAME_RULE_JDOX_ONE_FEN = 45; // 1 分
	public static final int GAME_RULE_JDOX_TWO_FEN = 46; // 2 分
	public static final int GAME_RULE_JDOX_THREE_FEN = 47; // 3 分
	public static final int GAME_RULE_JDOX_FOUR_FEN = 48; // 4 分
	public static final int GAME_RULE_JDOX_FIVE_FEN = 49; // 5 分
	public static final int GAME_RULE_JDOX_SIX_FEN = 50; // 6 分
	public static final int GAME_RULE_JDOX_SEVEN_FEN = 51; // 7 分
	public static final int GAME_RULE_JDOX_EIGHT_FEN = 52; // 8 分
	public static final int GAME_RULE_JDOX_NINE_FEN = 53; // 9 分
	public static final int GAME_RULE_JDOX_TEN_FEN = 54; // 10 分

	public static final int GAME_RULE_SI_SHI_DA = 36; // 四十大
	public static final int GAME_RULE_NIU_QI_WU_BEI_SHU = 37; // 牛七无倍数
	public static final int GAME_RULE_NIU_QI_LIANG_BEI = 38; // 牛七两倍
	public static final int GAME_RULE_NIU_JIU_LIANG_BEI = 39; // 牛九两倍
	public static final int GAME_RULE_NIU_JIU_SAN_BEI = 40; // 牛九三倍
	public static final int GAME_RULE_NIU_NIU_SAN_BEI = 41; // 牛十三倍
	public static final int GAME_RULE_NIU_NIU_SI_BEI = 42; // 牛十四倍
	public static final int GAME_RULE_GAME_RULE_PLAYER_FIVE = 43; // 5人
	public static final int GAME_RULE_GAME_RULE_PLAYER_SEVEN = 44; // 7人
	public static final int GAME_RULE_WU_BEI_QIANG_ZHUANG = 45; // 无倍抢庄 0-1倍
	public static final int GAME_RULE_BEI_SHU_QIANG_ZHUANG = 46; // 倍数抢庄 0-4倍
	public static final int GAME_RULE_PAI_DA_DANG_ZHUANG = 47; // 牌大当庄，类似牛牛上庄
	public static final int GAME_RULE_BA_WANG_ZHUANG = 48; // 霸王庄
	public static final int GAME_RULE_BU_KAN_PAI_QIANG_ZHUANG = 49; // 不看牌抢庄
	public static final int GAME_RULE_GU_DING_YA_FEN = 50; // 固定压分
	public static final int GAME_RULE_XIA_ZHU_GU_DING = 51; // 固定压分的分值
	public static final int GAME_RULE_CHAO_SHI_TUO_GUAN = 52; // 超时托管，和固定托管类似
	public static final int GAME_RULE_XIA_ZHU_ONE_TO_FIVE = 53; // 下注 -
																// 1，2，3，4，5
	public static final int GAME_RULE_XIA_ZHU_TWO_TO_TEN = 54; // 下注 - 2，4，
																// 6，8，10
	public static final int GAME_RULE_XIA_ZHU_FIVE_TO_TEN = 55; // 下注 -
																// 5，6，7，8，9，10
	public static final int GAME_RULE_XIA_ZHU_ONE_TO_THREE = 56; // 下注 - 1，2，3
	public static final int GAME_RULE_XIA_ZHU_TWO_TO_FIVE = 57; // 下注 - 2，3，4，5

	/////////////////////////////////////////////////////////////////////////////// 斗板牛
	public static final int GAME_RULE_FOUR_PlAYER = 1; // 4 人
	public static final int GAME_RULE_FIVE_PLAYER = 2; // 5人
	public static final int GAME_RULE_SIX_PLAYER = 3; // 6人
	public static final int GAME_RULE_BANKER_SCORE_ONE = 4; // 上庄分数
	public static final int GAME_RULE_BANKER_SCORE_TWO = 5; // 上庄分数
	public static final int GAME_RULE_JETTON_SCORE_ONE = 6; // 最高60分
	public static final int GAME_RULE_JETTON_SCORE_TWO = 7; // 1/2池底
	public static final int GAME_RULE_JETTON_SCORE_THREE = 8; // 1/3 池底
	public static final int GAME_RULE_THREE_JU_DOWN_BANKER = 9; // 3局可以下庄
	public static final int GAME_RULE_FOUR_JU_DOWN_BANKER = 10; // 4局可以下庄
	public static final int GAME_RULE_LIAN_BANKER = 11; // 连庄
	public static final int GAME_RULE_BU_BANKER = 12; // 补庄
	public static final int GAME_RULE_SHUN_XU_END = 13;// 按顺序结算
	public static final int GAME_RULE_DA_XIAO_END = 14; // 按大小结算
	public static final int GAME_RULE_WU_HUA_NIU = 15; // 五花牛
	public static final int GAME_RULE_ZHA_DAN_NIU = 16; // 炸弹牛
	public static final int GAME_RULE_WU_XIAO_NIU = 17; // 五小牛
	public static final int GAME_RULE_JETTON_ONE_TIEMS = 18;// 下注倍数
	public static final int GAME_RULE_JETTON_TWO_TIEMS = 19;// 下注倍数
	public static final int GAME_RULE_NO_TIAO_BANKER = 20; // 不跳庄
	public static final int GAME_RULE_1000_TIAO_BANKER = 21; // 1000分跳庄
	public static final int GAME_RULE_2000_TIAO_BANKER = 22; // 2000分跳庄

	/////////////////////////////////////////////////////////////////////////////// 斗板牛，托管玩法
	public static final int GAME_RULE_TG_ADD_JETTON = 1; // 下注5分
	public static final int GAME_RULE_TG_ON_BU = 2; // 补庄
	public static final int GAME_RULE_TG_OFF_BU = 3; // 不补庄
	public static final int GAME_RULE_TG_ON_CONTINUE = 4; // 连庄
	public static final int GAME_RULE_TG_OFF_CONTINUE = 5; // 不连庄
	/////////////////////////////////////////////////////////////////////////////// 疯狂牛牛
	public static final int GAME_RULE_JD_FKN = 1; // 经典牛牛
	public static final int GAME_RULE_FKN_JB = 2; // 疯狂加倍
	public static final int GAME_RULE_BANKER_FKN = 3; // 抢庄
	public static final int GAME_RULE_TURN_BANKER_FKN = 4; // 轮庄
	public static final int GAME_RULE_FIXED_FKN = 5; // 固定庄

	/////////////////////////////////////////////////////////////////////////////// 牛牛，托管玩法
	public static final int GAME_RULE_TG_ONE_FEN = 1; // 分数1
	public static final int GAME_RULE_TG_TWO_FEN = 2; // 分数2
	public static final int GAME_RULE_TG_THREE_FEN = 3; // 分数3
	public static final int GAME_RULE_TG_FOUR_FEN = 4; // 分数4
	public static final int GAME_RULE_TG_FIVE_FEN = 5; // 分数5
	public static final int GAME_RULE_TG_SIX_FEN = 6; // 分数6
	public static final int GAME_RULE_TG_SEVEN_FEN = 7; // 分数7
	public static final int GAME_RULE_TG_EIGHT_FEN = 8; // 分数8
	public static final int GAME_RULE_TG_NINE_FEN = 9; // 分数9
	public static final int GAME_RULE_TG_TEN_FEN = 10; // 分数10
	public static final int GAME_RULE_TG_IS_TUI_ZHU = 11; // 推注
	public static final int GAME_RULE_TG_NO_TUI_ZHU = 12; // 不推注
	public static final int GAME_RULE_TG_IS_ROBOT_BANKER = 13; // 抢庄
	public static final int GAME_RULE_TG_NO_BNAKER = 14; // 不抢庄
	public static final int GAME_RULE_TG_ONE_BEI = 15; // 1倍
	public static final int GAME_RULE_TG_TWO_BEI = 16; // 2倍
	public static final int GAME_RULE_TG_THREE_BEI = 17; // 3倍
	public static final int GAME_RULE_TG_FOUR_BEI = 18; // 4倍
	public static final int GAME_RULE_TG_FIF_FEN = 19; // 分数15
	public static final int GAME_RULE_TG_TWN_FEN = 20; // 分数20

	/////////////////////////////////////////////////////////////////////////////// 快乐牛牛
	public static final int GAME_RULE_KL_DI_ONE = 1; // 分数1
	public static final int GAME_RULE_KL_DI_TWO = 2; // 分数5
	public static final int GAME_RULE_KL_DI_THREE = 3; // 分数10
	public static final int GAME_RULE_KL_BANKER = 4; // 抢庄
	public static final int GAME_RULE_KL_TURN_BANKER = 5; // 轮庄
	public static final int GAME_RULE_KL_FIXED = 6; // 固定庄
	public static final int GAME_RULE_KL_NO_OX_OFF = 7;// 无牛下庄
	public static final int GAME_RULE_KL_TWO_OFF = 8; // 两把下庄
	public static final int GAME_RULE_KL_BANKER_OFF = 9; // 闲家拿牛牛，庄家下庄
	public static final int GAME_RULE_KL_HAND_START = 10; // 手动开始
	public static final int GAME_RULE_KL_FOUR_START = 11; // 满四人开始
	public static final int GAME_RULE_KL_FIVE_START = 12; // 满五人开始
	public static final int GAME_RULE_KL_SIX_START = 13; // 满六人开始
	public static final int GAME_RULE_KL_MIN_FORBID_JOIN = 14;// 游戏开始后禁止加入游戏
	public static final int GAME_RULE_KL_FORBID_CHOU_PAI = 15;// 禁止搓牌
	public static final int GAME_RULE_KL_NO_LAI_ZI = 16; // 无
	public static final int GAME_RULE_KL_LAI_ZI = 17; // 大小王
	public static final int GAME_RULE_KL_DIAN_HUA_TSHI = 18; // 点与花同时显示
	public static final int GAME_RULE_KL_FIRST_HUA_HOU_DIAN = 19;// 先花后点显示
	public static final int GAME_RULE_KL_MODE = 20; // 模式
	public static final int GAME_RULE_KL_ROB_ONE = 21; // 分数1
	public static final int GAME_RULE_KL_ROB_TWO = 22; // 分数2
	public static final int GAME_RULE_KL_ROB_THREE = 23; // 分数3
	public static final int GAME_RULE_KL_TUI_ZHU_ONE = 24; // 推注无
	public static final int GAME_RULE_KL_TUI_ZHU_TWO = 25; // 推注5
	public static final int GAME_RULE_KL_TUI_ZHU_THREE = 26; // 推注10
	public static final int GAME_RULE_KL_TUI_ZHU_FOUR = 27; // 推注15
	public static final int GAME_RULE_KL_TUI_ZHU_FIVE = 28; // 推注20
	public static final int GAME_RULE_KL_LIMIT_LOW_JETTON = 29; // 限制降注
	public static final int GAME_RULE_KL_NO_TIMES = 30; // 无倍数
	public static final int GAME_RULE_KL_SEVEN_START = 31;// 满七人开始
	public static final int GAME_RULE_KL_EIGHT_START = 32;// 满八人开始

	/////////////////////////////////////////////////////////////////////////////// 快乐江西牛牛
	public static final int GAME_RULE_KLJX_ONE_TWO = 1; // 分数1/2
	public static final int GAME_RULE_KLJX_TWO_FOUR = 2; // 分数1/2
	public static final int GAME_RULE_KLJX_THREE_SIX = 3; // 分数1/2
	public static final int GAME_RULE_KLJX_FOUR_EIGHT = 4; // 分数1/2
	public static final int GAME_RULE_KLJX_FIVE_TEN = 5; // 分数1/2
	public static final int GAME_RULE_KLJX_JETTON_ONE_TIME = 6;// 下注倍数
	public static final int GAME_RULE_KLJX_JETTON_TWO_TIME = 7;// 下注倍数
	public static final int GAME_RULE_KLJX_HAND_START = 8; // 手动开始
	public static final int GAME_RULE_KLJX_FOUR_START = 9; // 满四人开始
	public static final int GAME_RULE_KLJX_FIVE_START = 10; // 满五人开始
	public static final int GAME_RULE_KLJX_SIX_START = 11; // 满六人开始
	public static final int GAME_RULE_KLJX_MIN_FORBID_JOIN = 12;// 游戏开始后禁止加入游戏
	public static final int GAME_RULE_KLJX_FORBID_CHOU_PAI = 13;// 禁止搓牌
	public static final int GAME_RULE_KLJX_LAI_ZI = 14; // 大小王
	public static final int GAME_RULE_KLJX_ROB_ONE = 15; // 分数1
	public static final int GAME_RULE_KLJX_ROB_TWO = 16; // 分数2
	public static final int GAME_RULE_KLJX_ROB_THREE = 17; // 分数3
	public static final int GAME_RULE_KLJX_ROB_FOUR = 18; // 抢庄倍数
	public static final int GAME_RULE_KLJX_TUI_ZHU_ONE = 19; // 推注无
	public static final int GAME_RULE_KLJX_TUI_ZHU_TWO = 20; // 推注5
	public static final int GAME_RULE_KLJX_TUI_ZHU_THREE = 21; // 推注10
	public static final int GAME_RULE_KLJX_TUI_ZHU_FOUR = 22; // 推注15
	public static final int GAME_RULE_KLJX_TUI_ZHU_FIVE = 23; // 推注20
	public static final int GAME_RULE_KLJX_LIMIT_LOW_JETTON = 24; // 限制降注
	public static final int GAME_RULE_KLJX_BUY_JETTON = 25; // 买码玩法
	public static final int GAME_RULE_KLJX_SHU_ZI = 26; // 顺子牛
	public static final int GAME_RULE_KLJX_WU_HUA = 27; // 五花牛
	public static final int GAME_RULE_KLJX_TONG_HUAN = 28; // 同花牛
	public static final int GAME_RULE_KLJX_HU_LU = 29; // 葫芦牛
	public static final int GAME_RULE_KLJX_ZHA_DAN = 30; // 炸弹牛
	public static final int GAME_RULE_KLJX_JIANG_XI = 31; // 江西牛
	public static final int GAME_RULE_KLJX_SEVEN_START = 32; // 满七人开始
	public static final int GAME_RULE_KLJX_EIGHT_START = 33; // 满八人开始
	public static final int GAME_RULE_KLJX_WU_XIAO_NIU = 34; // 五小牛
	public static final int GAME_RULE_KLJX_TUI_ZHU = 35; // 无限推注

	/////////////////////////////////////////////////////////////////////////////// 郴州五小牛
	/////////////////////////////////////////////////////////////////////////////// 牛牛，玩法
	public static final int GAME_RULE_WX_SIX_PLAYER = 1; // 6人
	public static final int GAME_RULE_WX_EIGHT_PLAYER = 2; // 8人
	public static final int GAME_RULE_WX_TEN_PLAYER = 3; // 10人
	public static final int GAME_RULE_WX_MPQZ = 4; // 明牌抢庄
	public static final int GAME_RULE_WX_NNSZ = 5; // 牛牛上庄
	public static final int GAME_RULE_WX_ZYQZ = 6; // 自由抢庄
	public static final int GAME_RULE_WX_GDZJ = 7; // 固定庄家
	public static final int GAME_RULE_WX_HUA_PAI = 8; // 有花牌
	public static final int GAME_RULE_WX_NO_HUA_PAI = 9; // 没有花牌
	public static final int GAME_RULE_WX_JETTON_ONE = 10; // 1
	public static final int GAME_RULE_WX_JETTON_TWO = 11; // 2
	public static final int GAME_RULE_WX_JETTON_THREE = 12; // 3
	public static final int GAME_RULE_WX_JETTON_FOUR = 13; // 4
	public static final int GAME_RULE_WX_TUI_ZHU_TWO = 14; // 推注2倍
	public static final int GAME_RULE_WX_TUI_ZHU_THREE = 15; // 推注3倍
	public static final int GAME_RULE_WX_TUI_ZHU_FIVE = 16; // 推注5倍
	public static final int GAME_RULE_WX_TUI_ZHU_NO = 17; // 推注无
	public static final int GAME_RULE_WX_ROB_ONE = 18; // 抢庄1
	public static final int GAME_RULE_WX_ROB_TWO = 19; // 抢庄2
	public static final int GAME_RULE_WX_STYC = 24; // 三条有凑
	public static final int GAME_RULE_WX_THSH = 25; // 同花顺
	public static final int GAME_RULE_WX_WDL = 26; // 五大龙
	public static final int GAME_RULE_WX_WXL = 27; // 五小龙
	public static final int GAME_RULE_WX_BOOM = 28; // 炸弹
	public static final int GAME_RULE_WX_HULU = 20; // 葫芦
	public static final int GAME_RULE_WX_THOX = 21; // 同花
	public static final int GAME_RULE_WX_WHOX = 22; // 五花牛
	public static final int GAME_RULE_WX_SHZI = 23; // 顺子
	public static final int GAME_RULE_WX_ROB_THREE = 29; // 抢庄3
	public static final int GAME_RULE_WX_ROB_FOUR = 30; // 抢庄4
	public static final int GAME_RULE_WX_TIMES_ONE = 31; // 牛牛4倍
	public static final int GAME_RULE_WX_TIMES_TWO = 32; // 牛牛3倍
	public static final int GAME_RULE_WX_CH_PAI = 33; // 禁止搓牌
	public static final int GAME_RULE_WX_FOUR_START = 34;// 四人开始
	public static final int GAME_RULE_WX_FIVE_START = 35;// 五人开始
	public static final int GAME_RULE_WX_SIX_START = 36;// 六人开始
	public static final int GAME_RULE_WX_STYC_HS = 37; // 三条有凑比花色
	public static final int GAME_RULE_WX_STYC_XIAO = 38; // 三条有凑小
	public static final int GAME_RULE_WX_FIVE_WXN = 39;// 有五算五小牛
	public static final int GAME_RULE_WX_TUI_ZHU_TEN = 40; // 推注10
	public static final int GAME_RULE_WX_FORBIN_JOIN_GAME = 41; // 禁止加入游戏
	public static final int GAME_RULE_WX_TWO_START = 42; // 满两2开始
	public static final int GAME_RULE_WX_ALLOW_CH = 43; // 允许搓牌
	public static final int GAME_RULE_WX_CH_PAI_NO_NUM = 44; // 搓牌没有数字
	public static final int GAME_RULE_WX_CH_PAI_NUM = 45; // 搓牌有数据
	/////////////////////////////////////////////////////////////////////////////// 岳阳斗牛
	public static final int GAME_RULE_YYOX_TIMES = 1; // 翻倍
	public static final int GAME_RULE_YYOX_NO_TIMES = 2; // 平倍
	public static final int GAME_RULE_YYOX_ROB_BANKER = 3; // 抢庄斗牛
	public static final int GAME_RULE_YYOX_TURN_BANKER = 4; // 轮庄斗牛
	public static final int GAME_RULE_YYOX_XO_BANKER = 5; // 牛牛坐庄
	public static final int GAME_RULE_YYOX_MAX_BANKER = 6; // 牌大坐庄
	public static final int GAME_RULE_YYOX_BW_BANKER = 7; // 霸王庄
	public static final int GAME_RULE_YYOX_MID_JION = 8; // 中途可进
	public static final int GAME_RULE_YYOX_CARD_EFFECTS = 9; // 开牌特效
	public static final int GAME_RULE_YYOX_GU_DING_FEN = 10; // 固定压分
	public static final int GAME_RULE_YYOX_OPEN_THREE = 11; // 先开三张
	public static final int GAME_RULE_YYOX_LOOK_FOUR = 12; // 看四张
	public static final int GAME_RULE_YYOX_JETTON = 13; // 下注分数
	/////////////////////////////////////////////////////////////////////////////// 怀化牛牛，玩法
	public static final int GAME_RULE_HHUA_SIX_PLAYER = 1; // 6人
	public static final int GAME_RULE_HHUA_EIGHT_PLAYER = 2; // 8人
	public static final int GAME_RULE_HHUA_MPFQZ = 3; // 看四抢庄
	public static final int GAME_RULE_HHUA_MPSQZ = 4; // 明三抢庄
	public static final int GAME_RULE_HHUA_ZYQZ = 5; // 自由抢庄
	public static final int GAME_RULE_HHUA_LLSZ = 6; // 轮流上庄
	public static final int GAME_RULE_HHUA_GDZJ = 7; // 固定庄家
	public static final int GAME_RULE_HHUA_JETTON_ONE = 8; // 1/2
	public static final int GAME_RULE_HHUA_JETTON_TWO = 9; // 2/4
	public static final int GAME_RULE_HHUA_JETTON_THREE = 10; // 4/8
	public static final int GAME_RULE_HHUA_JETTON_FOUR = 11; // 5/10/15
	public static final int GAME_RULE_HHUA_JETTON_FIVE = 12; // 5/10/15/20
	public static final int GAME_RULE_HHUA_TUI_ZHU_FIVE = 13; // 推注5倍
	public static final int GAME_RULE_HHUA_TUI_ZHU_TEN = 14; // 推注10倍
	public static final int GAME_RULE_HHUA_TUI_ZHU_TWN = 15; // 推注20倍
	public static final int GAME_RULE_HHUA_TUI_ZHU = 16; // 推注
	public static final int GAME_RULE_HHUA_ROB_ONE = 17; // 抢庄1
	public static final int GAME_RULE_HHUA_ROB_TWO = 18; // 抢庄2
	public static final int GAME_RULE_HHUA_ROB_THREE = 19; // 抢庄3
	public static final int GAME_RULE_HHUA_ROB_FOUR = 20; // 抢庄4
	public static final int GAME_RULE_HHUA_THSH = 21; // 同花顺
	public static final int GAME_RULE_HHUA_WXOX = 22; // 五小牛
	public static final int GAME_RULE_HHUA_BOOM = 23; // 炸弹
	public static final int GAME_RULE_HHUA_HULU = 24; // 葫芦
	public static final int GAME_RULE_HHUA_THOX = 25; // 同花
	public static final int GAME_RULE_HHUA_WHJOX = 26; // 金花牛
	public static final int GAME_RULE_HHUA_WHYOX = 27; // 银花牛
	public static final int GAME_RULE_HHUA_SHZI = 28; // 顺子
	public static final int GAME_RULE_HHUA_FD_30 = 29; // 30
	public static final int GAME_RULE_HHUA_FD_50 = 30; // 50
	public static final int GAME_RULE_HHUA_FD_100 = 31;// 100
	public static final int GAME_RULE_HHUA_FD_NO = 32;// 无
	public static final int GAME_RULE_HHUA_TIMES_ONE = 33; // 牛牛4倍
	public static final int GAME_RULE_HHUA_TIMES_TWO = 34; // 牛牛3倍
	public static final int GAME_RULE_HHUA_CH_PAI = 35; // 允许搓牌
	public static final int GAME_RULE_HHUA_HAND_START = 36; // 手动开始
	public static final int GAME_RULE_HHUA_FOUR_START = 37; // 满四人开始
	public static final int GAME_RULE_HHUA_SIX_START = 38; // 满6人开始
	public static final int GAME_RULE_HHUA_EIGHT_START = 39; // 满八人开始
	public static final int GAME_RULE_HHUA_MIN_ALLOW_JOIN = 40;// 允许加入游戏
	public static final int GAME_RULE_HHUA_HUA_SE_COMPARE = 41; // 按花色比牌
	public static final int GAME_RULE_HHUA_EQUAL_PING = 42; // 打和算平
	public static final int GAME_RULE_HHUA_ZHUANG_WIN = 43; // 算庄家赢
	public static final int GAME_RULE_HHUA_TUI_ZHU_NO = 44; // 无推注
	public static final int GAME_RULE_HHUA_JETTON_SIX = 45; // 下注1/2/3/4/5

	/////////////////////////////////////////////////////////////////////////////// 十点半
	public static final int GAME_RULE_SDB_HAND_START = 1; // 手动开始
	public static final int GAME_RULE_SDB_SIX_START = 2; // 满六人开始
	public static final int GAME_RULE_SDB_SEVEN_START = 3; // 满七人开始
	public static final int GAME_RULE_SDB_EIGHT_START = 4; // 满八人开始
	public static final int GAME_RULE_SDB_MIN_FORBID_JOIN = 5;// 游戏开始后禁止加入游戏
	public static final int GAME_RULE_SDB_CARRY_300 = 6; // 携带300分
	public static final int GAME_RULE_SDB_CARRY_400 = 7; // 携带400分
	public static final int GAME_RULE_SDB_ROB_BANKER = 8; // 抢庄
	public static final int GAME_RULE_SDB_TURN_BANKER = 9; // 轮庄
	public static final int GAME_RULE_SDB_LOOK_BANKER_FCARD = 10;// 起手看庄家牌
	public static final int GAME_RULE_SDB_KING_BANKER = 11; // 霸王庄
	public static final int GAME_RULE_SDB_KING_ROB_B = 12; // 霸王抢庄
	public static final int GAME_RULE_SDB_KING_TURN_B = 13; // 霸王轮庄
	public static final int GAME_RULE_SDB_KING_BAO_LIANG = 14; // 爆牌亮牌
	public static final int GAME_RULE_SDB_KING_BAO_NO_LIANG = 15;// 爆牌不亮牌
	public static final int GAME_RULE_SDB_YAO_SHAI_ZI = 16;// 摇色子

	/////////////////////////////////////////////////////////////////////////////// 21点，玩法
	/////////////////////////////////////////////////////////////////////////////// 0是第一位，
	/////////////////////////////////////////////////////////////////////////////// 1-11从低到高
	public static final int GAME_RULE_EVERYONE_ROBOT_BANKER = 1; // 1-每局抢庄
	public static final int GAME_RULE_WUXILONG_HUAN_BANKER = 2; // 1-五小龙换庄
	public static final int GAME_RULE_LUN_BNAKER = 3; // 1-轮庄
	public static final int GAME_RULE_DING_BNAKER = 4; // 固定庄
	public static final int GAME_RULE_FIRST_ROBOT_BANKER = 5; // 首局抢庄后五小龙换庄
	public static final int GAME_RULE_NO_LEI_ZHU = 6; // 不能垒注
	public static final int GAME_RULE_MAX_TWENTY_FOUR = 7; // 24分封顶
	public static final int GAME_RULE_MAX_FOURTY_EIGHT = 8; // 48分封顶
	public static final int GAME_RULE_MID_JOIN = 9; // 中途可进

	/////////////////////////////////////////////////////////////////////////////// 跑得快，玩法
	/////////////////////////////////////////////////////////////////////////////// 0是第一位，
	/////////////////////////////////////////////////////////////////////////////// 1-11从低到高

	public static final int GAME_RULE_THREE_PLAY = 1; // 3 人玩
	public static final int GAME_RULE_TWO_PLAY = 2; // 2 人玩
	public static final int GAME_RULE_FOUR_PLAY = 3; // 4 人玩
	public static final int GAME_RULE_DISPLAY_CARD = 4; // 显示牌
	public static final int GAME_RULE_NO_DISPLAY_CARD = 5; // 不显示牌
	public static final int GAME_RULE_SHOU_JU_HEITAO_SAN = 6; // 首局先出黑桃3
	public static final int GAME_RULE_BI_XU_GUAN = 7; // 必须管
	public static final int GAME_RULE_KE_BU_YAO = 8; // 可不要
	public static final int GAME_RULE_HONGTAO10_ZANIAO = 9; // 红桃10扎鸟
	public static final int GAME_RULE_FANG_ZOU_BAOPEI = 10; // 放走包赔
	public static final int GAME_RULE_FOUR_DAI_SAN = 11; // 可四带三
	public static final int GAME_RULE_KE_FAN_DE = 12; // 可反的
	public static final int GAME_RULE_BOOM = 13; // 有炸弹
	public static final int GAME_RULE_FIFTEEN_COUNT = 14; // 15张
	public static final int GAME_RULE_SIXTEEN_COUNT = 15; // 16张
	public static final int GAME_RULE_YIFU_COUNT = 16; // 一副牌
	public static final int GAME_RULE_LIANGFU_COUNT = 17; // 两副牌
	public static final int GAME_RULE_THREE_LOST_NENG_JIE = 18; // 最后一手三张少带能接
	public static final int GAME_RULE_ZHADAN_ZHAIAO = 19; // 红桃10扎鸟
	public static final int GAME_RULE_ZHADAN_BUKECHAI = 20; // 炸弹不可拆
	public static final int GAME_RULE_RAND_SHOU_CHU = 22; // 随机出牌
	public static final int GAME_RULE_KKK_BOOM = 23; // 3K炸弹
	public static final int GAME_RULE_OFFLINE_NO_AUTO = 24; // 断线不自动过
	public static final int GAME_RULE_HONGTAO10_ZANIAO_ADD_FIVE = 25;// 红桃10扎鸟加5分
	public static final int GAME_RULE_HONGTAO10_ZANIAO_ADD_TEN = 26;// 红桃10扎鸟加10分
	public static final int GAME_RULE_NO_ZHA_NIAO = 27;// 不扎鸟
	public static final int GAME_RULE_KUAI_SU = 28;// 快速过牌
	public static final int GAME_RULE_FANG_ZUO_BI = 29;// 防作弊
	public static final int GAME_RULE_QIE_PAI = 30;// 切牌
	public static final int GAME_RULE_PIAO_SCORE_ONE = 31;// 飘分
	public static final int GAME_RULE_PIAO_SCORE_TWO = 32;// 飘分
	public static final int GAME_RULE_PIAO_SCORE_THREE = 33;// 飘分
	public static final int GAME_RULE_PEOPLE_LESS = 35;// 少人模式
	public static final int GAME_RULE_WIN_SHOU_CHU = 36; // 赢家先出
	public static final int GAME_RULE_SHOU_JU_RAND = 37; // 首出无要求
	public static final int GAME_RULE_HEITAO_SAN = 38; // 每局黑桃三先出
	public static final int GAME_RULE_FOUR_DAI_TWO = 39; // 可四带二
	public static final int GAME_RULE_CHUN_TIAN = 40; // 可春天
	public static final int GAME_RULE_THREE_LOST_CHU = 41; // 最后一手三张能出
	public static final int GAME_RULE_PLANE_LOST_NENG_JIE = 42; // 最后一手飞机少带能接
	public static final int GAME_RULE_PLANE_LOST_NENG_CHU = 43; // 最后一手飞机少带能出
	public static final int GAME_RULE_AAA_BOOM = 44; // 3K炸弹
	public static final int GAME_RULE_QIANG_GUAN = 45; // 抢关
	public static final int GAME_RULE_MING_PAI_PRV = 46; // 发牌前明牌
	public static final int GAME_RULE_MING_PAI_NEXT = 47; // 发牌后明牌
	public static final int GAME_RULE_CAL_SCORE_ONE = 48; // 剩牌算分
	public static final int GAME_RULE_CAL_SCORE_TWO = 49; // 固定算分
	public static final int GAME_RULE_BOOM_FOUR_AAA = 50; // 四张和AAA
	public static final int GAME_RULE_BOOM_FOUR_TAKE_ONE = 51; // 四带一
	public static final int GAME_RULE_BOOM_FOUR_AAAA = 52; // 四张（AAAA）
	public static final int GAME_RULE_BOOM_LIMIT_NO = 53;// 不翻倍
	public static final int GAME_RULE_BOOM_LIMIT_ONE = 54;// 一炸封顶
	public static final int GAME_RULE_BOOM_LIMIT_TWO = 55;// 两炸封顶
	public static final int GAME_RULE_BOOM_LIMIT_THREE = 56;// 三炸封顶
	public static final int GAME_RULE_DOUBLE_LINK_TWO = 57;// 两连对
	public static final int GAME_RULE_DOUBLE_LINK_THREE = 58;// 三连对
	public static final int GAME_RULE_THREE_TAKE_TWO = 59;// 三带一对
	public static final int GAME_RULE_FOUR_TAKE_ONE = 60;// 四带一单
	///////////////////////////////////////////////////////////////////////////////////////
	public static final int GAME_RULE_SHOU_JU_HEITAO_WU = 1; // 首局先出黑桃5
	public static final int GAME_RULE_WIN_SHOUCHU = 2; // 赢家先出
	public static final int GAME_RULE_DISPLAY_CARD_SC = 3; // 显示
	public static final int GAME_RULE_NO_DISPLAY_CARD_SC = 4; // 不显示牌
	public static final int GAME_RULE_BOOM_THREE = 5; // 3张为炸弹
	public static final int GAME_RULE_BOOM_FOUR = 6; // 4张为炸弹
	public static final int GAME_RULE_LIAN_DUI_TWO = 7;// 两连对
	public static final int GAME_RULE_LIAN_DUI_THREE = 8;// 三连对
	public static final int GAME_RULE_PLAYER_TWO = 9;// 两人
	public static final int GAME_RULE_PLAYER_THREE = 10;// 三人
	public static final int GAME_RULE_PLAYER_FOUR = 11;// 四人
	public static final int GAME_RULE_SNA_TOUR_FIVE = 12;// 喜钱5分
	public static final int GAME_RULE_SNA_TOUR_TEN = 13;// 喜钱10分
	public static final int GAME_RULE_MIN_CARD_SHOU_CHU = 14;// 最小牌先出
	public static final int GAME_RULE_QUAN_DA = 15;// 全大
	public static final int GAME_RULE_QUAN_XIAO = 16;//
	public static final int GAME_RULE_QUAN_DAN = 17;//
	public static final int GAME_RULE_QUAN_SHUANG = 18;//
	public static final int GAME_RULE_QUAN_HEI = 19;//
	public static final int GAME_RULE_QUAN_HONG = 20;//
	public static final int GAME_RULE_PLANE = 21;//
	public static final int GAME_RULE_PLANE_NO = 22;//
	public static final int GAME_RULE_MING_TANG_10 = 23; // 名堂+10分
	public static final int GAME_RULE_MING_TANG_20 = 24; // 名堂+20分
	public static final int GAME_RULE_FANG_ZUO_BI_SC = 25;// 防作弊
	public static final int GAME_RULE_FOUR_FIVE = 26;// 四个五
	public static final int GAME_RULE_FOUR_A = 27;// 四个A
	public static final int GAME_RULE_FOUR_K = 28;// 四个6到四个K
	/////////////////////////////////////////////////////////////////////////////////////// 广东麻将玩法

	////////////////////////////////////////////////////////////////////////////////////// 斗地主玩法
	public static final int GAME_RULE_QIANG_DIZHU = 1; // 抢地主
	public static final int GAME_RULE_JIAO_FEN = 2; // 叫分
	public static final int GAME_RULE_JIAO_DI_ZHU = 3; // 叫地主
	public static final int GAME_RULE_TWO_PLAY_DDZ = 4; // 2 人玩
	public static final int GAME_RULE_WIN_CALL_BANKER = 5; // 赢家叫地主
	public static final int GAME_RULE_RANDOM_CALL_BANKER = 6; // 随机叫地主
	public static final int GAME_RULE_MUST_CALL_BANKER_0 = 7; // 四2必叫
	public static final int GAME_RULE_MUST_CALL_BANKER_1 = 8; // 双王必叫
	public static final int GAME_RULE_MUST_CALL_BANKER_2 = 9; // 单王双2必叫
	public static final int GAME_RULE_LIMIT_FOUR_BOMB = 10; // 炸弹限制
	public static final int GAME_RULE_LIMIT_FIVE_BOMB = 11; // 炸弹限制
	public static final int GAME_RULE_LIMIT_SIX_BOMB = 12; // 炸弹限制
	public static final int GAME_RULE_DIPAI_DOUBLE = 13; // 炸弹限制
	public static final int GAME_RULE_ADD_TIME = 14; // 是否加倍

	////////////////////////////////////////////////////////////////////////////////////// 六盘水2人斗地主玩法
	public static final int GAME_RUL_LIMIT_24_LPS2 = 1; // 24倍封顶
	public static final int GAME_RUL_LIMIT_48_LPS2 = 2; // 48倍封顶
	public static final int GAME_RUL_LIMIT_96_LPS2 = 3; // 96倍封顶
	public static final int GAME_RUL_LIMIT_192_LPS2 = 4; // 192倍封顶
	public static final int GAME_RUL_LIMIT_NOT_LPS2 = 5; // 不封顶
	public static final int GAME_RULE_NOT_TAKE_LPS2 = 6; // 不带让牌
	public static final int GAME_RULE_TAKE_2_LPS2 = 7; // 可让两张
	public static final int GAME_RULE_TAKE_3_LPS2 = 8; // 可让三张
	public static final int GAME_RULE_TAKE_4_LPS2 = 9; // 可让四张
	public static final int GAME_RULE_NOT_TIMES_LPS2 = 10; // 不带加倍
	public static final int GAME_RULE_LSAT_TIMES_LPS2 = 11; // 底牌翻倍

	////////////////////////////////////////////////////////////////////////////////////// 六盘水3人斗地主玩法
	public static final int GAME_RUL_LIMIT_24_LPS3 = 1; // 24倍封顶
	public static final int GAME_RUL_LIMIT_48_LPS3 = 2; // 48倍封顶
	public static final int GAME_RUL_LIMIT_96_LPS3 = 3; // 96倍封顶
	public static final int GAME_RUL_LIMIT_192_LPS3 = 4; // 192倍封顶
	public static final int GAME_RUL_LIMIT_NOT_LPS3 = 5; // 不封顶
	public static final int GAME_RULE_FREE_TIMES_LPS3 = 6; // 自由加倍
	public static final int GAME_RULE_FARMERS_FIRST_LPS3 = 7; // 农民优先
	public static final int GAME_RULE_NOT_TIMES_LPS3 = 8; // 不能加倍
	public static final int GAME_RULE_MUST_CALL_LPS3 = 9; // 双王四个二必叫
	public static final int GAME_RULE_SWAP_THREE_LPS3 = 10; // 换三张
	public static final int GAME_RULE_NOT_FOUR_TO_TWO_LPS3 = 11; // 不能四带二
	public static final int GAME_RULE_PILE_SEND_LPS3 = 12; // 分摞发牌
	public static final int GAME_RULE_SHUTUP_LPS3 = 13; // 禁言
	public static final int GAME_RULE_MEMORY_ROBOT_LPS3 = 14; // 记牌器

	// 陕西三代
	public static final int MAX_COUNT_NOT_3 = 17; // 不带三最大数目手牌
	public static final int MAX_COUNT_MAI_4 = 16; // 埋四最大数目手牌
	public static final int MAX_COUNT_FOUR = 13; // 四人最大数目手牌
	public static final int CARD_COUNT_PDK_NOT_3 = 51; // 陕西三代不带3和大小王
	public static final int CARD_COUNT_PDK_MAI_4 = 52; // 陕西三代不带大小王
	public static final int CARD_COUNT_PDK_SXSD = 54; // 陕西三代不带3和大小王
	////////////////////////////////////////////////////////////////////////////////////// 陕西三代玩法
	public static final int GAME_RULE_THREE_SXSD = 1; // 3人
	public static final int GAME_RULE_FOUR_SXSD = 2; // 4人
	public static final int GAME_RULE_NOT_TKAE_SXSD = 3; // 不要方块3
	public static final int GAME_RULE_MAI_FOUR_SXSD = 4; // 埋四张
	public static final int GAME_RULE_BOMB_AWARD_SXSD = 5; // 炸弹有分
	public static final int GAME_RULE_BOMB_NO_AWARD_SXSD = 6; // 炸弹没分
	public static final int GAME_RULE_AWARD_10_SXSD = 7; // 10分
	public static final int GAME_RULE_AWARD_5_SXSD = 8; // 5分
	public static final int GAME_RULE_AWARD_2_SXSD = 9; // 2分
	public static final int GAME_RULE_YING_PAI_SXSD = 10; // 硬牌
	public static final int GAME_RULE_RUAN_PAI_SXSD = 11; // 软牌
	public static final int GAME_RULE_22_TO_33_SXSD = 12; // 22比见33
	public static final int GAME_RULE_222_TO_333_SXSD = 13; // 222比见333
	public static final int GAME_RULE_SMALL_TO_BIG_SXSD = 14; // 小炸弹比见大炸弹
	public static final int GAME_RULE_TAKE_FLY_SXSD = 15; // 带飞机
	public static final int GAME_RULE_SD_NOT_TAKE_3_SXSD = 16; // 三代不能带3
	public static final int GAME_RULE_SDE_WIN_SDD_SXSD = 17; // 三代二能压三代对
	public static final int GAME_RULE_HAND_PASS_SXSD = 18; // 手动过牌

	// 黑桃三
	public static final int GAME_RULE_MING_HTS = 1; // 明3
	public static final int GAME_RULE_AN_HTS = 2; // 暗3

	//////////////////////////////////////////////////////////////////////// 炸金花
	public static final int GAME_RULE_ZJH_ROUND_20 = 1; // 20回合封顶
	public static final int GAME_RULE_ZJH_ROUND_30 = 2; // 30回合封顶
	public static final int GAME_RULE_ZJH_ROUND_40 = 3; // 40回合封顶
	public static final int GAME_RULE_ZJH_235_BAPZI_YES = 4; // 235可吃豹子
	public static final int GAME_RULE_ZJH_235_BAPZI_NO = 5; // 235不可吃豹子
	public static final int GAME_RULE_ZJH_CELL_ONE = 6; // 底注一分
	public static final int GAME_RULE_ZJH_CELL_TWO = 7; // 底注二分
	public static final int GAME_RULE_ZJH_CELL_THREE = 8; // 底注三分
	public static final int GAME_RULE_ZJH_CELL_FOUR = 9; // 底注四分
	public static final int GAME_RULE_ZJH_CELL_FIVE = 10; // 底注五分
	public static final int GAME_RULE_ZJH_JETTON_10 = 11; // 10注封顶
	public static final int GAME_RULE_ZJH_JETTON_20 = 12; // 20注封顶
	public static final int GAME_RULE_ZJH_JETTON_30 = 13; // 30注封顶

	public static final int GAME_RULE_ZJH_COMPARE_FIRST_LOSE = 14; // 先比先输
	public static final int GAME_RULE_ZJH_COMPARE_HUASE = 15; // 按花色比
	public static final int GAME_RULE_ZJH_BAOZI_HAVE_MONERY = 16; // 豹子手喜钱
	public static final int GAME_RULE_ZJH_CONTORL_START = 17;
	public static final int GAME_RULE_ZJH_COMPARE_CARD_ROUND_ONE = 19;// 比牌轮数
	public static final int GAME_RULE_ZJH_JETTON_WIN_NEXT = 21;// 赢家下家优先
	public static final int GAME_RULE_ZJH_JETTON_NEXT = 22;// 轮次优先
	public static final int GAME_RULE_ZJH_XI_QIAN_TIMES_ONE = 23;// 底注*10
	public static final int GAME_RULE_ZJH_XI_QIAN_TIMES_TWO = 24;// 底注*5
	public static final int GAME_RULE_ZJH_XI_QIAN_TIMES_THREE = 25;// 底注*1
	public static final int GAME_RULE_ZJH_JETTON_FOUR = 26; // 20回合封顶
	public static final int GAME_RULE_ZJH_235_AAA = 27; // 235只吃AAA
	public static final int GAME_RULE_ZJH_SHUN_ZI_ONE = 28; // 123大于JQK
	public static final int GAME_RULE_ZJH_SHUN_ZI_TWO = 29; // JQK大于123
	public static final int GAME_RULE_ZJH_TRUSTEE_NO = 30; // 不可托管
	public static final int GAME_RULE_ZJH_TRUSTEE_JETTON = 32; // 自动下注
	public static final int GAME_RULE_ZJH_TRUSTEE_GIVE_UP = 33; // 自动弃牌
	public static final int GAME_RULE_ZJH_JETTON_5 = 34; // 5注封顶
	public static final int GAME_RULE_ZJH_ROUND_10 = 35; // 10回合封顶
	public static final int GAME_RULE_ZJH_MING_LIANG_ZHANG = 37; // 明两张
	public static final int GAME_RULE_ZJH_JETTON_100 = 38; // 100注封顶
	public static final int GAME_RULE_ZJH_MUST_MEN_NO = 39; // 不比闷
	public static final int GAME_RULE_ZJH_MUST_MEN_ONE = 40; // 一圈
	public static final int GAME_RULE_ZJH_MUST_MEN_THREE = 41; // 三圈
	public static final int GAME_RULE_ZJH_MUST_MEN_FIVE = 42; // 五圈
	public static final int GAME_RULE_ZJH_PIN_SHOUQI_NO = 43; // 不拼
	public static final int GAME_RULE_ZJH_PIN_FIVE = 44; // 拼5分
	public static final int GAME_RULE_ZJH_PIN_TEN = 45; // 拼10分
	public static final int GAME_RULE_ZJH_PIN_TWENTY = 46; // 拼20分
	public static final int GAME_RULE_ZJH_MEN_MAX_HALF = 47; // 闷注封顶 1/2
	public static final int GAME_RULE_ZJH_MEN_MAX_TEN = 48; // 闷注封顶 1/10
	//////////////////////////////////////////////////////// 溆浦老牌
	public static final int GAME_RULE_XP_LP_DAI_HUA = 1; // 带花
	public static final int GAME_RULE_XP_LP_BU_DAI_HUA = 2; // 不带花
	public static final int GAME_RULE_XP_LP_ZHUANG_XIAN = 3; // 有庄闲
	public static final int GAME_RULE_XP_LP_ZI_MO_HU = 4; // 自摸胡
	public static final int GAME_RULE_XP_LP_DI_FEN_ONE = 5;// 一分低分
	public static final int GAME_RULE_XP_LP_DI_FEN_TWO = 6;// 两分低分
	public static final int GAME_RULE_XP_LP_DI_FEN_THREE = 7;// 三分低分
	public static final int GAME_RULE_XP_LP_DI_FEN_FOUR = 8;// 四分低分
	public static final int GAME_RULE_XP_LP_CHONGFEN = 9; // 可冲
	public static final int GAME_RULE_XP_LP_CHONGFEN_NO = 10; // 不可冲
	public static final int GAME_RULE_XP_LP_CHONGFEN_MUST = 11; // 必冲
	public static final int GAME_RULE_XP_LP_CHONGFEN_MUST_SELECT = 12; // 必冲后可冲
	public static final int GAME_RULE_XP_LP_CHONGFEN_MUST_SELECT_ONE = 13; // 必冲后可冲1
	public static final int GAME_RULE_XP_LP_CHONGFEN_MUST_SELECT_TWO = 14; // 必冲后可冲2
	public static final int GAME_RULE_XP_LP_CHONGFEN_MUST_SELECT_THREE = 15; // 必冲后可冲3
	public static final int GAME_RULE_XP_LP_CHONGFEN_MUST_SELECT_FOUR = 16; // 必冲后可冲4
	public static final int GAME_RULE_XP_LP_GU_CHOU_NO = 17; // 取消箍臭
	public static final int GAME_RULE_XP_LP_PENG_CAN_OUT = 18;// 碰后不出同张

	//////////////////////////////////////////////////////// 溆浦博胡
	public static final int GAME_RULE_XP_BH_1_DF = 1; // 1底分
	public static final int GAME_RULE_XP_BH_2_DF = 2; // 2底分
	public static final int GAME_RULE_XP_BH_3_DF = 3; // 3底分
	public static final int GAME_RULE_XP_BH_4_DF = 4; // 4底分
	public static final int GAME_RULE_XP_BH_5_DF = 5; // 5底分
	public static final int GAME_RULE_XP_BH_CF = 6; // 充分
	public static final int GAME_RULE_XP_BH_ZX = 7; // 庄闲

	//////////////////////////////////////////////////////// 溆浦十三张
	public static final int GAME_RULE_XP_SSZ_TWO_PEOPLE = 1; // 两人人
	public static final int GAME_RULE_XP_SSZ_THREE_PEOPLE = 2; // 三人
	public static final int GAME_RULE_XP_SSZ_FOUR_PEOPLE = 3; // 四人
	public static final int GAME_RULE_XP_SSZ_BANKER_TURN = 4; // 轮流坐庄
	public static final int GAME_RULE_XP_SSZ_BANKER_ALLLOST = 5; // 通赔下庄
	public static final int GAME_RULE_XP_SSZ_DI_FEN_ONE = 6;// 一分低分
	public static final int GAME_RULE_XP_SSZ_DI_FEN_TWO = 7;// 两分低分
	public static final int GAME_RULE_XP_SSZ_DI_FEN_THREE = 8;// 三分低分
	public static final int GAME_RULE_XP_SSZ_DI_FEN_FOUR = 9;// 四分低分
	public static final int GAME_RULE_XP_SSZ_SPECAIL_CARS = 10;// 特殊牌型
	//////////////////////////////////////////////////////// 宁乡跑胡子/邵阳剥皮/娄底放炮罚
	public static final int GAME_RULE_NX_JIAFEN = 1; // 自摸1加分
	public static final int GAME_RULE_NX_BUJIAFEN = 2; // 自摸不加分
	public static final int GAME_RULE_NX_ZHANIAO = 3; // 扎2鸟
	public static final int GAME_RULE_NX_BUZHANIAO = 4; // 不扎鸟
	public static final int GAME_RULE_NX_JIAOHONG = 5; // 加红加小
	public static final int GAME_RULE_NX_BUJIAOHONG = 6; // 不加
	public static final int GAME_RULE_NX_HAI_DI = 7; // 海底胡+5
	public static final int GAME_RULE_NX_MAX_FIVE = 8; // 海底胡+5
	public static final int GAME_RULE_NX_MAX_TEN = 9; // 10番
	public static final int GAME_RULE_NX_SHI_BA_DA = 10; // 十八大
	public static final int GAME_RULE_NX_SHI_BA_XIAO = 11; // 十八小
	public static final int GAME_RULE_NX_ZHANIAO_ONE = 12; // 扎1鸟
	public static final int GAME_RULE_NX_ZHANIAO_THREE = 13; // 扎3鸟
	public static final int GAME_RULE_NX_JIAFEN_TWO = 14; // 自摸加两分
	public static final int GAME_RULE_NX_SHUA_HOU = 16; // 耍猴
	public static final int GAME_RULE_NX_SPEED_FAST = 17; // 快速场
	public static final int GAME_RULE_NX_DI_HU = 18; // 地胡
	public static final int GAME_RULE_NX_SHI_LIU_XIAO = 19; // 十六小
	public static final int GAME_RULE_NX_PLAYER_THREE = 20; // 三人场
	public static final int GAME_RULE_NX_PLAYER_TWO = 21; // 二人场
	public static final int GAME_RULE_NX_PIAO_NIAO = 22; // 飘鸟，相当于加底分
	public static final int GAME_RULE_NX_JIU_HU_KE_HU = 23; // 九胡可胡
	public static final int GAME_RULE_NX_SHI_WU_HU_KE_HU = 24; // 十五胡可胡
	public static final int GAME_RULE_NX_DI_FEN_2 = 25; // 底分2
	public static final int GAME_RULE_NX_DI_FEN_3 = 26; // 底分3
	public static final int GAME_RULE_NX_DI_FEN_4 = 27; // 底分4

	public static final int GAME_RULE_XP_DIFEN_ONE = 1; // 底分1
	public static final int GAME_RULE_XP_DIFEN_TWO = 2; // 底分2
	public static final int GAME_RULE_XP_DIFEN_FOUR = 4; // 底分3
	public static final int GAME_RULE_XP_KE_CHONG = 3; // 可冲
	public static final int GAME_RULE_XP_WU_DI_FEN = 5; // 无底分
	public static final int GAME_RULE_XP_ZI_MO_QIANG_ZHI_HU = 6; // 自摸强制胡牌

	public static final int GAME_RULE_LDFPF_FENGDING200 = 200; // 封顶200
	public static final int GAME_RULE_LDFPF_FENGDING400 = 400; // 封顶400

	////////////////////////////////////////////////////////////////// 三打哈
	public static final int GAME_RULE_SDH_JINGDIAN = 1; // 经典玩法
	public static final int GAME_RULE_SDH_LIANGDANG = 2; // 两档
	public static final int GAME_RULE_SDH_SANDANG = 3; // 三档
	public static final int GAME_RULE_SDH_SHUANGJINDANCHU = 4; // 双进单出
	public static final int GAME_RULE_SDH_BAOFULIUSHOU = 5; // 报副留守
	public static final int GAME_RULE_SDH_QUDIAO6 = 6; // 去掉6

	///////////////////////////////////////////////////////////////////// 三公
	public static final int GAME_RULE_SG_DI_FEN_ONE = 1;// 底分1
	public static final int GAME_RULE_SG_DI_FEN_TWO = 2;// 底分2
	public static final int GAME_RULE_SG_DI_FEN_THREE = 3;// 底分4分
	public static final int GAME_RULE_SG_FREE_ROBOT = 4; // 自由抢庄
	public static final int GAME_RULE_SG_JIU_DIAN_BANKER = 5; // 九点上庄
	public static final int GMAE_RULE_SG_DA_HUN_ZHAN = 6; // 大混战
	public static final int GMAE_RULE_SG_KAN_TWO_COUNT = 7; // 看两张抢庄
	public static final int GAME_RULE_SG_TONG_BI = 8; // 通比模式
	public static final int GAME_RULE_SG_NO_LOW_JETTON = 9; // 限制降注
	public static final int GAME_RULE_SG_NO_JONT_START = 10; // 游戏开始后禁止加入
	public static final int GAME_RULE_SG_DS_TONG_G_WIN = 15; // 点数相同公牌多获胜
	public static final int GAME_RULE_SG_BANKER_ONE = 11; // 1倍
	public static final int GAME_RULE_SG_BANKER_TWO = 12; // 2倍
	public static final int GAME_RULE_SG_BANKER_THREE = 13; // 3倍
	public static final int GAME_RULE_SG_BANKER_FOUR = 14; // 4倍
	public static final int GAME_RULE_SG_NO_TIMES = 16; // 不番倍

	// 胡牌定义
	/////////////////////////////////////////////////////////////// 通城个子牌定义
	public static final int CHR_GZP_ZI_MO = 0x01; // 自摸
	public static final int CHR_GZP_DIAN_PAO = 0x02;// 点炮
	public static final int CHR_GZP_ALL_BLACK = 0x04;// 全黑
	public static final int CHR_GZP_ALL_RED = 0x08;// 全红
	public static final int CHR_GZP_TEN_TEAM = 0x10;// 十对
	public static final int CHR_GZP_HAI_DI = 0x20; // 海底
	public static final int CHR_GZP_SHI_DUI_ALL_BANKER = 0x40;// 十对全黑
	// 胡牌
	public static final int CHK_NULL = 0x00; // 非胡类型
	public static final int CHK_CHI_HU = 0x01; // 胡类型
	/***
	 * 这两个公用
	 */
	public static final int CHR_ZI_MO = 0x01000000; // 自摸
	public static final int CHR_SHU_FAN = 0x02000000; // 素翻

	///////////////////////////////////////////////////////////////////// 三公托管
	public static final int GAME_RULE_SG_TG_MIN_JETTON = 1; // 最小下注
	public static final int GAME_RULE_SG_TG_BANKER_ZERO = 2; // 1倍
	public static final int GAME_RULE_SG_TG_BANKER_ONE = 3; // 1倍
	public static final int GAME_RULE_SG_TG_BANKER_TWO = 4; // 2倍
	public static final int GAME_RULE_SG_TG_BANKER_THREE = 5; // 3倍
	public static final int GAME_RULE_SG_TG_BANKER_FOUR = 6; // 4倍
	///////////////////////////////////////////////////////////////////////////////////////// 打码子
	public static final int GAME_RULE_DMZ_MODUI = 1;// 摸对
	public static final int GAME_RULE_DMZ_ZUODUI = 2;// 坐对
	public static final int GAME_RULE_DMZ_YOU_XIQIAN = 3;// 有喜钱
	public static final int GAME_RULE_DMZ_YOU_WUQIAN = 4;// 没有喜钱
	public static final int GAME_RULE_DMZ_YOU_TOUXIANG = 5;// 有投降

	///////////////////////////////////////////////////////////////////////////////////////// 干瞪眼
	public static final int GAME_RULE_GDY_ERREN = 1;// 二人
	public static final int GAME_RULE_GDY_SANREN = 2;// 三人
	public static final int GAME_RULE_GDY_SIREN = 3;// 四人
	public static final int GAME_RULE_GDY_WUREN = 4;// 五人
	public static final int GAME_RULE_GDY_WIN_ZHUANG = 5;// 赢家当庄
	public static final int GAME_RULE_GDY_RAND_ZHUANG = 6;// 随机当庄
	public static final int GAME_RULE_GDY_OWNER_ZHUANG = 7;// 房主当庄
	public static final int GAME_RULE_GDY_CHU_FINISH = 8;// 出完结束
	public static final int GAME_RULE_GDY_SHU_FINISH = 9;// 顺完结束
	public static final int GAME_RULE_GDY_ALL_BUPAI = 10;// 全体补牌
	public static final int GAME_RULE_GDY_WIN_BUPAI = 11;// 赢家补牌
	public static final int GAME_RULE_GDY_ONE_SCORE = 12;// 一分
	public static final int GAME_RULE_GDY_TWO_SCORE = 13;// 两分
	public static final int GAME_RULE_GDY_THREE_SCORE = 14;// 三分
	public static final int GAME_RULE_GDY_FOUR_SCORE = 15;// 四分
	public static final int GAME_RULE_GDY_BOOM_LIMIT_TWO = 16;// 两倍
	public static final int GAME_RULE_GDY_BOOM_LIMIT_FOUR = 17;// 四倍
	public static final int GAME_RULE_GDY_BOOM_LIMIT_EIGHT = 18;// 八倍
	public static final int GAME_RULE_GDY_BOOM_LIMIT_SIXTEEN = 19;// 十六倍
	public static final int GAME_RULE_GDY_BOOM_LIMIT_UN = 20;// 不限
	public static final int GAME_RULE_GDY_CARD_MIN_ZHUANG = 21;// 牌最小当庄
	public static final int GAME_RULE_GDY_CARD_NUMBER = 22;// 结束展示手牌
	public static final int GAME_RULE_GDY_NO_DOUBLE_LINK = 24;// 可出双顺
	public static final int GAME_RULE_GDY_MUST_JIE = 25;// 必须管
	public static final int GAME_RULE_GDY_KING_BOMB = 27;// 有王炸
	public static final int GAME_RULE_GDY_ONE_CARD_SCORE = 29;// 余牌一张算分
	public static final int GAME_RULE_GDY_TRUSTEE = 31;// 可托管
	public static final int GAME_RULE_GDY_QIE_PAI = 33;// 手动切牌
	////////////////////////////////////////////////////////////////// 九点半////////////////
	public static final int GAME_RULE_JDB_GRADE_ONE = 1;
	// public static final int GAME_RULE_JDB_TWO_GRADE = 2;
	// public static final int GAME_RULE_JDB_THREE_GRADE = 3;
	// public static final int GAME_RULE_JDB_FOUR_GRADE = 4;
	// public static final int GAME_RULE_JDB_FIVE_GRADE = 5;
	public static final int GAME_RULE_JDB_PEOPEL = 2;
	// public static final int GAME_RULE_JDB_THREE_PEOPEL = 7;
	// public static final int GAME_RULE_JDB_FOUR_PEOPEL =8;
	// public static final int GAME_RULE_JDB_FIVE_PEOPEL = 9;
	// public static final int GAME_RULE_JDB_SIX_PEOPEL = 10;
	// public static final int GAME_RULE_JDB_SEVEN_PEOPEL =11;
	// public static final int GAME_RULE_JDB_EIGHT_PEOPEL = 12;
	public static final int GAME_RULE_JDB_MIN = 3;
	// public static final int GAME_RULE_JDB_TWO_MIN = 14;
	// public static final int GAME_RULE_JDB_THREE_MIN = 15;
	// public static final int GAME_RULE_JDB_FOUR_MIN = 16;
	public static final int GAME_RULE_DZH = 4;
	public static final int GAME_RULE_JDB_GRADE_TWO = 5;
	public static final int GAME_RULE_JDB_GRADE_THREE = 6;
	public static final int GAME_RULE_JDB_GRADE_FOUR = 7;
	public static final int GAME_RULE_JDB_GRADE_FIVE = 8;

	/////////////////////////////////////////////////////////////////// 斗板凳/////////////////////
	public static final int GAME_RULE_DBD_TANZI_FIVE = 1;// 堂子5分
	public static final int GAME_RULE_DBD_TANZI_TEN = 2;// 堂子10分
	public static final int GAME_RULE_DBD_TANZI_TWNTY = 3;// 堂子20分
	public static final int GAME_RULE_DBD_DIFEN_TWO = 4;// 低分2分
	public static final int GAME_RULE_DBD_DIFEN_THREE = 5;// 低分3分
	public static final int GAME_RULE_DBD_DIFEN_FIVE = 6;// 低分5分
	/////////////////////////////////////////////////////////////////// 闲逸咔咙/////////////////////
	public static final int GAME_RULE_XYKL_INITIAL = 1;// 初始分
	public static final int GAME_RULE_XYKL_PLAYER = 2;// 游戏人数
	public static final int GAME_RULE_XYKL_CONTORL_START = 3;// 房主确认开始
	public static final int GAME_RULE_FORBID_CHOU_PAI_XYKL = 4;// 禁止搓牌
	public static final int GAME_RULE_START_FORBID_XYKL = 5; // 游戏开始后禁止加入
	public static final int GAME_RULE_DICHI_KONG_XIAZHU = 6; // 每局下注
	public static final int GAME_RULE_MIN_JETTON = 7; // 最低下注
	public static final int GAME_RULE_ADD_JETTON = 8; // 每次加注10分
	/////////////////////////////////////////////////////////////////// 经典十三张/////////////////////
	public static final int GAME_RULE_SSZ_JD_PLAYER_FOUR = 1;// 四人
	public static final int GAME_RULE_SSZ_JD_PLAYER_THREE = 2;// 三人
	public static final int GAME_RULE_SSZ_JD_PLAYER_TWO = 3;// 两人
	public static final int GAME_RULE_SSZ_JD_ZHUANG_TONGBI = 4;// 通比不坐庄
	public static final int GAME_RULE_SSZ_JD_QIANG_ZHUANG = 5;// 每轮抢庄
	public static final int GAME_RULE_SSZ_JD_FNAGZHU_ZHUANG = 6;// 房主当庄
	public static final int GAME_RULE_SSZ_JD_DAQIANG_DOUBLE = 7;// 打枪翻倍
	public static final int GAME_RULE_SSZ_JD_DAQIANG_ADDONE = 8;// 打枪加一
	public static final int GAME_RULE_SSZ_JD_SWAT_DOUBLE = 10;// 全垒打翻倍
	public static final int GAME_RULE_SSZ_JD_DEAL_CARD_60 = 12;// 理牌时间60秒
	public static final int GAME_RULE_SSZ_JD_DEAL_CARD_40 = 13;// 理牌时间40秒
	public static final int GAME_RULE_SSZ_JD_DEAL_CARD_25 = 14;// 理牌时间25秒
	public static final int GAME_RULE_SSZ_JD_DEAL_CARD_UN = 15;// 无理牌时间
	public static final int GAME_RULE_SSZ_BI_HUA_SE = 16;// 不比花色
	/////////////////////////////////////////////////////////////////// 丁二红/////////////////////
	public static final int GAME_RULE_DEH_TE_PAI = 1;// 有特牌
	public static final int GAME_RULE_DEH_DI_JIU_WANG = 4;// 有地九王
	public static final int GAME_RULE_DEH_DI_ZHUANG_FIRST = 5;// 庄家先手
	public static final int GAME_RULE_DEH_MANG_PI_TWO = 7;// 2分芒皮
	public static final int GAME_RULE_DEH_MANG_PI_THREE = 8;// 3分芒皮
	public static final int GAME_RULE_DEH_MANG_PI_FIVE = 9;// 5分芒皮
	public static final int GAME_RULE_DEH_INIT_ZI_CHAN_ONE = 10;// 300资产分
	public static final int GAME_RULE_DEH_INIT_ZI_CHAN_TWO = 11;// 500资产分
	public static final int GAME_RULE_DEH_INIT_ZI_CHAN_THREE = 12;// 1000资产分
	public static final int GAME_RULE_DEH_MIN_BOBO_50 = 13;// 50起勃勃
	public static final int GAME_RULE_DEH_MIN_BOBO_100 = 14;// 100起勃勃
	public static final int GAME_RULE_DEH_MIN_BOBO_ALL = 15;// 全起勃勃
	public static final int GAME_RULE_DEH_PEI_SI_PI = 16;// 赔死皮
	public static final int GAME_RULE_DEH_HAN_QIAN_BI_GUN = 17;// 喊钱必滚
	public static final int GAME_RULE_DEH_MIN_HAN_5 = 18;// 5点起喊
	public static final int GAME_RULE_DEH_MIN_HAN_10 = 19;// 10点起喊
	public static final int GAME_RULE_DEH_XI_QIAN_5 = 20;// 喜钱5分
	public static final int GAME_RULE_DEH_XI_QIAN_10 = 21;// 喜钱10分
	public static final int GAME_RULE_DEH_MIN_BOBO_150 = 22;// 150起勃勃
	public static final int GAME_RULE_DEH_PLAYER_FIVE = 23;// 5人场
	public static final int GAME_RULE_DEH_PLAYER_SIX = 24;// 6人场
	public static final int GAME_RULE_DEH_HALF_BOBO_BU = 25;// 低于一半补满
	public static final int GAME_RULE_DEH_BANKER_MUST_CALL = 26;// 庄家必喊
	public static final int GAME_RULE_DEH_PI_ZI_ONE = 27;// 皮子1分
	public static final int GAME_RULE_DEH_PI_ZI_TWO = 28;// 皮子2分
	public static final int GAME_RULE_DEH_PI_ZI_THREE = 29;// 皮子3分
	public static final int GAME_RULE_DEH_PI_ZI_FOUR = 30;// 皮子4分
	public static final int GAME_RULE_DEH_PI_ZI_FIVE = 31;// 皮子5分
	public static final int GAME_RULE_DEH_MIN_BOBO_HALF = 32;// 起一般簸簸
	///////////////////////////////////////////////////////////////////// A包子//////////////////
	public static final int GAME_RULE_ABZ_DI_FEN_ONE = 1;// 底分
	public static final int GAME_RULE_ABZ_DI_FEN_TWO = 2;// 底分
	public static final int GAME_RULE_ABZ_A_BAO = 3;// A包
	public static final int GAME_RULE_ABZ_K_BAO = 4;// K包
	public static final int GAME_RULE_ABZ_YI_BAO_MIAN_DA = 5;// 一包免打
	public static final int GAME_RULE_ABZ_YI_BAO_BI_DA = 6;// 一包比打
	public static final int GAME_RULE_ABZ_HONG_TAO_A_BANKER = 7;// 红桃A坐庄
	public static final int GAME_RULE_ABZ_RAND_BANKER = 8;// 随机庄家
	public static final int GAME_RULE_ABZ_YU_PAI_XIANSHI = 9;// 显示余牌
	public static final int GAME_RULE_ABZ_YU_PAI_XIANSHI_NO = 10;// 不显示余牌
	public static final int GAME_RULE_ABZ_HAVE_BAI_BAO = 11;// 摆包
	public static final int GAME_RULE_ABZ_NO_BAI_BAO = 12;// 摆包
	/////////////////////////////////////////////////////////////////// 广丰510k
	public static final int GAME_RULE_WSK_GF_TOU_XIANG = 1;// 可以投降
	public static final int GAME_RULE_WSK_GF_TOU_XIANG_NO = 2;// 不可以投降
	public static final int GAME_RULE_WSK_GF_CALL_HONGTAO_SAN = 3;// 叫红桃三
	public static final int GAME_RULE_WSK_GF_CALL_ALL = 4;// 叫任意牌
	public static final int GAME_RULE_WSK_GF_SCORE_LIMIT_16 = 5;// 16分封顶
	public static final int GAME_RULE_WSK_GF_SCORE_LIMIT_20 = 6;// 20分封顶
	public static final int GAME_RULE_WSK_GF_FA_WANG_BU_DA = 7;// 罚王不打
	public static final int GAME_RULE_WSK_GF_FA_WANG_YAO_DA = 8;// 罚王要打
	public static final int GAME_RULE_WSK_GF_FA_WANG_510K_BUDA = 9;// 罚王510K不打
	public static final int GAME_RULE_WSK_GF_TWO_SHENG_DANG = 10;// 2升挡
	public static final int GAME_RULE_WSK_GF_SEVEN_SHENG_DANG = 11;// 7升挡
	public static final int GAME_RULE_WSK_GF_J_SHENG_DANG = 12;// J升挡
	public static final int GAME_RULE_WSK_GF_JIU_ZHA_MIAN_DA = 13;// 9炸免打
	public static final int GAME_RULE_WSK_GF_NEI_XIAO = 14;// 内销
	public static final int GAME_RULE_WSK_GF_SAN_DAI_ER = 15;// 三带二
	public static final int GAME_RULE_WSK_GF_200_SCORE_FAN = 16;// 200分翻倍
	public static final int GAME_RULE_WSK_GF_SCORE_LIMIT_NO = 17;// 不封顶
	////////////////////////////////////////////////////////////////// 浦城炸弹
	public static final int GAME_RULE_WSK_PCZD_NO_TRUSTEE = 1; // 不设置托管
	public static final int GAME_RULE_WSK_PCZD_60_TRUSTEE = 2; // 60秒托管
	public static final int GAME_RULE_WSK_PCZD_120_TRUSTEE = 3; // 120秒托管
	public static final int GAME_RULE_WSK_PCZD_DA_XIAO_WANG = 4; // 大小王
	public static final int GAME_RULE_WSK_PCZD_NO_DXW = 5; // 无大小王
	public static final int GAME_RULE_WSK_PCZD_DDXJQJ = 6; // 独打闲家全奖
	public static final int GAME_RULE_WSK_PCZD_DDSJ = 7; // 独打烧机
	public static final int GAME_RULE_WSK_PCZD_DDNSJ = 8; // 独打不烧机
	///////////////////////////////////////////////////////////////// 信丰挂挡
	public static final int GAME_RULE_XFGD_TOU_XIANG = 1;// 可以投降
	public static final int GAME_RULE_XFGD_TOU_XIANG_NO = 2;// 不可以投降
	public static final int GAME_RULE_XFGD_BAO_ZHU = 3;// 报主
	public static final int GAME_RULE_XFGD_BAO_ZHU_NO = 4;// 不报主
	public static final int GAME_RULE_XFGD_CAN_LOOK = 5;// 查看
	public static final int GAME_RULE_XFGD_CAN_LOOK_NO = 6;// 不可查看
	public static final int GAME_RULE_XFGD_GUNAGTOU = 7;// 光头
	public static final int GAME_RULE_XFGD_GUNAGTOU_NO = 8;// 没有光头
	public static final int GAME_RULE_XFGD_DAOGUANG = 9;// 倒光
	public static final int GAME_RULE_XFGD_DAOGUANG_NO = 10;// 没有倒光
	public static final int GAME_RULE_XFGD_CALL_LIMIT_TEN = 11;// 10挡
	public static final int GAME_RULE_XFGD_CALL_LIMIT_NINE = 12;// 9挡
	public static final int GAME_RULE_XFGD_CALL_LIMIT_EIGHT = 13;// 8挡
	public static final int GAME_RULE_XFGD_CALL_LIMIT_SEVERN = 14;// 7挡
	public static final int GAME_RULE_XFGD_GAME_CELL_ONE = 15;// 底分1
	public static final int GAME_RULE_XFGD_GAME_CELL_TWO = 16;// 底分2
	/////////////////////////////////////////////////////////////// 吉县斗地主
	public static final int GAME_RULE_JX_DDZ_PLAYER_THREE = 1;// 3人
	public static final int GAME_RULE_JX_DDZ_PLAYER_FOUR = 2;// 4人
	/////////////////////////////////////////////////////////////// 咸宁打拱
	public static final int GAME_RULE_XNDG_LAI_SMALL = 1;// 癞子为3
	public static final int GAME_RULE_XNDG_LAI_BIG = 2;// 癞子为2
	public static final int GAME_RULE_XNDG_DISPLAY_CARD = 3;// 显示
	public static final int GAME_RULE_XNDG_DISPLAY_CARD_NO = 4;// 不显示

	////////////////////////////////////////////////////////////// 邵阳剥皮
	public static final int GAME_RULE_SYBP_TWO_PLAYER = 1;// 2人
	public static final int GAME_RULE_SYBP_THREE_PLAYER = 2;// 3人
	public static final int GAME_RULE_SYBP_HONG_HEI_DIAN = 3;// 红黑点人
	public static final int GAME_RULE_SYBP_LIMIT_100 = 4;// 100胡息封顶
	public static final int GAME_RULE_SYBP_LIMIT_200 = 5;// 200胡息封顶
	public static final int GAME_RULE_SYBP_LIMIT_300 = 6;// 300胡息封顶
	public static final int GAME_RULE_SYBP_LIMIT_NO = 7;// 不封顶
	public static final int GAME_RULE_SYBP_LIAN_ZHUANG = 8;// 连庄
	public static final int GAME_RULE_SYBP_TIAN_DI_HU = 9;// 天地胡
	////////////////////////////////////////////////////////////// 吕梁打七
	public static final int GAME_RULE_LLDQ_THREE_JI_LIMIT = 1;// 3级封顶
	public static final int GAME_RULE_LLDQ_FIVE_JI_LIMIT = 2;// 5级封顶
	public static final int GAME_RULE_LLDQ_KOU_DI_JIA_JI = 3;// 扣底
	public static final int GAME_RULE_LLDQ_BANKER_DAN_WIN_DOUBLE = 4;// 单打赢双倍
	public static final int GAME_RULE_LLDQ_KING_FAN_QI = 5;// 对王可反对七
	public static final int GAME_RULE_LLDQ_FAN_PAI_LIANG_ZHU = 6;// 翻牌必须亮主
	public static final int GAME_RULE_LLDQ_SHOU_QI = 7;// 首七
	////////////////////////////////////////////////////////////// 溆浦240
	public static final int GAME_RULE_XUSJ_CAN_LOOK_SCORE = 1;// 可查分
	public static final int GAME_RULE_XPSJ_HAVE_SCORE_BI_GUAN = 2;// 有分必管
	public static final int GAME_RULE_XPSJ_GUANG_TOU_DOUBLE = 3;// 光头输分X2
	public static final int GAME_RULE_XPSJ_HAVE_5_A = 4;// 有5必打A
	public static final int GAME_RULE_XPSJ_LOOK_OUT_CARD = 5;// 查看已出牌
	public static final int GAME_RULE_XPSJ_NO_ZHU_DA_CHANG_ZHU = 6;// 无主先打常主
	public static final int GAME_RULE_XPSJ_NO_CHANG_ZHU_REPATH = 7;// 无常主重新发牌
	public static final int GAME_RULE_XPSJ_THREE_PEOPLE = 8;// 三人
	public static final int GAME_RULE_XPSJ_FOUR_PEOPLE = 9;// 四人
	////////////////////////////////////////////////////////////// 永州240
	public static final int GAME_RULE_YZSJ_CAN_LOOK_SCORE = 1;// 可查分
	public static final int GAME_RULE_YZSJ_HAVE_SCORE_BI_GUAN = 2;// 有分必管
	public static final int GAME_RULE_YZSJ_GUANG_TOU_DOUBLE = 3;// 光头输分X2
	public static final int GAME_RULE_YZSJ_HAVE_5_A = 4;// 有5必打A
	public static final int GAME_RULE_YZSJ_LOOK_OUT_CARD = 5;// 查看已出牌
	public static final int GAME_RULE_YZSJ_300 = 6;// 300分

	//////////////////////////////////////////////////////////////// 万载到段
	public static final int GAME_RULE_WZDD_CHENG_PO_PAI_ONE = 1;// 成牌20破牌20
	public static final int GAME_RULE_WZDD_CHENG_PO_PAI_TWO = 2;// 成牌40破牌40
	public static final int GAME_RULE_WZDD_CHENG_PO_PAI_THREE = 3;// 成牌40破牌20
	/////////////////////////////////////////////////////////////// 黄石大冶
	public static final int GAME_RULE_HSDY_CELL_FIVE = 1;// 底分5分
	public static final int GAME_RULE_HSDY_CELL_EIGHT = 2;// 底分8分
	public static final int GAME_RULE_HSDY_CELL_TEN = 3;// 底分10分
	public static final int GAME_RULE_HSDY_RECORD_OUT_CARD_NO = 4;// 记牌器不可用
	public static final int GAME_RULE_HSDY_RECORD_OUT_CARD = 5;// 记牌器可用
	public static final int GAME_RULE_HSDY_DISPLAY_CARD = 6;// 显示牌
	public static final int GAME_RULE_HSDY_DISPLAY_CARD_NO = 7;// 不显示牌
	/////////////////////////////////////////////////////////////// 松溪同花
	public static final int GAME_RULE_SXTH_WU_JI = 1;// 无机
	public static final int GAME_RULE_SXTH_FOUR_JI = 2;// 4机
	public static final int GAME_RULE_SXTH_EIGHT_JI = 3;// 8机
	public static final int GAME_RULE_SXTH_TONG_HUA = 5;// 同花
	public static final int GAME_RULE_SXTH_SHAO_JI = 6;// 烧机
	public static final int GAME_RULE_SXTH_TOU_XIANG = 7;// 投降
	public static final int GAME_RULE_SXTH_CELL_ONE = 8;// 底分1分
	public static final int GAME_RULE_SXTH_CELL_TWO = 9;// 底分2分
	public static final int GAME_RULE_SXTH_CELL_THREE = 10;// 底分3分
	public static final int GAME_RULE_SXTH_CELL_FOUR = 11;// 底分4分
	public static final int GAME_RULE_SXTH_CELL_FIVE = 12;// 底分5分
	public static final int GAME_RULE_SXTH_CHANGE_SEAT = 13;// 换位置
	////////////////////////////////////////////////////////////////// 牛牛的庄家操作///////////
	public static final int BANKER_CANCEL = 0x000000001; // 下庄
	public static final int BANKER_CONTINUE = 0x000000002; // 连庄
	public static final int BANKER_TIAO = 0x000000004; // 跳庄
	public static final int BANKER_BU = 0x000000008; // 补庄
	public static final int QIE_CARD = 0x000000010; // 切牌
	public static final int JETTON_SCORE = 0x000000020; // 下注
	////////////////////////////////////////////////////////////////// 湖南麻将的胡牌定义////////
	// 通城打滚
	public static final int GAME_RULE_PK_TC_ZERO_MAGIC = 1; // 0张花牌
	public static final int GAME_RULE_PK_TC_ONE_MAGIC = 2; // 1张花牌
	public static final int GAME_RULE_PK_TC_TWO_MAGIC = 3; // 2张花牌
	public static final int GAME_RULE_PK_TC_SIX_BOOM_REWARD = 4; // 6炸奖1分
	public static final int GAME_RULE_PK_TC_SEVEN_BOOM_REWARD = 5; // 7炸奖1分
	public static final int GAME_RULE_PK_TC_PIAO = 6; // 可飘分
	public static final int GAME_RULE_PK_TC_NO_PIAO = 7; // 无飘分
	public static final int GAME_RULE_PK_TC_BOOM_MUST_OUT = 8; // 炸弹打出才算奖
	public static final int GAME_RULE_PK_TC_DISPLAY_COUNT = 9; // 牌数-显示
	public static final int GAME_RULE_PK_TC_DONT_DISPLAY_COUNT = 10; // 牌数-不显示
	public static final int GAME_RULE_PK_TC_ONE_CARD_WARNING = 11; // 剩1张牌需报警

	/////////////////////////////////////////////////////// 贵州板子炮
	public static final int GAME_RULE_BZP_GZH_DOU_ZERO = 1; // 板子炮豆0
	public static final int GAME_RULE_BZP_GZH_DOU_ONE = 2; // 板子炮豆1
	public static final int GAME_RULE_BZP_GZH_DOU_TWO = 3; // 板子炮豆2
	public static final int GAME_RULE_BZP_GZH_DOU_THREE = 4; // 板子炮豆3
	public static final int GAME_RULE_BZP_GZH_DISPLAY_CARD = 6; // 显示余牌
	public static final int GAME_RULE_BZP_GZH_NO_DISPLAY_CARD = 7; // 不显示余牌
	public static final int GAME_RULE_BZP_GZH_SD_JP = 8; // 手动叫牌
	public static final int GAME_RULE_BZP_GZH_ZD_JP = 9; // 自动叫牌

	// 湘潭消造
	public static final int GAME_RULE_WSK_NO_KING_XTXZ = 1; // 不带王
	public static final int GAME_RULE_WSK_TAKE_KING_2_XTXZ = 2; // 带两王
	public static final int GAME_RULE_WSK_TAKE_KING_4_XTXZ = 3; // 带四王
	public static final int GAME_RULE_WSK_CAN_BAO_XTXZ = 4; // 可包牌
	public static final int GAME_RULE_WSK_CAN_RED_XTXZ = 5; // 可叫红牌
	public static final int GAME_RULE_WSK_XI_YA_FEN_XTXZ = 6; // 喜被压有分
	public static final int GAME_RULE_WSK_WU_XI_XTXZ = 7; // 五张算喜
	public static final int GAME_RULE_WSK_SHOW_CARD_COUNT_XTXZ = 8; // 显示余牌
	public static final int GAME_RULE_WSK_CAN_3_TAKE_2_XTXZ = 9; // 可三代二

	public static final int WSK_MAX_COUNT_XTXZ = 28; // 手牌数量

	// 通城打滚

	// 大胡
	public static final int CHR_HUNAN_PENGPENG_HU = 0x00000001; // 碰碰胡
	public static final int CHR_HUNAN_JIANGJIANG_HU = 0x00000002; // 将将胡
	public static final int CHR_HUNAN_QING_YI_SE = 0x00000004; // 清一色
	public static final int CHR_HUNAN_HAI_DI_LAO = 0x00000008; // 海底捞
	public static final int CHR_HUNAN_HAI_DI_PAO = 0x00000010; // 海底捞
	public static final int CHR_HUNAN_QI_XIAO_DUI = 0x00000020; // 七小对
	public static final int CHR_HUNAN_HAOHUA_QI_XIAO_DUI = 0x00000040; // 豪华七小对
	public static final int CHR_HUNAN_GANG_KAI = 0x00000080; // 杠上开花
	public static final int CHR_HUNAN_QIANG_GANG_HU = 0x00000100; // 抢杠胡
	public static final int CHR_HUNAN_GANG_SHANG_PAO = 0x00000200; // 杠上跑
	public static final int CHR_HUNAN_QUAN_QIU_REN = 0x00000400; // 全求人
	public static final int CHR_HUNAN_SHUANG_HAO_HUA_QI_XIAO_DUI = 0x00000800; // 双豪华七小对
	public static final int CHR_HUNAN_SHUANG_GANG_KAI = 0x00001000; // 双杠杠上开花
	public static final int CHR_HUNAN_SHUANG_GANG_SHANG_PAO = 0x00002000; // 双杠上跑
	public static final int CHR_HUNAN_WU_HZ_HU = 0x00004000; // 无红中胡牌
	// 小胡
	public static final int CHR_HUNAN_XIAO_DA_SI_XI = 0x00004000; // 大四喜
	public static final int CHR_HUNAN_XIAO_BAN_BAN_HU = 0x00008000; // 板板胡
	public static final int CHR_HUNAN_XIAO_QUE_YI_SE = 0x00010000; // 缺一色
	public static final int CHR_HUNAN_XIAO_LIU_LIU_SHUN = 0x00020000; // 六六顺

	public static final int CHR_HUNAN_DA_DUI_HU = 0x00004000; // 大对胡
	public static final int CHR_HUNAN_FENG_YI_SE = 0x00008000; // 风一色
	public static final int CHR_HUNAN_SHI_SAN_YAO = 0x00010000; // 十三幺
	public static final int CHR_HUNAN_SHI_SAN_LAN = 0x00020000; // 十三烂

	public static final int CHR_HUNAN_QI_FENG_DAO_WEI = 0x00004000; // 七风到位

	public static final int CHR_HUNAN_THREE_HAOHUA_QI_YI_SE = 0x00000200; // 三豪华七个对
	public static final int CHR_HUNAN_QISHOU_BAO_TING = 0x00020000; // 起手报听

	public static final int CHR_HUNAN_PRIVATE_WANG_BAO = 0x00000001; // 王豹
	public static final int CHR_HUNAN_PRIVATE_WANG_BAO_WANG = 0x00000002; // 王豹王
	public static final int CHR_HUNAN_PRIVATE_WANG_CHUANG = 0x00000008; // 王闯
	public static final int CHR_HUNAN_PRIVATE_WANG_CHUANG_WANG = 0x00000010; // 王闯王
	public static final int CHR_HUNAN_PRIVATE_WANG_GUI_WEI = 0x00000200; // 王归位
	public static final int CHR_HUNAN_PRIVATE_WANG_GUI_WEI_SHAUNG = 0x00000400; // 双王归位
	public static final int CHR_HUNAN_PRIVATE_WANG_YING_QI_DUI = 0x00001000; // 硬七对
	public static final int CHR_HUNAN_PRIVATE_QI_SHOU_HU = 0x00002000; // 起手胡
	public static final int CHR_HUNAN_PRIVATE_SI_TIAN_WANG = 0x00008000; // 四大天王

	/** 新增长沙麻将小胡类型 */
	public static final int CHR_HUNAN_XIAO_JING_TONG_YU_NV = 0x00200000; // 金童玉女
	public static final int CHR_HUNAN_XIAO_SAN_TON = 0x08000000; // 三同
	public static final int CHR_HUNAN_XIAO_YI_ZHI_HUA = 0x00800000; // 一枝花
	public static final int CHR_HUNAN_XIAO_BU_BU_GAO = 0x00400000; // 步步高

	public static final int CHR_FANG_PAO = 0x00040000; // 放炮
	public static final int CHR_TONG_PAO = 0x00080000; // 通炮
	public static final int CHR_HU = 0x00100000; // 胡

	public static final int CHR_HUNAN_TIAN_HU = 0x00200000; // 天胡
	public static final int CHR_HUNAN_DI_HU = 0x00400000; // 地胡
	public static final int CHR_HUNAN_MEN_QING = 0x00800000; // 门清

	public static final int CHR_HUNAN_XIADOU = 0x00400000; // 小刀
	public static final int CHR_HUNAN_DADOU = 0x00800000; // 大刀

	public static final int CHR_HUNAN_258_JIANG = 0x04000000; // 将胡有2/5/8将
	public static final int CHR_HUNAN_HZ_QISHOU_HU = 0x08000000; // 红中起手胡

	public static final int CHR_BAN_BAN_HU = 0x00400000; // 板板胡
	public static final int CHR_HUNAN_DAN_DIAO = 0x04000000;// 单屌
	public static final int CHR_HUNAN_YI_TIAO_LONG = 0x08000000; // 一条龙

	//////////////////////////// 湖北分支///////////////////////////////////////晃晃麻将的胡牌定义
	public static final int CHR_HUBEI_HEI_MO = 0x00000001; // 黑摸
	public static final int CHR_HUBEI_RUAN_MO = 0x00000002; // 软摸
	public static final int CHR_HUBEI_ZHUO_CHONG = 0x00000004; // 捉铳
	public static final int CHR_HUBEI_RE_CHONG = 0x00000008; // 黑摸
	public static final int CHR_HUBEI_QIANG_GANG_HU = 0x00000010; // 抢杠胡

	////////////////////////////// 河南分支//////////////////////////////////////安阳麻将胡牌定义
	public static final int CHR_HENAN_DAN_DIAO = 0x00000001; // 单吊
	public static final int CHR_HENAN_KA_ZHANG = 0x00000002; // 卡张
	public static final int CHR_HENAN_BIAN_ZHANG = 0x00000004; // 边张
	public static final int CHR_HENAN_QIANG_GANG_HU = 0x00000008; // 抢杠胡
	public static final int CHR_HENAN_TIAN_HU = 0x00000010; // 天胡
	public static final int CHR_HENAN_QI_XIAO_DUI = 0x00000020; // 七小对
	public static final int CHR_HENAN_HH_QI_XIAO_DUI = 0x00000040; // 豪华七小对
	public static final int CHR_HENAN_GANG_KAI = 0x00000080; // 杠上开花
	public static final int CHR_HENAN_HZ_QISHOU_HU = 0x00000100; // 红中起手胡 或包次动画
	public static final int CHR_HENAN_HZ_DUAN_1 = 0x00000200; // 断门1 或明次动画
	public static final int CHR_HENAN_HZ_DUAN_2 = 0x00000400; // 断门2 或暗次动画
	public static final int CHR_HENAN_LYGC_FANG_PAO = 0x00000800; // 洛阳杠次放炮，0x00040000，和公用的CHR_FANG_PAO冲突
	public static final int CHR_HENAN_HEI_ZI = 0x00000800; // 黑子
	public static final int CHR_HENAN_XC_HEIFENG = 0x00008000; // 黑风组合数
	public static final int CHR_HENAN_XC_BAIFENG = 0x00010000; // 白凤组合数
	public static final int CHR_HENAN_PI_CI = 0x00020000; // 皮次
	public static final int CHR_HENAN_GANG_CI = 0x00040000; // 杠次
	public static final int CHR_HENAN_BAO_CI_START = 0x00080000; // 包次开始
	public static final int CHR_HENAN_QISHOU_HU = 0x08000000;
	public static final int CHR_HENAN_ZHOU_KOU_QING_YI_SE = 0x00001000; // 清一色
	public static final int CHR_HENAN_ZHOU_KOU_QI_SHOU_HU = 0x00002000; // 红中起手胡
	public static final int CHR_HENAN_SI_HUN = 0x01000000; // 四混

	////////////////////////////////////// 河南分支//////////////////////////////信阳麻将胡牌定义
	public static final int CHR_HENAN_XY_MENQING = 0x00000001; // 门清
	public static final int CHR_HENAN_XY_BAZHANG = 0x00000002; // 八张
	public static final int CHR_HENAN_XY_JIAZI = 0x00000004; // 夹子
	public static final int CHR_HENAN_XY_DUYING = 0x00000008; // 独赢
	public static final int CHR_HENAN_XY_QINGQUE = 0x00000010; // 清缺
	public static final int CHR_HENAN_XY_HUNQUE = 0x00000020; // 混缺
	public static final int CHR_HENAN_XY_QINGYISE = 0x00000040; // 清一色
	public static final int CHR_HENAN_XY_SANQIYING = 0x00000100; // 三七赢
	public static final int CHR_HENAN_XY_SANQIJIANG = 0x00000200; // 三七将
	public static final int CHR_HENAN_XY_QI_XIAO_DUI = 0x00000400; // 七小对
	public static final int CHR_HENAN_XY_GANG_KAI = 0x00000800; // 杠上开花
	public static final int CHR_HENAN_XY_ZHONGWU = 0x00001000; // 中五
	public static final int CHR_HENAN_XY_LIANLIU = 0x00002000; // 连六

	////////////////////////////////////////////// 江苏分支///////////////////////////////////////////
	public static final int CHR_JIANGSU_ZZ_AN_GANG_KAI = 0x00000001; // 暗杠上开花
	public static final int CHR_JIANGSU_ZZ_MING_GANG_KAI = 0x00000002; // 明杠上开花
	public static final int CHR_JIANGSU_ZZ_PAO_DA = 0x00000004; // 跑搭
	public static final int CHR_JIANGSU_ZZ_TUO_DA = 0x00000008; // 脱搭
	public static final int CHR_JIANGSU_ZZ_CHU_CHONG = 0x00000010; // 出炮
	public static final int CHR_JIANGSU_ZZ_YI_PAO_SAN_XIANG = 0x00000020; // 一炮三响
	public static final int CHR_JIANGSU_ZZ_ZI_MO_ZHENGDA = 0x00000040; // 自摸正搭
	public static final int CHR_JIANGSU_ZZ_FANG_PAO_ZHENGDA = 0x00000080; // 放炮正搭
	public static final int CHR_JIANGSU_ZZ_BU_GANG_KAI = 0x00000100; // 补杠上开花
	public static final int CHR_JIANGSU_ZZ_QIANG_GANG_HU = 0x00001000; // 补杠上开花
	////////////////////////////// 福禄寿分支//////////////////////////////////////福禄寿胡牌定义
	public static final int CHR_FLS_MENQING = 0x00000001; // 福禄寿门清
	public static final int CHR_FLS_PENGPENGHU = 0x00000002; // 福禄寿碰碰胡
	public static final int CHR_FLS_GANGSHANGHUA = 0x00000004; // 福禄寿杠上花
	public static final int CHR_FLS_HAIDI = 0x00000008; // 福禄寿海底
	public static final int CHR_FLS_MANTIAN_FEI = 0x00000010; // 福禄寿满天飞
	public static final int CHR_FLS_GUNGUN = 0x00000020; // 福禄寿滚滚
	public static final int CHR_FLS_GANGSHANGPAO = 0x00000040; // 福禄寿杠上pao

	public static final int CHR_FLS_QING_HU = 0x00000080; // 福禄寿清胡
	public static final int CHR_FLS_KA_HU = 0x00000100; // 福禄寿卡胡
	public static final int CHR_FLS_TAI_HU = 0x00000200; // 福禄寿台胡
	public static final int CHR_FLS_KU_HU = 0x00000400; // 福禄寿枯胡
	public static final int CHR_FLS_HEI_HU = 0x00000800; // 福禄寿黑原

	public static final int CHR_FLS_HONG_HU = 0x00001000; // 福禄寿红原
	public static final int CHR_FLS_SHI_DUI = 0x00002000; // 福禄寿十对
	public static final int CHR_FLS_ZHONG_HU = 0x00004000; // 福禄寿重胡
	public static final int CHR_FLS_QUE_YI_SE = 0x00008000; // 缺一色

	public static final int CHR_FLS_HONG_HU4 = 0x00010000; // 福禄寿4红原
	public static final int CHR_FLS_HONG_HU5 = 0x00020000; // 福禄寿5红原
	public static final int CHR_FLS_BAN_BAN_HU = 0x00040000; // 板板胡
	public static final int CHR_FLS_LIU_LIU_SHUN = 0x00080000; // 六六顺

	public static final int CHR_FLS_DA_HONG_SI_XI = 0x00100000; // 大红四喜

	public static final int CHR_FLS_HONG_HU6 = 0x00800000; // 福禄寿6红原
	public static final int CHR_FLS_HONG_HU7 = 0x04000000; // 福禄寿7红原

	////////////////////////////////////////////////////////////////// 广东麻将的胡牌定义////////
	public static final int CHR_GD_PENGPENGHU = 0x00000001; // 对对胡(碰碰胡)
	public static final int CHR_GD_HUN_YI_SE = 0x00000002; // 混一色
	public static final int CHR_GD_QING_YI_SE = 0x00000004; // 清一色
	public static final int CHR_GD_YAO_JIU = 0x00000008; // 幺九(带风)
	public static final int CHR_GD_QUAN_YAO_JIU = 0x00000010; // 全幺九
	public static final int CHR_GD_SHI_SAN_YAO = 0x00000020; // 十三幺
	public static final int CHR_GD_QUAN_FAN = 0x00000040; // 全番(全大炮)
	public static final int CHR_GD_QI_XIAO_DUI = 0x00000080; // 七小对
	public static final int CHR_GD_TIAN_HU = 0x00000100; // 天胡
	public static final int CHR_GD_DI_HU = 0x00000200; // 地胡
	////////////////////////////////////////////////////////////////// 长牌///////////
	public static final long CHR_CP_ALL_HEI = 0x00000010; // 全黑牌
	public static final long CHR_CP_ALL_HONG = 0x00000020; // 全黑牌
	public static final long CHR_CP_DIAN_PAO_HU = 0x00000040; // 点炮胡
	public static final long CHR_CP_JEI_PAO_HU = 0x00000080; // 接炮胡
	public static final long CHR_CP_HONG_HEI_HU = 0x00000100; // 红黑胡
	public static final long CHR_CP_TIAN_HU = 0x00000200; // 天胡
	public static final long CHR_CP_DI_HU = 0x00000400; // 地胡
	public static final long CHR_CP_TONG_MENG = 0x00000800; // 同门
	public static final long CHR_CP_THREE_DUI = 0x000001000; // 3对
	public static final long CHR_CP_PENG_HU = 0x000002000; // 碰胡
	public static final long CHR_CP_WU_CHENG = 0x000004000; // 无成

	////////////////////////////////////////////////////////////////// 攸县红黑胡///////

	public static final long CHR_TEN_HONG_PAI = 0x00000001; // 十张红牌
	public static final long CHR_THIRTEEN_HONG_PAI = 0x00000002; // 十三张红牌
	public static final long CHR_ONE_HONG = 0x00000004; // 一张红牌
	public static final long CHR_ONE_HEI = 0x00000008; // 一张黑牌
	public static final long CHR_ALL_HEI = 0x00000010; // 全黑牌
	public static final long CHR_TIAN_HU = 0x00000020; // 天胡--三提或五坎等等这些
	public static final long CHR_JEI_PAO_HU = 0x00000040; // 接炮胡
	public static final long CHR_DI_HU = 0x00000080; // 地胡
	public static final long CHR_HAI_HU = 0x00000100; // 海胡
	public static final long CHR_DA_HU = 0x00000200; // 大胡
	public static final long CHR_XIAO_HU = 0x00000400; // 小胡
	public static final long CHR_DUI_ZI_HU = 0x00000800; // 对子胡
	public static final long CHR_SHUA_HOU = 0x00001000; // 耍猴
	public static final long CHR_HUANG_FAN = 0x00002000; // 黄番
	public static final long CHR_TUAN_YUAN = 0x00004000; // 团圆
	public static final long CHR_HANG_HANG_XI = 0x00008000; // 行行息
	public static final long CHR_TING_HU = 0x00010000; // 听胡
	public static final long CHR_JIA_DIAN_HU = 0x00020000; // 假点胡
	public static final long CHR_DIAN_PAO_HU = 0x00040000; // 点炮胡
	public static final long CHR_SPECAIL_TIAN_HU = 0x00080000; // 天胡
	public static final long CHR_HONG_WU_DUI = 0x00100000; // 红乌对
	public static final long CHR_HONG_DUI = 0x00200000; // 红队
	public static final long CHR_CHUN_HEI_DUI = 0x00400000; // 纯黑队，。碰、跑、偎、提的牌全为黑色，无绞牌一句话
	public static final long CHR_SHI_BA_XIAO = 0x00800000; // 十八小
	public static final long CHR_QI_SHOU_HU = 0x02000000; // 起手胡--和天胡不同
	public static final long CHR_MAO_HU = 0x04000000; // 毛胡
	public static final long CHR_PHZ_FANG_PAO = 0x08000000; // 放炮

	public static final long CHR_TEN_HONG_PAI_CHD = 0x00000001; // 十张红牌
	public static final long CHR_THIRTEEN_HONG_PAI_CHD = 0x00000002; // 十三张红牌
	public static final long CHR_ONE_HONG_CHD = 0x00000004; // 一张红牌
	public static final long CHR_DIAN_DENG_CHD = 0x00000008; // 点灯
	public static final long CHR_ALL_HEI_CHD = 0x00000010; // 全黑牌
	public static final long CHR_TIAN_HU_CHD = 0x00000020; // 天胡--三提或五坎等等这些
	public static final long CHR_JEI_PAO_HU_CHD = 0x00000040; // 接炮胡
	public static final long CHR_DI_HU_CHD = 0x00000080; // 地胡
	public static final long CHR_HAI_HU_CHD = 0x00000100; // 海胡
	public static final long CHR_DA_HU_CHD = 0x00000200; // 大胡
	public static final long CHR_XIAO_HU_CHD = 0x00000400; // 小胡
	public static final long CHR_DUI_ZI_HU_CHD = 0x00000800; // 对子胡
	public static final long CHR_SHUA_HOU_CHD = 0x00001000; // 耍猴
	public static final long CHR_HUANG_FAN_CHD = 0x00002000; // 黄番
	public static final long CHR_TUAN_YUAN_CHD = 0x00004000; // 团圆
	public static final long CHR_HANG_HANG_XI_CHD = 0x00008000; // 行行息
	public static final long CHR_TING_HU_CHD = 0x00010000; // 听胡
	public static final long CHR_BEI_CHD = 0x00020000; // 背胡
	public static final long CHR_GAI_CHD = 0x00040000; // 盖胡
	public static final long CHR_SPECAIL_TIAN_HU_CHD = 0x00080000; // 天胡
	public static final long CHR_SI_QI_CHD = 0x00100000; // 四七红
	public static final long CHR_TUAN_CHD = 0x00200000; // 团
	public static final long CHR_MAN_YUAN_HUA_CHD = 0x00400000; // 满园花
	public static final long CHR_MTH_XIAO_CHD = 0x00800000; // 小满堂红
	public static final long CHR_MTH_DA_CHD = 0x04000000; // 大满堂红
	public static final long CHR_HONG_FAN_TIAN_CHD = 0x08000000; // 红翻天
	public static final long CHR_DAN_PIAO_CHD = 0x10000000L; // 单漂
	public static final long CHR_SHUANG_PIAO_CHD = 0x20000000L; // 双漂
	public static final long CHR_YING_CHD = 0x40000000L; // 印
	public static final long CHR_SHUN_CHD = 0x0100000000L; // 顺
	public static final long CHR_HANG_HANG_XI_lIU_CHD = 0x200000000L; // 行行息，有提跑

	////////////////////////////////////////////////////////////// 博胡
	public static final long CHR_BH_PENG_HU = 0x08000; // 碰胡
	public static final long CHR_BH_SHE_HU = 0x10000; // 舍胡
	public static final long CHR_BH_ZHL_HU = 0x20000; // 抓龙
	public static final long CHR_BH_KZH_HU = 0x40000; // 开斋
	public static final long CHR_BH_DGU_HU = 0x80000; // 打滚

	///////////////////////////////////////////// 偎麻雀
	///////////////////////////////////////////// ////////////////////////////////////////////
	public static final long CHR_MAN_YUAN_HUA_WMQ = 0x000000001; // 满园花
	public static final long CHR_HONG_HU_WMQ = 0x000000002; // 红胡
	public static final long CHR_DUO_HONG_WMQ = 0x000000004; // 多红
	public static final long CHR_YING_HU_WMQ = 0x000000008; // 印胡
	public static final long CHR_CHUN_YING_WMQ = 0x000000010; // 纯印
	public static final long CHR_DUI_ZI_HU_WMQ = 0x000000020; // 对子胡
	public static final long CHR_WU_DUI_WMQ = 0x000000040; // 乌对
	public static final long CHR_DIAN_HU_WMQ = 0x000000080; // 点胡
	public static final long CHR_WU_HU_WMQ = 0x000000100; // 乌胡
	public static final long CHR_DA_ZI_HU_WMQ = 0x000000200; // 大字胡
	public static final long CHR_XIAO_ZI_HU_WMQ = 0x000000400; // 小字胡
	public static final long CHR_ZHUO_FU_WMQ = 0x000000800; // 桌胡
	public static final long CHR_JIE_MEI_ZHUO_WMQ = 0x000001000; // 姐妹胡
	public static final long CHR_SAN_LUAN_ZHUO_WMQ = 0x000002000; // 三乱桌
	public static final long CHR_JM_DIA_TUO_ZHUO_WMQ = 0x000004000; // 姐妹桌带拖
	public static final long CHR_DIA_SHUN_ZHUO = 0x000008000; // 爹孙桌
	public static final long CHR_DS_DIA_TUO_WMQ = 0x000010000; // 爹孙桌带拖
	public static final long CHR_SI_LUAN_ZHUO_WMQ = 0x000020000; // 四乱桌
	public static final long CHR_HAI_DI_HU_WMQ = 0x000040000; // 海底胡
	public static final long CHR_DAN_DI_WMQ = 0x000080000; // 单丁
	public static final long CHR_ZHEN_BA_WMQ = 0x000100000; // 真八碰头
	public static final long CHR_JIA_BA_WMQ = 0x000200000; // 假八碰头
	public static final long CHR_BEI_KAO_BEI = 0x000400000; // 背靠背
	public static final long CHR_SHOU_QIAN_SHOU = 0x000800000; // 手牵手
	public static final long CHR_QUAN_QIU_REN_WMQ = 0x001000000; // 全球人
	public static final long CHR_SX_WU_QIAN_NIAN_WMQ = 0x002000000; // 上下五千年
	public static final long CHR_KA_WEI_WMQ = 0x004000000; // 卡偎
	public static final long CHR_LONG_BAI_WEI_WMQ = 0x008000000; // 龙摆尾
	public static final long CHR_XIANG_DUI_WMQ = 0x010000000; // 项对
	public static final long CHR_PIAO_DUI_WMQ = 0x020000000; // 飘对
	public static final long CHR_JI_DING_WMQ = 0x040000000; // 鸡丁
	public static final long CHR_TIAN_HU_WMQ = 0x080000000L; // 天胡
	public static final long CHR_ALL_HEI_TIAN_HU = 0x000100000000L; // 全黑天胡
	public static final long CHR_NO_TEN_XI_TIAN_HU = 0x000200000000L; // 无息天胡
	public static final long CHR_LDH_TIAN_HU = 0x000800000000L; // 六对红天胡
	public static final long CHR_JIU_DUI_TIAN_HU = 0x001000000000L; // 九对天胡
	public static final long CHR_SBD_TIAN_HU = 0x002000000000L; // 四边对天胡
	public static final long CHR_BIAN_KAN_HU = 0x004000000000L; // 边坎
	public static final long CHR_ZHEN_BKB_WMQ = 0x008000000000L; // 真背靠背
	public static final long CHR_KA_HU_WMQ = 0x010000000000L; // 卡胡
	public static final long CHR_ZHA_DAN_WMQ = 0x020000000000L; // 炸蛋
	public static final long CHR_FBW_WMQ = 0x040000000000L; // 凤摆尾
	public static final long CHR_DAN_DI_DZ_WMQ = 0x080000000000L; // 单丁对子胡
	public static final long CHR_ONE_TEN_TIAN_HU = 0x100000000000L; // 一到十天胡
	public static final long CHR_ZI_MO_WMQ = 0x200000000000L; // 自摸胡
	public static final long CHR_HEI_ZHA_DAN_WMQ = 0x400000000000L; // 黑炸蛋天胡
	public static final long CHR_2_MAN_YUAN_HUA = 0x800000000000L; // 2息满园花
	public static final long CHR_ZU_SUN_ZHUO = 0x1000000000000L; // 祖孙桌
	public static final long CHR_BIAN_DING = 0x2000000000000L; // 边丁
	public static final long CHR_TUI_DAO_HU = 0x4000000000000L; // 对倒胡
	public static final long CHR_YUAN_YUAN_DI = 0x8000000000000L; // 圆圆丁
	public static final long CHR_ZHE_ZHE_HU = 0x10000000000000L; // 啫啫胡
	public static final long CHR_XING_LIAN_XING = 0x20000000000000L; // 心连心
	public static final long CHR_HUO_ZHOU_3 = 0x40000000000000L; // 活捉小三
	public static final long CHR_2_HONG_2_HEI = 0x80000000000000L; // 两红两黑
	public static final long CHR_2_LONG_XI_ZHU = 0x100000000000000L; // 二龙戏珠
	public static final long CHR_MM_CAI_DAN_CHE = 0x200000000000000L; // 美女踩单车
	public static final long CHR_TWO_JIE_MEI_ZHUO = 0x400000000000000L; // 两姐妹桌
	public static final long CHR_GE_SHAN_DA_NIU = 0x800000000000000L; // 隔山打牛

	public static final int CHR_WMQ_SPECIAL_GA_NUAN_DA = 0; // 嘎暖哒
	public static final int CHR_WMQ_SPECIAL_MAX_COUNT = 1; // 最大胡牌数
	//////////////////////////////////////////////////////////////////// 岳阳歪胡子
	public static final long CHR_TIAN_HU_WHZ = 0x000000001; // 天胡
	public static final long CHR_DI_HU_WHZ = 0x000000002; // 地胡
	public static final long CHR_TING_HU_WHZ = 0x000000004; // 听胡
	public static final long CHR_SHI_SAN_HONG_WHZ = 0x000000008; // 十三红
	public static final long CHR_YI_DIAN_HONG_WHZ = 0x000000010; // 一点红
	public static final long CHR_QUAN_HEI_WHZ = 0x000000020; // 全黑
	public static final long CHR_QUAN_DA_WHZ = 0x000000040; // 全大
	public static final long CHR_QUAN_XIAO_WHZ = 0x000000080; // 全小
	public static final long CHR_WU_DUI_WHZ = 0x000000100; // 无对
	public static final long CHR_SHI_DUI_WHZ = 0x000000200; // 十对
	public static final long CHR_YI_DUI_WHZ = 0x000000400; // 一对
	public static final long CHR_JIU_DUI_WHZ = 0x000000800; // 九对
	public static final long CHR_HANG_HANG_XI_WHZ = 0x000001000; // 行行息
	public static final long CHR_DUI_ZI_XI_WHZ = 0x000002000; // 对子息
	public static final long CHR_HAI_LAO_WHZ = 0x000004000; // 海捞
	public static final long CHR_QUAN_QIU_REN_WHZ = 0x000008000; // 全求人
	//////////////////////////////////////////////////////////////////// 益阳歪胡子
	public static final long CHR_TIAN_HU_WHZ_YIYANG = 0x000000001; // 天胡
	public static final long CHR_DI_HU_WHZ_YIYANG = 0x000000002; // 地胡
	public static final long CHR_TING_HU_WHZ_YIYANG = 0x000000004; // 听胡
	public static final long CHR_DAN_WAI_WHZ_YIYANG = 0x000000008; // 单歪
	public static final long CHR_DAN_PENG_WHZ_YIYANG = 0x000000010; // 单碰
	public static final long CHR_YI_DIAN_HONG_WHZ_YIYANG = 0x000000020; // 一点红
	public static final long CHR_QUAN_HEI_WHZ_YIYANG = 0x000000040; // 全黑
	public static final long CHR_QUAN_DA_WHZ_YIYANG = 0x000000080; // 全大
	public static final long CHR_QUAN_XIAO_WHZ_YIYANG = 0x000000100; // 全小
	public static final long CHR_HANG_HANG_XI_WHZ_YIYANG = 0x000000200; // 行行息
	public static final long CHR_DUI_ZI_XI_WHZ_YIYANG = 0x000000400; // 对子息
	public static final long CHR_HAI_LAO_WHZ_YIYANG = 0x000000800; // 海捞
	public static final long CHR_HAI_DAN_PIAO_WHZ_YIYANG = 0x000001000; // 单飘
	public static final long CHR_HAI_SHUANG_PIAO_WHZ_YIYANG = 0x000002000; // 双飘
	public static final long CHR_HAI_YIN_WHZ_YIYANG = 0x000004000; // 印
	public static final long CHR_HAI_HUA_HUZI_WHZ_YIYANG = 0x000008000; // 花胡子
	public static final long CHR_HUO_HUO_WHZ_YIYANG = 0x000010000; // 火火翻
	//////////////////////////////////////////////////////////////////////////////////////
	public static final int CHR_PING_HU_PH = 0x00000001; // 平胡
	public static final int CHR_PENG_HU_PH = 0x00000002; // 碰胡
	public static final int CHR_WEI_HU_PH = 0x00000004; // 扫胡
	public static final int CHR_PAO_HU_PH = 0x00000008; // 跑胡
	public static final int CHR_TI_LONG_HU_PH = 0x00000010; // 提龙连胡
	public static final int CHR_SAN_DA_HU_PH = 0x00000020; // 三大连胡
	public static final int CHR_W_SAN_DA_HU_PH = 0x00000040; // 扫三大胡
	public static final int CHR_SI_QING_HU_PH = 0x00000080; // 四清连胡
	public static final int CHR_WEI_SI_HU_PH = 0x00000100; // 扫四连胡
	public static final int CHR_WU_WFU_HU_PH = 0x00000200; // 扫五福
	public static final int CHR_SHL_HU_PH = 0x00000400; // 双龙
	public static final int CHR_XQD_HU_PH = 0x00000800; // 小七对
	public static final int CHR_TIAN_HU_PH = 0x00001000; // 天胡
	public static final int CHR_DI_HU_PH = 0x00002000; // 地胡
	public static final int CHR_WU_PFU_HU_PH = 0x00004000; // 碰五福
	public static final int CHR_ZI_MO_PH = 0x00008000; // 自摸
	public static final int CHR_TIAN_HU_DELETE_CARD_PH = 0x00010000; // 天胡删除牌操作
	/////////////////////////////////////////////////////////////////// 大冶字牌
	public static final int CHR_HBZP_SAN_ZHAO = 0x000000001; // 开朝
	public static final int CHR_HBZP_PIAO_TAI = 0x000000002; // 飘台
	public static final int CHR_HBZP_SHI_HONG = 0x000000004; // 十红
	public static final int CHR_HBZP_SHI_HONG_TAI = 0x000000008; // 十红台
	public static final int CHR_HBZP_SHI_HONG_PIAO = 0x000000010; // 十红飘
	public static final int CHR_HBZP_CHUANG_TAI = 0x000000020; // 闯台
	public static final int CHR_HBZP_YI_ZHI_YAN = 0x000000040; // 一只眼
	public static final int CHR_HBZP_YI_KUAI_BIAN = 0x000000080; // 一块扁
	public static final int CHR_HBZP_JIE_JIE_LIANG = 0x000001000; // 节节亮
	public static final int CHR_HBZP_QUAN_HUN = 0x000002000; // 全荤
	public static final int CHR_HBZP_QUAN_HEI = 0x000004000; // 全黑
	public static final int CHR_HBZP_TIAN_HU = 0x000008000; // 天胡
	public static final int CHR_HBZP_DI_HU = 0x000010000; // 地胡
	public static final int CHR_HBZP_PIAO_HU = 0x000020000; // 飘胡
	public static final int CHR_HBZP_TAI_HU = 0x000040000; // 台胡
	public static final int CHR_HBZP_CHUANG_SHUANG = 0x000080000; // 闯双
	public static final int CHR_HBZP_DAN_BEI = 0x000100000; // 单倍牌型
	public static final int CHR_HBZP_MAN_30 = 0x000200000; // 满30息
	public static final int CHR_HBZP_CHUANG_PIAO = 0x000400000; // 闯台
	////////////////////////////////////////////////////////////// 眉山二七十
	public static final int CHR_MSEQS_TIAN_HU = 0x00000001; // 天胡
	public static final int CHR_MSEQS_DI_HU = 0x00000002; // 地胡
	public static final int CHR_MSEQS_JI_BEN_HU = 0x00000004; // 天胡
	public static final int CHR_MSEQS_CHI_PIAO_HU = 0x00000008; // 地胡
	public static final int CHR_MSEQS_DA_HU = 0x00000010; // 天胡
	public static final int CHR_MSEQS_KUN_DA_HU = 0x00000020; // 地胡
	public static final int CHR_MSEQS_KUN_HU = 0x00000040; // 天胡
	public static final int CHR_MSEQS_PIAO_HU = 0x00000080; // 地胡
	//////////////////////////////////////////////////////////// 荥经二七十
	public static final int CHR_YJ_LANHU = 0x0000001; // 烂胡
	public static final int CHR_YJ_QUANFENG = 0x0000002; // 圈峰一翻
	public static final int CHR_YJ_ESS_HU = 0x0000004; // 二十四胡
	public static final int CHR_YJ_XHHU = 0x0000008; // 小红胡
	public static final int CHR_YJ_HDHU = 0x0000010; // 海底胡
	public static final int CHR_YJ_ZIAN = 0x0000020; // 自案
	public static final int CHR_YJ_MCH = 0x00000040; // 满串花
	public static final int CHR_YJ_XPHU = 0x0000080; // 小铺胡
	public static final int CHR_YJ_EQSHU = 0x0000100; // 二十七
	public static final int CHR_YJ_THU = 0x0000200; // 天胡
	public static final int CHR_YJ_DIHU = 0x0000400; // 地胡
	public static final int CHR_YJ_ZHHU = 0x0000800; // 中红胡
	public static final int CHR_YJ_XHEIHU = 0x0001000; // 小黑胡
	public static final int CHR_YJ_DHEIHU = 0x0002000; // 大黑胡
	public static final int CHR_YJ_XIAOHU = 0x0004000; // 十八小
	public static final int CHR_YJ_HMCH = 0x0008000; // 红满串花
	public static final int CHR_YJ_DPHU = 0x0010000; // 大铺胡
	public static final int CHR_YJ_DHHHU = 0x0020000; // 大红胡
	public static final int CHR_YJ_HHU = 0x0040000; // 红胡
	public static final int CHR_YJ_SSHU = 0x0080000; // 三十胡
	public static final int CHR_YJ_SHEHU = 0x0100000; // 三合三翻
	public static final int CHR_YJ_SKHU = 0x0200000; // 四开三翻
	public static final int CHR_YJ_WANHU = 0x0400000; // 五案三翻

	public static final int CHR_SY_TEN_HONG = 0x00000001; // 红胡
	public static final int CHR_SY_KA_HU = 0x00000002; // 红胡
	public static final int CHR_SY_TAI_HU = 0x00000004; // 红胡
	public static final int CHR_SY_ZHAO_HU = 0x00000008; // 红胡
	public static final int CHR_SY_LONG_HU = 0x00000010; // 红胡
	public static final int CHR_SY_DA_ER_HU = 0x00000020; // 红胡
	public static final int CHR_SY_DA_QI_HU = 0x00000040; // 红胡
	public static final int CHR_SY_DA_TEN_HU = 0x00000080; // 红胡
	public static final int CHR_SY_TUO_DA_ER = 0x00000100; // 红胡
	public static final int CHR_SY_TUO_DA_QI = 0x00000200; // 红胡
	public static final int CHR_SY_TUO_DA_SHI = 0x00000400; // 红胡
	public static final int CHR_SY_WU_HU = 0x00000800; // 红胡
	public static final int CHR_SY_0_HU = 0x00001000; // 红胡
	public static final int CHR_SY_ZI_MO = 0x00002000; // 红胡
	public static final int CHR_SY_TIAN_HU = 0x00004000; // 红胡
	public static final int CHR_SY_DI_HU = 0x00008000; // 红胡
	public static final int CHR_SY_HAI_DI = 0x0010000; // 海底胡

	// 四川跑得快
	public static final long CHR_QUAN_DA_PDK = 0x000000001; // 全大
	public static final long CHR_QUAN_XIAO_PDK = 0x000000002; // 全小
	public static final long CHR_QUAN_DAN_PDK = 0x000000004; // 全单
	public static final long CHR_QUAN_SHUANG_PDK = 0x000000008; // 全双
	public static final long CHR_QUAN_HONG_PDK = 0x000000010; // 全红
	public static final long CHR_QUAN_HEI_PDK = 0x000000020; // 全黑
	// 宜丰麻将
	public static final long CHR_TIAN_HU_YF = 0x000000001; // 天胡
	public static final long CHR_DI_HU_YF = 0x000000002; // 地胡
	public static final long CHR_PING_HU_YF = 0x000000004; // 平胡
	public static final long CHR_DIAN_DIAO_YF = 0x000000008; // 平胡单吊
	public static final long CHR_QING_YI_SE_YF = 0x000000010; // 清一色
	public static final long CHR_ZI_YI_SE_YF = 0x000000020; // 字一色
	public static final long CHR_QI_XIAO_DUI_YF = 0x000000040; // 七小对
	public static final long CHR_HAOHUA_QI_XIAO_YF = 0x000000080; // 豪华七小对
	public static final long CHR_SHUANGHAO_QI_XIAO_YF = 0x000000100; // 双豪华七小对
	public static final long CHR_SANHAO_QI_XIAO_YF = 0x000000200; // 三豪华七小对
	public static final long CHR_DA_QI_DUI_YF = 0x000000400; // 大七对
	public static final long CHR_SHI_SAN_LAN_YF = 0x000000800; // 十三烂
	public static final long CHR_QIXING_SHI_SAN_LAN_YF = 0x000001000; // 七星十三烂
	public static final long CHR_QIANG_GANG_HU_YF = 0x000002000; // 抢杠胡
	public static final long CHR_GANG_SHANG_KAI_YF = 0x000004000; // 杠上开
	public static final long CHR_GANG_SHANG_PAO_YF = 0x000008000; // 杠上炮
	public static final long CHR_HAI_DI_LAO_YF = 0x000010000; // 海底捞
	public static final long CHR_DA_QI_DAN_YF = 0x000020000; // 大七对单吊
	public static final long CHR_QING_DAN_YF = 0x000040000; // 清一色单吊
	public static final long CHR_QING_QI_YF = 0x000080000; // 清一色小七对
	public static final long CHR_QING_HH_QI_YF = 0x000100000; // 清一色豪华小七对
	public static final long CHR_QING_THH_QI_YF = 0x000200000; // 清一色双豪华小七对
	public static final long CHR_QING_SHH_QI_YF = 0x000400000; // 清一色三豪华小七对
	public static final long CHR_QING_DA_QI_YF = 0x000800000; // 清一色大七对
	public static final long CHR_Zi_DIAO_YF = 0x001000000; // 字一色单吊
	public static final long CHR_ZI_QI_YF = 0x002000000; // 字一色小七对
	public static final long CHR_ZI_HH_QI_YF = 0x004000000; // 字一色豪华小七对
	public static final long CHR_ZI_THH_QI_YF = 0x008000000; // 字一色双豪华小七对
	public static final long CHR_ZI_SHH_QI_YF = 0x008000001; // 字一色三豪华小七对
	public static final long CHR_ZI_DA_QI_YF = 0x008000002; // 字一色大七对
	public static final long CHR_QING_DA_QI_DAN_YF = 0x008000004; // 清一色大七对单吊
	public static final long CHR_ZI_DA_QI_DAN_YF = 0x008000008; // 字一色大七对单吊
	public static final long CHR_ZI_MO_YF = 0x010000000; // 自摸
	public static final long CHR_PNGG_HU_YF = 0x020000000; // 接炮

	// 吉林麻将
	public static final long CHR_TIAN_HU_JL = 0x000000001; // 天胡
	public static final long CHR_DI_HU_JL = 0x000000002; // 地胡
	public static final long CHR_PING_HU_JL = 0x000000004; // 平胡
	public static final long CHR_JIA_HU_JL = 0x000000008; // 夹胡
	public static final long CHR_PIAO_HU_JL = 0x000000010; // 飘胡
	public static final long CHR_QI_DUI_JL = 0x000000020; // 七对胡
	public static final long CHR_HAO_QI_JL = 0x000000040; // 豪华七对胡
	public static final long CHR_T_HAO_QI_JL = 0x000000080; // 双豪华七对胡
	public static final long CHR_S_HAO_QI_JL = 0x000000100; // 三豪华七对胡
	public static final long CHR_QIANG_GANG_HU_JL = 0x000000200; // 抢杠胡
	public static final long CHR_GANG_SHANG_KAI_JL = 0x000000400; // 杠上开
	public static final long CHR_GANG_SHANG_PAO_JL = 0x000000800; // 杠上炮
	public static final long CHR_QING_YI_SE_JL = 0x000001000; // 清一色
	public static final long CHR_MEN_QING_JL = 0x000002000; // 门清
	public static final long CHR_JIA_WU_JL = 0x000004000; // 夹五
	public static final long CHR_SAN_MEN_QING_JL = 0x000008000; // 三门清
	public static final long CHR_SI_MEN_QING_JL = 0x000008000; // 四门清
	public static final long CHR_SHOU_BA_YI_JL = 0x000010000; // 手把一
	public static final long CHR_DUI_BAO_JL = 0x000020000; // 对宝
	public static final long CHR_KAN_BAO_JL = 0x000040000; // 坎宝
	public static final long CHR_MO_BAO_JL = 0x000080000; // 摸宝
	public static final long CHR_ZHAN_LI_JL = 0x000100000; // 站立

	// 牌局结束
	// 结束原因
	public static final int GER_NORMAL = 0x00; // 常规结束
	public static final int GER_DISMISS = 0x01; // 游戏解散
	public static final int GER_USER_LEAVE = 0x02; // 用户离开
	public static final int GER_NETWORK_ERROR = 0x03; // 网络错误

	//////////////////////////////////////////////////////////////////////////////////////
	// 结束
	public static final int Game_End_NORMAL = 1; // 正常结束
	public static final int Game_End_DRAW = 2; // 流局
	public static final int Game_End_ROUND_OVER = 3; // 圈数用完了，结束
	public static final int Game_End_RELEASE_NO_BEGIN = 4; // 没开始就解散了
	public static final int Game_End_RELEASE_PLAY = 5; // 游戏过程中解散的
	public static final int Game_End_RELEASE_RESULT = 6; // 游戏过程中解散的
	public static final int Game_End_RELEASE_PLAY_TIME_OUT = 7; // 超时解散
	public static final int Game_End_RELEASE_WAIT_TIME_OUT = 8; // 超时解散
	public static final int Game_End_RELEASE_SYSTEM = 9; // 系统强制解散

	public static final int Game_End_RELEASE_IN_GOLD = 10; // 金币场逃跑解散
	public static final int Game_End_CANCEL_BANKER = 11; // 用户下庄
	//////////////////////////////////////////////////////////////////////////
	// public static final int HU_RESULT_NULL = 0;
	// public static final int HU_RESULT_ZIMO = 1;
	// public static final int HU_RESULT_FANGPAO = 2;
	// public static final int HU_RESULT_JIEPAO = 3;
	public static final int HU_RESULT_FANG_KAN_QUAN_BAO = 4;
	////////////////////////////////////////////////////////////////////////////////////////
	// 效果定义
	public static final int EFFECT_ACTION_TYPE_HU = 1;
	public static final int EFFECT_ACTION_TYPE_ACTION = 2;
	public static final int Effect_Action_Other = 3;
	public static final int Effect_Action_SHAI_ZI = 4;
	public static final int EFFECT_ACTION_TYPE_GOLD = 5;
	public static final int EFFECT_ACTION_LIU_ZI = 10;
	public static final int EFFECT_DISPLAY_VOICE = 100;
	public static final int EFFECT_ACTION_DRAW = 6;
	public static final int EFFECT_ACTION_TYPE_DOUBLE = 7;
	public static final int EFFECT_ACTTON_CACEL_DISPLAY_CARD = 8;
	public static final int EFFECT_ACTION_CACEL_OUT_CARD = 9;
	public static final int EFFECT_ACTION_ZHE_ZHE_HU = 30; // 偎麻雀啫啫胡
	public static final int EFFECT_ACTION_FANG_PAO = 40; // 个子牌放炮动画
	public static final int EFFECT_ACTION_ZI_MO = 50; // 个子牌自摸动画
	public static final int EFFECT_ACTION_CP = 60; // 长牌操作显示
	public static final int EFFECT_PIAO_FEN = 70; // 飘分操作
	public static final int EFFECT_FAN_BAO = 80; // 翻宝操作
	public static final int EFFECT_KAN_BAO = 82; // 看宝操作
	public static final int EFFECT_HUAN_BAO = 83; // 换宝操作
	public static final int EFFECT_DUI_BAO = 84; // 对宝操作
	public static final int EFFECT_MO_BAO = 85; // 摸宝操作
	public static final int EFFECT_KAN_DUI_BAO = 86; // 换宝操作
	public static final int EFFECT_FEN_ZHANH = 87; // 分张操作
	public static final int EFFECT_GNAG_SCORE = 81; // 杠分动画
	public static final int EFFECT_ACTION_HU_PAI_TYPE = 90; // 播放胡牌动画

	public static final int CP_WAIT_TOU = 1; // 长牌等待偷
	public static final int CP_DISPLAY_KOU = 2; // 显示扣
	public static final int LZ_DOU_LZ = 1;
	public static final int LZ_WIN_LZ = 2;
	public static final int LZ_FEN_LZ = 3;
	public static final int HH_RANK_SEAT = 1; // 随机位置

	public static final int FLY_GOLD = 1;
	public static final int ACT_DRAW = 1;

	public static final int CHR_YAO_SAI_ZI = 0x10001;
	/// 其他类型效果
	public static final int EFFECT_LAST_FOUR_CARD = 1;// 最后4张牌
	public static final int PAO_SAO_TI_TIME = 2100;

	public static final int Show_Card_HU = 1;
	public static final int Show_Card_XiaoHU = 2;
	public static final int Show_Card_Center = 3;
	public static final int Show_Card_Si_Chuan = 4; // 四川-胡牌摊牌
	public static final int Show_Card_LY_HU = 5; // 耒阳胡牌翻牌
	public static final int Show_Gang_Card = 6; // 三门峡显示杠后能选的牌
	/////////////////////////////////////////////////////////////////////

	public static final int CS_GANG_DRAW_COUNT = 2; //
	public static final int AN_HUA_GANG_DRAW_COUNT = 3; //

	public static final int ZHUZHOU_GANG_DRAW_COUNT = 1; //

	public static final int OUT_CARD_TYPE_MID = 0;
	public static final int OUT_CARD_TYPE_LEFT = 1;
	public static final int OUT_CARD_TYPE_XIA_ZI = 2;
	public static final int OUT_CARD_TYPE_HUA_PAI = 3;

	/////////////////////////////////////////////////////////////////////
	public static final int CARD_STATUS_NORMAL = 0;
	public static final int CARD_STATUS_CS_GANG = 1;
	public static final int CARD_STATUS_BAO_TING = 2; // 报听
	public static final int CARD_STATUS_CHI_PENG_CHU_PAI = 3; // 吃碰之后出牌
	public static final int CARD_STATUS_LI_ZHUANG_LI_KOU = 4; // 离庄离扣
	/////////////////////////////////////////////////////////////////////
	public static final int HU_CARD_TYPE_ZIMO = 1;
	public static final int HU_CARD_TYPE_PAOHU = 2;
	public static final int HU_CARD_TYPE_QIANGGANG = 3;
	public static final int HU_CARD_TYPE_RE_CHONG = 4;
	public static final int HU_CARD_TYPE_TIAN_HU = 5;
	public static final int HU_CARD_TYPE_GANG_KAI = 6;// 判断杠上开花
	public static final int HU_CARD_TYPE_GANG_PAO = 7;// 判断杠上炮
	public static final int HU_CARD_TYPE_GANG_CI = 8;// 洛阳杠次
	public static final int HU_CARD_TYPE_AN_GANG_KAI = 9;// 判断暗杠杠上开花
	public static final int HU_CARD_TYPE_FAN_PAI = 10; // 字牌，翻出来的牌，并且不是自己翻出来的
	public static final int HU_CARD_TYPE_GANG_DI = 11;// 杠底
	public static final int HU_CARD_TYPE_BU_GANG_KAI = 12;// 判断补杠杠上开花
	public static final int HU_CARD_TYPE_PI_CI = 13; // 洛阳杠次，皮次胡牌

	////////////////////////////////////////////////////////////////////////
	public static final int GANG_TYPE_AN_GANG = 1; // 暗杠
	public static final int GANG_TYPE_JIE_GANG = 2; // 明杠/接杠
	public static final int GANG_TYPE_ADD_GANG = 3; // 碰杠/回头杠/续杠
	public static final int GANG_TYPE_LAI_ZI_PI_ZI_GANG = 4; // 癞子痞子杠
	public static final int GANG_TYPE_HONG_ZHONG = 5; // 红中杠
	public static final int GANG_TYPE_FA_CAI = 6; // 发财杠
	public static final int GANG_TYPE_LAI_ZI = 7; // 癞子杠
	public static final int CHI_TYPE_LAI_ZI_CHI = 8; // 癞子吃
	public static final int GANG_TYPE_PI_ZI = 9; // 痞子杠

	public static final int PAO_TYPE_AN_LONG = 1;
	public static final int PAO_TYPE_TI_MINE_LONG = 2;
	public static final int PAO_TYPE_MINE_SAO_LONG = 3;
	public static final int PAO_TYPE_MINE_PENG_PAO = 4;
	public static final int PAO_TYPE_OTHER_SAO_PAO = 5;
	public static final int PAO_TYPE_OHTER_PAO = 6;
	public static final int SAO_TYPE_MINE_SAO = 7;

	public static final int GZP_TYPE_ZHAO = 1;
	public static final int GZP_TYPE_GUAN = 2;
	public static final int GZP_TYPE_HUA_MO = 3;
	public static final int GZP_TYPE_HUA_OUT = 4;
	public static final int GZP_TYPE_ZHAO_HUA = 5;

	//////////////////////////////////////////////////////////////////////// 吃碰牌的类型
	public static final int CHI_PENG_TYPE_OUT_CARD = 0;
	public static final int CHI_PENG_TYPE_GANG = 1;
	public static final int CHI_PENG_TYPE_CHAO_TIAN = 2;
	public static final int CHI_PENG_TYPE_DISPATCH = 3; // 发牌
	public static final int CHI_PENG_TYPE_ADD = 4; // 发牌
	public static final int CHR_DING_FU_TOU_TYPE_DISPATCH = 5; // 番牌
	public static final int CHR_DING_FU_TOU_TYPE_ADD = 6; // 补牌
	public static final int CHI_PENG_TYPE_ABANDONED_GANG = 7; // 有杠是选择了碰

	////////////////////////////////////////////////////////////////////// 打抓牌类型
	public static final int CHR_DZ_DISPATCH_CARD = 1;
	public static final int CHR_DZ_ADD_CARD = 2;
	public static final int CHR_DZ_OUT_CARD = 3;

	//////////////////////////////////////////////////////////////////////// 下跑最大个数
	public static final int PAO_MAX_COUNT = 2;

	public static final int PAO_MAX_COUNT_HENAN = 3;
	public static final int PAO_MAX_COUNT_HENAN_SMX = 5;

	public static final int PAO_MAX_COUNT_PIAO_FLS = 5;// 福禄寿飘 最大5分
	public static final int PAO_MAX_COUNT_LP_XP = 4;// 溆浦老牌
	public static final int PAO_MAX_COUNT_GZP = 3;// 溆浦老牌
	public static final int PAO_MAX_COUNT_DSS_MS = 2; // 眉山斗十四
	public static final int PAO_MAX_COUNT_PHZ_XINHUA = 4; // 新化跑胡子
	// public static final int GANG_TYPE_MENG_XIAO = 4;
	// public static final int GANG_TYPE_DIAN_XIAO = 5;
	// public static final int GANG_TYPE_HUI_TOU_XIAO = 6;
	// public static final int GANG_TYPE_DA_CHAO_TIAN = 7;
	// public static final int GANG_TYPE_XIAO_CHAO_TIAN = 8;
	// 扑克定义

	// 0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09, //万子
	// 0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19, //索子
	// 0x21,0x22,0x23,0x24,0x25,0x26,0x27,0x28,0x29, //同子
	// 0x31,0x32,0x33,0x34,0x35,0x36,0x37, //番子,东南西北，中发白
	// 0x38,0x39,0x3A,0x3B,0x3C,0x3D,0x3E,0x3F, //花子

	//////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	// 静态变量

	/**
	 * 万条筒--108张
	 */
	public static final int CARD_DATA_WAN_TIAO_TONG[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};

	/**
	 * 万条筒风--136张
	 */
	public static final int CARD_DATA_DAI_FENG[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};

	/**
	 * 万条筒加红中癞子--112张
	 */
	public static final int CARD_DATA_HONG_ZHONG_LAI_ZI[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x35, 0x35, 0x35, 0x35, // 红中
	};

	// 湖南麻将数据
	public static final int CARD_DATA_HU_NAN[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};

	// 红中麻将数据
	public static final int CARD_DATA_HZ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x35, 0x35, 0x35, 0x35, // 红中

	};

	// 红中麻将数据
	public static final int CARD_DATA_HZ_8[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x35, 0x35, 0x35, 0x35, // 红中
			0x35, 0x35, 0x35, 0x35, // 红中

	};

	// 全部的麻将数据
	public static final int CARD_DATA_MAX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板

			0x38, 0x38, 0x38, 0x38, // 春
			0x39, 0x39, 0x39, 0x39, // 夏
			0x41, 0x41, 0x41, 0x41, // 秋
			0x42, 0x42, 0x42, 0x42, // 冬
			0x43, 0x43, 0x43, 0x43, // 梅
			0x44, 0x44, 0x44, 0x44, // 兰
			0x45, 0x45, 0x45, 0x45, // 竹
			0x46, 0x46, 0x46, 0x46, // 菊
	};

	// 安阳麻将数据
	public static final int CARD_DATA_DAI_FENG_AY[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板

			0x38, // 春
	};

	// 安阳麻将数据 不带风
	public static final int CARD_DATA_BU_DAI_FENG_AY[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			// 0x31,0x31,0x31,0x31, //东风
			// 0x32,0x32,0x32,0x32, //西风
			// 0x33,0x33,0x33,0x33, //南风
			// 0x34,0x34,0x34,0x34, //北风
			// 0x35,0x35,0x35,0x35, //红中
			// 0x36,0x36,0x36,0x36, //绿发
			// 0x37,0x37,0x37,0x37, //白板

			0x38, // 春
	};
	// 信阳麻将数据
	public static final int CARD_DATA_XY[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};
	// 三门峡麻将
	public static final int CARD_DATA_DAI_FENG_SMX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};
	// 三门峡麻将不带风
	public static final int CARD_DATA_BU_DAI_FENG_SMX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};
	// 林州麻将数据
	public static final int CARD_DATA_DAI_FENG_LZ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};

	// 林州麻将数据 不带风
	public static final int CARD_DATA_BU_DAI_FENG_LZ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};

	// 江苏镇江麻将不带风
	public static final int CARD_DATA_JIANGSU_ZZ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 南风
			0x33, 0x33, 0x33, 0x33, // 西风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};
	// 濮阳麻将
	public static final int CARD_DATA_DAI_FENG_PY[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};
	// 濮阳麻将不带风
	public static final int CARD_DATA_BU_DAI_FENG_PY[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};
	public static final int CARD_DATA_FLS_LX[] = new int[] { 0x01, 0x01, 0x01, 0x01, // 上
			0x02, 0x02, 0x02, 0x02, // 大
			0x03, 0x03, 0x03, 0x03, // 人

			0x11, 0x11, 0x11, 0x11, // 丘
			0x12, 0x12, 0x12, 0x12, // 乙
			0x13, 0x13, 0x13, 0x13, // 己

			0x21, 0x21, 0x21, 0x21, // 化
			0x22, 0x22, 0x22, 0x22, // 三
			0x23, 0x23, 0x23, 0x23, // 千

			0x31, 0x31, 0x31, 0x31, // 七
			0x32, 0x32, 0x32, 0x32, // 十
			0x33, 0x33, 0x33, 0x33, // 土

			0x41, 0x41, 0x41, 0x41, // 尔
			0x42, 0x42, 0x42, 0x42, // 小
			0x43, 0x43, 0x43, 0x43, // 生

			0x51, 0x51, 0x51, 0x51, // 八
			0x52, 0x52, 0x52, 0x52, // 九
			0x53, 0x53, 0x53, 0x53, // 子

			0x61, 0x61, 0x61, 0x61, // 佳
			0x62, 0x62, 0x62, 0x62, // 作
			0x63, 0x63, 0x63, 0x63, // 亡

			0x71, 0x71, 0x71, 0x71, // 福
			0x72, 0x72, 0x72, 0x72, // 禄
			0x73, 0x73, 0x73, 0x73, // 寿
	};

	public static final int CARD_DATA_FLS_LX_DP[] = new int[] { 0x01, 0x01, 0x01, 0x01, // 上
			0x02, 0x02, 0x02, 0x02, // 大
			0x03, 0x03, 0x03, 0x03, // 人

			0x11, 0x11, 0x11, 0x11, // 丘
			0x12, 0x12, 0x12, 0x12, // 乙
			0x13, 0x13, 0x13, 0x13, // 己

			0x21, 0x21, 0x21, 0x21, // 化
			0x22, 0x22, 0x22, 0x22, // 三
			0x23, 0x23, 0x23, 0x23, // 千

			0x31, 0x31, 0x31, 0x31, // 七
			0x32, 0x32, 0x32, 0x32, // 十
			0x33, 0x33, 0x33, 0x33, // 土

			0x41, 0x41, 0x41, 0x41, // 尔
			0x42, 0x42, 0x42, 0x42, // 小
			0x43, 0x43, 0x43, 0x43, // 生

			0x51, 0x51, 0x51, 0x51, // 八
			0x52, 0x52, 0x52, 0x52, // 九
			0x53, 0x53, 0x53, 0x53, // 子

			0x61, 0x61, 0x61, 0x61, // 佳
			0x62, 0x62, 0x62, 0x62, // 作
			0x63, 0x63, 0x63, 0x63, // 亡

			0x71, 0x71, 0x71, 0x71, // 福
			0x72, 0x72, 0x72, 0x72, // 禄
			0x73, 0x73, 0x73, 0x73, // 寿

			0x04, 0x14, 0x24, 0x34, 0x44, 0x54, 0x64, 0x74 // 赖子
	};

	////////////////////////////////////////////////////////////// 个子牌//////////////////////////////////////////////

	public static final int GZP_CARD_DATA[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 乙二三四五六七八九十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, 0x0a, 0x02, 0x04, 0x06, 0x08, 0x0a, 0x02, 0x04, 0x06, 0x08, 0x0a, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16,
			0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, // 上大人孔己可知礼化千土子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16,
			0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c,
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x21, 0x23, 0x25, 0x27, 0x29, // 花-乙三五七九
			0x21, 0x23, 0x25, 0x27, 0x29
			// 0x101, 0x101, 0x001, 0x001, 0x001, // 乙// // 带圈的乍
			// 0x002, 0x002, 0x002, 0x002, 0x002, // 二
			// 0x103, 0x103, 0x003, 0x003, 0x003, // 三
			// 0x004, 0x004, 0x004, 0x004, 0x004, // 四
			// 0x105, 0x105, 0x005, 0x005, 0x005, // 五
			// 0x006, 0x006, 0x006, 0x006, 0x006, // 六
			// 0x107, 0x107, 0x007, 0x007, 0x007, // 七
			// 0x008, 0x008, 0x008, 0x008, 0x008, // 八
			// 0x109, 0x109, 0x009, 0x009, 0x009, // 九
			// 0x00a, 0x00a, 0x00a, 0x00a, 0x00a, // 十
			// 0x011, 0x011, 0x011, 0x011, 0x011, // 上
			// 0x012, 0x012, 0x012, 0x012, 0x012, // 大
			// 0x013, 0x013, 0x013, 0x013, 0x013, // 人
			// 0x014, 0x014, 0x014, 0x014, 0x014, // 孔
			// 0x015, 0x015, 0x015, 0x015, 0x015, // 己
			// 0x016, 0x016, 0x016, 0x016, 0x016, // 可
			// 0x017, 0x017, 0x017, 0x017, 0x017, // 知
			// 0x018, 0x018, 0x018, 0x018, 0x018, // 礼
			// 0x019, 0x019, 0x019, 0x019, 0x019, // 化
			// 0x01a, 0x01a, 0x01a, 0x01a, 0x01a, // 千
			// 0x01b, 0x01b, 0x01b, 0x01b, 0x01b, // 土
			// 0x01c, 0x01c, 0x01c, 0x01c, 0x01c, // 子
	};

	public static final int CARD_DATA_ZP_XY[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾

	};
	// 四川长牌
	public static final int CARD_DATA_CP_SCH[] = new int[] { 0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43,
			0x07, 0x16, //
			0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //

	};
	// 邛崃烘房
	public static final int CARD_DATA_QLHF[] = new int[] { 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16,
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, 0xd8,
			0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, 0xd8, 0xf8,
			0x80, 0x45, 0x09, 0x0a, 0x46, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, 0xd8, 0xf8, 0x80,
			0x45, 0x09, 0x0a, 0x46 };
	// 四川长牌
	public static final int CARD_DATA_CP_SCH_DHHZ[] = new int[] { 0x20, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43,
			0x07, 0x16, //
			0x20, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0x20, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0x20, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x66, //

	};
	// 四川长牌打抓
	public static final int CARD_DATA_CP_DZ[] = new int[] { 0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43,
			0x07, 0x16, //
			0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0x20, 0x12, 0x04, 0x13, 0x05, 0x50, 0x06, 0x15, 0x42, 0x43, 0x07, 0x16, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //
			0xd8, 0xf8, 0x80, 0x45, 0x09, 0x0a, 0x46, 0x0b, 0x66, //

	};
	// 攸县红黑胡
	public static final int CARD_DATA_HH_YX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
	};
	// 岳阳歪胡子
	public static final int CARD_DATA_PHZ_YYWHZ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
			0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
	};

	// 跑胡子 默认牌
	public static final int[] CARD_PHZ_DEFAULT = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
	};

	// 溆浦老牌带风
	public static final int CARD_DATA_LP_XP_DAI_FENG[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 万子

			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 南风
			0x33, 0x33, 0x33, 0x33, // 西风
	};
	// 攸县红黑胡
	public static final int CARD_DATA_BH_XP[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 万子1万-牛婆
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 索子一索-老钱
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2a, // 本子-本-飘花
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2a, // 本子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2a, // 本子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2a,// 本子
	};
	// 溆浦老牌不带风
	public static final int CARD_DATA_LP_XP[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};
	// 贵州板子炮
	public static final int CARD_DATA_BZP_GZH[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
			0x0A, 0x0B, 0x0C, 0x0D, // 方块A-K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花A-K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A-K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A-K

	};
	public static final int CARD_CAI_SHENG = 0x38; //

	public static final int Release_Room_Type_SEND = 1; // 发起解散
	public static final int Release_Room_Type_AGREE = 2; // 同意
	public static final int Release_Room_Type_DONT_AGREE = 3; // 不同意
	public static final int Release_Room_Type_CANCEL = 4; // 还没开始,房主解散房间
	public static final int Release_Room_Type_QUIT = 5; // 还没开始,普通玩家退出房间
	public static final int Release_Room_Type_PROXY = 6; // 代理解散房间
	public static final int Release_Room_Type_OBSERVER = 7; // 旁观者离开房间
	public static final int Release_Room_Type_GOD_OBSERVER = 8; // 上帝视角旁观者离开房间

	public static final int CARD_ESPECIAL_TYPE_NIAO = 1000;
	public static final int CARD_ESPECIAL_TYPE_HU = 2000;
	public static final int CARD_HU_PAI_FLAG = 0x100; // 胡什么牌

	public static final int CARD_ESPECIAL_TYPE_GUI = 3000;// 鬼
	public static final int CARD_ESPECIAL_TYPE_LAI_ZI = 3200;// ;//癞子

	public static final int CARD_ESPECIAL_TYPE_GANG = 3400; // 杠牌

	public static final int CARD_ESPECIAL_TYPE_DING_GUI = 4000;// 定鬼
	public static final int CARD_ESPECIAL_TYPE_LAI_GEN = 4200;// ;//赖根
	public static final int CARD_ESPECIAL_TYPE_PI_ZI = 4300;// ;// 痞子
	public static final int CARD_ESPECIAL_TYPE_HZ = 4400;// ;// 红中

	public static final int CARD_ESPECIAL_TYPE_TING = 5000;// ;//听牌标示
	public static final int CARD_ESPECIAL_TYPE_BAO_TING = 5200;// ;//报听标示
	public static final int CARD_ESPECIAL_TYPE_LU_ZHOU_GUI = 5500; // 泸州鬼替换的红中牌

	public static final int CARD_ESPECIAL_TYPE_HUN = 6000;// 混牌
	public static final int CARD_ESPECIAL_TYPE_DA = 6100;// 搭牌
	public static final int CARD_ESPECIAL_TYPE_CI = 7000; // 次牌
	public static final int CARD_ESPECIAL_TYPE_CAN_WIN = 7000; // 杠翻出来的牌能胡
	public static final int CARD_ESPECIAL_TYPE_TOU_DA = 8000;
	public static final int CARD_ESPECIAL_TYPE_ER_DA = 8100;
	public static final int CARD_ESPECIAL_TYPE_BEIDONG_DA = 8200;
	public static final int CARD_ESPECIAL_TYPE_PEN_CHANGER = 9000; // 碰牌变暗标示

	public static final int CARD_ESPECIAL_TYPE_WANG_BA = 10000; // 王霸牌

	public static final int CARD_ESPECIAL_TYPE_DING_WANG_PAI = 10100; // 定王牌

	public static final int CARD_ESPECIAL_TYPE_CAN_NOT_SHOOT = 0x100; // 跑胡子--不能射跑的牌
	public static final int CARD_ESPECIAL_TYPE_CAN_SHOOT = 0x200; // 跑胡子--能射跑的牌

	public static final int CARD_ESPECIAL_TYPE_CAN_NOT_OUT = 11000; // 柳州麻将，吃牌后不能出吃的那张牌

	public static final int CARD_ESPECIAL_TYPE_LIANG_ZHANG = 12000; // 商丘麻将亮张

	public static final int CARD_ESPECIAL_TYPE_LIANG_ZHANG_BIAO_TING = 12500; // 商丘麻将亮张报听

	public static final int CARD_ESPECIAL_TYPE_YAOJIU = 13000; // 幺九牌

	public static final int CARD_ESPECIAL_TYPE_SHENGPAI = 14000; // 神牌

	public static final int CARD_ESPECIAL_TYPE_SHENGPAI_TING = 14500; // 神牌报听

	public static final int CARD_ESPECIAL_TYPE_BAO = 15000; // 瑞金宝牌

	public static final int CARD_ESPECIAL_TYPE_XIA_PAI = 16000; // 虾子牌

	public static final int CARD_ESPECIAL_TYPE_HU_BAO = 17000; // 瑞金胡宝

	public static final int CARD_ESPECIAL_TYPE_CANT_OUT = 18000; // 不能出牌

	public static final int CARD_ESPECIAL_TYPE_JING = 19000; // 金

	public static final int CARD_ESPECIAL_TYPE_TING_XN = 20000; // 乡宁能见听牌标示

	public static final int CARD_ESPECIAL_TYPE_SWITCHED_CARD = 21000; // 四川麻将，换三张的牌

	public static final int CARD_ESPECIAL_TYPE_NEW_TING = 1000000; // 新的特殊值，可以在现有的特殊值上面再叠加一次

	//////////
	public static final int WEAVE_SHOW_DIRECT = 1000;// ;//显示组合牌的 放坎人

	// 特殊描述类型
	public static final int CREATE_ROOM_COIN = 6; // 金币场开房

	// 特别显示的描述
	public static final int Especial_Txt_Type_NULL = 0;// 无,不显示
	public static final int Especial_Txt_Type_PIAO_LAI = 1;// 飘赖显示

	// 牌局过程结算
	public static final int Score_Type_NULL = 0;// 无,不显示
	public static final int Score_Type_PIAO_LAI = 1;// 飘赖分数
	public static final int Score_Type_GANG = 2;// 杠(笑)牌,分数

	// //发牌类型
	public static final int DISPATCH_CARD_TYPE_NORMAL = 1;// 普通发牌
	public static final int DispatchCard_Type_Tian_Hu = 2;// 第一张牌
	public static final int DISPATCH_CARD_TYPE_GANG = 3; // 杠发牌
	//
	// //发牌类型
	public static final int OutCard_Type_Noraml = 1;// 普通出牌
	public static final int OutCard_Type_Di_Hu = 2;
	// public static final int OutCard_Type_Ming_Gang2 = 3;//明杠出牌

	/////////////////////////////////////////////////////////////////////////// 鸟
	public static final int JING_NIAO_VALID = 1800;
	public static final int DING_NIAO_VALID = 1000;
	public static final int DING_NIAO_INVALID = 200;
	public static final int FEI_NIAO_VALID = 1500;
	public static final int FEI_NIAO_INVALID = 500;
	//////////////////////////////////////////////////////////////////////////// 代理相关
	public static final int CREATE_ROOM_PROXY_TIME_GAP = 30; // 10分钟
	public static final int CREATE_ROOM_NORMAL = 0;
	public static final int CREATE_ROOM_PROXY = 1; // 代理开房
	public static final int CREATE_ROOM_SYS = 3; // 系统开房
	public static final int CREATE_ROOM_ROBOT = 2; // 机器人开房
	public static final int CREATE_ROOM_MATCH = 4; // 比赛场开房
	public static final int CREATE_ROOM_CLUB = 5; // 俱乐部开房
	public static final int CREATE_ROOM_NEW_COIN = 7; // 金币场开房

	public static final int PROXY_ROOM_RELEASE = 1;
	public static final int PROXY_ROOM_UPDATE = 2;
	public static final int PROXY_ROOM_PLAYER = 2;

	public static final int TRUSTEE_TIME_OUT_SECONDS = 15;
	public static final int TRUSTEE_TIME_OUT_SECONDS_30 = 30; // 托管时间

	//////////////////////////////////////////////// 牛牛定义//////////////////////////////////////////////////////
	// 扑克牌值
	public static final int CARD_DATA_OX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D // 黑桃
																							// A
																							// -
																							// K

	};
	//////////////////////////////////////////////// 没有花牛牛定义//////////////////////////////////////////////////////
	// 扑克牌值
	public static final int CARD_DATA_NO_HUA_PAI_OX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, // 方块
					// //
					// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 梅花
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 红桃
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, // 黑桃

	};
	//////////////////////////////////////////////// 三公定义//////////////////////////////////////////////////////
	// 扑克牌值
	public static final int CARD_DATA_SG_JD[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D // 黑桃
																							// A
																							// -
																							// K

	};
	//////////////////////////////////////////////// 三公定义//////////////////////////////////////////////////////
	// 扑克牌值
	public static final int CARD_DATA_SG_SW[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x4E, 0x4F // 大王,小王

	};

	//////////////////////////////////////////////// 黑杰克//////////////////////////////////////////////////////
	// 扑克牌值
	public static final int CARD_DATA_HJK[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D // 黑桃
																							// A
																							// -
																							// K

	};
	//////////////////////////////////////////////// 九点半//////////////////////////////////////////////////////
	// 扑克牌值
	public static final int CARD_DATA_JDB[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x4E, 0x4F // 大王,小王

	};

	/////////////////////////////////////////////////////////////////////////////////////////////////////
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_PDK_JD[] = new int[] { 0x01, 0x11, 0x21, 0x02, 0x03, 0x13, 0x23, 0x33, 0x04, 0x14,
			0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37, 0x08, 0x18, 0x28, 0x38,
			0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C, 0x2C, 0x3C, 0x0D, 0x1D,
			0x2D, 0x3D // K
	};
	// 扑克牌值 一副牌15张
	public static final int CARD_DATA_PDK_FIFTEEN[] = new int[] { 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B,
			0x0C, // 方块
					// A
					// -
					// K
			0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																				// A
																				// -
																				// K
			0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
																				// -
																				// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D // 黑桃A
																							// -
																							// K
	};
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_PDK_JD_AAAA[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x03, 0x13, 0x23, 0x33, 0x04,
			0x14, 0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37, 0x08, 0x18, 0x28,
			0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C, 0x2C, 0x3C, 0x0D,
			0x1D, 0x2D, 0x3D // K
	};
	// 四人一副牌玩法
	public static final int CARD_DATA_PDK_SR_ONE[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
			0x0A, 0x0B, 0x0C, 0x0D, // 方块
									// A
									// -
									// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D // 黑桃A
																							// -
																							// K
	};
	// 四人两副牌玩法
	public static final int CARD_DATA_PDK_SR_TWO[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
			0x0A, 0x0B, 0x0C, 0x0D, // 方块
									// A
									// -
									// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A
																							// -
																							// K
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																							// A
																							// -
																							// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A
																							// -
																							// K
			0x4E, 0x4E, 0x4F, 0x4F };

	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_PDK_SR_SC[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x05, 0x15, 0x25, 0x35, 0x06,
			0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37, 0x08, 0x18, 0x28, 0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A,
			0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C, 0x2C, 0x3C, 0x0D, 0x1D, 0x2D, 0x3D // K
	};
	public static final int CARD_DATA_PDK_ER_SC[] = new int[] { 0x11, 0x21, 0x31, 0x15, 0x25, 0x35, 0x16, 0x26, 0x36,
			0x17, 0x27, 0x37, 0x18, 0x28, 0x38, 0x19, 0x29, 0x39, 0x1A, 0x2A, 0x3A, 0x1B, 0x2B, 0x3B, 0x1C, 0x2C, 0x3C,
			0x1D, 0x2D, 0x3D // K
	};
	// 扑克牌值
	public static final int CARD_DATA_DDZ[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x02, 0x12, 0x22, 0x32, 0x03, 0x13,
			0x23, 0x33, 0x04, 0x14, 0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37,
			0x08, 0x18, 0x28, 0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C,
			0x2C, 0x3C, 0x0D, 0x1D, 0x2D, 0x3D, 0x4E, 0x4F, };
	// 扑克牌值
	public static final int CARD_DATA_DDZ_JX[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x02, 0x12, 0x03, 0x13, 0x23, 0x33,
			0x04, 0x14, 0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37, 0x08, 0x18,
			0x28, 0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C, 0x2C, 0x3C,
			0x0D, 0x1D, 0x2D, 0x3D, 0x4E, 0x4F, 0x5E };
	// 扑克牌值
	public static final int CARD_DATA_SDH[] = new int[] { 0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C,
			0x0D, // 方块
					// A
					// -
					// K
			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																				// A
																				// -
																				// K
			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																				// A
																				// -
																				// K
			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																				// A
																				// -
																				// K
			0x41, 0x42, 0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																							// A
																							// -
																							// K
			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																				// A
																				// -
																				// K
			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																				// A
																				// -
																				// K
			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																				// A
																				// -
																				// K
			0x41, 0x42, };
	// 扑克牌值
	public static final int CARD_DATA_DDZ_ER[] = new int[] { 0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C,
			0x0D, // 方块
					// A
					// -
					// K
			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																				// A
																				// -
																				// K
			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																				// A
																				// -
																				// K
			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																				// A
																				// -
																				// K
			0x4E, 0x4F, };
	// 扑克牌值
	public static final int CARD_DATA_ZJH[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
	};

	// 扑克牌值
	public static final int CARD_DATA_SSZ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
	};
	// 扑克牌值
	public static final int CARD_DATA_BAGUAI[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
	};
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_WSK[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x4E, 0x4F, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																										// A
																										// -
																										// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x4E, 0x4F, };

	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_WSK_PC[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
			// A
			// -
			// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x4E, 0x4F, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																										// A
																										// -
																										// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x4E, 0x4F, };
	public static final int CARD_DATA_WSK_PC_NO_W[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
			0x0A, 0x0B, 0x0C, 0x0D, // 方块
			// A
			// -
			// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																							// A
																							// -
																							// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
	};
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_GDY[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
			0x4E, 0x4F, };
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_XYKL[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																							// A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																							// A
																							// -
																							// K
	};
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_DBD[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																					// A
																					// -
																					// K
			0x31, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																					// A
																					// -
																					// K
			0x4E, 0x5E, 0x6E,// 癞子
	};

	// 扑克牌值
	public static final int CARD_DATA_PJ[] = new int[] { 0x02, 0x04, 0x06, 0x07, 0x08, 0x0A, 0x0C, // 方块
																									// A
																									// -
																									// K
			0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, // 梅花
															// A
															// -
															// K
			0x22, 0x23, 0x24, 0x26, 0x27, 0x28, 0x2A, 0x2C, // 红桃
															// A
															// -
															// K
			0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, // 黑桃
			0x4F, // A
			// -
			// K
	};

	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_ABZ_A_BAO[] = new int[] { 0x04, 0x05, 0x06, 0x07, 0x09, 0x0A, 0x0B, 0x0C, // 方块
																												// A
																												// -
																												// K
			0x14, 0x15, 0x16, 0x17, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																	// A
																	// -
																	// K
			0x21, 0x24, 0x25, 0x26, 0x27, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
																		// A
																		// -
																		// K
			0x34, 0x35, 0x36, 0x37, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
																	// A
																	// -
																	// K
	};
	public static final int CARD_DATA_ABZ_K_BAO[] = new int[] { 0x04, 0x05, 0x06, 0x07, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			// A
			// -
			// K
			0x14, 0x15, 0x16, 0x17, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			// A
			// -
			// K
			0x24, 0x25, 0x26, 0x27, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			// A
			// -
			// K
			0x34, 0x35, 0x36, 0x37, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			// A
			// -
			// K
	};
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_XFGD[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x21, 0x22, 0x23, 0x24, 0x25,
			0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A,
			0x3B, 0x3C, 0x3D, 0x4E, 0x4F, 0x4E, 0x4F, };
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_LLDQ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																							// //
																							// A
																							// -
																							// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // A
			// -
			// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // A
			// -
			// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // A
			0x4E, 0x4F, 0x4E, 0x4F, // -
			// K
	};
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_XP_240[] = new int[] { 0x01, 0x02, 0x05, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x01, 0x02, 0x05, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																		// //
																		// A
																		// -
																		// K
			0x11, 0x12, 0x15, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x11, 0x12, 0x15, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // A
			// -
			// K
			0x21, 0x22, 0x25, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x21, 0x22, 0x25, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // A
			// -
			// K
			0x31, 0x32, 0x35, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x31, 0x32, 0x35, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // A
			0x4E, 0x4F, 0x4E, 0x4F, // -
			// K
	};

	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_YZ_240_3[] = new int[] { 0x01, 0x02, 0x05, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C,
			0x0D, 0x01, 0x02, 0x05, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D,

			0x11, 0x12, 0x15, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x11, 0x12, 0x15, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // A

			0x21, 0x22, 0x25, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x21, 0x22, 0x25, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // A

			0x31, 0x32, 0x35, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x31, 0x32, 0x35, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // A

			0x4E, 0x4F, 0x4E, 0x4F };
	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_YZ_240_4[] = new int[] { 0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B,
			0x0C, 0x0D, 0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D,

			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // A

			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // A

			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // A

			0x4E, 0x4F, 0x4E, 0x4F };

	// 扑克牌值
	public static final int CARD_DATA_SXSD[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x02, 0x12, 0x22, 0x32, 0x03, 0x13,
			0x23, 0x33, 0x04, 0x14, 0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37,
			0x08, 0x18, 0x28, 0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C,
			0x2C, 0x3C, 0x0D, 0x1D, 0x2D, 0x3D, };
	// 扑克牌值
	public static final int CARD_DATA_SXSD_NOT_3[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x02, 0x12, 0x22, 0x32, 0x13,
			0x23, 0x33, 0x04, 0x14, 0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37,
			0x08, 0x18, 0x28, 0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C,
			0x2C, 0x3C, 0x0D, 0x1D, 0x2D, 0x3D, };
	// 扑克牌值
	public static final int CARD_DATA_SXSD_MAI_4[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x02, 0x12, 0x22, 0x32, 0x03,
			0x13, 0x23, 0x33, 0x04, 0x14, 0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27,
			0x37, 0x08, 0x18, 0x28, 0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C,
			0x1C, 0x2C, 0x3C, 0x0D, 0x1D, 0x2D, 0x3D, };

	// 扑克牌值 一副牌16张
	public static final int CARD_DATA_WZDD[] = new int[] { 0x01, 0x11, 0x21, 0x31, 0x02, 0x12, 0x22, 0x32, 0x03, 0x13,
			0x23, 0x33, 0x04, 0x14, 0x24, 0x34, 0x05, 0x15, 0x25, 0x35, 0x06, 0x16, 0x26, 0x36, 0x07, 0x17, 0x27, 0x37,
			0x08, 0x18, 0x28, 0x38, 0x09, 0x19, 0x29, 0x39, 0x0A, 0x1A, 0x2A, 0x3A, 0x0B, 0x1B, 0x2B, 0x3B, 0x0C, 0x1C,
			0x2C, 0x3C, 0x0D, 0x1D, 0x2D, 0x3D, 0x4E, 0x4F, };

	// 游戏状态
	public static final int GS_OX_FREE = GAME_STATUS_FREE; // 空闲状态
	public static final int GS_OX_GAME_PLAY = GAME_STATUS_PLAY;// 游戏状态
	public static final int GS_OX_CALL_BANKER = GAME_STATUS_PLAY + 1; // 叫庄状态
	public static final int GS_OX_ADD_JETTON = GAME_STATUS_PLAY + 2; // 下注状态
	public static final int GS_OX_OPEN_CARD = GAME_STATUS_PLAY + 3; // 摊牌状态
	public static final int GS_OX_GAME_END = GAME_STATUS_PLAY + 4; // 游戏结束
	public static final int GS_OX_QIE_CARD = GAME_STATUS_PLAY + 5; // 切牌_
	public static final int GS_OX_CARRY_SCORE = GAME_STATUS_PLAY + 6;// 庄家分数
	public static final int GS_OX_YAO_CARD = GAME_STATUS_PLAY + 7;// 用户要牌

	public static final int GS_OX_WAIT = GAME_STATUS_WAIT; // 等待状态

	public static final int GS_JDB_FREE = GAME_STATUS_FREE; // 空闲状态
	public static final int GS_JDB_GAME_PLAY = GAME_STATUS_PLAY; // 游戏状态
	public static final int GS_JDB_QIE_CARD = GAME_STATUS_PLAY + 1; // 切牌
	public static final int GS_JDB_CALL_BANKER = GAME_STATUS_PLAY + 2;// 叫庄
	public static final int GS_JDB_ADD_JETTON_ONE = GAME_STATUS_PLAY + 3; // 下注1
	public static final int GS_JDB_ADD_JETTON_TWO = GAME_STATUS_PLAY + 4; // 下注2
	public static final int GS_JDB_ADD_JETTON_THREE = GAME_STATUS_PLAY + 5; // 下注3
	public static final int GS_JDB_OPEN_CARD = GAME_STATUS_PLAY + 6; // 摊牌
	public static final int GS_JDB_GAME_END = GAME_STATUS_PLAY + 7; // 游戏结束
	public static final int GS_JDB_WAIT = GAME_STATUS_WAIT; // 等待状态

	public static final int GAME_PLAYER_OX = 6;
	public static final int GAME_PLYER_EIGHT_OX = 8;
	public static final int CARD_COUNT_OX = 52; // 52张牌
	public static final int CARD_COUNT_KING_OX = 54; // 52张牌
	public static final int CARD_COUNT_NO_HUA_PAI_OX = 36; // 52张牌
	public static final int OX_VALUE0 = 0; // 混合牌型
	public static final int OX_SHUN_ZI = 11; // 顺子
	public static final int OX_TONG_HUA = 12; // 同花
	public static final int OX_HU_LU = 13; // 葫芦
	public static final int OX_FIVE_KING = 14; // 五花牛
	public static final int OX_BOOM = 15; // 四炸
	public static final int OX_WUXIAONIU = 16; // 五小牛
	public static final int OX_TONG_HUA_XHUN = 17;// 同花顺

	public static final int OX_FIVE_KING_VALUE = 11; // 五花牛
	public static final int OX_SHUN_ZI_VALUE = 12; // 顺子牛
	public static final int OX_TONG_HUA_VALUE = 13; // 同花牛
	public static final int OX_HU_LU_VALUE = 14; // 葫芦牛
	public static final int OX_BOOM_VALUE = 15; // 四炸
	public static final int OX_WUXIAONIU_VALUE = 16; // 五小牛/10小
	public static final int OX_TONG_HUA_XHUN_VALUE = 17; // 同花顺
	public static final int OX_SI_SHI_DA_VALUE = 18; // 40大

	public static final int OX_YING_NIU = 14; // 银牛
	public static final int OX_KING_NIU = 15; // 金花牛
	public static final int OX_BOOM_NIU = 16; // 四炸
	public static final int OX_WUXIAONIU_NIU = 17; // 五小牛

	// 益阳无花牛
	public static final int YY_OX_VALUE_SHUN_ZI = 11; // 顺子
	public static final int YY_OX_VALUE_TONG_HUA = 12; // 同花
	public static final int YY_OX_VALUE_HU_LU = 13; // 葫芦
	public static final int YY_OX_VALUE_SHI_XIAO = 14; // 10小
	public static final int YY_OX_VALUE_SI_SHI_DA = 15; // 40大
	public static final int YY_OX_VALUE_ZHA_DAN = 16; // 炸弹
	public static final int YY_OX_VALUE_TONG_HUA_SHUN = 17; // 同花顺

	public static final int OX_MAX_CARD_COUNT = 5; // 最大牌装数
	public static final int MIN_PLAYER_OX_COUNT = 2; // 最少二个人开始
	public static final int FKN_SHUNZI = 11; // 顺子
	public static final int FKN_TONGHUA = 12; // 同花
	public static final int FKN_HULU = 13; // 葫芦
	public static final int FKN_WUXIAONIU = 14; // 五小牛
	public static final int FKN_WUHUANIU = 15; // 五花牛
	public static final int FKN_BOOM = 16; // 炸弹牛
	public static final int FKN_TONGHUASHUN = 17; // 同花顺
	public static final int CZWXOX_VALUE0 = 0; // 混合牌型 无牛
	public static final int CZWXOX_JIA_ONE = 1;// 假牛1
	public static final int CZWXOX_ZHEN_ONE = 2; // 真牛1
	public static final int CZWXOX_JIA_TWO = 3;// 假牛2
	public static final int CZWXOX_ZHEN_TWO = 4; // 真牛2
	public static final int CZWXOX_JIA_THREE = 5;// 假牛3
	public static final int CZWXOX_ZHEN_THREE = 6; // 真牛3
	public static final int CZWXOX_JIA_FOUR = 7;// 假牛4
	public static final int CZWXOX_ZHEN_FOUR = 8; // 真牛4
	public static final int CZWXOX_JIA_FIVE = 9;// 假牛5
	public static final int CZWXOX_ZHEN_FIVE = 10; // 真牛5
	public static final int CZWXOX_JIA_SIX = 11;// 假牛6
	public static final int CZWXOX_ZHEN_SIX = 12; // 真牛6
	public static final int CZWXOX_JIA_SEVEN = 13;// 假牛7
	public static final int CZWXOX_ZHEN_SEVEN = 14; // 真牛7
	public static final int CZWXOX_JIA_EIGHT = 15;// 假牛8
	public static final int CZWXOX_ZHEN_EIGHT = 16; // 真牛8
	public static final int CZWXOX_JIA_NINE = 17;// 假牛9
	public static final int CZWXOX_ZHEN_NINE = 18; // 真牛9
	public static final int CZWXOX_JIA_TEN = 19;// 假牛10
	public static final int CZWXOX_ZHEN_TEN = 20; // 真牛10
	public static final int CZWXOX_SHUN_ZI = 21; // 顺子
	public static final int CZWXOX_WU_HUA_NIU = 22; // 五花牛
	public static final int CZWXOX_TONG_HUA = 23; // 同花
	public static final int CZWXOX_HU_LU = 24; // 葫芦牛
	public static final int CZWXOX_BOOM = 25; // 炸弹
	public static final int CZWXOX_WXL = 26; // 五小龙
	public static final int CZWXOX_WDL = 27; // 五大龙
	public static final int CZWXOX_TONG_HUA_SHUN = 28; // 同花顺
	public static final int CZWXOX_TIE_BAN_NIU = 29; // 铁板牛
	public static final int KLOX_MAX_JETTON_COUNT = 4; // 最大下注按钮个数
	public static final int KLOX_VALUE0 = 0; // 混合牌型 无牛
	public static final int KLOX_XIAO_ONE = 1;// 小牛1
	public static final int KLOX_DA_ONE = 2; // 大牛1
	public static final int KLOX_ONE = 3; // 牛1
	public static final int KLOX_XIAO_TWO = 4;// 小牛2
	public static final int KLOX_DA_TWO = 5; // 大牛2
	public static final int KLOX_TWO = 6; // 牛2
	public static final int KLOX_XIAO_THREE = 7;// 小牛3
	public static final int KLOX_DA_THREE = 8; // 大牛3
	public static final int KLOX_THREE = 9; // 牛3
	public static final int KLOX_XIAO_FOUR = 10;// 小牛4
	public static final int KLOX_DA_FOUR = 11; // 大牛4
	public static final int KLOX_FOUR = 12; // 牛4
	public static final int KLOX_XIAO_FIVE = 13;// 小牛5
	public static final int KLOX_DA_FIVE = 14; // 大牛5
	public static final int KLOX_FIVE = 15; // 牛5
	public static final int KLOX_XIAO_SIX = 16;// 小牛6
	public static final int KLOX_DA_SIX = 17; // 大牛6
	public static final int KLOX_SIX = 18; // 牛6
	public static final int KLOX_XIAO_SEVEN = 19;// 小牛7
	public static final int KLOX_DA_SEVEN = 20; // 大牛7
	public static final int KLOX_SEVEN = 21; // 牛7
	public static final int KLOX_XIAO_EIGHT = 22;// 小牛8
	public static final int KLOX_DA_EIGHT = 23; // 大牛8
	public static final int KLOX_EIGHT = 24; // 牛8
	public static final int KLOX_XIAO_NINE = 25;// 小牛9
	public static final int KLOX_DA_NINE = 26; // 大牛9
	public static final int KLOX_NINE = 27; // 牛9
	public static final int KLOX_XIAO_TEN = 28;// 小牛10
	public static final int KLOX_DA_TEN = 29; // 大牛10
	public static final int KLOX_TEN = 30;// 牛10
	public static final int KLOX_XIAO_SHUN_ZI = 31;// 小顺子牛
	public static final int KLOX_DA_SHUN_ZI = 32; // 大顺子 牛
	public static final int KLOX_SHUN_ZI = 33; // 顺子
	public static final int KLOX_XIAO_TONG_HUA = 34;// 小同花牌
	public static final int KLOX_DA_TONG_HUA = 35; // 大同花牛
	public static final int KLOX_TONG_HUA = 36; // 同花
	public static final int KLOX_XIAO_HU_LU = 37;// 小葫芦牛
	public static final int KLOX_DA_HU_LU = 38; // 大葫芦牛
	public static final int KLOX_HU_LU = 39; // 葫芦牛
	public static final int KLOX_XIAO_WXOX = 40;// 小五小牛
	public static final int KLOX_DA_WXOX = 41; // 大五小牛
	public static final int KLOX_WXOX = 42; // 五小牛
	public static final int KLOX_XIAO_WU_HUA_NIU = 43;// 小五花牛
	public static final int KLOX_DA_WU_HUA_NIU = 44; // 大五花牛
	public static final int KLOX_WU_HUA_NIU = 45; // 五花牛
	public static final int KLOX_XIAO_BOOM = 46;// 小炸弹牛
	public static final int KLOX_DA_BOOM = 47; // 大炸弹牛
	public static final int KLOX_BOOM = 48; // 炸弹
	public static final int KLOX_XIAO_THSH = 49;// 小同花顺
	public static final int KLOX_DA_THSH = 50; // 大同花顺
	public static final int KLOX_THSH = 51; // 同花顺

	public static final int KLOX_JX_VALUE0 = 0; // 混合牌型 无牛
	public static final int KLOX_JX_XIAO_ONE = 1;// 小牛1
	public static final int KLOX_JX_DA_ONE = 2; // 大牛1
	public static final int KLOX_JX_ONE = 3; // 牛1
	public static final int KLOX_JX_XIAO_TWO = 4;// 小牛2
	public static final int KLOX_JX_DA_TWO = 5; // 大牛2
	public static final int KLOX_JX_TWO = 6; // 牛2
	public static final int KLOX_JX_XIAO_THREE = 7;// 小牛3
	public static final int KLOX_JX_DA_THREE = 8; // 大牛3
	public static final int KLOX_JX_THREE = 9; // 牛3
	public static final int KLOX_JX_XIAO_FOUR = 10;// 小牛4
	public static final int KLOX_JX_DA_FOUR = 11; // 大牛4
	public static final int KLOX_JX_FOUR = 12; // 牛4
	public static final int KLOX_JX_XIAO_FIVE = 13;// 小牛5
	public static final int KLOX_JX_DA_FIVE = 14; // 大牛5
	public static final int KLOX_JX_FIVE = 15; // 牛5
	public static final int KLOX_JX_XIAO_SIX = 16;// 小牛6
	public static final int KLOX_JX_DA_SIX = 17; // 大牛6
	public static final int KLOX_JX_SIX = 18; // 牛6
	public static final int KLOX_JX_XIAO_SEVEN = 19;// 小牛7
	public static final int KLOX_JX_DA_SEVEN = 20; // 大牛7
	public static final int KLOX_JX_SEVEN = 21; // 牛7
	public static final int KLOX_JX_XIAO_EIGHT = 22;// 小牛8
	public static final int KLOX_JX_DA_EIGHT = 23; // 大牛8
	public static final int KLOX_JX_EIGHT = 24; // 牛8
	public static final int KLOX_JX_XIAO_NINE = 25;// 小牛9
	public static final int KLOX_JX_DA_NINE = 26; // 大牛9
	public static final int KLOX_JX_NINE = 27; // 牛9
	public static final int KLOX_JX_XIAO_TEN = 28;// 小牛10
	public static final int KLOX_JX_DA_TEN = 29; // 大牛10
	public static final int KLOX_JX_TEN = 30;// 牛10
	public static final int KLOX_JX_XIAO_SHUN_ZI = 31;// 小顺子牛
	public static final int KLOX_JX_DA_SHUN_ZI = 32; // 大顺子 牛
	public static final int KLOX_JX_SHUN_ZI = 33; // 顺子
	public static final int KLOX_JX_XIAO_WU_HUA_NIU = 34;// 小五花牛
	public static final int KLOX_JX_DA_WU_HUA_NIU = 35; // 大五花牛
	public static final int KLOX_JX_WU_HUA_NIU = 36; // 五花牛
	public static final int KLOX_JX_XIAO_TONG_HUA = 37;// 小同花牌
	public static final int KLOX_JX_DA_TONG_HUA = 38; // 大同花牛
	public static final int KLOX_JX_TONG_HUA = 39; // 同花
	public static final int KLOX_JX_XIAO_HU_LU = 40;// 小葫芦牛
	public static final int KLOX_JX_DA_HU_LU = 41; // 大葫芦牛
	public static final int KLOX_JX_HU_LU = 42; // 葫芦牛
	public static final int KLOX_JX_XIAO_WXOX = 43;// 小五小牛
	public static final int KLOX_JX_DA_WXOX = 44;// 大五小牛
	public static final int KLOX_JX_WXOX = 45; // 五小牛
	public static final int KLOX_JX_XIAO_BOOM = 46;// 小炸弹牛
	public static final int KLOX_JX_DA_BOOM = 47; // 大炸弹牛
	public static final int KLOX_JX_BOOM = 48; // 炸弹
	public static final int KLOX_JX_XIAO_THSH = 49;// 小同花顺
	public static final int KLOX_JX_DA_THSH = 50; // 大同花顺
	public static final int KLOX_JX_THSH = 51; // 同花顺

	public static final int YYOX_MAX_JETTON_COUNT = 10; // 最大下注按钮个数
	public static final int YYOX = 0; // 混合牌型
	public static final int YYOX_YING_HUA_OX = 11; // 银牛
	public static final int YYOX_JING_HUA_OX = 12; // 金牛
	public static final int YYOX_BOOM = 14; // 四炸
	public static final int YYOX_WUXIAONIU = 13; // 五小牛

	public static final int OX_HHUA_SHUN_ZI_VALUE = 11; // 顺子牛
	public static final int OX_HHUA_YIN_VALUE = 12; // 银牛
	public static final int OX_HHUA_TONG_HUA_VALUE = 13; // 同花牛
	public static final int OX_HHUA_JIN_VALUE = 14; // 金牛
	public static final int OX_HHUA_HU_LU_VALUE = 15; // 葫芦牛
	public static final int OX_HHUA_BOOM_VALUE = 16; // 四炸
	public static final int OX_HHUA_WUXIAONIU_VALUE = 17; // 五小牛/10小
	public static final int OX_HHUA_TONG_HUA_XHUN_VALUE = 18; // 同花顺

	public static final int DBN_FIVE_KING = 11; // 五花牛
	public static final int DBN_BOOM = 12; // 四炸
	public static final int DBN_WUXIAONIU = 13; // 五小牛

	public static final int GAME_PLAYER_HJK = 5;
	public static final int CARD_COUNT_HJK = 52; // 52张牌
	public static final int MAX_COUNT_HJK = 5; // 最大牌装数
	public static final int MIN_PLAYER_HJK_COUNT = 3; // 最少三个人开始
	public static final int FRIST_DISPATCH_COUNT = 2; // 发两张首牌
	// 游戏状态
	public static final int GS_HJK_FREE = GAME_STATUS_FREE; // 空闲状态
	public static final int GS_HJK_CALL_BANKER = GAME_STATUS_PLAY + 1; // 叫庄状态
	public static final int GS_HJK_ADD_JETTON = GAME_STATUS_PLAY + 2; // 下注状态
	public static final int GS_HJK_YAO_CARD = GAME_STATUS_PLAY + 3; // 摊牌状态
	public static final int GS_HJK_GAME_END = GAME_STATUS_PLAY + 4; // 游戏结束

	public static final int HJK_NULL = 0x00; // 没有类型
	public static final int HJK_YAO = 0x01; // 要牌类型
	public static final int HJK_PASS = 0x02; // 过类型
	public static final int HJK_OPEN_CARD = 0x04; // 开牌
	public static final int HJK_ALL_OPEN = 0x08; // 全开
	public static final int HJK_QUEST_BNAKER = 0x10; // 询问按钮
	public static final int HJK_NO_QUEST_BNAKER = 0x20; // 庄家不询问
	public static final int HJK_TOU_XIANG = 0x40; // 闲家投降
	public static final int HJK_NO_TOU_XIANG = 0x80; // 闲家不投降
	public static final int HJK_OPEN_CARD_ZERO = 0x100; // 0用户开牌
	public static final int HJK_OPEN_CARD_ONE = 0x200; // 1用户开牌
	public static final int HJK_OPEN_CARD_TWO = 0x400; // 2用户开牌
	public static final int HJK_OPEN_CARD_THREE = 0x800; // 3用户开牌
	public static final int HJK_OPEN_CARD_FOUR = 0x1000; // 4用户开牌

	public static final int HJK_CARD_TYPE_NULL = 0; // 没有牌类型
													// 1-21点用数字表示
	public static final int HJK_CARD_TYPE_AA = 22; // aa牌型
	public static final int HJK_CARD_TYPE_HJK = 23; // 黑杰克
	public static final int HJK_CARD_TYPE_SEVEN = 24; // 777牌型
	public static final int HJK_CARD_TYPE_WUXIAOLONG = 25; // 五小龙
	public static final int HJK_CARD_TYPE_BRUST = 26; // 爆牌

	public static final int HJK_READY_TIMER = 100; // 准备时间器
	public static final int HJK_ROBOT_BANKER_TIMER = 101; // 抢庄定时
	public static final int HJK_ADD_JETTON_TIMER = 102; // 下注定时
	public static final int HJK_OPEN_CARD_TIMER = 103; // 开牌定时
	public static final int HJK_LIANG_CARD_TIMER = 104; // 亮牌
	public static final int HJK_BANKER_OPERATE = 105; // 庄家操作
	public static final int HJK_BNAKER_SELECT_SCORE = 106; // 庄家选择分数
	public static final int HJK_YAO_CARD_TIMER = 107; // 要牌操作
	public static final int PH_OUT_CARD = 100; // 碰胡出牌定时器
	public static final int PH_OPERATE_CARD = 101; // 碰胡操作
	public static final int PH_WARING = 102; // 报警操作
	public static final int PH_READY = 103; // 开始定时器

	public static final int HJK_READY_TIME_SECONDS = 10; // 准备时间
	public static final int HJK_ROBOT_BANKER_TIME_SECONDS = 10; // 抢庄定时
	public static final int HJK_ADD_JETTON_TIME_SECONDS = 10; // 下注定时
	public static final int HJK_OPEN_CARD_TIME_SECONDS = 10; // 开牌定时
	public static final int HJK_LIANG_CARD_TIMER_SECONDS = 2; // 亮牌

	public static final int OX_TRUESTEE_OPERATE_TIME = 2;// 牛牛托管

	//////////////////////////////// 洛阳杠次常量//////////////////////////////////////////////////////////
	public static final int LYGC_BAO_CI_END = 0; // 包次结束
	public static final int LYGC_BAO_CI_SATRT = 1; // 包次开始
	public static final int LYGC_BAO_CI_SATRT_NUM = 10; // 包次开始

	public static final int PDK_CT_ERROR = -1; // 错误类型
	public static final int PDK_CT_PASS = 0; // 过
	public static final int PDK_CT_SINGLE = 1; // 单张
	public static final int PDK_CT_DOUBLE = 2; // 对子
	public static final int PDK_CT_THREE = 3; // 三张
	public static final int PDK_CT_THREE_TAKE_ONE = 4; // 三带一
	public static final int PDK_CT_THREE_TAKE_TWO = 5; // 三带二
	public static final int PDK_CT_SINGLE_LINE = 6; // 单张顺子
	public static final int PDK_CT_DOUBLE_LINE = 7; // 对子顺子
	public static final int PDK_CT_PLANE = 8; // 飞机
	public static final int PDK_CT_PLANE_LOST = 9; // 飞机缺翅膀
	public static final int PDK_CT_FOUR_LINE_TAKE_ONE = 10; // 四带一
	public static final int PDK_CT_FOUR_LINE_TAKE_TWO = 11; // 四带二
	public static final int PDK_CT_FOUR_LINE_TAKE_THREE = 12; // 四带三
	public static final int PDK_CT_HONG_HUA_SHUN = 13; // 同花顺
	public static final int PDK_CT_RUAN_BOMB = 14;// 带赖子炸弹
	public static final int PDK_CT_BOMB_CARD = 15; // 炸弹
	public static final int PDK_CT_MAGIC_BOOM = 16; // 四癞子的炸弹
	public static final int PDK_CT_MISSILE_CARD = 17; // 王炸
	public static final int PDK_CT_THREE_LINE = 18; // 三张顺子
	public static final int PDK_CT_THREE_TAKE_DOUBLE = 19; // 三带一对
	public static final int PDK_CT_PLANE_TAKE_DOUBLE = 20; // 飞机

	public static final int PDK_ST_ORDER = 14;
	public static final int PDK_ST_COUNT = 15;
	public static final int PDK_MAX_COUNT = 27; // 手牌数量
	public static final int MAX_PDK_COUNT_JD = 16; // 最大数目手牌
	public static final int MAX_PDK_COUNT_SW = 15; // 最大数目手牌
	public static final int MAX_PDK_COUNT_SS = 13; // 最大数目手牌
	public static final int MAX_PDK_COUNT_EQ = 27; // 最大数目手牌
	public static final int MAX_PDK_COUNT_SR_SC = 10; // 最大数目手牌
	public static final int MAX_TYPE_COUNT = 254;
	public static final int PDK_MAX_INDEX = 13; // 干瞪眼索引
	//////////////////////////////////////// 斗地主////////////////////////////////////////////////////
	public static final int DDZ_MAX_COUNT_JD = 20; // 手牌数量
	public static final int DDZ_DI_PAI_COUNT_JD = 3; // 底牌数量

	public static final int DDZ_CT_ERROR = -1; // 错误类型
	public static final int DDZ_CT_PASS = 0; // 过
	public static final int DDZ_CT_SINGLE = 1; // 单张
	public static final int DDZ_CT_DOUBLE = 2; // 对子
	public static final int DDZ_CT_THREE = 3; // 三张
	public static final int DDZ_CT_SINGLE_LINE = 4; // 单张顺子
	public static final int DDZ_CT_DOUBLE_LINE = 5; // 对子顺子
	public static final int DDZ_CT_THREE_LINE = 6; // 三张顺子
	public static final int DDZ_CT_THREE_LINE_TAKE_ONE = 7; // 飞机
	public static final int DDZ_CT_THREE_LINE_TAKE_TWO = 8; // 飞机带翅膀
	public static final int DDZ_CT_THREE_TAKE_ONE = 9; // 三带一
	public static final int DDZ_CT_THREE_TAKE_TWO = 10; // 三带二
	public static final int DDZ_CT_FOUR_TAKE_ONE = 11; // 四带两单
	public static final int DDZ_CT_FOUR_TAKE_TWO = 12; // 四带二 对
	public static final int DDZ_CT_RUAN_BOMB = 13;// 带赖子炸弹
	public static final int DDZ_CT_BOMB_CARD = 14; // 炸弹
	public static final int DDZ_CT_MAGIC_BOOM = 15; // 四癞子的炸弹
	public static final int DDZ_CT_MISSILE_CARD = 16; // 火箭

	public static final int DDZ_CT_ERROR_JX = -1; // 错误类型
	public static final int DDZ_CT_PASS_JX = 0; // 过
	public static final int DDZ_CT_SINGLE_JX = 1; // 单张
	public static final int DDZ_CT_DOUBLE_JX = 2; // 对子
	public static final int DDZ_CT_THREE_JX = 3; // 三张
	public static final int DDZ_CT_THREE_TAKE_ONE_JX = 4; // 三带一
	public static final int DDZ_CT_THREE_TAKE_TWO_JX = 5; // 三带二
	public static final int DDZ_CT_SINGLE_LINE_JX = 6; // 单张顺子
	public static final int DDZ_CT_DOUBLE_LINE_JX = 7; // 对子顺子
	public static final int DDZ_CT_THREE_LINE_TAKE_TWO_JX = 8; // 飞机
	public static final int DDZ_CT_THREE_LINE_JX_ONE = 9; // 飞机缺翅膀(带单个)
	public static final int DDZ_CT_FOUR_TAKE_ONE_JX = 10; // 四带两单
	public static final int DDZ_CT_FOUR_TAKE_TWO_JX = 11; // 四带二 对
	public static final int DDZ_CT_RUAN_BOMB_JX = 14;// 带赖子炸弹
	public static final int DDZ_CT_BOMB_CARD_JX = 15; // 炸弹
	public static final int DDZ_CT_MISSILE_CARD_JX = 17; // 火箭
	public static final int DDZ_CT_THREE_LINE_JX_TWO = 18; // 飞机带一对

	public static final int DDZ_CT_DI_PAI_ERROR = 1;// 底牌牌型
	public static final int DDZ_CT_DI_PAI_TONGHUA_SUNN_ZI = 2;// 底牌同花顺
	public static final int DDZ_CT_DI_PAI_TONGHUA = 3;// 通花
	public static final int DDZ_CT_DI_PAI_BAOZI = 4;// 豹子
	public static final int DDZ_CT_DI_PAI_DUI_WANG = 5;// 对王
	public static final int DDZ_CT_DI_PAI_DAN_WANG = 6;// 单王
	public static final int DDZ_CT_DI_PAI_SUNN_ZI = 7;// 顺子
	public static final int DDZ_MAX_INDEX = 16; // 斗地主索引
	//////////////////////////////////////// 扳坨子////////////////////////////////////////////////////
	public static final int GAME_PLAYER_BTZ = 8; // 2-4人

	//////////////////////////////////////// 炸金花////////////////////////////////////////////////
	public static final int ZJH_CT_INVALID = 0; // 单牌类型
	public static final int ZJH_CT_SINGLE = 1; // 单牌类型
	public static final int ZJH_CT_DOUBLE = 2; // 对子类型
	public static final int ZJH_CT_SHUN_ZI = 3; // 顺子类型
	public static final int ZJH_CT_JIN_HUA = 4; // 金花类型
	public static final int ZJH_CT_SHUN_JIN = 5; // 顺金类型
	public static final int ZJH_CT_BAO_ZI = 6; // 豹子类型
	public static final int ZJH_CT_SPECIAL = 7; // 特殊类型

	public static final int ZJH_MAX_COUNT = 3; // 手牌数量
	public static final int ZJH_MAX_INDEX = 13; // 干瞪眼索引

	public static final int SSZ_MAX_COUNT = 13; // 手牌数量
	public static final int BAGUAI_MAX_COUNT = 8; // 手牌数量
	public static final int CARD_COUNT_ZJH = 52; // 炸金花
	public static final int CARD_COUNT_SSZ = 52; // 十三张
	public static final int CARD_COUNT_XYKL = 52; // 闲逸咔陇
	public static final int CARD_COUNT_BAGUAI = 54; // 八怪
	public static final int CARD_COUNT_PJ = 32; // 牌九
	// 三打哈
	public static final int SDH_CT_ERROR = 0; // 错误类型
	public static final int SDH_CT_SINGLE = 1; // 单牌类型
	public static final int SDH_CT_SAME_2 = 2; // 对牌类型
	public static final int SDH_CT_SAME_3 = 3; // 三牌类型
	public static final int SDH_CT_SAME_4 = 4; // 四牌类型
	public static final int SDH_CT_TRACKOR_2 = 5; // 拖拉机型
	public static final int SDH_CT_TRACKOR_3 = 6; // 拖拉机型
	public static final int SDH_CT_TRACKOR_4 = 7; // 拖拉机型
	public static final int SDH_CT_THROW_CARD = 8; // 甩牌类型

	public static final int SDH_GAME_PLAYER = 4;
	public static final int SDH_PACK_COUNT = 2;
	public static final int SDH_CELL_PACK = 54;
	public static final int SDH_MAX_COUNT = SDH_PACK_COUNT * SDH_CELL_PACK / SDH_GAME_PLAYER + 8; // 手牌数量
	public static final int SDH_COLOR_NT = 0x40; // 花色定义
	public static final int SDH_COLOR_HEI_TAO = 0x30;// 花色定义
	public static final int SDH_COLOR_HONG_TAO = 0x20;// 花色定义
	public static final int SDH_COLOR_MEI_HUA = 0x10;// 花色定义
	public static final int SDH_COLOR_FANG_KUAI = 0x00;// 花色定义
	public static final int SDH_MAX_TRACKOR = 18; // 最大连牌
	public static final int SDH_COLOR_RIGHT = 40; // 花色权位
	public static final String SYS_GAME_TYPE_PH_YX = null;

	// 跑胡子
	public static final int PHZ_YYWHZ_CARD_COUNT = 20;// 岳阳歪胡子

	///////////////////////////////////////////////////// 十三张
	public static final int SSZ_CT_INVALID = 0; // 错误类型
	public static final int SSZ_CT_SINGLE = 1; // 单牌类型
	public static final int SSZ_CT_ONE_DOUBLE = 2; // 只有一对
	public static final int SSZ_CT_FIVE_TWO_DOUBLE = 3; // 两对牌型
	public static final int SSZ_CT_THREE = 4; // 三张牌型
	public static final int SSZ_CT_FIVE_MIXED_FLUSH_FIRST_A = 5; // A在前顺子
	public static final int SSZ_CT_FIVE_MIXED_FLUSH_NO_A = 6; // 没A杂顺
	public static final int SSZ_CT_FIVE_MIXED_FLUSH_BACK_A = 7; // A在后顺子·
	public static final int SSZ_CT_FIVE_FLUSH = 8; // 同花五牌
	public static final int SSZ_CT_FIVE_THREE_DEOUBLE = 9; // 三条一对
	public static final int SSZ_CT_FIVE_FOUR_ONE = 10; // 四带一张
	public static final int SSZ_CT_FIVE_STRAIGHT_FLUSH_FIRST_A = 11; // A在前同花顺
	public static final int SSZ_CT_FIVE_STRAIGHT_FLUSH = 12; // 同花顺牌
	public static final int SSZ_CT_DU_DUI = 13;// 独对
	public static final int SSZ_CT_DU_SAN = 14;// 独三
	public static final int SSZ_CT_BAN_XIAO = 15;// 半小
	public static final int SSZ_CT_SAN_TONG_HUA = 16;// 三同花
	public static final int SSZ_CT_SAN_SHUN_ZI = 17;// 三顺子
	public static final int SSZ_CT_DU_SI = 18;// 独四
	public static final int SSZ_CT_SI_DUI_YI_TONG = 19;// 四对一同
	public static final int SSZ_CT_SI_DUI_YI_SHUN = 20;// 四对一顺
	public static final int SSZ_CT_LIU_DUI_BAN = 21;// 六对半
	public static final int SSZ_CT_WU_DUI_SAN_TIAO = 22;// 五对三条
	public static final int SSZ_CT_SI_TAO_SAN_TIAO = 23;// 四套三条
	public static final int SSZ_CT_COU_YI_SE = 24;// 凑一色
	public static final int SSZ_CT_QUAN_XIAO = 25;// 全小
	public static final int SSZ_CT_QUAN_DA = 26;// 全大
	public static final int SSZ_CT_SAN_FEN_TIAN_XIA = 27;// 三分天下
	public static final int SSZ_CT_SAN_TONG_HUA_SHUN = 28;// 三同花顺
	public static final int SSZ_CT_SHI_ER_HUANG_ZU = 29;// 十二皇族
	public static final int SSZ_CT_YI_TIAO_LONG = 30; // 一条龙
	public static final int SSZ_CT_ZHI_ZHUN_QING_LONG = 31;// 至尊青龙
	public static final int SSZ_CT_LIU_QI = 32;// 六起
	public static final int SSZ_CT_QI_QI = 33;// 七起
	public static final int SSZ_CT_BA_QI = 34;// 八起
	public static final int SSZ_CT_BA_HUA = 35;// 八花
	public static final int SSZ_CT_JIU_QI = 36;// 九起
	public static final int SSZ_CT_JIU_HUA = 37;// 九起
	public static final int SSZ_CT_SHI_QI = 38;// 十起
	public static final int SSZ_CT_SHI_HUA = 39;// 十花
	public static final int SSZ_CT_SHI_YI_QI = 40;// 十一起
	public static final int SSZ_CT_SHI_YI_HUA = 41;// 十一花
	public static final int SSZ_CT_QUAN_HONG_YI_DIAN_HEI = 42;// 全红一点黑
	public static final int SSZ_CT_QUAN_HEI_YI_DIAN_HONG = 43;// 全黑一点红
	public static final int SSZ_CT_SHI_ER_HUA = 44;// 十二花
	public static final int SSZ_CT_QUAN_HEI = 45;// 全黑
	public static final int SSZ_CT_QUNA_HONG = 46;// 全红
	public static final int SSZ_CT_BA_GUAI = 47;// 八怪
	public static final int SSZ_CT_SI_DUI = 48;// 四对
	public static final int SSZ_CT_ZHA_DAN = 49;// 炸弹
	public static final int SSZ_CT_CHONG_SAN = 50;// 冲三
	public static final int SSZ_CT_ZHOGNDUN_HULU = 51;// 中墩葫芦
	///////////////////////////////////////// 抓虾子
	public static final int ZXZ_ZHUANG_XIAN = 1; // 庄闲算分
	public static final int ZXZ_MAN_TIAN_FEI = 2; // 满天飞
	public static final int ZXZ_THREE_PLAYER = 25; // 三人

	////////////////////////////////////////////////////// 三公
	public static final int SG_MAX_PLAYER_COUNT = 6; // 人数最多
	public static final int SG_MIN_PLAYER_COUNT = 2; // 人数最少
	public static final int SG_CARD_COUNT_JD = 52; // 牌张数
	public static final int SG_CARD_COUNT_SW = 54; // 牌张数
	public static final int SG_MAX_CARD_COUNT = 3; // 最大牌装数

	public static final int SG_SAN_PAI = 20; // 散牌
	public static final int SG_DUI_ZI = 21; // 对子
	public static final int SG_SHUN_ZI = 22; // 顺子
	public static final int SG_TONG_HUA = 23; // 同花
	public static final int SG_TONG_HUA_SHUN = 24; // 同花顺
	public static final int SG_BAO_ZI = 25; // 豹子

	public static final int SW_VALUE0_SG = 0; // 混合牌型
	public static final int SW_HUN_SG = 10; // 混三公
	public static final int SW_LEI_SG = 11; // 雷公
	public static final int SW_XIAO_SG = 12; // 小三公
	public static final int SW_DA_SG = 13; // 大三公
	public static final int SW_BS_SG = 14; // 爆三
	public static final int SW_TG_SG = 15; // 天公

	// 510K
	public static final int WSK_CT_ERROR = 0; // 错误类型
	public static final int WSK_CT_SINGLE = 1; // 单牌类型
	public static final int WSK_CT_DOUBLE = 2; // 对子类型
	public static final int WSK_CT_SINGLE_LINK = 3; // 单连类型
	public static final int WSK_CT_DOUBLE_LINK = 4; // 对连类型
	public static final int WSK_CT_BOMB_3 = 5; // 3炸弹
	public static final int WSK_CT_510K_DC = 6; // 杂510K
	public static final int WSK_CT_KING_DC = 7; // 大小王
	public static final int WSK_CT_510K_SC = 8; // 纯510K
	public static final int WSK_CT_KING_ST = 9; // 纯小王
	public static final int WSK_CT_KING_SK = 10; // 纯大王
	public static final int WSK_CT_BOMB_4 = 11; // 4炸类型
	public static final int WSK_CT_BOMB_5 = 12; // 5弹类型
	public static final int WSK_CT_KING_THREE = 13; // 3王类型
	public static final int WSK_CT_BOMB_6 = 14; // 6炸类型
	public static final int WSK_CT_BOMB_7 = 15; // 7炸类型
	public static final int WSK_CT_KING_FOUR = 16; // 4王炸弹
	public static final int WSK_CT_BOMB_8 = 17; // 8炸类型
	public static final int WSK_MAX_INDEX = 15;
	// 打码子
	public static final int DMZ_CT_ERROR = -1; // 错误类型
	public static final int DMZ_CT_PASS = 0; // 过
	public static final int DMZ_CT_SINGLE = 1; // 单牌类型
	public static final int DMZ_CT_DOUBLE = 2; // 对子类型
	public static final int DMZ_CT_THREE = 3; // 3张类型
	public static final int DMZ_CT_FOUR = 4; // 4张类型
	public static final int DMZ_CT_SINGLE_LINK = 5; // 单连类型
	public static final int DMZ_CT_DOUBLE_LINK = 6; // 对连类型
	public static final int DMZ_CT_THREE_LINK = 7; // 三连类型
	public static final int DMZ_CT_FOUR_LINK = 8; // 四连类型
	public static final int DMZ_CT_510K_DC = 9; // 杂510K
	public static final int DMZ_CT_510K_SC = 10; // 纯510K
	public static final int DMZ_CT_KING_DC = 11; // 大小王
	public static final int DMZ_CT_KING_ST = 12; // 纯小王
	public static final int DMZ_CT_KING_SK = 13; // 纯大王
	public static final int DMZ_CT_BOMB_5 = 14; // 5弹类型
	public static final int DMZ_CT_KING_THREE = 15; // 3王类型
	public static final int DMZ_CT_BOMB_6 = 16; // 6炸类型
	public static final int DMZ_CT_KING_FOUR = 17; // 4王炸弹
	public static final int DMZ_CT_BOMB_7 = 18; // 7炸类型
	public static final int DMZ_CT_BOMB_8 = 19; // 8炸类型

	public static final int WSK_MAX_COUNT = 28; // 手牌数量
	// 排序类型
	public static final int WSK_ST_ORDER = 0; // 大小排序
	public static final int WSK_ST_COUNT = 1; // 数目排序
	public static final int WSK_ST_VALUE = 2; // 数值排序
	public static final int WSK_ST_COLOR = 3; // 花色排序
	public static final int WSK_ST_CUSTOM = 4; // 自定排序
	public static final int WSK_ST_510K = 5; // 510K排序
	public static final int WSK_ST_TONGHUA = 6; // 同花排序

	// 干瞪眼
	public static final int GDY_CT_ERROR = -1; // 错误类型
	public static final int GDY_CT_PASS = 0; // 过
	public static final int GDY_CT_SINGLE = 1; // 单牌类型
	public static final int GDY_CT_DOUBLE = 2; // 对子类型
	public static final int GDY_CT_SINGLE_LINK = 3; // 单连类型
	public static final int GDY_CT_DOUBLE_LINK = 4; // 对连类型
	public static final int GDY_CT_BOMB_3 = 5; // 3炸弹
	public static final int GDY_CT_BOMB_4 = 6; // 4炸弹
	public static final int GDY_CT_BOMB_5 = 7; // 小王软5炸弹
	public static final int GDY_CT_BOMB_6 = 8; // 6炸弹
	public static final int GDY_CT_KING_BOMB = 9; // 王炸
	public static final int GDY_MAX_INDEX = 15; // 干瞪眼索引
	public static final int GAY_MAX_COUT = 27;
	// 欢乐干瞪眼
	public static final int GDY_CT_ERROR_HL = -1; // 错误类型
	public static final int GDY_CT_PASS_HL = 0; // 过
	public static final int GDY_CT_SINGLE_HL = 1; // 单牌类型
	public static final int GDY_CT_DOUBLE_HL = 2; // 对子类型
	public static final int GDY_CT_SINGLE_LINK_HL = 3; // 单连类型
	public static final int GDY_CT_DOUBLE_LINK_HL = 4; // 对连类型
	public static final int GDY_CT_BOMB_3_XIAOWANG_RUAN_HL = 5; // 小王软3炸弹
	public static final int GDY_CT_BOMB_3_DAWANG_RUAN_HL = 6; // 大王软3炸弹
	public static final int GDY_CT_BOMB_3_HL = 7; // 3炸弹
	public static final int GDY_CT_BOMB_4_XIAOWANG_RUAN_HL = 8; // 小王软4炸弹
	public static final int GDY_CT_BOMB_4_DAWANG_RUAN_HL = 9; // 小王软4炸弹
	public static final int GDY_CT_BOMB_4_HL = 10; // 4炸弹
	public static final int GDY_CT_BOMB_5_XIAOWANG_RUAN_HL = 11; // 小王软5炸弹
	public static final int GDY_CT_BOMB_5_DAWANG_RUAN_HL = 12; // 小王软5炸弹
	public static final int GDY_CT_BOMB_5_HL = 12; // 小王软5炸弹
	public static final int GDY_CT_BOMB_6_HL = 13; // 6炸弹
	public static final int GDY_CT_KING_BOMB_HL = 14; // 王炸
	public static final int GDY_MAX_INDEX_HL = 15; // 干瞪眼索引
	public static final int GAY_MAX_COUT_HL = 27;
	// 肉挨肉干瞪眼
	public static final int GDY_CT_ERROR_RAR = -1; // 错误类型
	public static final int GDY_CT_PASS_RAR = 0; // 过
	public static final int GDY_CT_SINGLE_RAR = 1; // 单牌类型
	public static final int GDY_CT_DOUBLE_RAR = 2; // 对子类型
	public static final int GDY_CT_THREE_RAR = 3; // 对子类型
	public static final int GDY_CT_SINGLE_LINK_RAR = 4; // 单连类型
	public static final int GDY_CT_DOUBLE_LINK_RAR = 5; // 对连类型
	public static final int GDY_CT_THREE_LINK_RAR = 6; // 三连类型
	public static final int GDY_CT_THREE_TAKE_TWO_RAR = 7; // 三带二
	public static final int GDY_CT_PLANE_TAKE_TWO_RAR = 8; // 飞机带翅膀
	public static final int GDY_CT_RUAN_BOMB_RAR = 9; // 软炸
	public static final int GDY_CT_BOMB_RAR = 10; // 硬炸
	public static final int GDY_CT_MAGIC_BOMB_RAR = 11; // 癞子炸
	public static final int GDY_CT_KING_BOMB_RAR = 12; // 王炸

	// 九点半
	public static final int JDB_APPLY_COUNT = 8; // 申请最大坐下人数
	public static final int JDB_SIT_MAX = 8; // 最大坐下人数
	public static final int JDB_MAX_AREA = 8; // 最大区域
	public static final int JDB_SIT_MIN = 2; // 最小坐下人数
	public static final int JDB_CARD_COUNT = 2;
	public static final int JDB_MAX_CARD_COUNT = 54;// 牌数
	public static final int JDB_NULL = 0;
	public static final int JDB_ZERO = 1; // 0点
	public static final int JDB_HALF = 2; // 0.5 点
	public static final int JDB_ONE = 3; // 1点
	public static final int JDB_ONE_HALF = 4;
	public static final int JDB_TWO = 5;
	public static final int JDB_TWO_HALF = 6;
	public static final int JDB_THREE = 7;
	public static final int JDB_THREE_HALF = 8;
	public static final int JDB_FOUR = 9;
	public static final int JDB_FOUR_HALF = 10;
	public static final int JDB_FIVE = 11;
	public static final int JDB_FIVE_HALF = 12;
	public static final int JDB_SIX = 13;
	public static final int JDB_SIX_HALF = 14;
	public static final int JDB_SEVEN = 15;
	public static final int JDB_SEVEN_HALF = 16;
	public static final int JDB_EIGHT = 17;
	public static final int JDB_EIGHT_HALF = 18;
	public static final int JDB_NINE = 19;
	public static final int JDB_DUI_ZI = 20;
	public static final int JDB_NINE_HALF = 21;

	public static final int JDB_CALCULATE_INVAID = 0;
	public static final int JDB_CALCULATE_LOST = 1;
	public static final int JDB_CALCULATE_PING = 2;
	public static final int JDB_CALCULATE_WIN = 3;

	// 1:r抢庄 2：下注 3：开牌 4：忽略 和 确认申请用户 5：携带分数 6:申请坐下
	public static final int CMD_CALL_BANKER = 1; // 抢庄
	public static final int CMD_ADD_JETTON = 2; // 下注
	public static final int CMD_OPEN_CARD = 3; // 开牌
	public static final int CMD_CREATOR_OPERATE = 4; // 房主操作 确认 忽略
	public static final int CMD_CARRY_MONEY = 5; // 携带分数
	public static final int CMD_APPLY_SEAT = 6; // 申请坐下
	public static final int CMD_APPLY_BU_SCORE = 7; // 申请补分
	public static final int CMD_CREAROR_BU_SCORE = 8; // 确认补分操作
	public static final int CMD_GO_TO = 9; // 继续
	public static final int CMD_STAND_UP = 10; // 站起
	public static final int CMD_ADD_BANKER = 11; // 添庄
	public static final int CMD_END_ADD_SCORE = 12; // 游戏结束补分
	public static final int CMD_END_ADD_BANKER = 13; // 游戏结束添加（小面版）
	public static final int CMD_END_NEXT_BANKER = 14; // 游戏结束下庄（不当庄）
	public static final int CMD_END_MADE_BANKER = 15; // 游戏结束做庄
	public static final int CMD_GET_NUMBER_LIST = 16; // 获取成员列表
	public static final int CMD_GO_OUT_OPERATE = 17; // 踢除操作
	public static final int CMD_PASS_JETTON = 18; // pass 下注
	public static final int CMD_CANCEL_BANKER = 19; // 用户下庄
	public static final int CMD_RECORD_INFO = 20; // 请求战绩
	public static final int CMD_ALL_AGREE_SEAT_OFF = 21; // 全部忽略坐下
	public static final int CMD_ALL_AGREE_ADD_SCORE = 22; // 全部补分操作
	public static final int CMD_PAUSE_GAME = 23; // 游戏 暂停
	public static final int CMD_USER_GET_NUMBER_LIST = 24; // 用户获取成员列表
	public static final int CMD_MAX_INDEX = 25; // 最大操作

	public static final int JDB_OPERATE_NULL = 0x00000000; // 没有操作
	public static final int JDB_STAND_UP = 0x00000001; // 站起操作
	public static final int JDB_GO_TO = 0x00000002; // 断续
	public static final int JDB_ADD_BANKER = 0x00000004; // 添庄
	public static final int JDB_CACEL_BANKER = 0x00000008; // 下庄

	public static final int JDB_POP_CANCEL = 0x000000001; // 取消弹窗
	public static final int JDB_POP_ADD_BANKER = 0x000000002; // 添庄
	public static final int JDB_POP_SURE = 0x000000004; // 确定
	public static final int JDB_POP_BANKER = 0x000000008; // 坐庄
	public static final int JDB_POP_ADD_SCORE = 0x000000010; // 补分

	// 闲逸咔陇

	public static final int XYKL_MAX_COUNT = 3; // 手牌数量

	// 斗板凳
	public static final int DBD_CT_ERROR = -1; // 错误类型
	public static final int DBD_CT_PASS = 0; // 过
	public static final int DBD_CT_SINGLE = 1; // 单牌类型
	public static final int DBD_CT_DOUBLE = 2; // 对子类型
	public static final int DBD_CT_SINGLE_LINK = 3; // 单连类型
	public static final int DBD_CT_DOUBLE_LINK = 4; // 对连类型
	public static final int DBD_CT_BOMB_3 = 5; // 3炸弹
	public static final int DBD_CT_BOMB_4_RUAN = 6; // 4炸弹
	public static final int DBD_CT_BOMB_4_YING = 7; // 4炸弹
	public static final int DBD_MAX_INDEX = 14; // 干瞪眼索引
	public static final int DBD_MAX_COUT = 17;

	// 丁二红
	public static final int DEH_CT_DINGERHUANG = 114;// 丁二皇
	public static final int DEH_CT_TIANDUI = 113;// 天对
	public static final int DEH_CT_DIDUI = 112;// 地对
	public static final int DEH_CT_RENPAIDUI = 111;// 人牌对
	public static final int DEH_CT_HEPAIDUI = 110;// 和牌对
	public static final int DEH_CT_ZHONGSANDUI = 109;// 中三对
	public static final int DEH_CT_XIAYODUI = 108;// 下腰对
	public static final int DEH_CT_SILAN = 107;// 四滥
	public static final int DEH_CT_TIANJIUWANG = 106;// 天九王
	public static final int DEH_CT_DIJIUWANG = 105;// 地九王
	public static final int DEH_CT_HONGTIANGANG = 104;// 红天杠
	public static final int DEH_CT_HEITIANGANG = 103;// 黑天杠
	public static final int DEH_CT_HONGDIGANG = 102;// 红地杠
	public static final int DEH_CT_HEIDIGANG = 101;// 黑地杠
	public static final int DEH_CT_TIANGUANJIU = 100;// 天官九
	public static final int DEH_CT_DIGUANJIU = 99;// 地官九
	public static final int DEH_CT_HONGTONGJIU = 98;// 红筒九
	public static final int DEH_CT_HEGUANJIU = 97;// 和官九
	public static final int DEH_CT_MEISHIJIU = 96;// 梅十九
	public static final int DEH_CT_BANWUJIU = 95;// 板五九
	public static final int DEH_CT_DINGCHANGJIU = 94;// 丁长九
	public static final int DEH_CT_WULONGJIU = 93;// 乌龙九
	public static final int DEH_CT_TIAOSHIJIU = 92;// 笤十九
	public static final int DEH_CT_DINGMAOJIU = 91;// 丁猫九
	public static final int DEH_CT_TIANGUANBA = 89;// 天官八
	public static final int DEH_CT_DIGUANBA = 88;// 地官八
	public static final int DEH_CT_RENSHIBA = 87;// 人十八
	public static final int DEH_CT_HEGUANBA = 86;// 和官八
	public static final int DEH_CT_MEISHIBA = 85;// 梅十八
	public static final int DEH_CT_FUSHIBA = 84;// 斧十八
	public static final int DEH_CT_TIAOSHIBA = 83;// 笤十八
	public static final int DEH_CT_DINGWUBA = 82;// 丁五八
	public static final int DEH_CT_TIANGUANQI = 80;// 天官七
	public static final int DEH_CT_DIGUANQI = 79;// 地官七
	public static final int DEH_CT_SUZHOUQI = 78;// 苏州七
	public static final int DEH_CT_DINGHEQI = 77;// 丁和七
	public static final int DEH_CT_MEISHIQI = 76;// 梅十七
	public static final int DEH_CT_DINGCHANGQI = 75;// 丁长七
	public static final int DEH_CT_FUCHANGQI = 74;// 斧长七
	public static final int DEH_CT_FUMAOGQI = 73;// 斧猫七
	public static final int DEH_CT_TIAOSHIQI = 72;// 笤十七
	public static final int DEH_CT_YANGZHOUQI = 71;// 扬州七
	public static final int DEH_CT_TIANGUANLIU = 69;// 天官六
	public static final int DEH_CT_DIGUANLIU = 68;// 地官六
	public static final int DEH_CT_WENWULIU = 67;// 文武六
	public static final int DEH_CT_MEISHILIU = 66;// 梅十六
	public static final int DEH_CT_CHANGSHILIU = 65;// 长十六
	public static final int DEH_CT_FUSHILIU = 64;// 斧十六
	public static final int DEH_CT_TIAOSHILIU = 63;// 笤十六
	public static final int DEH_CT_YAOGAOLIU = 62;// 药膏六
	public static final int DEH_CT_JIUQILIU = 61;// 九七六
	public static final int DEH_CT_TIANDINGWU = 59;// 天丁五
	public static final int DEH_CT_DIDINGWU = 58;// 地丁五
	public static final int DEH_CT_RENSHIWU = 57;// 人十五
	public static final int DEH_CT_HEXINWU = 56;// 和心五
	public static final int DEH_CT_MEISHIWU = 55;// 梅十五
	public static final int DEH_CT_BANFUWU = 54;// 板斧五
	public static final int DEH_CT_CHANGSANWU = 53;// 长三五
	public static final int DEH_CT_TIAOSHIWU = 52;// 笤十五
	public static final int DEH_CT_MAOSHIWU = 51;// 猫十五
	public static final int DEH_CT_YAOGAOWU = 50;// 药膏五
	public static final int DEH_CT_QIBAWU = 49;// 七八五
	public static final int DEH_CT_TIANDIGONGZI = 47;// 天地公子
	public static final int DEH_CT_RENSHISI = 46;// 人十四
	public static final int DEH_CT_HESHISI = 45;// 和十四
	public static final int DEH_CT_MEISHISI = 44;// 梅十四
	public static final int DEH_CT_CHANGSHISI = 43;// 长十四
	public static final int DEH_CT_DINGFUSI = 42;// 丁斧四
	public static final int DEH_CT_BALIUSI = 41;// 八六四
	public static final int DEH_CT_SHUANGHUAQI = 40;// 双花七
	public static final int DEH_CT_JIUWUSI = 39;// 九五四
	public static final int DEH_CT_TIANFUSAN = 37;// 天斧三
	public static final int DEH_CT_DIFUSAN = 36;// 地斧三
	public static final int DEH_CT_RENSHISAN = 35;// 人十三
	public static final int DEH_CT_HESHISAN = 34;// 和十三
	public static final int DEH_CT_MIESHISAN = 33;// 梅十三
	public static final int DEH_CT_SIJIUSAN = 32;// 四九三
	public static final int DEH_CT_CHANGSHISAN = 31;// 长十三
	public static final int DEH_CT_TIAOSHISAN = 30;// 笤十三
	public static final int DEH_CT_QILIUSAN = 29;// 七六三
	public static final int DEH_CT_BAWUSAN = 28;// 八五三
	public static final int DEH_CT_TIANSHIER = 26;// 天十二
	public static final int DEH_CT_DISHIER = 25;// 地十二
	public static final int DEH_CT_RENSHIER = 24;// 人十二
	public static final int DEH_CT_HESHIER = 23;// 和十二
	public static final int DEH_CT_CHANGSHIER = 22;// 长十二
	public static final int DEH_CT_ERLIUER = 21;// 二六二
	public static final int DEH_CT_YAOGAOER = 20;// 药膏二
	public static final int DEH_CT_DINGJIUER = 19;// 丁九二
	public static final int DEH_CT_QIWUER = 18;// 七五二
	public static final int DEH_CT_JIADIJIUWANG = 16;// 地九王
	public static final int DEH_CT_RENSHIYI = 15;// 人十一
	public static final int DEH_CT_HESHIYI = 14;// 和十一
	public static final int DEH_CT_MEISHIYI = 13;// 梅十一
	public static final int DEH_CT_CHANGSHIYI = 12;// 长十一
	public static final int DEH_CT_CHANGSANYI = 11;// 斧三一
	public static final int DEH_CT_FUSHIYI = 10;// 斧十一
	public static final int DEH_CT_WULIUYI = 9;// 五六一
	public static final int DEH_CT_DINGBAYI = 8;// 丁八一
	public static final int DEH_CT_SILIUCOU = 6;// 四六凑
	public static final int DEH_CT_SHUANGHUASHI = 5;// 双花十
	public static final int DEH_CT_FUJIUCOU = 4;// 斧九凑
	public static final int DEH_CT_DINGQICOU = 3;// 丁七凑
	public static final int DEH_MAX_COUNT = 4; // 手牌数量

	public static final int CARD_COUNT_CP_SCH = 84; // 四川长牌
	public static final int GAME_PLAYER_FOUR = 4; // 4 人
	public static final int MAX_CP_COUNT = 18; // 最大数目手牌（长牌）
	public static final int MAX_CP_INDEX = 21; // 21种类型的牌
	public static final int MAX_CP_WEAVE = 10; // 最大组合

	// 斗十四
	public static final int DSS_CARD_COUNT_HONG_DIAN = 84; // 红点算分玩法
	public static final int DSS_CARD_COUNT_DA_HUO = 76; // 打火火子玩法
	public static final int DSS_GAME_PLAYER_FOUR = 4; // 4 人
	public static final int DSS_GAME_PLAYER_THREE = 3; // 3 人
	public static final int DSS_MAX_CP_COUNT = 12; // 最大数目手牌（长牌）
	public static final int DSS_MAX_CP_INDEX = 21; // 21种类型的牌
	public static final int DSS_MAX_CP_WEAVE = 10; // 最大组合

	public static final int CP_TYPE_HUA = 1;
	public static final int CP_TYPE_DISPATCH_CHE = 2;
	public static final int CP_TYPE_OUT_CHE = 3;
	public static final int CP_TYPE_HUA_LONG = 4;

	public static final int CP_TYPE_THREE_PENG = 1; // 起手三张碰
	public static final int CP_TYPE_DISPATCH_PENG = 2; // 发牌碰
	public static final int CP_TYPE_OUT_PENG = 3; // 碰别人打的牌

	// 打抓
	public static final int DZ_CARD_COUNT = 105; // 牌张数
	public static final int DZ_GAME_PLAYER_FOUR = 2; // 2 人
	public static final int DZ_GAME_PLAYER_THREE = 3; // 3 人
	public static final int DZ_MAX_CP_COUNT = 30; // 最大数目手牌（长牌）
	public static final int DZ_MAX_CP_INDEX = 21; // 21种类型的牌
	public static final int DZ_MAX_CP_WEAVE = 10; // 最大组合
	public static final int DZ_MAX_CP_FIRST_COUNT = 21; // 起手最大牌
	// A包子
	public static final int ABZ_MAX_COUT = 12;
	public static final int CARD_COUNT_ABZ = 36; // A包子 A包
	public static final int ABZ_CT_ERROR = -1; // 错误类型
	public static final int ABZ_CT_PASS = 0; // 过
	public static final int ABZ_CT_SINGLE = 1; // 单牌类型
	public static final int ABZ_CT_DOUBLE = 2; // 对子类型
	public static final int ABZ_CT_SINGLE_LINK = 3; // 单连类型
	public static final int ABZ_CT_DOUBLE_LINK = 4; // 对连类型
	public static final int ABZ_CT_BOMB = 5; // 炸弹
	public static final int ABZ_MAX_INDEX = 13;

	/**
	 * 益阳无花牛，牌数据，四色牌，9种牌，共36张 - A，2，3，4，5，6，7，8，9
	 */
	public static final int[] CARD_DATA_YI_YANG = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29,
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, };

	// 广丰五十K
	public static final int WSK_GF_CT_ERROR = -1; // 错误类型
	public static final int WSK_GF_CT_PASS = 0; // 过
	public static final int WSK_GF_CT_SINGLE = 1; // 单牌类型
	public static final int WSK_GF_CT_DOUBLE = 2; // 对子类型
	public static final int WSK_GF_CT_THREE = 3; // 3张类型
	public static final int WSK_GF_CT_THREE_TAKE_TWO = 4; // 3带二
	public static final int WSK_GF_CT_SINGLE_LINK = 5; // 单连类型
	public static final int WSK_GF_CT_DOUBLE_LINK = 6; // 对连类型
	public static final int WSK_GF_CT_PLANE = 7; // 飞机
	public static final int WSK_GF_CT_PLANE_LOST = 8; // 飞机缺翅膀
	public static final int WSK_GF_CT_510K_DC = 9; // 杂510K
	public static final int WSK_GF_CT_510K_SC = 10; // 纯510K
	public static final int WSK_GF_CT_BOMB_4 = 11; // 4炸类型
	public static final int WSK_GF_CT_BOMB_5 = 12; // 5弹类型
	public static final int WSK_GF_CT_BOMB_6 = 13; // 6炸类型
	public static final int WSK_GF_CT_BOMB_7 = 14; // 7炸类型
	public static final int WSK_GF_CT_BOMB_8 = 15; // 8炸类型
	public static final int WSK_GF_CT_BOMB_9 = 16; // 9炸类型
	public static final int WSK_GF_CT_KING_FOUR = 17; // 4王炸弹
	public static final int WSK_GF_CT_BOMB_10 = 18; // 10炸类型
	public static final int WSK_GF_CT_KING_FIVE = 19; // 5王
	public static final int WSK_GF_CT_BOMB_11 = 20; // 11炸类型
	public static final int WSK_GF_CT_KING_SIX = 21; // 6王
	public static final int WSK_GF_CT_KING_SEVEN = 22; // 7王
	public static final int WSK_GF_CT_BOMB_12 = 23; // 12炸类型
	public static final int WSK_GF_CT_BOMB_13 = 24; // 13炸类型
	public static final int WSK_GF_CT_KING_EIGHT = 25; // 8王
	// 浦城五十K
	public static final int WSK_PC_CT_ERROR = -1; // 错误类型
	public static final int WSK_PC_CT_PASS = 0; // 过
	public static final int WSK_PC_CT_SINGLE = 1; // 单牌类型
	public static final int WSK_PC_CT_DOUBLE = 2; // 对子类型
	public static final int WSK_PC_CT_THREE = 3; // 3张类型
	public static final int WSK_PC_CT_THREE_TAKE_TWO = 4; // 3带二
	public static final int WSK_PC_CT_DOUBLE_LINK = 5; // 对连类型
	public static final int WSK_PC_CT_SINGLE_LINK = 6; // 单连类型
	public static final int WSK_PC_CT_PLANE = 7; // 飞机
	public static final int WSK_PC_CT_PLANE_LOST = 8; // 飞机缺翅膀
	public static final int WSK_PC_CT_BOMB_4 = 9; // 4炸类型
	public static final int WSK_PC_CT_BOMB_5 = 10; // 5弹类型
	public static final int WSK_PC_CT_BOMB_6 = 11; // 6炸类型
	public static final int WSK_PC_CT_BOMB_7 = 12; // 7炸类型
	public static final int WSK_PC_CT_BOMB_8 = 13; // 8炸类型
	public static final int WSK_PC_CT_BOMB_9 = 14; // 9炸类型
	public static final int WSK_PC_CT_BOMB_10 = 15; // 10炸类型
	public static final int WSK_PC_CT_BOMB_11 = 16; // 11炸类型
	public static final int WSK_PC_CT_BOMB_12 = 17; // 12炸类型
	public static final int WSK_PC_CT_KING_FOUR = 18; // 4王炸弹

	// 信丰挂挡
	public static final int XFGD_MAX_INDEX = 16; // 信丰挂挡索引
	public static final int XFGD_MAX_COUT = 42;
	public static final int CARD_COUNT_XFGD = 108; // 信丰挂挡
	public static final int XFGD_CT_ERROR = -1; // 错误类型
	public static final int XFGD_CT_PASS = 0; // 过
	public static final int XFGD_CT_SINGLE = 1; // 单牌类型
	public static final int XFGD_CT_DOUBLE = 2; // 对子类型
	public static final int XFGD_CT_DOUBLE_LINK = 3; // 对连类型
	public static final int XFGD_CT_SHUAI_PAI = 4; // 甩牌类型
	public static final int XFGD_CT_DIAN_PAI = 5;// 垫牌

	// 吉县斗地主
	public static final int JXDDZ_MAX_COUT = 21;
	public static final int JXDDZ_DI_PAI_COUNT_JD = 5; // 底牌数量

	// 溆浦博胡
	public static final int XPBH_MAX_COUNT = 26;
	public static final int XPBH_MAX_INDEX = 30;
	public static final int XPBH_MAX_WEAVE = 26;
	public static final int XPBH_CARD_COUNT = 120;
	public static final int XPBH_IS_YAO = 0x100;
	public static final int XPBH_IS_XIAN_MING_ZHAO = 0x200;
	public static final int XPBH_IS_MUST_OUT_CARD = 0x400;
	public static final int XPBH_IS_TING_XIAN_MING_ZHAO = 0x800;

	public static final int XPBH_TYPE_DA_GUN = 1;
	public static final int XPBH_TYPE_KAI_ZHAI = 2;
	public static final int XPBH_TYPE_SHE = 3;
	public static final int XPBH_TYPE_ZHUA_LONG = 4;

	// 咸宁打拱
	public static final int XNDG_CT_ERROR = -1; // 错误类型
	public static final int XNDG_CT_PASS = 0; // 过
	public static final int XNDG_CT_SINGLE = 1; // 单牌类型
	public static final int XNDG_CT_DOUBLE = 2; // 对子类型
	public static final int XNDG_CT_THREE = 3; // 3张类型
	public static final int XNDG_CT_DOUBLE_LINK = 4; // 对连类型
	public static final int XNDG_CT_PLANE = 5; // 飞机
	public static final int XNDG_CT_510K_DC = 6; // 杂510K
	public static final int XNDG_CT_510K_SC = 7; // 纯510K
	public static final int XNDG_CT_BOMB = 8; // 炸弹类型

	// 通城打滚
	public static final int WSK_TC_MAX_INDEX = 16;
	public static final int TCDG_CT_ERROR = -1; // 错误类型
	public static final int TCDG_CT_PASS = 0; // 过
	public static final int TCDG_CT_SINGLE = 1; // 单牌类型
	public static final int TCDG_CT_DOUBLE = 2; // 对子类型
	public static final int TCDG_CT_THREE = 3; // 3张类型
	public static final int TCDG_CT_DOUBLE_LINK = 7; // 对连类型
	public static final int TCDG_CT_PLANE = 18; // 飞机
	public static final int TCDG_CT_510K_DC = 20; // 杂510K
	public static final int TCDG_CT_510K_SC = 21; // 纯510K
	public static final int TCDG_CT_BOMB = 15; // 炸弹类型

	// 贵州板子炮
	public static final int BZP_GZH_MAX_INDEX = 16; // 最大index 16
	public static final int BZP_GZH_MAX_CARD_COUNT = 52; // 最多52 张牌
	public static final int BZP_GZH_MAX_COUNT = 13; // 手牌13张
	public static final int BZP_GZH_ERROR = -1; // 错误类型
	public static final int BZP_GZH_PASS = 0; // 过
	public static final int BZP_GZH_SINGLE = 0x100; // 单牌类型
	public static final int BZP_GZH_DOUBLE = 0x200; // 对子类型
	public static final int BZP_GZH_SINGLE_LINK = 0x400; // 顺子
	public static final int BZP_GZH_THREE = 0x800; // 3张类型
	public static final int BZP_GZH_DOUBLE_LINK = 0x1000; // 对连类型
	public static final int BZP_GZH_BOMB = 0x2000; // 炸弹类型
	public static final int BZP_GZH_PLANE = 0x4000; // 飞机(滚筒）
	public static final int BZP_GZH_GUN_LONG = 0x8000; // 飞机（滚龙）
	public static final int BZP_GZH_ALL_SINGLE = 0x10000; // 飞机（十三烂）

	public static final int BZP_GZH_BAO_PAI = 1; // 包牌
	public static final int BZP_GZH_FAN_BAO = 2; // 反包
	public static final int BZP_GZH_GUN_LONG_TYPE = 4; // 滚龙
	public static final int BZP_GZH_ALL_SINGLE_TYPE = 5; // 十三烂
	public static final int BZP_GZH_DISPLAYER_CARD = 6; // 显示余牌
	public static final int BZP_GZH_DISPLAYER_CARD_NOT = 7; // 不显示余牌

	public static final int BZP_GZH_SINGLE_SZ = 1; // 单牌类型
	public static final int BZP_GZH_DOUBLE_SZ = 2; // 对子类型
	public static final int BZP_GZH_SINGLE_LINK_SZ = 3; // 顺子
	public static final int BZP_GZH_THREE_SZ = 4; // 3张类型
	public static final int BZP_GZH_DOUBLE_LINK_SZ = 5; // 对连类型
	public static final int BZP_GZH_BOMB_SZ = 6; // 炸弹类型
	public static final int BZP_GZH_PLANE_SZ = 7; // 飞机(滚筒）
	public static final int BZP_GZH_GUN_LONG_SZ = 8; // 飞机（滚龙）
	public static final int BZP_GZH_ALL_SINGLE_SZ = 9; // 飞机（十三烂）

	// 吕梁打七
	public static final int LLDQ_MAX_INDEX = 16; // 信丰挂挡索引
	public static final int LLDQ_MAX_COUT = 28;
	public static final int CARD_COUNT_LLDQ = 108; // 信丰挂挡
	public static final int LLDQ_CT_ERROR = -1; // 错误类型
	public static final int LLDQ_CT_PASS = 0; // 过
	public static final int LLDQ_CT_SINGLE = 1; // 单牌类型
	public static final int LLDQ_CT_DOUBLE = 2; // 对子类型
	public static final int LLDQ_CT_DOUBLE_LINK = 3; // 对连类型
	public static final int LLDQ_CT_DOUBLE_LINK_OTHER = 4; // 对连类型
	public static final int LLDQ_CT_DIAN = 5;// 垫牌

	// 万载倒段
	public static final int WZDD_MAX_INDEX = 16; // 万载倒段索引
	public static final int WZDD_MAX_COUT = 20;
	public static final int CARD_COUNT_WZDD = 54; // 信丰挂挡
	public static final int WZDD_CT_ERROR = -1; // 错误类型
	public static final int WZDD_CT_PASS = 0; // 过
	public static final int WZDD_CT_SINGLE = 1; // 单牌类型
	public static final int WZDD_CT_SINGLE_LINK = 2; // 顺子
	public static final int WZDD_CT_TWO_KING = 3; // 对王
	public static final int WZDD_CT_DIAN = 4;// 垫牌
	// 黄石大冶
	public static final int HSDY_MAX_INDEX = 16;
	public static final int HSDY_CT_ERROR = -1; // 错误类型
	public static final int HSDY_CT_PASS = 0; // 过
	public static final int HSDY_CT_SINGLE = 1; // 单牌类型
	public static final int HSDY_CT_DOUBLE = 2; // 对子类 型
	public static final int HSDY_CT_SINGLE_LINK = 6; // 顺子类型
	public static final int HSDY_CT_DOUBLE_LINK = 7; // 对连类型
	public static final int HSDY_CT_510K_DC = 20; // 杂510K
	public static final int HSDY_CT_510K_SC = 21; // 纯510K
	public static final int HSDY_CT_BOMB = 15; // 炸弹类型
	public static final int HSDY_CT_KING_BOOM = 17; //
	// 松溪同花
	public static final int SXTH_CT_ERROR = -1; // 错误类型
	public static final int SXTH_CT_PASS = 0; // 过
	public static final int SXTH_CT_TONG_ZHANG = 1; // 同张类型
	public static final int SXTH_CT_510K_DC = 2; // 杂510K
	public static final int SXTH_CT_510K_SC = 3; // 纯510K
	public static final int SXTH_CT_TONG_HUA = 4;// 同花
	public static final int SXTH_CT_BOMB = 5; // 炸弹类型

	// 黑桃三
	public static final int HTS_CT_ERROR = -1; // 错误类型
	public static final int HTS_CT_PASS = 0; // 过
	public static final int HTS_CT_SINGLE = 1; // 单
	public static final int HTS_CT_DOUBLE = 2; // 对
	public static final int HTS_CT_THREE = 3; // 3张类型
	public static final int HTS_CT_LINK_DOUBLE = 4; // 连对
	public static final int HTS_CT_THREE_TAKE_TWO = 5;// 三代二
	public static final int HTS_CT_PLANE = 6; // 飞机
	public static final int HTS_CT_PLANE_LOSS = 7; // 飞机缺翅膀
	public static final int HTS_CT_ZHA_WSK = 8;// 杂510k
	public static final int HTS_CT_ZHENG_WSK = 9;// 正510k
	public static final int HTS_CT_BOOM = 10; // 炸弹
	public static final int HTS_CT_HTS = 11; // 黑桃三

	// 湘潭消造
	public static final int TCDG_XTXZ_ERROR = -1; // 错误类型
	public static final int TCDG_XTXZ_PASS = 0; // 过
	public static final int TCDG_XTXZ_SINGLE = 1; // 单牌类型
	public static final int TCDG_XTXZ_DOUBLE = 2; // 对子类型
	public static final int TCDG_XTXZ_THREE = 3; // 3张类型
	public static final int TCDG_XTXZ_3_DAI_2 = 5; // 3带2类型
	public static final int TCDG_XTXZ_DOUBLE_LINK = 7; // 对连类型
	public static final int TCDG_XTXZ_PLANE = 18; // 飞机
	public static final int TCDG_XTXZ_510K_DC = 20; // 杂510K
	public static final int TCDG_XTXZ_510K_SC = 21; // 纯510K
	public static final int TCDG_XTXZ_BOMB = 15; // 炸弹类型
	public static final int TCDG_XTXZ_KING = 17; // 四王炸或者二王炸类型

	public static final int TCDG_XTXZ_3_DAI_LOSS = 10; // 3带1
	public static final int TCDG_XTXZ_PLANE_LOSS = 11; // 飞机缺翅膀

}
