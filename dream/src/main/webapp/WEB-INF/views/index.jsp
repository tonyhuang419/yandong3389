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

<c:forEach items="${userList}" var="user">

    ${user.userId}<br/>
    ${user.loginName}<br/>
    ${user.loginPass}
 
</c:forEach>
       
       
       
</body>
</html>
