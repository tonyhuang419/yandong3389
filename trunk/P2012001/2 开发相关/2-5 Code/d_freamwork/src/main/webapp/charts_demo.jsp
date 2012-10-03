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
                 "exportAtClient" : '1' ,
                 "exportHandler" :'fcExporter1',
                 "exportAction" : 'download',
                 "exportTargetWindow" : '_self'
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
   </BODY>
</HTML>
