<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="clbus" uri="/WEB-INF/struts-tony.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<HTML>
   <HEAD>
      <TITLE>FusionCharts - Simple Column 3D Chart</TITLE>
<script type="text/javascript" src="FusionCharts/FusionCharts.js"></script>
<script type="text/javascript" src="resources/js/common/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="FusionCharts/FusionChartsExportComponent.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	
    $("#show").click(function(){
    	
    	showFusionCharts();
    });
    
    function showFusionCharts(){  
        var xmlData = "<chart palette='2' caption='按地市统计报表-不达标数' xAxisName='地市' yAxisName='' showToolTip='0' showValues='1'" +
                             "formatNumberScale='0' rotateNames='0' decimals='0' useRoundEdges='1' exportEnabled='1' exportAtClient='0' " +
                             "exportAction='download' exportFileName='MyFileName' exportCallback='FC_Exported'" +
                             "exportDialogMessage='正在导出，请稍候...' exportHandler='FCExporter'" +
                             "exportShowMenuItem='1'>" +
        "<set name='Jan' value='462' color='AFD8F8' />" +
        "<set name='Feb' value='857' color='F6BD0F' />" +
        "<set name='Mar' value='671' color='8BBA00' />" + "</chart>";
        var chart = new FusionCharts("FusionCharts/Charts/Column3D.swf", "myFusionExport", "450", "280", "0", "0");
        chart.setDataXML(xmlData);
        // 放置图表的DIV的ID
        chart.render("myFusion");
   } 
 });

// function FC_Exported(objRtn){
// 	if(objRtn.statusCode == "1"){
// 		alert("The chart was successfully saved on server. The file can be accessed from " + objRtn.fileName);
// 	} else {
// 		alert("The chart could not be saved on server. There was an error. Description : " + objRtn.statusMessage);
// 	}
// }

// function saveChart(){
// 	var chartObject = getChartFromId("myFusion");
// 	// chartToSave.saveAsImage();
// 	if(chartObject.hasRendered()){
// 		chartObject.exportChart();
// 	}
// }

// function printChart(){
// 	var chartToPrint = getChartFromId("myFusion");
// 	chartToPrint.print();
// }
</script>
   </HEAD>
   <BODY>
   <div id="myFusion" style="float: left;">FusionCharts will load here!</div>
   <input type="button" value="显示" id="show"/>
   <div style="margin: 10px 0; border: solid 2px #ccddff; height: 24px; vertical-align: middle;
           line-height: 24px;padding-top: 4px;">
           <a href="javascript:saveChart();">保存图片</a>&nbsp;&nbsp;
           <a href="javascript:printChart();">打印图片</a>&nbsp;&nbsp;
           <a href="javascript:void(0);" onclick="window.close();">关闭</a>
           </div>
   </BODY>
</HTML>
