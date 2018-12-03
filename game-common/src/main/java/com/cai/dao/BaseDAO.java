package com.cai.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;



public class BaseDAO extends SqlMapClientDaoSupport
{
	public List pagerQueryForList(String pagerStmtName, Map conds)
	{
		return pagerQueryForList(pagerStmtName, pagerStmtName + "Count", conds);
	}

	public List pagerQueryForList(String pagerStmtName, String countStmtName, Map conds)
	{
		ListPager listPager = (ListPager) conds.get("PAGE_OPJECT");
		long t0 = System.currentTimeMillis();
		Integer recordCnt = (Integer) getSqlMapClientTemplate().queryForObject(countStmtName, conds);
		long t1 = System.currentTimeMillis();
		if (t1 - t0 > 999L)
			Debug.perfInfo("############## Warnning! Long time dao: " + countStmtName + " " + String.valueOf(t1 - t0));
		if (recordCnt != null)
		{
			listPager.setLength(recordCnt.intValue());
		}
		int startRow = listPager.getPageSize() * (listPager.getPageNo() - 1 < 0 ? 0 : listPager.getPageNo() - 1);
		startRow = startRow < 0 ? 0 : startRow;
		conds.put("startRow", Integer.valueOf(startRow));
		conds.put("pageSize", Integer.valueOf(listPager.getPageSize()));
		List dataList = getSqlMapClientTemplate().queryForList(pagerStmtName, conds);
	
		dataList.add(listPager);
		return dataList;
	}
}
