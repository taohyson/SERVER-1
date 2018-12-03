package com.cai.common.domain.match;

import java.io.Serializable;

/**
 * 冲榜赛榜单相关信息(配置在联赛里)
 * @author wuhaoran
 */
public class MatchRankImages implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String rankHeadImage;		//榜单榜头图片
	private String rankWholeImage;		//榜单整体皮肤
	private String tabSelectImage;		//tab选中
	private String tabNoSelectImage;	//tab未选中
	private String rankBgImage;			//冲榜赛背景图
	
	public String getRankHeadImage() {
		return rankHeadImage;
	}
	public void setRankHeadImage(String rankHeadImage) {
		this.rankHeadImage = rankHeadImage;
	}
	public String getRankWholeImage() {
		return rankWholeImage;
	}
	public void setRankWholeImage(String rankWholeImage) {
		this.rankWholeImage = rankWholeImage;
	}
	public String getTabSelectImage() {
		return tabSelectImage;
	}
	public void setTabSelectImage(String tabSelectImage) {
		this.tabSelectImage = tabSelectImage;
	}
	public String getTabNoSelectImage() {
		return tabNoSelectImage;
	}
	public void setTabNoSelectImage(String tabNoSelectImage) {
		this.tabNoSelectImage = tabNoSelectImage;
	}
	public String getRankBgImage() {
		return rankBgImage;
	}
	public void setRankBgImage(String rankBgImage) {
		this.rankBgImage = rankBgImage;
	}
	
}
