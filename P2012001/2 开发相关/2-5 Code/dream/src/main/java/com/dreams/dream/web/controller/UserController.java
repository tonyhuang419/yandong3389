package com.dreams.dream.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.User;
import com.dreams.dream.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    
	@Autowired
	private UserService userService2;
	
	/**
	 * index
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		
		Criteria example = new Criteria();
		List<User> userList =  userService2.selectByExample(example);
		
		for (User user : userList) {
			System.out.println(user.getName());
			logger.debug(user.getPassword());
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
	public String create(){
//		return "forward:/order/add";
//		return "redirect:/index.jsp";
		logger.debug("test...create.........................");
		return "create";
	}
}
