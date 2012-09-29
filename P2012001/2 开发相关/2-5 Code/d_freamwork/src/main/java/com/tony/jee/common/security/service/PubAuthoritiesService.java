package com.rstco.frame.pub.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubAuthoritiesDao;
import com.rstco.frame.pub.security.entity.PubAuthorities;
/**
 * 用户管理类.
 * 
 * 实现领域对象用户的所有业务管理函数.
 *  
 * 通过泛型声明继承EntityManager,默认拥有CRUD管理方法.
 * 使用Spring annotation定义事务管理.
 * 
 * @author calvin
 */
//Spring Service Bean的标识.
@Service
//默认将类中的所有函数纳入事务管理.
@Transactional
public class PubAuthoritiesService extends DefaultEntityService<PubAuthorities, String> {
	
	@Autowired
	private PubAuthoritiesDao pubAuthoritiesDao;
	
	@Override
	protected PubAuthoritiesDao getEntityDao() {
		// TODO Auto-generated method stub
		return pubAuthoritiesDao;
	}
	
	
}
