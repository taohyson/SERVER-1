/**
 * 
 */
package com.cai.common.define;

/**
 * @author xwy
 *
 *1：天胡【滚滚胡不算】：
2：杠上花：
3：满天飞：
4：碰碰胡：
5:  海底捞月：
6：起手单招：
7：起手双招：
8：门清自摸：
 */
public enum ECardType {
	// =======玩家的============
	anLong("anlong","起手暗龙"),
	hongZhong4("hongZhong4","四个红中"),
	haidi("haidi","海底捞月"),
	qixiaodui("qixiaodui","七小对"),
	shidui("shidui","10对"),
	hong("hong","红原"),
	hei("hei","黑原"),
	ku("ku","枯胡"),
	zhong("zhong","重胡"),
	tai("tai","台胡"),
	ka("ka","卡胡"),
	qing("qing","清胡"),
	tianhu("tianhu","天胡"),
	mantianfei("mantianfei","满天飞"),
	pengpenghu("pengpenghu","碰碰胡"),
	anLong2("anLong2","起手2暗龙"),
	zimomq("zimomq","门青自摸"),
	gangshanghua("gangshanghua","福禄寿杠上花"),
	
	
	//河南麻将
	sihun("sihun","河南四混"),
	henangang("henangang","河南抢杠胡"),
	henanqidui("henanqidui","河南七对"),
	henanqiduihaohua("henanqiduihaohua","河南豪华七对"),
	henankaihua("henankaihua","河南杠开"),
	henan4hong("henan4hong","河南4红中"),
	
	
	
	//湖北麻将
	heimo("heimo","黑摸"),
	ruanmo("ruanmo","软摸"),
	zhuotong("zhuotong","捉铳"),
	rechong("rechong","热冲"),
	
	//湖南麻将
	mjgangshanghua("mjgangshanghua","麻将杠上花"),
	smjgangshanghua("smjgangshanghua","麻将双杠上花"),
	mjgangshangpao("mjgangshangpao","麻将杠上炮"),
	smjgangshangpao("smjgangshangpao","麻将双杠上炮"),
	qiangganghu("qiangganghu","抢杠胡"),
	qidui("qidui","七对"),
	haohuaqidui("haohuaqidui","豪华七对"),
	shaohuaqidui("shaohuaqidui","双豪华七对"),
	qishouhu("qishouhu","起手胡"),
	hongzhong4("hongzhong4","4红中"),
	mjpph("mjpph","麻将碰碰胡"),
	jjh("jjh","将将胡"),
	qingyise("qingyise","清一色胡"),
	cshaidilao("cshaidilao","长沙海底捞"),
	cshaidipao("cshaidipao","长沙海底炮"),
	quanqiuren("quanqiuren","全球人"),
	liuliushun("liuliushun","六六顺"),
	
	// 广西
	gxduiduihu("gxduiduihu","对对胡"),
	gxqingyise("gxqingyise","清一色"),
	gxxiaoqidui("gxxiaoqidui","小七对"),
	gxqiangganghu("gxqiangganghu","抢杠胡"),
	gxgangshanghua("gxgangshanghua","杠上开花"),
	gxgangshangpao("gxgangshangpao","杠上炮"),
	gxquanqiuren("gxquanqiuren","全求人"),
	gxmenqing("gxmenqing","门清"),
	
	//红黑胡
	hhtianhu("tianhu","天胡"),
	hhdihu("dihu","地胡"),
	hhyidianhong("yidianhong","一点红"),
	hhhonghu("honghu","红胡"),
	hhhongfantian("hongfantian","红翻天"),
	hhallhei("allhei","全黑"),
	hhhaihu("haihu","海胡"),
	hhtinghu("tinghu","听胡"),
	hhdahu("dahu","大胡"),
	hhxiaohu("xiaohu","小胡"),
	hhduizihu("duizihu","对子胡"),
	hhshuahou("shuahou","耍猴"),
	hhhuangfan("huangfan","黄番"),
	hhtuanyuan("tuanyuan","团圆"),
	hhhanghangxi("hanghangxi","行行息"),
	hhmaohu("hhmaohu", "毛胡"),
	hhqishouhu("hhqishouhu", "起手胡"),
	hhwuhu("hhwuhu", "无胡"),
	hhxiaokahu("hhxiaokahu", "小卡胡"),
	hhdakahu("hhdakahu", "大卡胡"),
	hhhaidihu("hhhaidihu", "海底胡"),
	hhwangdiao("hhwangdiao", "王钓"),
	hhwangdiaowang("hhwangdiaowang", "王钓王"),
	hhwangchuang("hhwangchuang", "王闯"),
	hhallhong("hhallhong", "全红"),
	
