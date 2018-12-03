package com.cai.dao;

import org.springframework.core.NestedRuntimeException;

public class ManuAppException extends NestedRuntimeException
{
	public ManuAppException(String msg)
	{
		super(msg);
	}

	public ManuAppException(String msg, Throwable cause)
	{
		super(msg, cause);
	}

	public ManuAppException()
	{
		super("not implements: manuapp");
	}
}

