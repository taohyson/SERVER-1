package com.cai.common.domain;

import java.util.Date;

/**
 * 大厅app升级包管理
 * 
 * @author Administrator
 *
 */
public class AppItem {

	private int id;
	private int gameSeq;// 单个游戏升级序列号
	private int appId;// 子游戏id
	private String appName;// 子游戏名称
	private String packagepath;// 整包名
	private String versions;// 包版本信息
	private String iconUrl;// 图标url
	private int t_status;// 游戏状态，0未发布，1发布
	private int orders;// 游戏的展示顺序
	private int flag;// 游戏标志，new,hot,活动，比赛
	private int packagesize;// 整包大小
	private String downUrl;// 差异包相对路径
	private int size;// 差异包大小
	private Date operate_at;
	private String packageDownPath;// 包下载路径
	private int game_type;// 游戏类型
	private String city;// app所属城市
	private int online;
	private int show_index;// 是否首页展示，0不展示，1展示
	private String not_fit_city;// 不适用城市
	private int placeholder;// 占位符

	public int getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(int placeholder) {
		this.placeholder = placeholder;
	}

	public String getNot_fit_city() {
		return not_fit_city;
	}

	public void setNot_fit_city(String not_fit_city) {
		this.not_fit_city = not_fit_city;
	}

	public int getShow_index() {
		return show_index;
	}

	public void setShow_index(int show_index) {
		this.show_index = show_index;
	}

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

	public int getGame_type() {
		return game_type;
	}

	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameSeq() {
		return gameSeq;
	}

	public void setGameSeq(int gameSeq) {
		this.gameSeq = gameSeq;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getPackagepath() {
		return packagepath;
	}

	public void setPackagepath(String packagepath) {
		this.packagepath = packagepath;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getVersions() {
		return versions;
	}

	public void setVersions(String versions) {
		this.versions = versions;
	}

	public int getT_status() {
		return t_status;
	}

	public void setT_status(int t_status) {
		this.t_status = t_status;
	}

	public Date getOperate_at() {
		return operate_at;
	}

	public void setOperate_at(Date operate_at) {
		this.operate_at = operate_at;
	}

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getPackagesize() {
		return packagesize;
	}

	public void setPackagesize(int packagesize) {
		this.packagesize = packagesize;
	}

	public String getDownUrl() {
		return downUrl;
	}

	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getPackageDownPath() {
		return packageDownPath;
	}

	public void setPackageDownPath(String packageDownPath) {
		this.packageDownPath = packageDownPath;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + appId;
		result = prime * result + ((appName == null) ? 0 : appName.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((downUrl == null) ? 0 : downUrl.hashCode());
		result = prime * result + flag;
		result = prime * result + gameSeq;
		result = prime * result + game_type;
		result = prime * result + ((iconUrl == null) ? 0 : iconUrl.hashCode());
		result = prime * result + id;
		result = prime * result + ((not_fit_city == null) ? 0 : not_fit_city.hashCode());
		result = prime * result + online;
		result = prime * result + ((operate_at == null) ? 0 : operate_at.hashCode());
		result = prime * result + orders;
		result = prime * result + ((packageDownPath == null) ? 0 : packageDownPath.hashCode());
		result = prime * result + ((packagepath == null) ? 0 : packagepath.hashCode());
		result = prime * result + packagesize;
		result = prime * result + placeholder;
		result = prime * result + show_index;
		result = prime * result + size;
		result = prime * result + t_status;
		result = prime * result + ((versions == null) ? 0 : versions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppItem other = (AppItem) obj;
		if (appId != other.appId)
			return false;
		if (appName == null) {
			if (other.appName != null)
				return false;
		} else if (!appName.equals(other.appName))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (downUrl == null) {
			if (other.downUrl != null)
				return false;
		} else if (!downUrl.equals(other.downUrl))
			return false;
		if (flag != other.flag)
			return false;
		if (gameSeq != other.gameSeq)
			return false;
		if (game_type != other.game_type)
			return false;
		if (iconUrl == null) {
			if (other.iconUrl != null)
				return false;
		} else if (!iconUrl.equals(other.iconUrl))
			return false;
		if (id != other.id)
			return false;
		if (not_fit_city == null) {
			if (other.not_fit_city != null)
				return false;
		} else if (!not_fit_city.equals(other.not_fit_city))
			return false;
		if (online != other.online)
			return false;
		if (operate_at == null) {
			if (other.operate_at != null)
				return false;
		} else if (!operate_at.equals(other.operate_at))
			return false;
		if (orders != other.orders)
			return false;
		if (packageDownPath == null) {
			if (other.packageDownPath != null)
				return false;
		} else if (!packageDownPath.equals(other.packageDownPath))
			return false;
		if (packagepath == null) {
			if (other.packagepath != null)
				return false;
		} else if (!packagepath.equals(other.packagepath))
			return false;
		if (packagesize != other.packagesize)
			return false;
		if (placeholder != other.placeholder)
			return false;
		if (show_index != other.show_index)
			return false;
		if (size != other.size)
			return false;
		if (t_status != other.t_status)
			return false;
		if (versions == null) {
			if (other.versions != null)
				return false;
		} else if (!versions.equals(other.versions))
			return false;
		return true;
	}


	

}
