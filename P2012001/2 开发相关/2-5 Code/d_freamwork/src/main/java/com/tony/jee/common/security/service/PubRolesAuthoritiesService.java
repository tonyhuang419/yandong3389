package com.rstco.frame.pub.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubRolesAuthoritiesDao;
import com.rstco.frame.pub.security.entity.PubRolesAuthorities;

@Service
@Transactional
public class PubRolesAuthoritiesService extends DefaultEntityService<PubRolesAuthorities, Long> {
	
	@Autowired
	private PubRolesAuthoritiesDao pubRolesAuthoritiesDao;

	@Override
	protected PubRolesAuthoritiesDao getEntityDao() {
		// TODO Auto-generated method stub
		return pubRolesAuthoritiesDao;
	}
	
	
}
