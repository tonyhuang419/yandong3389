package com.rstco.frame.pub.security.dao;

import org.springframework.stereotype.Repository;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.security.entity.PubResources;
@Repository
public class PubResourcesDao extends HibernateDao<PubResources, String> {

}
