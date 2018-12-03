package com.cai.common.domain;

import java.util.HashMap;
import java.util.Map;

import com.cai.common.constant.GameConstants;
import com.cai.common.constant.game.Constants_JingDian_CS;

public class ChiHuRight {

	private static boolean m_bInit = false;
	private static long m_dwRightMask[] = new long[] { 0 };

	public long m_dwRight[] = new long[] { 0 };

	public long type_list[] = new long[GameConstants.MAX_CHI_HU_TYPE];

	public long type_mul_list[] = new long[GameConstants.MAX_CHI_HU_TYPE];
	public int type_mul_count;

	private Map<Long, Integer> map_for_type_and_count = new HashMap<Long, Integer>(); // 湘潭麻将选美胡时牌，最多可以叠加四次胡牌类型

	public int type_count;

	public int da_hu_count;

	public int single_da_hu;

	public int hengyang_da_hu; // 衡阳大胡计分

	public boolean _show_all;
	public int _index_da_si_xi;
	public int _index_liul_liu_shun_1;
	public int _index_liul_liu_shun_2;

	// 中特六六顺
	public int _index_zt_lls_1;
	public int _index_zt_lls_2;

	public boolean _valid;

	public int bao_ting_index;
	public int bao_ting_card;
	public int hua_count;
	public int heifeng_count;// 黑风组数
	public int baifeng_count;// 白风组数
	public int yaojiu_count;// 幺九扑组数
	public int duanmen_count;// 断门数
	public int sanhun_kan;// 三混成坎
	public int qi_shou_bao_ting; // 起手报听
	public int an_ka_count; // 暗卡数

	public boolean is_qing_ping_hu; // 青平胡

	public int hong_count;

	public int _index_san_tong;
	public int _index_jie_jie_gao;

	public Map<Integer, String> beiMap; // 陆河麻将倍数玩法

	public boolean can_bao_si_gang; // 能包四杆

	public boolean can_bao_si_peng; // 能包四杆
	public int ka_count; // 456卡

	private int pao_fan; // 炮胡番

	public int zhua_bao_hu[]; // 抓报胡
	public int zhua_bao_hu_count; // 抓报胡

	public void reset_card() {

		_show_all = false;
		_index_jie_jie_gao = _index_san_tong = _index_da_si_xi = _index_liul_liu_shun_1 = _index_liul_liu_shun_2 = GameConstants.MAX_INDEX;
		_index_zt_lls_1 = _index_zt_lls_2 = GameConstants.MAX_INDEX;
	}

