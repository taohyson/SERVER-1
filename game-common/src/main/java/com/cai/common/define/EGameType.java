
package com.cai.common.define;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 游戏类型
 * @author run
 *
 */
public enum EGameType {
	MJ(1,"MJ","湖南麻将"),
	HBMJ(2,"HBMJ","湖北麻将"),
	AY(3,"AY","河南麻将"),
	SG(4,"SG","双鬼麻将"),
	FLS(5,"FLS",/*"岳阳棋牌"*/"福禄寿"),
	DT(6,"DT","闲逸游戏"),
	JS(7,"JS","镇江棋牌"),
	PHZ(8,"PHZ","红黑胡"),
	NIUNIU(9,"NIUNIU","斗牛"),
	HJK(10,"HJK","21点"),
	PDK(11,"PDK","跑得快"),
	DTPH(12,"PDK","大厅碰胡"),
	
	NEW_AN_YANG(101, "NEW_AN_YANG", "安阳麻将"),
	NEW_LIN_ZHOU(102, "NEW_LIN_ZHOU", "林州麻将"),
	NEW_HE_HAN(103, "NEW_HE_NAN", "大厅河南麻将"),
	NEW_HN_HONG_ZHONG(104, "NEW_HN_HONG_ZHONG", "河南红中麻将"),
	NEW_ZHU_MA_DIAN(105, "NEW_ZHU_MA_DIAN", "驻马店麻将"),
	NEW_KAI_FENG(106, "NEW_KAI_FENG", "开封麻将"),
	NEW_NAN_YANG(107, "NEW_NAN_YANG", "南阳麻将"),
	NEW_XU_CHANG(108, "NEW_XU_CHANG", "许昌麻将"),
	NEW_LUO_YANG_GANG_CI(109, "NEW_LUO_YANG_GANG_CI", "洛阳杠次"),
	NEW_XIN_XIANG(110, "NEW_XIN_XIANG", "新乡麻将"),
	NEW_SAN_MEN_XIA(111, "NEW_SAN_MEN_XIA", "三门峡麻将"),
	NEW_PING_DING_SHAN(112, "NEW_PING_DING_SHAN", "平顶山麻将"),
	NEW_ZHOU_KOU(113, "NEW_ZHOU_KOU", "周口麻将"),
	NEW_LUO_HE(114, "NEW_LUO_HE", "漯河麻将"),
	NEW_JI_YUAN(115, "NEW_JI_YUAN", "济源麻将"),
	NEW_PU_YANG(116, "NEW_PU_YANG", "濮阳麻将"),
	NEW_SHANG_QIU(117, "NEW_SHANG_QIU", "商丘麻将"),
	NEW_HUA_ZHOU(118, "NEW_HUA_ZHOU", "滑州麻将"),
	NEW_LU_YI(119, "NEW_LU_YI", "鹿邑麻将"),
	NEW_JIA_ZUO(120, "NEW_JIA_ZUO", "焦作麻将"),
	
