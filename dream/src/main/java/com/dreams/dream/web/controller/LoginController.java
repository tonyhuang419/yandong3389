package com.dreams.dream.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dreams.dream.service.UserInfoService;

/**
 * 登陆控制器
 * @author Lawliet
 *
 */
public class LoginController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    UserInfoService userInfoService;
    
    
    
    
}
