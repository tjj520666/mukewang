$(function(){
   $(".rlf-group a").click(function(){
        var close = $(this).text();
        if(close == "取消"){
            $(".moco-modal-overlay").css("display","none");
            $(".moco-modal-blackout").css("display","none");
        }
   }) ;
});