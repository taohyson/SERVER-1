package com.cai.common.domain;

import com.cai.common.constant.GameConstants;
import com.cai.common.domain.mj.DingQueInfo;

public class PlayerResult {
	public long create_player_id;
	public long create_time;
	public int room_id; // id
	public int game_type_index; // 类型 0转转 1长沙
	public int game_rule_index; // w玩法
	public String game_rule_des; // 玩法描述
	public int game_round; // 游戏局数
	
	public float game_score[]; // 游戏分数
	public float coin_score[]; // 金币分数-----用于金币场，不能改动乱用！！
	public int lost_fan_shu[][]; // 番数
	public int win_order[];
	public int[] win_num;
	public int[] lose_num;

	public int zi_mo_count[];
	public int jie_pao_count[];
	public int dian_pao_count[];
	public int an_gang_count[];
	public int ming_gang_count[];
	public int zhi_gang_count[]; // 直杠数量

	public int da_hu_zi_mo[];
	public int da_hu_jie_pao[];
	public int da_hu_dian_pao[];
	public int xiao_hu_zi_mo[];
	public int xiao_hu_jie_pao[];
	public int xiao_hu_dian_pao[];

	public int piao_lai_count[];

	public int pao[];
	public int qiang[];
	public int shaizi[][];
	public int nao[];
	public int biaoyan[];
	public int duanmen[]; // 断门
	public int ziba[]; // 自拔

	public int men_qing[];
	public int gun_gun[];
	public int peng_peng_hu[];
	public int gang_shang_hua[];
	public int hai_di[];

	public int hu_pai_count[];
	public int ming_tang_count[];
	public int ying_xi_count[];
	public int liu_zi_fen[];
	public int hjk_wu_xiao_long[];
	public int hjk_aa[];
	public int hjk_seven[];
	public int hjk_hjk[];

	public byte hei[];
	public byte hong[];
	public byte ku[];
	public byte ka[];
	public byte qing[];
	public byte shidui[];
	public byte tai[];

	public byte haspiao[];

	public int[] ming_ci_ci_shu;
	public int[] an_ci_ci_shu;
	public int[] pi_ci_ci_shu;
	public int[] zi_mo_ci_shu;
	public int[] bao_ci_ci_shu;

	public int[] cha_da_jiao; // 查大叫:断勾卡麻将

	public int[] chun_tian;// 0没有 1：春天 2：反春
	public int[] data_extra;// 额外数据
	public DingQueInfo dingQueInfo;  //定缺信息

	public PlayerResult() {

	}

	public PlayerResult(long create_player_id, int room_id, int game_type_index, int game_rule_index, int game_round,
			String game_rule_des, int gamecount) {
		this.create_player_id = create_player_id;
		this.room_id = room_id;
		this.game_type_index = game_type_index;
		this.game_rule_index = game_rule_index;
		this.game_round = game_round;
		this.game_rule_des = game_rule_des;

		create_time = System.currentTimeMillis() / 1000;

		game_score = new float[gamecount];
		coin_score = new float[gamecount];
		for (int i = 0; i < game_score.length; i++) {
			game_score[i] = 0.0f;
			coin_score[i] = 0.0f;
		}
		lost_fan_shu = new int[gamecount][gamecount];
		win_order = new int[gamecount];
		win_num = new int[gamecount];
		lose_num = new int[gamecount];

		zi_mo_count = new int[gamecount];
		jie_pao_count = new int[gamecount];
		dian_pao_count = new int[gamecount];
		an_gang_count = new int[gamecount];
		ming_gang_count = new int[gamecount];
		zhi_gang_count = new int[gamecount];

		da_hu_zi_mo = new int[gamecount];
		da_hu_jie_pao = new int[gamecount];
		da_hu_dian_pao = new int[gamecount];
		xiao_hu_zi_mo = new int[gamecount];
		xiao_hu_jie_pao = new int[gamecount];
		xiao_hu_dian_pao = new int[gamecount];
		dingQueInfo = new DingQueInfo(false, gamecount);
		piao_lai_count = new int[gamecount];

		pao = new int[gamecount];
		qiang = new int[gamecount];
		shaizi = new int[gamecount][2];
		nao = new int[gamecount];
		biaoyan = new int[gamecount];
		duanmen = new int[gamecount]; // 断门
		ziba = new int[gamecount]; // 自拔
		chun_tian = new int[gamecount];
		data_extra = new int[gamecount];

		men_qing = new int[gamecount];
		gun_gun = new int[gamecount];
		peng_peng_hu = new int[gamecount];
		gang_shang_hua = new int[gamecount];
		hai_di = new int[gamecount];

		for (int i = 0; i < gamecount; i++) {
			piao_lai_count[i] = 0;

			// shaizi[i] = -1;
			pao[i] = -1;
			qiang[i] = -1;
			nao[i] = -1;
			chun_tian[i] = 0;
		}
		hu_pai_count = new int[gamecount];
		ming_tang_count = new int[gamecount];
		ying_xi_count = new int[gamecount];
		liu_zi_fen = new int[gamecount];
		hjk_wu_xiao_long = new int[gamecount];
		hjk_aa = new int[gamecount];
		hjk_seven = new int[gamecount];
		hjk_hjk = new int[gamecount];
		hei = new byte[gamecount];
		hong = new byte[gamecount];
		ku = new byte[gamecount];
		ka = new byte[gamecount];
		qing = new byte[gamecount];
		shidui = new byte[gamecount];
		tai = new byte[gamecount];

		haspiao = new byte[gamecount];

		ming_ci_ci_shu = new int[gamecount];
		an_ci_ci_shu = new int[gamecount];
		pi_ci_ci_shu = new int[gamecount];
		zi_mo_ci_shu = new int[gamecount];
		bao_ci_ci_shu = new int[gamecount];
		cha_da_jiao = new int[gamecount];

	}

