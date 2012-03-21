// JavaScript Document
$(document).ready(function(){
	
	$(".top-menu").next().css("background-color","blue");
	
	$("p").next(".selected").css("background-color","yellow");
	
	var len = $("button").siblings().css("background-color", "red").length;
	$("#message").text("Unique siblings:" + len);
	
	$("button").click(function(){
		$(this).parent().slideUp("slow", function(){
			if ($("div:last").is(":hidden")) {
				$("div").slideDown("slow");
			}
		});
		$("#message").text($(this).text() + " completed!");
	})
	
	
	$("#clickDiv").css("border","1px solid red");
	$("#clickDiv").click(function() {
		$("#toggleImg").slideToggle("slow", function(){
			
		});
	})
	
	//$("li.item-a").parent().css("background-color","red");;
	
	//$("*",document.body).each(function(){
//		
//		// 获得body中各个元素紧邻父元素集合 $(this).parent()  由于parent集合只有一个元素，所以get(0)
//		var parentTag = $(this).parent().get(0).tagName;
//		$(this).prepend(document.createTextNode(parentTag + " >"));
//	})
	
	//$("*", document.body).each(function(){
//		var parentTag = $(this).parents();
//		if (parentTag.length == 5) {
//			alert($(this).text());
//		}
//	})
	
})