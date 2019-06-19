$(function () {
    var i=0;
    $("#ul").height($("#ul li").size()*150);
    $(".js-toggle-detai").click(function () {
       if (i==0){
           $("#ul").slideUp();
           i++;
       } else{
           $("#ul").slideDown();
           i=0;
       }
    })
})