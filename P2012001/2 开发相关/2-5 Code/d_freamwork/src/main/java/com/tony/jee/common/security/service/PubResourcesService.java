package com.tony.jee.common.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rstco.frame.modules.orm.Page;
import com.rstco.frame.modules.orm.PropertyFilter;
import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.common.service.DefaultEntityService;
import com.rstco.frame.pub.security.dao.PubResourcesDao;
import com.rstco.frame.pub.security.entity.PubResources;

@Service
@Transactional
public class PubResourcesService extends DefaultEntityService<PubResources, String> {

	@Autowired
	private PubResourcesDao pubResourcesDao;
	
	@Override
	protected PubResourcesDao getEntityDao() {
		// TODO Auto-generated method stub
		return pubResourcesDao;
	}
	
	/**
	 *  查找所有资源信息
	 * @param page
	 * @param filters
	 * @param user
	 * @return
	 */
	public Page<PubResources> searchAllResources(final Page<PubResources> page, final List<PropertyFilter> filters){
		PropertyFilter filter = 
			new PropertyFilter("enabled",PropertyFilter.MatchType.EQ,1,Integer.class);
		filters.add(filter);
		
		return	this.search(page, filters);
	}
	
	

}