	MJ_HUO_JIA(121, "MJ_HUO_JIA", "获嘉麻将"),
	MJ_XUE_ZHAN_DAO_DI(122, "MJ_XUE_ZHAN_DAO_DI", "血战到底"),
	BULL_FIGHT_YI_YANG(123, "BULL_FIGHT_YI_YANG", "益阳牛牛"),
	CP_DOU_SHI_SI(124, "CP_DOU_SHI_SI", "斗十四"),
	MJ_SX_TUI_DAO_HU(125, "MJ_SX_TUI_DAO_HU", "山西推倒胡"),
	MJ_3D_E_ZHOU(126, "MJ_3D_E_ZHOU", "鄂州晃晃3D"),
	MJ_THJ_CS(127, "MJ_THJ_CS", "土豪金长沙"),
	MJ_AN_HUA(128, "MJ_AN_HUA", "安化麻将"),
	MJ_QIONG_LAI(129, "MJ_QIONG_LAI", "邛崃麻将"),
	MJ_JI_XIAN(130, "MJ_JI_XIAN", "吉县1928夹"),
	THJ_YI_YANG(131, "THJ_YI_YANG", "土豪金益阳麻将"),
	MJ_SRLF(132, "MJ_SRLF", "三人两房"),
	THJ_HONG_ZHONG(133, "THJ_HONG_ZHONG", "3D红中麻将"),
	MJ_YUAN_JIANG(134, "MJ_YUAN_JIANG", "沅江麻将"),
	MJ_HE_ZE(135, "MJ_HE_ZE", "菏泽麻将"),
	MJ_ZHENG_ZHOU(136, "MJ_ZHENG_ZHOU", "郑州麻将"),
	PK_TONG_CHENG(137, "PK_TONG_CHENG", "通城打滚"),
	MJ_DT_SHA_MA(138, "MJ_DT_SHA_MA", "洞庭沙麻"),
	MJ_DT_HONG_ZHONG(139, "MJ_DT_HONG_ZHONG", "洞庭红中"),
	HENAN_WU_ZHI(140, "HENAN_WU_ZHI", "河南武陟麻将"), //
	MJ_LIN_FENG(141, "MJ_LIN_FENG", "临汾硬三组"), //
	MJ_LF_YI_MEN_PAI(142, "MJ_LF_YI_MEN_PAI", "临汾一门牌"), //
	MJ_GUANG_AN(143, "MJ_GUANG_AN", "广安麻将"), //
	LE_SHAN_YAO_JI(144, "LE_SHAN_YAO_JI", "乐山幺鸡麻将"), // 
	MJ_KFZZ(145, "MJ_KFZZ", "开封郑州麻将"), //
	MJ_NEW_HN_ZHEN_ZHOU(146, "MJ_NEW_HN_ZHEN_ZHOU", "河南郑州麻将"), //
	MJ_LU_ZHOU_GUI(147, "MJ_LU_ZHOU_GUI", "泸州鬼麻将"), //
	MJ_XUE_LIU_CHENG_HU(148, "MJ_XUE_LIU_CHENG_HE", "血流成河"), //
	MJ_HL_XUE_LIU(149, "MJ_HL_XUE_LIU", "欢乐血流麻将"), //
	AN_YANG_ZZ(150, "AN_YANG_ZZ", "安阳郑州麻将"), //
	ZJK_HZ(151, "ZJK_HZ", "张家口红中麻将"), //
	GX_BEI_HAI(152, "GX_BEI_HAI", "广西北海麻将"), //
	MJ_MEN_HU_XUE_LIU(153, "MJ_MEN_HU_XUE_LIU", "闷胡血流麻将"), //
	HN_FAN_JIN(154, "HN_FAN_JIN", "翻金麻将"), //
	DENG_ZHOU_19_ZHANG(155, "DENG_ZHOU_19_ZHANG", "邓州十九张"), //
	PDS_ZHENG_ZHOU(156, "PDS_ZHENG_ZHOU", "平顶山郑州麻将"), //
	BAO_DING_BA_ZHANG(157, "BAO_DING_BA_ZHANG", "保定八张"), //
	
