package com.rstco.frame.pub.security.dao;

 
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.security.entity.PubAuthorities;
import com.rstco.frame.pub.security.entity.PubUsers;
@Repository
public class PubUsersDao extends HibernateDao<PubUsers, String> {
	
	/**
	 * 通过传入用户的用户名称，取得用户的权限（auths）信息
	 * @param username
	 * @return
	 */
	public List<PubAuthorities> findAuthByUserName(String username){
		   String hql = "select auth  from PubAuthorities auth" +
		   		" inner join auth.pubRolesAuthoritieses as role " +
        " inner join role.pubRoles as aa inner join aa.pubUsersRoleses bb  where  bb.pubUsers.userName=? ";
		   //inner join bb.pubUsers cc
		   System.out.print("++++++++++++++++++++++++++++++++++++++++++");
		return this.find(hql,username);
	}
	/*
	 *通过传入的用户名称，取得当前用户信息 
	 *  
	 *  */
	public List<PubUsers> findUserByname(String username)
	{
		String hql="select aa from PubUsers aa where aa.userName=?";
		return this.find(hql,username);
	}
}
