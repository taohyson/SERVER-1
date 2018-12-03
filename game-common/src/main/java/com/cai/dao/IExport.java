package com.cai.dao;

import java.io.Serializable;
import java.util.Map;

public abstract interface IExport extends Serializable
{
	public abstract String getIExportKey();

	public abstract int getIExportType();

	public abstract int getIExportOpCode();

	public abstract void setIExportOpCode(int paramInt);

	public abstract int getUserId();

	public abstract Map exportObj();
}

