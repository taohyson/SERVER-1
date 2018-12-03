package com.cai.common.domain;

import java.util.Arrays;

//组合子项
public class WeaveItem {
	/**
	 * 组合类型--吃碰杆
	 */
	public int weave_kind;
	/**
	 * 中心扑克--吃 碰 杆 啥牌
	 */
	public int center_card;
	/**
	 * 公开标志
	 */
	public int public_card;
	/**
	 * 有效标志
	 */
	public boolean is_vavild;
	/**
	 * 供应用户
	 */
	public int provide_player;
	/**
	 * 初始供应用户
	 */
	public int provide_player_before;

	/**
	 * 胡息
	 */
	public int hu_xi;
	/**
	 * 落起组合数量
	 */
	public int lou_qi_count;
	/**
	 * 落起组合数量
	 */
	public int lou_qi_weave[][];
	/**
	 * 落起组合数量
	 */
	public int sub_lou_qi_count[];

	/**
	 * 客户端需要特殊处理的牌数量 商丘麻将落牌组合显示亮牌,细粒度，控制到单个牌
	 */
	public int client_special_count;

	public boolean is_lao_gang;

	/**
	 * 客户端需要特殊处理的牌值 商丘麻将落牌组合显示亮牌,细粒度，控制到单个牌
	 */
	public int client_special_card[];

	/**
	 * 组合牌
	 */
	public int weave_card[];
	public int weave_card_count;

	public int weave_score; // 组合分

	public boolean is_add_gang; // 是否加杠

	public int type; // 组合类型 （左中右吃）（暗杆,接杆,加杠）

	public boolean can_add_gang; // 是否可以加杠

	/**
	 * 开杠之后，此条杠的杠上炮，胡牌人的位置
	 */
	public int gang_jie_pao_seat;
	/**
	 * 开杠时，有效的人的位置，血战到底的时候
	 */
	public boolean[] gang_gei_fen_valid;
	public int gang_gei_fen_count;
	public int operate_card = 0;

	public WeaveItem() {
		lou_qi_count = 0;
		lou_qi_weave = new int[50][10];
		sub_lou_qi_count = new int[50];
		weave_card = new int[16];
		is_vavild = true;
		client_special_count = 0;
		weave_card_count = 0;
		client_special_card = new int[4];
		is_lao_gang = false;
		weave_score = 0;
		is_add_gang = false;
		can_add_gang = true;
		type = 0;
		gang_jie_pao_seat = -1;
		gang_gei_fen_valid = new boolean[4];
		gang_gei_fen_count = 0;
	}

	public int getWeave_kind() {
		return weave_kind;
	}

	public void setWeave_kind(int weave_kind) {
		this.weave_kind = weave_kind;
	}

	public int getCenter_card() {
		return center_card;
	}

	public void setCenter_card(int center_card) {
		this.center_card = center_card;
	}

	public int getPublic_card() {
		return public_card;
	}

	public void setPublic_card(int public_card) {
		this.public_card = public_card;
	}

	public int getProvide_player() {
		return provide_player;
	}

	public void setProvide_player(int provide_player) {
		this.provide_player = provide_player;
	}

	public int getHu_xi() {
		return hu_xi;
	}

	public void setHu_xi(int hu_xi) {
		this.hu_xi = hu_xi;
	}

	public int getLou_qi_weave() {
		return lou_qi_count;
	}

	public void setLou_qi_weave(int lou_qi_count) {
		this.lou_qi_count = lou_qi_count;
	}

	/**
	 * @return the weave_score
	 */
	public int getWeave_score() {
		return weave_score;
	}

	/**
	 * @param weave_score
	 *            the weave_score to set
	 */
	public void setWeave_score(int weave_score) {
		this.weave_score = weave_score;
	}

	/**
	 * @return the is_add_gang
	 */
	public boolean isIs_add_gang() {
		return is_add_gang;
	}

	/**
	 * @param is_add_gang
	 *            the is_add_gang to set
	 */
	public void setIs_add_gang(boolean is_add_gang) {
		this.is_add_gang = is_add_gang;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the can_add_gang
	 */
	public boolean isCan_add_gang() {
		return can_add_gang;
	}

	/**
	 * @param can_add_gang
	 *            the can_add_gang to set
	 */
	public void can_add_gang_invaild() {
		this.can_add_gang = false;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (int[] array : lou_qi_weave) {
			buf.append(Arrays.toString(array)).append(":");
		}

		return "WeaveItem [weave_kind=" + weave_kind + ", center_card=" + center_card + ", public_card=" + public_card + ", is_vavild=" + is_vavild
				+ ", provide_player=" + provide_player + ", hu_xi=" + hu_xi + ", lou_qi_count=" + lou_qi_count + ", lou_qi_weave=" + buf.toString()
				+ ", client_special_count=" + client_special_count + ", is_lao_gang=" + is_lao_gang + ", client_special_card="
				+ Arrays.toString(client_special_card) + ", weave_card=" + Arrays.toString(weave_card) + "]";
	}

	public String toSimpleString() {
		return "WeaveItem [weave_kind=" + weave_kind + ", center_card=" + center_card + ", hu_xi=" + hu_xi + ", weave_card="
				+ Arrays.toString(weave_card) + "]";
	}
}
