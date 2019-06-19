$(function () {
    $(":checkbox").prop("checked",true);
    $(".js-coures-num").text($(".price").size());
    sum();
    $("#quan").click(function () {
        $(".price").prop("checked",$(this).prop("checked"));
        sum();
    })
    $(".price").click(function () {
        $("#quan").prop("checked",$(":checkbox:gt(0)").filter(':not(:checked)').size()===0);
        sum();
    })

})
function sum(){
    var money=0;
    $.each( $(".price:checked"),function(){
        money+=parseFloat($(this).attr("value"));
    })
    $(".js-choice-num").text($(".price:checked").size());
    $(".jsAltogether").text(money);
}