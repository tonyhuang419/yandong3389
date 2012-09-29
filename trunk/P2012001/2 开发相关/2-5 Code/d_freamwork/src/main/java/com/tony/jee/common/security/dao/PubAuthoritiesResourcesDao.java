package com.rstco.frame.pub.security.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.security.entity.PubAuthorities;
import com.rstco.frame.pub.security.entity.PubAuthoritiesResources;
import com.rstco.frame.pub.security.entity.PubResources;

@Repository
public class PubAuthoritiesResourcesDao extends HibernateDao<PubAuthoritiesResources, Long> {

	/*
	 * 取得权限数据
	 */
	public List<PubAuthorities> findAuthAll()
	{
		System.out.println("abc++++++++++++++aaa");
		String hql=" from  PubAuthorities auth " ;
		                                
		return this.find(hql);
		 
	}
	/*
	 * 依据权限，获得权限所能访问的资源文件
	 * */
	public List<PubResources> findResAllByauth(PubAuthorities auth,String type)
	{
		Object[] obj = null;
		obj[0]=auth;
		obj[1]=type;
		
		String hql="select res from PubAuthoritiesResources authres " +
				" inner join authres.pubResources res " +
				" where authres.pubAuthorities=? and res.type=? ";
		return this.find(hql,obj);
	}
	
}
