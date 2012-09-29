package com.rstco.frame.pub.security.dao;

import org.springframework.stereotype.Repository;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.security.entity.PubRoles;
@Repository
public class PubRolesDao extends HibernateDao<PubRoles, String> {

}
