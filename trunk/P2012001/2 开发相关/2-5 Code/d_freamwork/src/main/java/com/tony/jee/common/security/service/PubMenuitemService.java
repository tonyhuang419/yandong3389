package com.tony.jee.common.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubAuthoritiesResourcesDao;
import com.rstco.frame.pub.security.dao.PubMenuitemDao;
import com.rstco.frame.pub.security.entity.PubMenuitem;

@Service
@Transactional
public class PubMenuitemService extends DefaultEntityService<PubMenuitem, String> {
	@Autowired
	private PubMenuitemDao pubMenuitemDao;
	@Override
 	protected PubMenuitemDao getEntityDao() {
		// TODO Auto-generated method stub
		return pubMenuitemDao;
	}
 
}
