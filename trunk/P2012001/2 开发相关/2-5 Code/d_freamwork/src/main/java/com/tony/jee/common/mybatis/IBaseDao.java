//package com.tony.jee.common.mybatis;
//
//import java.io.Serializable;
//import java.util.List;
//
//public interface IBaseDao<T> {
//
//	/**
//	 * 保存
//	 * @param sqlId
//	 * @param obj
//	 */
//	public abstract void save(String sqlId, Object obj);
//
//	/**
//	 * 根据ID删除数据
//	 * @param sqlId
//	 * @param id
//	 */
//	public abstract void delete(String sqlId, Serializable id);
//
//	/**
//	 * 根据主键删除数据
//	 * @param sqlId
//	 * @param obj
//	 */
//	public abstract void delete(String sqlId, Object obj);
//
//	public abstract T get(String sqlId, Object params);
//
//	public abstract List<T> getList(String sqlId);
//
//	public abstract List<T> getList(String sqlId, Object params);
//
//}