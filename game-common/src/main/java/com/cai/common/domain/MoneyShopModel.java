package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 金币商城
 */
public class MoneyShopModel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 状态(1-正常 0-失效)
     */
    private int state;

    /**
     * 游戏类型 0-表示所有
     */
    private int game_type;

    /**
     * 金币money数量
     */
    private int money;

    /**
     * 赠送金币数量
     */
    private int send_money;

    /**
     * 兑换需要的(闲逸豆)
     */
    private int price;

    /**
     * 排序方式(大的排前面)
     */
    private int display_order;

    private Date create_time;

    private String remark;

    /**
     * ICON
     */
    private String icon;
    
    /**
	 * 热卖标签(0-否 1-是)
	 */
	private int hotTag;
	
	/**
	 * 赠送标签
	 */
	private String sendTag;
	
	/**
	 * 上架开始时间
	 */
	private Date begin_time;
	
	/**
	 * 上架结束时间
	 */
	private Date end_time;
	
	/**
	 * 展示开始时间
	 */
	private Date begin_show_time;
	
	/**
	 * 展示结束时间
	 */
	private Date end_show_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getGameType() {
        return game_type;
    }

    public void setGameType(int gameType) {
        this.game_type = gameType;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getSendMoney() {
        return send_money;
    }

    public void setSendMoney(int sendMoney) {
        this.send_money = sendMoney;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDisplayOrder() {
        return display_order;
    }

    public void setDisplayOrder(int displayOrder) {
        this.display_order = displayOrder;
    }

    public Date getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Date createTime) {
        this.create_time = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 商品状态是否正常
     * @return
     */
    public boolean isStatusEffect() {
        return state==1;
    }

	public int getHotTag() {
		return hotTag;
	}

	public void setHotTag(int hotTag) {
		this.hotTag = hotTag;
	}

	public String getSendTag() {
		return sendTag;
	}

	public void setSendTag(String sendTag) {
		this.sendTag = sendTag;
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

	public Date getBegin_show_time() {
		return begin_show_time;
	}

	public void setBegin_show_time(Date begin_show_time) {
		this.begin_show_time = begin_show_time;
	}

	public Date getEnd_show_time() {
		return end_show_time;
	}

	public void setEnd_show_time(Date end_show_time) {
		this.end_show_time = end_show_time;
	}

}
