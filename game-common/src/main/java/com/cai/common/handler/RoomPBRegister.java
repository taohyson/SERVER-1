/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.handler;

import java.util.Map;

import com.cai.common.constant.MsgConstants;
import com.google.common.collect.Maps;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Parser;

import protobuf.clazz.Common.ChatMsgReq;
import protobuf.clazz.Protocol.Enter_Back_Request;
import protobuf.clazz.Xpsj.XpsjRsp.Opreate_RequestWsk_Xpsj;
import protobuf.clazz.YGWsk.YGWskRsp.Opreate_RequestWsk_YG;
import protobuf.clazz.abz.AbzRsp.Call_Banker_Request_Abz;
import protobuf.clazz.abz.AbzRsp.Change_card_Request;
import protobuf.clazz.abz.AbzRsp.OutCardData_Request_Abz;
import protobuf.clazz.btz.BTZRsp.Trustee_BTZ;
import protobuf.clazz.czbg.CZBGRsp.OpenCardRequest_CZBG;
import protobuf.clazz.czwxox.czwxoxRsp.Opreate_Czwxox_Request;
import protobuf.clazz.dbd.DbdRsp.Call_Banker_DBD_Request;
import protobuf.clazz.dbd.DbdRsp.OutCardData_Request_DBD;
import protobuf.clazz.dbn.dbnRsp.Opreate_dbn_Request;
import protobuf.clazz.dcts.dctsRsp.Opreate_RequestWsk_dcts;
import protobuf.clazz.ddz.DdzRsp.Add_Times_Request;
import protobuf.clazz.ddz.DdzRsp.Call_Banker_Request;
import protobuf.clazz.ddz.DdzRsp.OutCardData_Request;
import protobuf.clazz.ddz.DdzRsp.Piao_Fen_Request;
import protobuf.clazz.ddz_lf.ddz_lfRsp.Opreate_RequestDdz_LF;
import protobuf.clazz.deh.DehRsp.Opreate_Request_DEH;
import protobuf.clazz.deh.DehRsp.Opreate_open_card;
import protobuf.clazz.dmz.DmzRsp.Opreate_Ming_Pai_Request;
import protobuf.clazz.eightox.eightoxRsp.Opreate_Eightox_Request;
import protobuf.clazz.extendCommon.ExtendsProto.PermitLessRep;
import protobuf.clazz.fcsj.fcsjRsp.Opreate_RequestWsk_fcsj;
import protobuf.clazz.fkn.fknRsp.Opreate_Fkn_Request;
import protobuf.clazz.fkpsh.fkpshRsp.Opreate_Fkpsh_Request;
import protobuf.clazz.gdy.gdyRsp.Opreate_RequestWsk_GDY;
import protobuf.clazz.gdy.gdyRsp.OutCardData_Request_GDY;
import protobuf.clazz.gfWsk.gfWskRsp.Opreate_RequestWsk_GF;
import protobuf.clazz.gzhbzp.gzhbzpRsp.Opreate_RequestWsk_gzhbzp;
import protobuf.clazz.hcng.hcngRsp.Opreate_RequestWsk_hcng;
import protobuf.clazz.hongershi.HongErShiRsp.Operate_Card_HongErShi;
import protobuf.clazz.hrdz.hrdzRsp.Opreate_RequestWsk_hrdz;
import protobuf.clazz.hsdy.hsdyRsp.Opreate_RequestWsk_hsdy;
import protobuf.clazz.hts.htsRsp.call_banker_request_hts;
import protobuf.clazz.hts.htsRsp.lipai_request_hts;
import protobuf.clazz.huaihuaox.huaihuaoxRsp.Opreate_Huaihuaox_Request;
import protobuf.clazz.jdb.jdbRsp.Opreate_Jdb_Request;
import protobuf.clazz.jxklox.jxklRsp.Opreate_Jxklox_Request;
import protobuf.clazz.klox.klRsp.Opreate_Klox_Request;
import protobuf.clazz.ldsdh.ldsdhRsp.Opreate_RequestWsk_Ldsdh;
import protobuf.clazz.lldq.lldqRsp.Opreate_RequestWsk_lldq;
import protobuf.clazz.lpsddz.lpsDdzRsp.Add_Times_Request_lps;
import protobuf.clazz.lpsddz.lpsDdzRsp.Call_Banker_Request_lps;
import protobuf.clazz.lpsddz.lpsDdzRsp.Fen_Luo_Request_lps;
import protobuf.clazz.lpsddz.lpsDdzRsp.Rang_Pai_Request_lps;
import protobuf.clazz.lpsddz.lpsDdzRsp.Swap_Card_Request_lps;
import protobuf.clazz.mj.Klds.KLDS_PAO_QIAN_EXT;
import protobuf.clazz.mj.KwxProto.KWXLiangCard;
import protobuf.clazz.mj.KwxProto.PlayerDZMessage;
import protobuf.clazz.mj.MjRsp.Request_message_chat;
import protobuf.clazz.mj.Nanchang.FaDianActionEnd;
import protobuf.clazz.mj.Wuzhi.LsdyCards;
import protobuf.clazz.nceqw.nceqwRsp.Opreate_RequestWsk_Nceqw;
import protobuf.clazz.ncgz.NcgzRsp.Opreate_RequestWsk_Ncgz;
import protobuf.clazz.ncst.NcstRsp.Opreate_RequestWsk_Ncst;
import protobuf.clazz.pcWsk.pcWskRsp.Opreate_RequestWsk_PC;
import protobuf.clazz.pdk_all.PdkRsp.Opreate_RequestWsk_pdk;
import protobuf.clazz.pdk_jz.pdk_jzPdkRsp.Opreate_Requestpdk_JZ;
import protobuf.clazz.pdk_np.Pdk_npRsp.Opreate_RequestWsk_nppdk;
import protobuf.clazz.pdk_xy.PdkRsp.Qiepai_Req;
import protobuf.clazz.pshox.pshoxRsp.Opreate_Pshox_Request;
import protobuf.clazz.pxgt.pxgtkRsp.Opreate_RequestWsk_pxgt;
import protobuf.clazz.qjqf.QJQFRsp.Opreate_Request_QJQF;
import protobuf.clazz.sdh.SdhRsp.CallBankerRequest;
import protobuf.clazz.sdh.SdhRsp.OrganizeTeamRequest;
import protobuf.clazz.sdh.SdhRsp.OutCardDataRequestSdh;
import protobuf.clazz.sg.sgRsp.Opreate_Sg_Request;
import protobuf.clazz.shidianban.shidianbanRsp.Opreate_Sdb_Request;
import protobuf.clazz.ssz.SszRsp.SSZ_CallBankerRequest;
import protobuf.clazz.ssz.SszRsp.SSZ_JettonRequest;
import protobuf.clazz.ssz.SszRsp.SSZ_OpenCardRequest;
import protobuf.clazz.sxth.SxthRsp.Opreate_RequestWsk_Sxth;
import protobuf.clazz.tcdg.TcdgRsp.Opreate_RequestWsk_tcdg;
import protobuf.clazz.txw.TxwRsp.Opreate_RequestWsk_Txw;
import protobuf.clazz.wzdd.wzddRsp.Opreate_RequestWsk_Wzdd;
import protobuf.clazz.xfgd.xfgdRsp.Opreate_RequestWsk_Xfgd;
import protobuf.clazz.xndg.XndgRsp.Opreate_RequestWsk_xndg;
import protobuf.clazz.xpbf.xpbfRsp.Opreate_RequestWsk_xpbf;
import protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request;
import protobuf.clazz.xtxz.xtxzRsp.Opreate_RequestWsk_xtxz;
import protobuf.clazz.xykl.xyklRsp.Opreate_Request_Xykl;
import protobuf.clazz.yggp.YggpRsp.Opreate_Request_YGGP;
import protobuf.clazz.yiyangox.yiyangoxRsp.Opreate_YiYangOx_Request;
import protobuf.clazz.ysdz.ysdzRsp.Opreate_Request_ysdz;
import protobuf.clazz.yuanjiangqf.yuanjiangqfRsp.Request_qiepai_yjqf;
import protobuf.clazz.yxzd.yxzdkRsp.Opreate_RequestWsk_yxzd;
import protobuf.clazz.yyox.YyoxRsp.Opreate_Yyox_Request;
import protobuf.clazz.yzbp.yzbpRsp.Opreate_RequestWsk_Yzbp;
import protobuf.clazz.zjh.ZjhRsp.Opreate_Request;

