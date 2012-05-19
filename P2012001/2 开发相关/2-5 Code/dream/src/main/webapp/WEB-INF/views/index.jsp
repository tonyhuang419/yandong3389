<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>主页</title>
        <link rel="stylesheet" href="resources/css/main.css">
</head>
    
<body>
    	<header>
          <div class="wrap">
          	<div class="top-bar">
                <ul class="menu font-style">
                    <li><a href="index.html">LOGO</a></li>
                    <li><a href="index.html">主页</a></li>
                    <li><a href="javascrip:void(0)" >帖子</a></li>
                    <li><a href="javascrip:void(0)">会员</a></li>
                    <li><a href="javascrip:void(0)" >博客</a></li>
                    <li><a href="javascrip:void(0)" class="join-text-color">加入我们</a></li>
                </ul>
            </div>
            <div class="login-form">
                <form action="" method="post">
                    <input type="text" id="userName" name="userName" class="text-input" value="" placeholder="邮箱或用户名" required>	
                    <!--<span>用户名或电子邮件地址</span>-->
                   			
                    <input id="password" name="password" type="password" class="text-input" placeholder="密码" required>
                    <a href="javascrip:void(0)" class="submit"></a>
                    <div class="clear"></div>
                </form>
            </div>
            <div class="clear"></div> 
          </div>
        </header>
       
        <div class="front-container">
        	<div class="wrap" >
              <div class="content">
                <div class="join-area">
                	<a href="javascrip:void(0)"></a>
                </div>
                <div class="content-left">
                	<div class="share-content">
                        <div class="share-intro">
                        	<div class="user-img"></div>
                            <div class="text-area">
                            	<a href="javascrip:void(0)">Gennifer</a><span>的分享</span>
                                <a href="javascrip:void(0)">下一张>></a>
                            </div>
                        </div>
                        <div class="share-img"></div>
                        <p class="img-intro">
                        	寂静的巷子里穿梭光影，仿佛是捉不住的时间...
                            <a href="javascrip:void(0)">全部...</a>
                        </p>
                        
                        <div class="inspiration-info">
                            <div class="info-item">
                               分享时间:<a href="">2012-4-21</a>
                        	</div>
                            <div class="info-item">
                        		评论:<a href="">8</a>
                        	</div>
                            <div class="info-item">
                        		灵感:<a href="">8</a>
                        	</div>
                        </div>
                	</div>
                    <div class="share-to">
                    	<p>分享到：</p>
                    </div>
                </div>
                <div class="content-right">
                	<div class="inspiration-counter">
                    	<div class="counter-intro"></div>
                        <div class="counter"></div>
                    </div>
                    <div class="register">
                    	<div class="register-free"></div>
                        <div class="register-form">
                            
                            <form action="" method="post">
                            	<div class="register-input">
                            	<h3>加入寻找灵感之旅</h3>
                                <input type="text" id="registerUserName" name="registerUserName" class="text-input" value="" placeholder="用户名" required>	
                                <input type="text" id="registerEmail" name="registerEmail" class="text-input" value="" placeholder="邮箱" required>	
                                        
                                <input id="registerPassword" name="registerPassword" type="password" class="text-input" value="" placeholder="密码" required>
                            	</div>
                            
                                <div class="submit-div">
                                    <a href="javascrip:void(0)" class="submit"></a>
                                </div>
                            </form>
                    	</div>
                    </div>
                    
                    
                </div>
                <div class="clear"></div>
              </div>
              <footer>主页 | 关于我们 | 联系方式 | 使用条款 | 隐私政策 | Copyright2012</footer>
            </div>
        </div>
</body>
</html>
