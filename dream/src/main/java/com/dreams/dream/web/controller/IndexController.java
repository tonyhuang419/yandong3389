package com.dreams.dream.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dreams.dream.pojo.base.UserInfo;
import com.dreams.dream.service.UserInfoService;

@Controller
@RequestMapping("/index.htm")
public class IndexController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserInfoService userInfoService;
	
	/**
	 * index
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info("首页数据加载中..... ");
		
		List<UserInfo> userList = userInfoService.selectByExample(null);
		
		request.setAttribute("userList", userList);
		
		return new ModelAndView("index");
	}
}
