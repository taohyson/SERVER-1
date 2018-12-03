package com.cai.common.constant.game.phz;

public class Constants_LouDiFangPaoFa {

	public static final int GAME_RULE_SEAL_TOP_200 = 1; // 200息封顶
	public static final int GAME_RULE_SEAL_TOP_400 = 2; //400息封顶
	public static final int GAME_REN_SHU_2 = 4; // 二人
	
	public static final int GAME_QI_HU_XI = 15; // 最低胡息
	public static final int GAME_END_HU_XI = 100; // 满100胡则结算

	public enum ChrType {

		CHR_ZI_MO(0x00000001, "自摸"),
		CHR_YIDIANHONG(0x00000002, "一点红"),
		CHR_BIAN_HU(0x00000004, "扁胡"),
		CHR_WU_HU(0x00000008, "乌胡"),
		CHR_HAIDI_HU(0x00000010, "海底胡"),
		CHR_HONG_HU(0x00000020, "红胡"),
		CHR_SHIHONG(0x00000040, "十红"),
		CHR_KA_HU20(0x00000080, "20卡胡"),
		CHR_KA_HU30(0x00000100, "30卡胡"),
		CHR_TIAN_HU(0x00000200, "天胡"),
		CHR_DI_HU(0x00000400, "地胡"),
		CHR_FANG_PAO(0x00000800, "放炮"),
		;

		private int index;
		private String value;

		private ChrType(int index, String value) {
			this.index = index;
			this.value = value;
		}
		
		public static String getName(long type) {
			for (ChrType chr : values()) {
				if (chr.getIndex() == type) {
					return chr.getValue();
				}
			}
			return null;
		}
		
		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

}
