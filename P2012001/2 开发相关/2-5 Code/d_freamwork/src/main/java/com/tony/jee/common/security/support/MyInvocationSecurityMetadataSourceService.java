package com.tony.jee.common.security.support;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.AntUrlPathMatcher;
import org.springframework.security.web.util.UrlMatcher;
import org.springframework.stereotype.Service;

import com.rstco.frame.modules.orm.hibernate.HibernateDao;
import com.rstco.frame.pub.security.dao.PubAuthoritiesResourcesDao;
import com.rstco.frame.pub.security.entity.PubAuthorities;
import com.rstco.frame.pub.security.entity.PubResources;

/*
 * 
 * 最核心的地方，就是提供某个资源对应的权限定义，即getAttributes方法返回的结果。
 * 注意，我例子中使用的是AntUrlPathMatcher这个path matcher来检查URL是否与资源定义匹配，
 * 事实上你还要用正则的方式来匹配，或者自己实现一个matcher。
 * 
 * 此类在初始化时，应该取到所有资源及其对应角色的定义
 * 
 * 说明：对于方法的spring注入，只能在方法和成员变量里注入，
 * 如果一个类要进行实例化的时候，不能注入对象和操作对象，
 * 所以在构造函数里不能进行操作注入的数据。
 */
@Service
public class MyInvocationSecurityMetadataSourceService  implements
        FilterInvocationSecurityMetadataSource {
    
    @Autowired
    private PubAuthoritiesResourcesDao pubAuthoritiesResourcesDao;

    private UrlMatcher urlMatcher = new AntUrlPathMatcher();
    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

    public MyInvocationSecurityMetadataSourceService() {
        loadResourceDefine();
    }

/*     private void loadResourceDefine() {
            resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
            Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
            ConfigAttribute ca = new SecurityConfig("ROLE_ADMIN");
            atts.add(ca);
            resourceMap.put("/index.jsp", atts);
            resourceMap.put("/i.jsp", atts);
        }*/
    
    private void loadResourceDefine() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
        
        Session session = sessionFactory.openSession();
        List<String> query=session.createSQLQuery("select authority_name from pub_authorities ").list();
        
        
        resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
        Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();

        //List<PubAuthorities> auths =session.createQuery(arg0); //pubAuthoritiesResourcesDao.findAuthAll();
         
        for (String auth : query) {
            ConfigAttribute ca = new SecurityConfig(auth);// "ROLE_ADMIN"
            // atts.add(ca);
            
            List<String> query1=session.createSQLQuery("select resource_string " +
                    "from Pub_Authorities_Resources,Pub_Resources,  Pub_authorities " +
                    "where Pub_Authorities_Resources.resource_id=Pub_Resources.resource_id and " +
                    " Pub_Authorities_Resources.resource_id=Pub_authorities.authority_id  and " +
                    "   Authority_name='"+auth+"'").list();
            
            for (String res : query1) {
                String url = res;
                // 判断资源文件和权限的对应关系，如果已经存在，要进行增加
                if (resourceMap.containsKey(url)) {
                    Collection<ConfigAttribute> value = resourceMap.get(url);
                    value.add(ca);
                    resourceMap.put(url, value);
                    // "log.jsp","role_user,role_admin"
                } else {
                    atts.add(ca);
                    resourceMap.put(url, atts);
                }
                 resourceMap.put(url, atts);
            }
        }
    }

    // According to a URL, Find out permission configuration of this URL.
    public Collection<ConfigAttribute> getAttributes(Object object)
            throws IllegalArgumentException {
        // guess object is a URL.
        String url = ((FilterInvocation) object).getRequestUrl();
        Iterator<String> ite = resourceMap.keySet().iterator();
        while (ite.hasNext()) {
            String resURL = ite.next();
            if (urlMatcher.pathMatchesUrl(url, resURL)) {
                return resourceMap.get(resURL);
            }
        }
        return null;
    }

    public boolean supports(Class<?> clazz) {
        return true;
    }

    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

}
