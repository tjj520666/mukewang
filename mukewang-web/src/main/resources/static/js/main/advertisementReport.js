!function(){var a=function(){var a={};a.adv_id=$(this).data("adver-id");var c=$(this).data("jump-url");$.ajax({type:"POST",url:"/course/ajaxadvclickcount",data:a,dataType:"json",success:function(){},error:function(a){}}),window.open(c)};$(".js-advertisement").on("click",function(){a.call(this)})}();