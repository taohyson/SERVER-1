package com.cai.common.domain;

import java.util.Arrays;

import com.cai.common.constant.GameConstants;
import com.cai.common.constant.game.Constants_MJ_GuangZe;

public class PlayerStatus {
	private int _status; // 玩家状态
	private int _handler_status; // 玩家操作标志

	private boolean abandoned = false; // 是否打红中弃胡
	private boolean ting_state = false; // 玩家出牌之后，是否能胡牌，只要一张牌能胡就可以
	private int[] cards_abandoned_hu = new int[GameConstants.MAX_ABANDONED_CARDS_COUNT]; // 本圈漏胡的牌
	private int[] hu_cards_of_xuan_mei = new int[4]; // 选美时胡的牌进行统计
	private int hu_cards_count_of_xuan_mei = 0;

	private int[] cards_abandoned_peng = new int[GameConstants.MAX_ZI_FENG]; // 本圈漏碰的牌

	public int[] _cards_abandoned_gang; // 手上有三张牌，但是选择了不杠之后，这张牌就不能杠了，检查补杠时直接过滤
	public int _cards_abandoned_gang_count;
	public int _cards_feng_gang_count;// 风杠的次数
	public int[] _cards_abandoned_feng_gang; // 风杠漏杠的牌
	/**
	 * 吃碰杆的 动作
	 */
	public int _action[];

	public int _action_count;

	public int _action_cards[];

	public int _perfrom_action;

	public int _target;

	public boolean _response;
	public int _lou_pai_kind;

	// 用于过庄类型 自己打出的牌又还是胡
	/**
	 * 碰牌之后牌型能胡 true,标识接下来出牌是否需要记录
	 */
	public boolean _check_chi_pen_hu = false;

	public int _out_card_peng;

	/**
	 * 牌的组合
	 */
	public WeaveItem _action_weaves[];

	public int _weave_count;

	// public ChiHuRight _chiHuRight;

	public int _ready;

	public int _operate_card;

	// public int _provide_player;
	// public int _provide_card;

	public int _gang_card_data;

	public boolean _chi_hu_round;

	/** 吃碰过手(摸牌算过手 */
	private boolean _chi_peng_round;

	public int _card_status;// 牌型状态

	public int _hu_card_count;

	public int _hu_cards[];

	// 二维数组 打出的牌，可以胡的牌
	public int _hu_out_cards[][];
	public int _hu_out_card_count;
	public int _hu_out_card_ting_count[];
	public int _hu_out_card_ting[];
	public int _hu_out_cards_fan[][];// 每张牌对应的番数

	public boolean ting_check;

	public boolean _is_pao_qiang;

	public boolean _is_pao;

	public boolean _is_pass_action;

	public boolean _is_nao_zhuang;
	public boolean _is_biaoyan;
	private int max_count;

	////////////////////// 斗地主
	public int _call_banker;
	public int _qiang_banker;

	public boolean is_ying_kou; // 是否硬扣 true 是 false 否
	public int card; // 过碰牌
	public int guo_hu_card; // 过胡牌

	public PlayerStatus() {
		this(GameConstants.MAX_COUNT);
	}