	public PlayerResult(long create_player_id, int room_id, int game_type_index, int game_rule_index, int game_round,
			String game_rule_des) {
		this.create_player_id = create_player_id;
		this.room_id = room_id;
		this.game_type_index = game_type_index;
		this.game_rule_index = game_rule_index;
		this.game_round = game_round;
		this.game_rule_des = game_rule_des;

		create_time = System.currentTimeMillis() / 1000;

		game_score = new float[GameConstants.GAME_PLAYER];
		coin_score = new float[GameConstants.GAME_PLAYER];
		lost_fan_shu = new int[GameConstants.GAME_PLAYER][GameConstants.GAME_PLAYER];
		win_order = new int[GameConstants.GAME_PLAYER];
		win_num = new int[GameConstants.GAME_PLAYER];
		lose_num = new int[GameConstants.GAME_PLAYER];

		zi_mo_count = new int[GameConstants.GAME_PLAYER];
		jie_pao_count = new int[GameConstants.GAME_PLAYER];
		dian_pao_count = new int[GameConstants.GAME_PLAYER];
		an_gang_count = new int[GameConstants.GAME_PLAYER];
		ming_gang_count = new int[GameConstants.GAME_PLAYER];
		zhi_gang_count = new int[GameConstants.GAME_PLAYER];
		dingQueInfo = new DingQueInfo(false, GameConstants.GAME_PLAYER);
		da_hu_zi_mo = new int[GameConstants.GAME_PLAYER];
		da_hu_jie_pao = new int[GameConstants.GAME_PLAYER];
		da_hu_dian_pao = new int[GameConstants.GAME_PLAYER];
		xiao_hu_zi_mo = new int[GameConstants.GAME_PLAYER];
		xiao_hu_jie_pao = new int[GameConstants.GAME_PLAYER];
		xiao_hu_dian_pao = new int[GameConstants.GAME_PLAYER];

		piao_lai_count = new int[GameConstants.GAME_PLAYER];

		pao = new int[GameConstants.GAME_PLAYER];
		qiang = new int[GameConstants.GAME_PLAYER];
		shaizi = new int[GameConstants.GAME_PLAYER][2];
		men_qing = new int[GameConstants.GAME_PLAYER];
		gun_gun = new int[GameConstants.GAME_PLAYER];
		peng_peng_hu = new int[GameConstants.GAME_PLAYER];
		gang_shang_hua = new int[GameConstants.GAME_PLAYER];
		hai_di = new int[GameConstants.GAME_PLAYER];
		nao = new int[GameConstants.GAME_PLAYER];
		biaoyan = new int[GameConstants.GAME_PLAYER];
		duanmen = new int[GameConstants.GAME_PLAYER]; // 断门
		ziba = new int[GameConstants.GAME_PLAYER]; // 自拔
		chun_tian = new int[GameConstants.GAME_PLAYER];
		data_extra = new int[GameConstants.GAME_PLAYER];

		for (int i = 0; i < GameConstants.GAME_PLAYER; i++) {
			piao_lai_count[i] = 0;

			pao[i] = -1;
			qiang[i] = -1;
			chun_tian[i] = 0;
		}
		hu_pai_count = new int[GameConstants.GAME_PLAYER];
		ming_tang_count = new int[GameConstants.GAME_PLAYER];
		ying_xi_count = new int[GameConstants.GAME_PLAYER];
		liu_zi_fen = new int[GameConstants.GAME_PLAYER];
		hei = new byte[GameConstants.GAME_PLAYER];
		hong = new byte[GameConstants.GAME_PLAYER];
		ku = new byte[GameConstants.GAME_PLAYER];
		ka = new byte[GameConstants.GAME_PLAYER];
		qing = new byte[GameConstants.GAME_PLAYER];
		shidui = new byte[GameConstants.GAME_PLAYER];
		tai = new byte[GameConstants.GAME_PLAYER];

		haspiao = new byte[GameConstants.GAME_PLAYER];

		ming_ci_ci_shu = new int[GameConstants.GAME_PLAYER];
		an_ci_ci_shu = new int[GameConstants.GAME_PLAYER];
		pi_ci_ci_shu = new int[GameConstants.GAME_PLAYER];
		zi_mo_ci_shu = new int[GameConstants.GAME_PLAYER];
		bao_ci_ci_shu = new int[GameConstants.GAME_PLAYER];
		cha_da_jiao = new int[GameConstants.GAME_PLAYER];
	}

