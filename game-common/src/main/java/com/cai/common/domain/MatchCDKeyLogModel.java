/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 */
@Document(collection = "match_cd_key_log")
@CompoundIndexes({ 
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		})
public class MatchCDKeyLogModel implements Serializable{
	/**
	 */
	private static final long serialVersionUID = 1L;

	private long accountId; //使用玩家
	private int cdKeyId; //主键
	private String cdKeyCode; //使用码
	private int itemId; //获得的道具ID
	private Date date;
	private boolean isSuc; //true成功  false未在背包找到
	private String attachMsg; //附加奖励
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public int getCdKeyId() {
		return cdKeyId;
	}
	public void setCdKeyId(int cdKeyId) {
		this.cdKeyId = cdKeyId;
	}
	public String getCdKeyCode() {
		return cdKeyCode;
	}
	public void setCdKeyCode(String cdKeyCode) {
		this.cdKeyCode = cdKeyCode;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isSuc() {
		return isSuc;
	}
	public void setSuc(boolean isSuc) {
		this.isSuc = isSuc;
	}
	public String getAttachMsg() {
		return attachMsg;
	}
	public void setAttachMsg(String attachMsg) {
		this.attachMsg = attachMsg;
	}

}