	PHZCD(200,"PHZCD","常德跑胡子"),
	PHZXT(201,"PHZXT","湘潭跑胡子"),
	FPHZ(202,"FPHZ","四人跑胡子"),
	PHZYX(203,"PHZYX","攸县跑胡子"),
	LHQHD(204,"LHQHD","六胡抢"),
	THKHY(205,"THKHY","十胡卡"),
	ZJH(206,"ZJH","看三张"),
	AXWMQ(207,"AXWMQ","偎麻雀"),
	QJQF(208,"AXWMQ","潜江千分"),
	PHUYX(209,"PHUYX","碰胡"),
	YYWHZ(210,"YYWHZ","岳阳歪胡子"),
	PHZ_CHEN_ZHOU(211, "PHZ_CHEN_ZHOU", "郴州字牌"),
	HHHGW(212,"HHHGW","怀化红拐弯"),
	HHYYZHZ(213,"HHYYZHZ","岳阳捉红字"),
	NXPHZ(214,"NXPHZ","宁乡跑胡子"),
	SYBP(215,"SYBP","邵阳剥皮"),
	SYZP(216,"SYZP","邵阳字牌"),
	CSPHZ(217,"CSPHZ","长沙跑胡子"),
	LYPHZ(218,"LYPHZ","耒阳字牌"),
	WGPHZ(219,"WGPHZ","武冈字牌"),
	NXGHZ(220,"NXGHZ","南县鬼胡子"),
	CZSR(221,"CZSR","郴州三人"),
	YZCHZ(222,"YZCHZ","永州扯胡子"),
	DTZZ(223,"DTZZ","转转麻将"),
	ERPHZ(224,"ERPHZ","二人跑胡子"),
	DTHZ(225,"DTHZ","红中麻将"),
	PHZLDFPF(226,"LDFPF","娄底放炮罚"),
	DTGXLZ(227,"DTGXLZ","广西柳州麻将"),
	DDZ(228,"DDZ","斗地主"),
	BTZ(231,"BTZ","扳砣子"),
	DTCSMJ(232,"DTCSMJ","长沙麻将"),
	YYTDHDT(233,"YYTDHDT","推倒胡"),
	YYZXZDT(234,"YYZXZDT","岳阳捉虾子"),
	XPLAOPAI(235,"XPLAOPAI","溆浦老牌"),
	SANDAHA(236,"SANDAHA","三打哈"),
	TTZ(237,"TTZ","推筒子"),
	AHPHZ(238,"ANHUA","安化跑胡子"),
	XPSSZ(239,"XPSSZ","溆浦十三张"),
	HUNANLL(240,"HUNANLL","湖南醴陵"),
	WCPHZ(241,"WCPHZ","望城跑胡子"),
	SXGDT(242,"SXGDT","上下鬼麻将"),
	YYPHZ(243,"YYPHZ","益阳跑胡子"),
	CDMJDT(244,"CDMJDT","湖南常德麻将"),
	GXGLZP(229,"GXGLZP","桂林字牌"),
	GXBYZP(230,"GXBYZP","八一字牌"),
	SGONG(245,"SGONG","三公"),
	YZMJ(246,"YZMJ","永州麻将"),
	TDZSX(248, "SXTDZ", "陕西推对子"),
	DTMJCHENZHOU(249, "DTMJCHENZHOU", "郴州红中"),
	DTXTMJ(250, "DTXTMJ", "湖南湘潭麻将"),
	DTMJJXLEPING(251, "DTMJJXLEPING", "江西乐平麻将"),
	MJGXNANNING(252, "MJGXNANNING", "广西南宁麻将"),
	YYQF(253, "YYQF", "益阳千分"),
	HSPHZ(254, "HSPHZ", "汉寿跑胡子"),
	XPPHZ(255, "XPPHZ", "溆浦跑胡子"),
	LXCSDT(256, "LXCSDT", "临湘长沙"),
	DMZ(257,"DMZ","打码子"),
	SYMJDT(258,"SYMJDT","邵阳麻将"),
	GDY(259,"GDY","干瞪眼"),
	TB(260,"TB","推饼"), // 跟扳砣子一模一样 
	GZP(261,"GZP","个子牌"),
	JDB(262,"JDB","九点斗"),
	MJYY(263,"MJYY","益阳麻将"),
	XYKL(264,"XYKL","扳丫几"),
	DTJSYANGZHONG(265, "DTJSYANGZHONG", "江苏扬中麻将"),
	HU_BEI_HUANG_ZHOU(266, "HU_BEI_HUANG_ZHOU", "湖北黄州晃晃"),
	HZ_LAI_ZI(267, "HZ_LAI_ZI","红中赖子杠"),
	DBD(268, "DBD","斗板凳"),
	HE_NAN_HUA_XIAN(269, "HE_NAN_HUA_XIAN", "河南滑县麻将"),
	DZD(270, "DZD", "打炸弹"),
	XY_SSZ(271, "XY_SSZ", "闲逸十三张"),
	HU_BEI_ER_ZHOU(272, "HU_BEI_ER_ZHOU", "湖北鄂州晃晃"),
	HAN_SHOU_WANG(273, "HAN_SHOU_WANG", "汉寿王"),
	GUI_YANG(274, "GUI_YANG","贵阳麻将"),
	NEW_PHZ_CHEN_ZHOU(275, "NEW_PHZ_CHEN_ZHOU", "新郴州字牌"),
	COU_YI_SE(276, "COU_YI_SE", "鄂州凑一色"),
	HU_BEI_HUANG_SHI(278, "HU_BEI_HUANG_SHI", "湖北黄石麻将"),
	HENG_YANG_258(279, "HENG_YANG_258", "衡阳258"),
	KLOX(280,"KLOX","快乐牛牛"),
	CZWXOX(281,"CZWXOX","郴州五小牛"),
	PAIJIU(282,"PAIJIU","丁二皇"),
	MJ_SW(283, "MJ_SW","汕尾麻将"),
	YYOX(284, "YYOX","岳阳牛牛"),
	MJ_BD(285,  "MJ_BD", "保定麻将"),
	ZJH_HB(286,  "ZJH_HB", "快乐赢三张"),
	CZBG(287,  "CZBG", "郴州八怪"),

	
	