	public int[] getZi_mo_count() {
		return zi_mo_count;
	}

	public void setZi_mo_count(int[] zi_mo_count) {
		this.zi_mo_count = zi_mo_count;
	}

	public int[] getJie_pao_count() {
		return jie_pao_count;
	}

	public void setJie_pao_count(int[] jie_pao_count) {
		this.jie_pao_count = jie_pao_count;
	}

	public int[] getDian_pao_count() {
		return dian_pao_count;
	}

	public void setDian_pao_count(int[] dian_pao_count) {
		this.dian_pao_count = dian_pao_count;
	}

	public int[] getAn_gang_count() {
		return an_gang_count;
	}

	public void setAn_gang_count(int[] an_gang_count) {
		this.an_gang_count = an_gang_count;
	}

	public int[] getMing_gang_count() {
		return ming_gang_count;
	}

	public void setMing_gang_count(int[] ming_gang_count) {
		this.ming_gang_count = ming_gang_count;
	}

	public float[] getGame_score() {
		return game_score;
	}

	public void setGame_score(float[] game_score) {
		this.game_score = game_score;
	}

	public int[][] getLost_fan_shu() {
		return lost_fan_shu;
	}

	public void setLost_fan_shu(int[][] lost_fan_shu) {
		this.lost_fan_shu = lost_fan_shu;
	}

	public int[] getWin_order() {
		return win_order;
	}

	public void setWin_order(int[] win_order) {
		this.win_order = win_order;
	}

	public long getCreate_player_id() {
		return create_player_id;
	}

	public void setCreate_player_id(long create_player_id) {
		this.create_player_id = create_player_id;
	}

	public long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public int getGame_rule_index() {
		return game_rule_index;
	}

	public void setGame_rule_index(int game_rule_index) {
		this.game_rule_index = game_rule_index;
	}

	public String getGame_rule_des() {
		return game_rule_des;
	}

	public void setGame_rule_des(String game_rule_des) {
		this.game_rule_des = game_rule_des;
	}

	public int getGame_round() {
		return game_round;
	}

	public void setGame_round(int game_round) {
		this.game_round = game_round;
	}

	public int[] getDa_hu_zi_mo() {
		return da_hu_zi_mo;
	}

	public void setDa_hu_zi_mo(int[] da_hu_zi_mo) {
		this.da_hu_zi_mo = da_hu_zi_mo;
	}

	public int[] getDa_hu_jie_pao() {
		return da_hu_jie_pao;
	}

	public void setDa_hu_jie_pao(int[] da_hu_jie_pao) {
		this.da_hu_jie_pao = da_hu_jie_pao;
	}

	public int[] getDa_hu_dian_pao() {
		return da_hu_dian_pao;
	}

	public void setDa_hu_dian_pao(int[] da_hu_dian_pao) {
		this.da_hu_dian_pao = da_hu_dian_pao;
	}

	public int[] getXiao_hu_zi_mo() {
		return xiao_hu_zi_mo;
	}

	public void setXiao_hu_zi_mo(int[] xiao_hu_zi_mo) {
		this.xiao_hu_zi_mo = xiao_hu_zi_mo;
	}

