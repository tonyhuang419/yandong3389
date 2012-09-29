package com.rstco.frame.pub.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubAuthoritiesResourcesDao;
import com.rstco.frame.pub.security.entity.PubAuthoritiesResources;

@Service
@Transactional
public class PubAuthoritiesResourcesService extends DefaultEntityService<PubAuthoritiesResources, Long> {
	@Autowired
	private PubAuthoritiesResourcesDao pubAuthoritiesResourcesDao;
	
 	protected PubAuthoritiesResourcesDao getEntityDao() {
		// TODO Auto-generated method stub
		return pubAuthoritiesResourcesDao;
	}

}