	public PlayerStatus(int max_count) {
		this.max_count = max_count;

		abandoned = false;
		ting_state = false;
		cards_abandoned_hu = new int[GameConstants.MAX_ABANDONED_CARDS_COUNT];
		cards_abandoned_peng = new int[GameConstants.MAX_ZI_FENG];
		_cards_abandoned_gang = new int[GameConstants.MAX_ZI_FENG];
		_cards_abandoned_feng_gang = new int[GameConstants.MAX_ZI_FENG];

		_status = GameConstants.INVALID_VALUE;
		_handler_status = GameConstants.INVALID_VALUE;
		_action = new int[max_count];

		_action_cards = new int[max_count];
		_perfrom_action = GameConstants.INVALID_VALUE;
		_response = false;
		_lou_pai_kind = -1;
		_action_count = GameConstants.INVALID_VALUE;
		_target = GameConstants.INVALID_SEAT;

		_action_weaves = new WeaveItem[max_count];
		for (int i = 0; i < max_count; i++) {
			_action_weaves[i] = new WeaveItem();
		}
		_weave_count = 0;
		_action_count = 0;

		_ready = 0;

		_operate_card = GameConstants.INVALID_VALUE;

		// _chiHuRight = new ChiHuRight();

		_chi_hu_round = true;

		_chi_peng_round = true;

		_card_status = GameConstants.CARD_STATUS_NORMAL;

		_hu_cards = new int[GameConstants.MAX_INDEX];

		ting_check = false;

		_hu_out_cards = new int[max_count][GameConstants.MAX_INDEX];
		_hu_out_cards_fan = new int[max_count][GameConstants.MAX_INDEX];

		_hu_out_card_ting_count = new int[max_count];

		_hu_out_card_ting = new int[max_count];

		_is_pao_qiang = false;
		_is_pass_action = false;
		_is_nao_zhuang = false;

		_is_biaoyan = false;

		_call_banker = -1;
		_qiang_banker = -1;

		abandoned = false;

		is_ying_kou = false;
		card = 0;
		guo_hu_card = 0; // 过胡牌
	}

	public void reset() {
		_status = GameConstants.INVALID_VALUE;
		_handler_status = GameConstants.INVALID_VALUE;
		_action_cards = new int[max_count];
		_perfrom_action = GameConstants.INVALID_VALUE;
		_response = false;
		_lou_pai_kind = -1;
		_target = GameConstants.INVALID_SEAT;
		_weave_count = 0;
		_action_count = 0;
		_ready = 0;
		_is_pass_action = false;
		_is_pao = false;
		_is_pao_qiang = false;
		_is_nao_zhuang = false;

		_is_biaoyan = false;
		// _chiHuRight.set_empty();

		for (int i = 0; i < max_count; i++) {

			_action_cards[i] = GameConstants.INVALID_VALUE;

			_action_weaves[i].public_card = 0;
			_action_weaves[i].center_card = GameConstants.INVALID_VALUE;
			_action_weaves[i].weave_kind = GameConstants.INVALID_VALUE;
			_action_weaves[i].provide_player = GameConstants.INVALID_SEAT;
			_action_weaves[i].lou_qi_count = 0;
			for (int j = 0; j < 50; j++) {
				for (int k = 0; k < 2; k++)
					_action_weaves[i].lou_qi_weave[j][k] = 0;
			}

			_action[i] = GameConstants.INVALID_VALUE;

		}
	}

