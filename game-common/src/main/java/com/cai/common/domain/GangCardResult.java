package com.cai.common.domain;

/***
 * 杠牌结果
 */
public class GangCardResult {
	public int cbCardCount;// 扑克数目
	public int cbCardData[];// 扑克数据
	public int isPublic[];//
	public int type[];// 杆的类型
	public int detailActionType[]; // 具体的杠牌类型
	public int realOperateCard[]; // 真实的操作的牌 比如软碰 之后 继续抓赖子牌进行杠

	public GangCardResult() {
		cbCardData = new int[4];
		isPublic = new int[4];
		type = new int[4];
		detailActionType = new int[4];
		realOperateCard = new int[4];
	}

	public GangCardResult(int count) {
		cbCardData = new int[count];
		isPublic = new int[count];
		type = new int[count];
		detailActionType = new int[count];
		realOperateCard = new int[count];
	}
}
