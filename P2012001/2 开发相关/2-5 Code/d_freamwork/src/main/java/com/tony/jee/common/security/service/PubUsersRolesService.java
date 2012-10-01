package com.tony.jee.common.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubUsersRolesDao;
import com.rstco.frame.pub.security.entity.PubUsersRoles;

@Service
@Transactional
public class PubUsersRolesService extends DefaultEntityService<PubUsersRoles, Long> {
	@Autowired
	private PubUsersRolesDao pubUsersRolesDao;
	@Override
	protected PubUsersRolesDao getEntityDao()
	{
		return pubUsersRolesDao;
	}
}