	public void add_pao(int card, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_PAO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_PAO;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_sao(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_SAO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_SAO;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_gang(int card, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_GANG)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_GANG;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	// 添加风杠
	public void add_feng_gang(int card, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.WIK_FENG_GANG)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_FENG_GANG;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_gang_with_suo_pai(int card, int provider, int p, int wik_type) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == wik_type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = wik_type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_gang_couyise(int card, int type, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_xiao(int card, int type, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_liu(int card, int provider, int p, int weave_kind) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_GANG)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = weave_kind;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_wai(int card, int provider, int p, int weave_kind) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.WIK_YYWHZ_WAI)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = weave_kind;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_XiaZi(int card, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.WIK_XIA_ZI_BU)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_XIA_ZI_BU;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_bu_zhang(int card, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.WIK_BU_ZHNAG)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_BU_ZHNAG;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_zhao(int card, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_ZHAO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_ZHAO;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_yao_hai_di() {
		_action_weaves[_weave_count].public_card = 0;
		_action_weaves[_weave_count].center_card = 0;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_YAO_HAI_DI;
		_action_weaves[_weave_count].provide_player = -1;
		_weave_count++;
	}

	public void add_chi_hh(int card, int type, int provider, int count, int lou_qi_kind[][]) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_action_weaves[_weave_count].lou_qi_count = count;
		for (int i = 0; i < count; i++) {
			_action_weaves[_weave_count].lou_qi_weave[i][0] = lou_qi_kind[i][0];
			_action_weaves[_weave_count].lou_qi_weave[i][1] = lou_qi_kind[i][1];

		}
		_weave_count++;
	}
	public void add_chi_chz(int card, int type, int provider, int count,int send_count[], int lou_qi_kind[][]) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_action_weaves[_weave_count].lou_qi_count = count;
		for (int i = 0; i < count; i++) {
			_action_weaves[_weave_count].sub_lou_qi_count[i] = send_count[i];
			for(int j = 0; j< send_count[i];j++){
				_action_weaves[_weave_count].lou_qi_weave[i][j] = lou_qi_kind[i][j];
				_action_weaves[_weave_count].lou_qi_weave[i][j] = lou_qi_kind[i][j];
			}
			

		}
		_weave_count++;
	}

	public void add_comm_action(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_cp_zhao(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_hua(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_guan(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_pick_up(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_gzp_peng(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_gzp_zhao(int card, int provider, int p) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.GZP_WIK_ZHAO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = p;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.GZP_WIK_ZHAO;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_chi(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_chi_data(int card, int type) {

		WeaveItem weaveItem = null;
		for (int i = 0; i < _weave_count; i++) {
			if (((_action_weaves[i].center_card & GameConstants.LOGIC_MASK_VALUE) == (card
					& GameConstants.LOGIC_MASK_VALUE)) && (_action_weaves[i].weave_kind == type)) {
				weaveItem = _action_weaves[i];
				break;
			}
		}

		if (weaveItem == null) {
			return;
		}

		for (int c = 0; c < weaveItem.weave_card.length; c++) {
			if (weaveItem.weave_card[c] != 0) {
				continue;
			}

			weaveItem.weave_card[c] = card;
			break;
		}
	}

	public void add_chi_gzcg(int card, int type, int provider) {
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_bao_ting(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_show_card(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}

		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_liang_card(int[] cards, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if (_action_weaves[i].weave_kind == GameConstants.WIK_LIANG) {
				return;
			}
		}
		_action_weaves[_weave_count].weave_card = Arrays.copyOf(cards, cards.length);
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_LIANG;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_liang_card_cc(int[] cards, int provider, int type, int index) {
		for (int i = 0; i < _weave_count; i++) {
			if (_action_weaves[i].weave_kind == GameConstants.WIK_LIANG
					&& _action_weaves[_weave_count].public_card == index) {
				return;
			}
		}
		_action_weaves[_weave_count].weave_card = Arrays.copyOf(cards, cards.length);
		_action_weaves[_weave_count].public_card = index;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_LIANG;
		_action_weaves[_weave_count].provide_player = provider;
		_action_weaves[_weave_count].type = type;
		_weave_count++;
	}

	public void add_bu_card_cc(int[] cards, int provider, int center_card, int type) {
		for (int i = 0; i < _weave_count; i++) {
			if (_action_weaves[i].weave_kind == GameConstants.WIK_BU_ZHNAG) {
				return;
			}
		}
		_action_weaves[_weave_count].weave_card = Arrays.copyOf(cards, cards.length);
		_action_weaves[_weave_count].public_card = type;
		_action_weaves[_weave_count].center_card = center_card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_BU_ZHNAG;
		_action_weaves[_weave_count].provide_player = provider;
		_action_weaves[_weave_count].type = type;

		_weave_count++;
	}

	public void add_peng_couyise(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_chi_hu(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_CHI_HU)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_CHI_HU;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}
	public void add_qiang_gang_hu(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_CHI_HU)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_QIANG_GANG_HU_ND;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_normal_wik(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}

		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_normal_gang_wik(int card, int type, int provider, int isPublic) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}

		_action_weaves[_weave_count].public_card = isPublic;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_suo_gang_wik(int centerCard, int card, int type, int provider, int isPublic) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == centerCard) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}

		_action_weaves[_weave_count].public_card = isPublic;
		_action_weaves[_weave_count].center_card = centerCard;
		_action_weaves[_weave_count].operate_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;

		_weave_count++;
	}

	public void add_liang_lai_zi(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_CHI_HU)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_LIANG_LAI_ZI;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_ying_kou(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.WIK_YING_KUO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_YING_KUO;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_pao(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_NULL)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_PAO;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_bh_action(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_hbzp_zhao(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_NULL)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_piao(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_pass(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_NULL)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_NULL;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_zhe(int card, int kind, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_NULL)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = kind;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_peng(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_PENG)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_PENG;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_hh_peng(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.WIK_HBZP_PENG)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_cp_peng(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_tu_huo(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.DZ_WIK_TU_HUO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_qi(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.DZ_WIK_QI)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_yang(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.DZ_WIK_YANG)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_tu_huox(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.DZ_WIK_TUX_HUO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_dz_gang(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.DZ_WIK_SHA)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_cp_chi(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	// 添加牌值动作，通用
	public void add_action_card(int public_card, int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = public_card;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_zi_mo(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_ZI_MO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_ZI_MO;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_type(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_out_card(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == type)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_tou(int card, int type, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.CP_WIK_TOU)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = type;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_zt_si_xi(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card)
					&& (_action_weaves[i].weave_kind == GameConstants.WIK_ZT_SI_XI)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_ZT_SI_XI;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_zt_lls(int card, int provider) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_ZT_LLS)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = GameConstants.WIK_ZT_LLS;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void add_lygc_ci(int card, int provider, int weave_kind) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && ((_action_weaves[i].weave_kind == GameConstants.WIK_LYGC_CI)
					|| (_action_weaves[i].weave_kind == GameConstants.WIK_LYGC_PI_CI))) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = weave_kind;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	// 添加 提 跑 扫
	public void add_pao_hu(int card, int seat_index, int provider, int weave_kind) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].center_card == card) && (_action_weaves[i].weave_kind == GameConstants.WIK_ZI_MO)) {
				return;
			}
		}
		_action_weaves[_weave_count].public_card = 1;
		_action_weaves[_weave_count].center_card = card;
		_action_weaves[_weave_count].weave_kind = weave_kind;
		_action_weaves[_weave_count].provide_player = provider;
		_weave_count++;
	}

	public void clean_weave() {
		_weave_count = 0;
	}

	public void reset_pao_qiang() {
		_is_pao_qiang = false;
	}

	/**
	 * 清除指定Action
	 * 
	 * @param action
	 */
	public void clean_action(int action) {
		int[] copy_action = new int[_action.length];
		int copy_action_count = 0;

		for (int i = 0; i < _action.length; i++) {
			if (_action[i] == 0)
				continue;
			if (_action[i] != action) {
				copy_action[copy_action_count] = _action[i];
				copy_action_count++;
			}
		}
		_action = copy_action;
		_action_count = copy_action_count;
	}

	public void clean_action_new(int action) {
		int[] copy_action = new int[_action.length];
		int copy_action_count = 0;

		for (int i = 0; i < _action.length; i++) {
			if (_action[i] == 0)
				continue;
			if (_action[i] != action) {
				copy_action[copy_action_count] = _action[i];
				copy_action_count++;
			}
		}
		_action = copy_action;
		_action_count = copy_action_count;

		WeaveItem[] copy_weave_items = new WeaveItem[_action_weaves.length];
		for (int i = 0; i < _action_weaves.length; i++)
			copy_weave_items[i] = new WeaveItem();
		int copy_weave_count = 0;

		for (int i = 0; i < _action_weaves.length; i++) {
			if (_action_weaves[i].weave_kind == 0)
				continue;
			if (_action_weaves[i].weave_kind != action) {
				copy_weave_items[copy_weave_count] = _action_weaves[i];
				copy_weave_count++;
			}
		}
		_action_weaves = copy_weave_items;
		_weave_count = copy_weave_count;
	}

	////////////////////////////////////////// 胡牌屏蔽///////////////////////////
	///// 玩家点击不胡的时候，这一轮就不能胡了
	public void chi_hu_round_invalid() {

		_chi_hu_round = false;
	}

	public void chi_hu_round_valid() {
		_chi_hu_round = true;
		this.chi_hu_round_valid_ext();
	}

	////////////////////////////////////////// 动作///////////////////////////////
	/**
	 * 添加吃碰杆 胡的动作
	 * 
	 * @param action
	 */
	public void add_action(int action) {
		// if(action==0)return;
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == action) {
				return;
			}
		}
		_action[_action_count] = action;
		_action_count++;

	}

	public void delete_action(int action) {
		int count = 0;
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] != action)
				_action[count++] = _action[i];
		}
		_action_count -= _action_count - count;
		count = 0;
		for (int i = 0; i < _weave_count; i++) {
			if (_action_weaves[i].weave_kind != action) {
				_action_weaves[count].public_card = _action_weaves[i].public_card;
				_action_weaves[count].center_card = _action_weaves[i].center_card;
				_action_weaves[count].weave_kind = _action_weaves[i].weave_kind;
				_action_weaves[count++].provide_player = _action_weaves[i].provide_player;
			}

		}

		_weave_count -= _weave_count - count;

	}

	/**
	 * 清除玩家动作 临时组合
	 */
	public void clean_action() {
		_action_count = 0;
		Arrays.fill(_action, 0);
		_perfrom_action = GameConstants.INVALID_VALUE;
		_response = false;
		_lou_pai_kind = -1;
		_operate_card = 0;

		_is_pass_action = false;
		for (int i = 0; i < _weave_count; i++) {
			for (int j = 0; j < _action_weaves[i].weave_card.length; j++) {
				_action_weaves[i].weave_card[j] = 0;
			}

		}
		_weave_count = 0;
	}

	public boolean has_xiao_hu() {
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == GameConstants.WIK_XIAO_HU) {
				return true;
			}
		}
		return false;
	}

	public boolean has_chi_hu() {
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == GameConstants.WIK_CHI_HU || _action[i] == GameConstants.WIK_ZI_MO) {
				return true;
			}
		}
		return false;
	}

