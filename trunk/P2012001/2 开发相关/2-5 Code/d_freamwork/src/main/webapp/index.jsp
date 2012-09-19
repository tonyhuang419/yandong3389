<%@ page language="java" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="clbus" uri="/WEB-INF/struts-tony.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
hello

<table>
<tr>
<td>序号</td>
<td>字段名称</td>
</tr>
<c:forEach items="${baseFields}" var="field" varStatus="status">
<tr>
<td>${status.count}</td>
<td>${field.fieldName}</td>
</tr>
</c:forEach>
</table>
