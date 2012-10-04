<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="clbus" uri="/WEB-INF/struts-tony.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<HTML>
   <HEAD>
      <TITLE>FusionCharts - Simple Column 3D Chart</TITLE>
<script type="text/javascript" src="FusionCharts/FusionCharts.js"></script>
<script type="text/javascript" src="resources/js/common/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="FusionCharts/FusionCharts.jqueryplugin.js"></script>

<script type="text/javascript">
$(document).ready(function(){
    $("#chartContainer1").insertFusionCharts({
         swfUrl: "FusionCharts/Charts/Line.swf",
         exportEnabled : 1,
         exportShowMenuItem : 1,
         dataSource: {
             "chart": 
             {
                 "caption" : "Weekly Sales Summary" ,
                 "xAxisName" : "Week",
                 "yAxisName" : "Sales",
                 "numberPrefix" : "$",
                 "exportEnabled" : '1' ,

                 // 导出图片及PDF设置(可选参数)
                 // download:客户端下载 save:服务端保存
                 "exportAction" : 'save',
                 "exportFileName" : 'MyFileName',
                 "exportCallback" : 'FC_Exported',
                 "exportDialogMessage" : '正在导出，请稍候...',
                 "exportHandler" : 'FCExporter',
                 "exportShowMenuItem" : '1'
	       },
	               
	       "data" : 
	        [
	                 { "label" : "Week 1", "value" : "14400" },
	                 { "label" : "Week 2", "value" : "19600" },
	                 { "label" : "Week 3", "value" : "24000" },
	                 { "label" : "Week 4", "value" : "15700" }
	        ]
       }, 
         dataFormat: "json", 
         width: "400", 
         height: "300", 
         id: "myChartId"
   }); 
    $("#chartContainer2").insertFusionCharts({
     swfUrl: "FusionCharts/Charts/Pie3D.swf", 
     dataSource: {
         "chart": 
         {
             "caption" : "Weekly Sales Summary" ,
             "xAxisName" : "Week",
             "yAxisName" : "Sales",
             "numberPrefix" : "$"
       },
               
       "data" : 
        [
                 { "label" : "Week 1", "value" : "14400" },
                 { "label" : "Week 2", "value" : "19600" },
                 { "label" : "Week 3", "value" : "24000" },
                 { "label" : "Week 4", "value" : "15700" }
        ]
   }, 
     dataFormat: "json", 
     width: "400", 
     height: "300", 
     id: "myChartId"
}); 
    $("#chartContainer3").insertFusionCharts({
     swfUrl: "FusionCharts/Charts/Column3D.swf", 
     dataSource: {
         "chart": 
         {
             "caption" : "Weekly Sales Summary" ,
             "xAxisName" : "Week",
             "yAxisName" : "Sales",
             "numberPrefix" : "$"
       },
               
       "data" : 
        [
                 { "label" : "Week 1", "value" : "14400" },
                 { "label" : "Week 2", "value" : "19600" },
                 { "label" : "Week 3", "value" : "24000" },
                 { "label" : "Week 4", "value" : "15700" }
        ]
   }, 
     dataFormat: "json", 
     width: "400", 
     height: "300", 
     id: "myChartId"
}); 

    $("#chartContainer4").insertFusionCharts({
        swfUrl: "FusionCharts/Charts/MSColumn3D.swf", 
        dataSource: {
            "chart": {
                "caption": "Country-wise Sales Comparison",
                "subcaption": "(Right-click to see the export modes available)",
                "showvalues": "0",
                "exportenabled": "1",
                "exportatclient": "1",
                "exporthandler": "fcExporter1"
            },
            "categories": [
                {
                    "category": [
                        {
                            "label": "Austria"
                        },
                        {
                            "label": "Brazil"
                        },
                        {
                            "label": "France"
                        },
                        {
                            "label": "Germany"
                        },
                        {
                            "label": "USA"
                        }
                    ]
                }
            ],
            "dataset": [
                {
                    "seriesname": "2009",
                    "data": [
                        {
                            "value": "25601.34"
                        },
                        {
                            "value": "20148.82"
                        },
                        {
                            "value": "17372.76"
                        },
                        {
                            "value": "35407.15"
                        },
                        {
                            "value": "38105.68"
                        }
                    ]
                },
                {
                    "seriesname": "2010",
                    "data": [
                        {
                            "value": "57401.85"
                        },
                        {
                            "value": "41941.19"
                        },
                        {
                            "value": "45263.37"
                        },
                        {
                            "value": "117320.16"
                        },
                        {
                            "value": "114845.27"
                        }
                    ]
                },
                {
                    "seriesname": "2011",
                    "data": [
                        {
                            "value": "45000.65"
                        },
                        {
                            "value": "44835.76"
                        },
                        {
                            "value": "18722.18"
                        },
                        {
                            "value": "77557.31"
                        },
                        {
                            "value": "92633.68"
                        }
                    ]
                }
            ]
        }, 
        dataFormat: "json", 
        width: "400", 
        height: "300", 
        id: "myChartId"
   }); 

    $("#chartContainer5").insertFusionCharts({
        swfUrl: "FusionCharts/Charts/MSLine.swf", 
        dataSource: {
            "chart": {
                "caption": "Country-wise Sales Comparison",
                "subcaption": "(Right-click to see the export modes available)",
                "showvalues": "0",
                "exportenabled": "1",
                "exportatclient": "1",
                "exporthandler": "fcExporter1"
            },
            "categories": [
                {
                    "category": [
                        {
                            "label": "Austria"
                        },
                        {
                            "label": "Brazil"
                        },
                        {
                            "label": "France"
                        },
                        {
                            "label": "Germany"
                        },
                        {
                            "label": "USA"
                        }
                    ]
                }
            ],
            "dataset": [
                {
                    "seriesname": "2009",
                    "data": [
                        {
                            "value": "25601.34"
                        },
                        {
                            "value": "20148.82"
                        },
                        {
                            "value": "17372.76"
                        },
                        {
                            "value": "35407.15"
                        },
                        {
                            "value": "38105.68"
                        }
                    ]
                },
                {
                    "seriesname": "2010",
                    "data": [
                        {
                            "value": "57401.85"
                        },
                        {
                            "value": "41941.19"
                        },
                        {
                            "value": "45263.37"
                        },
                        {
                            "value": "117320.16"
                        },
                        {
                            "value": "114845.27"
                        }
                    ]
                },
                {
                    "seriesname": "2011",
                    "data": [
                        {
                            "value": "45000.65"
                        },
                        {
                            "value": "44835.76"
                        },
                        {
                            "value": "18722.18"
                        },
                        {
                            "value": "77557.31"
                        },
                        {
                            "value": "92633.68"
                        }
                    ]
                }
            ]
        }, 
        dataFormat: "json", 
        width: "400", 
        height: "300", 
        id: "myChartId"
   }); 
    
    $("#chartContainer6").insertFusionCharts({
        swfUrl: "FusionCharts/Charts/MSCombi3D.swf", 
        dataSource: {
            "chart": {
                "caption": "Country-wise Sales Comparison",
                "subcaption": "(Right-click to see the export modes available)",
                "showvalues": "0",
                "exportenabled": "1",
                "exportatclient": "1",
                "exporthandler": "fcExporter1"
            },
            "categories": [
                {
                    "category": [
                        {
                            "label": "Austria"
                        },
                        {
                            "label": "Brazil"
                        },
                        {
                            "label": "France"
                        },
                        {
                            "label": "Germany"
                        },
                        {
                            "label": "USA"
                        }
                    ]
                }
            ],
            "dataset": [
                {
                    "seriesname": "2009",
                    "data": [
                        {
                            "value": "25601.34"
                        },
                        {
                            "value": "20148.82"
                        },
                        {
                            "value": "17372.76"
                        },
                        {
                            "value": "35407.15"
                        },
                        {
                            "value": "38105.68"
                        }
                    ]
                },
                {
                    "seriesname": "2010",
                    "data": [
                        {
                            "value": "57401.85"
                        },
                        {
                            "value": "41941.19"
                        },
                        {
                            "value": "45263.37"
                        },
                        {
                            "value": "117320.16"
                        },
                        {
                            "value": "114845.27"
                        }
                    ]
                },
                {
                    "seriesname": "2011",
                    "data": [
                        {
                            "value": "45000.65"
                        },
                        {
                            "value": "44835.76"
                        },
                        {
                            "value": "18722.18"
                        },
                        {
                            "value": "77557.31"
                        },
                        {
                            "value": "92633.68"
                        }
                    ]
                }
            ]
        }, 
        dataFormat: "json", 
        width: "400", 
        height: "300", 
        id: "myChartId"
   }); 
    
    $("#show").click(function(){
    	
    	showFusionCharts();
    });
    
    function showFusionCharts(){  
        var xmlData = "<chart palette='2' caption='按地市统计报表-不达标数' xAxisName='地市' yAxisName='' showToolTip='0' showValues='1'" +
                             "formatNumberScale='0' rotateNames='0' decimals='0' useRoundEdges='1' exportEnabled='1' exportAtClient='0' exportAction='save' exportFileName='weeksnotsucced'" +
                             "exportDialogMessage='正在导出，请稍候...' exportHandler='http://localhost/d_freamwork/FusionCharts/ExportHandlers/FCExporter_PDF.jsp'" +
                             "exportShowMenuItem='1'>" +
        "<set name='Jan' value='462' color='AFD8F8' />" +
        "<set name='Feb' value='857' color='F6BD0F' />" +
        "<set name='Mar' value='671' color='8BBA00' />" + "</chart>";  
        var chart = new FusionCharts("FusionCharts/Charts/Column3D.swf", "myFusionExport", "450", "280", "0", "0");  
        chart.setDataXML(xmlData);  
        chart.render("myFusion");  //放置图表的DIV的ID  
   } 
    
 });
</script>
   </HEAD>
   <BODY>
   <div id="chartContainer1" style="float: left;">FusionCharts 将加载显示到这里!</div> 
      <div id="chartContainer2" style="float: left;">FusionCharts 将加载显示到这里!</div> 
         <div id="chartContainer3" style="float: left;">FusionCharts 将加载显示到这里!</div> 
         <div id="chartContainer4" style="float: left;">FusionCharts 将加载显示到这里!</div> 
         <div id="chartContainer5" style="float: left;">FusionCharts 将加载显示到这里!</div> 
         <div id="chartContainer6" style="float: left;">FusionCharts 将加载显示到这里!</div> 
         <div id="myFusion" style="float: left;">myFusion</div>
         <input type="button" style="float: left;" id="show" value="显示" />
   </BODY>
</HTML>
