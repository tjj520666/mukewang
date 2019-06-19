var $userphone ;
var $userPassword;
var yzm = false;
var phone = false;
var pwd = false;
var sms = false;
function myReload() {
    var CCC = document.getElementById("CreateCheckCode");
    CCC.src = CCC.src + "?nocache=" + new Date().getTime();
    CCC.setAttribute("val", new Date().getTime());
};
function submitForm(){
    var lorv = $("#log").val();
    if(lorv == "登录"){
        var form=$("#signup_form").serialize();
        if(phone){
            if(pwd) {
                    $.post("/loging", form, function (date) {
                        if (date == true) {
                            alert("登录成功！！！");
                            location.href = "/toMain";
                        } else {
                            alert("登录失败！！");
                        }
                    }, "json");
            }else{
                $("#pwd p").text("密码格式不正确！！");
            }
        } else {
            $("#eamil p").text("请输入正确的手机号！！！");
        }
    } else if(lorv == "注册"){
        var fxk = $("#auto-signin").is(':checked');
        $userphone = $("input[name=userPhone]").val();
        if(!phone){
            $("#eamil p").text("请输入正确的手机号！！！");
        }
        if(!fxk){
            $("#signin-globle-error").text("请选中勾选！");
        } else {
            $("#signin-globle-error").text("");
        }
        if(!yzm){
            $("#yzm p").text("请输入正确的验证码！！！");
        }
        if(yzm && phone && fxk){
            $("#yzm p").text("");
            $.post("/sms",{"phone": $userphone});
            var p = "<p class='title' style='text-align: center'>填写短信验证码密码完成注册</p>" +
                "<p class='subtitle' style='text-align: center'>短信验证码已发送至<span class='js-phoneNumber' data-code='+86' data-phone='"+ $userphone +"'>+86" + $userphone +"</span></p><br>";
            /*var $yzm =  $("#yzm input").val();*/
            alert("成功！");
            $("#loginSMS").hide();
            $("#eamil div").css("display","none");
            $("#fxk").css("display","none");
            $("#yzm").css("display","none");
            $("#pwd").css("display","block");
            $("#pwd2").css("display","block");
            $("#pwd input").attr("placeholder","6-16位密码,区分大小写,不能用空格");
            $("#eamil input").val("");
            $("#eamil input").attr("class","xa-emailOrPhone ipt ipt-email js-own-name");
            $("#eamil input").attr("placeholder","请输入短信验证码");
            $("#log").val("完成");
            $("#signup_form").prepend(p);
        }
    } else if(lorv == "完成"){
        if(sms && pwd){
            var pwd1 = $("#pwd input").val();
            var pwd2 = $("#pwd2 input").val();
            if(pwd1 == pwd2){
                $userPassword = pwd1;
                var num = $("#eamil input").val();
                $.post("/userAdd",{"userPhone":$userphone,"userPassword":$userPassword,"num":num},function (data) {
                    if(data == "注册成功！！"){
                        alert(data);
                        location.href="/toMain";
                    } else if(data == "注册失败！"){
                        alert( data);
                    } else if(data == "验证码错误！！！"){
                        $("#eamil p").text(data);
                    }
                },"text");
            }else{
                $("#pwd2 p").html("两次密码不一致");
            }
        } else {
            $("#pwd p").html("请输入正确的密码格式");
            $("#pwd2 p").html("请输入正确的密码格式");
            $("#eamil p").html("请输入正确的验证码格式")
        }
    } else if(lorv == "短信登录"){
        if(phone){
            var yzm3 = $("#yzm2 input[name=checkCode]").val();
            var yzm2 = $("#yzm2 input[name=loginyzm]").val();
            alert(yzm2);
            alert(yzm2);
            $("#eamil p").text("");
            if(yzm3 != "") {
                $("#yzm2 p").text("");
                if(yzm2 == yzm3){
                    $("#yzm2 p").text("");
                    var form=$("#eamil input").val();
                    $.post("/loginByPhone", {"phone":form}, function (date) {
                        if (date == true) {
                            alert("登录成功！！！");
                            location.href = "/toMain";
                        } else {
                            $("#eamil p").text("该手机号未注册，请先注册再登录！");
                        }
                    }, "json");
                }else{
                    $("#yzm2 p").text("验证码不正确！！");
                }
            }else{
                $("#yzm2 p").text("验证码格式不正确！！");
            }
        } else {
            $("#eamil p").text("请输入正确的手机号！！！");
        }
    }
}
var $loging = 0;
var $zhuce = 0;
$(function(){

    $("#pwd a").click(function(){
       var type = $("#pwd input").attr("type");
       var $type ;
       var $class ;
       var $src ;
       if(type == "password"){
           $type = "text";
           $class = "proclaim-btn js-proclaim is-pwd imv2-visibility";
           $src = "/img/find.png";
       } else if(type == "text"){
           $type = "password";
           $class = "proclaim-btn js-proclaim is-pwd imv2-visibility_off";
           $src = "/img/closefind.png";
       }
        $(this).attr("class",$class);
        $("#pwd input").attr("type",$type);
        $("#pwd a img").attr("src",$src);
    });

    $("#pwd2 a").click(function(){
        var type = $("#pwd2 input").attr("type");
        var $type ;
        var $class ;
        var $src ;
        if(type == "password"){
            $type = "text";
            $class = "proclaim-btn js-proclaim is-pwd imv2-visibility";
            $src = "/img/find.png";
        } else if(type == "text"){
            $type = "password";
            $class = "proclaim-btn js-proclaim is-pwd imv2-visibility_off";
            $src = "/img/closefind.png";
        }
        $(this).attr("class",$class);
        $("#pwd2 input").attr("type",$type);
        $("#pwd2 a img").attr("src",$src);
    });


    $("#yzm input").blur(function(){
        var $yzm = $.trim($(this).val());
        var p ;
        if( $yzm != "" && $yzm.length == 4){
            $.post("/verify",{"userYzm":$yzm},function(data){
                if(data == "true"){
                    yzm=true;
                }
            },"text");
        } else {
            yzm = false;
        }
        $("#yzm p").text(p);
    });
    $("#eamil input").blur(function(){
        var $phone = $.trim($(this).val());
        var $sms = $(this).attr("placeholder");
        var p ;
        var pattern = /^1[34578]\d{9}$/;
        if($sms == "请输入短信验证码"){
            var $sms2 = $.trim($(this).val());
            var pattern2 = /^[0-9]{4}$/;
            if($sms2 != "" && pattern2.test($sms2)){
                p="";
                sms = true;
            } else {
                p = "请输入正确的短信验证！！！";
            }
        } else {
            if($phone == "" || !pattern.test($phone)){
                p = "请输入正确的手机号！！！";
            } else {
                var log = $("#log").val();
                if(log == "注册"){
                    $.post("/findPhone",{"phone":$phone},function(data){
                        if(data == true){
                            p = "该手机已注册！！！";
                        } else {
                            p = "";
                            phone = true;
                        }
                        $("#eamil p").text(p);
                    },"json");
                }else{
                    p="";
                    phone = true;
                }

            }
        }
        $("#eamil p").text(p);
    });

    $("#pwd input").blur(function(){
        var $pwd = $.trim($(this).val());
        var p ;
        var pattern = 	/^[a-z0-9_-]{6,18}$/;
        var number = /^\d+$/;
        if($pwd == "" || !pattern.test($pwd) || number.test($pwd)){
            p = "请输入6-16位密码,区分大小写,必须包含字母,不能用空格！";
        } else {
            p = "";
            pwd = true;
        }
        $("#pwd p").text(p);
    });

    $("#pwd2 input").blur(function(){
        var $pwd = $.trim($(this).val());
        var p ;
        var pattern = 	/^[a-z0-9_-]{6,18}$/;
        var number = /^\d+$/;
        if($pwd == "" || !pattern.test($pwd) || number.test($pwd)){
            p = "请输入6-16位密码,区分大小写,必须包含字母,不能用空格！";
        } else {
            p = "";
            pwd = true;
        }
        $("#pwd2 p").text(p);
    });

    $(".rl-modal-header span").click(function(){
        var $rst = $(this).text();
        var $fxk ;
        var none = "none";
        var block = "block";
        $("#log").val("");
        var $l ;
        $("input").val("");
        if("注册" == $rst){
            $zhuce++;
            if($loging > 0){
                $loging = 0;
            }
            none = "block";
            block = "none";
            $fxk = "<input type='checkbox' class='auto-cbx' id='auto-signin'>同意<a href='#'>《慕课网注册协议》</a>";
            $("input[name=userPhone]").attr("class","ipt ipt-phone");
            $("#log").val("注册");
            $("#eamil input").attr("placeholder","请输入注册手机号");
        } else if ("登录" == $rst){
            $loging++;
            if($zhuce > 0){
                $zhuce = 0;
            }
            $("input[name=userPhone]").attr("class","xa-emailOrPhone ipt ipt-email js-own-name");
            $fxk = "<input type='checkbox' checked='checked' class='auto-cbx' id='auto-signin'>7天内自动登录";
            none = "none";
            block = "block";
            $("#log").val("登录");
            $("#eamil input").attr("placeholder","请输入登录手机号");
        }
        $("#eamil p").text("");
        $("#yzm2").hide();
        $("#pwd p").text("");
        $("#yzm p").text("");
        $("#fxk").css("display","block")
        $("#fxk a").css("display",block);
        $("#fxk label").html($fxk);
        $("#eamil div").css("display",none);
        $("#pwd").css("display",block);
        $("#yzm").css("display",none);
        var $active_titl; // = "active-title";
        var $xa_showSignup ; //= "xa-showSignup";
        if(!$zhuce >= 2 || $loging >= 2){
             $active_titl = "active-title";
             $xa_showSignup = "xa-showSignup";
        } else {
            $active_titl = "xa-showSignup";
            $xa_showSignup = "active-title";
        }
        $("#pwd2").css("display","none");
        $(this).attr("class",$xa_showSignup);
        $(this).siblings().attr("class",$active_titl);
        $(".title").remove();
        $(".subtitle").remove();
        phone = false;
        yzm = false;
        pwd = false;
        /*$(".active-title").attr("class",$active_titl);
        $(".xa-showSignup").attr("class","ree");
        alert($xa_showSignup);
        $(".ree").attr("class",$xa_showSignup);*/
        });
    $("#loginSMS").click(function(){
        var log = $("#log").val();

        if(log == "登录"){
            $("#pwd").hide();
            $("#yzm2").show();
            $("#log").val("短信登录");
            $(this).text("密码登录");
        } else if(log == "短信登录") {
            $("#pwd").show();
            $("#yzm2").hide();
            $("#log").val("登录");
            $(this).text("手机短信登录");
        }
    });

});

var time = 60;
function myYZM(){
    var phone = $("#eamil input").val();
    if(phone != ""){
        $("#eamil p").text("");
        if(time == 0){
            time = 60;
            $("#dx").text("获取验证码");
            $("#dxx").hide();
            return ;
        } else {
            time--;
            $("#dxx").text(time + " 后新重发");
            if (time == 59) {
                $("#dx").text("");
                $("#dxx").show();
                $.post("/smsYzm", {"phone": phone}, function (data) {
                    $("#yzm2 input[name=loginyzm]").val(data);
                    alert(data);
                });
            }
        }
        setTimeout(function(){
            myYZM();
        },1000);
    } else {
        $("#eamil p").text("请先输入手机号！！");
    }
}