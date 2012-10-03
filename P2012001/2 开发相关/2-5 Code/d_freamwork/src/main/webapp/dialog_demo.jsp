<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="clbus" uri="/WEB-INF/struts-tony.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
	<head>
<title>弹出层演示</title>

    <link href="resources/js/common/showDialog/showDialog.css" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="resources/js/common/jquery-1.6.2.min.js"></script>
	<script type="text/javascript" src="resources/js/common/showDialog/showDialog.js"></script>
	<script type="text/javascript">
	    $(function(){
	    	
	    	$("#test_btn").click(function(){
	    		
	    		// 四个参数
	    		// 1 标题 
	    		// 2 内容
	    		// 3宽度
	    		// 4距画面顶部高度(可选参数,默认160)
	    		showMessageBox("测试标题", "内容xxxxxxxxxxxxxxxxxxxxx", 400);
	    		
	    		// 关闭窗口方法
	    		// closeWindow();
	    		
	    	});
	    });
	  
	</script>
<body>

<input type="button" id="test_btn" value="弹出层"/>
    

</body>
</html>