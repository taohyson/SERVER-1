package com.cai.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang.time.DateFormatUtils;
import com.cai.common.domain.match.MatchRankImages;
import com.cai.common.util.JsonUtil;
import protobuf.clazz.match.MatchClientRsp.MatchUnionConfigProto;
import protobuf.clazz.match.MatchClientRsp.MatchUnionConfigTopProto;
import protobuf.clazz.match.MatchClientRsp.MatchUnionDetailConfig;

/**
 * 棋牌联赛配置
 */
public class MatchUnionModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int app_type;
	private int sort;
	private String match_union_name;
	private int match_union_type;
	private String match_desc;
	private String icon;
	private String bg_image;
	private String match_desc2;
	private int match_union_status;
	private String side_ids;
	private int account_type;
	private String rank_images;
	
	private Date show_time;
	private Date close_time;
	private Date begin_time;
	private Date end_time;
	
	private List<Integer> sideList;
	private MatchRankImages topImageModel;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApp_type() {
		return app_type;
	}

	public void setApp_type(int app_type) {
		this.app_type = app_type;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getMatch_union_name() {
		return match_union_name;
	}

	public void setMatch_union_name(String match_union_name) {
		this.match_union_name = match_union_name;
	}

	public int getMatch_union_type() {
		return match_union_type;
	}

	public void setMatch_union_type(int match_union_type) {
		this.match_union_type = match_union_type;
	}

	public String getMatch_desc() {
		return match_desc;
	}

	public void setMatch_desc(String match_desc) {
		this.match_desc = match_desc;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getBg_image() {
		return bg_image;
	}

	public void setBg_image(String bg_image) {
		this.bg_image = bg_image;
	}

	public String getMatch_desc2() {
		return match_desc2;
	}

	public void setMatch_desc2(String match_desc2) {
		this.match_desc2 = match_desc2;
	}

	public int getMatch_union_status() {
		return match_union_status;
	}

	public void setMatch_union_status(int match_union_status) {
		this.match_union_status = match_union_status;
	}

	public Date getShow_time() {
		return show_time;
	}

	public void setShow_time(Date show_time) {
		this.show_time = show_time;
	}

	public Date getClose_time() {
		return close_time;
	}

	public void setClose_time(Date close_time) {
		this.close_time = close_time;
	}

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public String getSide_ids() {
		return side_ids;
	}

	public void setSide_ids(String side_ids) {
		this.side_ids = side_ids;
	}

	public int getAccount_type() {
		return account_type;
	}

	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}

	public String getRank_images() {
		return rank_images;
	}

	public void setRank_images(String rank_images) {
		this.rank_images = rank_images;
	}
	
	public void init(){
		try{
			if(rank_images != null && rank_images.length() > 0){
				topImageModel = JsonUtil.parseJsonObject(rank_images, MatchRankImages.class);
			}
		}catch (Exception e) {
		}
	}

	public MatchUnionConfigProto.Builder encode(List<Integer> sideTypeList){
		MatchUnionConfigProto.Builder b = MatchUnionConfigProto.newBuilder();
		b.setId(id);
		b.setAppType(app_type);
		b.setSort(sort);
		b.setName(match_union_name);
		b.setDescription1(match_desc);
		b.setDescription2(match_desc2);
		b.setType(match_union_type);
		b.setIcon(icon);
		b.setBgImage(bg_image);
		b.setStatus(match_union_status);
		if(show_time!=null) b.setShowTime(DateFormatUtils.format(show_time, "yyyy-MM-dd HH:mm:ss"));
		if(close_time!=null) b.setCloseTime(DateFormatUtils.format(close_time, "yyyy-MM-dd HH:mm:ss"));
		if(begin_time!=null) b.setBeginTime(DateFormatUtils.format(begin_time, "yyyy-MM-dd HH:mm:ss"));
		if(end_time!=null) b.setEndTime(DateFormatUtils.format(end_time, "yyyy-MM-dd HH:mm:ss"));
		if(sideList == null){
			initSideList();
		}
		b.addAllSideTypes(sideTypeList);
		if(topImageModel != null){
			MatchUnionConfigTopProto.Builder topConfigMsg = MatchUnionConfigTopProto.newBuilder();
			topConfigMsg.setRankHeadImage(topImageModel.getRankHeadImage());
			topConfigMsg.setRankWholeImage(topImageModel.getRankWholeImage());
			topConfigMsg.setTabSelectImage(topImageModel.getTabSelectImage());
			topConfigMsg.setTabNoSelectImage(topImageModel.getTabNoSelectImage());
			topConfigMsg.setRankBgImage(topImageModel.getRankBgImage());
			
			b.setTopConfig(topConfigMsg.build());
		}
	    return b;
	}
	
	public boolean isClose(){
		if(match_union_status == 2){
			return true;
		}
		return false;
	}
	
	public MatchUnionDetailConfig.Builder encodeDetail(){
		 MatchUnionDetailConfig.Builder b = MatchUnionDetailConfig.newBuilder();
		 b.setUnionId(id);
		 b.setDesc(match_desc);
		 return b;
	}

	public List<Integer> initSideList() {
		List<Integer> sideIds = new ArrayList<>();
		if(side_ids != null && !"".equals(side_ids.trim())){
			String[] arr = side_ids.trim().split(",");
			for(String arrValue : arr){
				sideIds.add(Integer.parseInt(arrValue));
			}
		}
		sideList = sideIds;
		return sideList;
	}
	
}
