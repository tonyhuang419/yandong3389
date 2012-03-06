package com.dreams.dream.common.mybatis;

import java.io.Serializable;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements IBaseDao<T> {

	/* (non-Javadoc)
	 * @see com.dreams.dream.common.mybatis.IBaseDao#save(java.lang.String, java.lang.Object)
	 */
	@Override
	public void save(String sqlId, Object obj){
		getSqlSession().insert(sqlId, obj);
	}
	
	/* (non-Javadoc)
	 * @see com.dreams.dream.common.mybatis.IBaseDao#delete(java.lang.String, java.io.Serializable)
	 */
	@Override
	public void delete(String sqlId, Serializable id){
		getSqlSession().delete(sqlId, id);
	}
	
	/* (non-Javadoc)
	 * @see com.dreams.dream.common.mybatis.IBaseDao#delete(java.lang.String, java.lang.Object)
	 */
	@Override
	public void delete(String sqlId, Object obj){
		getSqlSession().delete(sqlId, obj);
	}
	
	/* (non-Javadoc)
	 * @see com.dreams.dream.common.mybatis.IBaseDao#get(java.lang.String, java.lang.Object)
	 */
	@Override
	public T get(String sqlId, Object params){
		return (T) getSqlSession().selectOne(sqlId, params);
	}
	
	/* (non-Javadoc)
	 * @see com.dreams.dream.common.mybatis.IBaseDao#getList(java.lang.String)
	 */
	@Override
	public List<T> getList(String sqlId){
		return getSqlSession().selectList(sqlId);
	}
	
	/* (non-Javadoc)
	 * @see com.dreams.dream.common.mybatis.IBaseDao#getList(java.lang.String, java.lang.Object)
	 */
	@Override
	public List<T> getList(String sqlId, Object params){
		return getSqlSession().selectList(sqlId, params);
	}
	
}
