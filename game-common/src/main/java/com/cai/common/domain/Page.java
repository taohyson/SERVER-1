package com.cai.common.domain;

public class Page {
	/*当前页数 默认为1*/
	private Integer realPage  = 1;
	/*页面记录数 默认为10*/
	private Integer pageSize  = 20;
	/*总页面数*/
	private Integer totalPage = 0;
	/*总记录数*/
	private Integer totalSize = 0;
	
	public Page(){
	}
	/**
	 * @param realPage
	 * @param pageSize
	 */
	public Page(Integer realPage, Integer pageSize,int totalSize){
		if(realPage==null || realPage<1){
			this.realPage = 1;
		}else{
			this.realPage = realPage;
		}
		
		this.pageSize = pageSize;
		this.totalSize = totalSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}
	/**设置每次大小*/
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getRealPage() {
		return realPage;
	}
	public void setRealPage(Integer realPage) {
		this.realPage = realPage;
	}
	/**
	 * 总页面数计算.
	 * @return Integer.
	 */
	public Integer getTotalPage() {
		if(totalSize%pageSize==0){
			totalPage=totalSize/pageSize;
		}else{
			totalPage=totalSize/pageSize+1;
		}
		if(totalPage==0)
			totalPage = 1;
		return totalPage;
	}

	/**总记录数*/
	public Integer getTotalSize() {
		return totalSize;
	}
	/**设置总记录数*/
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
	
	/**数据库的开始查询数据*/
	public Integer getBeginNum(Integer realPage){
		int temp = realPage -1;
		return (temp < 0 ? 0 : temp) * pageSize;
	}
	
	public Integer getBeginNum(){
		int temp = realPage -1;
		return (temp < 0 ? 0 : temp) * pageSize;
	}
	
	
	/** 根据数据下标找到在第几页 */
	public  Integer getRealPageByIndex(int index){
		
		if(index==0)
			return 1;
		
		int findPage = 0;
		if(index%pageSize==0){
			findPage=index/pageSize;
		}else{
			findPage=index/pageSize+1;
		}
		return findPage;
		
	}
	
	
	
	public static void main(String[] args) {
		Page page = new Page(1,10,100);
		//page.setTotalSize(100);
		
		System.out.println(page.getRealPageByIndex(51));
	}
	
}
