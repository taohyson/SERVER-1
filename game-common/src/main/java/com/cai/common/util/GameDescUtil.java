/**
 * 
 */
package com.cai.common.util;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.cai.common.constant.GameConstants;
import com.cai.common.constant.QJQFConstants;
import com.cai.common.constant.game.BTZConstants;
import com.cai.common.constant.game.Constants_CZ_SR;
import com.cai.common.constant.game.Constants_ChenZhou;
import com.cai.common.constant.game.Constants_CouYiSe;
import com.cai.common.constant.game.Constants_EZ;
import com.cai.common.constant.game.Constants_GXLZ;
import com.cai.common.constant.game.Constants_HuaXian;
import com.cai.common.constant.game.Constants_HuangShi;
import com.cai.common.constant.game.Constants_HuangZhou;
import com.cai.common.constant.game.Constants_JingDian_CS;
import com.cai.common.constant.game.Constants_LeiYang;
import com.cai.common.constant.game.Constants_MJ_GZCG;
import com.cai.common.constant.game.Constants_MJ_JiYuan;
import com.cai.common.constant.game.Constants_New_ChenZhou;
import com.cai.common.constant.game.Constants_WuGang;
import com.cai.common.constant.game.Constants_YYQF;
import com.cai.common.constant.game.Constants_YangZhong;
import com.cai.common.constant.game.GameConstants_AnHua;
import com.cai.common.constant.game.GameConstants_GY;
import com.cai.common.constant.game.GameConstants_HY258;
import com.cai.common.constant.game.GameConstants_HZLZG;
import com.cai.common.constant.game.GameConstants_HanShou;
import com.cai.common.constant.game.GameConstants_HanShouWang;
import com.cai.common.constant.game.GameConstants_JZ;
import com.cai.common.constant.game.GameConstants_KLDS;
import com.cai.common.constant.game.GameConstants_NanNing;
import com.cai.common.constant.game.GameConstants_SQ;
import com.cai.common.constant.game.GameConstants_SW;
import com.cai.common.constant.game.GameConstants_SYZP;
import com.cai.common.constant.game.GameConstants_TDH;
import com.cai.common.constant.game.GameConstants_WangCheng;
import com.cai.common.constant.game.GameConstants_YiYang;
import com.cai.common.constant.game.GameConstants_YiYang_SZG;
import com.cai.common.constant.game.MJConstants_HuNan_XiangTan;
import com.cai.common.constant.game.TDZConstants;
import com.cai.common.constant.game.dzd.DZDConstants;
import com.cai.common.constant.game.mj.Constants_HuoJia;
import com.cai.common.constant.game.mj.Constants_SiChuan;
import com.cai.common.constant.game.mj.Constants_TaoJiang;
import com.cai.common.constant.game.mj.Constants_YuanJiang;
import com.cai.common.constant.game.mj.GameConstants_LH;
import com.cai.common.constant.game.mj.GameConstants_LUHE;
import com.cai.common.constant.game.mj.GameConstants_ND;
import com.cai.common.constant.game.phz.Constants_YongZhou;
import com.cai.common.constant.game.sdh.SDHConstants_XT;
import com.cai.common.constant.game.wsk.GameConstants_NSB;
import com.cai.common.domain.ClubRuleModel;
import com.cai.common.domain.GameGroupModel;
import com.cai.common.domain.GameGroups;
import com.google.common.base.Strings;

/**
 * @author xwy
 *
 */
public class GameDescUtil {

	public static final ThreadLocal<DescParams> params = new ThreadLocal<DescParams>() {
		@Override
		protected DescParams initialValue() {
			return new DescParams();
		}
	};

	public static String get_henanxc_game_des(int _game_type_index, int[] rules, int baseScore, int max_times) {
		return get_game_des_henan_xc(_game_type_index, rules, baseScore, max_times);
	}

	public static String getGameDesc(int game_type_index, int game_rule_index) {
		return getGameDesc(params.get().setGameType(game_type_index).setGameRule(game_rule_index));
	}

	public static String getGameDesc(DescParams descParam) {
		String desc = getGameDescBase(descParam);

		// if(descParam.ruleMap!=null &&
		// descParam.ruleMap.get(GameConstants.GAME_RULE_IP) == 1){
		// desc += " 相同Ip不可进";
		// }
		return desc;
	}

