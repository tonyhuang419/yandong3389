package com.rstco.frame.pub.security.dao;

import org.springframework.stereotype.Repository;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.security.entity.PubUsersRoles;

//用于标注数据访问组件 ，即DAO 组件
@Repository 
public class PubUsersRolesDao extends HibernateDao<PubUsersRoles, Long> {

}
