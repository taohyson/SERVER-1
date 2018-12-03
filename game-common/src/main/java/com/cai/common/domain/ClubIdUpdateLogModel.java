/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "club_id_update_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'account_id': 1}"), @CompoundIndex(name = "index_log_type", def = "{'log_type': 1}"),
		@CompoundIndex(name = "index_old_club_id", def = "{'old_club_id': 1}", background = true),
		@CompoundIndex(name = "index_new_club_id", def = "{'new_club_id': 1}", background = true) })
public class ClubIdUpdateLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 帐号ID
	 */
	private long account_id;

	private Date create_time;

	private String msg;
	private Integer old_club_id;
	private Integer new_club_id;
	private String account_ids;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getOld_club_id() {
		return old_club_id;
	}

	public void setOld_club_id(Integer old_club_id) {
		this.old_club_id = old_club_id;
	}

	public Integer getNew_club_id() {
		return new_club_id;
	}

	public void setNew_club_id(Integer new_club_id) {
		this.new_club_id = new_club_id;
	}

	public String getAccount_ids() {
		return account_ids;
	}

	public void setAccount_ids(String account_ids) {
		this.account_ids = account_ids;
	}

}
