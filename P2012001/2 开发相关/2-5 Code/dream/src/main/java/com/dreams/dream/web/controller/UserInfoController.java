package com.dreams.dream.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserInfo;
import com.dreams.dream.service.UserInfoService;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    
	@Autowired
	private UserInfoService userInfoService;
	
	/**
	 * index
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		
		Criteria example = new Criteria();
		List<UserInfo> userList =  userInfoService.selectByExample(example);
		
		for (UserInfo user : userList) {
			System.out.println(user.getLoginPass());
			logger.debug(user.getLoginPass());
		}
		modelMap.put("userList", userList);
		logger.debug("test............................");
		return "create";
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/create")
	public ModelAndView create(HttpServletRequest request, HttpServletResponse response){
		
		String loginName = request.getParameter("loginName");
		String loginPass = request.getParameter("loginPass");
		String userMail = request.getParameter("userMail");
		String userName = request.getParameter("userName");
		
		UserInfo user = new UserInfo();
		user.setLoginName(loginName);
		user.setLoginPass(loginPass);
		user.setUserMail(userMail);
		user.setUserName(userName);
		
		userInfoService.insert(user);
		
		Criteria example = new Criteria();
		List<UserInfo> userList =  userInfoService.selectByExample(example);
		
		for (UserInfo user2 : userList) {
			System.out.println(user2.getLoginPass());
			logger.debug(user2.getLoginPass());
		}
		request.setAttribute("userList", userList);
		
		logger.debug("test...create.........................");
		return new ModelAndView("index");
	}
}
