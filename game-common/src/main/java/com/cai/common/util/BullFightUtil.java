package com.cai.common.util;

import com.cai.common.constant.GameConstants;

public final class BullFightUtil {

    public static boolean isTypeFangZhu(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_FANG_ZHU
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_FANG_ZHU) {
            return true;
        }

        return false;
    }

    public static boolean isTypeNiuNiu(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_NIU_NIU
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_NIU_NIU) {
            return true;
        }

        return false;
    }

    public static boolean isTypeLunLiu(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_LUN_LIU
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_LUN_LIU) {
            return true;
        }

        return false;
    }

    public static boolean isTypeZiYou(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_ZI_YOU
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_ZI_YOU) {
            return true;
        }

        return false;
    }

    public static boolean isTypeMingSanZhang(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_MING_SAN
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_MING_SAN) {
            return true;
        }

        return false;
    }

    public static boolean isTypeKanSiZhang(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_KAN_SI
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_KAN_SI) {
            return true;
        }

        return false;
    }

    public static boolean isTypeTongBi(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_TONG_BI
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_TONG_BI) {
            return true;
        }

        return false;
    }

    public static boolean isTypeDouBan(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_DOU_BAN
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_DOU_BAN) {
            return true;
        }

        return false;
    }

    public static boolean isTypeFengKuang(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_FENG_KUANG
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_FENG_KUANG) {
            return true;
        }

        return false;
    }

    public static boolean isTypeAnSanZhang(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_AN_SAN
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_AN_SAN) {
            return true;
        }

        return false;
    }
    
    
    /**
     *八人牛牛玩法
     * @param gameTypeIndex
     * @return
     */
    public static boolean isEightOX(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_BA_REN
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_BA_REN) {
            return true;
        }

        return false;
    }


    /**
     * 除了斗板牛和疯狂牛牛之外的通用斗牛
     * 
     * @param gameTypeIndex
     * @return
     */
    public static boolean isUniversalBullFight(int gameTypeIndex) {
        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_FANG_ZHU
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_TONG_BI) {
            return true;
        }

        if (gameTypeIndex >= GameConstants.GAME_TYPE_U_BULL_BEGIN_AN_SAN
                && gameTypeIndex <= GameConstants.GAME_TYPE_U_BULL_END_AN_SAN) {
            return true;
        }

        return false;
    }
}
