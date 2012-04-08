<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
</head>
<body>
<form method="get" action="/user/create">
    <table>
        <tr>
            <td>userName:</td>
            <td><input type="text" name="userName" value=""/></td>
        </tr>
        <tr>
            <td>loginName:</td>
            <td><input type="text" name="loginName" value=""/></td>
        </tr>
        <tr>
           <td> loginPass: </td>
            <td><input type="text" name="loginPass" value=""/></td>
        </tr>
        <tr>
           <td> loginMail: </td>
            <td><input type="text" name="userMail" value=""/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Add User"></td>
        </tr>
        <tr><td colspan="2" align="center">
            <c:if test="${!empty message}">
            <c:out value="${message}"/>
            </c:if></td></tr> 
        <tr><td colspan="2" align="center"><a href="greet">Greet a user!</a></td></tr>
    </table>
</form>

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