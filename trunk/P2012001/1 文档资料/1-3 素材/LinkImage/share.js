/*
 * share.js
 * Copyright(c) 2011 设计蜂巢
 * version: 1.0
 * Date: 2011-10-17 17:54:00
 * Description:分享内容到: 开心网 人人网  新浪微博 百度空间 腾讯微博 QQ空间 腾讯朋友 网易微博 搜狐微博 facebook twitter
 * Blog: http://www.hujuntao.com/
 * Update: http://code.google.com/p/hujuntao/
 */
(function () {
	var share = {
		version: "1.0",
		url: function () {
			return encodeURIComponent(location.href)
		},
		title: function () {
			return encodeURIComponent(document.title)
		},
		css : true,
		appkey: {
			tsina: "3180533776",
			tqq: "e41eabc53545472187feaafda012b119",
			tsohu: "km0agk1oGfAP32JCk9KZ"
		},
		base: ["qzone,QQ\u7a7a\u95f4,http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey", "tsina,\u65b0\u6d6a\u5fae\u535a,http://v.t.sina.com.cn/share/share.php", "baidu,\u767e\u5ea6\u7a7a\u95f4,http://apps.hi.baidu.com/share/", "renren,\u4eba\u4eba\u7f51,http://share.renren.com/share/buttonshare", "tqq,\u817e\u8baf\u5fae\u535a,http://v.t.qq.com/share/share.php", "kaixin,\u5f00\u5fc3\u7f51,http://www.kaixin001.com/repaste/share.php", "taobao,\u6dd8\u5b9d,http://share.jianghu.taobao.com/share/addShare.htm", "douban,\u8c46\u74e3,http://shuo.douban.com/!service/share", "xianguo,\u9c9c\u679c,http://xianguo.com/service/submitdigg/", "tsohu,\u641c\u72d0\u5fae\u535a,http://t.sohu.com/third/post.jsp", "t163,\u7f51\u6613\u5fae\u535a,http://t.163.com/article/user/checkLogin.do", "pengyou,\u817e\u8baf\u670b\u53cb,http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey", "feixin,\u98de\u4fe1,http://space.feixin.10086.cn/api/share", "facebook,Facebook,https://www.facebook.com/sharer/sharer.php", "twitter,Twitter,https://twitter.com/intent/tweet"],
		id: "share",
		list: function (d) {
			var e = d.split(","),
				f = e[1],
				g = e[2],
				h = e[0]
			switch (h) {
			case "tsina":
				g = g + "?appkey=" + this.appkey.tsina + "&url=" + this.url();
				break;
			case "tqq":
				g = g + "?appkey=" + this.appkey.tqq + "&url=" + this.url() + "&title=" + this.title();
				break;
			case "qzone":
				g = g + "?url=" + this.url() + "&title=" + this.title();
				break;
			case "renren":
				g = g + "?link=" + this.url() + "&title=" + this.title();
				break;
			case "kaixin":
				g = g + "?rurl=" + this.url() + "&rtitle=" + this.title();
				break;
			case "baidu":
				g = g + "?url=" + this.url() + "&title=" + this.title();
				break;
			case "taobao":
				g = g + "?url=" + this.url();
				break;
			case "douban":
				g = g + "?href=" + this.url() + "&name=" + this.title();
				break;
			case "xianguo":
				g = g + "?link=" + this.url() + "&title=" + this.title();
				break;
			case "tsohu":
				g = g + "?appkey=" + this.appkey.tsohu + "&url=" + this.url() + "&title=" + this.title() + "&content=utf-8";
				break;
			case "t163":
				g = g + "?info=" + this.title() + this.url();
				break;
			case "pengyou":
				g = g + "?to=pengyou&url=" + this.url() + "&title=" + this.title();
				break;
			case "facebook":
				g = g + "?u=" + this.url();
				break;
			case "twitter":
				g = g + "?url=" + this.url() + "&text=" + this.title();
				break;
			case "feixin":
				g = g + "?url=" + this.url() + "&title=" + this.title();
				break;
			}
			return {
				name: f,
				url: g,
				cls: h
			}
		},
		addCss : function(){
			if(this.css){
				var a,b
				a=document.getElementsByTagName("head")[0];
				b=document.createElement("link") 
    b.rel = "stylesheet";
    b.type = "text/css";
    b.href = "share.css"; 
    a.appendChild(b); 
			}
		},
		init: function () {
			var a = this.base.length,
				b = [],
				c = inner = "",
				e;
			while (a--) {
				c = this.list(this.base[a]),

				b.push('<a href="' + c.url + '" class="' + c.cls + '" title="\u5206\u4eab\u5230' + c.name + '" target="_blank">' + c.name + '</a>');
			}
			inner = b.reverse().join("");
			e = document.getElementById(this.id);
			e && (e.innerHTML = inner,this.addCss());
		}
	}
	share.init();
})();