	public int[] getXiao_hu_jie_pao() {
		return xiao_hu_jie_pao;
	}

	public void setXiao_hu_jie_pao(int[] xiao_hu_jie_pao) {
		this.xiao_hu_jie_pao = xiao_hu_jie_pao;
	}

	public int[] getXiao_hu_dian_pao() {
		return xiao_hu_dian_pao;
	}

	public void setXiao_hu_dian_pao(int[] xiao_hu_dian_pao) {
		this.xiao_hu_dian_pao = xiao_hu_dian_pao;
	}

	public int[] getHu_pai_count() {
		return hu_pai_count;
	}

	public void setHu_pai_count(int[] hu_pai_count) {
		this.hu_pai_count = hu_pai_count;
	}

	public int[] getMing_tang_count() {
		return ming_tang_count;
	}

	public void setMing_tang_count(int[] ming_tang_count) {
		this.ming_tang_count = ming_tang_count;
	}

	public int[] getYing_xi_count() {
		return ying_xi_count;
	}

	public void setYing_xi_count(int[] ying_xi_count) {
		this.ying_xi_count = ying_xi_count;
	}

	public int[] getLi_zi_fen() {
		return ying_xi_count;
	}

	public void setLi_zi_fen(int[] li_zi_fen) {
		this.liu_zi_fen = li_zi_fen;
	}

	public int[] getWu_xiao_long() {
		return hjk_wu_xiao_long;
	}

	public void setWu_xiao_long(int[] hjk_wu_xiao_long) {
		this.hjk_wu_xiao_long = hjk_wu_xiao_long;
	}

	public int[] getHjk_aa() {
		return this.hjk_aa;
	}

	public void setHjk_aa(int[] hjk_aa) {
		this.hjk_aa = hjk_aa;
	}

	public int[] getHjk_seven(int[] hjk_seven) {
		return this.hjk_seven;
	}

	public void setHjk_seven(int[] hjk_seven) {
		this.hjk_seven = hjk_seven;
	}

	public int[] getHjk_hjk() {
		return this.hjk_hjk;
	}

	public void setHjk_hjk(int[] hjk_hjk) {
		this.hjk_hjk = hjk_hjk;
	}

	public int[] getWin_num() {
		return win_num;
	}

	public void setWin_num(int[] win_num) {
		this.win_num = win_num;
	}

	public int[] getLose_num() {
		return lose_num;
	}

	public void setLose_num(int[] lose_num) {
		this.lose_num = lose_num;
	}

	/**
	 * 幺筒断勾卡麻将用此字段处理报胡：是否报胡
	 * 
	 * @param seat_index
	 * @return
	 */
	public boolean is_bao_hu(int seat_index) {
		return qiang[seat_index] > 0;
	}

	/**
	 * 幺筒断勾卡麻将用此字段处理请胡：是否请胡
	 * 
	 * @param seat_index
	 * @return
	 */
	public boolean is_qing_hu(int seat_index) {
		return nao[seat_index] > 0;
	}

	public void qing_hu_valid(int seat_index) {
		nao[seat_index] = 1;
	}

	public void bao_hu_valid(int seat_index) {
		qiang[seat_index] = 1;
	}

	public int getCardType(int seat_index) {
		if (chun_tian == null) {
			return 0;
		}
		int len = chun_tian.length;
		if (seat_index < 0 || seat_index >= len) {
			return 0;
		}
		return chun_tian[seat_index];
	}

