package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

/**
 * 牌局记录
 * @author run
 *
 */
@Document(collection="brand_child_log")
@CompoundIndexes({
	@CompoundIndex(name = "index_crate_time", def = "{'create_time': -1}",background=true),
	@CompoundIndex(name = "index_account", def = "{'account_id': 1}"),
    @CompoundIndex(name = "index_game_id", def = "{'game_id': 1}"),
    @CompoundIndex(name = "index_log_type", def = "{'log_type': 1}"),
    @CompoundIndex(name = "index_brand_id", def = "{'brand_id': 1}"),
    @CompoundIndex(name = "index_v1", def = "{'v1': 1}"),
    @CompoundIndex(name = "index_brand_parent_id", def = "{'brand_parent_id': 1}",background=true),
	@CompoundIndex(name = "index_room_id", def = "{'v3': 1}",background=true),
	@CompoundIndex(name = "index_create_account_id", def = "{'create_account_id': 1}",background=true)
})
public class BrandChildLogModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	
	private Date create_time;
	private Long account_id;
	
	private Integer game_id;
	private Integer logic_id;
	private String log_type;
	@JSONField(serializeUsing =ToStringSerializer.class)
	private Long brand_id;//牌局id
	@JSONField(serializeUsing =ToStringSerializer.class)
	private String brand_child_id;//牌局子id
	@JSONField(serializeUsing =ToStringSerializer.class)
	private Long brand_parent_id;//牌局父id
	private String msg;
	private Long v1;
	private Long v2;
	private String v3;
	private String v4;
	private String local_ip;
	private String account_ip;
	
	/**
	 * 是否压缩回放数据 gzip  0=否 1=是
	 */
	private int compress_video;
	/**
	 * 回放数据
	 */
	private byte[] video_record;
	
	/**
	 * 房间创建者
	 */
	private Long create_account_id;
	
	/**
	 * 起始牌数组
	 */
	@JSONField(serializeUsing =ToStringSerializer.class)
	private String beginArray;
	
	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String get_id() {
		return _id;
	}
	
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Integer getGame_id() {
		return game_id;
	}
	public void setGame_id(Integer game_id) {
		this.game_id = game_id;
	}
	public Integer getLogic_id() {
		return logic_id;
	}
	public void setLogic_id(Integer logic_id) {
		this.logic_id = logic_id;
	}
	public String getLog_type() {
		return log_type;
	}
	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}
	
	public Long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}
	
	public String getBrand_child_id() {
		return brand_child_id;
	}
	public void setBrand_child_id(String brand_child_id) {
		this.brand_child_id = brand_child_id;
	}
	public Long getBrand_parent_id() {
		return brand_parent_id;
	}
	public void setBrand_parent_id(Long brand_parent_id) {
		this.brand_parent_id = brand_parent_id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getV1() {
		return v1;
	}
	public void setV1(Long v1) {
		this.v1 = v1;
	}
	public Long getV2() {
		return v2;
	}
	public void setV2(Long v2) {
		this.v2 = v2;
	}
	public String getV3() {
		return v3;
	}
	public void setV3(String v3) {
		this.v3 = v3;
	}
	public String getV4() {
		return v4;
	}
	public void setV4(String v4) {
		this.v4 = v4;
	}
	public String getLocal_ip() {
		return local_ip;
	}
	public void setLocal_ip(String local_ip) {
		this.local_ip = local_ip;
	}
	public Long getCreate_account_id() {
		return create_account_id;
	}
	public void setCreate_account_id(Long create_account_id) {
		this.create_account_id = create_account_id;
	}
	public String getAccount_ip() {
		return account_ip;
	}
	public String getBeginArray() {
		return beginArray;
	}
	
	public void setBeginArray(String beginArray) {
		this.beginArray = beginArray;
	}
	public void setAccount_ip(String account_ip) {
		this.account_ip = account_ip;
	}
	public int getCompress_video() {
		return compress_video;
	}
	public void setCompress_video(int compress_video) {
		this.compress_video = compress_video;
	}
	public byte[] getVideo_record() {
		return video_record;
	}
	public void setVideo_record(byte[] video_record) {
		this.video_record = video_record;
	}
	
}
