<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
	<head>
	<title>test</title>
	<script type="text/javascript" src="resources/js/common/jquery-1.6.2.min.js"></script>
	<script type="text/javascript" src="resources/js/common/jquery.form.js"></script>
	<script type="text/javascript">
		$(function(){
			
			$("#updata_btn").click(function(){
				
				$("#myform").attr("action", "HelloAction_updata.action");
				$("#myform").submit();
			});
			
			$("#search_btn").click(function(){
				window.location.href = "HelloAction_toIndex.action";
			});
		});	
	
	</script>
	</head>
	<body>
		hello
		<form id="myform" action="HelloAction_insert.action" method="post">
			FIELD_ID：<input name="baseFields.fieldId" value="${baseFields.fieldId}" ${baseFields != null ? 'readonly="readonly"' :''} /><br/>
			FIELD：<input name="baseFields.field" value="${baseFields.field}"/><br/>
			FIELD_NAME：<input name="baseFields.fieldName" value="${baseFields.fieldName}"/><br/>
			VALUE_FIELD：<input name="baseFields.valueField" value="${baseFields.valueField}"/><br/>
			DISPLAY_FIELD：<input name="baseFields.displayField" value="${baseFields.displayField}"/><br/>
			ENABLED：<input name="baseFields.enabled" value="${baseFields.enabled}"/><br/>
			SORT：<input name="baseFields.sort" value="${baseFields.sort}"/><br/>
			<input type="submit" ${baseFields != null ? 'disabled="disabled"' :''}  value="新增数据"/>&nbsp;<input type="button" ${baseFields == null ? 'disabled="disabled"' :''} id="updata_btn" value="保存修改"/>
		</form>
	
		<b>Data List</b><input type="button" id="search_btn" value="查询所有"/>
		
		<a href="HelloAction_toIndex.action?currentPage=1">第一页</a>
		<a href="HelloAction_toIndex.action?currentPage=2">第二页</a>
		<a href="HelloAction_toIndex.action?currentPage=3">第三页</a>
		<a href="HelloAction_toIndex.action?currentPage=4">第四页</a>
		
		<table border="1">
			<tr>
				<td>FIELD_ID</td>
				<td>FIELD</td>
				<td>FIELD_NAME</td>
				<td>VALUE_FIELD</td>
				<td>DISPLAY_FIELD</td>
				<td>ENABLED</td>
				<td>SORT</td>
				<td></td>
			</tr>
			<c:forEach items="${baseFieldsList}" var="field" varStatus="status">
				<tr>
					<td>${field.fieldId}</td>
					<td>${field.field}</td>
					<td>${field.fieldName}</td>
					<td>${field.valueField}</td>
					<td>${field.displayField}</td>
					<td>${field.enabled}</td>
					<td>${field.sort}</td>
					<td>
					<a href="HelloAction_toUpdata.action?pkid=${field.fieldId}">修改</a>&nbsp;
					<a href="HelloAction_delete.action?pkid=${field.fieldId}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
