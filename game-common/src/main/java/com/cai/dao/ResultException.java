package com.cai.dao;

import org.springframework.core.NestedCheckedException;

public class ResultException extends NestedCheckedException
{
	private int resultValue;

	public ResultException(String msg)
	{
		super(msg);
	}

	public ResultException(int result)
	{
		this("spell casted");
		this.resultValue = result;
	}

	public ResultException(String msg, int result)
	{
		this(msg);
		this.resultValue = result;
	}

	public int getResultValue()
	{
		return this.resultValue;
	}
}

