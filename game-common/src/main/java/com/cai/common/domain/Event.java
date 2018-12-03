package com.cai.common.domain;

public abstract class Event<T>
{
	protected String source;

	protected String destination;

	protected T body;

	public Event()
	{

	}

	public Event(String source, String destination, T body)
	{
		this.source = source;
		this.destination = destination;
		this.body = body;
	}

	public String getSource()
	{
		return source;
	}

	public void setSource(String source)
	{
		this.source = source;
	}

	public String getDest()
	{
		return destination;
	}

	public void setDest(String dest)
	{
		this.destination = dest;
	}

	public T getBody()
	{
		return this.body;
	}

	public void setBody(T body)
	{
		this.body = body;
	}
}
