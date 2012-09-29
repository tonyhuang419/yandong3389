package com.rstco.frame.pub.security.service;

import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.modules.orm.Page;
import com.rstco.frame.modules.orm.PropertyFilter;
import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubUsersDao;
import com.rstco.frame.pub.security.entity.PubUsers;

@Service
@Transactional
public class PubUsersService extends DefaultEntityService< PubUsers,String> {
	@Autowired
	private  PubUsersDao   pubUsersDao;
	@Override
	protected  PubUsersDao getEntityDao(){
		return pubUsersDao;
	}
	/**
	 *  按用户安全级别查询用户
	 * @param page
	 * @param filters
	 * @param user
	 * @return
	 */
	public Page<PubUsers> searchWithSecLevel(final Page<PubUsers> page, final List<PropertyFilter> filters,PubUsers user){
//		PropertyFilter filter = 
//			new PropertyFilter("securityLevel",PropertyFilter.MatchType.GT,user.getSecurityLevel(),Integer.class);
		PropertyFilter filter=
			new PropertyFilter("securityLevel", PropertyFilter.MatchType.GT,user.getSecurityLevel(),Integer.class);
		filters.add(filter);
		return	this.search(page, filters);
	}
}
