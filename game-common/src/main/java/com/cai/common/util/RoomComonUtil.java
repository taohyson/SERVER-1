package com.cai.common.util;

import com.cai.common.constant.GameConstants;
import com.cai.common.constant.game.BTZConstants;
import com.cai.common.constant.game.Constants_ChenZhou;
import com.cai.common.constant.game.Constants_EZ;
import com.cai.common.constant.game.Constants_GXLZ;
import com.cai.common.constant.game.Constants_JingDian_CS;
import com.cai.common.constant.game.Constants_MJ_GZCG;
import com.cai.common.constant.game.Constants_MJ_GuangZe;
import com.cai.common.constant.game.Constants_New_ChenZhou;
import com.cai.common.constant.game.Constants_WuGang;
import com.cai.common.constant.game.Constants_YangZhong;
import com.cai.common.constant.game.GameConstants_AnHua;
import com.cai.common.constant.game.GameConstants_DCWDH;
import com.cai.common.constant.game.GameConstants_DTZ;
import com.cai.common.constant.game.GameConstants_GY;
import com.cai.common.constant.game.GameConstants_KWX;
import com.cai.common.constant.game.GameConstants_SQ;
import com.cai.common.constant.game.GameConstants_SW;
import com.cai.common.constant.game.GameConstants_SYZP;
import com.cai.common.constant.game.GameConstants_TC;
import com.cai.common.constant.game.GameConstants_WangCheng;
import com.cai.common.constant.game.GameConstants_YiYang;
import com.cai.common.constant.game.GameConstants_YiYang_SZG;
import com.cai.common.constant.game.GameConstants_ZYZJ;
import com.cai.common.constant.game.TDZConstants;
import com.cai.common.constant.game.czbg.CZBGConstants;
import com.cai.common.constant.game.hongershi.HongErShiConstants;
import com.cai.common.constant.game.mj.Constants_AnHua;
import com.cai.common.constant.game.mj.Constants_HUAI_HUA;
import com.cai.common.constant.game.mj.Constants_HuangShan;
import com.cai.common.constant.game.mj.Constants_MJ_JING_DE_ZHEN;
import com.cai.common.constant.game.mj.Constants_MJ_NING_XIANG;
import com.cai.common.constant.game.mj.Constants_MJ_NXHS;
import com.cai.common.constant.game.mj.Constants_MJ_PC;
import com.cai.common.constant.game.mj.Constants_MJ_PING_XIANG_258;
import com.cai.common.constant.game.mj.Constants_MJ_QUAN_ZHOU;
import com.cai.common.constant.game.mj.Constants_MJ_XIN_YANG;
import com.cai.common.constant.game.mj.Constants_PING_JIANG;
import com.cai.common.constant.game.mj.Constants_SiChuan;
import com.cai.common.constant.game.mj.Constants_TaoJiang;
import com.cai.common.constant.game.mj.Constants_WanZai;
import com.cai.common.constant.game.mj.Constants_YuanJiang;
import com.cai.common.constant.game.mj.GameConstants_HaiNan;
import com.cai.common.constant.game.mj.GameConstants_LUHE;
import com.cai.common.constant.game.mj.GameConstants_ND;
import com.cai.common.constant.game.mj.GameConstants_SXKDD;
import com.cai.common.constant.game.mj.GameConstants_XTDGK;
import com.cai.common.constant.game.mj.GameConstants_XUPU;
import com.cai.common.constant.game.mj.GameConstants_XiangNing;
import com.cai.common.constant.game.mj.GameConstants_XiangXiang;
import com.cai.common.constant.game.mj.UniversalConstants;
import com.cai.common.constant.game.phz.Constants_LouDiFangPaoFa;
import com.cai.common.constant.game.phz.Constants_YongZhou;
import com.cai.common.domain.Room;

public class RoomComonUtil {

