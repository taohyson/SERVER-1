package com.cai.dao;

import java.io.Serializable;

public class ListPager implements Serializable
{
	private int pageSize;

	private int pageNo;

	private int length;

	public ListPager()
	{
		reset();
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public void setPageNo(int pageNo)
	{
		this.pageNo = pageNo;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public int getLength()
	{
		return this.length;
	}

	public int getPageNo()
	{
		int maxNo = (int) Math.ceil(this.length * 1.0D / this.pageSize);
		if (this.pageNo <= 0)
			this.pageNo = 1;
		else if (this.pageNo > maxNo)
		{
			this.pageNo = maxNo;
		}
		return this.pageNo;
	}

	public int getPageSize()
	{
		return this.pageSize;
	}

	public int getTotalPages()
	{
		return this.length % this.pageSize == 0 ? this.length / this.pageSize : 1 + this.length / this.pageSize;
	}

	public void reset()
	{
		this.pageNo = 1;
		this.pageSize = 10;
	}
}