	//牛牛
	oxwuxiaoox("wuxiaoox","五小牛"),
	oxwuhuaox("wuhuaox","五花牛"),
	oxboomox("boomox","炸弹牛"),
	
	//21点
	hjkaa("aa","AA"),
	hjkhjk("","HJK"),
	hjk777("777","777"),
	hjkwuxiaolong("wuxiaolong","五小龙"),
	
	// 湖南湘潭麻将
	xt_qishouhu("xt_qishouhu", "起手胡"),
	xt_menqing("xt_menqing", "门清"),
	xt_pengpenghu("xt_pengpenghu", "碰碰胡"),
	xt_qingyise("xt_qingyise", "清一色"),
	xt_qixiaodui("xt_qixiaodui", "七小对"),
	xt_gangshanghua("xt_gangshanghua", "杠上开花"),
	xt_qiangganghu("xt_qiangganghu", "抢杠胡"),
	xt_qishou_sihun("xt_qishou_sihun", "起手4个一样的混"),
	
	
	// 山西
	sx_qiangganghu("sx_qiangganghu", "抢杠胡"),
	sx_qingyise("sx_qingyise", "清一色"),
	sx_yitiaolong("sx_yitiaolong", "一条龙"),
	sx_qysytl("sx_qysytl", "清一色一条龙"),
	sx_qixiaodui("sx_qixiaodui", "七小对"),
	sx_haohuaqixiaodui("sx_haohuaqixiaodui", "豪华七小对"),
	sx_shisanyao("sx_shisanyao", "十三幺"),
	sx_fenghu("sxjy_fenghu", "风胡"),
	
	// 永州扯胡子
	// 两个王
	yz_two_wang_diao_wang("yz_two_wang_diao_wang", "两个王-王钓王"),
	yz_two_yi_dian_zhu_wang_diao_wang("yz_two_yi_dian_zhu_wang_diao_wang", "两个王-一点朱王钓王"),
	yz_two_hong_hu_wang_diao_wang("yz_two_hong_hu_wang_diao_wang", "两个王-红胡王钓王"),
	yz_two_hei_hu_wang_diao_wang("yz_two_hei_hu_wang_diao_wang", "两个王-黑胡王钓王"),
	yz_two_hong_zhuan_dian_wang_diao_wang("yz_two_hong_zhuan_dian_wang_diao_wang", "两个王-红转点王钓王"),
	yz_two_hong_zhuan_hei_wang_diao_wang("yz_two_hong_zhuan_hei_wang_diao_wang", "两个王-红转黑王钓王"),
	// 三个王
	yz_three_wang_chuang_wang("yz_three_wang_chuang_wang", "三个王-王闯王"),
	yz_three_yi_dian_zhu_wang_chuang_wang("yz_three_yi_dian_zhu_wang_chuang_wang", "三个王-一点朱王闯王"),
	yz_three_hong_hu_wang_chuang_wang("yz_three_hong_hu_wang_chuang_wang", "三个王-红胡王闯王"),
	yz_three_hei_hu_wang_chuang_wang("yz_three_hei_hu_wang_chuang_wang", "三个王-黑胡王闯王"),
	yz_three_hong_zhuang_dian_wang_chuang_wang("yz_three_hong_zhuang_dian_wang_chuang_wang", "三个王-红转点王闯王"),
	yz_three_hong_zhuang_hei_wang_chuang_wang("yz_three_hong_zhuang_hei_wang_chuang_wang", "三个王-红转黑王闯王"),
	// 四个王
	yz_four_wang_zha_wang("yz_four_wang_zha_wang", "四个王-王炸王"),
	yz_four_yi_dian_zhu_wang_zha_wang("yz_four_yi_dian_zhu_wang_zha_wang", "四个王-一点朱王炸王"),
	yz_four_hong_hu_wang_zha_wang("yz_four_hong_hu_wang_zha_wang", "四个王-红胡王炸王"),
	yz_four_hei_hu_wang_zha_wang("yz_four_hei_hu_wang_zha_wang", "四个王-黑胡王炸王"),
	yz_four_hong_zhuan_dian_wang_zha_wang("yz_four_hong_zhuan_dian_wang_zha_wang", "四个王-红转点王炸王"),
	yz_four_hong_zhuan_hei_wang_zha_wang("yz_four_hong_zhuan_hei_wang_zha_wang", "四个王-红转黑王炸王"),
	;

	private String id;

	private String desc;

	ECardType(String id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public static ECardType ECardType(String id) {
		for (ECardType c : ECardType.values()) {
			if (c.id == id)
				return c;
		}
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