/**
 * 
 * 客户端与服务器{roomrequest}通信的pb注册中心
 * 
 * @author wu date: 2017年9月1日 下午12:23:23 <br/>
 */
public final class RoomPBRegister {

	public static final Map<Integer, Parser<? extends GeneratedMessage>> ROOM_PARSER = Maps.newConcurrentMap();

	static {
		ROOM_PARSER.put(MsgConstants.REQUST_PIAO_FEN, Piao_Fen_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_CALL_QIANG_ZHUANG,
				Call_Banker_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DDZ_OUT_CARD_MUL,
				OutCardData_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DDZ_ADD_TIMES, Add_Times_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_OPREATE, Opreate_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DBN_OPERATE, Opreate_dbn_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_FKN_OPERATE, Opreate_Fkn_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_CZWXOX_OPERATE,
				Opreate_Czwxox_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_KLOX_OPERATE, Opreate_Klox_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SDH_OPERATE, CallBankerRequest.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SDH_OUT_CARD_MUL,
				OutCardDataRequestSdh.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SSZ_JETTON, SSZ_JettonRequest.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SSZ_CALLBANKER,
				SSZ_CallBankerRequest.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SSZ_OPENCARD, SSZ_OpenCardRequest.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_MESSAGE_CHAT, Request_message_chat.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SG_OPERATE_JD, Opreate_Sg_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUEST_ROOM_CHAT, ChatMsgReq.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_GDY_OUT_CARD_LAIZI,
				OutCardData_Request_GDY.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_JDB_OPERATE, Opreate_Jdb_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_XYKL_OPERATE, Opreate_Request_Xykl.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DBD_CALL_BANKER,
				Call_Banker_DBD_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUEST_XIA_BA, KLDS_PAO_QIAN_EXT.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_BTZ_TRUSTEE, Trustee_BTZ.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DBD_OUT_CARD_LAIZI,
				OutCardData_Request_DBD.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_OPEN_LESS_EXTENDS, PermitLessRep.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_OPREATE_DEH, Opreate_Request_DEH.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_OPEN_CARD_DEH, Opreate_open_card.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DMZ_OPERATE,
				Opreate_Ming_Pai_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_CZBG_OPEN_CARD,
				OpenCardRequest_CZBG.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_EIGHTOX_OPERATE,
				Opreate_Eightox_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YYOX_OPERATE, Opreate_Yyox_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_KLOXJX_OPERATE,
				Opreate_Jxklox_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUET_LIANG_ZHANG, KWXLiangCard.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_KWX_KOU_CHECK, KWXLiangCard.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_OPERATE_CARD,
				Operate_Card_HongErShi.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_OUT_CARD_ABZ,
				OutCardData_Request_Abz.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_CALL_BANKER_ABZ,
				Call_Banker_Request_Abz.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_CHANGE_ABZ, Change_card_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SDB_OPERATE, Opreate_Sdb_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YI_YANG_OX_OPERATE,
				Opreate_YiYangOx_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_HUAIHUAOX_OPERATE,
				Opreate_Huaihuaox_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_GF_WSK_OPERATE,
				Opreate_RequestWsk_GF.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SJ_SFGD_OPERATE,
				Opreate_RequestWsk_Xfgd.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_CHU_ZI, PlayerDZMessage.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_PSHOX_OPERATE,
				Opreate_Pshox_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_FKPSH_OPERATE,
				Opreate_Fkpsh_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_ENTER_BACK, Enter_Back_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_XNDG_OPERATE,
				Opreate_RequestWsk_xndg.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_PDK_QIE_PAI, Qiepai_Req.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SDH_YYBS_ORGANIZETEAM,
				OrganizeTeamRequest.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_TCDG_OPERATE,
				Opreate_RequestWsk_tcdg.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SJ_LLDQ_OPERATE,
				Opreate_RequestWsk_lldq.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_XPBH_OPERATE, Opreate_Xpbh_Request.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_PDK_OPERATE,
				Opreate_RequestWsk_pdk.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_WZDD_OPERATE,
				Opreate_RequestWsk_Wzdd.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_QJQF, Opreate_Request_QJQF.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_FEN_LUO_LPS, Fen_Luo_Request_lps.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SWAP_CARD_LPS,
				Swap_Card_Request_lps.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUEST_RANG_PAI, Rang_Pai_Request_lps.getDefaultInstance().getParserForType());

		ROOM_PARSER.put(MsgConstants.REQUST_CALL_BAKER_LPS,
				Call_Banker_Request_lps.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DDZ_ADD_TIMES_LPS,
				Add_Times_Request_lps.getDefaultInstance().getParserForType());

		ROOM_PARSER.put(MsgConstants.REQUEST_HNWZ_DISPLAY_WIN_CARDS, LsdyCards.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_PC_WSK_OPERATE,
				Opreate_RequestWsk_PC.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_XPSJ_OPERATE,
				Opreate_RequestWsk_Xpsj.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_SXTH_OPERATE,
				Opreate_RequestWsk_Sxth.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_HSDY_OPERATE,
				Opreate_RequestWsk_hsdy.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YSDZ_OPERATE, Opreate_Request_ysdz.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_NPPDK_OPERATE,
				Opreate_RequestWsk_nppdk.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_CHENG_BAO_HTS,
				call_banker_request_hts.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DDZLF_OPERATE,
				Opreate_RequestDdz_LF.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YZBP_OPERATE,
				Opreate_RequestWsk_Yzbp.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_LI_PAI_HTS, lipai_request_hts.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_GZH_BZP_OPERATE,
				Opreate_RequestWsk_gzhbzp.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_GDY_OPERATE,
				Opreate_RequestWsk_GDY.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_NCST_OPERATE,
				Opreate_RequestWsk_Ncst.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_NCMJ_TINGPAI, FaDianActionEnd.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YXZD_OPERATE,
				Opreate_RequestWsk_yxzd.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_PXGT_OPERATE,
				Opreate_RequestWsk_pxgt.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_TXW_OPERATE,
				Opreate_RequestWsk_Txw.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_XTXZ_OPERATE,
				Opreate_RequestWsk_xtxz.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_NCEQW_OPERATE,
				Opreate_RequestWsk_Nceqw.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_DCTS_OPERATE,
				Opreate_RequestWsk_dcts.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YJQF_OPERATE, Request_qiepai_yjqf.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_NCGZ_OPERATE,
				Opreate_RequestWsk_Ncgz.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_LDSDH_OPERATE,
				Opreate_RequestWsk_Ldsdh.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_HRDZ_OPERATE,
				Opreate_RequestWsk_hrdz.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_HCNG_OPERATE,
				Opreate_RequestWsk_hcng.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_XPBF_OPERATE,
				Opreate_RequestWsk_xpbf.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YGGP_OPERATE, Opreate_Request_YGGP.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_YGWSK_OPERATE,
				Opreate_RequestWsk_YG.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_JZPDK_OPERATE,
				Opreate_Requestpdk_JZ.getDefaultInstance().getParserForType());
		ROOM_PARSER.put(MsgConstants.REQUST_FCSJ_OPERATE,
				Opreate_RequestWsk_fcsj.getDefaultInstance().getParserForType());
	}
}
