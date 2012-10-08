<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>test</title>
</head>
<body>
<form action="PagerAction_findList.action">
<input type="submit" value="查询" />
</form>
	<!-- 列表数据栏 -->
	<c:if test="${!empty pm.datas}">
		<!-- 这里就是要显示的数据了 -->
		<table border="1">
		    <tr>
		        <td>主键</td>
		        <td>领域ID</td>
		        <td>领域名称</td>
		        <td>录制人</td>
		        <td>录制时间</td>
		    </tr>
		    <c:forEach items="${pm.datas}" var="pojo">
		        <tr>
			        <td>${pojo.pkId}</td>
			        <td>${pojo.domainId}</td>
			        <td>${pojo.domainName}</td>
			        <td>${pojo.makeEmp}</td>
			        <td>${pojo.makeDate}</td>
		   		</tr>
		    </c:forEach>
		</table>
		
	</c:if>
	<!-- 在列表数据为空的时候，要显示的提示信息 -->
	<c:if test="${empty pm.datas}">
		<tr>
			<td colspan="7">没有找到相应的记录</td>
		</tr>
	</c:if>

	<TABLE width="778" border=0 align=center cellPadding=0 cellSpacing=0
		borderColor=#ffffff style="FONT-SIZE: 10pt">
		<TBODY>
			<TR>
				<TD height=28 align=center vAlign=center noWrap>
					<!-- 可以在这里插入分页导航条 -->
					 <pg:pager url="PagerAction_findList.action" maxIndexPages="5" maxPageItems="${pm.perpage }" 
						items="${pm.total }" export="currentPageNumber=pageNumber">
						<pg:first>
							<a href="${pageUrl}">[首页]</a>
						</pg:first>
						<pg:prev>
							<a href="${pageUrl}">前一页</a>
						</pg:prev>
						<pg:pages>
							<c:choose>
								<c:when test="${pageNumber eq currentPageNumber }">
									<font color="red">${pageNumber }</font>
								</c:when>
								<c:otherwise>
									<a href="${pageUrl }">${pageNumber}</a>
								</c:otherwise>
							</c:choose>
						</pg:pages>
						<pg:next>
							<a href="${pageUrl}">下一页</a>
						</pg:next>
						<pg:last>
							<a href="${pageUrl}">[尾页]</a>
						</pg:last>
					</pg:pager>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</body>
</html>
