package com.tony.jee.common.security.support;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rstco.frame.pub.security.dao.PubAuthoritiesResourcesDao;
import com.rstco.frame.pub.security.dao.PubUsersDao;
import com.rstco.frame.pub.security.entity.PubAuthorities;
import com.rstco.frame.pub.security.entity.PubAuthoritiesResources;

//你就可以从数据库中读入用户的密码，角色信息，是否锁定，账号是否过期
@Service
public class MyUserDetailService implements UserDetailsService  {
    @Autowired
    private PubUsersDao pubUsersDao;
    @Autowired
    private PubAuthoritiesResourcesDao pubAuthoritiesResourcesDao;
        
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException {
            
            Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();
            //取得用户的权限
            List<PubAuthorities> auth=pubUsersDao.findAuthByUserName(username);
            String password=null;
            //取得用户的密码
            password=pubUsersDao.findUserByname(username).get(0).getUserPassword();
            
            List<PubAuthoritiesResources> aaa=pubAuthoritiesResourcesDao.getAll();
            
            User user = new User(username,
                    password, true, true, true, true, auths);
            
            return user;
    }

}
