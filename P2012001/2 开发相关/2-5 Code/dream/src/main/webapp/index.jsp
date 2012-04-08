<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
<form action="/user/create">


</form>


	<a href="user/index">查看用户列表</a>
	<br />
	<br />
	<br />
<table border="1">
<tr>
<td>ID</td>
<td>姓名</td>
<td>登陆名</td>
<td>登陆密码</td>
<td>注册邮箱</td>
</tr>
<c:forEach items="${userList}" var="user">
<tr>
<td>${user.userId}</td><td>${user.userName}</td><td>${user.loginName}</td><td>${user.loginPass}</td><td>${user.userMail}</td>
</tr>
</c:forEach>
</table>
</body>
</html>