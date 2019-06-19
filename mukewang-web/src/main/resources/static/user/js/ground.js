$(function(){

   $(".common-title a").click(function(){
      $(".moco-modal-overlay").css("display","block");
      $(".moco-modal-blackout").css("display","block");
   });

   $(".moco-control-input a").click(function(){
       var a = $(this).text();
       if(a == "取消"){
           $(".moco-modal-overlay").css("display","none");
           $(".moco-modal-blackout").css("display","none");
       }

   });
   $("#nick").blur(function(){
       if($(this).val() == ""){
           $(this).next().text("请输入正确的昵称！！");
       }else{
           $(this).next().text("");
       }
   });
    $("#profile-submit").click(function(){
        var userName = $("#nick").val();
        if(userName != ""){
            var form = $("#profile").serialize();
            $.post("/upDateUser",form,function(data){
                if(data){
                    alert("修改成功！");
                    window.location.reload();
                }
            });
        }
    });

    $("#js-columall").click(function(){
       $("#js-columbd").css("display","block");
    });

    $("#js-columbd a").click(function(){
       var href = $(this).attr("href");
       location.href="/recentBrowseById?id="+href;
       return false;
    });

    /*$(":not(.tool-right)").click(function () {
        alert(2222);
        return false;
    });*/

    $(".show-btn a").click(function () {
        var did = $(this).next().next().val();
        var classId = $(this).next().val();
        location.href="/deleteRecently?did="+did+"&classId="+classId;
    });


    $(".add-btn").click(function(){
        $(".moco-modal-overlay").css("display","block");
        $(".moco-modal-blackout").css("display","block");
    });

    $("#province-select").change(function(){
        var id = $(this).val();
        $.post("/AddressInfoId",{"id":id},function(data){
            var option ="<option value='0'>市</option>" ;
            for(var i = 0 ; i<data.length ; i++){
                option +=" <option value='" + data[i].id + "'>" + data[i].name + "</option> ";
            }
            $("#city-select").html(option);
        });
    });
    $("#city-select").change(function () {
        var id = $(this).val();
        $.post("/AddressInfoId",{"id":id},function(data){
            var option ="<option value='0'>区县</option>" ;
            for(var i = 0 ; i<data.length ; i++){
                option +=" <option value='" + data[i].id + "'>" + data[i].name + "</option> ";
            }
            $("#area-select").html(option);
        });
    });

    $("#address-form input[name=name]").blur(function () {
        var name = $(this).val();
        var p ;
        if(name == "" || name.length > 25){
            p = "请输入长度在2到25之间的字符串";
        } else {
            p = "";
        }
        $(this).next().text();
    });

    $("#address-form input[name=phone]").blur(function () {
        var name = $(this).val();
        var p ;
        var pattern = /^1[34578]\d{9}$/;
        if(name == "" || !pattern.test(name)){
            p = "手机号格式错误";
        } else {
            p = "";
        }
        $(this).next().text();
    });

    $("#zipcode").blur(function () {
        var name = $(this).val();
        var p ;
        if(name == ""){
            p = "内容不能为空";
        } else {
            p = "";
        }
        $(this).next().text(p);
    });

    $("#submit").click(function(){
        var name = $("#name").val();
        var shen = $("#province-select").find("option:selected").text();
        var shi = $("#city-select").find("option:selected").text();
        var qu = $("#area-select").find("option:selected").text();
        var region = shen+shi+qu ;
        $("#address-form input[name=addressRegion]").val(region);
        var froms = $("#address-form").serialize();
        if(shen == "省" || shi == "市" || qu == "区县"){
            $("#area-select").next().next().text("请选择你所在的省市地区");
        } else {
            if(name != "" && name.length <= 25) {
                $("#name").next().text("");
                var pattern = /^1[34578]\d{9}$/;
                var phone = $("#phone").val();
                if(phone != "" && pattern.test(phone)){
                    $("#phone").next().text("");
                    if(zipcode != ""){
                        $("#zipcode").next().text("");
                        var subThis = $(this).text();
                        if (subThis == "修改") {
                            $.ajaxSettings.async = false;
                            $.post("/updateByAddress", froms, function (data) {
                                if (data) {
                                    alert("修改成功！");
                                    location.href = "/AddressInfoAll";
                                }
                            });
                        } else if (subThis == "保存") {
                            $.ajaxSettings.async = false;
                            $.post("/AddressAll", froms, function (data) {
                                if (data) {
                                    alert("增加成功！");
                                    location.href = "/AddressInfoAll";
                                }
                            });
                        }
                    }else{
                        $("#zipcode").next().text("格式不正确");
                    }
                }else{
                    $("#phone").next().text("请输入正确的手机号！！");
                }
            } else {
                $("#name").next().text("请输入正确的名称！！");
            }
        }
    });

    $(".modify-box span").click(function () {
        var span = $(this).text();
        if(span == "删除"){
            var id = $(this).next().val();
            alert(id);
            var is = window.confirm("是否删除？");
            if(is){
                 $.post("/addressDelete",{"id":id},function(data){
                     if(data){
                         alert("删除成功！");
                         location.href = "/AddressInfoAll";
                   }
                });
            }
        } else if(span == "修改"){
            var id = $(this).prev().val();
            $.post("/addressGetId",{"id":id},function(data){
                if(data != null){
                    $("#name").val(data.addressName);
                    $("#phone").val(data.addressPhone);
                    $("#addrdetail").val(data.addressSite);
                    $("#zipcode").val(data.addressPostcode);
                    $("#address-form input[name=addressId]").val(data.addressId);
                    $(".moco-modal-overlay").css("display","block");
                    $(".moco-modal-blackout").css("display","block");
                    $("#submit").text("修改");
                }
            });
        } else if(span == "设置为默认地址"){
            var id = $(this).prev().prev().val();
            var ioc = "normal-icon";
            var show = "normal-icon show";
            var $ioc = $(this);
            var $show = $(".show");
            $.post("/addressIsDefault",{"id":id},function(data){
                if(data){
                    location.href = "/AddressInfoAll";
                }
            })
        }

    });

    $(".right-title a").click(function () {
        $(".action").attr("class","");
        $(this).parent().attr("class","action");
    });


    $(".order-cancel").click(function () {
        var is = window.confirm("是否取消？");
        var id = $(this).next().val();
        var oid = $(this).next().next().val();
        if(is){
            $.post("/deleteOrder",{"id":id,"oid":oid},function (data) {
                if(data){
                    location.reload();
                }
            });
        }
    })
});