	public ChiHuRight() {
		if (!m_bInit) {
			m_bInit = true;
			for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
				if (0 == i)
					m_dwRightMask[i] = 0;
				else
					m_dwRightMask[i] = ((long) (Math.pow(2, i - 1))) << 28;
			}
			type_count = 0;
			for (int i = 0; i < GameConstants.MAX_CHI_HU_TYPE; i++) {
				type_list[i] = 0;
				type_mul_list[i] = 0;
			}
			map_for_type_and_count.clear();
		}
		_show_all = false;
		_index_da_si_xi = _index_liul_liu_shun_1 = _index_liul_liu_shun_2 = GameConstants.MAX_INDEX;
		_index_zt_lls_1 = _index_zt_lls_2 = GameConstants.MAX_INDEX;
		da_hu_count = 0;
		single_da_hu = 0;
		_valid = false;
		hua_count = 0;
		bao_ting_card = 0;
		bao_ting_index = -1;
		type_mul_count = 0;
		heifeng_count = 0;
		baifeng_count = 0;// 白风组数
		duanmen_count = 0;// 断门数
		yaojiu_count = 0;
		an_ka_count = 0;
		beiMap = new HashMap<Integer, String>();
		can_bao_si_gang = false;
		can_bao_si_peng = false;
		ka_count = 0;
		zhua_bao_hu = new int[4];
		for (int i = 0; i < 4; i++) {
			zhua_bao_hu[i] = -1;
		}
		zhua_bao_hu_count = 0;
		pao_fan = 0;
	}

	public String get_chi_hu_des() {

		return "";
	}

	// 检查仅位是否正确
	public boolean is_valid_right(long dwRight) {
		long dwRightHead = dwRight & 0xF0000000;
		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++)
			if (m_dwRightMask[i] == dwRightHead)
				return true;
		return false;
	}

	// 检查仅位是否正确
	public boolean is_valid_right_long(long dwRight) {
		long dwRightHead = dwRight & 0xF000000000000000L;
		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++)
			if (m_dwRightMask[i] == dwRightHead)
				return true;
		return false;
	}

	// 赋值符重载 =
	public void opr_equal(long dwRight) {
		long dwOtherRight = 0;
		// 验证权位
		if (!is_valid_right(dwRight)) {
			// 验证取反权位
			if (!is_valid_right(~dwRight))
				return;
			dwRight = ~dwRight;
			dwOtherRight = GameConstants.MASK_CHI_HU_RIGHT;
		}

		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			if (((dwRight & m_dwRightMask[i]) != 0) || (i == 0 && dwRight < 0x10000000)) {
				m_dwRight[i] = dwRight & GameConstants.MASK_CHI_HU_RIGHT;
			} else {
				m_dwRight[i] = dwOtherRight;
			}
		}
	}

	// 赋值符重载 &=
	public void opr_and_equal_long(long dwRight) {
		boolean bNavigate = false;
		// 验证权位
		if (!is_valid_right_long(dwRight)) {
			// 验证取反权位
			if (!is_valid_right_long(~dwRight))
				return;
			// 调整权位
			long dwHeadRight = (~dwRight) & 1000000000000000L;
			long dwTailRight = dwRight & GameConstants.MASK_CHI_HU_RIGHT_LONG;
			dwRight = dwHeadRight | dwTailRight;
			bNavigate = true;
		}

		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			if (((dwRight & m_dwRightMask[i]) != 0) || (i == 0 && dwRight < 0x1000000000000000L)) {
				long ddd = dwRight & GameConstants.MASK_CHI_HU_RIGHT_LONG;
				m_dwRight[i] &= ddd;
			} else if (!bNavigate)
				m_dwRight[i] = 0;
		}
	}

	// 赋值符重载 &=
	public void opr_and_equal(long dwRight) {
		boolean bNavigate = false;
		// 验证权位
		if (!is_valid_right(dwRight)) {
			// 验证取反权位
			if (!is_valid_right(~dwRight))
				return;
			// 调整权位
			long dwHeadRight = (~dwRight) & 0xF0000000;
			long dwTailRight = dwRight & GameConstants.MASK_CHI_HU_RIGHT;
			dwRight = dwHeadRight | dwTailRight;
			bNavigate = true;
		}

		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			if (((dwRight & m_dwRightMask[i]) != 0) || (i == 0 && dwRight < 0x10000000)) {
				long ddd = dwRight & GameConstants.MASK_CHI_HU_RIGHT;
				m_dwRight[i] &= ddd;
			} else if (!bNavigate)
				m_dwRight[i] = 0;
		}
	}

	// 赋值符重载 |=
	public void opr_or_equal(long dwRight) {
		// 验证权位
		if (!is_valid_right(dwRight))
			return;

		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			if (((dwRight & m_dwRightMask[i]) != 0) || (i == 0 && dwRight < 0x10000000))
				m_dwRight[i] |= (dwRight & GameConstants.MASK_CHI_HU_RIGHT);
		}
	}

	// 赋值符重载 |=
	public void opr_or_equal_long(long dwRight) {
		// 验证权位
		if (!is_valid_right_long(dwRight))
			return;

		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			if (((dwRight & m_dwRightMask[i]) != 0) || (i == 0 && dwRight < 0x1000000000000000L))
				m_dwRight[i] |= (dwRight & GameConstants.MASK_CHI_HU_RIGHT_LONG);
		}
	}

	// 赋值符重载 &
	public ChiHuRight opr_and(long dwRight) {
		ChiHuRight tem = new ChiHuRight();
		tem.set_right_data(m_dwRight, GameConstants.MAX_RIGHT_COUNT);
		tem.opr_and_equal(dwRight);

		return tem;
	}

	// 赋值符重载 &
	public ChiHuRight opr_and_long(long dwRight) {
		ChiHuRight tem = new ChiHuRight();
		tem.set_right_data(m_dwRight, GameConstants.MAX_RIGHT_COUNT);
		tem.opr_and_equal_long(dwRight);

		return tem;
	}

	// 湖南湘潭麻将：赋值符重载 |
	public void opr_or_xt(long dwRight, boolean need_to_multiply) {
		// 现有的十种胡牌类型够用了
		if (!need_to_multiply) {
			type_list[type_count++] = dwRight;
		} else {
			if (map_for_type_and_count.containsKey(dwRight)) {
				int tmp_int = map_for_type_and_count.get(dwRight);
				map_for_type_and_count.replace(dwRight, ++tmp_int);
			} else {
				type_list[type_count++] = dwRight;
				map_for_type_and_count.put(dwRight, 1);
			}
		}
		opr_or_equal(dwRight);
	}

	// 赋值符重载 |
	public void opr_or(long dwRight) {

		if (opr_and(dwRight).is_empty()) {
			if (type_count < GameConstants.MAX_CHI_HU_TYPE) {
				type_list[type_count] = dwRight;
				type_count++;

				switch ((int) dwRight) {
				case GameConstants.CHR_HUNAN_PENGPENG_HU:// 碰碰胡
				case GameConstants.CHR_HUNAN_JIANGJIANG_HU:// 将将胡
				case GameConstants.CHR_HUNAN_QING_YI_SE:// 清一色
				case GameConstants.CHR_HUNAN_HAI_DI_LAO:// 海底捞
				case GameConstants.CHR_HUNAN_HAI_DI_PAO:// 海底炮
				case GameConstants.CHR_HUNAN_QI_XIAO_DUI:// 七小对
				case GameConstants.CHR_HUNAN_GANG_KAI:
				case GameConstants.CHR_HUNAN_GANG_SHANG_PAO:// 杠上跑
				case GameConstants.CHR_HUNAN_QUAN_QIU_REN:// 全求人
				case GameConstants.CHR_HUNAN_TIAN_HU:// 天胡
				case GameConstants.CHR_HUNAN_DI_HU:// 地胡
				case GameConstants.CHR_HUNAN_MEN_QING:// 门清
				case GameConstants.CHR_HUNAN_QISHOU_BAO_TING:// 起手报听
				{
					this.da_hu_count++;
					this.single_da_hu++;// 临湘大胡
					this.hengyang_da_hu++;
				}
					break;
				case GameConstants.CHR_HUNAN_QIANG_GANG_HU:// 抢杠胡
				{
					this.da_hu_count++;
					this.hengyang_da_hu++;
				}
					break;
				case GameConstants.CHR_HUNAN_HAOHUA_QI_XIAO_DUI:// 豪华七小对
				{
					this.da_hu_count += 2;
					this.single_da_hu += 2;// 临湘大胡
					this.hengyang_da_hu++;
				}
					break;
				case GameConstants.CHR_HUNAN_SHUANG_HAO_HUA_QI_XIAO_DUI:// 双豪华七小对
				{
					this.da_hu_count += 3;
					this.single_da_hu += 3;// 临湘大胡
					this.hengyang_da_hu++;
				}
					break;
				case GameConstants.CHR_HUNAN_SHUANG_GANG_KAI:// 双杠开
				{
					this.da_hu_count += 1;
					this.single_da_hu += 1;// 临湘大胡
					this.hengyang_da_hu++;
				}
					break;
				case GameConstants.CHR_HUNAN_SHUANG_GANG_SHANG_PAO:// 双杠上炮
				{
					this.da_hu_count += 1;
					this.single_da_hu += 1;// 临湘大胡
					this.hengyang_da_hu++;
				}
					break;
				default:
					break;

				}
			}
		} else {
			type_mul_list[type_mul_count++] = dwRight;
			switch ((int) dwRight) {
			case GameConstants.CHR_HUNAN_PENGPENG_HU:// 碰碰胡
			case GameConstants.CHR_HUNAN_JIANGJIANG_HU:// 将将胡
			case GameConstants.CHR_HUNAN_QING_YI_SE:// 清一色
			case GameConstants.CHR_HUNAN_HAI_DI_LAO:// 海底捞
			case GameConstants.CHR_HUNAN_HAI_DI_PAO:// 海底炮
			case GameConstants.CHR_HUNAN_QI_XIAO_DUI:// 七小对
			case GameConstants.CHR_HUNAN_GANG_KAI:
			case GameConstants.CHR_HUNAN_QIANG_GANG_HU:// 抢杠胡
			case GameConstants.CHR_HUNAN_GANG_SHANG_PAO:// 杠上跑
			case GameConstants.CHR_HUNAN_QUAN_QIU_REN:// 全求人
			case GameConstants.CHR_HUNAN_TIAN_HU:// 天胡
			case GameConstants.CHR_HUNAN_DI_HU:// 地胡
			{
				this.da_hu_count++;
				this.hengyang_da_hu++;
			}
				break;
			case GameConstants.CHR_HUNAN_HAOHUA_QI_XIAO_DUI:// 豪华七小对
			{
				this.da_hu_count += 2;
				this.hengyang_da_hu++;
			}
				break;
			case GameConstants.CHR_HUNAN_SHUANG_HAO_HUA_QI_XIAO_DUI:// 双豪华七小对
			{
				this.da_hu_count += 3;
				this.hengyang_da_hu++;
			}
				break;
			case GameConstants.CHR_HUNAN_SHUANG_GANG_KAI:// 双杠开
			{
				this.da_hu_count += 1;
				this.hengyang_da_hu++;
			}
				break;
			case GameConstants.CHR_HUNAN_SHUANG_GANG_SHANG_PAO:// 双杠上炮
			{
				this.da_hu_count += 1;
				this.hengyang_da_hu++;
			}
				break;
			default:
				break;

			}
		}
		opr_or_equal(dwRight);
	}

	public void opr_or_jd_cs(long dwRight) {
		if (opr_and_long(dwRight).is_empty()) {
			type_list[type_count++] = dwRight;

			switch ((int) dwRight) {
			case (int) Constants_JingDian_CS.CHR_PENG_PENG_HU:
			case (int) Constants_JingDian_CS.CHR_JIANG_JIANG_HU:
			case (int) Constants_JingDian_CS.CHR_QING_YI_SE:
			case (int) Constants_JingDian_CS.CHR_HAI_DI_LAO_YUE:
			case (int) Constants_JingDian_CS.CHR_HAI_DI_PAO:
			case (int) Constants_JingDian_CS.CHR_QI_XIAO_DUI:
			case (int) Constants_JingDian_CS.CHR_GANG_KAI:
			case (int) Constants_JingDian_CS.CHR_GANG_PAO:
			case (int) Constants_JingDian_CS.CHR_QIANG_GANG:
			case (int) Constants_JingDian_CS.CHR_QUAN_QIU_REN:
			case (int) Constants_JingDian_CS.CHR_TIAN_HU:
			case (int) Constants_JingDian_CS.CHR_DI_HU:
			case (int) Constants_JingDian_CS.CHR_JIA_JIANG_HU: {
				this.da_hu_count++;
			}
				break;
			case (int) Constants_JingDian_CS.CHR_HH_QI_XIAO_DUI: {
				this.da_hu_count += 2;
			}
				break;
			case (int) Constants_JingDian_CS.CHR_SHH_QI_XIAO_DUI: {
				this.da_hu_count += 3;
			}
				break;
			default:
				break;
			}
		} else {
			type_mul_list[type_mul_count++] = dwRight;

			switch ((int) dwRight) {
			case (int) Constants_JingDian_CS.CHR_PENG_PENG_HU:
			case (int) Constants_JingDian_CS.CHR_JIANG_JIANG_HU:
			case (int) Constants_JingDian_CS.CHR_QING_YI_SE:
			case (int) Constants_JingDian_CS.CHR_HAI_DI_LAO_YUE:
			case (int) Constants_JingDian_CS.CHR_HAI_DI_PAO:
			case (int) Constants_JingDian_CS.CHR_QI_XIAO_DUI:
			case (int) Constants_JingDian_CS.CHR_GANG_KAI:
			case (int) Constants_JingDian_CS.CHR_GANG_PAO:
			case (int) Constants_JingDian_CS.CHR_QIANG_GANG:
			case (int) Constants_JingDian_CS.CHR_QUAN_QIU_REN:
			case (int) Constants_JingDian_CS.CHR_TIAN_HU:
			case (int) Constants_JingDian_CS.CHR_DI_HU:
			case (int) Constants_JingDian_CS.CHR_JIA_JIANG_HU: {
				this.da_hu_count++;
			}
				break;
			case (int) Constants_JingDian_CS.CHR_HH_QI_XIAO_DUI: {
				this.da_hu_count += 2;
			}
				break;
			case (int) Constants_JingDian_CS.CHR_SHH_QI_XIAO_DUI: {
				this.da_hu_count += 3;
			}
				break;
			default:
				break;
			}
		}
		opr_or_equal_long(dwRight);
	}

	public void opr_or_long(long dwRight) {

		if (opr_and_long(dwRight).is_empty()) {
			if (type_count < GameConstants.MAX_CHI_HU_TYPE) {
				type_list[type_count] = dwRight;
				type_count++;

			}
		}
		opr_or_equal_long(dwRight);
	}

	// 是否权位为空
	public boolean is_empty() {
		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			if (m_dwRight[i] != 0)
				return false;
		}
		_show_all = false;
		_index_da_si_xi = _index_liul_liu_shun_1 = _index_liul_liu_shun_2 = GameConstants.MAX_INDEX;
		_index_zt_lls_1 = _index_zt_lls_2 = GameConstants.MAX_INDEX;

		return true;
	}

	// 设置权位为空
	public void set_empty() {
		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			m_dwRight[i] = 0;
		}
		type_count = 0;
		for (int i = 0; i < GameConstants.MAX_CHI_HU_TYPE; i++) {
			type_list[i] = 0;
			type_mul_list[i] = 0;
		}
		map_for_type_and_count.clear();
		_valid = false;
		da_hu_count = 0;
		hengyang_da_hu = 0;
		single_da_hu = 0;
		an_ka_count = 0;
		duanmen_count = 0;
		type_mul_count = 0;
		beiMap = new HashMap<Integer, String>();
		can_bao_si_gang = false;
		can_bao_si_peng = false;
		ka_count = 0;
		zhua_bao_hu = new int[4];
		for (int i = 0; i < 4; i++) {
			zhua_bao_hu[i] = -1;
		}
		zhua_bao_hu_count = 0;
		reset_card();
	}

	// 获取权位数值
	public int get_right_data(long dwRight[]) {
		// if( cbMaxCount < m_dwRight.length ) return 0;

		for (int i = 0; i < GameConstants.MAX_RIGHT_COUNT; i++) {
			dwRight[i] = m_dwRight[i];
		}

		return m_dwRight.length;
	}

	// 设置权位数值
	public boolean set_right_data(long dwRight[], int cbRightCount) {
		if (cbRightCount > m_dwRight.length)
			return false;

		for (int i = 0; i < cbRightCount; i++) {
			m_dwRight[i] = dwRight[i];
		}

		return true;
	}

	public void copy(ChiHuRight ch) {
		set_right_data(ch.m_dwRight, 1);
		this.type_count = ch.type_count;
		for (int i = 0; i < this.type_count; i++) {
			type_list[i] = ch.type_list[i];
		}
		this.single_da_hu = ch.single_da_hu;
		this.da_hu_count = ch.da_hu_count;
	}

	public boolean is_mul(int cbRight) {
		for (int i = 0; i < type_mul_count; i++) {
			if (type_mul_list[i] == cbRight) {
				return true;
			}
		}
		return false;
	}

	public boolean is_mul_long(long cbRight) {
		for (int i = 0; i < type_mul_count; i++) {
			if (type_mul_list[i] == cbRight) {
				return true;
			}
		}
		return false;
	}

	public boolean is_show_all() {
		return _show_all;
	}

	public void set_show_all(boolean _show_all) {
		this._show_all = _show_all;
	}

	public int get_index_da_si_xi() {
		return _index_da_si_xi;
	}

	public void set_index_da_si_xi(int _index_da_si_xi) {
		this._index_da_si_xi = _index_da_si_xi;
	}

	public int get_index_liul_liu_shun_1() {
		return _index_liul_liu_shun_1;
	}

	public void set_index_liul_liu_shun_1(int _index_liul_liu_shun_1) {
		this._index_liul_liu_shun_1 = _index_liul_liu_shun_1;
	}

	public int get_index_liul_liu_shun_2() {
		return _index_liul_liu_shun_2;
	}

	public void set_index_liul_liu_shun_2(int _index_liul_liu_shun_2) {
		this._index_liul_liu_shun_2 = _index_liul_liu_shun_2;
	}

	public long[] getType_list() {
		return type_list;
	}

	public void setType_list(long[] type_list) {
		this.type_list = type_list;
	}

	public int getType_count() {
		return type_count;
	}

	public void setType_count(int type_count) {
		this.type_count = type_count;
	}

	public boolean is_valid() {
		return _valid;
	}

	public void set_valid(boolean _valid) {
		this._valid = _valid;
	}

	public int getDa_hu_count() {
		return da_hu_count;
	}

	public void setDa_hu_count(int da_hu_count) {
		this.da_hu_count = da_hu_count;
	}

	public long[] getType_mul_list() {
		return type_mul_list;
	}

	public void setType_mul_list(long[] type_mul_list) {
		this.type_mul_list = type_mul_list;
	}

	/**
	 * @return the is_qing_ping_hu
	 */
	public boolean isIs_qing_ping_hu() {
		return is_qing_ping_hu;
	}

	/**
	 * @param is_qing_ping_hu
	 *            the is_qing_ping_hu to set
	 */
	public void setIs_qing_ping_hu(boolean is_qing_ping_hu) {
		this.is_qing_ping_hu = is_qing_ping_hu;
	}

	public Map<Long, Integer> get_map_for_type_and_count() {
		return map_for_type_and_count;
	}

	/**
	 * @return the pao_fan
	 */
	public int getPao_fan() {
		return pao_fan;
	}

	/**
	 * @param pao_fan
	 *            the pao_fan to set
	 */
	public void setPao_fan(int pao_fan) {
		this.pao_fan = pao_fan;
	}

}
