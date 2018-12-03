package com.cai.dao;

import org.springframework.core.NestedRuntimeException;

public class ManuSysException extends NestedRuntimeException
{
	public ManuSysException(String msg)
	{
		super(msg);
	}

	public ManuSysException(Throwable cause)
	{
		super("System Exception", cause);
	}

	public ManuSysException(String msg, Throwable cause)
	{
		super(msg, cause);
	}
}

