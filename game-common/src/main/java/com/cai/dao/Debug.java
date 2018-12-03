package com.cai.dao;

import org.apache.log4j.Logger;

public class Debug
{
	private static Logger defaultLogger = Logger.getLogger("com.manu");

	private static Logger perfLogger = Logger.getLogger("perf");

	private static Logger remoteLogger = Logger.getLogger("remote");

	private static Logger getLogger()
	{
		return defaultLogger;
	}

	private static Logger getLogger(Class module)
	{
		if (module != null)
		{
			return Logger.getLogger(module);
		}
		return defaultLogger;
	}

	private static Logger getLogger(String loggerName)
	{
		Logger logger = Logger.getLogger(loggerName);
		if (logger == null)
			logger = defaultLogger;
		return logger;
	}

	public static void perfDebug(Object message)
	{
		if ((perfLogger != null) && (perfLogger.isDebugEnabled()))
		{
			perfLogger.debug(message);
		}
	}

	public static void perfInfo(Object message)
	{
		if ((perfLogger != null) && (perfLogger.isInfoEnabled()))
		{
			perfLogger.info(message);
		}
	}

	public static void remoteDebug(Object message)
	{
		if ((remoteLogger != null) && (remoteLogger.isDebugEnabled()))
		{
			remoteLogger.debug(message);
		}
	}

	public static void remoteInfo(Object message)
	{
		if ((remoteLogger != null) && (remoteLogger.isInfoEnabled()))
		{
			remoteLogger.info(message);
		}
	}

	public static void exceptionLog(Exception e)
	{
		if (((e instanceof ManuAppException)) || ((e instanceof ResultException)))
		{
			info(e.getMessage());
		}
		else if ((e instanceof ManuSilenceSysException))
		{
			info("[Silence] " + e.getMessage());
		}
		else
		{
			error(e.getMessage(), e);
		}
	}

	public static void debug(Object message)
	{
		if (getLogger().isDebugEnabled())
			getLogger().debug(message);
	}

	public static void debug(Object message, Throwable t)
	{
		if (getLogger().isDebugEnabled())
			getLogger().debug(message, t);
	}

	public static void debug(Object message, Class module)
	{
		if (getLogger(module).isDebugEnabled())
			getLogger(module).debug(message);
	}

	public static void debug(Object message, String loggerName)
	{
		if (getLogger(loggerName).isDebugEnabled())
			getLogger(loggerName).debug(message);
	}

	public static void debug(Object message, Throwable t, Class module)
	{
		if (getLogger(module).isDebugEnabled())
			getLogger(module).debug(message, t);
	}

	public static void debug(Object message, Throwable t, String loggerName)
	{
		if (getLogger(loggerName).isDebugEnabled())
			getLogger(loggerName).debug(message, t);
	}

	public static void info(Object message)
	{
		if (getLogger().isInfoEnabled())
			getLogger().info(message);
	}

	public static void info(Object message, Throwable t)
	{
		if (getLogger().isInfoEnabled())
			getLogger().info(message, t);
	}

	public static void info(Object message, Class module)
	{
		if (getLogger(module).isInfoEnabled())
			getLogger(module).info(message);
	}

	public static void info(Object message, String loggerName)
	{
		if (getLogger(loggerName).isInfoEnabled())
			getLogger(loggerName).info(message);
	}

	public static void info(Object message, Throwable t, Class module)
	{
		if (getLogger(module).isInfoEnabled())
			getLogger(module).info(message, t);
	}

	public static void info(Object message, Throwable t, String loggerName)
	{
		if (getLogger(loggerName).isInfoEnabled())
			getLogger(loggerName).info(message, t);
	}

	public static void warn(Object message)
	{
		getLogger().warn(message);
	}

	public static void warn(Object message, Throwable t)
	{
		getLogger().warn(message, t);
	}

	public static void warn(Object message, Class module)
	{
		getLogger(module).warn(message);
	}

	public static void warn(Object message, String loggerName)
	{
		getLogger(loggerName).warn(message);
	}

	public static void warn(Object message, Throwable t, Class module)
	{
		getLogger(module).warn(message, t);
	}

	public static void warn(Object message, Throwable t, String loggerName)
	{
		getLogger(loggerName).warn(message, t);
	}

	public static void error(Object message)
	{
		getLogger().error(message);
	}

	public static void error(Object message, Throwable t)
	{
		getLogger().error(message, t);
	}

	public static void error(Object message, Class module)
	{
		getLogger(module).error(message);
	}

	public static void error(Object message, String loggerName)
	{
		getLogger(loggerName).error(message);
	}

	public static void error(Object message, Throwable t, Class module)
	{
		getLogger(module).error(message, t);
	}

	public static void error(Object message, Throwable t, String loggerName)
	{
		getLogger(loggerName).error(message, t);
	}

	public static void fatal(Object message)
	{
		getLogger().fatal(message);
	}

	public static void fatal(Object message, Throwable t)
	{
		getLogger().fatal(message, t);
	}

	public static void fatal(Object message, Class module)
	{
		getLogger(module).fatal(message);
	}

	public static void fatal(Object message, String loggerName)
	{
		getLogger(loggerName).fatal(message);
	}

	public static void fatal(Object message, Throwable t, Class module)
	{
		getLogger(module).fatal(message, t);
	}

	public static void fatal(Object message, Throwable t, String loggerName)
	{
		getLogger(loggerName).fatal(message, t);
	}
}

