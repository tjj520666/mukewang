var num ;
$(function () {
    var $phone = $("#jsPhone").text();
    var p = $phone.substring(0, 3);
    var d = $phone.substring(9, 11);
    var phone = p + "*****" + d;
    $("#jsPhone").text(phone);
    $("#header-avator").hover(function () {
        $(".g-user-card").css("visibility", "visible");
    });
    $(".g-user-card").mouseover(function () {
        $(this).css("visibility", "visible");
    });

    $(".g-user-card").mouseout(function () {
        $(this).css("visibility", "hidden");
    });
    $(".itemBox a").click(function () {
        var a = $(this).next().val();
        $(".moco-modal-overlay input").val("");
        var $body;
        var mocoHtml = $(".moco-modal-overlay").html();
        $(".moco-modal-overlay").html("");
        if (a == 2) {
            $body = "<div class='moco-modal-layer'" +
                " style='z-index: 901;visibility: visible;left: 521px;top: 242.5px;'>" +
                "                                            <div class='moco-modal-title'>" +
                "                                                <div><span>认证手机号码</span><a href='javascript:void(0)'" +
                "                                                                           class='moco-icon-close moco-modal-close js-modal-close'></a>" +
                "                                                </div>" +
                "                                            </div>" +
                "                                            <div class='moco-modal-inner'>" +
                "                                                <div class='moco-modal-dialog' style='display: block;'>" +
                "                                                    <div class='yanzheng-phone'>" +
                "                                                        <div class='keybox'>解绑后，您将无法再使用此手机号进行找回密码及登录相关操作。</div>" +
                "                                                        <div class='dialogBox yanZhengBox' style='width: 430px;'>" +
                "                                                            <div class='moco-form-group'><label for='inputEmail3'" +
                "                                                                                                class='moco-control-label'>已绑定手机号：</label>" +
                "                                                                <div class='moco-control-input'><span" +
                "                                                                        class='yanzheng-phone-text'>" + phone +"</span>" +
                "                                                                </div>" +
                "                                                            </div>" +
                "                                                            <div class='moco-form-group'><label for='inputEmail3'" +
                "                                                                                                class='moco-control-label'>请输入已绑定手机号：</label>" +
                "                                                                <div class='moco-control-input'><input" +
                "                                                                        data-callback='checkPhone'" +
                "                                                                        placeholder='请输入您的手机号'" +
                "                                                                        class='moco-form-control js-phoneNumber' id=''>" +
                "                                                                    <div class='moco-control-tip errorHint color_red'></div>" +
                "                                                                </div>" +
                "                                                            </div>" +
                "                                                            <div class='moco-form-group'><label for='inputEmail3'" +
                "                                                                                                class='moco-control-label'></label>" +
                "                                                                <div class='moco-control-input'><a" +
                "                                                                        href='javascript:void(0);'" +
                "                                                                        class='moco-btn moco-btn-normal js-modal-close'>取消</a>" +
                "                                                                    <a href='javascript:void(0);' onclick='Moco()'" +
                "                                                                       class='moco-btn moco-btn-blue js-phone-submit'>下一步</a>" +
                "                                                                    <p class='js-gerror tl g_error js-error'></p></div>" +
                "                                                            </div>" +
                "                                                        </div>" +
                "                                                    </div>" +
                "                                                </div>" +
                "                                            </div>" +
                "                                        </div>";
        } else if (a == 3) {
            $body = "<div class='moco-modal-layer' style='z-index: 901; visibility: visible; left: 524px; top: 207.5px; width: 488px; height: 339px;'>                    <div class='moco-modal-title'><div><span>修改密码</span><a href='javascript:void(0)' class='moco-icon-close moco-modal-close js-modal-close'></a></div></div>                    <div class='moco-modal-inner'><div class='moco-modal-dialog' style='display: block;'><div class='dialogBox tpl-changePwd' style='width: 430px;'>                        <div class='moco-form-group'>                <label for='inputEmail3' class='moco-control-label'>输入原始密码：</label>                <div class='moco-control-input'>                    <input type='password' placeholder='输入密码' class='moco-form-control js-prePwd' data-validate='require-password' id=''>                    <div class='moco-control-tip errorHint color_red'></div>                </div>            </div>            <div class='moco-form-group'>                <label for='inputEmail3' class='moco-control-label'>输入新密码：</label>                <div class='moco-control-input'>                    <input type='password' placeholder='输入密码' class='moco-form-control js-pwd' data-validate='require-password' id=''>                    <div class='moco-control-tip errorHint color_red'></div>                </div>            </div>            <div class='moco-form-group'>                <label for='inputEmail3' class='moco-control-label'>确认新密码：</label>                <div class='moco-control-input'>                    <input type='password' placeholder='再次输入密码' class='moco-form-control js-surPwd' data-validate='require-password' id=''>                    <div class='moco-control-tip errorHint color_red'></div>                </div>            </div>            <div class='moco-form-group'>                <label for='inputEmail3' class='moco-control-label'></label>                <div class='moco-control-input'>                    <a href='javascript:void(0);' class='moco-btn moco-btn-blue js-submit'>确定</a>                    <a href='javascript:void(0);' class='moco-btn moco-btn-normal js-modal-close'>取消</a>                    <a href='//www.imooc.com/user/newforgot' target='_blank'>找回密码</a>                    <p class='js-gerror g_error'></p>                </div>            </div>                    </div>    </div></div>            </div> <div class='moco-modal-blackout js-moco-modal-cancel' style='z-index: 900; opacity: 0.7; width: 1536px; height: 850px; display: block;'></div>"
        }
        $(".moco-modal-overlay").html($body);
        $(".moco-modal-overlay").css("display", "block");
        $(".moco-modal-blackout").css("display", "block");
        $(".moco-control-input a").on("click", function () {
            var a = $(this).text();
            if (a == "取消") {

                $(".moco-modal-overlay").css("display", "none");
                $(".moco-modal-blackout").css("display", "none");
            } else if (a == "下一步") {
                var yzPhone;
                var input = $(".moco-control-input input").val();
                var phone = $("#account").val();
                if (input == "" || phone != input) {
                    yzPhone = "你输入的手机号码错误！！";
                } else {
                    yzPhone = "";
                    /*$.post("/smsAmend",{"phone":phone},function(data){
                        if(){
<div class="moco-modal-title"><div><span>绑定手机</span><a href="javascript:void(0)" class="moco-icon-close moco-modal-close js-modal-close"></a></div></div>                    <div class="moco-modal-inner"><div class="moco-modal-dialog" style="display: block;"><div class="dialogBox tpl-changePhone" style="width: 430px;">                        <div class="moco-form-group">                <label for="inputEmail3" class="moco-control-label">手机号码：</label>                <div class="moco-control-input">                <div class="rlf-areacode js-code-btn">+<span>86</span><i class="imv2-arrow1_d"></i></div>                    <input placeholder="请输入您的手机号" class="moco-form-control moco-form-phone  js-phoneNumber1">                    <div class="moco-control-tip  color_red tips-error" data-error-hint="手机号输入错误">请输入手机号</div>                </div>            </div>             <div class="moco-form-group">                <label for="inputEmail3" class="moco-control-label">短信验证码：</label>                <div class="moco-control-input verify-wrap">                    <p class="js-getCode getCode js-timer pa active">短信接收</p>                    <p class="voicecode-send js-voicecode-send"><i class="imv2-vol_up"></i>语音接听</p>                    <input maxlength="4" placeholder="" class="moco-form-control js-phoneCode" data-validate="require-string" data-minlength="4" id="">                    <div class="moco-control-tip  color_red" data-error-hint="输入四位验证码"></div>                </div>            </div>            <div class="moco-form-group">                <label for="inputEmail3" class="moco-control-label"></label>                <div class="moco-control-input">                    <button class="moco-btn moco-btn-blue js-submit">'</button>                    <button class="moco-btn moco-btn-normal js-modal-close">取消</button>                    <p class="js-gerror g_error"></p>                </div>            </div>          <div class="setphone-areacode-box js-code-box">                <ul class="code-tab">                    <li class="curr js-code-tab">常用</li><li class="js-code-tab">A</li><li class="js-code-tab">B</li><li class="js-code-tab">C</li>                    <li class="js-code-tab">D</li><li class="js-code-tab">E</li><li class="js-code-tab">F</li><li class="js-code-tab">G</li>                    <li class="js-code-tab">H</li><li class="js-code-tab">J</li><li class="js-code-tab">K</li>                    <li class="js-code-tab">L</li><li class="js-code-tab">M</li><li class="js-code-tab">N</li>                    <li class="js-code-tab">P</li><li class="js-code-tab">R</li><li class="js-code-tab">S</li>                    <li class="js-code-tab">T</li><li class="js-code-tab">W</li>                    <li class="js-code-tab">X</li><li class="js-code-tab">Y</li><li class="js-code-tab">Z</li>                </ul>                <div class="code-title"><span>常用</span></div>                <div class="code-list nano">                    <ul class="nano-content js-code-list">                    </ul>                </div>          </div>        </div>	</div></div>

                        }
                    });*/
                    $(".moco-modal-layer").html("");
                    $(".moco-modal-layer").html("<div class='moco-modal-title'><div><span>绑定手机</span><a href='javascript:void(0)' class='moco-icon-close moco-modal-close js-modal-close'></a></div></div>                    <div class='moco-modal-inner'><div class='moco-modal-dialog' style='display: block;'><div class='dialogBox tpl-changePhone' style='width: 430px;'>                        <div class='moco-form-group'>                <label for='inputEmail3' class='moco-control-label'>手机号码：</label>                <div class='moco-control-input'>                <div class='rlf-areacode js-code-btn'>+<span>86</span><i class='imv2-arrow1_d'></i></div>                    <input placeholder='请输入您的手机号' class='moco-form-control moco-form-phone  js-phoneNumber1'>                    <div class='moco-control-tip  color_red tips-error' data-error-hint='手机号输入错误'>请输入手机号</div>                </div>            </div>             <div class='moco-form-group'>                <label for='inputEmail3' class='moco-control-label'>短信验证码：</label>                <div class='moco-control-input verify-wrap'>                    <a class='js-getCode getCode js-timer pa active' style='margin-left: 20px' id='dx' onclick='smsAmend()'>短信接收</a> <input maxlength='4' placeholder='' class='moco-form-control js-phoneCode' data-validate='require-string' data-minlength='4' id='smsPhone'>                    <div class='moco-control-tip  color_red' data-error-hint='输入四位验证码'></div>                </div>            </div>            <div class='moco-form-group'>                <label for='inputEmail3' class='moco-control-label'></label>                <div class='moco-control-input'>                    <button class='moco-btn moco-btn-blue js-submit'>确定</button>                    <button class='moco-btn moco-btn-normal js-modal-close'>取消</button>                    <p class='js-gerror g_error'></p>                </div>            </div>          <div class='setphone-areacode-box js-code-box'>                <ul class='code-tab'>                    <li class='curr js-code-tab'>常用</li><li class='js-code-tab'>A</li><li class='js-code-tab'>B</li><li class='js-code-tab'>C</li>                    <li class='js-code-tab'>D</li><li class='js-code-tab'>E</li><li class='js-code-tab'>F</li><li class='js-code-tab'>G</li>                    <li class='js-code-tab'>H</li><li class='js-code-tab'>J</li><li class='js-code-tab'>K</li>                    <li class='js-code-tab'>L</li><li class='js-code-tab'>M</li><li class='js-code-tab'>N</li>                    <li class='js-code-tab'>P</li><li class='js-code-tab'>R</li><li class='js-code-tab'>S</li>                    <li class='js-code-tab'>T</li><li class='js-code-tab'>W</li>                    <li class='js-code-tab'>X</li><li class='js-code-tab'>Y</li><li class='js-code-tab'>Z</li>                </ul>                <div class='code-title'><span>常用</span></div>                <div class='code-list nano'>                    <ul class='nano-content js-code-list'>                    </ul>                </div>          </div>        </div>\t</div></div>");
                }
                $(".moco-control-input p").text(yzPhone);
                $(".moco-control-input button").on("click",function(){
                    var button = $(this).text();
                    var yz = $.trim($("#smsPhone").val());
                    var phone = $(".moco-control-input input").val();
                    if(button == "取消"){
                        $(".moco-modal-overlay").css("display", "none");
                        $(".moco-modal-blackout").css("display", "none");
                    } else {
                        if(yz == num && yz != ""){
                            $("#dx").next().next().html("");
                            $.post("/upDatePhone",{"phone":phone},function(data){
                                if(data){
                                    alert("修改成功！");
                                    window.location.reload();
                                }else{
                                    alert("修改失败 ，刷新重试！");
                                }
                            });
                        } else {
                            $("#dx").next().next().html("请输入正确的四位验证码！");
                        }
                    }

                });
            } else if (a == "确定") {
                var password;
                var newPassword;
                var newPassword2;
                var pattern = /^[a-z0-9_-]{6,18}$/;
                var pwd = false;
                $("input[type=password]").each(function (index, item) {
                    if (index == 0) {
                        password = $(this).val();
                        if (password == "" || !pattern.test(password)) {
                            $(this).next().html("请输入6-16位密码,区分大小写,必须包含字母,不能用空格！");
                            pwd = false;
                        } else {
                            pwd = true;
                        }

                    } else if (index == 1) {
                        newPassword = $(this).val();
                        if (newPassword == "" || !pattern.test(newPassword)) {
                            $(this).next().html("请输入6-16位密码,区分大小写,必须包含字母,不能用空格！");
                            pwd = false;
                        } else {
                            pwd = true;
                        }
                    } else if (index == 2) {
                        newPassword2 = $(this).val();
                        if (newPassword2 != newPassword) {
                            $(this).next().html("两次密码不一致！！！");
                            pwd = false;
                        } else {
                            pwd = true;
                        }
                        if (pwd == true) {
                            $.post("/changePassword", {
                                "password": password,
                                "newPassword": newPassword
                            }, function (data) {
                                if (data) {
                                    alert("修改成功！");
                                    window.location.reload();
                                }
                            });
                        }
                    }
                });
            }
        });
        $("input[type=password]").on("blur", function () {
            var password = $(this).val();
            var pattern = /^[a-z0-9_-]{6,18}$/;
            var div;
            if (password == "" || !pattern.test(password)) {
                div = "请输入6-16位密码,区分大小写,必须包含字母,不能用空格！";
            } else {
                div = "";
                pwd = true;
            }
            $(this).next().html(div);
        });
    });

});
var body = $("body").html();

function smsAmend(){
    var phone = $(".moco-control-input input").val();
    $.post("/smsAmend",{"phone":phone},function(data){
        num = data;
        getRandomCode();
    });
    return false;
}

function Close() {
    $(".oplog-tip").slideUp("fast");
}
var time = 60;


function Confirm(){
    var from = $("#profile").serialize();

}

function onClose(){
    $(".moco-modal-overlay").css("display","none");
    $(".moco-modal-blackout").css("display","none");
}

function getRandomCode(){
    if(time == 0){
        time = 60;
        $("#dx").text("短信接收");
        return ;
    } else {
        time -- ;
        $("#dx").text(time+" 后可重发短信");
    }
    setTimeout(function(){
        getRandomCode();
    },1000);
}