	public static String getGameDescBase(DescParams descParam) {
		String des = "";
		int _game_type_index = descParam._game_type_index;
		int _game_rule_index = descParam._game_rule_index;
		int[] rules = descParam.game_rules;
		int _cur_round = descParam._cur_round;
		int _game_round = descParam._game_round;

		if (BullFightUtil.isUniversalBullFight(_game_type_index)) {
			return get_game_des_u_bull_fight(_game_type_index, _game_rule_index);
		} else if (BullFightUtil.isTypeDouBan(_game_type_index)) {
			return get_game_des_u_dou_ban_niu(_game_type_index, _game_rule_index);
		} else if (BullFightUtil.isTypeFengKuang(_game_type_index)) {
			return get_game_des_u_feng_kuang_niu(_game_type_index, _game_rule_index);
		}

		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PK_TONG_CHENG)) {
			return get_game_des_tcdg(_game_rule_index, descParam);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HE_ZE)) {
			return GameDescUtil.get_game_des_lygc_dian_pao(_game_rule_index,
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE_GANG),
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE_PAO),
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE), descParam);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_3D_E_ZHOU)) {
			return get_game_des_er_zhou(_game_rule_index, descParam);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YUAN_JIANG)) {
			return get_game_des_yuan_jiang(rules, descParam);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_THJ_YI_YANG)) {
			return get_game_des_hnyiyang(rules, _game_rule_index, descParam);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_THJ_YI_YANG_SGZ)) {
			return get_game_des_hnyiyang_szg(_game_rule_index, descParam);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YUAN_JIANG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DDZ_KL)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_YSDZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_QJQF)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_YXZD)) {
			return getCommonDesc(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YI_YANG_BA_SHI)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DDZ_LF)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_TXW)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_ZZSHA)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_GF_BAWANG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_DCTS)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HONG_ZHONG_FEI)) {
			return get_game_des_syhzOrpxzz(rules, _game_rule_index, _game_type_index);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_ZPTDH)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YI_YANG_QIN_YOU)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JX_TUIDAOHU)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_TDH_3D)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_ZHANG_PU)) {
			return get_game_des_zptdh(descParam);
		}

		if (descParam._game_type_index != GameConstants.GAME_TYPE_MJ_YUYANG_HONGZHON) {
			if (descParam._game_type_index >= 30000 && descParam.groupConfig != null) {
				return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
			}
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_XX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_ZN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_XNDG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GDY_NP)) {
			return getCommonDesc(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_CP_DZHUA)) {
			return getCommonDesc(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_RUI_JIN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_WEINAN)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		}

		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WHZ_YIYANG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WHZ_YY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LAOPAI_XUPU)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_SYBP)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI_DT)) {
			return getCommonDesc(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_YY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_YY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DEH_MG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DEH_MQ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DEH_JD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PUKE_ABZ_THREE)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PUKE_ABZ_FOUR)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_AH)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_AH)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_YUEY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_YUEY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DDZ_JX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_CZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_CZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_DT)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_DT)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_ZN_CZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_XY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_XY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_NP)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_NP)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_LD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_LD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_DL)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_DL)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_HN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_HN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GDY_RAR)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_ZZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_ZZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YGGP)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_JZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_JZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_CD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_CD)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_DMZ_YY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SC)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_KL)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_KL)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_ZN_KL)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_DMZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_XU_PU)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_XTDGK)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		}

		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_XTHH)) {
			return get_game_des_xthh(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU)) {
			return get_game_des_zhuzhou(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_AY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_AN_YANG)) {
			return get_game_des_ay(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_XY)) {
			return get_game_des_xy(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_LZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_LIN_ZHOU)) {
			return get_game_des_lz(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_XX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_XIN_XIANG)) {
			return get_game_des_henan_xinxiang(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_ZMD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_KF)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_NY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_PDS)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_HE_NAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JIAO_ZUO_HUAN_HUAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_ZHU_MA_DIAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_KAI_FENG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_NAN_YANG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_PING_DING_SHAN)) {
			return get_game_des_henan(_game_type_index, _game_rule_index, rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_HZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_HN_HONG_ZHONG)) {
			return get_game_des_hnhz(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_CS)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_CHANG_SHA_MJ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_THJ_CS)) {
			return get_game_des_cs(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_LH)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_LUO_HE)) {
			return get_game_des_henan_lh(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_LX_CG)) {
			return get_game_des_lxcg(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_LX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_LX_DP)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_LX_THREE)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_LX_TWO)) {
			return get_game_des_fls(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_LX_TWENTY)) {
			return get_game_des_fls_twenty(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HH_YX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_YX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_GUILIN_ZP)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_BAYI_ZP)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_CHD)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HH_CHD)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DHD_CHD)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_CHD_DT)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LBA_CHD_DT)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HH_CHD_DT)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DHD_CHD_DT)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LHQ_HD)
				|| (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LHQ_HY))
				|| (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LHQ_QD))) {
			return getCommonDesc(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_THK_HY)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WMQ_AX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_XT)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FPHZ_YX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HGW_HH)) {
			return getCommonDesc(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHU_YX)) {
			return get_game_des_phu(_game_rule_index, _game_round, _cur_round, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SEVER_OX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LZOX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_BTZ_YY)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_TTZ)) {
			return get_game_des_BTZ(_game_type_index, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_BTZ_TB)
				|| (GameConstants.GAME_TYPE_BTZ_TB_BEGIN <= _game_type_index
						&& GameConstants.GAME_TYPE_BTZ_TB_END >= _game_type_index)) {
			return get_game_des_BTZ_tb(_game_type_index, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SZOX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZYQOX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MSZOX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MFZOX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KSZOX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_TBOX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FKN)) {
			return get_game_des_fkn(_game_type_index, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DBN)) {
			return get_game_des_dbn(_game_type_index, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SEVER_OX_LX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LZOX_LX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SZOX_LX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZYQOX_LX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MSZOX_LX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MFZOX_LX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_TBOX_LX)) {
			return get_game_des_ox(_game_type_index, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HJK)) {
			return get_game_des_hjk(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SG_JD)) {
			return get_game_des_sg(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SG_SW)) {
			return get_game_des_sg(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SG_BJH)) {
			return get_game_des_sg(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_JD_LL)) {
			return get_game_des_pdk(_game_rule_index, _game_type_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_FP)) {
			return get_game_des_pdk(_game_rule_index, _game_type_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_LZ)) {
			return get_game_des_pdk(_game_rule_index, _game_type_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PDK_SW_LL)) {
			return get_game_des_pdk(_game_rule_index, _game_type_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DDZ_JD)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DDZ_DL)) {
			return get_game_des_ddz_jd(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DDZ_HENAN)) {
			return get_game_des_ddz_henan(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_CHENZHOU)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DT_MJ_HUNAN_CHEN_ZHOU)) {
			return get_game_des_hncz(_game_rule_index, rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YUE_YANG_ZHUA_XIA_ZI_DT)) {
			return get_game_des_fls_zxz(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_XC)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_XU_CHANG)) {
			return get_henanxc_game_des(_game_type_index, rules,
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE),
					descParam.getRuleValue(GameConstants.GAME_RULE_MAX_TIMES));
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_ZHOU_KOU)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_ZHOU_KOU)) {
			return GameDescUtil.get_game_des_he_nan_zhou_kou(descParam.game_rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_CS_LX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_CS_LX_DT)) {
			return GameDescUtil.get_game_des_cs_lx(_game_rule_index, descParam.game_rules, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_LYGC)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_LUO_YANG_GANG_CI)) {
			return GameDescUtil.get_game_des_lygc(_game_rule_index,
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE_GANG),
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE_CI),
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE), descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_LYGC_DIAN_PAO)) {
			return GameDescUtil.get_game_des_lygc_dian_pao(_game_rule_index,
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE_GANG),
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE_PAO),
					descParam.getRuleValue(GameConstants.GAME_RULE_BASE_SCORE), descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_QJQF)) {
			return get_game_des_qjqf(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_XIANG_TAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_XIANG_TAN_DT)) {
			return get_game_des_hunan_xt(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GX_LIU_ZHOU)) {
			return get_game_des_gxlz(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YUE_YANG_TDH)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_YUE_YANG_TDH_DT)) {
			return get_game_des_yytdh(rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_YONGZHOU)) {
			return get_game_des_hnyongzhou(rules, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_YIYANG)) {
			return get_game_des_hnyiyang(rules, _game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JIANGSU_ZHENJIANG)) {
			return get_game_des_jszz(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_SHAOYANG)) {
			return get_game_des_hnsy(rules, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_HENGYANG)) {
			return get_game_des_hnhengyang(rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HU_NAN_CHANG_DE)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_MJ_CD_DT)) {
			return get_game_des_hnchangde(rules, _game_rule_index, _game_type_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_SMX)) {
			return get_game_des_hnsmx(rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_LEI_YANG)) {
			return get_game_des_phz_leiyang(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_CHEN_ZHOU)) {
			return get_game_des_phz_chenzhou(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_PHZ_CHEN_ZHOU)) {
			return get_game_des_new_phz_chenzhou(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_CZ_SR)) {
			return get_game_des_phz_czsr(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_WU_GANG)) {
			return get_game_des_phz_wugang(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_YONG_ZHOU)) {
			return get_game_des_phz_yongzhou(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_NX)) {
			return get_game_des_phz_nx(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_XP)) {
			return get_game_des_phz_xp(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_WANG_CHENG)) {
			int rule = descParam.getRuleValue(7);
			if (rule == 0)
				rule = -1;
			return get_game_des_phz_wang_cheng(_game_rule_index, rule);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_LILING)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_LI_LLING_TH)) {
			return get_game_des_hnll(_game_type_index, _game_rule_index, rules, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_SYBP)) {
			return get_game_des_phz_sybp(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_LOU_DI_FANG_PAO_FA)) {
			return get_game_des_phz_ldfpf(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SANDAHA)) {
			return get_game_des_sdh(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_AH)) {
			return get_game_des_ah(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LAOPAI_XUPU)) {
			return get_game_des_lp_xp(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SSZ_XUPU)) {
			return get_game_des_ssz_xp(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_TDZ_SHAN_XI)) {
			return get_game_des_tdz_sx(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_JI_YUAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_JI_YUAN)) {
			return get_game_des_mj_jy(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_PU_YANG)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_PU_YANG)) {
			return get_game_des_mj_py(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_SY)) {
			return get_game_des_syzp(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JX_LE_PING)) {
			return get_game_des_jx_le_ping(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_HS)) {
			return get_game_des(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_SHANG_QIU)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_SHANG_QIU)) {
			return get_game_des_shang_qiu(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZJH_JD)) {
			return get_game_des_zjh_jd(descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZJH_HB)) {
			return get_game_des_zjh_hb(descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_QF_YY)) {
			return get_game_des_yyqf(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GX_NAN_NING)) {
			return get_game_des_nan_ning(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JS_YANG_ZHONG)) {
			return get_game_des_js_yang_zhong(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_DMZ)) {
			return get_game_des_wsk_dmz(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HU_BEI_HUANG_ZHOU)) {
			return get_game_des_hu_bei_huang_zhou(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JDOX_YY)) {
			return get_game_des_yy_ox(descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SANDAHA_XT)) {
			return get_game_des_sdh_xt(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JD_CHANG_SHA)) {
			return get_game_des_jd_chang_sha(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GDY)) {
			return get_game_des_gdy(rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GDY_HB)) {
			return get_game_des_gdy_hb(rules);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SSZ_JD)) {
			return get_game_des_ssz_jd(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SSZ_ZZ)) {
			return get_game_des_ssz_zz(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HU_BEI_HZ_LAI_GANG)) {
			return get_gaem_des_HZLZG(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HE_NAN_HUA_XIAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_HUA_ZHOU)) {
			return get_game_des_henan_hua_xian(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DZD)) {
			return get_game_des_dzd(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ER_ZHOU)) {
			return get_game_des_er_zhou(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_COU_YI_SE)) {
			return get_game_des_couyise(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENNAN_MJ_KLDS)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_LU_YI)) {
			return get_game_des_klds(descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_JDB)) {
			return get_game_des_jdb(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DZH)) {
			return get_game_des_jdb(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HAN_SHOU_WANG)) {
			return get_game_des_hsw(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HU_BEI_HUANG_SHI)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_3D_HUANG_SHI)) {
			return get_game_des_hu_bei_huang_shi(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GUI_YANG)) {
			return get_game_des_gy(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_XYKL)) {
			return get_game_des_xy_kl(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_JZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_JIAO_ZUO)) {
			return get_game_des_jz(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_LH)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_LUO_HE)) {
			return get_game_des_lh(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENG_YANG_258)) {
			return get_game_des_hy258(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GZP)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_GZP_DDWF)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_CZWXOX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_EIGHT_OX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PSH_OX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PSH_FK_OX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_KA_WU_XING)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SHAN_WEI)) {
			return get_game_des_sw(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DZD)) {
			return get_game_des_dzd(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DBD_JD)) {
			return get_game_des_dbd(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LBA_CHD)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_PHZ_BAYI_ZP)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLDGOX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLTBOX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLJDOX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLFKOX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLJX_NNSZ)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLJX_ZYQZ)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLJX_SIX_MPQZ)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLJX_EIGHT_MPQZ)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KLJX_DGOX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_OX_YY)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WMQ_AX_S)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_CZBG)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DEH_JD)) {
			return get_game_des_deh_jd(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_DEH_MQ)) {
			return get_game_des_deh_mq(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WHZ_YY)) {
			return get_game_des_whz_yy(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_TAO_JIANG)) {
			return get_game_des_tao_jiang(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LU_HE)) {
			return get_game_des_luhe(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUNAN_YIYANG_SZG)) {
			return get_game_des_hnyiyang_szg(_game_rule_index, descParam);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_GZCG)) {
			return get_game_des_mj_gzcg(rules, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_NSB)) {
			return get_game_des_nsb(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_NINGDU)) {
			return get_game_des_mj_nd(rules, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HUO_JIA)) {
			return get_game_des_mj_huojia(rules, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_TDH)) {
			return get_game_des_tdh(rules, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_XUE_ZHAN_DAO_DI)) {
			return get_game_des_mj_sichuan(rules, _game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_CP_DZHUI)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HB_DYZP)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HUAIHUA_OX)) {
			return getCommonDescEx(descParam.getMap(), descParam.groupConfig);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_MOYANG_GUI)) {
			return get_game_des_fls_lyg(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_LV_LIANG)) {
			return get_game_des_fls_sxll(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_YI_FENG)) {
			return get_game_des_fls_yf(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_SAN_MEN_XIA_NEW)) {
			return get_game_des_fls_smx(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_SONG_YUAN)) {
			return get_game_des_fls_sy(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_CHANG_CHUN)) {
			return get_game_des_fls_cc(_game_rule_index);
		} else if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_WSK_HTS)) {
			return get_game_des_fls_hts(_game_rule_index);
		}

		boolean hasFirst = false;
		if ((_game_type_index == GameConstants.GAME_TYPE_ZZ) || is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_HZ_LX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HENAN_ZHUAN_ZHUAN)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_ZHUAN_ZHUAN_MJ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_HONG_ZHONG_MJ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HONG_ZHONG_MJ_TH)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YUYANG_HONGZHON)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LILING_ZZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU_ZZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HONG_ZHONG_FEI)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_PING_XIANG_ZZ)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_NEW_SAN_MEN_XIA)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZJK_HZ)) {

			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZIMOHU)) {
				if (hasFirst) {
					des += " 自摸胡";
				} else {
					des += "自摸胡";
					hasFirst = true;
				}
			} else {
				if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HZ)
						|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_HONG_ZHONG_MJ)
						|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YUYANG_HONGZHON)
						|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HONG_ZHONG_MJ_TH)
						|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HONG_ZHONG_FEI)
						|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_PING_XIANG_ZZ)
						|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_FLS_HZ_LX)
						|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZJK_HZ)) {
					if (hasFirst) {
						des += " 可炮胡";
					} else {
						des += "可炮胡";
						hasFirst = true;
					}
				} else {
					if (hasFirst) {
						des += " 可炮胡(可抢杠胡)";
					} else {
						des += "可炮胡(可抢杠胡)";
						hasFirst = true;
					}
				}
			}

			if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU_ZZ)) {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_PIAO)) {
					if (hasFirst) {
						des += " 飘分";
					} else {
						des += "不飘分";
						hasFirst = true;
					}
				}
			}

			if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU_ZZ)) {
				int jiShiGang = descParam.getRuleValue(GameConstants.GAME_RULE_JI_SHI_GANG_FEN);
				if (jiShiGang > 0) {
					if (hasFirst) {
						des += " 及时杠";
					} else {
						des += "及时杠";
						hasFirst = true;
					}
				}

			}

			int allBeiLv = descParam.getRuleValue(GameConstants.GAME_RULE_ALL_BEI_LV);
			if (allBeiLv > 0) {
				if (hasFirst) {
					des += " " + allBeiLv + "倍率";
				} else {
					des += allBeiLv + "倍率";
					hasFirst = true;
				}
			}

			if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU_ZZ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_HONG_ZHONG_MJ)) {
				int beiLv = descParam.getRuleValue(GameConstants.GAME_RULE_BEI_LV);
				if (beiLv > 0) {
					if (hasFirst) {
						des += " " + beiLv + "倍率";
					} else {
						des += beiLv + "倍率";
						hasFirst = true;
					}
				} else {
					if (hasFirst) {
						des += "1倍率";
					} else {
						des += " 1倍率";
						hasFirst = true;
					}
				}
			}

			if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YUYANG_HONGZHON)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU_ZZ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_HONG_ZHONG_MJ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_ZHUAN_ZHUAN_MJ)) {
				if (descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) == 1) {
					if (hasFirst) {
						des += " 允许少人模式";
					} else {
						des += "允许少人模式";
						hasFirst = true;
					}
				}
			}
			if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU_ZZ)) {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO1)) {
					if (hasFirst) {
						des += " 坐飘1分";
					} else {
						des += "坐飘1分";
						hasFirst = true;
					}
				} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO2)) {
					if (hasFirst) {
						des += " 坐飘2分";
					} else {
						des += "坐飘2分";
						hasFirst = true;
					}
				} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO3)) {
					if (hasFirst) {
						des += " 坐飘3分";
					} else {
						des += "坐飘3分";
						hasFirst = true;
					}
				} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_DING_NIAO1)) {
					if (hasFirst) {
						des += " 坐飘4分";
					} else {
						des += "坐飘4分";
						hasFirst = true;
					}
				} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_DING_NIAO2)) {
					if (hasFirst) {
						des += " 坐飘5分";
					} else {
						des += "坐飘5分";
						hasFirst = true;
					}
				}
			}

			if ((is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_ZHUAN_ZHUAN_MJ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LILING_ZZ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZHUZHOU_ZZ))
					&& has_rule(rules, GameConstants.GAME_RULE_ZHUANG_NIAO)) {
				if (hasFirst) {
					des += " 按庄家中鸟";
				} else {
					des += "按庄家中鸟";
					hasFirst = true;
				}
			}

			if (((is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_HONG_ZHONG_MJ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YUYANG_HONGZHON)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HONG_ZHONG_FEI)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_PING_XIANG_ZZ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HONG_ZHONG_MJ_TH)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZJK_HZ))
					&& has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_PIAO))) {
				if (hasFirst) {
					des += " 飘分";
				} else {
					des += "飘分";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
				if (hasFirst) {
					des += " 三人场";
				} else {
					des += "三人场";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIDUI)) {
				if (hasFirst) {
					des += " 可胡七对";
				} else {
					des += "可胡七对";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_JIANPAOHU)) {
				if (hasFirst) {
					des += " 强制胡牌";
				} else {
					des += "强制胡牌";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_GANG_HU)) {
				if (hasFirst) {
					des += " 抢杠胡";
				} else {
					des += "抢杠胡";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHUANG_XIAN)) {
				if (hasFirst) {
					des += " 庄闲";
				} else {
					des += "庄闲";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_ALL_RANDOM_INDEX)) {
				if (hasFirst) {
					des += " 座位打乱";
				} else {
					des += "座位打乱";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONGZHONG)) {
				if (hasFirst) {
					des += " 红中癞子";
				} else {
					des += "红中癞子";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONG_ZHONG_BU_JIE_PAO)) {
				if (hasFirst) {
					des += " 红中不接炮";
				} else {
					des += "红中不接炮";
					hasFirst = true;
				}
			}
			if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HALL_HONG_ZHONG_MJ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_YUYANG_HONGZHON)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HONG_ZHONG_FEI)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_PING_XIANG_ZZ)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_HONG_ZHONG_MJ_TH)
					|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZJK_HZ)) {
				if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONG_ZHONG_8_HZ)) {
					if (hasFirst) {
						des += " 8红中";
					} else {
						des += "8红中";
						hasFirst = true;
					}
				}
				if (has_rule(rules, GameConstants.GAME_RULE_NIAO_FEN_1)) {
					if (hasFirst) {
						des += " 鸟1分";
					} else {
						des += "鸟1分";
						hasFirst = true;
					}
				}
				if (has_rule(rules, GameConstants.GAME_RULE_NIAO_FEN_2)) {
					if (hasFirst) {
						des += " 鸟2分";
					} else {
						des += "鸟2分";
						hasFirst = true;
					}
				}
			}
		} else if (_game_type_index == GameConstants.GAME_TYPE_CS) {

		} else if (_game_type_index == GameConstants.GAME_TYPE_ZHUZHOU) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_SCORE_ADD)) {
				if (hasFirst) {
					des += " 加法记分";
				} else {
					des += "加法记分";
					hasFirst = true;
				}
			} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_SCORE_MUTIP)) {
				if (hasFirst) {
					des += " 乘法记分";
				} else {
					des += "乘法记分";
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO1)) {
			if (hasFirst) {
				des += " 抓鸟:1个";
			} else {
				des += "抓鸟:1个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				des += " 抓鸟:2个";
			} else {
				des += "抓鸟:2个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				des += " 抓鸟:4个";
			} else {
				des += "抓鸟:4个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				des += " 抓鸟:6个";
			} else {
				des += "抓鸟:6个";
				hasFirst = true;
			}
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_YI_MA_QUAN_ZHONG)) {
			if (hasFirst) {
				des += " 一码全中";
			} else {
				des += "一码全中";
				hasFirst = true;
			}
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_MO_JI_JIANG_JI)) {
			if (hasFirst) {
				des += " 摸几奖几";
			} else {
				des += "摸几奖几";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不抓鸟";
			} else {
				des += "不抓鸟";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_BU_TONG_PAO)) {
			if (hasFirst) {
				des += " 不通炮";
			} else {
				des += "不通炮";
				hasFirst = true;
			}
		}

		return des;
	}

	/** 通用存在 xml配置类型4,2的显示 */
	private static String get_game_des_zptdh(DescParams descParam) {
		StringBuffer b = new StringBuffer();
		descParam.groupConfig.getGroupModels().forEach((group) -> {
			group.getRuleModels().forEach((rule) -> {
				Integer value = descParam.getMap().get(rule.getGame_rule());
				if (value == null) {
					return;
				}
				if (rule.getIsClubRuleHide() == 1) {
					return;
				}

				if (group.getType() == 4) {
					String[] values = rule.getValue().split(",");
					for (int i = 0; i < values.length; i++) {
						if (String.valueOf(value).equals(values[i])) {
							b.append(rule.getDescription().split(";")[i]);
							break;
						}
					}
				} else if (group.getType() == 2) {
					String des = StringUtils.isNotBlank(rule.getDescription()) ? rule.getDescription()
							: (StringUtils.isNotBlank(group.getDescription()) ? group.getDescription() : "");
					b.append(des);
					b.append(value);
				} else {
					b.append(rule.getDescription());
				}
				b.append(" ");
			});

		});
		return b.toString();
	}

	public static String get_game_des_tdh(int[] rules, int game_rule_index) {
		StringBuilder des = new StringBuilder();
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_NON_DAI_FENG)) {
			des.append("不带风");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_NON_DAI_WAN)) {
			des.append("不带万");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_DAI_FENG_DAI_WAN)) {
			des.append("带风带万");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_QIANG_GANG_HU)) {
			des.append(" 抢杠胡");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_GEN_ZHUANG)) {
			des.append(" 跟庄");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_GANG_BAO_QUAN_BAO)) {
			des.append(" 杠爆全包");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_MAI_MA)) {
			des.append(" 买马");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_MA_GEN_DI_FEN)) {
			des.append(" 马跟底分");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_MA_GEN_GANG)) {
			des.append(" 马跟杠");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_JIE_JIE_GAO)) {
			des.append(" 节节高");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_HU_QI_DUI)) {
			des.append(" 可胡七对");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_GUI_PAI)) {
			des.append(" 鬼牌");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_WU_GUI_JIA_BEI)) {
			des.append(" 无鬼加倍");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_HAI_DI_HU_JIA_BEI)) {
			des.append(" 海底胡加倍");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_SI_GUI_HU)) {
			des.append(" 四鬼胡");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_HZ_GUI)) {
			des.append(" 红中鬼");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_FAN_GUI)) {
			des.append(" 翻鬼");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_FAN_SHUANG_GUI)) {
			des.append(" 翻双鬼");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_SI_HUA_GUI)) {
			des.append(" 4花鬼");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_BA_HUA_GUI)) {
			des.append(" 8花鬼");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_BB_GUI)) {
			des.append(" 白板鬼");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_MA_2)) {
			des.append(" 买2马");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_MA_4)) {
			des.append(" 买4马");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_MA_6)) {
			des.append(" 买6马");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_MA_8)) {
			des.append(" 买8马");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_YI_MA_QUAN_ZHONG)) {
			des.append(" 一马全中");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_DI_FEN_1)) {
			des.append(" 1底分");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_DI_FEN_2)) {
			des.append(" 2底分");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_DI_FEN_3)) {
			des.append(" 3底分");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_QI_DUI_JIA_BEI)) {
			des.append(" 七对加倍");
		}
		if (has_rule(game_rule_index, GameConstants_TDH.GAME_RULE_QIANG_GANG_QUAN_BAO)) {
			des.append(" 抢杠全包");
		}
		return des.toString();
	}

	public static String get_game_des_lh(int _game_rule_index) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_ZI_MO)) {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_DIAN_PAO)) {
			if (hasFirst) {
				des += " 点炮胡";
			} else {
				des += "点炮胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_FENG_JIANG_DUAN_MEN)) {
			if (hasFirst) {
				des += " 风将断门";
			} else {
				des += "风将断门";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_WU_FENG_JIANG_DUAN_MEN)) {
			if (hasFirst) {
				des += " 无风将断门";
			} else {
				des += "无风将断门";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_BAO_TING)) {
			if (hasFirst) {
				des += " 报听";
			} else {
				des += "报听";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_BU_BAO_TING)) {
			if (hasFirst) {
				des += " 不报听";
			} else {
				des += "不报听";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_DAI_PAO)) {
			if (hasFirst) {
				des += " 带跑";
			} else {
				des += "带跑";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_BU_DAI_PAO)) {
			if (hasFirst) {
				des += " 不带跑";
			} else {
				des += "不带跑";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_GANG_PAO)) {
			if (hasFirst) {
				des += " 杆跑";
			} else {
				des += "杆跑";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_QIANG_TING_YOU_CAI)) {
			if (hasFirst) {
				des += " 抢听有财";
			} else {
				des += "抢听有财";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_FENG_JIANG_JIA_DI)) {
			if (hasFirst) {
				des += " 风将加底";
			} else {
				des += "风将加底";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_ZHUANG_JIA_JIA_DI)) {
			if (hasFirst) {
				des += " 庄家加底";
			} else {
				des += "庄家加底";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_CHU_MEN_DUAN)) {
			if (hasFirst) {
				des += " 出门断";
			} else {
				des += "出门断";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_LH.GAME_RULE_LH_Qi_DUI_JIA_BEI)) {
			if (hasFirst) {
				des += " 七对加倍";
			} else {
				des += "七对加倍";
				hasFirst = true;
			}
		}

		return des;
	}

	public static String get_game_des_yy_ox(DescParams params) {
		int[] gameRuleIndexEx = params.game_rules;
		String des = "";

		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_FAN_BEN)) {
			des += "翻倍" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_PING_BEN)) {
			des += "平倍" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_RBOX)) {
			des += "抢庄牛牛" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_LBOX)) {
			des += "轮庄牛牛" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_ZBOX)) {
			des += "牛牛坐庄" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_MBOX)) {
			des += "牌大坐庄" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_MSOX)) {
			des += "开三张牛牛" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_KFOX)) {
			des += "看四张牛牛" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_NOKEJIN)) {
			des += "中途不可进" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_KPTX)) {
			des += "开牌特效" + "\n";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_GDYF)) {
			des += "固定压分:" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_ONE_FEN)) {
			des += "1分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_TWO_FEN)) {
			des += "2分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_THREE_FEN)) {
			des += "3分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_FOUR_FEN)) {
			des += "4分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_FIVE_FEN)) {
			des += "5分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_SIX_FEN)) {
			des += "6分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_SEVEN_FEN)) {
			des += "7分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_EIGHT_FEN)) {
			des += "8分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_NINE_FEN)) {
			des += "9分" + " ";
		}
		if (GameDescUtil.has_rule(gameRuleIndexEx, GameConstants.GAME_RULE_JDOX_TEN_FEN)) {
			des += "10分" + " ";
		}
		return des;
	}

	/**
	 * 河南窟窿带神描述
	 * 
	 * @param _game_rule_index
	 * @return
	 */
	public static String get_game_des_klds(DescParams descParams) {
		String des = "";
		boolean hasFirst = false;
		int _game_rule_index = descParams._game_rule_index;
		if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_BUHUANSHEN)) {
			if (hasFirst) {
				des += " 不换神";
			} else {
				des += "不换神";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_HUANSHEN)) {
			if (hasFirst) {
				des += " 换神";
			} else {
				des += "换神";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_BUFENTONYI)) {
			if (hasFirst) {
				des += " 优先同意";
			} else {
				des += "优先同意";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_QUANBUTONGYI)) {
			if (hasFirst) {
				des += " 全部同意";
			} else {
				des += "全部同意";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_DI1)) {
			if (hasFirst) {
				des += " 底分1";
			} else {
				des += "底分1";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_DI5)) {
			if (hasFirst) {
				des += " 底分5";
			} else {
				des += "底分5";
				hasFirst = true;
			}

		} else {
			if (hasFirst) {
				des += " 底分" + descParams.getRuleValue(GameConstants_KLDS.GAME_RULE_DI_FENG_KEY);
			} else {
				des += "底分" + descParams.getRuleValue(GameConstants_KLDS.GAME_RULE_DI_FENG_KEY);
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_XIAPAO)) {
			if (hasFirst) {
				des += " 下跑";
			} else {
				des += "下跑";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_KLDS.GAME_RULE_KLDS_BUPAO)) {
			if (hasFirst) {
				des += " 不跑";
			} else {
				des += "不跑";
				hasFirst = true;
			}
		}

		return des;
	}

	/**
	 * 商丘麻将描述
	 * 
	 * @param _game_rule_index
	 * @return
	 */
	public static String get_game_des_shang_qiu(int _game_rule_index) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_FOUR)) {
			if (hasFirst) {
				des += " 四人场";
			} else {
				des += "四人场";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_YOU_HUA_WU_SHU)) {
			if (hasFirst) {
				des += " 有花无财";
			} else {
				des += "有花无财";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_YOU_SHU_WU_HUA)) {
			if (hasFirst) {
				des += " 有财无花";
			} else {
				des += "有财无花";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_WU_HUA_WU_SHU)) {
			if (hasFirst) {
				des += " 无花无财";
			} else {
				des += "无花无财";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_AN_GANG_SUO_SI)) {
			if (hasFirst) {
				des += " 暗杠锁死";
			} else {
				des += "暗杠锁死";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_QING_YI_SE)) {
			if (hasFirst) {
				des += " 清一色，断两门";
			} else {
				des += "清一色，断两门";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_BU_DAI_FENG)) {
			if (hasFirst) {
				des += " 不带风";
			} else {
				des += "不带风";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_BAO_TING)) {
			if (hasFirst) {
				des += " 报听";
			} else {
				des += "报听";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_KE_HU_QI_DUI)) {
			if (hasFirst) {
				des += " 可胡七对";
			} else {
				des += "可胡七对";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_YING_KOU)) {
			if (hasFirst) {
				des += " 硬扣";
			} else {
				des += "硬扣";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_LIANG_SI_DA_YI)) {
			if (hasFirst) {
				des += " 亮四打一";
			} else {
				des += "亮四打一";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_XIA_PAO)) {
			if (hasFirst) {
				des += " 下跑";
			} else {
				des += "下跑";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_JUE_MEN)) {
			if (hasFirst) {
				des += " 绝门";
			} else {
				des += "绝门";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_QIA_ZHANG)) {
			if (hasFirst) {
				des += " 掐张";
			} else {
				des += "掐张";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_MEN_QING)) {
			if (hasFirst) {
				des += " 门清";
			} else {
				des += "门清";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_AN_KA)) {
			if (hasFirst) {
				des += " 暗卡";
			} else {
				des += "暗卡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_SQ.GAME_RULE_SQ_ZIMO_JIA_CHENG)) {
			if (hasFirst) {
				des += " 自摸加成";
			} else {
				des += "自摸加成";
				hasFirst = true;
			}
		}

		return des;
	}

	public static String get_game_des(int _game_rule_index, DescParams descParam) {
		StringBuilder buffer = new StringBuilder();

		if (has_rule(_game_rule_index, GameConstants_HanShou.GAME_RULE_DAO_1)) {
			buffer.append(" 倒1");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShou.GAME_RULE_DAO_2)) {
			buffer.append(" 倒3");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShou.GAME_RULE_DAO_3)) {
			buffer.append(" 倒5");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShou.GAME_RULE_DAO_8)) {
			buffer.append(" 倒8");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShou.GAME_RULE_DAO_10)) {
			buffer.append(" 倒10");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShou.GAME_RULE_FENG_DING)) {
			buffer.append(" 20分封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShou.GAME_RULE_NON_FENG_DING)) {
			buffer.append(" 无封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShou.GAMR_RULE_TI_SHI)) {
			buffer.append(" 提示");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_RANDOM_SEAT) == 1) {
			buffer.append(" 随机坐庄");
		}
		return buffer.toString();
	}

	private static String get_game_des_hnll(int _game_type_index, int _game_rule_index, int[] rules,
			DescParams descParam) {
		boolean hasFirst = false;
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZIMOHU)) {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIANGGANGHU)) {
			if (hasFirst) {
				des += " 可炮胡";
			} else {
				des += "可炮胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_HONGZHONG)) {
			if (hasFirst) {
				des += " 红中癞子";
			} else {
				des += "红中癞子";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIDUI)) {
			if (hasFirst) {
				des += " 可胡七对";
			} else {
				des += "可胡七对";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_JIANPAOHU)) {
			if (hasFirst) {
				des += " 强制胡牌";
			} else {
				des += "强制胡牌";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_GANG_HU)) {
			if (hasFirst) {
				des += " 抢杠胡";
			} else {
				des += "抢杠胡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHUANG_XIAN)) {
			if (hasFirst) {
				des += " 庄闲";
			} else {
				des += "庄闲";
				hasFirst = true;
			}
		}

		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_LI_LLING_TH)) {
			if (has_rule(rules, GameConstants.GAME_RULE_ZHUANG_NIAO)) {
				if (hasFirst) {
					des += " 按庄中鸟";
				} else {
					des += "按庄中鸟";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 159抓鸟";
				} else {
					des += "159抓鸟";
					hasFirst = true;
				}
			}
		}

		boolean niao_flag = true;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				des += " 抓鸟:2个";
			} else {
				des += "抓鸟:2个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				des += " 抓鸟:4个";
			} else {
				des += "抓鸟:4个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				des += " 抓鸟:6个";
			} else {
				des += "抓鸟:6个";
				hasFirst = true;
			}
		} else {
			niao_flag = false;
			if (hasFirst) {
				des += " 不抓鸟";
			} else {
				des += "不抓鸟";
				hasFirst = true;
			}
		}

		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_LI_LLING_TH)
				&& has_rule(rules, GameConstants.GAME_RULE_NIAO_BU_ZHONG_SUAN_QUAN_ZHONG)) {
			if (hasFirst) {
				des += " 不中算全中";
			} else {
				des += "不中算全中";
			}

		}
		if (niao_flag) {
			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_NIAO_FEN_2)) {
				if (hasFirst) {
					des += " 2分鸟";
				} else {
					des += "2分鸟";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 1分鸟";
				} else {
					des += "1分鸟";
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_PIAO)) {
			if (hasFirst) {
				des += " 加飘";
			} else {
				des += "加飘";
			}
		}

		int value = descParam.getRuleValue(GameConstants.GAME_RULE_ALL_BEI_LV);
		if (value > 0) {
			if (hasFirst) {
				des += " 倍率(" + value + "倍)";
			} else {
				des += "倍率(" + value + "倍)";
			}
		}

		return des;
	}

	private static String get_game_des_qjqf(int _game_rule_index) {
		String des = "必打";
		if (has_rule(_game_rule_index, QJQFConstants.QJQF_RULE_ZHA)) {
			des += " 总炸";
		}
		return des;
	}

	private static String get_game_des_fls_zxz(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.ZXZ_ZHUANG_XIAN)) {
			des += " 庄闲";
		}
		if (has_rule(_game_rule_index, GameConstants.ZXZ_MAN_TIAN_FEI)) {
			des += " 满天飞";
		}
		return des;
	}

	private static String get_game_des_fls_lyg(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SUIJIFAN_GUI)) {
			des += " 随机翻鬼";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONGZHONG_GUI)) {
			des += " 红中做鬼";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BUSHA_GUI)) {
			des += " 不杀鬼";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHA_GUI)) {
			des += " 杀鬼";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SUIJIZUO)) {
			des += " 随机坐庄";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_RENSHU_FOUR)) {
			des += " 4人玩法";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_RENSHU_THREE)) {
			des += " 3人玩法";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_RENSHU_TWO)) {
			des += " 2人玩法";
		}
		return des;
	}

	private static String get_game_des_fls_sxll(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PING_HU)) {
			des += " 平胡";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DAN_HAO)) {
			des += " 单耗";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHUANG_HAO)) {
			des += " 双耗";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TE_SHU_HU)) {
			des += " 七小对、豪华七小对、清一色、一条龙番倍";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DAI_ZHUANHG)) {
			des += " 带庄";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BAO_GANG)) {
			des += " 点杠包杠";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QIANG_HU)) {
			des += " 强制胡牌";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DA_GUO_ZI)) {
			des += " 打锅子";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DA_BAO_HU)) {
			des += " 点炮包杠";
		}
		return des;
	}

	private static String get_game_des_fls_yf(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_GUI_HUO)) {
			des += "对火";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BU_DUI_HUO)) {
			des += "不对火";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DUI_PIAO)) {
			des += " 对飘";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BU_DUI_PIAO)) {
			des += " 不对飘";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHUI_ZHUANG)) {
			des += " 追庄";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BU_ZHUI_ZHUANG)) {
			des += " 不追庄";
		}
		return des;
	}

	private static String get_game_des_fls_smx(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZI_MO_HU_SMX)) {
			des += " 自摸胡";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DIAN_PAO_HU_SMX)) {
			des += " 点炮胡";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BU_DAI_HUN_SMX)) {
			des += " 不带混";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHANG_HUN_SMX)) {
			des += " 上混";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YUAN_HUN_SMX)) {
			des += " 原混";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DAI_FENG_SMX)) {
			des += " 带风牌";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BIAO_YAN_SMX)) {
			des += " 表演";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAI_PAO_SMX)) {
			des += " 买跑";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DAI_GANG_PAO_SMX)) {
			des += " 杠带跑";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_AN_JIA_BEI_SMX)) {
			des += " 暗杠加倍";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_GANG_SUI_HU_SMX)) {
			des += " 杠随胡走";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HAVE_QI_DUI_SMX)) {
			des += " 可胡七对";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DOUBLE_QI_DUI_SMX)) {
			des += " 七对加倍";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_JIA_DI_SMX)) {
			des += " 庄家加底";
		}
		return des;
	}

	private static String get_game_des_fls_sy(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_SY)) {
			des += " 4人";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_SY)) {
			des += " 3人";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_SY)) {
			des += " 2人";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SAN_QI_SY)) {
			des += " 三七夹";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SI_QING_SY)) {
			des += " 四清";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_KUAI_BAO_SY)) {
			des += " 快宝";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BAO_PEI_SY)) {
			des += " 未报听点炮点炮包赔三家";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_KAN_DUI_BAO_SY)) {
			des += " 坎对宝";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_GANG_KAI_SY)) {
			des += " 杠上开花";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QI_DUI_SY)) {
			des += " 七小对";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DUI_BAO_FAN_SY)) {
			des += " 对宝翻倍";
		}
		return des;
	}

	private static String get_game_des_fls_cc(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_CC)) {
			des += " 4人";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_CC)) {
			des += " 3人";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_CC)) {
			des += " 2人";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BAO_PEI_CC)) {
			des += " 未上听点炮包赔";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FEI_DAO_CC)) {
			des += " 小鸡飞蛋";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SAN_FENG_CC)) {
			des += " 三风蛋";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XIA_DAN_ZHAN_CC)) {
			des += " 下蛋算站立";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DAI_QUE_MEN_CC)) {
			des += " 带缺门";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_CHONG_BAO_FAN_CC)) {
			des += " 冲宝翻倍";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HAO_QI_FAN_CC)) {
			des += " 豪华七对翻倍";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HU_XU_TING_CC)) {
			des += " 胡牌必须上听";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BU_XIAN_CC)) {
			des += " 飘胡七对不限三色和幺九";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHUA_WAN_HUANG_CC)) {
			des += " 抓完荒庄";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIU_QI_DUN_CC)) {
			des += " 留七墩";
		}
		return des;
	}

	private static String get_game_des_fls_hts(int _game_rule_index) {

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MING_HTS)) {
			des += " 明3";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_CC)) {
			des += " 暗3";
		}
		return des;
	}

	private static String get_game_des_syhzOrpxzz(int[] rules, int _game_rule_index, int _game_type_index) {
		Boolean hasFirst = false;
		String des = "";
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_HONG_ZHONG_FEI)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
				if (hasFirst) {
					des += " 三人场";
				} else {
					des += "三人场";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
				if (hasFirst) {
					des += " 自摸胡";
				} else {
					des += "自摸胡";
					hasFirst = true;
				}
			}

			if (hasFirst) {
				des += " 飘分";
			} else {
				des += "飘分";
				hasFirst = true;
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIDUI)) {
				if (hasFirst) {
					des += " 可胡七对";
				} else {
					des += "可胡七对";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_JIANPAOHU)) {
				if (hasFirst) {
					des += " 强制胡牌";
				} else {
					des += "强制胡牌";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_GANG_HU)) {
				if (hasFirst) {
					des += " 抢杠胡";
				} else {
					des += "抢杠胡";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHUANG_XIAN)) {
				if (hasFirst) {
					des += " 庄闲";
				} else {
					des += "庄闲";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_ALL_RANDOM_INDEX)) {
				if (hasFirst) {
					des += " 座位打乱";
				} else {
					des += "座位打乱";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONGZHONG)) {
				if (hasFirst) {
					des += " 红中癞子";
				} else {
					des += "红中癞子";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONG_ZHONG_BU_JIE_PAO)) {
				if (hasFirst) {
					des += " 红中不接炮";
				} else {
					des += "红中不接炮";
					hasFirst = true;
				}
			}
			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONG_ZHONG_8_HZ)) {
				if (hasFirst) {
					des += " 8红中";
				} else {
					des += "8红中";
					hasFirst = true;
				}
			}
			if (has_rule(rules, GameConstants.GAME_RULE_NIAO_FEN_1)) {
				if (hasFirst) {
					des += " 鸟1分";
				} else {
					des += "鸟1分";
					hasFirst = true;
				}
			}
			if (has_rule(rules, GameConstants.GAME_RULE_NIAO_FEN_2)) {
				if (hasFirst) {
					des += " 鸟2分";
				} else {
					des += "鸟2分";
					hasFirst = true;
				}
			}
			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_DAIFENG)) {
				if (hasFirst) {
					des += " 带风";
				} else {
					des += "带风";
					hasFirst = true;
				}
			}
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_PING_XIANG_ZZ)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
				if (hasFirst) {
					des += " 三人场";
				} else {
					des += "三人场";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZIMOHU)) {
				if (hasFirst) {
					des += " 自摸胡";
				} else {
					des += "自摸胡";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 可炮胡";
				} else {
					des += "可炮胡";
					hasFirst = true;
				}
			}

			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIDUI)) {
				if (hasFirst) {
					des += " 可胡七对";
				} else {
					des += "可胡七对";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_JIANPAOHU)) {
				if (hasFirst) {
					des += " 强制胡牌";
				} else {
					des += "强制胡牌";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_GANG_HU)) {
				if (hasFirst) {
					des += " 抢杠胡";
				} else {
					des += "抢杠胡";
					hasFirst = true;
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
				if (hasFirst) {
					des += " 抓2鸟";
				} else {
					des += "抓2鸟";
					hasFirst = true;
				}
			} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
				if (hasFirst) {
					des += " 抓4鸟";
				} else {
					des += "抓4鸟";
					hasFirst = true;
				}
			} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
				if (hasFirst) {
					des += " 抓6鸟";
				} else {
					des += "抓6鸟";
					hasFirst = true;
				}
			} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO8)) {
				if (hasFirst) {
					des += " 抓8鸟";
				} else {
					des += "抓8鸟";
					hasFirst = true;
				}
			} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_YI_MA_QUAN_ZHONG)) {
				if (hasFirst) {
					des += " 抓飞鸟";
				} else {
					des += "抓飞鸟";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 不抓鸟";
				} else {
					des += "不抓鸟";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_ALL_RANDOM_INDEX)) {
				if (hasFirst) {
					des += " 座位打乱";
				} else {
					des += "座位打乱";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_258)) {
				if (hasFirst) {
					des += " 可吃牌";
				} else {
					des += "可吃牌";
					hasFirst = true;
				}
			}

			if (has_rule(rules, GameConstants.GAME_RULE_NIAO_FEN_1)) {
				if (hasFirst) {
					des += " 鸟1分";
				} else {
					des += "鸟1分";
					hasFirst = true;
				}
			}
			if (has_rule(rules, GameConstants.GAME_RULE_NIAO_FEN_2)) {
				if (hasFirst) {
					des += " 鸟2分";
				} else {
					des += "鸟2分";
					hasFirst = true;
				}
			}
		}
		return des;
	}

	/**
	 * 洛阳杠次des
	 * 
	 * @param _game_rule_index
	 * @return
	 */
	public static String get_game_des_lygc(int _game_rule_index, Integer gang_di_feng, Integer ci_di_feng,
			Integer zimo_di_feng, DescParams descParam) {

		if (gang_di_feng == null) {
			gang_di_feng = 0;
		}
		if (ci_di_feng == null) {
			ci_di_feng = 0;
		}

		if (zimo_di_feng == null) {
			zimo_di_feng = 0;
		}
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_HENAN_KUAI_SU_CHANG) != 0) {
			if (hasFirst) {
				des += " 快速场";
			} else {
				des += "快速场";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				des += " 点炮胡";
			} else {
				des += "点炮胡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带字牌";
			} else {
				des += "带字牌";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_LCI)) {
			if (hasFirst) {
				des += " 软次";
			} else {
				des += "软次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_YCI)) {
			if (hasFirst) {
				des += " 硬次";
			} else {
				des += "硬次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_PICI)) {
			if (hasFirst) {
				des += " 皮次";
			} else {
				des += "皮次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_BAOCI)) {
			if (hasFirst) {
				des += " 包次";
			} else {
				des += "包次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_JIA_DI)) {
			if (hasFirst) {
				des += " 庄家翻倍";
			} else {
				des += "庄家翻倍";
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_HENAN_CI_FENG_DOUBLE) != 0) {
			if (hasFirst) {
				des += " 次风翻倍";
			} else {
				des += "次风翻倍";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_BUCIFENG)) {
			if (hasFirst) {
				des += " 不次风";
			} else {
				des += "不次风";
				hasFirst = true;
			}
		}
		if (gang_di_feng != 0) {
			if (hasFirst) {
				des += " 杠底:" + gang_di_feng;
			} else {
				des += "杠底:" + gang_di_feng;
				hasFirst = true;
			}
		}
		if (ci_di_feng != 0) {
			if (hasFirst) {
				des += " 次底:" + ci_di_feng;
			} else {
				des += "次底:" + ci_di_feng;
				hasFirst = true;
			}
		}
		if (zimo_di_feng != 0) {
			if (hasFirst) {
				des += " 自摸底:" + zimo_di_feng;
			} else {
				des += "自摸底:" + zimo_di_feng;
				hasFirst = true;
			}
		}

		return des;
	}

	public static String get_game_des_lygc_dian_pao(int _game_rule_index, Integer gang_di_feng, Integer pao_di_feng,
			Integer zimo_di_feng, DescParams descParam) {
		if (gang_di_feng == null) {
			gang_di_feng = 0;
		}
		if (pao_di_feng == null) {
			pao_di_feng = 0;
		}
		if (zimo_di_feng == null) {
			zimo_di_feng = 0;
		}
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				des += " 点炮胡";
			} else {
				des += "点炮胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带字牌";
			} else {
				des += "带字牌";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIANG_GANG_HU)) {
			if (hasFirst) {
				des += " 抢杠胡";
			} else {
				des += "抢杠胡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_LCI)) {
			if (hasFirst) {
				des += " 软次";
			} else {
				des += "软次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_YCI)) {
			if (hasFirst) {
				des += " 硬次";
			} else {
				des += "硬次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_PICI)) {
			if (hasFirst) {
				des += " 皮次";
			} else {
				des += "皮次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_BAOCI)) {
			if (hasFirst) {
				des += " 包次";
			} else {
				des += "包次";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_JIA_DI)) {
			if (hasFirst) {
				des += " 庄家翻倍";
			} else {
				des += "庄家翻倍";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIDUI_DOUBLE)) {
			if (hasFirst) {
				des += " 可胡七对";
			} else {
				des += "可胡七对";
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_HENAN_KUAI_SU_CHANG) != 0) {
			if (hasFirst) {
				des += " 快速场";
			} else {
				des += "快速场";
				hasFirst = true;
			}
		}
		if (gang_di_feng != 0) {
			if (hasFirst) {
				des += " 杠底:" + gang_di_feng;
			} else {
				des += "杠底:" + gang_di_feng;
				hasFirst = true;
			}
		}
		if (pao_di_feng != 0) {
			if (hasFirst) {
				des += " 点炮底:" + pao_di_feng;
			} else {
				des += "点炮底:" + pao_di_feng;
				hasFirst = true;
			}
		}
		if (zimo_di_feng != 0) {
			if (hasFirst) {
				des += " 自摸底:" + zimo_di_feng;
			} else {
				des += "自摸底:" + zimo_di_feng;
				hasFirst = true;
			}
		}

		return des;
	}

	private static String get_game_des_hjk(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_EVERYONE_ROBOT_BANKER)) {
			des += "每局抢庄" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WUXILONG_HUAN_BANKER)) {
			des += "五小龙换庄" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LUN_BNAKER)) {
			des += "轮庄" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DING_BNAKER)) {
			des += "固定庄" + "\n";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIRST_ROBOT_BANKER)) {
			des += "首局抢庄后五小龙换庄" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_LEI_ZHU)) {
			des += "不能垒注" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_TWENTY_FOUR)) {
			des += "24分封顶" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_FOURTY_EIGHT)) {
			des += "48分封顶" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MID_JOIN)) {
			des += "中途可进" + "\n";
		}

		return des;
	}

	private static String get_game_des_sg(int _game_rule_index) {
		///////////////////////////////////////////////////////////////////// 三公

		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_DI_FEN_ONE)) {
			des += "底分1" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_DI_FEN_TWO)) {
			des += "底分2" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_DI_FEN_THREE)) {
			des += "底分4" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_FREE_ROBOT)) {
			des += "自由抢庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_JIU_DIAN_BANKER)) {
			des += "九点上庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GMAE_RULE_SG_DA_HUN_ZHAN)) {
			des += "大混战" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GMAE_RULE_SG_KAN_TWO_COUNT)) {
			des += "看两张抢庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_TONG_BI)) {
			des += "通比模式" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_NO_LOW_JETTON)) {
			des += "限制降注" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_NO_JONT_START)) {
			des += "游戏开始后禁止加入" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_DS_TONG_G_WIN)) {
			des += "点数相同公牌多获胜" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_BANKER_ONE)) {
			des += "1倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_BANKER_TWO)) {
			des += "2倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_BANKER_THREE)) {
			des += "3倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SG_BANKER_FOUR)) {
			des += "4倍" + " ";
		}
		return des;
	}

	private static String get_game_des_pdk(int _game_rule_index, int game_type_index) {

		String des = "";
		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_PDK_JD)
				|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_PDK_JD_LL)) {
			des += "经典玩法";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONGTAO10_ZANIAO)) {
				des += "扎鸟" + " ";
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHADAN_ZHAIAO)) {
					des += "炸弹并算" + " ";
				}
			}

			des += " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_PLAY)) {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_RAND_SHOU_CHU)) {
					des += "随机首出" + " ";
				} else {
					des += "首局最小先出牌" + " ";
				}
			} else {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHOU_JU_HEITAO_SAN)) {
					des += "首局先出黑桃3(必出)" + " ";
				} else {
					des += "首局黑桃3先出" + " ";
				}
			}

			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHADAN_BUKECHAI)) {
				des += "炸弹不可拆" + " ";
			}
		}
		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_PDK_LZ)) {
			des += "癞子玩法";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONGTAO10_ZANIAO)) {
				des += "扎鸟";
			}
			des += " ";
		}
		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_PDK_FP)) {
			des += "四人玩法";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONGTAO10_ZANIAO)) {
				des += "扎鸟";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHADAN_ZHAIAO)) {
				des += "炸弹并算" + " ";
			}
			des += " ";
		}
		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_PDK_SW)
				|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_PDK_SW_LL)) {
			des += "十五张玩法";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONGTAO10_ZANIAO)) {
				des += "扎鸟";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHADAN_ZHAIAO)) {
				des += "炸弹并算" + " ";
			}
			des += " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_PLAY)) {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_RAND_SHOU_CHU)) {
					des += "随机首出" + " ";
				} else {
					des += "首局最小先出牌" + " ";
				}

			} else {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHOU_JU_HEITAO_SAN)) {
					des += "首局先出黑桃3(必出)" + " ";
				} else {
					des += "首局黑桃3先出" + " ";
				}
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BOOM)) {
				des += "有炸弹" + " ";
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHADAN_BUKECHAI)) {
					des += "炸弹不可拆" + " ";
				}
			} else {
				des += "无炸弹" + " ";
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_PLAY)) {
			des += "3人玩" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_PLAY)) {
			des += "2人玩" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_KE_FAN_DE)) {
				des += "可反的" + " ";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_PLAY)) {
			des += "4人玩" + " ";
		} else {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIFTEEN_COUNT)) {
				des += "15张" + " ";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SIXTEEN_COUNT)) {
				des += "16张" + " ";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DISPLAY_CARD)) {
			des += "显示牌数" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_DISPLAY_CARD)) {
			des += "不显示牌数" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BI_XU_GUAN)) {
			des += "必须管" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_KE_BU_YAO)) {
			des += "可不要" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FANG_ZOU_BAOPEI)) {
			des += "放走包赔" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_DAI_SAN)) {
			des += "可四带三" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_LOST_NENG_JIE)) {
			des += "三张，飞机少带接完" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YIFU_COUNT)) {
			des += "一副牌" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_PLAY)) {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_RAND_SHOU_CHU)) {
					des += "随机首出" + " ";
				} else {
					des += "首局最小先出牌" + " ";
				}
			} else {
				if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHOU_JU_HEITAO_SAN)) {
					des += "首局先出黑桃3(必出)" + " ";
				} else {
					des += "首局黑桃3先出" + " ";
				}
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIANGFU_COUNT)) {
			des += "两副牌" + " ";
		}

		return des;
	}

	private static String get_game_des_pdk_sc(int _game_rule_index, int game_type_index) {

		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WIN_SHOUCHU)) {
			des += "第二局赢家先出" + " ";
		} else {
			des += "黑桃5先出" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DISPLAY_CARD_SC)) {
			des += "显示牌数" + " ";
		} else {
			des += "不显示牌数" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BOOM_THREE)) {
			des += "三张为炸弹" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BOOM_FOUR)) {
			des += "四张为炸弹" + " ";
		}

		return des;
	}

	private static String get_game_des_BTZ(int _game_type_index, int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_TWO_EIGHT)) {
			des += "二八杠玩法" + "\n";
		} else {
			des += "经典玩法" + "\n";
		}
		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_DA_HE)) {
			des += "打和算平" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_ZHUANG_WIN)) {
			des += "打和庄家赢" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_FANG_ZHU_ZHUANG)) {
			des += "房主庄" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_DOULE_ZHUANG)) {
			des += "豹子以上为庄家" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_QIANG_ZHUANG)) {
			des += "抢庄玩法" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.TB_RULE_LUN)) {
			des += "轮庄" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BU_LEI)) {
			des += "不垒" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_12_LEI)) {
			des += "封顶12垒" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_24_LEI)) {
			des += "封顶24垒" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_48_LEI)) {
			des += "封顶48垒" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_LEI)) {
			des += "不封顶" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BASE_SCORE_ONE)) {
			des += "1:2:3" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BASE_SCORE_TWO)) {
			des += "2:4:6" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BASE_SCORE_THREE)) {
			des += "3:6:9" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.TB_RULE_FOUR)) { // 九点半2倍/对子3倍/幺鸡对4倍
			des += "九点半2倍/对子3倍/幺鸡对4倍" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.TB_RULE_THREE)) { // 八点2倍/九点3倍/对子4倍
			des += "八点2倍/九点3倍/对子4倍" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.TB_RULE_BU_GUA_PAI)) {
			des += "禁止刮牌" + "\n";
		}
		if (has_rule(_game_rule_index, BTZConstants.TB_RULE_NOT_TO_ENTER)) {
			des += "游戏开始后禁止加入" + "\n";
		}

		// if(has_rule(_game_rule_index, BTZConstants.BTZ_RULE_FOUR)){
		// des += "4人场" + "\n";
		// } else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_FIVE)) {
		// des += "6人场" + "\n";
		// } else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_EIGHT)) {
		// des += "8人场" + "\n";
		// }

		return des;
	}

	private static String get_game_des_BTZ_tb(int _game_type_index, int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_TWO_EIGHT)) {
			des += "二八杠玩法" + "\n";
		} else {
			des += "经典玩法" + "\n";
		}
		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_DA_HE)) {
			des += "打和算平" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_ZHUANG_WIN)) {
			des += "打和庄家赢" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_FANG_ZHU_ZHUANG)) {
			des += "房主庄" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_DOULE_ZHUANG)) {
			des += "豹子以上为庄家" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_QIANG_ZHUANG)) {
			des += "抢庄玩法" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.TB_RULE_LUN)) {
			des += "轮庄" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BU_LEI)) {
			des += "不垒" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_24_LEI)) {
			des += "封顶24垒" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_48_LEI)) {
			des += "封顶48垒" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_LEI)) {
			des += "不封顶" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BASE_SCORE_ONE)) {
			des += "1:2:3" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BASE_SCORE_TWO)) {
			des += "2:4:6" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_BASE_SCORE_THREE)) {
			des += "3:6:9" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.TB_RULE_FOUR)) { // 九点半2倍/对子3倍/幺鸡对4倍
			des += "九点半2倍/对子3倍/幺鸡对4倍" + "\n";
		} else if (has_rule(_game_rule_index, BTZConstants.TB_RULE_THREE)) { // 八点2倍/九点3倍/对子4倍
			des += "八点2倍/九点3倍/对子4倍" + "\n";
		}

		if (has_rule(_game_rule_index, BTZConstants.TB_RULE_BU_GUA_PAI)) {
			des += "禁止刮牌" + "\n";
		}
		if (has_rule(_game_rule_index, BTZConstants.TB_RULE_NOT_TO_ENTER)) {
			des += "游戏开始后禁止加入" + "\n";
		}

		// if(has_rule(_game_rule_index, BTZConstants.BTZ_RULE_FOUR)){
		// des += "4人场" + "\n";
		// } else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_FIVE)) {
		// des += "6人场" + "\n";
		// } else if (has_rule(_game_rule_index, BTZConstants.BTZ_RULE_EIGHT)) {
		// des += "8人场" + "\n";
		// }

		return des;
	}

	private static String get_game_des_ox(int _game_type_index, int _game_rule_index, DescParams descParam) {
		String des = "";
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_TBOX_LX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_TBOX)) {
			des += "通比牛牛" + "\n";
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SEVER_OX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SEVER_OX_LX)) {
			des += "房主上庄" + "\n";
		}

		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LZOX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_LZOX_LX)) {
			des += "轮流上庄" + "\n";
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SZOX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_SZOX_LX)) {
			des += "牛牛上庄" + "\n";
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZYQOX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_ZYQOX_LX)) {
			des += "自由抢庄" + "\n";
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MFZOX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MFZOX_LX)) {
			des += "看四张抢庄" + "\n";
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MSZOX)
				|| is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MSZOX_LX)) {
			des += "明三张抢庄" + "\n";
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_KSZOX)) {
			des += "暗三张抢庄" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_OX_WUHUANIU)) {
			des += "五花牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHUN_ZI_NIU)) {
			des += "顺子牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TONG_HUA_NIU)) {
			des += "同花牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HU_LU_NIU)) {
			des += "葫芦牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_OX_BOOM)) {
			des += "炸弹牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_OX_WUXIAONIU)) {
			des += "五小牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TONG_HUA_SHUN)) {
			des += "同花顺" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SELECT_OX_VALUSE_ONE)) {
			des += "牛牛3倍、牛九2倍、牛八2倍、 其余1倍" + "\n";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SELECT_OX_VALUSE_TWO)) {
			des += "牛牛4倍、牛九3倍、牛八2倍、牛七2倍 、 其余1倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_TUI_ZHU)) {
			des += "无" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIVE_TUI_ZHU)) {
			des += "5倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PlAYER_TUI_ZHU)) {
			des += "10倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIFTEEN_TUI_ZHU)) {
			des += "15倍" + "\n";
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TWENTY_TUI_ZHU) == 1) {
			des += "20倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_START_FORBID_JOIN)) {
			des += "游戏开始后禁止加入" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUA_SE_COMPARE)) {
			des += "按花色比牌" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_EQUAL_PING)) {
			des += "打和算平" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHUANG_WIN)) {
			des += "庄家算赢" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_ONE_TIMES)) {
			des += "最大抢庄：1倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_TWO_TIMES)) {
			des += "最大抢庄：2倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_THREE_TIMES)) {
			des += "最大抢庄：3倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_FOUR_TIMES)) {
			des += "最大抢庄：4倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_TWO)) {
			des += "下注1/2" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_FOUR)) {
			des += "下注2/4" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_EIGHT)) {
			des += "下注4/8" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_SIX)) {
			des += "下注3/6" + "\n";
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_FIVE_TO_TEN) == 1) {
			des += "下注5/10" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_TO_FIVE)) {
			des += "下注1/2/3/4/5" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FORBID_CHOU_PAI)) {
			des += "禁止搓牌" + "\n";
		}
		return des;
	}

	private static String get_game_des_u_bull_fight(int _game_type_index, int _game_rule_index) {
		String des = "";
		if (BullFightUtil.isTypeTongBi(_game_type_index)) {
			des += "通比牛牛" + "\n";
		}
		if (BullFightUtil.isTypeFangZhu(_game_type_index)) {
			des += "房主上庄" + "\n";
		}

		if (BullFightUtil.isTypeLunLiu(_game_type_index)) {
			des += "轮流上庄" + "\n";
		}
		if (BullFightUtil.isTypeNiuNiu(_game_type_index)) {
			des += "牛牛上庄" + "\n";
		}
		if (BullFightUtil.isTypeZiYou(_game_type_index)) {
			des += "自由抢庄" + "\n";
		}
		if (BullFightUtil.isTypeKanSiZhang(_game_type_index)) {
			des += "看四张抢庄" + "\n";
		}
		if (BullFightUtil.isTypeMingSanZhang(_game_type_index)) {
			des += "明三张抢庄" + "\n";
		}
		if (BullFightUtil.isTypeAnSanZhang(_game_type_index)) {
			des += "暗三张抢庄" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_OX_WUHUANIU)) {
			des += "五花牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHUN_ZI_NIU)) {
			des += "顺子牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TONG_HUA_NIU)) {
			des += "同花牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HU_LU_NIU)) {
			des += "葫芦牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_OX_BOOM)) {
			des += "炸弹牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_OX_WUXIAONIU)) {
			des += "五小牛" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TONG_HUA_SHUN)) {
			des += "同花顺" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SELECT_OX_VALUSE_ONE)) {
			des += "牛牛3倍、牛九2倍、牛八2倍、 其余1倍" + "\n";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SELECT_OX_VALUSE_TWO)) {
			des += "牛牛4倍、牛九3倍、牛八2倍、牛七2倍 、 其余1倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_TUI_ZHU)) {
			des += "无" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIVE_TUI_ZHU)) {
			des += "5倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PlAYER_TUI_ZHU)) {
			des += "10倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIFTEEN_TUI_ZHU)) {
			des += "15倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_START_FORBID_JOIN)) {
			des += "游戏开始后禁止加入" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUA_SE_COMPARE)) {
			des += "按花色比牌" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_EQUAL_PING)) {
			des += "打和算平" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHUANG_WIN)) {
			des += "庄家算赢" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_ONE_TIMES)) {
			des += "最大抢庄：1倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_TWO_TIMES)) {
			des += "最大抢庄：2倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_THREE_TIMES)) {
			des += "最大抢庄：3倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAX_FOUR_TIMES)) {
			des += "最大抢庄：4倍" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_TWO)) {
			des += "下注1/2" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_FOUR)) {
			des += "下注2/4" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_EIGHT)) {
			des += "下注4/8" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_SIX)) {
			des += "下注3/6" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_TO_FIVE)) {
			des += "下注1/2/3/4/5" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FORBID_CHOU_PAI)) {
			des += "禁止搓牌" + "\n";
		}
		return des;
	}

	private static String get_game_des_fkn(int _game_type_index, int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JD_FKN)) {
			des += "经典牛牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FKN_JB)) {
			des += "疯狂加倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_FKN)) {
			des += "抢庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TURN_BANKER_FKN)) {
			des += "轮庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIXED_FKN)) {
			des += "固定庄" + " ";
		}

		return des;
	}

	private static String get_game_des_u_feng_kuang_niu(int _game_type_index, int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JD_FKN)) {
			des += "经典牛牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FKN_JB)) {
			des += "疯狂加倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_FKN)) {
			des += "抢庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TURN_BANKER_FKN)) {
			des += "轮庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIXED_FKN)) {
			des += "固定庄" + " ";
		}

		return des;
	}

	private static String get_game_des_dbn(int _game_type_index, int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_PlAYER)) {
			des += "4人" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_ONE)) {
				des += "40/80(低于10分下庄)" + " ";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_TWO)) {
				des += "80/160(低于20分下庄)" + " ";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIVE_PLAYER)) {
			des += "5人" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_ONE)) {
				des += "50/100(低于15分下庄)" + " ";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_TWO)) {
				des += "100/200(低于30分下庄)" + " ";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SIX_PLAYER)) {
			des += "6人" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_ONE)) {
				des += "60/120(低于20分下庄)" + " ";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_TWO)) {
				des += "120/240(低于40分下庄)" + " ";
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_SCORE_ONE)) {
			des += "最高60分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_SCORE_TWO)) {
			des += "1/2池底" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_SCORE_THREE)) {
			des += "1/3 池底" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_JU_DOWN_BANKER)) {
			des += "3局可以下庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_JU_DOWN_BANKER)) {
			des += "4局可以下庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIAN_BANKER)) {
			des += "连庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BU_BANKER)) {
			des += "补庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHUN_XU_END)) {
			des += "按顺序结算" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DA_XIAO_END)) {
			des += "按大小结算" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WU_HUA_NIU)) {
			des += "五花牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHA_DAN_NIU)) {
			des += "炸弹牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WU_XIAO_NIU)) {
			des += "五小牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_ONE_TIEMS)) {
			des += "牛牛3倍、牛九2倍、牛八2倍、 其余1倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_TWO_TIEMS)) {
			des += "牛牛4倍、牛九3倍、牛八2倍、牛七2倍 、 其余1倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_TIAO_BANKER)) {
			des += "不跳庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_1000_TIAO_BANKER)) {
			des += "1000分跳庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_2000_TIAO_BANKER)) {
			des += "2000分跳庄" + " ";
		}
		return des;
	}

	private static String get_game_des_u_dou_ban_niu(int _game_type_index, int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_PlAYER)) {
			des += "4人" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_ONE)) {
				des += "40/80(低于10分下庄)" + " ";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_TWO)) {
				des += "80/160(低于20分下庄)" + " ";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIVE_PLAYER)) {
			des += "5人" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_ONE)) {
				des += "50/100(低于15分下庄)" + " ";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_TWO)) {
				des += "100/200(低于30分下庄)" + " ";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SIX_PLAYER)) {
			des += "6人" + " ";
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_ONE)) {
				des += "60/120(低于20分下庄)" + " ";
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BANKER_SCORE_TWO)) {
				des += "120/240(低于40分下庄)" + " ";
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_SCORE_ONE)) {
			des += "最高60分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_SCORE_TWO)) {
			des += "1/2池底" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_SCORE_THREE)) {
			des += "1/3 池底" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_JU_DOWN_BANKER)) {
			des += "3局可以下庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_JU_DOWN_BANKER)) {
			des += "4局可以下庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIAN_BANKER)) {
			des += "连庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BU_BANKER)) {
			des += "补庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHUN_XU_END)) {
			des += "按顺序结算" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DA_XIAO_END)) {
			des += "按大小结算" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WU_HUA_NIU)) {
			des += "五花牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHA_DAN_NIU)) {
			des += "炸弹牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WU_XIAO_NIU)) {
			des += "五小牛" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_ONE_TIEMS)) {
			des += "牛牛3倍、牛九2倍、牛八2倍、 其余1倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JETTON_TWO_TIEMS)) {
			des += "牛牛4倍、牛九3倍、牛八2倍、牛七2倍 、 其余1倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_TIAO_BANKER)) {
			des += "不跳庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_1000_TIAO_BANKER)) {
			des += "1000分跳庄" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_2000_TIAO_BANKER)) {
			des += "2000分跳庄" + " ";
		}
		return des;
	}

	private static String get_game_des_phz_chd(int _game_rule_index, int game_type_index, DescParams descParam) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_MAX_CHD)) {
			des += "不封顶" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_10_MAX_CHD)) {
			des += "单局10" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_20_MAX_CHD)) {
			des += "单局20" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_100_MAX_CHD)) {
			des += "单局100" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_200_MAX_CHD)) {
			des += "单局200" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_500_MAX_CHD)) {
			des += "单局500" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_DI_CHD)) {
			des += "埋底1" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TWO_DI_CHD)) {
			des += "埋底2" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_THREE_DI_CHD)) {
			des += "埋底3" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FOUR_DI_CHD)) {
			des += "埋底4" + " ";
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_WU_DI_CHD) == 1) {
			des += "埋底5" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZERO_DI_CHD)) {
			des += "不埋底" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WAN_FA_CHD)) {
			if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_PHZ_CHD)) {
				des += "天胡：6 地胡：6  海胡：6 听胡：6 红胡：3+n 黑胡：8 点胡 ：6  大胡 ：8+n 小胡：10 对子胡：8番" + " ";
			} else if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_DHD_CHD)) {
				des += "红胡:3+n 点胡:4番   乌胡:6番 对子胡:4番 自摸：加一囤" + " ";
			} else if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_HH_CHD)) {
				des += "红胡:2番 点胡:3番  红乌:4番  乌胡:5番  自摸+1囤" + " ";
			} else if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_LBA_CHD)) {
				des += "天胡：8 地胡：6  红胡：3+n 黑胡：6 点胡 ：5  大胡 ：6+n 小胡：8 对子胡：8番 ";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WAN_FA_TWO_CHD)) {
			if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_DHD_CHD)) {
				des += "红胡:2+n 点胡:3番   乌胡:5番 对子胡:4番 " + " ";
			}

		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TUAN_CHD)) {
			des += "团" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TUAN_YUAN_CHD)) {
			des += "大团圆" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MTH_CHD)) {
			des += "满堂红" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HFT_CHD)) {
			des += "红翻天" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DIAN_DENG_CHD)) {
			des += "点灯" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SI_QI_HONG_CHD)) {
			des += "四七红" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HHX_CHD)) {
			des += "行行息" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIA_HHX_CHD)) {
			des += "假行行息" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_GAI_CHD)) {
			des += "盖" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BEI_CHD)) {
			des += "背" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_MAN_YUAN_HUA)) {
			des += "满园花" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QIANG_HU_CHD)) {
			des += "强制胡牌" + " ";
		}
		return des;
	}

	private static String get_game_des_wmq(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WMQ_TWO_PLAYER)) {
			des += "2人" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_WMQ_THREE_PLAYER)) {
			des += "3人" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XIAO_ZHUO_BAN)) {
			des += "小桌版" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DA_ZHUO_BAN)) {
			des += "大桌版" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QUAN_MING_TANG)) {
			des += "全名堂" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LAO_MING_TANG)) {
			des += "老名堂" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QIANG_HU_PAI)) {
			des += "强制胡牌" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DOU_LIU_ZI_ON)) {
			des += "逗溜子" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHX_ONE_FEN)) {
			des += "30/20/20" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHX_TWO_FEN)) {
			des += "40/30/30" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHX_THREE_FEN)) {
			des += "50/50/50" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHX_ONE_FEN)) {
			des += "一登=200分" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHX_TWO_FEN)) {
			des += "一登=300分" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZHX_THREE_FEN)) {
			des += "一登=450分" + "\n";
		}

		return des;
	}

	private static String get_game_des_thk(int _game_rule_index) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YOUXIAN_PHZ_SELECT_YWS)) {
			des += "吃：一五十" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_ONE)) {
			des += " 不带底" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_TWO)) {
			des += "带底" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_THREE)) {
			des += "翻倍" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_AN_WEI)) {
			des += "暗偎" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_MING_WEI)) {
			des += "明偎" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_TUN_ONE_FEN)) {
			des += "一囤一分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_HU_ONE_FEN)) {
			des += "一息一分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QIANG_ZHI_HU_PAI)) {
			des += "强制胡牌" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONG_HEI_DIAN)) {
			des += "红黑点" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HAI_DI_LAO_YUE)) {
			des += "海底捞月" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_XING)) {
			des += "不带醒" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FAN_XING)) {
			des += "翻醒" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SUI_XING)) {
			des += "随醒" + " ";
		}

		return des;
	}

	private static String get_game_des_gxzp(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_10_YOU_HU)) {
			des += "十油起胡" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_15_YOU_HU)) {
			des += "十五油起胡" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GMAE_RULE_5_YOU_1_ZI)) {
			des += "5油一子" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_3_YOU_1_ZI)) {
			des += "3油一子" + " ";
		}
		// if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONG_PENG)) {
		// des += "红碰" + " ";
		// }
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DIAN_PAO)) {
			des += "可以点炮" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YPSHX)) {
			des += "一炮双响" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_DIAN_PAO)) {
			des += "不可以点炮" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.Game_RULE_HU_XING)) {
			des += "胡醒" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SHANG_XING)) {
			des += "上醒" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_BEN_XING)) {
			des += "本醒" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XIA_XING)) {
			des += "下醒" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SI_XING)) {
			des += "翻重醒" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZM_YI_ZI)) {
			des += "自摸加一子" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZM_FAN_BEI)) {
			des += "自摸翻倍" + " ";
		}
		return des;
	}

	private static String get_game_des_lhq(int game_type_index, int _game_rule_index) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YOUXIAN_PHZ_SELECT_YWS)) {
			des += "吃：一五十" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_TWO)) {
			des += "带底" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZI_MO_TWO_BEI)) {
			des += "自摸翻倍" + " ";
		}
		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_LHQ_QD)
				|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_LHQ_HY)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_AN_WEI)) {
				des += "暗偎" + " ";
			}
		}

		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_LHQ_HD)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_MING_WEI)) {
				des += "明偎" + " ";
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_TUN_ONE_FEN)) {
			des += "三胡一分" + " ";
		}
		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_LHQ_QD)
				|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_LHQ_HY)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_HU_ONE_FEN)) {
				des += "一息一分" + " ";
			}
		} else {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_HU_ONE_FEN)) {
				des += "蚂蚁上树" + " ";
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QIANG_ZHI_HU_PAI)) {
			des += "强制胡牌" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HONG_HEI_DIAN)) {
			des += "红黑点" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HAI_DI_LAO_YUE)) {
			des += "海底捞月" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ADD_SPEED)) {
			des += "快速" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_XING)) {
			des += "不带醒" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FAN_XING)) {
			des += "翻醒" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SUI_XING)) {
			des += "随醒" + " ";
		}

		return des;
	}

	private static String get_game_des_phz_xt(int _game_rule_index) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YOUXIAN_PHZ_SELECT_YWS)) {
			des += "吃：一五十" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TEN_HU_XI_XT)) {
			des += "胡息 10硬息" + "\n";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YOUXIAN_PHZ_SELECT_HUXI)) {
			des += "胡息 18硬息" + "\n";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RUEL_FIFTEEN_HU_XI_XT)) {
			des += "胡息 15胡息 " + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_HU_ONE_FEN)) {
			des += "一胡一分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_ONE)) {
			des += "底分：1+1" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_TWO)) {
			des += "底分：2+1" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_THREE)) {
			des += "底分：3+1" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_AN_WEI)) {
			des += "暗偎" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_MING_WEI)) {
			des += "明偎" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_MING_TANG)) {
			des += "无名堂" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JI_BENMING_TANG)) {
			des += "基本名堂" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZI_MO_ADD_THREE)) {
			des += "自摸加3胡息" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ALL_MING_TANG)) {
			des += "全名堂" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_30_HU_FAN_FAN)) {
			des += "30胡翻番" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_ERZI_LIANG_PAI)) {
			des += "亮牌" + " ";
		} else {
			des += "不亮牌" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ADD_SPEED)) {
			des += "快速" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SI_QI_ZHANG_HONG_HU)) {
			des += "四、七张红胡" + "\n";
		}

		return des;
	}

	private static String get_game_des_hh(int _game_rule_index) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YOUXIAN_PHZ_SELECT_YWS)) {
			des += "吃：一五十" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QIANG_ZHI_HU_PAI)) {
			des += "强制胡牌" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YOUXIAN_PHZ_SELECT_HUXI)) {
			des += "18硬息" + "\n";
		} else {
			des += "15胡息 " + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_ONE)) {
			des += "底分：一分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_TWO)) {
			des += "底分：二分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_THREE)) {
			des += "底分：三分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_HU_ONE_FEN)) {
			des += "一胡一分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ONE_TUN_ONE_FEN)) {
			des += "一息一囤" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_3_XI_YI_TUN)) {
			des += "三息一囤" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_ERZI_LIANG_PAI)) {
			des += "亮牌" + "\n";
		} else {
			des += "不亮牌" + "\n";
		}

		return des;
	}

	private static String get_game_des_hgw(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NO_FEN_DING)) {
			des += "无封顶" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_FIVE_FAN)) {
			des += "5番" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_TEN_FAN)) {
			des += "10番" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_QIANG_ZHI_HU_PAI)) {
			des += "强制胡牌" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZI_MO_TWO_BEI)) {
			des += "自摸翻倍" + " ";
		}

		return des;
	}

	private static String get_game_des_phu(int game_rule_index, int game_round, int cur_round, DescParams descParam) {
		String des = "";
		boolean flag = false;
		if (descParam.getRuleValue(GameConstants.GAME_RULE_IP) == 1) {
			des += "禁同IP" + " ";
			flag = true;
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_QUICK_SPEED)) {
			des += "快速 " + "\n";
		} else if (flag == true)
			des += "\n";
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_LIAN_ZHONG)) {
			des += "连中 " + "\n";
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_ZHONG_BANKER)) {
			des += "中庄x2 " + " ";
			if (has_rule(game_rule_index, GameConstants.GAME_RULE_PAO_BANKER)) {
				des += "庄炮x2" + "\n";
			} else {
				des += "\n";
			}
			flag = true;

		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_FOUR_FIRST_MUL)) {
			des += "4首乘法" + "\n";
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_QZ_HU_PAI_ON)) {
			des += "强制胡牌" + " ";
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_RANDOM_SEAT) == 1) {
			des += "随机位置" + " ";

		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TWO_PLAYER_PH) == 1) {
			des += "2人" + "\n";
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_THREE_PLAYER_PH) == 1) {
			des += "3人" + "\n";
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_FOUR_PLAYER_PH) == 1) {
			des += "4人" + "\n";
		}

		// if (has_rule(game_rule_index, GameConstants.GAME_RULE_DISPLAY_TING))
		// {
		// des += "显示听牌" + " ";
		// flag = false;
		// }

		return des;
	}

	private static String get_game_des_fphz(int _game_rule_index) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YOUXIAN_PHZ_SELECT_YWS)) {
			des += "吃：一五十" + "\n";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_ONE)) {
			des += "底分：一分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_TWO)) {
			des += "底分：二分" + " ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_FEN_SELECT_THREE)) {
			des += "底分：三分" + " ";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DI_ERZI_LIANG_PAI)) {
			des += "亮牌" + "\n";
		} else {
			des += "不亮牌" + "\n";
		}

		return des;
	}

	private static String get_game_des_lxcg(int _game_rule_index) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_ZHUANG)) {
			if (hasFirst) {
				des += " 轮庄";
			} else {
				des += "轮庄";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 胡牌者庄";
			} else {
				des += "胡牌者庄";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_PIAO)) {
			if (hasFirst) {
				des += " 飘分";
			} else {
				des += "飘分";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_JIANPAOHU)) {
			if (hasFirst) {
				des += " 强制胡牌";
			} else {
				des += "强制胡牌";
				hasFirst = true;
			}
		}

		return des;
	}

	private static String get_game_des_fls(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_ZHUANG)) {
			des += "轮庄";
		} else {
			des += "胡牌者庄";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_PIAO)) {
			des += " 飘分";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_JIANPAOHU)) {
			if (des.length() == 0) {
				des += "强制胡牌";
			} else {
				des += "\n" + "强制胡牌";
			}
		}

		return des;
	}

	private static String get_game_des_fls_twenty(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_ZHUANG)) {
			des += "轮庄";
		} else {
			des += "胡牌者庄";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_IS_TWO)) {
			des += " 2底分";
		} else {
			des += " 1底分";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_PIAO)) {
			des += " 飘分";
		}
		// if (has_rule(_game_rule_index,
		// GameConstants.GAME_RULE_LIXIANG_FLS_IP)) {
		// if (des.length() == 0) {
		// des += "允许相同ip进入";
		// } else {
		// des += "\n" + "允许相同ip进入";
		// }
		// } else {
		// des += "\n" + "不允许相同ip进入";
		// }

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_JIANPAOHU)) {
			if (des.length() == 0) {
				des += "强制胡牌";
			} else {
				des += "\n" + "强制胡牌";
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIXIANG_FLS_TONGPAO)) {
			if (des.length() == 0) {
				des += "通炮";
			} else {
				des += "通炮";
			}
		}

		return des;
	}

	private static String get_game_des_xthh(int _game_rule_index) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HEBEI_DI_FEN_05)) {
			if (hasFirst) {
				des += " 底分:0.5";
			} else {
				des += "底分:0.5";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HEBEI_DI_FEN_10)) {
			if (hasFirst) {
				des += " 底分:1";
			} else {
				des += "底分:1";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HEBEI_DI_FEN_20)) {
			if (hasFirst) {
				des += " 底分:2";
			} else {
				des += "底分:2";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HEBEI_PIAO_LAI_YOU_JIANG)) {
			if (hasFirst) {
				des += " 飘赖有奖";
			} else {
				des += "飘赖有奖";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HEBEI_GAN_DENG_YAN)) {
			if (hasFirst) {
				des += " 干瞪眼";
			} else {
				des += "干瞪眼";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HEBEI_YI_LAI_DAO_DI)) {
			if (hasFirst) {
				des += " 一赖到底";
			} else {
				des += "一赖到底";
				hasFirst = true;
			}
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HEBEI_TU_HAO_BI_GANG)) {
				if (hasFirst) {
					des += " 土豪必杠";
				} else {
					des += "土豪必杠";
					hasFirst = true;
				}
			}
		}

		return des;
	}

	private static String get_game_des_ay(int _game_rule_index) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带风";
			} else {
				des += "带风";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_XIAPAO)) {
			if (hasFirst) {
				des += " 庄家可下跑";
			} else {
				des += "庄家可下跑";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				des += " 可炮胡";
			} else {
				des += "可炮胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		}

		return des;
	}

	private static String get_game_des_xy(int _game_rule_index) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}
		if (!has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 点炮胡";
			} else {
				des += "点炮胡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			if (hasFirst) {
				des += " 带跑";
			} else {
				des += "带跑";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不带跑";
			} else {
				des += "不带跑";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_TUIDAOHU)) {
			if (hasFirst) {
				des += " 推倒胡";
			} else {
				des += "推倒胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 七公嘴";
			} else {
				des += "七公嘴";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_GANGHUA_DOUBLE)) {
			if (hasFirst) {
				des += " 杠上开花加倍";
			} else {
				des += "杠上开花加倍";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIDUI_DOUBLE)) {
			if (hasFirst) {
				des += " 七对加倍";
			} else {
				des += "七对加倍";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_NAOZHUAN)) {
			if (hasFirst) {
				des += " 闹庄";
			} else {
				des += "闹庄";
				hasFirst = true;
			}
		}
		return des;
	}

	private static String get_game_des_smx(int _game_rule_index) {
		String des = "";

		if (!has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (des.length() == 0) {
				des += "自摸胡";
			} else {
				des += "\n" + "自摸胡";
			}
		} else {
			if (des.length() == 0) {
				des += "点炮胡";
			} else {
				des += "\n" + "点炮胡";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			if (des.length() == 0) {
				des += "带跑";
			} else {
				des += "\n" + "带跑";
			}
		} else {
			if (des.length() == 0) {
				des += "不带跑";
			} else {
				des += "\n" + "不带跑";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_TUIDAOHU)) {
			if (des.length() == 0) {
				des += "推倒胡";
			} else {
				des += "\n" + "推倒胡";
			}
		} else {
			if (des.length() == 0) {
				des += "七公嘴";
			} else {
				des += "\n" + "七公嘴";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_GANGHUA_DOUBLE)) {
			if (des.length() == 0) {
				des += " 杠上开花加倍";
			} else {
				des += "杠上开花加倍";
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIDUI_DOUBLE)) {
			if (des.length() == 0) {
				des += " 七对加倍";
			} else {
				des += "七对加倍";
			}
		}
		return des;
	}

	private static String get_game_des_lz(int _game_rule_index) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带风";
			} else {
				des += "带风";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_HUN)) {
			if (hasFirst) {
				des += " 带混";
			} else {
				des += "带混";
				hasFirst = true;
			}
		}
		return des;
	}

	private static String get_game_des_hnhz(int _game_rule_index) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带风";
			} else {
				des += "带风";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			if (hasFirst) {
				des += " 带跑";
			} else {
				des += "带跑";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_ZIMOHU)) {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 可炮胡";
			} else {
				des += "可炮胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIANG_GANG_HU)) {
			if (hasFirst) {
				des += " 抢杠胡";
			} else {
				des += "抢杠胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIDUI_DOUBLE)) {
			if (hasFirst) {
				des += " 可胡七对";
			} else {
				des += "可胡七对";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_ZHANIAO2)) {
			if (hasFirst) {
				des += " 抓鸟:2个";
			} else {
				des += "抓鸟:2个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_ZHANIAO4)) {
			if (hasFirst) {
				des += " 抓鸟:4个";
			} else {
				des += "抓鸟:4个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_ZHANIAO6)) {
			if (hasFirst) {
				des += " 抓鸟:6个";
			} else {
				des += "抓鸟:6个";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不抓鸟";
			} else {
				des += "不抓鸟";
				hasFirst = true;
			}
		}
		return des;
	}

	private static String get_game_des_henan_xinxiang(int game_type_index, int _game_rule_index, DescParams descParam) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_JIA_DI)) {
			if (hasFirst) {
				des += " 庄家加底";
			} else {
				des += "庄家加底";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_GANGHUA_DOUBLE)) {
			if (hasFirst) {
				des += " 杠上开花加倍";
			} else {
				des += "杠上开花加倍";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIDUI_DOUBLE)) {
			if (hasFirst) {
				des += " 七对加倍";
			} else {
				des += "七对加倍";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_HUN)) {

			if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY))) {
				if (hasFirst) {
					des += " 带金";
				} else {
					des += "带金";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 带混";
				} else {
					des += "带混";
					hasFirst = true;
				}
			}

		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带风";
			} else {
				des += "带风";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				des += " 点炮胡";
			} else {
				des += "点炮胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			// 南阳麻将信息特殊处理
			if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY))) {
				if (hasFirst) {
					des += " 带飘";
				} else {
					des += "带飘";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 带跑";
				} else {
					des += "带跑";
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_GANG_PAO)) {

			if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY))) {
				if (hasFirst) {
					des += " 杠飘";
				} else {
					des += "杠飘";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 杠跑";
				} else {
					des += "杠跑";
					hasFirst = true;
				}
			}
		}

		if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY))) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HZBHG)) {
				if (hasFirst) {
					des += " 荒庄不荒杠";
				} else {
					des += "荒庄不荒杠";
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_258)) {
			if (hasFirst) {
				des += " 258做将";
			} else {
				des += "258做将";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QUE_MEN)) {
			if (hasFirst) {
				des += " 缺门";
			} else {
				des += "缺门";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HAOQI)) {
			if (hasFirst) {
				des += " 豪七四倍";
			} else {
				des += "豪七四倍";
				hasFirst = true;
			}
		}

		// 新乡麻将，新的‘可胡七对’为了不冲突，用洛阳杠次的GAME_RULE_HENAN_BAOCI，进行处理
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_BAOCI)) {
			if (hasFirst) {
				des += " 可胡七对";
			} else {
				des += "可胡七对";
				hasFirst = true;
			}
		}

		if (descParam.getRuleValue(GameConstants.GAME_RULE_HENAN_GUO_PENG) != 0) {
			if (hasFirst) {
				des += " 过手碰";
			} else {
				des += "过手碰";
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_HENAN_LI_XIAN_TUO_GUAN) != 0) {
			if (hasFirst) {
				des += " 离线托管";
			} else {
				des += "离线托管";
				hasFirst = true;
			}
		}

		return des;
	}

	private static String get_game_des_henan(int game_type_index, int _game_rule_index, int[] rules) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_JIA_DI)) {
			if (hasFirst) {
				des += " 庄家加底";
			} else {
				des += "庄家加底";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_GANGHUA_DOUBLE)) {
			if (hasFirst) {
				des += " 杠上开花加倍";
			} else {
				des += "杠上开花加倍";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QIDUI_DOUBLE)) {
			if (hasFirst) {
				des += " 七对加倍";
			} else {
				des += "七对加倍";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_HUN)) {

			if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY)
					|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_NEW_NAN_YANG))) {
				if (hasFirst) {
					des += " 带金";
				} else {
					des += "带金";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 带混";
				} else {
					des += "带混";
					hasFirst = true;
				}
			}

		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带风";
			} else {
				des += "带风";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_CHU_FENG_BAO_TING)) {
			if (hasFirst) {
				des += " 出风报听";
			} else {
				des += "出风报听";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_BAO_TING)) {
			if (hasFirst) {
				des += " 报听";
			} else {
				des += "报听";
				hasFirst = true;
			}
		}

		if (is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_PDS)
				|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_NEW_PING_DING_SHAN)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HEI_ZI)) {
				if (hasFirst) {
					des += " 黑子";
				} else {
					des += "黑子";
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				des += " 点炮胡";
			} else {
				des += "点炮胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			// 南阳麻将信息特殊处理
			if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY)
					|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_NEW_NAN_YANG))) {
				if (hasFirst) {
					des += " 带飘";
				} else {
					des += "带飘";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 带跑";
				} else {
					des += "带跑";
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_GANG_PAO)) {

			if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY)
					|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_NEW_NAN_YANG))) {
				if (hasFirst) {
					des += " 杠飘";
				} else {
					des += "杠飘";
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					des += " 杠跑";
				} else {
					des += "杠跑";
					hasFirst = true;
				}
			}
		}

		if ((is_mj_type(game_type_index, GameConstants.GAME_TYPE_HENAN_NY)
				|| is_mj_type(game_type_index, GameConstants.GAME_TYPE_NEW_NAN_YANG))) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HZBHG)) {
				if (hasFirst) {
					des += " 荒庄不荒杠";
				} else {
					des += "荒庄不荒杠";
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_258)) {
			if (hasFirst) {
				des += " 258做将";
			} else {
				des += "258做将";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_QUE_MEN)) {
			if (hasFirst) {
				des += " 缺门";
			} else {
				des += "缺门";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HAOQI)) {
			if (hasFirst) {
				des += " 豪七四倍";
			} else {
				des += "豪七四倍";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_ZI_MO_FAN_BEI)) {
			if (hasFirst) {
				des += " 自摸翻倍";
			} else {
				des += "自摸翻倍";
				hasFirst = true;
			}
		}

		if (game_type_index == GameConstants.GAME_TYPE_NEW_PING_DING_SHAN) {
			if (has_rule(rules, GameConstants.GAME_RULE_HENAN_LCI)) {
				if (hasFirst) {
					des += " 不留底";
				} else {
					des += "不留底";
					hasFirst = true;
				}
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_KUAI_SU_CHANG)) {
			if (hasFirst) {
				des += " 快速场";
			} else {
				des += "快速场";
				hasFirst = true;
			}
		}

		return des;
	}

	private static String get_game_des_henan_xc(int game_type_index, int[] rules, int baseScore, int max_times) {
		StringBuilder des = new StringBuilder();

		des.append("封顶").append(max_times).append("番 ").append(" 底分").append(baseScore).append("分");

		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_FOUR)) {
			des.append(" 四人场");
		} else if (has_rule(rules, GameConstants.GAME_RULE_HENAN_THREE)) {
			des.append(" 三人场");
		} else if (has_rule(rules, GameConstants.GAME_RULE_HENAN_TWO_PLAYER)) {
			des.append(" 二人场");
		} else {
			des.append(" 四人场");
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_BU_DAI_FENG)) {
			des.append(" 不带风");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_QUE_MEN)) {
			des.append(" 断门");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_BAO_TING)) {
			des.append(" 报听");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_DAI_HUN)) {
			des.append(" 带混");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_SHUAIHUN)) {
			des.append(" 甩混");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			des.append(" 可炮胡");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_KE_HU_QI_DUI)) {
			des.append(" 可胡七对");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_HTG)) {
			des.append(" 回头杠");
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			des.append(" 带跑");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_GANG_PAO)) {
			des.append(" 杠跑");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_KUAI_SU_CHANG)) {
			des.append(" 快速场");
		}

		return des.toString();
	}

	public static String get_game_des_zhuzhou(int _game_rule_index) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIANGGANGHU)) {
			if (hasFirst) {
				des += " 可炮胡";
			} else {
				des += "可炮胡";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 自摸胡";
			} else {
				des += "自摸胡";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_JIANPAOHU)) {
			if (hasFirst) {
				des += " 强制胡牌";
			} else {
				des += "强制胡牌";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_SCORE_ADD)) {
			if (hasFirst) {
				des += " 加法记分";
			} else {
				des += "加法记分";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_SCORE_MUTIP)) {
			if (hasFirst) {
				des += " 乘法记分";
			} else {
				des += "乘法记分";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO1)) {
			if (hasFirst) {
				des += " 抓鸟:1个";
			} else {
				des += "抓鸟:1个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				des += " 抓鸟:2个";
			} else {
				des += "抓鸟:2个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				des += " 抓鸟:4个";
			} else {
				des += "抓鸟:4个";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				des += " 抓鸟:6个";
			} else {
				des += "抓鸟:6个";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不抓鸟";
			} else {
				des += "不抓鸟";
				hasFirst = true;
			}
		}
		return des;
	}

	public static String get_game_des_phz_leiyang(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		gameDesc.append("十息起胡 三息一囤 可接炮 自摸翻倍 天地胡 红黑点 ");

		if (has_rule(_game_rule_index, Constants_LeiYang.GAME_RULE_QIANG_ZHI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 强制胡牌");
			} else {
				gameDesc.append("强制胡牌");
				hasFirst = true;
			}
		}
		if (true) {
			if (hasFirst) {
				gameDesc.append(" 举手");
			} else {
				gameDesc.append("举手");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_LeiYang.GAME_RULE_LAST_CARD_DOUBLE)) {
			if (hasFirst) {
				gameDesc.append(" 海底翻倍");
			} else {
				gameDesc.append("海底翻倍");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_LeiYang.GAME_RULE_FAN_XING)) {
			if (hasFirst) {
				gameDesc.append(" 翻醒");
			} else {
				gameDesc.append("翻醒");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_phz_chenzhou(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_PLAYER_3)) {
			if (hasFirst) {
				gameDesc.append(" 三人玩法");
			} else {
				gameDesc.append("三人玩法");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_PLAYER_4)) {
			if (hasFirst) {
				gameDesc.append(" 四人玩法");
			} else {
				gameDesc.append("四人玩法");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_3_HU_XI_MEI_TUN)) {
			if (hasFirst) {
				gameDesc.append(" 3息1囤");
			} else {
				gameDesc.append("3息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_1_HU_XI_MEI_TUN)) {
			if (hasFirst) {
				gameDesc.append(" 1息1囤");
			} else {
				gameDesc.append("1息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_QIANG_ZHI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 强制胡牌");
			} else {
				gameDesc.append("强制胡牌");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_HONG_HEI_DIAN)) {
			if (hasFirst) {
				gameDesc.append(" 红黑点");
			} else {
				gameDesc.append("红黑点");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_MAO_HU)) {
			if (hasFirst) {
				gameDesc.append(" 毛胡");
			} else {
				gameDesc.append("毛胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_ZI_MO_DOUBLE)) {
			if (hasFirst) {
				gameDesc.append(" 自摸翻倍");
			} else {
				gameDesc.append("自摸翻倍");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_ChenZhou.GAME_RULE_PIAO_FEN)) {
			if (hasFirst) {
				gameDesc.append(" 飘分");
			} else {
				gameDesc.append("飘分");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_new_phz_chenzhou(int _game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) != 0) {
			if (hasFirst) {
				gameDesc.append(" 少人模式");
			} else {
				gameDesc.append("少人模式");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_PLAYER_2)) {
			if (hasFirst) {
				gameDesc.append(" 二人玩法");
			} else {
				gameDesc.append("二人玩法");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_PLAYER_3)) {
			if (hasFirst) {
				gameDesc.append(" 三人玩法");
			} else {
				gameDesc.append("三人玩法");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_PLAYER_4)) {
			if (hasFirst) {
				gameDesc.append(" 四人玩法");
			} else {
				gameDesc.append("四人玩法");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_21_ZHANG)) {
			if (hasFirst) {
				gameDesc.append(" 21张");
			} else {
				gameDesc.append("21张");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_15_ZHANG)) {
			if (hasFirst) {
				gameDesc.append(" 15张");
			} else {
				gameDesc.append("15张");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_3_HU_QI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 3胡起胡");
			} else {
				gameDesc.append("3胡起胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_6_HU_QI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 6胡起胡");
			} else {
				gameDesc.append("6胡起胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_9_HU_QI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 9胡起胡");
			} else {
				gameDesc.append("9胡起胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_3_HU_XI_MEI_TUN)) {
			if (hasFirst) {
				gameDesc.append(" 3息1囤");
			} else {
				gameDesc.append("3息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_1_HU_XI_MEI_TUN)) {
			if (hasFirst) {
				gameDesc.append(" 1息1囤");
			} else {
				gameDesc.append("1息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_SUAN_FEN_1)) {
			if (hasFirst) {
				gameDesc.append(" 1胡起1息1囤");
			} else {
				gameDesc.append("1胡起1息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_SUAN_FEN_2)) {
			if (hasFirst) {
				gameDesc.append(" 起胡1囤额外1息1囤");
			} else {
				gameDesc.append("起胡1囤额外1息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_YOU_HU_BI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 有胡必胡");
			} else {
				gameDesc.append("有胡必胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_FANG_PAO_BI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 放炮必胡");
			} else {
				gameDesc.append("放炮必胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_HONG_HEI_DIAN)) {
			if (hasFirst) {
				gameDesc.append(" 红黑点");
			} else {
				gameDesc.append("红黑点");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_HONG_HEI_DIAN_2_FAN)) {
			if (hasFirst) {
				gameDesc.append(" 红黑点2番");
			} else {
				gameDesc.append("红黑点2番");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_ZI_MO_DOUBLE)) {
			if (hasFirst) {
				gameDesc.append(" 自摸翻倍");
			} else {
				gameDesc.append("自摸翻倍");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_MAO_HU)) {
			if (hasFirst) {
				gameDesc.append(" 毛胡");
			} else {
				gameDesc.append("毛胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_TIAN_DI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 天地胡");
			} else {
				gameDesc.append("天地胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_PIAO_123)) {
			if (hasFirst) {
				gameDesc.append(" 飘1/2/3");
			} else {
				gameDesc.append("飘1/2/3");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_PIAO_235)) {
			if (hasFirst) {
				gameDesc.append(" 飘2/3/5");
			} else {
				gameDesc.append("飘2/3/5");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_SPEED_FAST)) {
			if (hasFirst) {
				gameDesc.append(" 速度-快速");
			} else {
				gameDesc.append("速度-快速");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append(" 速度-正常");
			} else {
				gameDesc.append("速度-正常");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_New_ChenZhou.GAME_RULE_SHOU_DONG_DIAN_HU)) {
			if (hasFirst) {
				gameDesc.append(" 手动点胡");
			} else {
				gameDesc.append("手动点胡");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_phz_wugang(int _game_rule_index) {
		if (has_rule(_game_rule_index, Constants_WuGang.GAME_RULE_PLAYER_4)) {
			return "四人玩法";
		}
		return "三人玩法";
	}

	public static String get_game_des_phz_wang_cheng(int _game_rule_index, int rule) {
		StringBuilder gameDesc = new StringBuilder("");
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_PLAYER_3)) {
			gameDesc.append("三人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_PLAYER_4)) {
			gameDesc.append("四人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_PLAYER_2)) {
			gameDesc.append("二人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_CHOU_ZHUANG)) {
			gameDesc.append(" 臭牌臭庄");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_NON_CHOU_ZHUANG)) {
			gameDesc.append(" 臭牌不臭庄");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZI_MO_ADD_1_FEN)) {
			gameDesc.append(" 自摸加1牌");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZI_MO_NON_ADD)) {
			gameDesc.append(" 自摸不加分");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZUO_PIAO_1)) {
			gameDesc.append("\n坐飘1 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZUO_PIAO_2)) {
			gameDesc.append("\n坐飘2 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZUO_PIAO_3)) {
			gameDesc.append("\n坐飘3 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZUO_PIAO_4)) {
			gameDesc.append("\n坐飘4 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZUO_PIAO_5)) {
			gameDesc.append("\n坐飘5 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_HUO_PIAO)) {
			gameDesc.append("\n活飘 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_ZUO_PIAO_NON)) {
			gameDesc.append("\n不坐飘 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_30_HU_10_PAI)) {
			gameDesc.append("\n30胡加10牌 ");
		}
		if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_30_HU_15_PAI)) {
			gameDesc.append("\n30胡加15牌 ");
		}
		if (rule != -1) {
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_0) {
				gameDesc.append("30胡以上见1加0");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_1) {
				gameDesc.append("30胡以上见1加1");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_2) {
				gameDesc.append("30胡以上见1加2");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_3) {
				gameDesc.append("30胡以上见1加3");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_4) {
				gameDesc.append("30胡以上见1加4");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_5) {
				gameDesc.append("30胡以上见1加5");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_6) {
				gameDesc.append("30胡以上见1加6");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_7) {
				gameDesc.append("30胡以上见1加7");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_8) {
				gameDesc.append("30胡以上见1加8");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_9) {
				gameDesc.append("30胡以上见1加9");
			}
			if (rule == GameConstants_WangCheng.GAME_RULE_DE_FEN_10) {
				gameDesc.append("30胡以上见1加10");
			}
		} else {
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_0)) {
				gameDesc.append("30胡以上见1加0");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_1)) {
				gameDesc.append("30胡以上见1加1");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_2)) {
				gameDesc.append("30胡以上见1加2");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_3)) {
				gameDesc.append("30胡以上见1加3");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_4)) {
				gameDesc.append("30胡以上见1加4");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_5)) {
				gameDesc.append("30胡以上见1加5");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_6)) {
				gameDesc.append("30胡以上见1加6");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_7)) {
				gameDesc.append("30胡以上见1加7");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_8)) {
				gameDesc.append("30胡以上见1加8");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_9)) {
				gameDesc.append("30胡以上见1加9");
			}
			if (has_rule(_game_rule_index, GameConstants_WangCheng.GAME_RULE_DE_FEN_10)) {
				gameDesc.append("30胡以上见1加10");
			}
		}
		return gameDesc.toString();
	}

	public static String get_game_des_phz_yongzhou(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_PLAYER_TWO)) {
			if (hasFirst) {
				gameDesc.append(" 两人PK");
			} else {
				gameDesc.append("两人PK");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_PLAYER_THREE)) {
			if (hasFirst) {
				gameDesc.append(" 三人激情");
			} else {
				gameDesc.append("三人激情");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_PLAYER_FOUR)) {
			if (hasFirst) {
				gameDesc.append(" 四人(坐醒)");
			} else {
				gameDesc.append("四人(坐醒)");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append(" 三人激情");
			} else {
				gameDesc.append("三人激情");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_NO_MAGIC)) {
			if (hasFirst) {
				gameDesc.append(" 无王");
			} else {
				gameDesc.append("无王");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_ONE_MAGIC)) {
			if (hasFirst) {
				gameDesc.append(" 单王");
			} else {
				gameDesc.append("单王");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_TWO_MAGIC)) {
			if (hasFirst) {
				gameDesc.append(" 双王");
			} else {
				gameDesc.append("双王");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_THREE_MAGIC)) {
			if (hasFirst) {
				gameDesc.append(" 三王");
			} else {
				gameDesc.append("三王");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_FOUR_MAGIC)) {
			if (hasFirst) {
				gameDesc.append(" 四王");
			} else {
				gameDesc.append("四王");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append(" 无王");
			} else {
				gameDesc.append("无王");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_GEN_XING)) {
			if (hasFirst) {
				gameDesc.append(" 跟醒");
			} else {
				gameDesc.append("跟醒");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_FAN_XING)) {
			if (hasFirst) {
				gameDesc.append(" 翻醒");
			} else {
				gameDesc.append("翻醒");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append(" 跟醒");
			} else {
				gameDesc.append("跟醒");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_SHUANG_XING)) {
			if (hasFirst) {
				gameDesc.append(" 双醒");
			} else {
				gameDesc.append("双醒");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_WITH_MAGIC_MUST_ZI_MO)) {
			if (hasFirst) {
				gameDesc.append(" 有王必须自摸");
			} else {
				gameDesc.append("有王必须自摸");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_AN_FAN_XIAN_HU)) {
			if (hasFirst) {
				gameDesc.append(" 按番限胡");
			} else {
				gameDesc.append("按番限胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_AN_WANG_XIAN_HU)) {
			if (hasFirst) {
				gameDesc.append(" 按王限胡");
			} else {
				gameDesc.append("按王限胡");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_300_FENG_DING)) {
			if (hasFirst) {
				gameDesc.append(" 300封顶");
			} else {
				gameDesc.append("300封顶");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_600_FENG_DING)) {
			if (hasFirst) {
				gameDesc.append(" 600封顶");
			} else {
				gameDesc.append("600封顶");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_WANG_PAI)) {
			if (hasFirst) {
				gameDesc.append(" 亡牌");
			} else {
				gameDesc.append("亡牌");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_NO_WANG_PAI)) {
			if (hasFirst) {
				gameDesc.append(" 无亡牌");
			} else {
				gameDesc.append("无亡牌");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_HONG_ZHUAN_ZHU_HEI)) {
			if (hasFirst) {
				gameDesc.append(" 红转朱黑");
			} else {
				gameDesc.append("红转朱黑");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YongZhou.GAME_RULE_21_HU_QI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 21胡起胡");
			} else {
				gameDesc.append("21胡起胡");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_phz_czsr(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(_game_rule_index, Constants_CZ_SR.GAME_RULE_3_XI_QI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 3息起胡");
			} else {
				gameDesc.append("3息起胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_CZ_SR.GAME_RULE_6_XI_QI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 6息起胡");
			} else {
				gameDesc.append("6息起胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_CZ_SR.GAME_RULE_9_XI_QI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 9息起胡");
			} else {
				gameDesc.append("9息起胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_CZ_SR.GAME_RULE_3_XI_MEI_TUN)) {
			if (hasFirst) {
				gameDesc.append(" 3息1囤");
			} else {
				gameDesc.append("3息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_CZ_SR.GAME_RULE_1_XI_MEI_TUN)) {
			if (hasFirst) {
				gameDesc.append(" 1息1囤");
			} else {
				gameDesc.append("1息1囤");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_CZ_SR.GAME_RULE_ZI_MO_DOUBLE)) {
			if (hasFirst) {
				gameDesc.append(" 自摸翻倍");
			} else {
				gameDesc.append("自摸翻倍");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_CZ_SR.GAME_RULE_QIANG_ZHI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 强制胡牌");
			} else {
				gameDesc.append("强制胡牌");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	/**
	 * 河南周口麻将 -- 根据游戏规则获取游戏玩法描述
	 * 
	 * @param rules
	 * @return
	 */
	public static String get_game_des_he_nan_zhou_kou(int[] rules) {
		// for (int tmpInt : _game_rule_index) {
		// char[] chs = new char[Integer.SIZE];
		// for (int i = 0; i < Integer.SIZE; i++)
		// {
		// chs[Integer.SIZE - 1 - i] = (char) (((tmpInt >> i) & 1) + '0');
		// System.out.println(i+"："+chs[Integer.SIZE - 1 - i]);
		// }
		// System.out.println(new String(chs));
		// }

		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_THREE)) {
			if (hasFirst) {
				gameDesc.append("\n三人场");
			} else {
				gameDesc.append("三人场");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n四人场");
			} else {
				gameDesc.append("四人场");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				gameDesc.append("\n点炮胡");
			} else {
				gameDesc.append("点炮胡");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_ZIMOHU)) {
			if (hasFirst) {
				gameDesc.append("\n自摸胡");
			} else {
				gameDesc.append("自摸胡");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_QUE_MEN)) {
			if (hasFirst) {
				gameDesc.append("\n断门");
			} else {
				gameDesc.append("断门");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_258)) {
			if (hasFirst) {
				gameDesc.append("\n258将");
			} else {
				gameDesc.append("258将");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_HONG_ZHONG_LAI_ZI)) {
			if (hasFirst) {
				gameDesc.append("\n红中癞子");
			} else {
				gameDesc.append("红中癞子");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_DAI_HUN)) {
			if (hasFirst) {
				gameDesc.append("\n翻混");
			} else {
				gameDesc.append("翻混");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				gameDesc.append("\n带风牌");
			} else {
				gameDesc.append("带风牌");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_CHU_FENG_BAO_TING)) {
			if (hasFirst) {
				gameDesc.append("\n出风报听");
			} else {
				gameDesc.append("出风报听");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_BAO_TING)) {
			if (hasFirst) {
				gameDesc.append("\n报听");
			} else {
				gameDesc.append("报听");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			if (hasFirst) {
				gameDesc.append("\n可跑");
			} else {
				gameDesc.append("可跑");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_GANG_PAO)) {
			if (hasFirst) {
				gameDesc.append("\n杠跑");
			} else {
				gameDesc.append("杠跑");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_JIA_DI)) {
			if (hasFirst) {
				gameDesc.append("\n庄家加底");
			} else {
				gameDesc.append("庄家加底");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_HZBHG)) {
			if (hasFirst) {
				gameDesc.append("\n荒庄荒杠");
			} else {
				gameDesc.append("荒庄荒杠");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_QIDUI_DOUBLE)) {
			if (hasFirst) {
				gameDesc.append("\n七对加倍");
			} else {
				gameDesc.append("七对加倍");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_GANGHUA_DOUBLE)) {
			if (hasFirst) {
				gameDesc.append("\n杠开加倍");
			} else {
				gameDesc.append("杠开加倍");
				hasFirst = true;
			}
		}
		return gameDesc.toString();
	}

	/**
	 * 河南漯河麻将 -- 根据游戏规则获取游戏玩法描述
	 * 
	 * @param _game_rule_index
	 * @return
	 */
	public static String get_game_des_henan_lh(int _game_rule_index) {
		// for (int tmpInt : _game_rule_index) {
		// char[] chs = new char[Integer.SIZE];
		// for (int i = 0; i < Integer.SIZE; i++)
		// {
		// chs[Integer.SIZE - 1 - i] = (char) (((tmpInt >> i) & 1) + '0');
		// System.out.println(i+"："+chs[Integer.SIZE - 1 - i]);
		// }
		// System.out.println(new String(chs));
		// }

		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HENAN_PAO_HU)) {
			if (hasFirst) {
				gameDesc.append(" 点炮胡");
			} else {
				gameDesc.append("点炮胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_ZIMOHU)) {
			if (hasFirst) {
				gameDesc.append(" 自摸胡");
			} else {
				gameDesc.append("自摸胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_HONG_ZHONG_LAI_ZI)) {
			if (hasFirst) {
				gameDesc.append(" 红中癞子");
			} else {
				gameDesc.append("红中癞子");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HENAN_DAIFENG)) {
			if (hasFirst) {
				gameDesc.append(" 带风牌");
			} else {
				gameDesc.append("带风牌");
				hasFirst = true;
			}
		}
		return gameDesc.toString();
	}

	public static String get_game_des_cs_lx(int _game_rule_index, int[] _game_rule_index_arr, DescParams descParam) {
		String des = "";

		// if (has_rule(_game_rule_index,
		// GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO1)) {
		// des += "坐飘1分";
		// } else if (has_rule(_game_rule_index,
		// GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO2)) {
		// des += "坐飘2分";
		// } else if (has_rule(_game_rule_index,
		// GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO3)) {
		// des += "坐飘3分";
		// }
		boolean hasFirst = false;

		int val = descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS);
		if (val > 0) {
			des += "允许少人模式";
			hasFirst = true;
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 四人场";
			} else {
				des += "四人场";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				des += " 定鸟加法2只";
			} else {
				des += "定鸟加法2只";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				des += " 定鸟加法4只";
			} else {
				des += "定鸟加法4只";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				des += " 定鸟加法6只";
			} else {
				des += "定鸟加法6只";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_DING_NIAO1)) {
			if (hasFirst) {
				des += " 定鸟乘法1只";
			} else {
				des += "定鸟乘法1只";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_DING_NIAO2)) {
			if (hasFirst) {
				des += " 定鸟乘法2只";
			} else {
				des += "定鸟乘法2只";
				hasFirst = true;
			}
		}

		// if (!has_rule(_game_rule_index,
		// GameConstants.GAME_RULE_HUNAN_FLS_IP)) {
		// if (hasFirst) {
		// des += " 允许相同ip进入";
		// } else {
		// des += "允许相同ip进入";
		// hasFirst = true;
		// }
		// } else {
		// if (hasFirst) {
		// des += " 不允许相同ip进入";
		// } else {
		// des += "不允许相同ip进入";
		// hasFirst = true;
		// }
		// }

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ONE_GANG)) {
			if (hasFirst) {
				des += " 一杠到底";
			} else {
				des += "一杠到底";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_SCORE_TOP)) {
			if (hasFirst) {
				des += " 60分封顶";
			} else {
				des += "60分封顶";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ALL_OPEN)) {
			if (hasFirst) {
				des += " 全开放";
			} else {
				des += "全开放";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index_arr, GameConstants.GAME_RULE_HUNAN_CS_XIAOHU_YZH)) {
			if (hasFirst) {
				des += " 一枝花";
			} else {
				des += "一枝花";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index_arr, GameConstants.GAME_RULE_HUNAN_CS_XIAOHU_ST)) {
			if (hasFirst) {
				des += " 三同";
			} else {
				des += "三同";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index_arr, GameConstants.GAME_RULE_HUNAN_CS_XIAOHU_JTYN)) {
			if (hasFirst) {
				des += " 金童玉女";
			} else {
				des += "金童玉女";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index_arr, GameConstants.GAME_RULE_HUNAN_CS_XIAOHU_BBG)) {
			if (hasFirst) {
				des += " 步步高";
			} else {
				des += "步步高";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_PIAO)) {
			if (hasFirst) {
				des += " 飘分";
			} else {
				des += "飘分";
				hasFirst = true;
			}
		}
		return des;
	}

	public static String get_game_des_cs(int _game_rule_index, DescParams descParam) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO1)) {
			if (hasFirst) {
				des += " 坐飘1分";
			} else {
				des += "坐飘1分";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO2)) {
			if (hasFirst) {
				des += " 坐飘2分";
			} else {
				des += "坐飘2分";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_ZUOPIAO3)) {
			if (hasFirst) {
				des += " 坐飘3分";
			} else {
				des += "坐飘3分";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TWO_PLAYER) != 0) {
			if (hasFirst) {
				des += " 二人场";
			} else {
				des += "二人场";
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_QUE_WAN_ZI) != 0) {
			if (hasFirst) {
				des += " 缺万子";
			} else {
				des += "缺万子";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				des += " 定鸟加法2只";
			} else {
				des += "定鸟加法2只";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				des += " 定鸟加法4只";
			} else {
				des += "定鸟加法4只";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				des += " 定鸟加法6只";
			} else {
				des += "定鸟加法6只";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_DING_NIAO1)) {
			if (hasFirst) {
				des += " 定鸟乘法1只";
			} else {
				des += "定鸟乘法1只";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_DING_NIAO2)) {
			if (hasFirst) {
				des += " 定鸟乘法2只";
			} else {
				des += "定鸟乘法2只";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO2)) {
			if (hasFirst) {
				des += " 飞鸟2只(每只2分)";
			} else {
				des += "飞鸟2只(每只2分)";
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO4)) {
			if (hasFirst) {
				des += " 飞鸟4只(每只2分)";
			} else {
				des += "飞鸟4只(每只2分)";
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_PIAO)) {
			if (hasFirst) {
				des += " 飘分";
			} else {
				des += "飘分";
				hasFirst = true;
			}
		}

		if (descParam.getRuleValue(GameConstants.GAME_RULE_CS_BU_PIAO) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_1) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_2) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_3) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_4) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_5) != 0) {
			if (hasFirst) {
				des += " 自由选飘";
			} else {
				des += "自由选飘";
				hasFirst = true;
			}
		}

		return des;
	}

	/**
	 * 经典斗地主 -- 根据游戏规则获取游戏玩法描述
	 * 
	 * @param _game_rule_index
	 * @return
	 */
	public static String get_game_des_ddz_jd(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIAO_DI_ZHU)) {
			des += "叫地主玩法";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIAO_FEN)) {
			des += "叫分玩法";
		} else {
			des += "抢地主玩法";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIMIT_SIX_BOMB)) {
			des += ";炸弹上限：6炸";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIMIT_FOUR_BOMB)) {
			des += ";炸弹上限：4炸";
		} else {
			des += ";炸弹上限：5炸";
		}
		return des;
	}

	/**
	 * 经典斗地主 -- 根据游戏规则获取游戏玩法描述
	 * 
	 * @param _game_rule_index
	 * @return
	 */
	public static String get_game_des_ddz_henan(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIAO_DI_ZHU)) {
			des += "叫地主玩法";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIAO_FEN)) {
			des += "叫分玩法";
		} else {
			des += "抢地主玩法";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIMIT_SIX_BOMB)) {
			des += ";炸弹上限：4炸";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LIMIT_FIVE_BOMB)) {
			des += ";炸弹上限：3炸";
		} else {
			des += ";炸弹上限：2炸";
		}
		return des;
	}

	/**
	 * 湖南郴州麻将玩法描述
	 * 
	 * @param _game_rule_index
	 * @return
	 */
	public static String get_game_des_hn_cz(int _game_rule_index) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZIMOHU)) {

			des += "\n" + "自摸胡";
		} else {
			des += "\n" + "可炮胡(可抢杠胡)";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIDUI)) {

			des += "\n" + "可胡七对";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_HONGZHONG)) {
			des += "\n" + "红中";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_CS_PIAO)) {
			des += "\n" + "飘";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (des.length() > 0) {
				des += "\n" + "抓鸟:2个";
			} else {
				des += "抓鸟:2个";
			}
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (des.length() > 0) {
				des += "\n" + "抓鸟:4个";
			} else {
				des += "抓鸟:4个";
			}

		} else {
			if (des.length() > 0) {
				des += "\n" + "抓鸟:6个";
			} else {
				des += "抓鸟:6个";
			}
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_JINNIAO)) {
			des += "\n" + "金鸟";
		}

		return des;
	}

	public static String get_game_des_gxlz(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_PLAYER_OF_3)) {
			if (hasFirst) {
				gameDesc.append(" 三人场");
			} else {
				gameDesc.append("三人场");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_PLAYER_OF_4)) {
			if (hasFirst) {
				gameDesc.append(" 四人场");
			} else {
				gameDesc.append("四人场");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_DIAO_YU_2)) {
			if (hasFirst) {
				gameDesc.append(" 钓2条鱼");
			} else {
				gameDesc.append("钓2条鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_DIAO_YU_4)) {
			if (hasFirst) {
				gameDesc.append(" 钓4条鱼");
			} else {
				gameDesc.append("钓4条鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_DIAO_YU_6)) {
			if (hasFirst) {
				gameDesc.append(" 钓6条鱼");
			} else {
				gameDesc.append("钓6条鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_DIAO_YU_8)) {
			if (hasFirst) {
				gameDesc.append(" 钓8条鱼");
			} else {
				gameDesc.append("钓8条鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_DIAO_YU_10)) {
			if (hasFirst) {
				gameDesc.append(" 钓10条鱼");
			} else {
				gameDesc.append("钓10条鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_DIAO_YU_12)) {
			if (hasFirst) {
				gameDesc.append(" 钓12条鱼");
			} else {
				gameDesc.append("钓12条鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_159_DIAO_YU)) {
			if (hasFirst) {
				gameDesc.append(" 159钓鱼");
			} else {
				gameDesc.append("159钓鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_GEN_ZHUANG_DIAO_YU)) {
			if (hasFirst) {
				gameDesc.append(" 跟庄钓鱼");
			} else {
				gameDesc.append("跟庄钓鱼");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_YI_MA_ZHONG_TE)) {
			if (hasFirst) {
				gameDesc.append(" 一码中特");
			} else {
				gameDesc.append("一码中特");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_ZIMO_FENG_DING_2)) {
			if (hasFirst) {
				gameDesc.append(" 自摸2封顶");
			} else {
				gameDesc.append("自摸2封顶");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_ZIMO_FENG_DING_4)) {
			if (hasFirst) {
				gameDesc.append(" 自摸4封顶");
			} else {
				gameDesc.append("自摸4封顶");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_ZIMO_FENG_DING_6)) {
			if (hasFirst) {
				gameDesc.append(" 自摸6封顶");
			} else {
				gameDesc.append("自摸6封顶");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_ZIMO_WU_XIAN_FAN)) {
			if (hasFirst) {
				gameDesc.append(" 无限番");
			} else {
				gameDesc.append("无限番");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_GXLZ.GAME_RULE_MEN_QING)) {
			if (hasFirst) {
				gameDesc.append(" 门清");
			} else {
				gameDesc.append("门清");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_hncz(int _game_rule_index, int[] rules) {
		// for (int tmpInt : _game_rule_index) {
		// char[] chs = new char[Integer.SIZE];
		// for (int i = 0; i < Integer.SIZE; i++)
		// {
		// chs[Integer.SIZE - 1 - i] = (char) (((tmpInt >> i) & 1) + '0');
		// System.out.println(i+"："+chs[Integer.SIZE - 1 - i]);
		// }
		// System.out.println(new String(chs));
		// }

		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZIMOHU)) {
			if (hasFirst) {
				gameDesc.append(" 自摸胡");
			} else {
				gameDesc.append("自摸胡");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_QIANGGANGHU)) {
			if (hasFirst) {
				gameDesc.append(" 点炮胡(可抢杠胡)");
			} else {
				gameDesc.append("点炮胡(可抢杠胡)");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
			if (hasFirst) {
				gameDesc.append(" 三人场");
			} else {
				gameDesc.append("三人场");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_TWO)) {
			if (hasFirst) {
				gameDesc.append(" 二人场");
			} else {
				gameDesc.append("二人场");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONGZHONG)) {
			if (hasFirst) {
				gameDesc.append(" 红中");
			} else {
				gameDesc.append("红中");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_QIDUI)) {
			if (hasFirst) {
				gameDesc.append(" 可胡七对");
			} else {
				gameDesc.append("可胡七对");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_FEI_NIAO)) {
			if (hasFirst) {
				gameDesc.append(" 飞鸟");
			} else {
				gameDesc.append("飞鸟");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_WU_MAGIC_ADD_FAN)) {
			if (hasFirst) {
				gameDesc.append(" 无红中加倍");
			} else {
				gameDesc.append("无红中加倍");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_WU_MAGIC_QIANG_GANG_HU)) {
			if (hasFirst) {
				gameDesc.append(" 无红中抢杠胡");
			} else {
				gameDesc.append("无红中抢杠胡");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GANG_BAO_QUAN_BAO)) {
			if (hasFirst) {
				gameDesc.append(" 杠爆全包");
			} else {
				gameDesc.append("杠爆全包");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_DA_HU_FENG_DING)) {
			if (hasFirst) {
				gameDesc.append(" 大胡(10分封顶)");
			} else {
				gameDesc.append("大胡(10分封顶)");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_NON_PIAO_FEN)) {
			if (hasFirst) {
				gameDesc.append(" 不飘分");
			} else {
				gameDesc.append("不飘分");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_CS_PIAO_3)) {
			if (hasFirst) {
				gameDesc.append(" 飘3分");
			} else {
				gameDesc.append("飘3分");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_CS_PIAO_5)) {
			if (hasFirst) {
				gameDesc.append(" 飘5分");
			} else {
				gameDesc.append("飘5分");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				gameDesc.append(" 抓2鸟");
			} else {
				gameDesc.append("抓2鸟");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO0)) {
			if (hasFirst) {
				gameDesc.append(" 不抓鸟");
			} else {
				gameDesc.append("不抓鸟");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				gameDesc.append(" 抓4鸟");
			} else {
				gameDesc.append("抓4鸟");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				gameDesc.append(" 抓6鸟");
			} else {
				gameDesc.append("抓6鸟");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_JINNIAO)) {
			if (hasFirst) {
				gameDesc.append(" 金鸟");
			} else {
				gameDesc.append("金鸟");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_DUO_PAO)) {
			if (hasFirst) {
				gameDesc.append(" 一炮多响");
			} else {
				gameDesc.append("一炮多响");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_yytdh(int[] rules) {
		String des = "";
		boolean hasFirst = true;
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO1)) {
			if (hasFirst) {
				des += " 单鸟(倍)";
			} else {
				des += "单鸟(倍)";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不扎鸟";
			} else {
				des += "不扎鸟";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_QING_YI_SE_CHI)) {
			if (hasFirst) {
				des += " 清一色可吃";
			} else {
				des += "清一色可吃";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_JIANGJIANGHU)) {
			if (hasFirst) {
				des += " 将将胡(只自摸)";
			} else {
				des += "将将胡(只自摸)";
				hasFirst = true;
			}
		}

		return des;
	}

	public static String get_game_des_hnyongzhou(int[] rules, int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZIMOHU)) {
			if (hasFirst) {
				gameDesc.append(" 自摸胡");
			} else {
				gameDesc.append("自摸胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_GANG_HU)) {
			if (hasFirst) {
				gameDesc.append(" 点炮胡");
			} else {
				gameDesc.append("点炮胡");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_EAT)) {
			if (hasFirst) {
				gameDesc.append(" 可吃");
			} else {
				gameDesc.append("可吃");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_GANG_SUI_HU)) {
			if (hasFirst) {
				gameDesc.append(" 杠随胡");
			} else {
				gameDesc.append("杠随胡");
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_SCORE_ADD)) {
			if (hasFirst) {
				gameDesc.append(" 带风牌");
			} else {
				gameDesc.append("带风牌");
				hasFirst = true;
			}
		}
		if (hasFirst) {
			gameDesc.append(" 抓" + getCsDingNiaoNum(rules) + "鸟");
		} else {
			gameDesc.append("抓" + getCsDingNiaoNum(rules) + "鸟");
			hasFirst = true;
		}

		return gameDesc.toString();
	}

	public static String get_game_des_hnyiyang_szg(int _game_rule_index, DescParams descParam) {
		StringBuilder des = new StringBuilder();
		if (descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) > 0) {
			des.append("允许少人模式");
		} else {
			if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_PLAYER_3)) {
				des.append("三人场");
			} else {
				des.append("四人场");
			}
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_FENG_DING_32)) {
			des.append(" (32*倍率)封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_FENG_DING_64)) {
			des.append(" (64*倍率)封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_FENG_DING_128)) {
			des.append(" (128*倍率)封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_NIAO_1)) {
			des.append(" 抓1鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_NIAO_2)) {
			des.append(" 抓2鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_NIAO_3)) {
			des.append(" 抓3鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_HUNAN_CS_FEI_NIAO1)) {
			des.append(" 飞1鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_HUNAN_CS_FEI_NIAO2)) {
			des.append(" 飞2鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_HUNAN_CS_FEI_NIAO3)) {
			des.append(" 飞3鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_HAI_DI_SUAN_1_NIAO)) {
			des.append(" 海底算1鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_HAI_DI_SUAN_3_NIAO)) {
			des.append(" 海底算3鸟");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_YI_TIAO_LONG)) {
			des.append(" 一条龙");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_MEN_QING)) {
			des.append(" 门清");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_FAN_PAO_FAN_BEI)) {
			des.append(" 放炮翻倍");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_YI_ZI_CHUI_XI)) {
			des.append(" 一字撬有喜");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_NON_TING_FA_FEN)) {
			des.append(" 未听牌罚分");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_BAN_BAN_HU)) {
			des.append(" 板板胡");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_YI_PAO_DUO_XIANG)) {
			des.append(" 一炮多响");
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang_SZG.GAME_RULE_GEN_ZHUANG)) {
			des.append(" 跟庄");
		}
		int value = descParam.getRuleValue(GameConstants.GAME_RULE_ALL_BEI_LV);
		if (value > 0) {
			des.append(" 倍率(" + value + "倍)");
		}

		return des.toString();
	}

	public static String get_game_des_mj_gzcg(int[] rules, int _game_rule_index) {
		StringBuilder des = new StringBuilder();
		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_PLAYER_NUMBER_TWO)) {
			des.append(" 2人");
		} else if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_PLAYER_NUMBER_THREE)) {
			des.append(" 3人");
		} else if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_PLAYER_NUMBER_FOUR)) {
			des.append(" 4人");
		} else {
			des.append(" 允许少人模式");
		}

		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_DI_LEI)) {
			des.append(" 上下翻埋地雷");
		} else if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_ZUOYOU_FAN)) {
			des.append(" 上下左右翻精");
		} else {
			des.append(" 上下左左右右翻精");
		}

		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_TONG_ZHUANG)) {
			des.append(" 庄闲通庄");
		} else {
			des.append(" 庄家翻倍");
		}

		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_PING_HU)) {
			des.append(" 可平胡");
		} else if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_ZI_MO)) {
			des.append(" 仅自摸");
		} else {
			des.append(" 精必钓");
		}

		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_BASE_SCORE_ONE)) {
			des.append(" 底分1");
		} else if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_BASE_SCORE_TWO)) {
			des.append(" 底分2");
		} else if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_BASE_SCORE_FOUR)) {
			des.append(" 底分4");
		}

		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_REWARD)) {
			des.append(" 出精奖励");
		}

		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_QUAN_BU_JING)) {
			des.append(" 全部精");
		} else {
			des.append(" 仅上精");
		}

		if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_KE_CHI)) {
			des.append(" 可吃牌");
		} else if (has_rule(_game_rule_index, Constants_MJ_GZCG.GAME_RULE_BU_KE_CHI)) {
			des.append(" 不可吃牌");
		}

		return Strings.isNullOrEmpty(des.toString()) ? "" : des.substring(1, des.length());
	}

	public static String get_game_des_mj_huojia(int[] rules, int _game_rule_index) {
		StringBuilder des = new StringBuilder();

		if (has_rule(_game_rule_index, Constants_HuoJia.GAME_RULE_YI_JIU_CHENG_JU)) {
			des.append(" 19成句");
		}

		if (has_rule(_game_rule_index, Constants_HuoJia.GAME_RULE_FENG_CHENG_JU)) {
			des.append(" 风成句");
		}

		if (has_rule(_game_rule_index, Constants_HuoJia.GAME_RULE_QUE_MEN)) {
			des.append(" 缺门");
		}

		if (has_rule(_game_rule_index, Constants_HuoJia.GAME_RULE_ZI_MO_FAN_BEI)) {
			des.append(" 自摸翻倍");
		}

		if (has_rule(_game_rule_index, Constants_HuoJia.GAME_RULE_MING_TING)) {
			des.append(" 明听");
		}

		if (has_rule(_game_rule_index, Constants_HuoJia.GAME_RULE_AN_TING)) {
			des.append(" 暗听");
		}

		return des.toString();
	}

	public static String get_game_des_mj_sichuan(int[] rules, int _game_rule_index) {
		StringBuilder des = new StringBuilder();

		if (has_rule(rules, Constants_SiChuan.GAME_RULE_FD_2_FAN)) {
			des.append(" 封顶2番");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_FD_3_FAN)) {
			des.append(" 封顶3番");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_FD_4_FAN)) {
			des.append(" 封顶4番");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_FD_5_FAN)) {
			des.append(" 封顶5番");
		}

		if (has_rule(rules, Constants_SiChuan.GAME_RULE_ZM_JIA_DI)) {
			des.append(" 自摸加底");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_ZM_FAN_BEI)) {
			des.append(" 自摸翻倍");
		}

		if (has_rule(rules, Constants_SiChuan.GAME_RULE_DGH_DIAN_PAO)) {
			des.append(" 点杠花(点炮)");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_DGH_ZI_MO)) {
			des.append(" 点杠花(自摸)");
		}

		if (has_rule(rules, Constants_SiChuan.GAME_RULE_HUAN_SAN_ZHANG)) {
			des.append(" 换三张");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_YAO_JIU_JIANG_DUI)) {
			des.append(" 幺九将对");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_MEN_QING_ZHONG_ZHANG)) {
			des.append(" 门清中张");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_TIAN_DI_HU)) {
			des.append(" 天地胡");
		}
		if (has_rule(rules, Constants_SiChuan.GAME_RULE_GUA_CHA)) {
			des.append(" 擦挂");
		}

		if (has_rule(rules, Constants_SiChuan.GAME_RULE_TING_PAI_TS)) {
			des.append(" 听牌提示");
		}

		return des.toString();
	}

	public static String get_game_des_mj_nd(int[] rules, int _game_rule_index) {
		StringBuilder des = new StringBuilder();

		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_PLAYER_4)) {
			des.append(" 四人场");
		} else if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_PLAYER_3)) {
			des.append(" 三人场");
		} else if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_PLAYER_2)) {
			des.append(" 二人场");
		}

		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_JIA_DA)) {
			des.append(" 加大");
		}

		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_GEN_ZHUANG)) {
			des.append(" 跟庄");
		}

		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_MA_FANG_WEI)) {
			des.append(" 方位马");
		}

		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_MA_DING_ZHUANG)) {
			des.append(" 定庄马");
		}
		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_QI_HU_TI_SHI)) {
			des.append(" 弃胡提示");
		}

		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_MA_2)) {
			des.append(" 2马");
		} else if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_MA_4)) {
			des.append(" 4马");
		} else if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_MA_6)) {
			des.append(" 6马");
		} else if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_MA_8)) {
			des.append(" 8马");
		} else {
			des.append(" 0马");
		}

		if (has_rule(_game_rule_index, GameConstants_ND.GAME_RULE_HAI_DI)) {
			des.append(" 海底捞");
		}

		return Strings.isNullOrEmpty(des.toString()) ? "" : des.substring(1, des.length());
	}

	public static String get_game_des_nsb(int _game_rule_index) {
		StringBuilder des = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_DAN_JU)) {
			des.append("单局");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_QIAN_FEN_JU)) {
			des.append("千分局");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_DAN_JU_1)) {
			des.append(" 单局1");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_DAN_JU_2)) {
			des.append(" 单局2");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_DAN_JU_4)) {
			des.append(" 单局4");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_QIAN_FEN_JU_300)) {
			des.append(" 300分千分局");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_QIAN_FEN_JU_500)) {
			des.append(" 500分千分局");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_QIAN_FEN_JU_1000)) {
			des.append(" 1000分千分局");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_SAN_DAI_DUI)) {
			des.append(" 三带一对");
		}
		if (has_rule(_game_rule_index, GameConstants_NSB.GAME_RULE_FEI_JI_DAI_DUI)) {
			des.append(" 飞机带翅膀");
		}
		return des.toString();
	}

	public static String get_game_des_yuan_jiang(int[] rules, DescParams desc) {
		String des = "";
		boolean hasFirst = false;
		if (desc.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) > 0) {
			if (hasFirst) {
				des += " 允许少人模式";
			} else {
				des += "允许少人模式";
				hasFirst = true;
			}
		} else if (has_rule(rules, Constants_YuanJiang.GAME_RULE_PLAYER_TWO)) {
			if (hasFirst) {
				des += " 二人";
			} else {
				des += "二人";
				hasFirst = true;
			}
		} else if (has_rule(rules, Constants_YuanJiang.GAME_RULE_PLAYER_THREE)) {
			if (hasFirst) {
				des += " 三人";
			} else {
				des += "三人";
				hasFirst = true;
			}
		} else if (has_rule(rules, Constants_YuanJiang.GAME_RULE_PLAYER_FOUR)) {
			if (hasFirst) {
				des += " 四人";
			} else {
				des += "四人";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 四人";
			} else {
				des += "四人";
				hasFirst = true;
			}
		}
		if (has_rule(rules, Constants_YuanJiang.GAME_RULE_24_BEI_FENG_DING)) {
			if (hasFirst) {
				des += " 24倍";
			} else {
				des += "24倍";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 无上限";
			} else {
				des += "无上限";
				hasFirst = true;
			}
		}
		if (has_rule(rules, Constants_YuanJiang.GAME_RULE_PING_HU_KE_JIE_PAO)) {
			if (hasFirst) {
				des += "   平胡可接炮";
			} else {
				des += "平胡可接炮";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 平胡不可接炮";
			} else {
				des += "平胡不可接炮";
				hasFirst = true;
			}
		}
		if (has_rule(rules, Constants_YuanJiang.GAME_RULE_YOU_MEN_QING)) {
			if (hasFirst) {
				des += " 有门清";
			} else {
				des += "有门清";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 无门清";
			} else {
				des += "无门清";
				hasFirst = true;
			}
		}
		if (has_rule(rules, Constants_YuanJiang.GAME_RULE_MQJJH_KE_JIE_PAO)) {
			if (hasFirst) {
				des += " 门清将将胡可接炮";
			} else {
				des += "门清将将胡可接炮";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 门清将将胡不可接炮";
			} else {
				des += "门清将将胡不可接炮";
				hasFirst = true;
			}
		}
		if (has_rule(rules, Constants_YuanJiang.GAME_RULE_YI_ZI_QIAO_YOU_XI)) {
			if (hasFirst) {
				des += " 有喜";
			} else {
				des += "有喜";
				hasFirst = true;
			}

			if (has_rule(rules, Constants_YuanJiang.GAME_RULE_KA_QIAO)) {
				if (hasFirst) {
					des += " 卡撬";
				} else {
					des += "卡撬";
					hasFirst = true;
				}
			}
		} else {
			if (hasFirst) {
				des += " 没喜";
			} else {
				des += "没喜";
				hasFirst = true;
			}
		}
		int value = desc.getRuleValue(Constants_YuanJiang.GAME_RULE_DI_FEN);
		if (value > 0) {
			if (hasFirst) {
				des += " 倍率(" + value + ")";
			} else {
				des += " 倍率(" + value + ")";
				hasFirst = true;
			}
		}
		return des.toString();
	}

	public static String get_game_des_hnyiyang(int[] rules, int _game_rule_index, DescParams descParam) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_BAO_TING)) {
			if (hasFirst) {
				des += " 报听";
			} else {
				des += "报听";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_MEN_QING)) {
			if (hasFirst) {
				des += " 门清";
			} else {
				des += "门清";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_M_Q_J_J_HU)) {
			if (hasFirst) {
				des += " 门清将将胡";
			} else {
				des += "门清将将胡";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_ZHANIAO)) {
			if (hasFirst) {
				des += " 抓" + getCsDingNiaoNum_YiYang(_game_rule_index) + "鸟";
			} else {
				des += "抓" + getCsDingNiaoNum_YiYang(_game_rule_index) + "鸟";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_FEI_NIAO)) {
			if (hasFirst) {
				des += " 飞" + getFeiNiaoNum_YiYang(_game_rule_index) + "鸟";
			} else {
				des += "飞" + getFeiNiaoNum_YiYang(_game_rule_index) + "鸟";
				hasFirst = true;
			}
		}

		int value = descParam.getRuleValue(GameConstants.GAME_RULE_ALL_BEI_LV);
		if (value > 0) {
			if (hasFirst) {
				des += " 倍率(" + value + "倍)";
			} else {
				des += "倍率(" + value + "倍)";
			}
		}

		return des;
	}

	public static String get_game_des_jszz(int _game_rule_index) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIANGSU_BAO_CHONG)) {
			if (hasFirst) {
				des += " 包冲";
			} else {
				des += "包冲";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIANGSU_PEI_CHONG)) {
			if (hasFirst) {
				des += " 陪冲";
			} else {
				des += "陪冲";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIANGSU_YUAN_ZI)) {
			if (hasFirst) {
				des += " 园子";
			} else {
				des += "园子";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIANGSU_JIN_CHONG)) {
			if (hasFirst) {
				des += " 紧冲";
			} else {
				des += "紧冲";
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_JIANGSU_DOUBLE)) {
			if (hasFirst) {
				des += " 翻倍打法";
			} else {
				des += "翻倍打法";
				hasFirst = true;
			}
		}
		return des;
	}

	public static String get_game_des_hnsy(int[] rules, DescParams descParam) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_DAIFENG)) {
			if (hasFirst) {
				des += " 带风";
			} else {
				des += "带风";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不带风";
			} else {
				des += "不带风";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_EAT)) {
			if (hasFirst) {
				des += " 可吃";
			} else {
				des += "可吃";
				hasFirst = true;
			}
		} else if (descParam.getRuleValue(GameConstants.GAME_RULE_QING_YI_SE_KE_CHI) == 1) {
			if (hasFirst) {
				des += " 清一色可吃";
			} else {
				des += "清一色可吃";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不可吃";
			} else {
				des += "不可吃";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_JIA_CHUI)) {
			if (hasFirst) {
				des += " 加锤";
			} else {
				des += "加锤";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不加锤";
			} else {
				des += "不加锤";
				hasFirst = true;
			}
		}

		if (descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) > 0) {
			if (hasFirst) {
				des += " 允许少人模式";
			} else {
				des += "允许少人模式";
				hasFirst = true;
			}
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_THREE)) {
			if (hasFirst) {
				des += " 三人场";
			} else {
				des += "三人场";
				hasFirst = true;
			}
		} else {

			if (hasFirst) {
				des += " 四人场";
			} else {
				des += "四人场";
				hasFirst = true;
			}
		}
		return des;
	}

	public static String get_game_des_hnhengyang(int[] rules) {
		String des = "";
		boolean hasFirst = false;
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHUANG_XIAN)) {
			if (hasFirst) {
				des += " 庄闲";
			} else {
				des += "庄闲";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_HONZLAIZI)) {
			if (hasFirst) {
				des += " 红中癞子";
			} else {
				des += "红中癞子";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_WANGBAPAI)) {
			if (hasFirst) {
				des += " 王霸牌";
			} else {
				des += "王霸牌";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_EAT)) {
			if (hasFirst) {
				des += " 可以吃";
			} else {
				des += "可以吃";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_WOWONIAO)) {
			if (hasFirst) {
				des += " 窝窝鸟";
			} else {
				des += "窝窝鸟";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				des += " 抓2鸟";
			} else {
				des += "抓2鸟";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				des += " 抓4鸟";
			} else {
				des += "抓4鸟";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				des += " 抓6鸟";
			} else {
				des += "抓6鸟";
				hasFirst = true;
			}
		}

		return des;
	}

	public static String get_game_des_hnchangde(int[] rules, int _game_rule_index, int _game_type_index) {
		// for (int tmpInt : _game_rule_index) {
		// char[] chs = new char[Integer.SIZE];
		// for (int i = 0; i < Integer.SIZE; i++)
		// {
		// chs[Integer.SIZE - 1 - i] = (char) (((tmpInt >> i) & 1) + '0');
		// System.out.println(i+"："+chs[Integer.SIZE - 1 - i]);
		// }
		// System.out.println(new String(chs));
		// }

		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_DT_HONG_ZHONG)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_THREE)) {
				if (hasFirst) {
					gameDesc.append(" 三人场");
				} else {
					gameDesc.append("三人场");
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					gameDesc.append(" 三人场");
				} else {
					gameDesc.append("三人场");
					hasFirst = true;
				}
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZIMOHU)) {
			if (hasFirst) {
				gameDesc.append(" 自摸胡");
			} else {
				gameDesc.append("自摸胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_GANG_HU)) {
			if (hasFirst) {
				gameDesc.append(" 点炮胡");
			} else {
				gameDesc.append("点炮胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_HONGZHONG)) {
			if (hasFirst) {
				gameDesc.append(" 红中癞子");
			} else {
				gameDesc.append("红中癞子");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_HUANG_ZHUANG_HUANG_GANG)) {
			if (hasFirst) {
				gameDesc.append(" 荒庄荒杠");
			} else {
				gameDesc.append("荒庄荒杠");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_QIANG_GANG_HU_JIANG_MA)) {
			if (hasFirst) {
				gameDesc.append(" 抢杠胡奖码");
			} else {
				gameDesc.append("抢杠胡奖码");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			if (hasFirst) {
				gameDesc.append(" 159奖码-奖2码");
			} else {
				gameDesc.append("159奖码-奖2码");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			if (hasFirst) {
				gameDesc.append(" 159奖码-奖4码");
			} else {
				gameDesc.append("159奖码-奖4码");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			if (hasFirst) {
				gameDesc.append(" 159奖码-奖6码");
			} else {
				gameDesc.append("159奖码-奖6码");
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_MO_JI_JIANG_JI)) {
			if (hasFirst) {
				gameDesc.append(" 摸几奖几");
			} else {
				gameDesc.append("摸几奖几");
				hasFirst = true;
			}
		}
		if (is_mj_type(_game_type_index, GameConstants.GAME_TYPE_MJ_DT_HONG_ZHONG)) {
			if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_DAIFENG)) {
				if (hasFirst) {
					gameDesc.append(" 带风");
				} else {
					gameDesc.append("带风");
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					gameDesc.append(" 不带风");
				} else {
					gameDesc.append("不带风");
					hasFirst = true;
				}
			}
		}
		return gameDesc.toString();
	}

	public static String get_game_des_hnsmx(int[] rules) {
		String des = "";

		boolean hasFirst = false;
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_DAI_HUN)) {
			if (hasFirst) {
				des += " 原混";
			} else {
				des += "原混";
				hasFirst = true;
			}
		} else if (has_rule(rules, GameConstants.GAME_RULE_HENAN_SMX_SHANG_HUN)) {
			if (hasFirst) {
				des += " 上混";
			} else {
				des += "上混";
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				des += " 不带混";
			} else {
				des += "不带混";
				hasFirst = true;
			}
		}

		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_SMX_ANGANG_DOUBLE)) {
			if (hasFirst) {
				des += " 暗杠翻倍";
			} else {
				des += "暗杠翻倍";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_SMX_ZHUANG_NO_DOUBLE)) {
			if (hasFirst) {
				des += " 庄家不翻倍";
			} else {
				des += "庄家不翻倍";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_SMX_GAGN_SUI_HU_ZOU)) {
			if (hasFirst) {
				des += " 杠随胡走";
			} else {
				des += "杠随胡走";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_DAI_PAO)) {
			if (hasFirst) {
				des += " 买跑";
			} else {
				des += "买跑";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_SMX_BIAO_YAN)) {
			if (hasFirst) {
				des += " 表演";
			} else {
				des += "表演";
				hasFirst = true;
			}
		}
		if (has_rule(rules, GameConstants.GAME_RULE_HENAN_SMX_BIAO_YAN_FEN)) {
			if (hasFirst) {
				des += " 下表演分";
			} else {
				des += "下表演分";
				hasFirst = true;
			}
		}
		return des;
	}

	public static String get_game_des_phz_nx(int _game_rule_index, DescParams descParam) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_SPEED_FAST)) {
			sb.append(" 快速场");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) != 0) {
			sb.append(" 少人模式");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_PLAYER_TWO)) {
			sb.append(" 二人场");
		} else {
			sb.append(" 三人场");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_PIAO_NIAO)) {
			sb.append(" 活飘");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_JIAFEN)) {
			sb.append(" 自摸+1");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_JIAFEN_TWO)) {
			sb.append(" 自摸+2");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_ZHANIAO)) {
			sb.append(" 坐飘2");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_ZHANIAO_ONE)) {
			sb.append(" 坐飘1");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_ZHANIAO_THREE)) {
			sb.append(" 坐飘3");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_JIAOHONG)) {
			sb.append(" 加红加小加大");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_HAI_DI)) {
			sb.append(" 海底胡");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_SHI_BA_DA)) {
			sb.append(" 十八大");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_SHI_BA_XIAO)) {
			sb.append(" 十八小");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_SHI_LIU_XIAO)) {
			sb.append(" 十六小");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_MAX_FIVE)) {
			sb.append(" 5番封顶");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_MAX_TEN)) {
			sb.append(" 10番封顶");
		} else {
			sb.append(" 番数不封顶");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_SHUA_HOU)) {
			sb.append(" 耍猴");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_DI_HU)) {
			sb.append(" 地胡");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_JIU_HU_KE_HU)) {
			sb.append(" 9息起胡 3息一分");
		} else {
			sb.append(" 15息起胡 3息一分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_DI_FEN_2)) {
			sb.append(" 底分+2");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_DI_FEN_3)) {
			sb.append(" 底分+3");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_NX_DI_FEN_4)) {
			sb.append(" 底分+4");
		} else {
			sb.append(" 底分+2");
		}

		if (descParam.getRuleValue(GameConstants.GAME_RULE_HGW_MINUE_20_CARD) != 0) {
			sb.append(" 去20张");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_phz_xp(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_DIFEN_ONE)) {
			sb.append(" 1分");
		}
		if (has_rule(_game_rule_index, 5)) { // 这里如果要用常量就需要更新代理服 暂时先写成变量5
			sb.append(" 无底分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_DIFEN_TWO)) {
			sb.append(" 2分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_DIFEN_FOUR)) {
			sb.append(" 4分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_KE_CHONG)) {
			sb.append(" 可冲");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_ZI_MO_QIANG_ZHI_HU)) {
			sb.append(" 自摸强制胡牌");
		}

		sb.append(" 18息起胡");

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_phz_sybp(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		sb.append(" 100息结束 10息起胡");

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_phz_ldfpf(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LDFPF_FENGDING200)) {
			sb.append(" 200胡息");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_LDFPF_FENGDING400)) {
			sb.append(" 400胡息");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_hunan_xt(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_SHANG_WANG)) {
			if (hasFirst) {
				gameDesc.append(" 上王");
			} else {
				gameDesc.append("上王");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_XIA_WANG)) {
			if (hasFirst) {
				gameDesc.append(" 下王");
			} else {
				gameDesc.append("下王");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_SHANG_XIA_WANG)) {
			if (hasFirst) {
				gameDesc.append(" 上下王");
			} else {
				gameDesc.append("上下王");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_XUAN_MEI_2)) {
			if (hasFirst) {
				gameDesc.append(" 选2美");
			} else {
				gameDesc.append("选2美");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_XUAN_MEI_3)) {
			if (hasFirst) {
				gameDesc.append(" 选3美");
			} else {
				gameDesc.append("选3美");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_XUAN_MEI_4)) {
			if (hasFirst) {
				gameDesc.append(" 选4美");
			} else {
				gameDesc.append("选4美");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_ZHUA_NIAO_2)) {
			if (hasFirst) {
				gameDesc.append(" 抓2鸟");
			} else {
				gameDesc.append("抓2鸟");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_ZHUA_NIAO_4)) {
			if (hasFirst) {
				gameDesc.append(" 抓4鸟");
			} else {
				gameDesc.append("抓4鸟");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, MJConstants_HuNan_XiangTan.GAME_RULE_HUNAN_ZHUA_NIAO_6)) {
			if (hasFirst) {
				gameDesc.append(" 抓6鸟");
			} else {
				gameDesc.append("抓6鸟");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_hy258(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_THREE)) {
			if (hasFirst) {
				gameDesc.append(" 三人场");
			} else {
				gameDesc.append("三人场");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_FOUR)) {
			if (hasFirst) {
				gameDesc.append(" 四人场");
			} else {
				gameDesc.append("四人场");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHUANG_XIAN)) {
			if (hasFirst) {
				gameDesc.append(" 庄闲(得分)");
			} else {
				gameDesc.append("庄闲(得分)");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHONGNIAO_JIA_FEN)) {
			if (hasFirst) {
				gameDesc.append(" 中鸟加分");
			} else {
				gameDesc.append("中鸟加分");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHONGNIAO_FAN_BEI)) {
			if (hasFirst) {
				gameDesc.append(" 中鸟翻倍");
			} else {
				gameDesc.append("中鸟翻倍");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHANIAO1_CHENG)) {
			if (hasFirst) {
				gameDesc.append(" 抓1鸟");
			} else {
				gameDesc.append("抓1鸟");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHANIAO2_CHENG)) {
			if (hasFirst) {
				gameDesc.append(" 抓2鸟");
			} else {
				gameDesc.append("抓2鸟");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHANIAO3_CHENG)) {
			if (hasFirst) {
				gameDesc.append(" 抓3鸟(自摸)");
			} else {
				gameDesc.append("抓3鸟(自摸)");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHANIAO2_JIA)) {
			if (hasFirst) {
				gameDesc.append(" 抓2鸟");
			} else {
				gameDesc.append("抓2鸟");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHANIAO4_JIA)) {
			if (hasFirst) {
				gameDesc.append(" 抓4鸟");
			} else {
				gameDesc.append("抓4鸟");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_HY258.GAME_RULE_HY258_ZHANIAO6_JIA)) {
			if (hasFirst) {
				gameDesc.append(" 抓6鸟");
			} else {
				gameDesc.append("抓6鸟");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_jz(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_DAI_PAO)) {
			if (hasFirst) {
				gameDesc.append(" 带跑");
			} else {
				gameDesc.append("带跑");
				hasFirst = true;
			}

			if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_GANG_PAO)) {
				if (hasFirst) {
					gameDesc.append(" 杠跑");
				} else {
					gameDesc.append("杠跑");
					hasFirst = true;
				}
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_BUDAIPAO)) {
			if (hasFirst) {
				gameDesc.append(" 不带跑");
			} else {
				gameDesc.append("不带跑");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_DU_TING)) {
			if (hasFirst) {
				gameDesc.append(" 独听");
			} else {
				gameDesc.append("独听");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_BAO_TING)) {
			if (hasFirst) {
				gameDesc.append(" 报听");
			} else {
				gameDesc.append("报听");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_HU_BIANG_KA)) {
			if (hasFirst) {
				gameDesc.append(" 只胡边坎吊");
			} else {
				gameDesc.append("只胡边坎吊");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_LIANG_69)) {
			if (hasFirst) {
				gameDesc.append(" 连6连9");
			} else {
				gameDesc.append("连6连9");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_515)) {
			if (hasFirst) {
				gameDesc.append(" 515场");
			} else {
				gameDesc.append("515场");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_ZHUANG_XIAN)) {
			if (hasFirst) {
				gameDesc.append(" 庄闲");
			} else {
				gameDesc.append("庄闲");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_ZIMO_BU_FANG_BEI)) {
			if (hasFirst) {
				gameDesc.append(" 自摸不翻倍");
			} else {
				gameDesc.append("自摸不翻倍");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_QIN_YI_SE_FAN_BEI)) {
			if (hasFirst) {
				gameDesc.append(" 清一色翻倍");
			} else {
				gameDesc.append("清一色翻倍");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_GANG_KAI_FAN_BEI)) {
			if (hasFirst) {
				gameDesc.append(" 杠花翻倍");
			} else {
				gameDesc.append("杠花翻倍");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_QI_DUI_FAN_BEI)) {
			if (hasFirst) {
				gameDesc.append(" 七对翻倍");
			} else {
				gameDesc.append("七对翻倍");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_GUO_SHOU_HU)) {
			if (hasFirst) {
				gameDesc.append(" 碰牌后跟张打不可胡");
			} else {
				gameDesc.append("碰牌后跟张打不可胡");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, GameConstants_JZ.GAME_RULE_JZ_GUO_HU_ZI_MO)) {
			if (hasFirst) {
				gameDesc.append(" 过胡自摸");
			} else {
				gameDesc.append("过胡自摸");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_sdh(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SDH_JINGDIAN)) {
			sb.append(" 经典玩法");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SDH_SHUANGJINDANCHU)) {
			sb.append(" 双进单出");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SDH_QUDIAO6)) {
			sb.append(" 去掉6");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SDH_BAOFULIUSHOU)) {
			sb.append(" 报副留守");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SDH_LIANGDANG)) {
			sb.append(" 认输两档");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SDH_SANDANG)) {
			sb.append(" 认输三档");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_gdy(int rules[]) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_WIN_ZHUANG)) {
			sb.append(" 赢家当庄");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_RAND_ZHUANG)) {
			sb.append(" 随机当庄");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_OWNER_ZHUANG)) {
			sb.append(" 房主当庄");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_CHU_FINISH)) {
			sb.append(" 出完结束");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_SHU_FINISH)) {
			sb.append(" 顺完结束");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_ALL_BUPAI)) {
			sb.append(" 全体补牌");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_WIN_BUPAI)) {
			sb.append(" 赢家补牌");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_ONE_SCORE)) {
			sb.append(" 底分：一分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_TWO_SCORE)) {
			sb.append(" 底分：两分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_THREE_SCORE)) {
			sb.append(" 底分：三分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_FOUR_SCORE)) {
			sb.append(" 底分：五分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_TWO)) {
			sb.append(" 倍数限制：一炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_FOUR)) {
			sb.append(" 倍数限制：二炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_EIGHT)) {
			sb.append(" 倍数限制：三炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_SIXTEEN)) {
			sb.append(" 倍数限制：五炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_UN)) {
			sb.append(" 倍数限制：不限");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_gdy_hb(int rules[]) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_WIN_ZHUANG)) {
			sb.append(" 赢家当庄");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_RAND_ZHUANG)) {
			sb.append(" 随机当庄");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_OWNER_ZHUANG)) {
			sb.append(" 房主当庄");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_CHU_FINISH)) {
			sb.append(" 出完结束");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_SHU_FINISH)) {
			sb.append(" 顺完结束");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_ALL_BUPAI)) {
			sb.append(" 全体补牌");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_WIN_BUPAI)) {
			sb.append(" 赢家补牌");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_ONE_SCORE)) {
			sb.append(" 底分：一分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_TWO_SCORE)) {
			sb.append(" 底分：两分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_THREE_SCORE)) {
			sb.append(" 底分：三分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_FOUR_SCORE)) {
			sb.append(" 底分：五分");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_TWO)) {
			sb.append(" 倍数限制：一炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_FOUR)) {
			sb.append(" 倍数限制：二炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_EIGHT)) {
			sb.append(" 倍数限制：三炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_SIXTEEN)) {
			sb.append(" 倍数限制：五炸");
		}
		if (has_rule(rules, GameConstants.GAME_RULE_GDY_BOOM_LIMIT_UN)) {
			sb.append(" 倍数限制：不限");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_ssz_jd(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_ZHUANG_TONGBI)) {
			sb.append(" 通比不坐庄");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_QIANG_ZHUANG)) {
			sb.append(" 每轮抢庄");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_FNAGZHU_ZHUANG)) {
			sb.append(" 房主当庄");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DAQIANG_DOUBLE)) {
			sb.append(" 打枪翻倍");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DAQIANG_ADDONE)) {
			sb.append(" 打枪加一");
		} else {
			sb.append(" 没有打枪");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_SWAT_DOUBLE)) {
			sb.append(" 全垒打翻倍");
		} else {
			sb.append(" 没有全垒打");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DEAL_CARD_60)) {
			sb.append(" 60秒理牌时间");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DEAL_CARD_40)) {
			sb.append(" 40秒理牌时间");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DEAL_CARD_25)) {
			sb.append(" 25秒理牌时间");
		} else {
			sb.append(" 不限理牌时间");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_ssz_zz(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_ZHUANG_TONGBI)) {
			sb.append(" 通比不坐庄");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_QIANG_ZHUANG)) {
			sb.append(" 每轮抢庄");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_FNAGZHU_ZHUANG)) {
			sb.append(" 房主当庄");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DAQIANG_DOUBLE)) {
			sb.append(" 打枪翻倍");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DAQIANG_ADDONE)) {
			sb.append(" 打枪加一");
		} else {
			sb.append(" 没有打枪");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_SWAT_DOUBLE)) {
			sb.append(" 全垒打翻倍");
		} else {
			sb.append(" 没有全垒打");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_BI_HUA_SE)) {
			sb.append(" 比花色");
		} else {
			sb.append(" 不比花色");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DEAL_CARD_60)) {
			sb.append(" 90秒理牌时间");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DEAL_CARD_40)) {
			sb.append(" 60秒理牌时间");
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_SSZ_JD_DEAL_CARD_25)) {
			sb.append(" 25秒理牌时间");
		} else {
			sb.append(" 不限理牌时间");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_deh_jd(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_TE_PAI)) {
			sb.append(" 双花十和三花六");
		} else {
			sb.append(" 没有特牌");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_DI_JIU_WANG)) {
			sb.append(" 有地九王");
		} else {
			sb.append(" 地九王算一点");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_DI_ZHUANG_FIRST)) {
			sb.append(" 庄家先手");
		} else {
			sb.append(" 没有先后手");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_deh_mq(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_TE_PAI)) {
			sb.append(" 双花十和三花六");
		} else {
			sb.append(" 没有特牌");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_DI_JIU_WANG)) {
			sb.append(" 有地九王");
		} else {
			sb.append(" 地九王算一点");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_DI_ZHUANG_FIRST)) {
			sb.append(" 庄家先手");
		} else {
			sb.append(" 没有先后手");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_MANG_PI_TWO)) {
			sb.append(" 2分芒皮");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_MANG_PI_THREE)) {
			sb.append(" 3分芒皮");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DEH_MANG_PI_FIVE)) {
			sb.append(" 5分芒皮");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_whz_yy(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YYWHZ_KA_WAI)) {
			sb.append(" 卡歪");
		} else {
			sb.append(" 不卡歪");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YYWHZ_BANKER_DI_HU)) {
			sb.append(" 庄家地胡");
		} else {
			sb.append(" 庄家不地胡");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_whz_yiyang(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YYWHZ_KA_WAI)) {
			sb.append(" 卡歪");
		} else {
			sb.append(" 不卡歪");
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_YYWHZ_BANKER_DI_HU)) {
			sb.append(" 庄家地胡");
		} else {
			sb.append(" 庄家不地胡");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_sdh_xt(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_JINGDIAN)) {
			sb.append(" 单进单出");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_SHUANGJINDANCHU)) {
			sb.append(" 双进单出");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_XIAOGUANG_25)) {
			sb.append(" 25分小光");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_XIAOGUANG_30)) {
			sb.append(" 30分小光");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_BAOFULIUSHOU)) {
			sb.append(" 报副留守");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_MAX_DI)) {
			sb.append(" 60分起叫");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_YI_DANG_REN_SHU)) {
			sb.append(" 一档认输扣6分");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_NEVER_TURN_BACK)) {
			sb.append(" 60分不回头");
		}
		if (has_rule(_game_rule_index, SDHConstants_XT.GAME_RULE_SDH_BU_DA_WU_ZHU)) {
			sb.append(" 不打无主");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_lp_xp(int _game_rule_index) {
		String des = "";
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_BU_DAI_HUA)) {
			des += " 不带花 ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_DAI_HUA)) {
			des += " 带花 ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_ZHUANG_XIAN)) {
			des += " 有庄闲 ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_ZI_MO_HU)) {
			des += " 自摸胡";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_DI_FEN_ONE)) {
			des += " 底分：一分 ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_DI_FEN_TWO)) {
			des += " 底分：二分 ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_DI_FEN_THREE)) {
			des += " 底分：三分 ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_DI_FEN_FOUR)) {
			des += " 底分：四分 ";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_LP_CHONGFEN)) {
			des += " 冲分 ";
		}
		return des;
	}

	public static String get_gaem_des_HZLZG(int _game_rule_index) {
		StringBuilder des = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants_HZLZG.RULE_TYPE_JIN_DING_10)) {
			des.append(" 10封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_HZLZG.RULE_TYPE_JIN_DING_20)) {
			des.append(" 20封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_HZLZG.RULE_TYPE_JIN_DING_50)) {
			des.append(" 50封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_HZLZG.RULE_TYPE_JIN_DING_100)) {
			des.append(" 100封顶");
		}
		if (has_rule(_game_rule_index, GameConstants_HZLZG.RULE_TYPE_QIANG_GANG_HU)) {
			des.append(" 抢杠胡");
		}
		return des.toString();
	}

	public static String get_game_des_zjh_jd(DescParams descParam) {
		int _game_type_index = descParam._game_type_index;
		int _game_rule_index = descParam._game_rule_index;
		int[] rules = descParam.game_rules;
		int _cur_round = descParam._cur_round;
		int _game_round = descParam._game_round;
		String des = "";

		if (descParam.getMap().containsKey(_game_rule_index)) {
			des += " 底分" + descParam.getRuleValue(_game_rule_index);
			;
		}
		if (descParam.getMap().containsKey(GameConstants.GAME_RULE_ZJH_ROUND_10)) {
			des += " 10回合封顶";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_ROUND_30)) {
			des += " 30回合封顶";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_ROUND_40)) {
			des += " 40回合封顶";
		} else {
			des += " 20回合封顶";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_235_BAPZI_YES)) {
			des += " 235可吃豹子";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_235_BAPZI_NO)) {
			des += " 235不可吃豹子";
		} else {
			des += " 235只吃AAA";
		}

		if (descParam.getMap().containsKey(GameConstants.GAME_RULE_ZJH_JETTON_5)) {
			des += " 5注封顶";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_JETTON_20)) {
			des += " 20注封顶";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_JETTON_30)) {
			des += " 30注封顶";
		} else {
			des += " 10注封顶";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_COMPARE_FIRST_LOSE)) {
			des += " 先比先输";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_COMPARE_HUASE)) {
			des += " 按花色比";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_BAOZI_HAVE_MONERY)) {
			des += " 豹子收喜钱";
		}

		return des;
	}

	public static String get_game_des_zjh_hb(DescParams descParam) {
		int _game_type_index = descParam._game_type_index;
		int _game_rule_index = descParam._game_rule_index;
		int[] rules = descParam.game_rules;
		int _cur_round = descParam._cur_round;
		int _game_round = descParam._game_round;
		String des = "";

		if (descParam.getMap().containsKey(_game_rule_index)) {
			des += " 底分" + descParam.getRuleValue(_game_rule_index);
			;
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_ROUND_20)) {
			des += " 5回合封顶";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_ROUND_30)) {
			des += " 10回合封顶";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_ROUND_40)) {
			des += " 15回合封顶";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_JETTON_FOUR)) {
			des += " 20回合封顶";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_235_BAPZI_YES)) {
			des += " 235可吃豹子";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_235_BAPZI_NO)) {
			des += " 235不可吃豹子";
		} else {
			des += " 235只吃AAA";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_JETTON_10)) {
			des += " 30*底注";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_JETTON_20)) {
			des += " 50*底注";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_JETTON_30)) {
			des += " 80*底注";
		} else {
			des += " 100*底注";
		}
		if (has_rule(rules, GameConstants.GAME_RULE_ZJH_PIN_FIVE)) {
			des += " 拼5分";
		} else if (has_rule(rules, GameConstants.GAME_RULE_ZJH_PIN_TEN)) {
			des += " 拼10分";
		} else if (has_rule(rules, GameConstants.GAME_RULE_ZJH_PIN_TWENTY)) {
			des += " 拼20分";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_COMPARE_FIRST_LOSE)) {
			des += " 先比先输";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_COMPARE_HUASE)) {
			des += " 按花色比";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_ZJH_BAOZI_HAVE_MONERY)) {
			des += " 豹子收喜钱";
		}

		return des;
	}

	public static String get_game_des_ssz_xp(int _game_rule_index) {
		String des = "";

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_TWO_PEOPLE)) {
			des += " 两人玩法";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_THREE_PEOPLE)) {
			des += " 三人玩法";
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_FOUR_PEOPLE)) {
			des += " 四人玩法";
		}

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_BANKER_TURN)) {
			des += " 轮流坐庄";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_BANKER_ALLLOST)) {
			des += " 通赔下庄";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_SPECAIL_CARS)) {
			des += " 特殊牌型";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_DI_FEN_ONE)) {
			des += " 底分：1分";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_DI_FEN_TWO)) {
			des += " 底分：2分";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_DI_FEN_THREE)) {
			des += " 底分：3分";
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_XP_SSZ_DI_FEN_FOUR)) {
			des += " 底分：4分";
		}
		return des;
	}

	public static String get_game_des_ah(int _game_rule_index, DescParams descParam) {
		StringBuilder buffer = new StringBuilder();

		buffer.append("15胡息起胡");
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_ONE_XI_ONE_TUN)) {
			buffer.append(" 一息一囤");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_THREE_XI_ONE_TUN)) {
			buffer.append(" 三息一囤");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_ZI_MO_ADD_FAN)) {
			buffer.append(" 自摸翻倍");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_ZI_MO_ADD_TUN)) {
			buffer.append(" 自摸加一囤");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_ZI_MO_NULL)) {
			buffer.append(" 自摸不加息");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_SAN_TI_WU_KAN)) {
			buffer.append(" 三提五坎");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_DI_FEN_1)) {
			buffer.append(" 底分为1");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_DI_FEN_2)) {
			buffer.append(" 底分为2");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_DI_FEN_3)) {
			buffer.append(" 底分为3");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_BANK_LINAG)) {
			buffer.append(" 庄家首摸亮牌");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_PA_PO_1)) {
			buffer.append(" 爬1坡");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_PA_PO_2)) {
			buffer.append(" 爬2坡");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_PA_PO_3)) {
			buffer.append(" 爬3坡");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_PA_PO_4)) {
			buffer.append(" 爬4坡");
		}
		if (has_rule(_game_rule_index, GameConstants_AnHua.GAME_RULE_PA_PO_5)) {
			buffer.append(" 爬5坡");
		}
		if (descParam.getRuleValue(GameConstants_AnHua.GAME_RULE_HU_ADD_1) != 0) {
			buffer.append(" 胡牌加").append(descParam.getRuleValue(GameConstants_AnHua.GAME_RULE_HU_ADD_1)).append("囤");
		}
		return buffer.toString();
	}

	public static String get_game_des_tdz_sx(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, TDZConstants.TDZ_RULE_BASE_50)) {
			sb.append(" 50分");
		}
		if (has_rule(_game_rule_index, TDZConstants.TDZ_RULE_BASE_100)) {
			sb.append(" 100分");
		}
		if (has_rule(_game_rule_index, TDZConstants.TDZ_RULE_ZHUANG_WIN)) {
			sb.append(" 庄家赢");
		}
		if (has_rule(_game_rule_index, TDZConstants.TDZ_RULE_DA_HE)) {
			sb.append(" 打和");
		}
		if (has_rule(_game_rule_index, TDZConstants.TDZ_RULE_QIANG_ZHUANG)) {
			sb.append(" 首局抢庄");
		}
		if (has_rule(_game_rule_index, TDZConstants.TDZ_RULE_FANG_ZHU_ZHUANG)) {
			sb.append(" 房主庄");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_mj_jy(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, Constants_MJ_JiYuan.GAME_RULE_123_CHANG)) {
			sb.append(" 123场");
		}
		if (has_rule(_game_rule_index, Constants_MJ_JiYuan.GAME_RULE_515_CHANG)) {
			sb.append(" 515场");
		}
		if (has_rule(_game_rule_index, Constants_MJ_JiYuan.GAME_RULE_DAI_FENG)) {
			sb.append(" 带风");
		}
		if (has_rule(_game_rule_index, Constants_MJ_JiYuan.GAME_RULE_ZI_MO_HU)) {
			sb.append(" 自摸胡");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_sw(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_PLAYER_4)) {
			sb.append(" 四人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_PLAYER_3)) {
			sb.append(" 三人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_PLAYER_2)) {
			sb.append(" 二人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_PENG_CHI)) {
			sb.append(" 可吃");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_DUO_PAO)) {
			sb.append(" 可一炮多响");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_OLNY_ZI_MO)) {
			sb.append(" 只自摸");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_PAO_HU_JIANG_MA)) {
			sb.append(" 炮胡奖马");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_MA_2)) {
			sb.append(" 2马");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_MA_4)) {
			sb.append(" 4马");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_MA_6)) {
			sb.append(" 6马");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_MA_8)) {
			sb.append(" 8马");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_DIAN_PAO)) {
			sb.append(" 可接炮");
		}

		return sb.toString();
	}

	public static String get_game_des_luhe(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_PLAYER_4)) {
			sb.append(" 四人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_PLAYER_3)) {
			sb.append(" 三人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_PLAYER_2)) {
			sb.append(" 二人玩法");
		}
		if (has_rule(_game_rule_index, GameConstants_SW.GAME_RULE_PENG_CHI)) {
			sb.append(" 可吃");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_DUO_PAO)) {
			sb.append(" 可一炮多响");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_OLNY_ZI_MO)) {
			sb.append(" 鸡胡倍");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_PAO_HU_JIANG_MA)) {
			sb.append(" 炮胡奖马");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_MA_2)) {
			sb.append(" 2马");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_MA_4)) {
			sb.append(" 4马");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_MA_6)) {
			sb.append(" 6马");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_MA_8)) {
			sb.append(" 8马");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_ER_BEI_JIE_PAO)) {
			sb.append(" 二倍起可吃胡");
		}
		if (has_rule(_game_rule_index, GameConstants_LUHE.GAME_RULE_ER_BEI_QI_ZI_MO)) {
			sb.append(" 二倍起只自摸");
		}

		return sb.toString();
	}

	public static String get_game_des_mj_py(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_SANREN)) {
			sb.append(" 三人场");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_SIREN)) {
			sb.append(" 四人场");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_DI_FEN_ONE)) {
			sb.append(" 底分：一分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_DI_FEN_TWO)) {
			sb.append(" 底分：二分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_DI_FEN_THREE)) {
			sb.append(" 底分：五分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_DI_FEN_FOUR)) {
			sb.append(" 底分：十分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_DAIPU)) {
			sb.append(" 带扑");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_HUANGHUNAG)) {
			sb.append(" 晃晃");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_YAOJIUPU)) {
			sb.append(" 幺九扑");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_FENGPU)) {
			sb.append(" 风扑");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_JIANGPU)) {
			sb.append(" 将扑");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_ZIMOHU)) {
			sb.append(" 自摸胡");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_KEPAOHU)) {
			sb.append(" 点炮胡");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_DAIFENG)) {
			sb.append(" 带风");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_BUDAIFENG)) {
			sb.append(" 不带风");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_BAOTING)) {
			sb.append(" 报听");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_BUBAOTING)) {
			sb.append(" 不报听");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_DANDIAOJIAFEN)) {
			sb.append(" 单吊加分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_KAZHANGJIAFEN)) {
			sb.append(" 卡张加分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_QUEMENJIAFEN)) {
			sb.append(" 缺门加分");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_HUANGZHUANGHUANGGANG)) {
			sb.append(" 荒庄荒杠");
		}
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PUYANG_QIDUIDOUBLE)) {
			sb.append(" 七对加倍");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_xy_kl(int game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder();
		boolean hasFirst = false;

		int value = descParam.getRuleValue(GameConstants.GAME_RULE_XYKL_INITIAL);
		int cell = 0;
		int jetton_max = 0;
		if (value == 1) {
			cell = 5;
			jetton_max = 200;
		} else if (value == 2) {
			cell = 10;
			jetton_max = 400;
		} else if (value == 3) {
			cell = 20;
			jetton_max = 800;
		}
		gameDesc.append("底分：" + cell + "分\n" + "封顶:" + jetton_max + "分\n");
		gameDesc.append("人数：" + descParam.getRuleValue(GameConstants.GAME_RULE_XYKL_PLAYER) + "人\n");
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_DICHI_KONG_XIAZHU)) {
			gameDesc.append("每局下注\n");
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_MIN_JETTON)) {
			gameDesc.append("最低下注10分\n");
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_XYKL_CONTORL_START)) {
			gameDesc.append("房主确认开始\n");
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_FORBID_CHOU_PAI_XYKL)) {
			gameDesc.append("禁止搓牌\n");
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_START_FORBID_XYKL)) {
			gameDesc.append("游戏开始后禁止加入\n");
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_ADD_JETTON)) {
			gameDesc.append("每次加注10分\n");
		}
		return gameDesc.toString();
	}

	public static String get_game_des_gy(int game_rule_index) {
		StringBuilder gameDesc = new StringBuilder();
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_PLAYER_4)) {
			gameDesc.append(" 四人场");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_PLAYER_3)) {
			gameDesc.append(" 三人场");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_PLAYER_2)) {
			gameDesc.append(" 二人场");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_PLAYER_3_DING_GUAI)) {
			gameDesc.append(" 三丁拐");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_PLAYER_2_DING_GUAI)) {
			gameDesc.append(" 二丁拐");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_TYPE_SWING_JI)) {
			gameDesc.append("\n 摇摆鸡");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_TYPE_BEN_JI)) {
			gameDesc.append("\n 本鸡");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_WEEK_JI)) {
			gameDesc.append("\n 星期鸡");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_BLOW_JI)) {
			gameDesc.append("\n 吹风鸡");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_MAN_TANG_JI)) {
			gameDesc.append("\n 满堂鸡");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_WU_GU_JI)) {
			gameDesc.append("\n 乌骨鸡");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_CONTINUE_BANKER)) {
			gameDesc.append("\n 连庄");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_1_KOU_2)) {
			gameDesc.append("\n 一扣二");
		}
		if (has_rule(game_rule_index, GameConstants_GY.GAME_RULE_TONG_3)) {
			gameDesc.append("\n 通三");
		}

		return gameDesc.toString();
	}

	public static String get_game_des_yyqf(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_XI_FEN_ADD)) {
			sb.append(" 喜分加法");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_XI_FEN_MULTI)) {
			sb.append(" 喜分乘法");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_BOOM_ALWAYS_GETSCORE)) {
			sb.append(" 7炸以上被盖有喜分");
		} else {
			sb.append(" 7炸以上被盖没喜分");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_RANK_REWARD_100_60_40)) {
			sb.append(" 一名奖励100分 二名扣40分 三名扣60分");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_RANK_REWARD_100_70_30)) {
			sb.append(" 一名奖励100分 二名扣30分 三名扣70分");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_RANK_REWARD_40_0_40)) {
			sb.append(" 一名奖励40分 二名不扣分 三名扣40分");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_RETAIN_SIX_SEVEN)) {
			sb.append(" 保留6和7");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_SHOW_CARD_COUNT)) {
			sb.append(" 显示牌数");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_NOT_SHOW_CARD_COUNT)) {
			sb.append(" 不显示牌数");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_REWARD_100)) {
			sb.append(" 奖分100");
		}
		if (has_rule(_game_rule_index, Constants_YYQF.YYQF_RULE_REWARD_200)) {
			sb.append(" 奖分200");
		}

		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_nan_ning(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();

		sb.append(" 4人场");
		if (has_rule(_game_rule_index, GameConstants_NanNing.GAME_RULE_PLAYER_3)) {
			sb.append(" 3人场");
		}
		if (has_rule(_game_rule_index, GameConstants_NanNing.GAME_RULE_PLAYER_4)) {
			sb.append(" 4人场");
		}
		if (has_rule(_game_rule_index, GameConstants_NanNing.GAME_RULE_MAI_MA_0)) {
			sb.append(" 无码");
		}
		if (has_rule(_game_rule_index, GameConstants_NanNing.GAME_RULE_MAI_MA_2)) {
			sb.append(" 2码");
		}
		if (has_rule(_game_rule_index, GameConstants_NanNing.GAME_RULE_MAI_MA_4)) {
			sb.append(" 4码");
		}
		if (has_rule(_game_rule_index, GameConstants_NanNing.GAME_RULE_MAI_MA_6)) {
			sb.append(" 6码");
		}
		if (has_rule(_game_rule_index, GameConstants_NanNing.GAME_RULE_SI_SHUANG)) {
			sb.append(" 死双");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static int getCsDingNiaoNum(int[] rules) {
		int nNum = GameConstants.ZHANIAO_0;
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO1)) {
			return GameConstants.ZHANIAO_1;
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			return GameConstants.ZHANIAO_2;
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO3)) {
			return GameConstants.ZHANIAO_3;
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			return GameConstants.ZHANIAO_4;
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			return GameConstants.ZHANIAO_6;
		}
		return nNum;
	}

	public static int getCsDingNiaoNum(int _game_rule_index) {
		int nNum = GameConstants.ZHANIAO_0;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO1)) {
			return GameConstants.ZHANIAO_1;
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO2)) {
			return GameConstants.ZHANIAO_2;
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO3)) {
			return GameConstants.ZHANIAO_3;
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO4)) {
			return GameConstants.ZHANIAO_4;
		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_HUNAN_ZHANIAO6)) {
			return GameConstants.ZHANIAO_6;
		}
		return nNum;
	}

	public static int getCsDingNiaoNum_YiYang(int _game_rule_index) {
		int nNum = GameConstants.ZHANIAO_0;
		if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_ZHANIAO1)) {
			return GameConstants.ZHANIAO_1;
		} else if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_ZHANIAO2)) {
			return GameConstants.ZHANIAO_2;
		} else if (has_rule(_game_rule_index, GameConstants_YiYang.GAME_RULE_HUNAN_ZHANIAO3)) {
			return GameConstants.ZHANIAO_3;
		}
		return nNum;
	}

	public static String get_game_des_jx_le_ping(int game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		return gameDesc.toString();
	}

	/**
	 * 邵阳字牌描述
	 * 
	 * @param game_rule_index
	 * @return
	 */
	public static String get_game_des_syzp(int game_rule_index) {
		StringBuilder buffer = new StringBuilder();

		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PALYER_SYZP_THREE)) {
			buffer.append("三人场");
			buffer.append(" 10胡息起胡");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_FOUR)) {
			buffer.append("四人场");
			buffer.append(" 6胡息起胡");
		}

		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_XI1)) {
			buffer.append(" 1息一囤");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_XI3)) {
			buffer.append(" 3息一囤");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_XI5)) {
			buffer.append(" 5息一囤");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_ZIMO_DOUBLE)) {
			buffer.append(" 自摸翻倍");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_ZIMO_JIAYITUN)) {
			buffer.append(" 自摸加一囤");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_DIAN_PAO_BI_HU)) {
			buffer.append(" 点炮必胡");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PLAYER_SYZP_YOU_PAO_BI_HU)) {
			buffer.append(" 强制胡牌");
		}
		if (has_rule(game_rule_index, GameConstants_SYZP.GAME_RULE_PALYER_SYZP_HONHEIDIAN)) {
			buffer.append(" 红黑点");
		}

		return buffer.toString();
	}

	/**
	 * 邵阳字牌描述
	 * 
	 * @param game_rule_index
	 * @return
	 */
	public static String get_game_des_wsk_dmz(int game_rule_index, DescParams descParam) {
		StringBuilder buffer = new StringBuilder();

		if (has_rule(game_rule_index, GameConstants.GAME_RULE_DMZ_ZUODUI)) {
			buffer.append(" 坐对");
		} else {
			buffer.append("摸对");
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_DMZ_YOU_XIQIAN)) {
			buffer.append(" 有喜钱");
		}
		if (has_rule(game_rule_index, GameConstants.GAME_RULE_DMZ_YOU_WUQIAN)) {
			buffer.append(" 没有喜钱");
		}

		return buffer.toString();
	}

	public static String get_game_des_js_yang_zhong(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_PLAYER_THREE)) {
			if (hasFirst) {
				gameDesc.append("\n三人场");
			} else {
				gameDesc.append("三人场");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_PLAYER_FOUR)) {
			if (hasFirst) {
				gameDesc.append("\n四人场");
			} else {
				gameDesc.append("四人场");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_HUN_WU_QING_SHI)) {
			if (hasFirst) {
				gameDesc.append("\n混五清十");
			} else {
				gameDesc.append("混五清十");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_HUN_SHI_QING_ER_SHI)) {
			if (hasFirst) {
				gameDesc.append("\n混十清二十");
			} else {
				gameDesc.append("混十清二十");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_YI_MO_ER_CHONG)) {
			if (hasFirst) {
				gameDesc.append("\n一摸二冲");
			} else {
				gameDesc.append("一摸二冲");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_YING_ER_HUA)) {
			if (hasFirst) {
				gameDesc.append("\n硬二花");
			} else {
				gameDesc.append("硬二花");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_YING_SAN_HUA)) {
			if (hasFirst) {
				gameDesc.append("\n硬三花");
			} else {
				gameDesc.append("硬三花");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_YangZhong.GAME_RULE_YING_WU_HUA)) {
			if (hasFirst) {
				gameDesc.append("\n硬五花");
			} else {
				gameDesc.append("硬五花");
				hasFirst = true;
			}
		}
		return gameDesc.toString();
	}

	public static String get_game_des_hu_bei_huang_zhou(int _game_rule_index) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;
		if (has_rule(_game_rule_index, Constants_HuangZhou.GAME_RULE_DI_FEN_1)) {
			if (hasFirst) {
				gameDesc.append("\n封顶10");
			} else {
				gameDesc.append("封顶10");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_HuangZhou.GAME_RULE_DI_FEN_2)) {
			if (hasFirst) {
				gameDesc.append("\n封顶20");
			} else {
				gameDesc.append("封顶20");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_HuangZhou.GAME_RULE_DI_FEN_5)) {
			if (hasFirst) {
				gameDesc.append("\n封顶50");
			} else {
				gameDesc.append("封顶50");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_HuangZhou.GAME_RULE_DI_FEN_10)) {
			if (hasFirst) {
				gameDesc.append("\n封顶100");
			} else {
				gameDesc.append("封顶100");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_HuangZhou.GAME_RULE_QIANG_GANG_HU)) {
			if (hasFirst) {
				gameDesc.append("\n可抢杠胡");
			} else {
				gameDesc.append("可抢杠胡");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n不可抢杠胡");
			} else {
				gameDesc.append("不可抢杠胡");
				hasFirst = true;
			}
		}
		return gameDesc.toString();
	}

	public static String get_game_des_henan_hua_xian(int _game_rule_index, DescParams desParam) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;
		if (desParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_THREE_PLAYER) != 0) {
			if (hasFirst) {
				gameDesc.append("\n3人");
			} else {
				gameDesc.append("3人");
				hasFirst = true;
			}
		} else if (desParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_FOUR_PLAYER) != 0) {
			if (hasFirst) {
				gameDesc.append("\n4人");
			} else {
				gameDesc.append("4人");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n4人");
			} else {
				gameDesc.append("4人");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_HuaXian.GAME_RULE_DONG_FENG_LING)) {
			if (hasFirst) {
				gameDesc.append("\n东风令");
			} else {
				gameDesc.append("东风令");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_HuaXian.GAME_RULE_XIA_PAO)) {
			if (hasFirst) {
				gameDesc.append("\n下跑");
			} else {
				gameDesc.append("下跑");
				hasFirst = true;
			}
		}
		return gameDesc.toString();
	}

	public static String get_game_des_tcdg(int _game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");

		gameDesc.append("癞子单出当3");

		int lai_zi_count = 0;
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_ZERO_MAGIC))
			lai_zi_count = 0;
		else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_ONE_MAGIC))
			lai_zi_count = 1;
		else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_TWO_MAGIC))
			lai_zi_count = 2;
		gameDesc.append(" " + lai_zi_count + "张花牌");

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_SIX_BOOM_REWARD))
			gameDesc.append(" 6炸奖1分");
		else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_SEVEN_BOOM_REWARD))
			gameDesc.append(" 7炸奖1分");
		else
			gameDesc.append(" 7炸奖1分");

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_PIAO))
			gameDesc.append(" 可飘分");
		else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_NO_PIAO))
			gameDesc.append(" 无飘分");
		else
			gameDesc.append(" 无飘分");

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_BOOM_MUST_OUT))
			gameDesc.append(" 炸弹打出才算奖");

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_DISPLAY_COUNT))
			gameDesc.append(" 显示牌数");
		else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_DONT_DISPLAY_COUNT))
			gameDesc.append(" 不显示牌数");
		else
			gameDesc.append(" 不显示牌数");

		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_PK_TC_ONE_CARD_WARNING))
			gameDesc.append(" 剩1张牌需报警");

		if (descParam.getRuleValue(GameConstants.GAME_RULE_VOICE_ROOM) == 1)
			gameDesc.append(" 语音房");

		return gameDesc.toString();
	}

	public static String get_game_des_er_zhou(int _game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");

		boolean hasFirst = false;

		int di_fen = descParam.getRuleValue(Constants_EZ.GAME_RULE_DI_FEN);
		int feng_ding = descParam.getRuleValue(Constants_EZ.GAME_RULE_FENG_DING);
		int qi_hu = descParam.getRuleValue(Constants_EZ.GAME_RULE_QI_HU_FEN);
		if (di_fen != -1) {
			if (hasFirst) {
				gameDesc.append("\n底分" + di_fen);
			} else {
				gameDesc.append("底分" + di_fen);
				hasFirst = true;
			}
		}

		if (feng_ding != -1) {
			if (hasFirst) {
				gameDesc.append("\n封顶" + feng_ding);
			} else {
				gameDesc.append("封顶" + feng_ding);
				hasFirst = true;
			}
		}

		if (qi_hu != -1) {
			if (hasFirst) {
				gameDesc.append("\n起胡" + qi_hu);
			} else {
				gameDesc.append("起胡" + qi_hu);
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_PLAYER_TWO)) {
			if (hasFirst) {
				gameDesc.append("\n二人场");
			} else {
				gameDesc.append("二人场");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_PLAYER_THREE)) {
			if (hasFirst) {
				gameDesc.append("\n三人场");
			} else {
				gameDesc.append("三人场");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_PLAYER_FOUR)) {
			if (hasFirst) {
				gameDesc.append("\n四人场");
			} else {
				gameDesc.append("四人场");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n四人场");
			} else {
				gameDesc.append("四人场");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_QI_DUI)) {
			if (hasFirst) {
				gameDesc.append("\n七对");
			} else {
				gameDesc.append("七对");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_PENG_PENG_HU)) {
			if (hasFirst) {
				gameDesc.append("\n碰碰胡");
			} else {
				gameDesc.append("碰碰胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_QING_YI_SE)) {
			if (hasFirst) {
				gameDesc.append("\n清一色");
			} else {
				gameDesc.append("清一色");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_JIANG_YI_SE)) {
			if (hasFirst) {
				gameDesc.append("\n将一色");
			} else {
				gameDesc.append("将一色");
				hasFirst = true;
			}
		}

		if (has_rule(_game_rule_index, Constants_EZ.GAME_RULE_KAO_ZHANG_KOU_FEN)) {
			if (hasFirst) {
				gameDesc.append("\n包赔");
			} else {
				gameDesc.append("包赔");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_couyise(int _game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");

		boolean hasFirst = false;

		int di_fen = descParam.getRuleValue(Constants_CouYiSe.GAME_RULE_DI_FEN);
		int feng_ding = descParam.getRuleValue(Constants_CouYiSe.GAME_RULE_FENG_DING);
		int qi_hu = descParam.getRuleValue(Constants_CouYiSe.GAME_RULE_QI_HU_FEN);
		if (di_fen != 0) {
			if (hasFirst) {
				gameDesc.append("\n底分" + di_fen);
			} else {
				gameDesc.append("底分" + di_fen);
				hasFirst = true;
			}
		}

		if (feng_ding != 0) {
			if (hasFirst) {
				gameDesc.append("\n封顶" + feng_ding);
			} else {
				gameDesc.append("封顶" + feng_ding);
				hasFirst = true;
			}
		}

		if (qi_hu != 0) {
			if (hasFirst) {
				gameDesc.append("\n起胡" + qi_hu);
			} else {
				gameDesc.append("起胡" + qi_hu);
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_hu_bei_huang_shi(int _game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");

		if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TWO_PLAYER) != 0) {
			gameDesc.append("二人场");
		} else if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_THREE_PLAYER) != 0) {
			gameDesc.append("三人场");
		} else if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_FOUR_PLAYER) != 0) {
			gameDesc.append("四人场");
		} else {
			gameDesc.append("四人场");
		}

		if (has_rule(_game_rule_index, Constants_HuangShi.GAME_RULE_DI_FEN_1))
			gameDesc.append("\n底分1分");
		else if (has_rule(_game_rule_index, Constants_HuangShi.GAME_RULE_DI_FEN_2))
			gameDesc.append("\n底分2分");
		else if (has_rule(_game_rule_index, Constants_HuangShi.GAME_RULE_DI_FEN_5))
			gameDesc.append("\n底分0.5分");

		if (has_rule(_game_rule_index, Constants_HuangShi.GAME_RULE_HONG_ZHONG_FA_CAI_GANG)) {
			gameDesc.append("\n红中发财杠");
			gameDesc.append("\n" + descParam.getRuleValue(Constants_HuangShi.GAME_RULE_QI_HU_XUAN_ZE_2) + "分起胡");
		} else if (has_rule(_game_rule_index, Constants_HuangShi.GAME_RULE_HONG_ZHONG_LAI_ZI_GANG)) {
			gameDesc.append("\n红中癞子杠");
			gameDesc.append("\n" + descParam.getRuleValue(Constants_HuangShi.GAME_RULE_QI_HU_XUAN_ZE_1) + "分起胡");
		}

		return gameDesc.toString();
	}

	public static String get_game_des_tcgzp(int game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");

		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_ONE_FEN) == 1) {
			gameDesc.append("1分 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_TWO_FEN) == 1) {
			gameDesc.append("2分 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_THREE_FEN) == 1) {
			gameDesc.append("3分 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_FOUR_FEN) == 1) {
			gameDesc.append("4分 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_FIVE_FEN) == 1) {
			gameDesc.append("5分 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_THREE_PEOPLE) == 1) {
			gameDesc.append("3人 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_FOUR_PEOPLE) == 1) {
			gameDesc.append("4人 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_TEN_HUA) == 1) {
			gameDesc.append("十个花 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_LIU_HUA) == 1) {
			gameDesc.append("溜花 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_ONE_PAO_DUO_HU) == 1) {
			gameDesc.append("一炮多响 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_DIA_PAO) == 1) {
			gameDesc.append("飘分");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_SHI_DUI) == 1) {
			gameDesc.append("十对 ");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_TC_HAI_DI_ADD_DI) == 1) {
			gameDesc.append("海底捞加底分 ");
		}
		return gameDesc.toString();
	}

	// public static String get_game_des_czwxox(int game_rule_index, DescParams
	// descParam) {
	// StringBuilder gameDesc = new StringBuilder("");
	//
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_SIX_PLAYER) == 1) {
	// gameDesc.append("6人 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_EIGHT_PLAYER) == 1)
	// {
	// gameDesc.append("8人 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_TEN_PLAYER) == 1) {
	// gameDesc.append("10人 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_MPQZ) == 1) {
	// gameDesc.append("明牌抢庄 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_NNSZ) == 1) {
	// gameDesc.append("牛牛上庄 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_ZYQZ) == 1) {
	// gameDesc.append("自由抢庄 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_GDZJ) == 1) {
	// gameDesc.append("固定庄家 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_HUA_PAI) == 1) {
	// gameDesc.append("有花牌 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_NO_HUA_PAI) == 1) {
	// gameDesc.append("没有花牌 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_JETTON_ONE) == 1) {
	// gameDesc.append("1 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_JETTON_TWO) == 1) {
	// gameDesc.append("2 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_JETTON_THREE) == 1)
	// {
	// gameDesc.append("3 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_JETTON_FOUR) == 1)
	// {
	// gameDesc.append("4 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_TUI_ZHU_FIVE) == 1)
	// {
	// gameDesc.append("推注2倍 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_TUI_ZHU_TEN) == 1)
	// {
	// gameDesc.append("推注3倍 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_TUI_ZHU_FIF) == 1)
	// {
	// gameDesc.append("推注5倍 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_TUI_ZHU_NO) == 1) {
	// gameDesc.append("推注无 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_ROB_ONE) == 1) {
	// gameDesc.append("抢庄1 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_ROB_TWO) == 1) {
	// gameDesc.append("抢庄2 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_ROB_THREE) == 1) {
	// gameDesc.append("抢庄3 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_ROB_FOUR) == 1) {
	// gameDesc.append("抢庄4 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_TIMES_ONE) == 1) {
	// gameDesc.append("牛牛4倍 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_TIMES_TWO) == 1) {
	// gameDesc.append("牛牛3倍 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_STYC) == 1) {
	// gameDesc.append("三条有凑 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_THSH) == 1) {
	// gameDesc.append("同花顺 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_WDL) == 1) {
	// gameDesc.append("五大牛 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_WXL) == 1) {
	// gameDesc.append("五小牛");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_BOOM) == 1) {
	// gameDesc.append("炸弹牛 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_HULU) == 1) {
	// gameDesc.append("葫芦牛");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_THOX) == 1) {
	// gameDesc.append("同花牛 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_WHOX) == 1) {
	// gameDesc.append("五花牛 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_SHZI) == 1) {
	// gameDesc.append("顺子牛 ");
	// }
	// if (descParam.getRuleValue(GameConstants.GAME_RULE_WX_CH_PAI) == 1) {
	// gameDesc.append("禁止搓牌 ");
	// }
	//
	// return gameDesc.toString();
	// }

	public static String get_game_des_jdb(int game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");
		if (descParam.getRuleValue(GameConstants.GAME_RULE_JDB_GRADE_ONE) == 1) {
			gameDesc.append("携带量600-4000 初始分200");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_JDB_GRADE_TWO) == 1) {
			gameDesc.append("携带量1200-8000 初始分400");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_JDB_GRADE_THREE) == 1) {
			gameDesc.append("携带量3000-20000初始分8000");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_JDB_GRADE_FOUR) == 1) {
			gameDesc.append("携带量6000-40000 初始分20000");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_JDB_GRADE_FIVE) == 1) {
			gameDesc.append("携带量12000-80000 初始分40000");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_DZH) == 1) {
			gameDesc.append("携带量200-1000000 初始分8000");
		}
		gameDesc.append("\n" + descParam.getRuleValue(GameConstants.GAME_RULE_JDB_PEOPEL) + "人");
		gameDesc.append(" " + descParam.getRuleValue(GameConstants.GAME_RULE_JDB_MIN) + "分钟");
		return gameDesc.toString();
	}

	public static String get_game_des_jd_chang_sha(int _game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) > 0) {
			if (hasFirst) {
				gameDesc.append("\n允许少人模式");
			} else {
				gameDesc.append("允许少人模式");
				hasFirst = true;
			}
		} else {
			if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_PLAYER_4)) {
				if (hasFirst) {
					gameDesc.append("\n四人场");
				} else {
					gameDesc.append("四人场");
					hasFirst = true;
				}
			} else if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_PLAYER_3)) {
				if (hasFirst) {
					gameDesc.append("\n三人场");
				} else {
					gameDesc.append("三人场");
					hasFirst = true;
				}
			} else if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TWO_PLAYER) != 0) {
				if (hasFirst) {
					gameDesc.append("\n二人场");
				} else {
					gameDesc.append("二人场");
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					gameDesc.append("\n四人场");
				} else {
					gameDesc.append("四人场");
					hasFirst = true;
				}
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_QUE_WAN_ZI) != 0) {
			if (hasFirst) {
				gameDesc.append("\n缺万子");
			} else {
				gameDesc.append("缺万子");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZUO_PIAO_1)) {
			if (hasFirst) {
				gameDesc.append("\n坐飘1分");
			} else {
				gameDesc.append("坐飘1分");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZUO_PIAO_2)) {
			if (hasFirst) {
				gameDesc.append("\n坐飘2分");
			} else {
				gameDesc.append("坐飘2分");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZUO_PIAO_3)) {
			if (hasFirst) {
				gameDesc.append("\n坐飘3分");
			} else {
				gameDesc.append("坐飘3分");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZUO_PIAO_4)) {
			if (hasFirst) {
				gameDesc.append("\n坐飘4分");
			} else {
				gameDesc.append("坐飘4分");
				hasFirst = true;
			}
		} else if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZUO_PIAO_5)) {
			if (hasFirst) {
				gameDesc.append("\n坐飘5分");
			} else {
				gameDesc.append("坐飘5分");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHUANG_XIAN)) {
			if (hasFirst) {
				gameDesc.append("\n庄闲(算分)");
			} else {
				gameDesc.append("庄闲(算分)");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_PIAO_FEN)) {
			if (hasFirst) {
				gameDesc.append("\n飘分");
			} else {
				gameDesc.append("飘分");
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_CS_BU_PIAO) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_1) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_2) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_3) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_4) != 0
				|| descParam.getRuleValue(GameConstants.GAME_RULE_CS_PIAO_5) != 0) {
			if (hasFirst) {
				gameDesc.append("\n自由选飘");
			} else {
				gameDesc.append("自由选飘");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_MEN_QING_ZI_MO)) {
			if (hasFirst) {
				gameDesc.append("\n门清自摸");
			} else {
				gameDesc.append("门清自摸");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_MEN_QING_JIE_PAO)) {
			if (hasFirst) {
				gameDesc.append("\n门清可接炮");
			} else {
				gameDesc.append("门清可接炮");
				hasFirst = true;
			}
		}
		if (descParam.getRuleValue(Constants_JingDian_CS.GAME_RULE_JIA_JIANG_HU) != 0) {
			if (hasFirst) {
				gameDesc.append("\n假将胡");
			} else {
				gameDesc.append("假将胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_LIU_LIU_SHUN)) {
			if (hasFirst) {
				gameDesc.append("\n六六顺");
			} else {
				gameDesc.append("六六顺");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_QUE_YI_SE)) {
			if (hasFirst) {
				gameDesc.append("\n缺一色");
			} else {
				gameDesc.append("缺一色");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_BAN_BAN_HU)) {
			if (hasFirst) {
				gameDesc.append("\n板板胡");
			} else {
				gameDesc.append("板板胡");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_DA_SI_XI)) {
			if (hasFirst) {
				gameDesc.append("\n大四喜");
			} else {
				gameDesc.append("大四喜");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_JIE_JIE_GAO)) {
			if (hasFirst) {
				gameDesc.append("\n节节高");
			} else {
				gameDesc.append("节节高");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_SAN_TONG)) {
			if (hasFirst) {
				gameDesc.append("\n三同");
			} else {
				gameDesc.append("三同");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_YI_ZHI_HUA)) {
			if (hasFirst) {
				gameDesc.append("\n一枝花");
			} else {
				gameDesc.append("一枝花");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHONG_TU_SI_XI)) {
			if (hasFirst) {
				gameDesc.append("\n中途四喜");
			} else {
				gameDesc.append("中途四喜");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHONG_TU_LLS)) {
			if (hasFirst) {
				gameDesc.append("\n中途六六顺");
			} else {
				gameDesc.append("中途六六顺");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_JIN_TONG_YU_NV)) {
			if (hasFirst) {
				gameDesc.append("\n金童玉女");
			} else {
				gameDesc.append("金童玉女");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_HOU_BA_LUN)) {
			if (hasFirst) {
				gameDesc.append("\n后八轮");
			} else {
				gameDesc.append("后八轮");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_MEI_HUA_SAN_NONG)) {
			if (hasFirst) {
				gameDesc.append("\n梅花三弄");
			} else {
				gameDesc.append("梅花三弄");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_YI_DIAN_HONG)) {
			if (hasFirst) {
				gameDesc.append("\n一点红");
			} else {
				gameDesc.append("一点红");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHONG_NIAO_JIA_FEN)) {
			if (hasFirst) {
				gameDesc.append("\n中鸟加分");
			} else {
				gameDesc.append("中鸟加分");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHONG_NIAO_FAN_BEI)) {
			if (hasFirst) {
				gameDesc.append("\n中鸟翻倍");
			} else {
				gameDesc.append("中鸟翻倍");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHUA_1_NIAO)) {
			if (hasFirst) {
				gameDesc.append("\n抓1鸟");
			} else {
				gameDesc.append("抓1鸟");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHUA_2_NIAO)) {
			if (hasFirst) {
				gameDesc.append("\n抓2鸟");
			} else {
				gameDesc.append("抓2鸟");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHUA_4_NIAO)) {
			if (hasFirst) {
				gameDesc.append("\n抓4鸟");
			} else {
				gameDesc.append("抓4鸟");
				hasFirst = true;
			}
		}
		if (has_rule(_game_rule_index, Constants_JingDian_CS.GAME_RULE_ZHUA_6_NIAO)) {
			if (hasFirst) {
				gameDesc.append("\n抓6鸟");
			} else {
				gameDesc.append("抓6鸟");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_tao_jiang(int game_rule_index, DescParams descParam) {
		StringBuilder gameDesc = new StringBuilder("");
		boolean hasFirst = false;

		if (descParam.getRuleValue(GameConstants.GAME_RULE_CAN_LESS) > 0) {
			if (hasFirst) {
				gameDesc.append("\n允许少人模式");
			} else {
				gameDesc.append("允许少人模式");
				hasFirst = true;
			}
		} else {
			if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PLAYER_FOUR)) {
				if (hasFirst) {
					gameDesc.append("\n四人场");
				} else {
					gameDesc.append("四人场");
					hasFirst = true;
				}
			} else if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PLAYER_THREE)) {
				if (hasFirst) {
					gameDesc.append("\n三人场");
				} else {
					gameDesc.append("三人场");
					hasFirst = true;
				}
			} else if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PLAYER_TWO)) {
				if (hasFirst) {
					gameDesc.append("\n二人场");
				} else {
					gameDesc.append("二人场");
					hasFirst = true;
				}
			} else {
				if (hasFirst) {
					gameDesc.append("\n四人场");
				} else {
					gameDesc.append("四人场");
					hasFirst = true;
				}
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PH_2_ZM_2)) {
			if (hasFirst) {
				gameDesc.append("\n炮胡2自摸2");
			} else {
				gameDesc.append("炮胡2自摸2");
				hasFirst = true;
			}
		}
		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PH_2_ZM_3)) {
			if (hasFirst) {
				gameDesc.append("\n炮胡2自摸3");
			} else {
				gameDesc.append("炮胡2自摸3");
				hasFirst = true;
			}
		}
		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PH_2_ZM_4)) {
			if (hasFirst) {
				gameDesc.append("\n炮胡2自摸4");
			} else {
				gameDesc.append("炮胡2自摸4");
				hasFirst = true;
			}
		}
		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PH_3_ZM_2)) {
			if (hasFirst) {
				gameDesc.append("\n炮胡3自摸2");
			} else {
				gameDesc.append("炮胡3自摸2");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_GANG_CARD_TWO)) {
			if (hasFirst) {
				gameDesc.append("\n杠牌2张");
			} else {
				gameDesc.append("杠牌2张");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n杠牌3张");
			} else {
				gameDesc.append("杠牌3张");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_HAO_HUA_QI_DUI)) {
			if (hasFirst) {
				gameDesc.append("\n豪华七对");
			} else {
				gameDesc.append("豪华七对");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_EIGHT_JOKER)) {
			if (hasFirst) {
				gameDesc.append("\n八个王");
			} else {
				gameDesc.append("八个王");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_AN_GANG_KE_QIANG)) {
			if (hasFirst) {
				gameDesc.append("\n暗杠可抢");
			} else {
				gameDesc.append("暗杠可抢");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n暗杠不可抢");
			} else {
				gameDesc.append("暗杠不可抢");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_SHOW_DI_PAI)) {
			if (hasFirst) {
				gameDesc.append("\n地牌显示");
			} else {
				gameDesc.append("地牌显示");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_159_ZHONG_NIAO)) {
			if (hasFirst) {
				gameDesc.append("\n159中鸟");
			} else {
				gameDesc.append("159中鸟");
				hasFirst = true;
			}
		} else if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_DAN_ZHONG_NIAO)) {
			if (hasFirst) {
				gameDesc.append("\n单数中鸟");
			} else {
				gameDesc.append("单数中鸟");
				hasFirst = true;
			}
		} else if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_ALL_ZHONG_NIAO)) {
			if (hasFirst) {
				gameDesc.append("\n鸟必中");
			} else {
				gameDesc.append("鸟必中");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_ONE_BIRD)) {
			if (hasFirst) {
				gameDesc.append("\n抓1鸟");
			} else {
				gameDesc.append("抓1鸟");
				hasFirst = true;
			}
		} else if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_TWO_BIRD)) {
			if (hasFirst) {
				gameDesc.append("\n抓2鸟");
			} else {
				gameDesc.append("抓2鸟");
				hasFirst = true;
			}
		} else if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_THREE_BIRD)) {
			if (hasFirst) {
				gameDesc.append("\n抓3鸟");
			} else {
				gameDesc.append("抓3鸟");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n不抓鸟");
			} else {
				gameDesc.append("不抓鸟");
				hasFirst = true;
			}
		}

		int beiLv = descParam.getRuleValue(Constants_TaoJiang.GAME_RULE_BEI_LV);
		if (beiLv > 0) {
			if (hasFirst) {
				gameDesc.append("\n" + beiLv + "倍率");
			} else {
				gameDesc.append(beiLv + "倍率");
				hasFirst = true;
			}
		} else {
			if (hasFirst) {
				gameDesc.append("\n1倍率");
			} else {
				gameDesc.append("1倍率");
				hasFirst = true;
			}
		}

		if (has_rule(game_rule_index, Constants_TaoJiang.GAME_RULE_PIAO)) {
			if (hasFirst) {
				gameDesc.append("\n飘分");
			} else {
				gameDesc.append("飘分");
				hasFirst = true;
			}
		}

		return gameDesc.toString();
	}

	public static String get_game_des_hsw(int _game_rule_index, DescParams descParam) {
		StringBuilder des = new StringBuilder();
		if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_TWO_PLAYER) == 1) {
			des.append(" 2人场");
		}
		if (descParam.getRuleValue(GameConstants.GAME_RULE_ALL_GAME_THREE_PLAYER) == 1) {
			des.append(" 3人场");
		}
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_ZI_MO_HU))
			des.append(" 自摸胡");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_DIAN_PAO_HU))
			des.append(" 点炮胡");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_ZHUA_NIAO_2))
			des.append(" 抓2鸟");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_ZHUA_NIAO_4))
			des.append(" 抓4鸟");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_ZHUA_NIAO_6))
			des.append(" 抓6鸟");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_NOT_ZHUA_NIAO))
			des.append(" 不抓鸟");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_HU_JI_JIANG_JI))
			des.append(" 胡几奖几");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_HUAN_ZHUAN_NOT_HUAN_GANG))
			des.append(" 荒庄不荒杠");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_WANG_NOT_QIANG_GANG_HU))
			des.append(" 可抢杠胡");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_HZ_NUMBER_8))
			des.append(" 8红中");
		if (has_rule(_game_rule_index, GameConstants_HanShouWang.GAME_RULE_WU_WANG_JIA_NIAO))
			des.append(" 无王加鸟");
		des.append(" ").append(descParam.getRuleValue(GameConstants_HanShouWang.GAME_RULE_BEI_LV)).append("积分倍率");

		return des.toString();
	}

	public static String get_game_des_dzd(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, DZDConstants.DZD_RULE_SHOW_CARD_COUNT)) {
			sb.append(" 显示牌数");
		}
		if (has_rule(_game_rule_index, DZDConstants.DZD_RULE_NOT_SHOW_CARD_COUNT)) {
			sb.append(" 不显示牌数");
		}
		if (has_rule(_game_rule_index, DZDConstants.DZD_RULE_ALL_CLOSE)) {
			sb.append(" 全关");
		}
		if (has_rule(_game_rule_index, DZDConstants.DZD_RULE_CAN_REMOVE_BOOM)) {
			sb.append(" 炸弹可拆");
		} else {
			sb.append(" 炸弹不可拆");
		}
		return Strings.isNullOrEmpty(sb.toString()) ? "" : sb.substring(1, sb.length());
	}

	public static String get_game_des_dbd(int _game_rule_index) {
		StringBuilder sb = new StringBuilder();
		if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DBD_DIFEN_FIVE)) {
			sb.append(" 堂子20分");
			sb.append(" 底分5分");

		} else if (has_rule(_game_rule_index, GameConstants.GAME_RULE_DBD_DIFEN_THREE)) {
			sb.append(" 堂子10分");
			sb.append(" 底分3分");
		} else {
			sb.append(" 堂子10分");
			sb.append(" 底分2分");
		}
		return sb.toString();
	}

	public static int getFeiNiaoNum(int[] rules) {
		int num = 0;
		if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO1)) {
			return GameConstants.FEINIAO_1;
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO2)) {
			return GameConstants.FEINIAO_2;
		} else if (has_rule(rules, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO3)) {
			return GameConstants.FEINIAO_3;
		}
		return num;
	}

	public static int getFeiNiaoNum(int game_rules_index) {
		int num = 0;
		if (has_rule(game_rules_index, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO1)) {
			return GameConstants.FEINIAO_1;
		} else if (has_rule(game_rules_index, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO2)) {
			return GameConstants.FEINIAO_2;
		} else if (has_rule(game_rules_index, GameConstants.GAME_RULE_HUNAN_CS_FEI_NIAO3)) {
			return GameConstants.FEINIAO_3;
		}
		return num;
	}

	public static int getFeiNiaoNum_YiYang(int game_rules_index) {
		int num = 0;
		if (has_rule(game_rules_index, GameConstants_YiYang.GAME_RULE_HUNAN_CS_FEI_NIAO1)) {
			return GameConstants.FEINIAO_1;
		} else if (has_rule(game_rules_index, GameConstants_YiYang.GAME_RULE_HUNAN_CS_FEI_NIAO2)) {
			return GameConstants.FEINIAO_2;
		} else if (has_rule(game_rules_index, GameConstants_YiYang.GAME_RULE_HUNAN_CS_FEI_NIAO3)) {
			return GameConstants.FEINIAO_3;
		}
		return num;
	}

	public static boolean is_mj_type(int _game_type_index, int type) {
		return _game_type_index == type;
	}

	public static String getGameDesc(ClubRuleModel rules, GameGroups groups) {
		DescParams params = GameDescUtil.params.get();
		params._game_type_index = rules.getGame_type_index();
		params._game_rule_index = rules.getRuleParams()._game_rule_index;
		params.game_rules = rules.getRuleParams().game_rules;
		params.setRuleMap(rules.getRuleParams().getMap());
		params._cur_round = rules.getGame_round();
		params.groupConfig = groups;
		if (GameConstants.SYS_GAME_TYPE_DBN == rules.getGame_type_index()
				|| GameConstants.GAME_TYPE_TDZ_SHAN_XI == rules.getGame_type_index()) {
			return GameDescUtil.getGameDesc(params);
		}

		if (rules.getGame_round() <= 0) {
			return GameDescUtil.getGameDesc(params);
		}
		return ("局数：" + rules.getGame_round() + " ") + GameDescUtil.getGameDesc(params);
	}

	// 支持 0~31
	public static boolean has_rule(int _game_rule_index, int cbRule) {
		assert (cbRule < 32);
		return FvMask.has_any(_game_rule_index, FvMask.mask(cbRule));
	}

	// 支持32位之后的
	public static boolean has_rule(int[] rules, int cbRule) {
		if (rules == null)// error
			return false;

		if (cbRule < 32) {
			return has_rule(rules[0], cbRule);
		}

		int mod = cbRule % 32;
		int index = (cbRule - mod) / 32;
		if (index >= rules.length)// error
			return false;
		return has_rule(rules[index], mod);
	}

	public static String getCommonDesc(Map<Integer, Integer> ruleMaps, GameGroups ruleConfig) {
		StringBuilder b = new StringBuilder();
		buildRule(ruleMaps, ruleConfig.getGroupModels(), b);
		// buildRule(ruleMaps, ruleConfig.getCommonGroups(), b);
		return b.toString();
	}

	private static void buildRule(Map<Integer, Integer> ruleMaps, List<GameGroupModel> groups, StringBuilder b) {
		groups.forEach((group) -> {
			group.getRuleModels().forEach((rule) -> {
				Integer value = ruleMaps.get(rule.getGame_rule());
				if (value == null) {
					return;
				}
				if (rule.getIsClubRuleHide() == 1) {
					return;
				}

				b.append(" ");
				if (group.getType() == 0) {
					b.append(group.getDescription()).append(":");
				}
				b.append(rule.getDescription());
				if (value.intValue() != 1) {
					b.append(":").append(value);
				}
			});

		});
	}

	public static String getCommonDescEx(Map<Integer, Integer> ruleMaps, GameGroups ruleConfig) {
		StringBuilder b = new StringBuilder();
		buildRuleEx(ruleMaps, ruleConfig.getGroupModels(), b);
		// buildRule(ruleMaps, ruleConfig.getCommonGroups(), b);
		return b.toString();
	}

	private static void buildRuleEx(Map<Integer, Integer> ruleMaps, List<GameGroupModel> groups, StringBuilder b) {
		groups.forEach((group) -> {
			group.getRuleModels().forEach((rule) -> {
				Integer value = ruleMaps.get(rule.getGame_rule());
				if (value == null) {
					return;
				}
				if (rule.getIsClubRuleHide() == 1) {
					return;
				}
				b.append(rule.getDescription());
				// 通用倍率不显示1的
				if (rule.getGame_rule() == GameConstants.GAME_RULE_ALL_BEI_LV) {
					b.append(value);
				} else {
					if (value.intValue() != 1) {
						b.append(value);
					}
				}
				b.append(" ");
			});

		});
	}

}