	TBBEGIN(288,"TB","郑州推饼"),
	TB1(289,"TB","开封推饼"),
	TB2(290,"TB","平顶山推饼"),
	TB3(291,"TB","洛阳市推饼"),
	TB4(292,"TB","商丘推饼"),
	TB5(293,"TB","安阳推饼"),
	TB6(294,"TB","新乡推饼"),
	TB7(295,"TB","许昌推饼"),
	TB8(296,"TB","鹤壁推饼"),
	TB9(297,"TB","焦作推饼"),
	TB10(298,"TB","濮阳推饼"),
	TB11(299,"TB","漯河推饼"),
	TB12(300,"TB","三门峡推饼"),
	TB13(301,"TB","周口推饼"),
	TB14(302,"TB","驻马店推饼"),
	TB15(303,"TB","南阳推饼"),
	TB16(304,"TB","信阳推饼"),
	TBEND(305,"TB","济源推饼"),
	GDY_HB(306,  "GDY_HB", "欢乐干瞪眼"),
	
	MJ_TAO_JIANG(307, "MJ_TAO_JIANG", "桃江麻将"),
	MJ_LUHE(308, "MJ_LUHE","陆河麻将"),
	WSK_NSB(309,"WSK_NSB","牛十别"),
	
	HUANG_SHI_3D(310, "HUANG_SHI_3D", "湖北黄石麻将"),
	MJ_YY_SZG(311,"MJ_YY_SZG","益阳梭子杠"),
	MJ_GZCG(312, "MJ_GZCG", "赣州冲关"), // 麻将
	MJ_NINGDU(313, "MJ_NINGDU", "宁都麻将"), 
	MJ_ZHUZHOU_ZZ(314, "MJ_ZHUZHOU_ZZ", "株洲转转"), 
	MJ_LILING_ZZ(315, "MJ_NINGDU", "醴陵转转"), 
	PDK_LL(316,"PDK_LL","醴陵跑得快"),
	YIYANG_WHZ(317,"YIYANG_WHZ","益阳歪胡子"),
	MJ_TDH(318, "MJ_TDH","推倒胡"),
	SCSRPDK(320,"SCSRPDK","四川跑得快"),
	MJ_WEI_NANG(321,"MJ_WEI_NANG","渭南麻将"),
	MJ_KWX(322, "MJ_KWX","卡五星"),
	MJ_RUI_JIN(323,"MJ_RUI_JIN","瑞金麻将"),
	MJ_GD_HUNDRED(324,"MJ_GD_HUNDRED","广东100张"),
	MJ_LILING_TH(325,"MJ_LILING_TH","湖南醴陵土豪版"),
	PDK_YY(326,"PDK_YY","益阳跑得快"),
	HONG_ER_SHI(327,"HONG_ER_SHI","红二十"),
	MJ_GD_HUIZHOUZHUANG(328,"MJ_GD_HUIZHOUZHUANG","广东惠州庄"),
	ABZ(329,"ABZ","A包子"),
	WSK_GF(330,"WSK","广丰510K"),
	MJ_XIAN_NING(331,"MJ_XIAN_NING","咸宁麻将"),
	SJ_XF_GD(332,"SJ_XF_GD","信丰挂挡"),
	MJ_SX_JY(333, "MJ_SX_JY", "山西静乐麻将"),
	MJ_XU_PU(334,"MJ_XU_PU","溆浦麻将"),
	MJ_lV_LIANG(335,"MJ_lV_LIANG","吕梁捉耗子"),
	MJ_GUANG_CHANG(336,"MJ_GUANG_CHANG","广昌麻将"),
	MJ_YU_DU(337,"MJ_YU_DU","于都麻将"),
	MJ_XTDJK(338,"MJ_XTDJK","大邑断勾卡麻将"),
	WSK_HS_DZ(339,"WSK_HS_DZ","大治黄石五十K"),
	AH_PDK(340,"AH_PDK","安化跑得快"),
	MJ_SHANXI(341,"MJ_SHANXI","陕西麻将"),
	JX_DDZ(342,"JX_DDZ","吉县斗地主"),
	MJ_MYG(343,"MJ_MYG","茉阳鬼麻将"),
	YY_BASHI(344,"YY_BASHI","益阳巴十"),
	MJ_XI_AN(345,"MJ_XI_AN","西安麻将"),
	MJ_YI_FENG(347,"MJ_YI_FENG","宜丰麻将"),
	MJ_TC(348,"MJ_TC","通城麻将"),
	XN_DG(349,"XN_DG","咸宁打拱"),
	MJ_HSTX(350,"MJ_HSTX","黄山屯溪麻将"),
	PDK_YUEY(351,"PDK_YUEY","岳阳跑得快"),
	MJ_HUA_RONG(352,"MJ_HUA_RONG","华容逞癞子"),
	PHZ_XX(353,"PHZ_XX","湘乡告胡子"),
	MJ_WU_YUAN(354,"MJ_WU_YUAN","婺源麻将"),
	MJ_XIN_YANG(355,"MJ_XIN_YANG","信阳麻将"),
	GHZ_YJ(356,"GHZ_YJ","沅江鬼胡子"),
	MJ_WAN_ZAI(357,"MJ_WAN_ZAI","万载麻将"),
	MJ_TIAO_TIAO(358,"MJ_TIAO_TIAO","跳跳麻将"),
	MJ_SAN_MEN_XIA(359,"MJ_SAN_MEN_XIA","三门峡"),
	KL_DDZ(360,"KL_DDZ","快乐斗地主"),
	MJ_SX_HUA_SHUI(361, "MJ_SX_HUA_SHUI", "陕西滑水麻将"),
	PK_DTZ(362,"PK_DTZ","打筒子"),
	PDK_CZ(363,"PDK_CZ","郴州跑得快"),
	PDK_DT(364,"PDK_DT","洞庭跑得快"),
	LD_FANG_PAO_FA(365,"LD_FANG_PAO_FA","娄底放炮罚"),
	PK_GLH(366,"邛崃烘","PK_GLH"),
	MJ_CHANG_CHUN(367,"MJ_CHANG_CHUN","长春麻将"),
	MJ_SONG_YUAN(368,"MJ_SONG_YUAN","松原麻将"),
	PDK_HL(369,"PDK_KL","快乐跑得快"),
	MJ_KWX_2D(370,"MJ_KWX_2D","2D卡五星"),
	SJ_XP_240(371,"SJ_XP_240","溆浦240"),
	SJ_WZ_DD(372,"SJ_WZ_DD","万载倒段"),
	MJ_KOU_DIAN(373,"MJ_KOU_DIAN","山西扣点麻将"),
	MJ_LAN_XIAN(374,"MJ_LAN_XIAN","山西岚县麻将"),
	LPS2_DDZ(375,"LPS2_DDZ","六盘水2人斗地主"),
	LPS3_DDZ(376,"LPS3_DDZ","六盘水3人斗地主"),
	MJ_GY_ZJ_NEW(377,"MJ_GY_ZJ_NEW","新贵阳捉鸡"),
	MJ_JING_DE_ZHEN(378,"MJ_JING_DE_ZHEN","景德镇麻将"),
	MJ_LOU_FAN(379,"MJ_LOU_FAN","山西娄烦麻将"),
	MJ_NING_WU(380,"MJ_NING_WU","山西宁武麻将"),
	MJ_SX(381,"MJ_SX","松溪麻将"),
	NP_GDY(382,"NP_GDY","南平干瞪眼"),
	PDK_SX_SD(383,"PDK_SX_SD","陕西三代"),
	YSDZ(384,"YSDZ","玉山打炸"),
	PDK_XY(385,"PDK_XY","襄阳跑得快"),
	MJ_GUANG_ZE(386,"MJ_GUANG_ZE",	"福建光泽麻将"),
	MJ_YING_JING(387,"MJ_YING_JING",	"荥经麻将"),
	MJ_ZYZJ(388,"MJ_ZYZJ",	"遵义捉鸡"),
	NP_PDK(389,"NP_PDK",	"南平跑得快"),
	WSK_HTS(390,"WSK_HTS",	"黑桃三"),
	MJ_HDWP(391,"MJ_HDWP",	"山西洪洞王牌麻将"),
	WSK_PX(392,"WSK_PX",	"萍乡打滚筒"),
	LD_PDK(393,"LD_PDK",	"娄底跑得快"),
	MJ_NX_HS(394,"MJ_NX_HS","宁夏滑水麻将"),
	LF_DDZ(395,"LF_DDZ","临汾斗地主"),
	MJ_DCWDH(396,"MJ_DCWDH","都昌无档胡"),
	YZBP(397,"YZBP","永州包牌"),
	MJ_XY(398,"MJ_XY","兴义麻将"),
	MJ_DLQH(399,"MJ_DLQH","大连穷胡麻将"),
	// 401-500 都已经被占用 子游戏appID请从501开始
	BULL_FIGHT_BEGIN(400, "BULL_FIGHT", "通用斗牛"),
	BULL_FIGHT_01(401, "BULL_FIGHT", "郑州斗牛"),
	BULL_FIGHT_02(402, "BULL_FIGHT", "开封斗牛"),
	BULL_FIGHT_03(403, "BULL_FIGHT", "平顶山斗牛"),
	BULL_FIGHT_04(404, "BULL_FIGHT", "洛阳斗牛"),
	BULL_FIGHT_05(405, "BULL_FIGHT", "商丘斗牛"),
	BULL_FIGHT_06(406, "BULL_FIGHT", "安阳斗牛"),
	BULL_FIGHT_07(407, "BULL_FIGHT", "新乡斗牛"),
	BULL_FIGHT_08(408, "BULL_FIGHT", "许昌斗牛"),
	BULL_FIGHT_09(409, "BULL_FIGHT", "鹤壁斗牛"),
	BULL_FIGHT_10(410, "BULL_FIGHT", "焦作斗牛"),
	BULL_FIGHT_11(411, "BULL_FIGHT", "濮阳斗牛"),
	BULL_FIGHT_12(412, "BULL_FIGHT", "漯河斗牛"),
	BULL_FIGHT_13(413, "BULL_FIGHT", "三门峡斗牛"),
	BULL_FIGHT_14(414, "BULL_FIGHT", "周口斗牛"),
	BULL_FIGHT_15(415, "BULL_FIGHT", "驻马店斗牛"),
	BULL_FIGHT_16(416, "BULL_FIGHT", "南阳斗牛"),
	BULL_FIGHT_17(417, "BULL_FIGHT", "信阳斗牛"),
	BULL_FIGHT_18(418, "BULL_FIGHT", "济源斗牛"),
	BULL_FIGHT_19(419, "BULL_FIGHT", "贵阳斗牛"),
	BULL_FIGHT_END(500, "BULL_FIGHT", "通用斗牛"),
	JXKLOX(501,"JXKLOX","江西快乐牛牛"),
	CPDZHUI(502,"CPDZHUI","四川长牌打追"),
	CPDZHUA(503,"CPDZHUA","四川长牌打抓"),
	CPDSHISI(504,"CPDSHISI","四川长牌斗十四"),
	SHIDIANBAN(505,"SHIDIANBAN","十点半"),
	HBDAZP(506,"HBDAZP","湖北大冶字牌"),
	HHUAOX(507,"HHUAOX","怀化牛牛"),
	LLDAQI(508,"LLDAQI","吕梁打七"),
	PSHOX(509,"PSHOX","拼十"),
	XPBH(510,"XPBH","溆浦博胡"),
	DTPHZ(511,"DTPHZ","洞庭跑胡子"),
	MJ_YI_YANG_QIN_YOU(512,"MJ_YI_YANG_QIN_YOU","益阳麻将亲友版"),
	SHANG_RAO_DA_ZHA(513,"SHANG_RAO_DA_ZHA","上饶打炸"),
	MJ_HUAI_HUA(514,"MJ_HUAI_HUA","怀化麻将"),
	MJ_PJ_ZHA_NIAO(515,"MJ_PJ_ZHA_NIAO","平江扎鸟"),
	MJ_XIANG_NING(516,"MJ_XIANG_NING","山西乡宁摔金"),
	MJ_NING_XIANG(517,"MJ_NING_XIANG","宁乡麻将"),
	MJ_YUEYANG_HZ(518,"MJ_YUEYANG_HZ","岳阳红中"),
	MJ_SHAOYANG_HZ(519,"MJ_SHAOYANG_HZ","邵阳3D红中飞"),
	MJ_PINGXIANG_ZZ(520,"MJ_PINGXIANG_ZZ","萍乡转转"),
	MJ_HAI_NAN(521,"MJ_HAI_NAN","海南麻将"),
	WSK_PC_ZD(522,"WSK_PC_ZD","浦城炸弹"),
	WSK_SX_TH(523,"WSK_SX_TH","松溪同花"),
	MJ_SXKDD(524,"MJ_SXKDD","山西扣点点"),
	MJ_PU_CHENG(525,"MJ_PU_CHENG","蒲城麻将"),
	CP_CHQ_YDR(526,"CP_CHQ_YDR","重庆幺地人"),
	PHZ_MS_EQS(527,"PHZ_MS_EQS","眉山二七十"),
	PHZ_YJ_EQS(528,"PHZ_YJ_EQS","荥经二七十"),
	MJ_PING_XIANG(529,"MJ_PING_XIANG","萍乡麻将"),
	MJ_QUAN_ZHOU(530,"MJ_QUAN_ZHOU","泉州麻将"),
	MS_DSS(531,"MS_DSS","眉山斗十四"),
	MJ_JIUJIANG_HZ(532,"MJ_JIUJIANG_HZ","九江红中"),
	MJ_JX_DUCHANG_ZB(533,"MJ_JX_DUCHANG_ZB","江西都昌栽宝"),
	PHZ_QD_LHQ(534,"PHZ_QD_LHQ","祁东六胡抢"),
	MJ_NANCHANG(535,"MJ_NANCHANG","南昌麻将"),
	PHZ_SY_DE(536,"PHZ_SY_DE","绥阳大贰"),
	MJ_HEYUAN_JD(537,"MJ_HEYUAN_JD","河源鸡搭麻将"),
	GZH_BZP(538,"GZH_BZP","贵州板子炮"),
	WSK_NCST(539,"WSK_NCST","南昌四团"),
	MJ_TDH_3D(540, "MJ_TDH_3D","推倒胡3D"),
	MJ_XIANG_YUAN(541, "MJ_XIANG_YUAN","山西襄垣麻将"),
	MJ_HN_HUAZHOU(542, "MJ_HN_HUAZHOU", "河南滑州麻将"),
	MJ_MY_GY(543,"MJ_MY_GY","麻友贵阳捉鸡"),
	MJ_YZ(544,"MJ_YZ","永州麻将"),
	SJ_YZ(545,"SJ_YZ","永州240"),
	CS_QY(546,"CS_QY","亲友长沙麻将"),
	YXZD(547,"YX_ZD","永兴炸弹"),
	MJ_GY_3(548,"MJ_GY_3","贵阳捉鸡3"),
	WSK_XTXZ(549,"WSK_XTXZ","湘潭消造"),
	TXW(550,"TXW","踢小五"),
	MJ_HLKDD(551,"MJ_HLKDD","欢乐扣点点"),
	DDZ_DL(552,"DDZ_DL","大连斗地主"),
	PDK_DL(553,"PDK_DL","大连跑得快"),
	MJ_ZHUZHOU_WANG(554, "MJ_ZHUZHOU_WANG", "株洲王麻将"),
	WSK_ZZSHA(555, "WSK_ZZSHA", "株洲双红A"),
	MJ_TR_GYZJ(556,"MJ_TR_GYZJ","铜仁贵阳捉鸡"),
	ZD_NCGZ(557,"ZD_NCGZ","南昌过炸"),
	PDK_HN(558,"PDK_HN","河南跑得快"),
	MJ_ZPTDH(559,"MJ_ZPTDH","做牌推倒胡"),
	MJ_LX_QY_CS(560,"MJ_LX_QY_CS","临湘亲友长沙"),
	PHZ_YL_HH(561,"PHZ_YL_HH","沅陵跑胡子"),
	NC_EQW(562,"NC_EQW","南昌二七王"),
	DCTS(563,"DCTS","都昌讨赏"),
	YJQF(564,"YJQF","沅江千分"),
	MJ_YAAN(565,"MJ_YAAN","雅安麻将"),
	MJ_GY_ZJ_NEW_3D(566,"MJ_GY_ZJ_NEW_3D","3D版微乐贵阳捉鸡"),
	MJ_ZH_QIANG_HU(567,"MJ_ZH_QIANG_HU","庄河穷胡"),
	MJ_AS(568,"MJ_AS","安顺麻将"),
	PDK_ZZ(569,"PDK_ZZ","漳州跑得快"),
	MJ_NINGXIANG_KAI_WANG(570, "MJ_NINGXIANG_KAI_WANG", "宁乡开王麻将"),
	MJ_XING_TAI(571, "MJ_XING_TAI", "邢台麻将"),
	MJ_ZHANG_ZHOU(572, "MJ_ZHANG_ZHOU", "漳州麻将"),
	MJ_SY(573,"MJ_SY","绥阳麻将"),
	MJ_DLTDH(574,"MJ_DLTDH","大连推倒胡"),
	WSK_HRDZD(575,"WSK_HRDZD","华容打炸弹"),
	LD_SDH(576,"LD_SDH","娄底三打哈"),
	XP_BF(577,"XP_BF","溆浦包分"),
	WSK_HCNG(578,"WSK_HCNG","河池牛鬼"),
	MJ_NEW_3D_KWX(579,"MJ_NEW_3D_KWX","新3D卡五星"),
	WSK_YU_GAN(580,"WSK_YU_GAN","余干五十K"),
	MJ_LF(581,"MJ_LF","两房麻将"),
	MJ_JXTDH(582,"MJ_JXTDH","江西推倒胡"),
	MJ_JXYGFB(583,"MJ_JXYGFB","余干飞宝"),
	NCWL(584,"NCWL","南昌窝龙"),
	ZD_FCGZ(585,"ZD_FCGZ","丰城过炸"),
	PHZ_XINHUZ(586,"PHZ_XINHUZ","新化跑胡子"),
	YGGP(587,"YGGP","余干关牌"),
	MJ_ZHANG_PU(588, "MJ_ZHANG_PU", "漳浦麻将"),
	MJ_TC_NEW(589,"MJ_TC_NEW","通城麻将"),
	MJ_THGJ(590,"MJ_THGJ","泰和滚精"),
	PDK_JZ(591,"PDK_JZ","荆州跑得快"),
	MJ_FC(592,"MJ_FC","丰城麻将"),
	MJ_ZJ(593,"MJ_ZJ","织金麻将"),
	MJ_YGJZ(594,"MJ_YGJZ","余干夹子麻将"),
	WSK_FCSJ(595,"WSK_FCSJ","丰城双剑"),
	ZD_THGZ(596,"ZD_THGZ","泰和过炸"),
	MJ_FCHZ(597,"MJ_FCHZ","丰城红中"),
	PDK_CD(598,"PDK_CD","常德跑得快"),
	MJ_GXZZ(599,"MJ_GXZZ","桂林转转"),
	MJ_NEW_XIAN_NING(600,"MJ_NEW_XIAN_NING","新咸宁麻将"),
	WSK_XYSK(601,"WSK_XYSK","闲逸双扣"),
	MJ_SHUN_PING(602,"MJ_SHUN_PING","顺平麻将"),
	;
	private int id;
	