	public boolean has_zi_mo() {
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == GameConstants.WIK_ZI_MO) {
				return true;
			}
		}
		return false;
	}

	public boolean has_cp_zhao() {
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == GameConstants.CP_WIK_ZHAO) {
				return true;
			}
		}
		return false;
	}

	public boolean has_cp_tou() {
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == GameConstants.CP_WIK_TOU) {
				return true;
			}
		}
		return false;
	}

	public boolean has_bh_peng() {
		for (int i = 0; i < _action_count; i++) {
			if ((_action[i] & GameConstants.WIK_BH_PENG)!=0) {
				return true;
			}
		}
		return false;
	}

	public boolean has_action() {
		return _action_count > 0;
	}

	public boolean has_action_by_code(int code) {
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == code) {
				return true;
			}
		}
		return false;
	}

	public boolean has_action_by_bh_code(int code) {
		for (int i = 0; i < _action_count; i++) {
			if ((_action[i] & code) != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean has_chi_hu_guang_ze() {
		for (int i = 0; i < _action_count; i++) {
			if (_action[i] == Constants_MJ_GuangZe.WIK_CHI_HU || _action[i] == Constants_MJ_GuangZe.WIK_QI_DA_DUI
					|| _action[i] == Constants_MJ_GuangZe.WIK_DI_HU
					|| _action[i] == Constants_MJ_GuangZe.WIK_QI_XIAO_DUI
					|| _action[i] == Constants_MJ_GuangZe.WIK_QING_YI_SE
					|| _action[i] == Constants_MJ_GuangZe.WIK_DAN_DIAO || _action[i] == Constants_MJ_GuangZe.WIK_HHQXD
					|| _action[i] == Constants_MJ_GuangZe.WIK_TIAN_HU
					|| _action[i] == Constants_MJ_GuangZe.WIK_QIANG_GANG) {
				return true;
			}
		}
		return false;
	}

	//////////////////////////////////////////////// 状态/////////////////////////
	public void set_status(int st) {
		// if(st!=_status) {
		// logger.warn("status=="+st+ThreadUtil.getStack());
		// }
		_status = st;
	}

	public void clean_status() {
		_status = GameConstants.INVALID_VALUE;
	}

	//
	public int get_status() {
		if (lock_huan_zhang() == true && _status == GameConstants.Player_Status_OUT_CARD) {
			return GameConstants.Player_Status_NULL;// 不能出牌

		}
		return _status;
	}

	public void set_handler_status(int h_st) {
		_handler_status = h_st;
	}

	public int get_handler_status() {
		return _handler_status;
	}
	// public void status_cs_gang(){
	// _cs_gang = true;
	// }

	public boolean lock_huan_zhang() {
		return _card_status == GameConstants.CARD_STATUS_CS_GANG;
	}

	public boolean is_bao_ting() {
		return _card_status == GameConstants.CARD_STATUS_BAO_TING;
	}

	// 离庄离扣
	public boolean is_lzlk() {
		return _card_status == GameConstants.CARD_STATUS_LI_ZHUANG_LI_KOU;
	}

	public int get_card_status() {
		return _card_status;
	}

	public void set_card_status(int st) {
		_card_status = st;
	}

	//////////////////////////////////////////////// 操作/////////////////////////
	public boolean is_respone() {
		return _response;
	}

	/////////////////////////////////////// 落牌////////////////////////////////
	public int get_lou_kind() {
		return _lou_pai_kind;
	}

	public void set_lou_pai_kind(int lou_kind) {
		_lou_pai_kind = lou_kind;
	}

	public void set_perform(int action) {
		_perfrom_action = action;
		_response = true;
	}

	public int get_perform() {
		return _perfrom_action;
	}

	public void set_operate_card(int card) {
		_operate_card = card;
	}

	public int get_operate_card() {
		return _operate_card;
	}

	/**
	 * 记录玩家当前操作 以及操作的牌
	 * 
	 * @param operate_code
	 * @param operate_card
	 */
	public void operate(int operate_code, int operate_card) {
		_response = true;
		_perfrom_action = operate_code;// 执行动作
		_operate_card = operate_card;
	}

	public int get_weave_card(int operate_code) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].weave_kind == operate_code)) {
				return _action_weaves[i].center_card;
			}
		}
		return 0;
	}

	public boolean is_get_weave_card(int operate_code, int card) {
		for (int i = 0; i < _weave_count; i++) {
			if ((_action_weaves[i].weave_kind == operate_code) && (_action_weaves[i].center_card == card)) {
				return true;
			}
		}
		return false;
	}

	public int is_get_card(int card) {
		for (int i = 0; i < _weave_count; i++) {
			if (_action_weaves[i].center_card == card) {
				return _action_weaves[i].weave_kind;
			}
		}
		return 0;
	}

	public int get_max_operate() {
		int action = 0;
		for (int i = 0; i < _action_count; i++) {
			int rank = 0;
			if (_action[i] == GameConstants.WIK_CHI_HU) {
				rank = 40;
			} else if (_action[i] == GameConstants.WIK_GANG) {
				rank = 30;
			} else if (_action[i] == GameConstants.WIK_BU_ZHNAG) {
				rank = 30;
			} else if (_action[i] == GameConstants.WIK_PENG) {
				rank = 20;
			} else if (_action[i] == GameConstants.WIK_RIGHT || _action[i] == GameConstants.WIK_CENTER
					|| _action[i] == GameConstants.WIK_LEFT) {
				rank = 10;
			}
			if (rank > action) {
				action = rank;
			}
		}

		return (_response == false) ? action : _perfrom_action;
	}

	public boolean is_chi_hu_round() {
		return _chi_hu_round;
	}

	public void set_chi_hu_round(boolean _chi_hu_round) {
		this._chi_hu_round = _chi_hu_round;
	}

	public void set_exe_pass(boolean is_pass) {
		this._is_pass_action = is_pass;
	}

	public boolean get_exe_pass() {
		return this._is_pass_action;
	}

	public boolean isAbandoned() {
		return abandoned;
	}

	public void setAbandoned(boolean abandoned) {
		this.abandoned = abandoned;
	}

	public boolean get_ting_state() {
		return this.ting_state;
	}

	public void set_ting_state(boolean ting) {
		this.ting_state = ting;
	}

	public int[] get_cards_abandoned_hu() {
		return this.cards_abandoned_hu;
	}

	public int[] get_cards_abandoned_peng() {
		return this.cards_abandoned_peng;
	}

	public int[] get_cards_abandoned_feng_gang() {
		return this._cards_abandoned_feng_gang;
	}

	public int[] get_cards_abandoned_gang() {
		return this._cards_abandoned_gang;
	}

	public void add_cards_abandoned_hu(int card) {
		for (int i = 0; i < GameConstants.MAX_ABANDONED_CARDS_COUNT; i++) {
			if (cards_abandoned_hu[i] == 0) {
				cards_abandoned_hu[i] = card;
				break;
			}
		}
	}

	public void add_cards_abandoned_peng(int card) {
		for (int i = 0; i < GameConstants.MAX_ZI_FENG; i++) {
			if (cards_abandoned_peng[i] == 0) {
				cards_abandoned_peng[i] = card;
				break;
			}
		}
	}

	public void add_cards_abandoned_feng_gang(int card) {
		for (int i = 0; i < GameConstants.MAX_ZI_FENG; i++) {
			if (_cards_abandoned_feng_gang[i] == 0) {
				_cards_abandoned_feng_gang[i] = card;
				break;
			}
		}
	}

	public void add_cards_abandoned_gang(int card_index) {
		this._cards_abandoned_gang[card_index] = 1;
	}

	public void clear_cards_abandoned_gang() {
		_cards_abandoned_gang_count = 0;
		for (int i = 0; i < GameConstants.MAX_ZI_FENG; i++) {
			_cards_abandoned_gang[i] = 0;
		}
	}

	public void clear_cards_abandoned_hu() {
		for (int i = 0; i < GameConstants.MAX_ABANDONED_CARDS_COUNT; i++) {
			cards_abandoned_hu[i] = 0;
		}
	}

	public void clear_cards_abandoned_peng() {
		for (int i = 0; i < GameConstants.MAX_ZI_FENG; i++) {
			cards_abandoned_peng[i] = 0;
		}
	}

	public void clear_cards_abandoned_feng_gang() {
		for (int i = 0; i < GameConstants.MAX_ZI_FENG; i++) {
			_cards_abandoned_feng_gang[i] = 0;
		}
	}

	public void clear_hu_cards_of_xuan_mei() {
		hu_cards_count_of_xuan_mei = 0;
		for (int i = 0; i < 4; i++) {
			hu_cards_of_xuan_mei[i] = 0;
		}
	}

	public void add_hu_cards_of_xuan_mei(int card) {
		hu_cards_of_xuan_mei[hu_cards_count_of_xuan_mei++] = card;
	}

	public int[] get_hu_cards_of_xuan_mei() {
		int[] tmp_cards = new int[hu_cards_count_of_xuan_mei];
		for (int i = 0; i < hu_cards_count_of_xuan_mei; i++)
			tmp_cards[i] = hu_cards_of_xuan_mei[i];
		return tmp_cards;
	}

	/**
	 * @return the _chi_peng_round
	 */
	public boolean is_chi_peng_round() {
		return _chi_peng_round;
	}

	/**
	 * 还原过碰 true
	 */
	public void chi_peng_round_valid() {
		this._chi_peng_round = true;
	}

	/**
	 * 过碰false 有漏碰需过手
	 */
	public void chi_peng_round_invalid() {
		this._chi_peng_round = false;
	}

	/**
	 * 还原过碰 true
	 */
	public void chi_peng_round_valid_ext() {
		card = 0;
		this._chi_peng_round = true;
	}

	/**
	 * 过碰false 有漏碰需过手
	 */
	public void chi_peng_round_invalid_ext(int _card) {
		card = _card;
		this._chi_peng_round = false;
	}

	/**
	 * 还原漏胡 true
	 */
	public void chi_hu_round_valid_ext() {
		guo_hu_card = 0;
		this._chi_hu_round = true;
	}

	/**
	 * 过碰false 有漏胡需过手
	 */
	public void chi_hu_round_invalid_ext(int _card) {
		guo_hu_card = _card;
		this._chi_hu_round = false;
	}

}