	public static int getMaxNumber(DescParams params) {
		int _game_type_index = params._game_type_index;
		int game_type_index = _game_type_index;
		int _game_rule_index = params._game_rule_index;
		int[] _game_rules = params.game_rules;
		int maxNumber = 4;
		if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TWO_PLAYER) == 1) {
			return 2;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_THREE_PLAYER) == 1) {
			return 3;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_FOUR_PLAYER) == 1) {
			return 4;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_FIVE_PLAYER) == 1) {
			return 5;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_SIX_PLAYER) == 1) {
			return 6;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_SEVEN_PLAYER) == 1) {
			return 7;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_EIGHT_PLAYER) == 1) {
			return 8;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_NINE_PLAYER) == 1) {
			return 9;
		} else if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TEN_PLAYER) == 1) {
			return 10;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_GY_EDG_3D) {
			return 2;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_GY_SDG_3D) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_DDZ_DL) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_PDK_JD_HN) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_WSK_HTS) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_DDZ_LF) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_GT_SDG) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_GY_EDG) {
			return 2;
		}
		if (_game_type_index == GameConstants.GAMR_TYPE_GY_TWO_3) {
			return 2;
		}
		if (_game_type_index == GameConstants.GAMR_TYPE_GY_THREE_3) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_GY_3) {
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_PK_YJQF) {
			return 3;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_NX_HUA_SHUI) {
			if (has_rule(_game_rules, Constants_MJ_NXHS.GAME_RULE_PLAY_4)) {
				maxNumber = 4;
			}
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_FJ_GUANG_ZE) {
			if (has_rule(_game_rules, Constants_MJ_GuangZe.GAME_RULE_PLayer2)) {
				maxNumber = 2;
			}
			if (has_rule(_game_rules, Constants_MJ_GuangZe.GAME_RULE_PLayer3)) {
				maxNumber = 3;
			}
			if (has_rule(_game_rules, Constants_MJ_GuangZe.GAME_RULE_PLayer4)) {
				maxNumber = 4;
			}
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_PING_XIANG_ZZ
				|| _game_type_index == GameConstants.GAME_TYPE_MJ_PING_XIANG_HZ) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HUNAN_TWO)) {
				return 2;
			}
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_SY) {
			if (has_rule(_game_rules, 1)) {
				return 2;
			}
			if (has_rule(_game_rules, 2)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_PJ_ZHA_NIAO) {
			if (has_rule(_game_rules, Constants_PING_JIANG.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			if (has_rule(_game_rules, Constants_PING_JIANG.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_XIN_YANG) {
			if (has_rule(_game_rules, Constants_MJ_XIN_YANG.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			if (has_rule(_game_rules, Constants_MJ_XIN_YANG.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_MJ_GY) {
			if (has_rule(_game_rules, 16)) {
				return 2;
			}
			if (has_rule(_game_rules, 17)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_QUAN_ZHOU) {
			if (has_rule(_game_rules, Constants_MJ_QUAN_ZHOU.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			if (has_rule(_game_rules, Constants_MJ_QUAN_ZHOU.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_ZHENG_ZHOU
				|| _game_type_index == GameConstants.GAME_TYPE_KFZZ
				|| _game_type_index == GameConstants.GAME_TYPE_MJ_NEW_HN_ZHEN_ZHOU
				|| _game_type_index == GameConstants.GAME_TYPE_AN_YANG_ZZ
				|| _game_type_index == GameConstants.GAME_TYPE_PDS_ZHENG_ZHOU) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_HUNAN_SHAOYANG) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_HAI_NAN) {
			if (has_rule(_game_rules, GameConstants_HaiNan.GAME_RULE_HAINAN_PLAYER_2)) {
				return 2;
			} else if (has_rule(_game_rules, GameConstants_HaiNan.GAME_RULE_HAINAN_PLAYER_3)) {
				return 3;
			}
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_DT_HONG_ZHONG) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_XP_240) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_XPSJ_THREE_PEOPLE)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_SXKDD) {
			if (has_rule(_game_rules, GameConstants_SXKDD.GAME_RULE_MJ_SXKDD_PLAYER_NUMBER_3)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_JING_DE_ZHEN) {
			if (has_rule(_game_rules, Constants_MJ_JING_DE_ZHEN.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			if (has_rule(_game_rules, Constants_MJ_JING_DE_ZHEN.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_YI_YANG_QIN_YOU) {
			if (has_rule(_game_rules, GameConstants_YiYang.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants_YiYang.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_PING_XIANG_258) {
			if (has_rule(_game_rules, Constants_MJ_PING_XIANG_258.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			if (has_rule(_game_rules, Constants_MJ_PING_XIANG_258.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_NING_XIANG) {
			if (has_rule(_game_rules, Constants_MJ_NING_XIANG.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			if (has_rule(_game_rules, Constants_MJ_NING_XIANG.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_PU_CHENG) {
			if (has_rule(_game_rules, Constants_MJ_PC.GAME_RULE_PLAYER_3)) {
				return 3;
			}
			if (has_rule(_game_rules, Constants_MJ_PC.GAME_RULE_PLAYER_2)) {
				return 2;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_PHZ_YONG_ZHOU) {
			if (has_rule(_game_rules, Constants_YongZhou.GAME_RULE_PLAYER_TWO))
				return 2;
			if (has_rule(_game_rules, Constants_YongZhou.GAME_RULE_PLAYER_THREE))
				return 3;
			if (has_rule(_game_rules, Constants_YongZhou.GAME_RULE_PLAYER_FOUR))
				return 4;
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_JI_XIAN
				|| _game_type_index == GameConstants.GAME_TYPE_LIN_FENG
				|| _game_type_index == GameConstants.GAME_TYPE_LF_YI_MEN_PAI) {
			if (has_rule(_game_rules, UniversalConstants.U_GAME_RULE_PLAYER_TWO)) {
				return 2;
			} else if (has_rule(_game_rules, UniversalConstants.U_GAME_RULE_PLAYER_THREE)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_WZ_DD) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_HUA_RONG3) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_PHZ_LD_FANG_PAO_FA) {
			if (has_rule(_game_rules, Constants_LouDiFangPaoFa.GAME_REN_SHU_2))
				return 2;
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_CHQ_YDR) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_WAN_ZAI) {
			if (has_rule(_game_rule_index, Constants_WanZai.GAME_RULE_PEOPLE_COUNT_2)) {
				return 2;
			}
			if (has_rule(_game_rule_index, Constants_WanZai.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_SHAN_XI_XIANG_NING) {
			if (has_rule(_game_rule_index, GameConstants_XiangNing.GAME_RULE_MJ_XN_PLAYER_NUMBER_2)) {
				return 2;
			}
			if (has_rule(_game_rule_index, GameConstants_XiangNing.GAME_RULE_MJ_XN_PLAYER_NUMBER_3)) {
				return 3;
			}
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_PHZ_NX) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_PLAYER_TWO)) {
				return 2;
			}
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_HUAI_HUA) {
			if (has_rule(_game_rule_index, Constants_HUAI_HUA.GAME_RULE_PEOPLE_COUNT_3)) {
				return 3;
			}
			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_YUAN_JIANG) {
			if (has_rule(_game_rule_index, Constants_YuanJiang.GAME_RULE_PLAYER_TWO)) {
				return 2;
			}
			if (has_rule(_game_rule_index, Constants_YuanJiang.GAME_RULE_PLAYER_THREE)) {
				return 3;
			}
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_SRLF) {
			if (has_rule(_game_rules, Constants_SiChuan.GAME_RULE_U_PLAYER_TWO)) {
				return 2;
			}
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_GUANG_AN
				|| _game_type_index == GameConstants.GAME_TYPE_LE_SHAN_YAO_JI
				|| _game_type_index == GameConstants.GAME_TYPE_LU_ZHOU_GUI
				|| _game_type_index == GameConstants.GAME_TYPE_XUE_LIU_CHENG_HE
				|| _game_type_index == GameConstants.GAME_TYPE_HL_XUE_LIU) {
			if (has_rule(_game_rules, Constants_SiChuan.GAME_RULE_U_PLAYER_TWO)) {
				return 2;
			}
			if (has_rule(_game_rules, Constants_SiChuan.GAME_RULE_U_PLAYER_THREE)) {
				return 3;
			}
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_QIONG_LAI) {
			if (has_rule(_game_rules, Constants_SiChuan.GAME_RULE_PLAYER_TWO)) {
				return 2;
			}
			if (has_rule(_game_rules, Constants_SiChuan.GAME_RULE_PLAYER_THREE)) {
				return 3;
			}
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_AN_HUA) {
			if (has_rule(_game_rule_index, Constants_AnHua.GAME_RULE_PLAYER_THREE)) {
				return 3;
			}
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_PHZ_AH) {
			if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_PLAYER_2)) {
				return 2;
			}
			return 3;
		}

		if (game_type_index == GameConstants.GAME_TYPE_QIONG_LAI_HONG
				|| _game_type_index == GameConstants.GAME_TYPE_CP_DSS_QL
				|| _game_type_index == GameConstants.GAME_TYPE_CP_DSS_DY) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_DSS_THREE))) {
				maxNumber = 3;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_DSS_FOUR))) {
				maxNumber = 4;
			}
		}

		if (_game_type_index == GameConstants.GAME_TYPE_HUNAN_TAO_JIANG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_TaoJiang.GAME_RULE_PLAYER_TWO))) {
				maxNumber = 2;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_TaoJiang.GAME_RULE_PLAYER_THREE))) {
				maxNumber = 3;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_TaoJiang.GAME_RULE_PLAYER_FOUR))) {
				maxNumber = 4;
			} else {
				maxNumber = 4;
			}
			return maxNumber;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_XF_GD_FOUR) {
			maxNumber = 4;
			return maxNumber;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_XF_GD_THREE) {
			maxNumber = 3;
			return maxNumber;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_LLDAQI) {
			maxNumber = 5;
			return maxNumber;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_DN_YI_YANG) {
			if (GameDescUtil.has_rule(_game_rules, GameConstants.GAME_RULE_GAME_RULE_PLAYER_FIVE)) {
				maxNumber = 5;
			} else if (GameDescUtil.has_rule(_game_rules, GameConstants.GAME_RULE_GAME_RULE_PLAYER_SEVEN)) {
				maxNumber = 7;
			} else {
				maxNumber = 5;
			}
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_HUAIHUA_OX) {
			if (GameDescUtil.has_rule(_game_rules, GameConstants.GAME_RULE_HHUA_SIX_PLAYER)) {
				maxNumber = 6;
			} else if (GameDescUtil.has_rule(_game_rules, GameConstants.GAME_RULE_HHUA_EIGHT_PLAYER)) {
				maxNumber = 8;
			}
			return maxNumber;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_PSH_OX) {

			return 8;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_PSH_FK_OX) {

			return 5;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_XP_BOHU) {

			return 4;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_MJ_XU_PU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_XUPU.GAME_RULE_SI_REN))) {
				maxNumber = 4;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_XUPU.GAME_RULE_SAN_REN))) {
				maxNumber = 3;
			}
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_XTDGK) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_XTDGK.GAME_RULE_SI_REN))) {
				maxNumber = 4;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_XTDGK.GAME_RULE_SAN_REN))) {
				maxNumber = 3;
			}
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_NINGDU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_ND.GAME_RULE_PLAYER_4))) {
				maxNumber = 4;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_ND.GAME_RULE_PLAYER_3))) {
				maxNumber = 3;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_ND.GAME_RULE_PLAYER_2))) {
				maxNumber = 2;
			}
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_SX) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_ND.GAME_RULE_PLAYER_4))) {
				maxNumber = 4;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_ND.GAME_RULE_PLAYER_3))) {
				maxNumber = 3;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_ND.GAME_RULE_PLAYER_2))) {
				maxNumber = 2;
			}
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_ER_ZHOU
				|| _game_type_index == GameConstants.GAME_TYPE_3D_E_ZHOU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_EZ.GAME_RULE_PLAYER_TWO))) {
				maxNumber = 2;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_EZ.GAME_RULE_PLAYER_THREE))) {
				maxNumber = 3;
			}
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_JD_CHANG_SHA
				|| _game_type_index == GameConstants.GAME_TYPE_THJ_JD_CS
				|| _game_type_index == GameConstants.GAME_TYPE_MJ_DT_SHA_MA
				|| _game_type_index == GameConstants.GAME_TYPE_MJ_CS_QY) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_JingDian_CS.GAME_RULE_PLAYER_3)))
				maxNumber = 3;
			if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TWO_PLAYER) != 0)
				maxNumber = 2;
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_JS_YANG_ZHONG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_YangZhong.GAME_RULE_PLAYER_THREE)))
				maxNumber = 3;
			return maxNumber;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_WHZ_YY) {
			if (params.getMap().containsKey(GameConstants.GAME_RULE_YYWHZ_TWO_PEOPLE)) {
				return 2;
			}
			maxNumber = 3;
			return maxNumber;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_WHZ_YIYANG) {
			if (params.getMap().containsKey(GameConstants.GAME_RULE_YIYANG_TWO_PEOPLE)) {
				return 2;
			}
			maxNumber = 3;
			return maxNumber;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_FLS_LX_TWO) {
			return 2;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_PHZ_SY) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_SYZP.GAME_RULE_PALYER_SYZP_THREE))) {
				maxNumber = 3;
			}
		}
		if (_game_type_index == GameConstants.GAME_TYPE_DEH_JD || _game_type_index == GameConstants.GAME_TYPE_DEH_MQ
				|| _game_type_index == GameConstants.GAME_TYPE_DEH_MG) {
			return 6;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_PUKE_ABZ_THREE) {
			return 3;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_PUKE_ABZ_FOUR) {
			return 4;
		}

		if (_game_type_index == GameConstants.GAME_TYPE_MJ_SHANG_QIU
				|| _game_type_index == GameConstants.GAME_TYPE_NEW_SHANG_QIU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_SQ.GAME_RULE_SQ_THREE))) {
				maxNumber = 3;

			}
		}

		if (_game_type_index == GameConstants.GAME_TYPE_XYKL) {
			if (params.getMap().containsKey(GameConstants.GAME_RULE_XYKL_PLAYER)) {
				maxNumber = params.getRuleValue(GameConstants.GAME_RULE_XYKL_PLAYER);
				return maxNumber;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_CHENZHOU
				|| game_type_index == GameConstants.GAME_TYPE_DT_MJ_HUNAN_CHEN_ZHOU) {
			if (GameDescUtil.has_rule(params.game_rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
				maxNumber = 3;
			}
			if (GameDescUtil.has_rule(params.game_rules, GameConstants.GAME_RULE_HUNAN_TWO)) {
				maxNumber = 2;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHZ_CHEN_ZHOU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_ChenZhou.GAME_RULE_PLAYER_3))) {
				maxNumber = 3;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_ChenZhou.GAME_RULE_PLAYER_4))) {
				maxNumber = 4;
			}
			return maxNumber;
		}
		if (game_type_index == GameConstants.GAME_TYPE_NEW_PHZ_CHEN_ZHOU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_New_ChenZhou.GAME_RULE_PLAYER_2))) {
				return 2;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_New_ChenZhou.GAME_RULE_PLAYER_3))) {
				return 3;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_New_ChenZhou.GAME_RULE_PLAYER_4))) {
				return 4;
			}
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHZ_CZ_SR) {
			maxNumber = 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHZ_LEI_YANG) {
			maxNumber = 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHZ_WU_GANG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_WuGang.GAME_RULE_PLAYER_3))) {
				maxNumber = 3;
			}
		}

		if (game_type_index == GameConstants.GAME_TYPE_PHZ_HS) {
			maxNumber = 3;
		}

		if (game_type_index == GameConstants.GAME_TYPE_PHZ_YONG_ZHOU) {
			maxNumber = 3;
		}

		if (game_type_index == GameConstants.GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI
				|| game_type_index == GameConstants.GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI_DT) {
			maxNumber = 3;
		}

		if (game_type_index == GameConstants.GAME_TYPE_GX_LIU_ZHOU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_GXLZ.GAME_RULE_PLAYER_OF_3))) {
				maxNumber = 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_GXLZ.GAME_RULE_PLAYER_OF_2))) {
				maxNumber = 2;
			}
		}

		if (game_type_index == GameConstants.GAME_TYPE_HUNAN_LILING
				|| game_type_index == GameConstants.GAME_TYPE_MJ_LI_LLING_TH) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_HUNAN_THREE))) {
				maxNumber = 3;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_GDY || game_type_index == GameConstants.GAME_TYPE_GDY_HB
				|| game_type_index == GameConstants.GAME_TYPE_GDY_NP) {
			if (GameDescUtil.has_rule(_game_rules, GameConstants_GY.GAME_RULE_GDY_ERREN)) {
				maxNumber = 2;
			}
			if (GameDescUtil.has_rule(_game_rules, GameConstants_GY.GAME_RULE_GDY_SANREN)) {
				maxNumber = 3;
			}
			if (GameDescUtil.has_rule(_game_rules, GameConstants_GY.GAME_RULE_GDY_SIREN)) {
				maxNumber = 4;
			}
			if (GameDescUtil.has_rule(_game_rules, GameConstants_GY.GAME_RULE_GDY_WUREN)) {
				maxNumber = 5;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHU_YX) {
			if (GameDescUtil.has_rule(_game_rules, GameConstants.GAME_RULE_TWO_PLAYER_PH)) {
				maxNumber = 2;
			}
			if (GameDescUtil.has_rule(_game_rules, GameConstants.GAME_RULE_THREE_PLAYER_PH)) {
				maxNumber = 3;
			}
			if (GameDescUtil.has_rule(_game_rules, GameConstants.GAME_RULE_FOUR_PLAYER_PH)) {
				maxNumber = 4;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_TONG_CHENG
				|| game_type_index == GameConstants.GAME_TYPE_MJ_TC_NEW) {
			if (GameDescUtil.has_rule(_game_rules, GameConstants_TC.GAME_RULE_PLAYER_2)) {
				maxNumber = 2;
			}
			if (GameDescUtil.has_rule(_game_rules, GameConstants_TC.GAME_RULE_PLAYER_3)) {
				maxNumber = 3;
			}
			if (GameDescUtil.has_rule(_game_rules, GameConstants_TC.GAME_RULE_PLAYER_4)) {
				maxNumber = 4;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_SSZ_JD || game_type_index == GameConstants.GAME_TYPE_SSZ_ZZ) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_SSZ_JD_PLAYER_FOUR))) {
				maxNumber = 4;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_SSZ_JD_PLAYER_THREE))) {
				maxNumber = 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_SSZ_JD_PLAYER_TWO))) {
				maxNumber = 2;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_HGW_HH) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_HGW_TWO_PLAYER))) {
				maxNumber = 2;
			} else {
				maxNumber = 3;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_FLS_LX_TWENTY
				|| game_type_index == GameConstants.GAME_TYPE_FLS_LX_THREE
				|| game_type_index == GameConstants.GAME_TYPE_HH_YX || game_type_index == GameConstants.GAME_TYPE_PHZ_YX
				|| game_type_index == GameConstants.GAME_TYPE_PHZ_CHD
				|| game_type_index == GameConstants.GAME_TYPE_HH_CHD
				|| game_type_index == GameConstants.GAME_TYPE_DHD_CHD
				|| game_type_index == GameConstants.GAME_TYPE_PHZ_XT
				|| game_type_index == GameConstants.GAME_TYPE_THK_HY
				|| game_type_index == GameConstants.GAME_TYPE_PHZ_GUILIN_ZP
				|| game_type_index == GameConstants.GAME_TYPE_468_HONG_GUAI_WAN
				|| game_type_index == GameConstants.GAME_TYPE_LBA_CHD
				|| game_type_index == GameConstants.GAME_TYPE_PHZ_BAYI_ZP
				|| game_type_index == GameConstants.GAME_TYPE_PHZ_CHD_DT
				|| game_type_index == GameConstants.GAME_TYPE_HH_CHD_DT
				|| game_type_index == GameConstants.GAME_TYPE_DHD_CHD_DT
				|| game_type_index == GameConstants.GAME_TYPE_LBA_CHD_DT) {

			maxNumber = 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_WMQ_AX_S || game_type_index == GameConstants.GAME_TYPE_WMQ_AX) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_WMQ_TWO_PLAYER))) {
				maxNumber = 2;
			} else
				maxNumber = 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_FLS_CS_LX || game_type_index == GameConstants.GAME_TYPE_FLS_HZ_LX
				|| game_type_index == GameConstants.GAME_TYPE_FLS_CS_LX_DT) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_HUNAN_THREE))) {
				maxNumber = 3;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_MJ_PU_YANG
				|| game_type_index == GameConstants.GAME_TYPE_NEW_PU_YANG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_PUYANG_SANREN))) {
				maxNumber = 3;
			} else {
				maxNumber = 4;
			}
		}

		if (game_type_index == GameConstants.GAME_TYPE_HENAN || game_type_index == GameConstants.GAME_TYPE_HENAN_LYGC
				|| game_type_index == GameConstants.GAME_TYPE_ZZ
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_ZHUAN_ZHUAN
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_ZMD
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_KF
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_NY
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_XX
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_PDS
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_XY || game_type_index == GameConstants.GAME_TYPE_HZ
				|| game_type_index == GameConstants.GAME_TYPE_CS
				|| game_type_index == GameConstants.GAME_TYPE_YUE_YANG_TDH
				|| game_type_index == GameConstants.GAME_TYPE_YUE_YANG_TDH_DT
				|| game_type_index == GameConstants.GAME_TYPE_HALL_HONG_ZHONG_MJ
				|| game_type_index == GameConstants.GAME_TYPE_HONG_ZHONG_MJ_TH
				|| game_type_index == GameConstants.GAME_TYPE_MJ_HONG_ZHONG_FEI
				|| game_type_index == GameConstants.GAME_TYPE_MJ_PING_XIANG_ZZ
				|| game_type_index == GameConstants.GAME_TYPE_MJ_YUYANG_HONGZHON
				|| game_type_index == GameConstants.GAME_TYPE_HALL_ZHUAN_ZHUAN_MJ
				|| game_type_index == GameConstants.GAME_TYPE_HALL_CHANG_SHA_MJ
				|| game_type_index == GameConstants.GAME_TYPE_HENAN_ZHOU_KOU
				|| game_type_index == GameConstants.GAME_TYPE_LILING_ZZ
				|| game_type_index == GameConstants.GAME_TYPE_ZHUZHOU_ZZ
				|| game_type_index == GameConstants.GAME_TYPE_NEW_HE_NAN
				|| game_type_index == GameConstants.GAME_TYPE_JIAO_ZUO_HUAN_HUAN
				|| game_type_index == GameConstants.GAME_TYPE_NEW_ZHU_MA_DIAN
				|| game_type_index == GameConstants.GAME_TYPE_NEW_KAI_FENG
				|| game_type_index == GameConstants.GAME_TYPE_NEW_NAN_YANG
				|| game_type_index == GameConstants.GAME_TYPE_NEW_SAN_MEN_XIA
				|| game_type_index == GameConstants.GAME_TYPE_NEW_XIN_XIANG
				|| game_type_index == GameConstants.GAME_TYPE_NEW_ZHOU_KOU
				|| game_type_index == GameConstants.GAME_TYPE_NEW_PING_DING_SHAN
				|| game_type_index == GameConstants.GAME_TYPE_NEW_LUO_YANG_GANG_CI
				|| game_type_index == GameConstants.GAME_TYPE_MJ_LYGC_DIAN_PAO
				|| game_type_index == GameConstants.GAME_TYPE_THJ_CS
				|| game_type_index == GameConstants.GAME_TYPE_MJ_HE_ZE
				|| game_type_index == GameConstants.GAME_TYPE_ZJK_HZ) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_HENAN_THREE))) {
				maxNumber = 3;
			}
			if (params.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TWO_PLAYER) != 0) {
				maxNumber = 2;
			}
		}

		if (game_type_index == GameConstants.GAME_TYPE_SEVER_OX || game_type_index == GameConstants.GAME_TYPE_SZOX
				|| game_type_index == GameConstants.GAME_TYPE_LZOX || game_type_index == GameConstants.GAME_TYPE_ZYQOX
				|| game_type_index == GameConstants.GAME_TYPE_MSZOX || game_type_index == GameConstants.GAME_TYPE_MFZOX
				|| game_type_index == GameConstants.GAME_TYPE_TBOX
				|| game_type_index == GameConstants.GAME_TYPE_SEVER_OX_LX
				|| game_type_index == GameConstants.GAME_TYPE_SZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_LZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_ZYQOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_MSZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_MFZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_TBOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_JDOX_YY
				|| game_type_index == GameConstants.GAME_TYPE_OX_YY) {
			maxNumber = GameConstants.GAME_PLAYER_OX;
		}

		if (game_type_index == GameConstants.GAME_TYPE_FKN) {
			maxNumber = 5;
		}

		if (BullFightUtil.isTypeFengKuang(game_type_index)) {
			maxNumber = 5;
		}

		if (game_type_index == GameConstants.GAME_TYPE_KLJDOX || game_type_index == GameConstants.GAME_TYPE_KLFKOX
				|| game_type_index == GameConstants.GAME_TYPE_KLTBOX
				|| game_type_index == GameConstants.GAME_TYPE_KLDGOX) {
			maxNumber = GameConstants.GAME_PLYER_EIGHT_OX;
		}
		if (game_type_index == GameConstants.GAME_TYPE_KLJX_EIGHT_MPQZ) {
			maxNumber = GameConstants.GAME_PLYER_EIGHT_OX;
		}
		if (game_type_index == GameConstants.GAME_TYPE_KLJX_NNSZ || game_type_index == GameConstants.GAME_TYPE_KLJX_ZYQZ
				|| game_type_index == GameConstants.GAME_TYPE_KLJX_SIX_MPQZ
				|| game_type_index == GameConstants.GAME_TYPE_KLJX_DGOX) {
			maxNumber = GameConstants.GAME_PLAYER_OX;
		}
		if (game_type_index == GameConstants.GAME_TYPE_CZWXOX) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_WX_TEN_PLAYER))) {
				maxNumber = 10;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_WX_EIGHT_PLAYER))) {
				maxNumber = 8;
			} else if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_WX_SIX_PLAYER))) {
				maxNumber = 6;
			} else
				maxNumber = GameConstants.GAME_PLAYER_OX;
		}
		if (_game_type_index == GameConstants.GAME_TYPE_SHI_DIAN_BAN) {
			maxNumber = GameConstants.GAME_PLYER_EIGHT_OX;
		}
		if (game_type_index == GameConstants.GAME_TYPE_EIGHT_OX || BullFightUtil.isEightOX(game_type_index)) {
			maxNumber = GameConstants.GAME_PLYER_EIGHT_OX;
		}

		if (game_type_index == GameConstants.GAME_TYPE_SG_JD || game_type_index == GameConstants.GAME_TYPE_SG_BJH
				|| game_type_index == GameConstants.GAME_TYPE_SG_SW) {
			maxNumber = 6;
		}

		if (game_type_index == GameConstants.GAME_TYPE_BTZ_YY || game_type_index == GameConstants.GAME_TYPE_BTZ_TB
				|| (GameConstants.GAME_TYPE_BTZ_TB_BEGIN <= _game_type_index
						&& GameConstants.GAME_TYPE_BTZ_TB_END >= _game_type_index)) {
			maxNumber = GameConstants.GAME_PLAYER_BTZ;
		}
		if (game_type_index == GameConstants.GAME_TYPE_HJK) {
			maxNumber = GameConstants.GAME_PLAYER_HJK;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PDK_SW || game_type_index == GameConstants.GAME_TYPE_PDK_JD
				|| game_type_index == GameConstants.GAME_TYPE_PDK_LZ
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_LL
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_LL
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_YY
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_YY
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_AH
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_AH
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_YUEY
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_YUEY
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_CZ
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_CZ
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_DT
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_DT
				|| game_type_index == GameConstants.GAME_TYPE_PDK_KL
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_KL
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_XY
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_XY
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_NP
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_NP
				|| game_type_index == GameConstants.GAME_TYPE_PDK_JD_LD
				|| game_type_index == GameConstants.GAME_TYPE_PDK_SW_LD) {

			maxNumber = 3;
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_TWO_PLAY))) {
				maxNumber = 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_THREE_PLAY))) {
				maxNumber = 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_FOUR_PLAY))) {
				maxNumber = 4;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_PDK_SC) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_PLAYER_TWO))) {
				maxNumber = 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_PLAYER_THREE))) {
				maxNumber = 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_PLAYER_FOUR))) {
				maxNumber = 4;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_HB_DYZP) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_HBDY_TWO_PLAYER))) {
				maxNumber = 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_HBDY_THREE_PLAYER))) {
				maxNumber = 3;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_GDY) {
			maxNumber = 3;
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_GDY_ERREN))) {
				maxNumber = 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_GDY_SANREN))) {
				maxNumber = 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_GDY_SIREN))) {
				maxNumber = 4;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_GDY_WUREN))) {
				maxNumber = 5;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_PDK_FP) {
			maxNumber = 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_YJ_EQS) {
			maxNumber = 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_DDZ_JD || game_type_index == GameConstants.GAME_TYPE_DDZ_HENAN) {
			maxNumber = 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_DDZ_JX) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_JX_DDZ_PLAYER_THREE))) {
				maxNumber = 3;
			} else {
				maxNumber = 4;
			}

		}
		if (game_type_index == GameConstants.GAME_TYPE_DBN) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_FOUR_PlAYER))) {
				maxNumber = 4;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_FIVE_PLAYER))) {
				maxNumber = 5;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_SIX_PLAYER))) {
				maxNumber = 6;
			}
		}
		if (BullFightUtil.isTypeDouBan(game_type_index)) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_FOUR_PlAYER))) {
				maxNumber = 4;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_FIVE_PLAYER))) {
				maxNumber = 5;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_SIX_PLAYER))) {
				maxNumber = 6;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_SEVER_OX || game_type_index == GameConstants.GAME_TYPE_SZOX
				|| game_type_index == GameConstants.GAME_TYPE_LZOX || game_type_index == GameConstants.GAME_TYPE_ZYQOX
				|| game_type_index == GameConstants.GAME_TYPE_MSZOX || game_type_index == GameConstants.GAME_TYPE_MFZOX
				|| game_type_index == GameConstants.GAME_TYPE_TBOX
				|| game_type_index == GameConstants.GAME_TYPE_SEVER_OX_LX
				|| game_type_index == GameConstants.GAME_TYPE_SZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_LZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_ZYQOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_MSZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_MFZOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_TBOX_LX
				|| game_type_index == GameConstants.GAME_TYPE_KSZOX) {
			maxNumber = GameConstants.GAME_PLAYER_OX;
		}

		if (BullFightUtil.isUniversalBullFight(game_type_index)) {
			maxNumber = GameConstants.GAME_PLAYER_OX;
		}

		if (game_type_index == GameConstants.GAME_TYPE_BTZ_YY || game_type_index == GameConstants.GAME_TYPE_TTZ
				|| game_type_index == GameConstants.GAME_TYPE_BTZ_TB
				|| (GameConstants.GAME_TYPE_BTZ_TB_BEGIN <= _game_type_index
						&& GameConstants.GAME_TYPE_BTZ_TB_END >= _game_type_index)) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(BTZConstants.BTZ_RULE_EIGHT))) {
				return 8;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(BTZConstants.BTZ_RULE_FIVE))) {
				return 6;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(BTZConstants.BTZ_RULE_FOUR))) {
				return 4;
			}
			maxNumber = GameConstants.GAME_PLAYER_BTZ;
		}
		if (game_type_index == GameConstants.GAME_TYPE_SSZ_XUPU) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_XP_SSZ_TWO_PEOPLE))) {
				return 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_XP_SSZ_THREE_PEOPLE))) {
				return 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_XP_SSZ_FOUR_PEOPLE))) {
				return 4;
			}
			maxNumber = 2;
		}
		if (game_type_index == GameConstants.GAME_TYPE_HUNAN_YIYANG_SZG
				|| game_type_index == GameConstants.GAME_TYPE_THJ_YI_YANG_SGZ) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_YiYang_SZG.GAME_RULE_PLAYER_3))) {
				return 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_YiYang_SZG.GAME_RULE_PLAYER_4))) {
				return 4;
			}
			maxNumber = 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_HJK) {
			maxNumber = GameConstants.GAME_PLAYER_HJK;
		}
		if (game_type_index == GameConstants.GAME_TYPE_LAOPAI_XUPU) {
			maxNumber = 4;
		}

		if (game_type_index == GameConstants.GAME_TYPE_PHZ_AH) {
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_ZJH_JD || game_type_index == GameConstants.GAME_TYPE_ZJH_HB) {
			return 6;
		}
		if (game_type_index == GameConstants.GAME_TYPE_TDZ_SHAN_XI) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(TDZConstants.TDZ_RULE_FOUR))) {
				return 4;
			}
			return 6;
		}
		if (game_type_index == GameConstants.GAME_TYPE_QF_YY || game_type_index == GameConstants.GAME_TYPE_PHZ_XP) {
			return 3;
		}

		if (game_type_index == GameConstants.GAME_TYPE_GUI_YANG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_GY.GAME_RULE_PLAYER_4))) {
				return 4;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_GY.GAME_RULE_PLAYER_3))) {
				return 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_GY.GAME_RULE_PLAYER_2))) {
				return 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_GY.GAME_RULE_PLAYER_3_DING_GUAI))) {
				return 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_GY.GAME_RULE_PLAYER_2_DING_GUAI))) {
				return 2;
			}
			return 4;
		}

		if (game_type_index == GameConstants.GAME_TYPE_GX_NAN_NING) {
			if (GameDescUtil.has_rule(_game_rule_index, GameConstants_GY.GAME_RULE_PLAYER_2))
				return 2;
			if (GameDescUtil.has_rule(_game_rule_index, GameConstants_GY.GAME_RULE_PLAYER_3))
				return 3;
			return 4;
		}

		if (game_type_index == GameConstants.GAME_TYPE_DT_MJ_HUNAN_CHEN_ZHOU) {
			if (GameDescUtil.has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_THREE)) {
				return 3; // 三人场
			} else if (GameDescUtil.has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_TWO)) {
				return 2; // 二人场
			} else {
				return 4; // 四人场
			}
		}

		if (game_type_index == GameConstants.GAME_TYPE_PHZ_WANG_CHENG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_WangCheng.GAME_RULE_PLAYER_2))) {
				return 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_WangCheng.GAME_RULE_PLAYER_3))) {
				return 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_WangCheng.GAME_RULE_PLAYER_4))) {
				return 4;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_GZP || game_type_index == GameConstants.GAME_TYPE_GZP_DDWF) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_WangCheng.GAME_RULE_TC_THREE_PEOPLE))) {
				return 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_WangCheng.GAME_RULE_TC_FOUR_PEOPLE))) {
				return 4;
			}
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHZ_NX) {
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHZ_SYBP) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_WangCheng.GAME_RULE_SYBP_TWO_PLAYER))) {
				return 2;
			}
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_LHQ_HD) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants.GAME_RULE_LHQ_HD_SAN_REN))) {
				return 3;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_SHAN_WEI) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_SW.GAME_RULE_PLAYER_2))) {
				return 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_SW.GAME_RULE_PLAYER_3))) {
				return 3;
			}
			return 4;
		}

		if (game_type_index == GameConstants.GAME_TYPE_LU_HE) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_LUHE.GAME_RULE_PLAYER_2))) {
				return 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(GameConstants_LUHE.GAME_RULE_PLAYER_3))) {
				return 3;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_CZBG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(CZBGConstants.CZBG_RULE_PLAYER_2))) {
				return 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(CZBGConstants.CZBG_RULE_PLAYER_3))) {
				return 3;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(CZBGConstants.CZBG_RULE_PLAYER_4))) {
				return 4;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(CZBGConstants.CZBG_RULE_PLAYER_5))) {
				return 5;
			}
			return 6;
		}
		if (game_type_index == GameConstants.GAME_TYPE_MJ_GZCG) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_MJ_GZCG.GAME_RULE_PLAYER_NUMBER_TWO))) {
				return 2;
			}
			if (FvMask.has_any(_game_rule_index, FvMask.mask(Constants_MJ_GZCG.GAME_RULE_PLAYER_NUMBER_THREE))) {
				return 3;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_HONG_ER_SHI
				|| GameConstants.GAME_TYPE_PK_HES_PJ == game_type_index
				|| GameConstants.GAME_TYPE_PK_HES_HY == game_type_index) {
			if (FvMask.has_any(_game_rule_index, FvMask.mask(HongErShiConstants.RULE_PLAYER_THREE))) {
				return 3;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_NEW_XU_CHANG) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HENAN_FOUR)) {
				return 4;
			}
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HENAN_THREE)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants.GAME_RULE_HENAN_TWO_PLAYER)) {
				return 2;
			}
			return 4;
		}

		if (game_type_index == GameConstants.GAME_TYPE_NEW_MOYANG_GUI) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_RENSHU_FOUR)) {
				return 4;
			}
			if (has_rule(_game_rules, GameConstants.GAME_RULE_RENSHU_THREE)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants.GAME_RULE_RENSHU_TWO)) {
				return 2;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_CP_DZHUA) {
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PHZ_XX) {
			if (has_rule(_game_rules, GameConstants_XiangXiang.GAME_RULE_PLAYER_3)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants_XiangXiang.GAME_RULE_PLAYER_2)) {
				return 2;
			}
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_MJ_DCWDH) {
			if (has_rule(_game_rules, GameConstants_DCWDH.GAME_RULE_PLAYER_2)) {
				return 2;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_MJ_HUANG_SHAN_TUN_XI) {
			if (has_rule(_game_rules, Constants_HuangShan.GAME_RULE_PLAYER_THREE)) {
				return 3;
			}
			if (has_rule(_game_rules, Constants_HuangShan.GAME_RULE_PLAYER_ER)) {
				return 2;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_KWX_XG_2D || game_type_index == GameConstants.GAME_TYPE_KWX_2D
				|| game_type_index == GameConstants.GAME_TYPE_MJ_NEW_3D_XYKWX
				|| game_type_index == GameConstants.GAME_TYPE_MJ_NEW_3D_XGKWX
				|| game_type_index == GameConstants.GAME_TYPE_MJ_KA_WU_XING_XG
				|| game_type_index == GameConstants.GAME_TYPE_MJ_KA_WU_XING) {
			if (has_rule(_game_rules, GameConstants_KWX.GAME_RULE_PLAYER_NUM_3)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants_KWX.GAME_RULE_PLAYER_NUM_2)) {
				return 2;
			}
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_NEW_YI_FENG) {
			if (has_rule(_game_rules, GameConstants.GAME_RULE_YF_FOUR)) {
				return 4;
			}
			if (has_rule(_game_rules, GameConstants.GAME_RULE_YF_THREE)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants.GAME_RULE_YF_TWO)) {
				return 2;
			}
			return 4;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PK_DTZ) {
			if (has_rule(_game_rules, GameConstants_DTZ.GMAE_RULE_PLAYER_2)) {
				return 2;
			}
			if (has_rule(_game_rules, GameConstants_DTZ.GMAE_RULE_PLAYER_3)) {
				return 3;
			}
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_DDZ_KL) {
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_GHZ_YJ) {
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_DDZ_LPS2) {
			return 2;
		}
		if (game_type_index == GameConstants.GAME_TYPE_DDZ_LPS3) {
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_PDK_SXSD) {
			if (has_rule(_game_rules, GameConstants_DTZ.GAME_RULE_THREE_SXSD)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants_DTZ.GAME_RULE_FOUR_SXSD)) {
				return 4;
			}
			return 3;
		}
		if (game_type_index == GameConstants.GAME_TYPE_MJ_ZHZJ) {
			if (has_rule(_game_rules, GameConstants_ZYZJ.GAME_RULE_FOUR_ZYZJ)) {
				return 4;
			}
			if (has_rule(_game_rules, GameConstants_ZYZJ.GAME_RULE_THREE_ZYZJ)
					|| has_rule(_game_rules, GameConstants_ZYZJ.GAME_RULE_SDG_ZYZJ)) {
				return 3;
			}
			if (has_rule(_game_rules, GameConstants_ZYZJ.GAME_RULE_TWO_ZYZJ)
					|| has_rule(_game_rules, GameConstants_ZYZJ.GAME_RULE_EDG_ZYZJ)) {
				return 2;
			}
			return 4;
		}
		return maxNumber;
	}

	public static int getMaxNumber(Room table, DescParams descParam) {
		if (table._game_type_index == GameConstants.GAME_TYPE_BTZ_YY
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_CS
				|| table._game_type_index == GameConstants.GAME_TYPE_HH_YYZHZ
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_ER_REN
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_XX
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_AH
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_WANG_CHENG
				|| table._game_type_index == GameConstants.GAME_TYPE_HUNAN_LILING
				|| table._game_type_index == GameConstants.GAME_TYPE_SSZ_XUPU
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_NX
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_SYBP
				|| table._game_type_index == GameConstants.GAME_TYPE_PHZ_HS
				|| table._game_type_index == GameConstants.GAME_TYPE_GX_NAN_NING
				|| table._game_type_index == GameConstants.GAME_TYPE_BTZ_TB
				|| table._game_type_index == GameConstants.GAME_TYPE_JDB
				|| table._game_type_index == GameConstants.GAME_TYPE_DZH
				|| table._game_type_index == GameConstants.GAME_TYPE_HAN_SHOU_WANG
				|| table._game_type_index == GameConstants.GAME_TYPE_MJ_DCWDH) {
			return table.getTablePlayerNumber();
		}
		return getMaxNumber(descParam);

	}

	// 支持 0~31
	public static boolean has_rule(int game_rule_index, int cbRule) {
		assert (cbRule < 32);

		return FvMask.has_any(game_rule_index, FvMask.mask(cbRule));
	}

	// 支持32位之后的
	public static boolean has_rule(int[] rules, int cbRule) {
		if (rules == null)
			return false;

		if (cbRule < 32) {
			return has_rule(rules[0], cbRule);
		}

		int mod = cbRule % 32;
		int index = (cbRule - mod) / 32;
		if (index >= rules.length)
			return false;

		return has_rule(rules[index], mod);
	}

}
