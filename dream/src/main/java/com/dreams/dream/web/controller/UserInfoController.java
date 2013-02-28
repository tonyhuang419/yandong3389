package com.dreams.dream.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dreams.dream.service.UserInfoService;

/**
 * 
 * @author Lawliet
 *
 */
public class UserInfoController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    UserInfoService userInfoService;
    
    
}