	private String idstr;
	
	private String name;
	
	
	EGameType(int id,String idstr,String name){
		this.id = id;
		this.idstr = idstr;
		this.name = name;
	}
	
	private final static Map<Integer,EGameType> map = new HashMap<Integer,EGameType>();
	
	public static final Logger logger = LoggerFactory.getLogger(EGameType.class);
	
	static {
		for (EGameType c : EGameType.values()){
			EGameType type = map.get(c.getId());
			if(type!=null) {
				logger.error("###########################EGameType定义了相同类型#########################{}",type.getId());
				System.exit(-1);
			}
			map.put(c.getId(), c);
		}
	}
	
	public static EGameType getEGameType(int id)
	{
		return map.get(id);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIdstr() {
		return idstr;
	}


	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
	//麻将小类型
	public static String getMJname(int v2) {
		if(v2==0) {
			return "转转";
		}else if(v2==1) {
			return "长沙";
		}else if(v2==2) {
			return "红中";
		}else if(v2==3) {
			return "双鬼";
		}else if(v2==4) {
			return "株洲";
		}else if(v2==2001) {
			return "晃晃";
		}else if(v2==3001) {
			return "安阳";
		}else if(v2==3002) {
			return "林州";
		}else if(v2==3003) {
			return "河南";
		}else if(v2==3004) {
			return "河南红中";
		}else if(v2==4001) {
			return "双鬼";
		}else if(v2==5001) {
			return "福禄寿";
		}else if(v2==5002) {
			return "福禄寿20张";
		}else if(v2==8001) {
			return "红黑胡";
		}else if(v2==8002) {
			return "攸县跑胡子";
		}
		return v2+"";
	}
	
}
