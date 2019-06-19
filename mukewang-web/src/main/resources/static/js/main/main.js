$(function () {
    // setInterval(time,1000)
    setTimeout(show,10);
    setTimeout(hide,3500);
    var left=0;
    $("#items .item").each(function () {
        $(this).css("left",left);
        left=left+390;
    })
    $(".showhide-search").click(function () {
        window.location="/search?name="+$(".search-input").val();
    })
})

function hide(){
    // $("[data-track='banner-1-1']").hide();
    // $("[data-track='banner-1-1'] .banner-slide").hide();
}
function show(){
    $("[data-track='banner-1-1']").show();
    $("[data-track='banner-1-1'] .banner-slide").show();
}