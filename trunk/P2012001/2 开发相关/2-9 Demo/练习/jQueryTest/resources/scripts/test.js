// JavaScript Document
$(document).ready(function(){
	
	$("#go1").click(function(){
		$("#block1").animate({width: "500px"}, {queue: false, duration: 3000})
					.animate({fontSize: "24px"}, 1500)
					.animate({borderRightWidth: "15px"}, 1000);
	});
	
	$("#go2").click(function(){
		$("#block2").animate({width: "500px"}, 3000)
					.animate({fontSize: "24px"}, 1500)
					.animate({borderLeftWidth: "15px"}, 1000);
	});
	
	$("#go3").click(function(){
		$("#go1").add("#go2").click();
	});
	
	$("#go4").click(function(){
		$(".animateDivStyle").css({width: "", fontSize: "", borderWidth: ""});
	});
	
	$("#clickMe").click(function(){
		$("#animateImg").animate({opacity: 0.25, left: '+=50', height: 'toggle'}, 1000, function(){
			//Animate Complete callback function
		});
	});
	
	$("#stopBtn").click(function(){$("#animateImg").stop()});
	
	$(".top-menu").next().css("background-color","blue");
	
	$("p").next(".selected").css("background-color","yellow");
	
	//var len = $("button").siblings().css("background-color", "red").length;
//	$("#message").text("Unique siblings:" + len);
	
	//$("button").click(function(){
//		$(this).parent().slideUp("slow", function(){
//			if ($("div:last").is(":hidden")) {
//				$("div").slideDown("slow");
//			}
//		});
//		$("#message").text($(this).text() + " completed!");
//	});
	
	
	$("#clickDiv").css("border","1px solid red");
	$("#clickDiv").click(function() {
		$("#toggleImg").slideToggle("slow", function(){
			
		});
	});
	
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