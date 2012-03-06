package com.dreams.dream.web.interseptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 验证用户登陆拦截器
 * 
 * @author
 * @date
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		// 如果session中没有user对象
		if (null == request.getSession().getAttribute("session_user")) {
			String requestedWith = request.getHeader("x-requested-with");
			// ajax请求
			if (requestedWith != null && "XMLHttpRequest".equals(requestedWith)) {
				response.setHeader("session-status", "timeout");
				response.getWriter().print("session_user");
			} else {
				// 普通页面请求
				response.sendRedirect(request.getContextPath() + "/");
			}
			return false;
		}
		return true;

	}

}
