package com.rstco.frame.pub.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubRolesDao;
import com.rstco.frame.pub.security.entity.PubRoles;
@Service
@Transactional
public class PubRolesService extends DefaultEntityService<PubRoles, String> {
	@Autowired
	private PubRolesDao pubRolesDao;

	@Override
	protected PubRolesDao getEntityDao() {
		// TODO Auto-generated method stub
		return pubRolesDao;
	}
	
	
}