	public void changIndexMJ(int startIndex[],int gameConunt) {
		float game_score_temp[] = new float[gameConunt]; // 游戏分数
		int lost_fan_shu_temp[][] = new int[gameConunt][gameConunt]; // 番数
		int win_order_temp[] = new int[gameConunt];
		int[] win_num_temp = new int[gameConunt];
		int[] lose_num_temp = new int[gameConunt];
		int zi_mo_count_temp[] = new int[gameConunt];
		int jie_pao_count_temp[] = new int[gameConunt];
		int dian_pao_count_temp[] = new int[gameConunt];
		int an_gang_count_temp[] = new int[gameConunt];
		int ming_gang_count_temp[] = new int[gameConunt];
		int zhi_gang_count_temp[] = new int[gameConunt]; // 直杠数量
		int da_hu_zi_mo_temp[] = new int[gameConunt];
		int da_hu_jie_pao_temp[] = new int[gameConunt];
		int da_hu_dian_pao_temp[] = new int[gameConunt];
		int xiao_hu_zi_mo_temp[] = new int[gameConunt];
		int xiao_hu_jie_pao_temp[] = new int[gameConunt];
		int xiao_hu_dian_pao_temp[] = new int[gameConunt];
		int piao_lai_count_temp[] = new int[gameConunt];
		int pao_temp[] = new int[gameConunt];
		int qiang_temp[] = new int[gameConunt];
		int shaizi_temp[][] = new int[gameConunt][2];
		int nao_temp[] = new int[gameConunt];
		int biaoyan_temp[] = new int[gameConunt];
		int duanmen_temp[] = new int[gameConunt]; // 断门
		int ziba_temp[] = new int[gameConunt]; // 自拔
		int men_qing_temp[] = new int[gameConunt];
		int gun_gun_temp[] = new int[gameConunt];
		int peng_peng_hu_temp[] = new int[gameConunt];
		int gang_shang_hua_temp[] = new int[gameConunt];
		int hai_di_temp[] = new int[gameConunt];
		int hu_pai_count_temp[] = new int[gameConunt];
		int ming_tang_count_temp[] = new int[gameConunt];
		int ying_xi_count_temp[] = new int[gameConunt];
		int liu_zi_fen_temp[] = new int[gameConunt];
		byte hei_temp[] = new byte[gameConunt];
		byte hong_temp[] = new byte[gameConunt];
		byte ku_temp[] = new byte[gameConunt];
		byte ka_temp[] = new byte[gameConunt];
		byte qing_temp[] = new byte[gameConunt];
		byte shidui_temp[] = new byte[gameConunt];
		byte tai_temp[] = new byte[gameConunt];
		byte haspiao_temp[] = new byte[gameConunt];
		int[] ming_ci_ci_shu_temp = new int[gameConunt];
		int[] an_ci_ci_shu_temp = new int[gameConunt];
		int[] pi_ci_ci_shu_temp = new int[gameConunt];
		int[] zi_mo_ci_shu_temp = new int[gameConunt];
		int[] bao_ci_ci_shu_temp = new int[gameConunt];

		int[] cha_da_jiao_temp = new int[gameConunt]; // 查大叫:断勾卡麻将

		int[] chun_tian_temp = new int[gameConunt];// 0没有 1：春天
																	// 2：反春
		int[] data_extra_temp = new int[gameConunt];// 额外数据

		for (int i = 0; i < gameConunt; i++) {
			int index = startIndex[i];

			game_score_temp[i] = game_score[index]; // 游戏分数
			lost_fan_shu_temp[i] = lost_fan_shu[index]; // 番数
			win_order_temp[i] = win_order[index];
			win_num_temp[i] = win_num[index];
			lose_num_temp[i] = lose_num[index];
			zi_mo_count_temp[i] = zi_mo_count[index];
			jie_pao_count_temp[i] = jie_pao_count[index];
			dian_pao_count_temp[i] = dian_pao_count[index];
			an_gang_count_temp[i] = an_gang_count[index];
			ming_gang_count_temp[i] = ming_gang_count[index];
			zhi_gang_count_temp[i] = zhi_gang_count[index]; // 直杠数量
			da_hu_zi_mo_temp[i] = da_hu_zi_mo[index];
			da_hu_jie_pao_temp[i] = da_hu_jie_pao[index];
			da_hu_dian_pao_temp[i] = da_hu_dian_pao[index];
			xiao_hu_zi_mo_temp[i] = xiao_hu_zi_mo[index];
			xiao_hu_jie_pao_temp[i] = xiao_hu_jie_pao[index];
			xiao_hu_dian_pao_temp[i] = xiao_hu_dian_pao[index];
			piao_lai_count_temp[i] = piao_lai_count[index];
			pao_temp[i] = pao[index];
			qiang_temp[i] = qiang[index];
			shaizi_temp[i] = shaizi[index];
			nao_temp[i] = nao[index];
			biaoyan_temp[i] = biaoyan[index];
			duanmen_temp[i] = duanmen[index]; // 断门
			ziba_temp[i] = ziba[index]; // 自拔
			men_qing_temp[i] = men_qing[index];
			gun_gun_temp[i] = gun_gun[index];
			peng_peng_hu_temp[i] = peng_peng_hu[index];
			gang_shang_hua_temp[i] = gang_shang_hua[index];
			hai_di_temp[i] = hai_di[index];
			hu_pai_count_temp[i] = hu_pai_count[index];
			ming_tang_count_temp[i] = ming_tang_count[index];
			ying_xi_count_temp[i] = ying_xi_count[index];
			liu_zi_fen_temp[i] = liu_zi_fen[index];
			hei_temp[i] = hei[index];
			hong_temp[i] = hong[index];
			ku_temp[i] = ku[index];
			ka_temp[i] = ka[index];
			qing_temp[i] = qing[index];
			shidui_temp[i] = shidui[index];
			tai_temp[i] = tai[index];
			haspiao_temp[i] = haspiao[index];
			ming_ci_ci_shu_temp[i] = ming_ci_ci_shu[index];
			an_ci_ci_shu_temp[i] = an_ci_ci_shu[index];
			pi_ci_ci_shu_temp[i] = pi_ci_ci_shu[index];
			zi_mo_ci_shu_temp[i] = zi_mo_ci_shu[index];
			bao_ci_ci_shu_temp[i] = bao_ci_ci_shu[index];
			cha_da_jiao_temp[i] = cha_da_jiao[index]; // 查大叫:断勾卡麻将
			chun_tian_temp[i] = chun_tian[index];// 0没有 1：春天 2：反春
			data_extra_temp[i] = data_extra[index];// 额外数据
		}

		for (int i = 0; i < gameConunt; i++) {
			game_score[i] = game_score_temp[i]; // 游戏分数
			lost_fan_shu[i] = lost_fan_shu_temp[i]; // 番数
			win_order[i] = win_order_temp[i];
			win_num[i] = win_num_temp[i];
			lose_num[i] = lose_num_temp[i];
			zi_mo_count[i] = zi_mo_count_temp[i];
			jie_pao_count[i] = jie_pao_count_temp[i];
			dian_pao_count[i] = dian_pao_count_temp[i];
			an_gang_count[i] = an_gang_count_temp[i];
			ming_gang_count[i] = ming_gang_count_temp[i];
			zhi_gang_count[i] = zhi_gang_count_temp[i]; // 直杠数量
			da_hu_zi_mo[i] = da_hu_zi_mo_temp[i];
			da_hu_jie_pao[i] = da_hu_jie_pao_temp[i];
			da_hu_dian_pao[i] = da_hu_dian_pao_temp[i];
			xiao_hu_zi_mo[i] = xiao_hu_zi_mo_temp[i];
			xiao_hu_jie_pao[i] = xiao_hu_jie_pao_temp[i];
			xiao_hu_dian_pao[i] = xiao_hu_dian_pao_temp[i];
			piao_lai_count[i] = piao_lai_count_temp[i];
			pao[i] = pao_temp[i];
			qiang[i] = qiang_temp[i];
			shaizi[i] = shaizi_temp[i];
			nao[i] = nao_temp[i];
			biaoyan[i] = biaoyan_temp[i];
			duanmen[i] = duanmen_temp[i]; // 断门
			ziba[i] = ziba_temp[i]; // 自拔
			men_qing[i] = men_qing_temp[i];
			gun_gun[i] = gun_gun_temp[i];
			peng_peng_hu[i] = peng_peng_hu_temp[i];
			gang_shang_hua[i] = gang_shang_hua_temp[i];
			hai_di[i] = hai_di_temp[i];
			hu_pai_count[i] = hu_pai_count_temp[i];
			ming_tang_count[i] = ming_tang_count_temp[i];
			ying_xi_count[i] = ying_xi_count_temp[i];
			liu_zi_fen[i] = liu_zi_fen_temp[i];
			
			ku[i] = ku_temp[i];
			ka[i] = ka_temp[i];
			qing[i] = qing_temp[i];
			shidui[i] = shidui_temp[i];
			tai[i] = tai_temp[i];
			haspiao[i] = haspiao_temp[i];
			ming_ci_ci_shu[i] = ming_ci_ci_shu_temp[i];
			an_ci_ci_shu[i] = an_ci_ci_shu_temp[i];
			pi_ci_ci_shu[i] = pi_ci_ci_shu_temp[i];
			zi_mo_ci_shu[i] = zi_mo_ci_shu_temp[i];
			bao_ci_ci_shu[i] = bao_ci_ci_shu_temp[i];
			cha_da_jiao[i] = cha_da_jiao_temp[i]; // 查大叫:断勾卡麻将
			chun_tian[i] = chun_tian_temp[i];// 0没有 1：春天 2：反春
			data_extra[i] = data_extra_temp[i];// 额外数据
		}
	}
}
