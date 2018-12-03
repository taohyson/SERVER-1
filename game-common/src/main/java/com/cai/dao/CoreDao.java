package com.cai.dao;


import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.SqlMapClientCallback;

import com.ibatis.sqlmap.client.SqlMapExecutor;


public class CoreDao extends BaseDAO
{
	public Object queryForObject(String statementName, Object id) throws DataAccessException
	{
		return getSqlMapClientTemplate().queryForObject(statementName, id);
	}
	
	public Object queryForObject(String statementName) throws DataAccessException
	{
		return getSqlMapClientTemplate().queryForObject(statementName);
	}

	public <T> List<T> queryForList(String statementName) throws DataAccessException
	{
		return getSqlMapClientTemplate().queryForList(statementName);
	}

	public <T> List<T> queryForList(String statementName, Object parameterObject) throws DataAccessException
	{
		long t1 = System.currentTimeMillis();
		List<T> list = getSqlMapClientTemplate().queryForList(statementName, parameterObject);
		long t2 = System.currentTimeMillis();
		long diff = t2 - t1;
		if (diff > 1000L)
			Debug.perfDebug(MessageFormat.format("CoreDao ???sql ??{0} ; millseconds = {1}", statementName ,  diff));
		return list;
	}
	
	public void updateObject(String statementName) throws DataAccessException
	{
		long t1 = System.currentTimeMillis();
		getSqlMapClientTemplate().update(statementName);
		
		long t2 = System.currentTimeMillis();
		long diff = t2 - t1;
		if (diff > 1000L)
			Debug.perfDebug(MessageFormat.format("CoreDao ???sql ??{0} ; millseconds = {1}", statementName ,  diff));
	}

	public int updateObject(String statementName, Object parameterObject) throws DataAccessException
	{
		long t1 = System.currentTimeMillis();
		int cnt = 0;
		if(parameterObject!=null)
		{
			cnt = getSqlMapClientTemplate().update(statementName, parameterObject);
		}
		else
		{
			cnt = getSqlMapClientTemplate().update(statementName);
		}
		long t2 = System.currentTimeMillis();
		long diff = t2 - t1;
		if (diff > 1000L)
			Debug.perfDebug(MessageFormat.format("CoreDao ???sql ??{0} ; millseconds = {1}", statementName ,  diff));
		return cnt;
	}
	
	public void batchUpdate( final String statementName, final List list) { 

	       try { 
	           if (list != null && list.size()>0) { 
	              this .getSqlMapClientTemplate().execute( new SqlMapClientCallback() { 
	                  public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException { 
	                     executor.startBatch(); 
	                     for ( int i = 0, n = list.size(); i < n; i++) { 

	                         executor.update(statementName, list.get(i)); 
	                     } 
	                     executor.executeBatch(); 
	                     return null ; 
	                  } 
	              }); 

	           } 

	       } catch (Exception e) { 
	              e.printStackTrace(); 
	       } 
	    }
	public void batchInsert( final String statementName, final List list) { 

	       try { 
	           if (list != null && list.size()>0) { 
	              this .getSqlMapClientTemplate().execute( new SqlMapClientCallback() { 
	                  public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException { 
	                     executor.startBatch(); 
	                     for ( int i = 0, n = list.size(); i < n; i++) { 

	                         executor.insert(statementName, list.get(i)); 
	                     } 
	                     executor.executeBatch(); 
	                     return null ; 
	                  } 
	              }); 

	           } 

	       } catch (Exception e) { 
	              e.printStackTrace(); 
	       } 
	    }
	public Object insertObject(String statementName, Object parameterObject) throws DataAccessException
	{
		long t1 = System.currentTimeMillis();
		Object obj = getSqlMapClientTemplate().insert(statementName, parameterObject);
		
		long t2 = System.currentTimeMillis();
		long diff = t2 - t1;
		if (diff > 1000L)
			Debug.perfDebug(MessageFormat.format("CoreDao ???sql ??{0} ; millseconds = {1}", statementName ,  diff));
		return obj;
	}

	public int deleteObject(String statementName, Object parameterObject) throws DataAccessException
	{
		IExport t;
		try
		{
			int i = getSqlMapClientTemplate().delete(statementName, parameterObject);
			return i;
		}
		catch (DataAccessException ex)
		{
			throw ex;
		}
		finally
		{
			
		}
	}

	public int deleteObject(String statementName) throws DataAccessException
	{
		return getSqlMapClientTemplate().delete(statementName);
	}
	
	public void batchDelete( final String statementName, final List list) { 

	       try { 
	           if (list != null ) { 
	              this .getSqlMapClientTemplate().execute( new SqlMapClientCallback() { 
	                  public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException { 
	                     executor.startBatch(); 
	                     for ( int i = 0, n = list.size(); i < n; i++) { 

	                         executor.delete(statementName, list.get(i)); 
	                     } 
	                     executor.executeBatch(); 
	                     return null ; 
	                  } 
	              }); 

	           } 

	       } catch (Exception e) { 
	              e.printStackTrace(); 
	       } 
	    }
}

