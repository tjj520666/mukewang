define("common/js/navsearch",["require"],function(){var o,a,n=function(a){""!=a?window.open("//www.imooc.com/search/?words="+encodeURIComponent(a)):(clearTimeout(o),$(".nav-search-input").focus())},c=function(o){for(var a=document.cookie,n=a.split("; "),c=0;c<n.length;c++){var e=n[c].split("=");if(e[0]==o)return decodeURIComponent(e[1])}return""},e=function(){$(".nav-search-box .history .history-box").html(""),$.ajax({type:"GET",url:"//www.imooc.com/index/searchhistory",dataType:"json",data:{apsid:a},success:function(o){if($("#common-input-search .nav-search-box").slideDown(100),0==o.result&&o.data.length>0){$(".nav-search-box .history").show();for(var a=0;a<o.data.length;a++){var n='<a href="javascript:void(0)" class="history-item js-history-search">'+o.data[a].word+"</a>";$(".nav-search-box .history .history-box").append(n)}}else $(".nav-search-box .history").hide()}})},t=function(){$("#common-input-search .history").hide(),$(".nav-search-box .history .history-box").html(""),$.ajax({type:"GET",url:"//www.imooc.com/search/history",dataType:"json",data:{del:1,apsid:a},success:function(o){1!=o.result&&$.prompt(o.msg||"通信错误，请稍后再试！",{icon:"error",time:1500})},error:function(o){$.prompt(o.msg||"通信错误，请稍后再试！",{icon:"error",time:1500})}})},r=function(){$.ajax({url:"//www.imooc.com/search/hotwords",type:"post",dataType:"json",success:function(o){if(0==o.result){$(".nav-search-box .hot").show(),$(".nav-search-box .hot .hot-box").html("");for(var a=0;a<o.data.length;a++){var n='<a href="javascript:void(0)" class="hot-item js-history-search">'+o.data[a]+"</a>";$(".nav-search-box .hot .hot-box").append(n)}}}})};$("#common-nav-search").on("click",function(){$(this).hide(),$(".header-right .dist-money").hide(),$("#common-input-search").show().find("input").focus(),e()}),$("#common-input-search .nav-search-input").on("blur",function(){o=setTimeout(function(){$("#common-input-search").hide(),$("#common-input-search .nav-search-box").hide(),$("#common-input-search .nav-correlate-box").hide(),$("#common-input-search .nav-search-input").val(""),$("#common-nav-search").show(),$(".header-right .dist-money").show()},200)}),$("#common-input-search .nav-search-input").on("keyup",function(o){$(".nav-search-box").hide();var a=$(this).val();13==o.keyCode?n(a):$.ajax({url:"//www.imooc.com/search/correlate",type:"post",dataType:"json",data:{word:a},success:function(o){if(1==o.result){$("#common-input-search .correlate").html("");for(var a,n="",c=0;c<o.data.length;c++){var e=o.data[c];"course"==e.index?a="//www.imooc.com/learn/"+e.id:"shizhan_course"==e.index&&(a="//coding.imooc.com/class/"+e.id+".html"),"tbl_zy_plan"==e.type&&(a="//class.imooc.com/sc/"+e.id),n+='<a class="correlate-item" target="_blank" href="'+a+'">'+e.highlight+"</a>"}$("#common-input-search .correlate").append(n),$("#common-input-search .nav-correlate-box").slideDown(100)}}})}),$("#common-input-search .js-nav-searchBtn").on("click",function(){var o=$("#common-input-search .nav-search-input").val();n(o)}),$("#common-input-search").on("click",".js-history-search",function(){var o=$(this).html();n(o)}),$("#common-input-search").on("click",".js-clear-history",function(){clearTimeout(o),$("#common-input-search .nav-search-input").focus(),t()});var s=function(){a=c("apsid"),r()};s()});