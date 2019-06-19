define(["pay/cart/js/cart", "moco", "lib/jquery-mousewheel/jquery.scrollbar"], function (a) {
    window.Cart = a;
    var e = $("#Anchor"), c = $(".js-cart-body-bot"), s = $("#js-cart-body-table"), i = function (e) {
        $.ajax({
            url: "/pay/check", dataType: "json", data: {goods_ids: e}, type: "post", success: function (e) {
                if (0 == e.result) {
                    var c = e.data, s = $(".js-cart-num").attr("data-cartnum");
                    0 == s ? $("#cartBody").html('<p class="notdata">购物车内空空如也</p>') : $(c).each(function (e) {
                        var s = ".js-each-" + c[e].type_id, i = $(s);
                        if (1 == c[e].exception) {
                            i.remove();
                            var t = $("#js-cart-body-table").find(".js-item-cart").length;
                            0 == t ? ($(".js-cart-num").attr("data-cartnum", 0).html("").hide(), $("#cartBody").html("<p class='notdata'>购物车内空空如也</p>"), $(".js-number-box-cart").html("").hide()) : a.courseNum();
                            var o = $(".js-number-box-cart"), l = parseInt(o.find(".js-coures-num").html());
                            $(".js-cart-num").attr("data-cartnum", l).html(l)
                        } else {
                            var o = i.find(".item-2"), n = c[e].code.pic_domain + c[e].code.pic + "-160-90.jpg";
                            o.find("img").attr("src", n);
                            var r = parseInt($(".js-cart-num").attr("data-ordernum"));
                            0 != r ? $(".js-order-num").html(r).show() : $(".js-order-num").html("").hide(), o.find("dt").html(2 == c[e].type ? c[e].code.name + "(慕课云服务)" : 1 == c[e].type ? "【实战课程】" + c[e].code.name : 4 == c[e].type ? "【就业班】" + c[e].code.name : c[e].code.name);
                            var d = c[e].code.packages, p = o.find(".js-package-item");
                            "undefined" != typeof d && 0 != d.length && 4 != c[e].type ? p.attr("data-packageid", d).html(d.length + "个组合套餐可选择") : 4 == c[e].type && d ? p.attr("data-id", c[e].type_id).html(d + "个组合套餐可选择") : p.hide()
                        }
                    })
                }
            }
        })
    };
    $.ajax({
        url: "//order.imooc.com/pay/cartorder", dataType: "jsonp", jsonp: "jsonpcallback", success: function (a) {
            if (0 == a.result && (a.data.order && 1 * a.data.order && $(".js-cart-num").attr("data-ordernum", a.data.order), a.data.cart && 1 * a.data.cart)) {
                var e = parseInt(a.data.order);
                $(".js-cart-num").attr("data-cartnum", a.data.cart), $(".js-cart-num").html(parseInt(a.data.cart) + e).show()
            }
        }, complete: function () {
            var a = parseInt($(".js-cart-num").attr("data-cartnum"));
            if (0 != a) {
                var e = $(".storageCart").html().replace(/\s+/g, "");
                i(e)
            } else $("#cartBody").html("<p class='notdata'>购物车内空空如也</p>"), $(".js-number-box-cart").html("").hide(), $(".js-order-num").html("0").hide()
        }
    }), $(window).on("scroll resize", function () {
        if ($("#js-cart-body-table")[0]) {
            var a = Math.ceil(e.offset().top), s = Math.ceil($("body").scrollTop() + $(window).height());
            s >= a ? c.removeClass("fixed") : c.addClass("fixed")
        }
    }), s.on("click", ".js-check", function () {
        return a.toggle($(this)), s.find(".imv2-checkbox").length == s.find(".js-check").length ? $(".js-check-all").removeClass("imv2-checkbox_onk").addClass("imv2-checkbox") : $(".js-check-all").removeClass("imv2-checkbox").addClass("imv2-checkbox_onk"), !1
    }), $(".js-check-all").on("click", function () {
        a.toggle($(this), function () {
            s.find(".js-check").removeClass("imv2-checkbox").addClass("imv2-checkbox_onk")
        }, function () {
            s.find(".js-check").removeClass("imv2-checkbox_onk").addClass("imv2-checkbox")
        })
    }), $("#cartBody").on("click", ".js-close-cart", function () {
        var e = $(this).parents(".js-item-cart");
        a.removeItem(e)
    }), $(".js-check-all")[0] && $(".js-check-all").click(), $(".js-go-confrim").on("click", function () {
        var e = a.submitOrderData().join(",");
        return e.length < 1 ? void $.alert("请选择你需要的课程") : void(window.location.href = "/pay/confirm?goods_ids=" + e)
    }), a.courseNum();
    var t = function (a) {
        $(a).scrollTop(0), $(a).perfectScrollbar({
            wheelSpeed: 100,
            wheelPropagation: !1
        }), $(a).perfectScrollbar("update")
    }, o = function (a) {
        var e = $(".js-package-" + a), c = e.find(".js-combine-box");
        c.outerHeight(!0) > e.height() && t(".js-package-" + a)
    }, l = 1, n = [];
    $(".js-package-item").on("click", function () {
        if ($(this).attr("data-id")) return g($(this)), 0;
        if (!l) return void $.alert("操作频繁，请稍后！");
        l = 0, $(".js-block-package").height($(document).height()).show(), $(".loading").show();
        var a = $(this).attr("data-packageid").split(","),
            e = (a.length, ["一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二", "十三", "十四", "十五", "十六", "十七", "十八", "十九", "二十", "二十一", "二十二", "二十三", "二十四", "二十五", "二十六", "二十七", "二十八", "二十九", "三十"]),
            c = $(this).data("cid");
        if (0 != a.length) {
            var s = '<div class="package-nav-box l js-package-nav">									<ul class="package-nav js-combine-box">';
            $(a).each(function (a, i) {
                s += 0 == a ? '<li data-packageid="' + i + '" class="nav-item js-nav-item js-item active" data-cid="' + c + '"><span>套餐' + e[a] + "</span></li>" : '<li data-packageid="' + i + '" class="nav-item js-nav-item js-item" data-cid="' + c + '"><span>套餐' + e[a] + "</span></li>"
            }), s += "</ul>							</div>"
        }
        d(c, a[0], function (e) {
            var i = {id: c + "_" + a[0], item: e};
            n.push(i);
            var t = '<div class="package-recomment-box">							<i class="close-btn imv2-close js-close-btn"></i>							<p class="big-package-title">选择组合套餐</p>							<div class="package-box clearfix">';
            t += s, t += '<div class="package-nav-scroll-bar js-nav-scroll">						<span></span>					</div>', t += e, t += "</div>", t += "</div>", $(".js-block-package").after(t), $(".loading").hide(), $(".package-detail-box").show(), $(".package-bottom-box").show(), $(".package-recomment-box").show(), o("nav"), o("list"), l = 1
        })
    }), $(".body-main").delegate(".js-close-btn", "click", function () {
        $(".js-block-package").hide(), $(".package-recomment-box").remove(), n = []
    });
    var r = 1;
    $(".body-main").delegate(".js-nav-item", "click", function (a) {
        if (a.preventDefault(), !r) return void $.alert("操作频繁，请稍后！");
        r = 0, $(".loading").show();
        var e = $(this), c = $(".package-nav").find(".js-nav-item");
        $.each(c, function (a, e) {
            $(e).removeClass("active")
        }), e.addClass("active"), $(".js-package-nav").animate({scrollTop: e.position().top}, 300, function () {
            $(".js-package-nav").perfectScrollbar("update")
        });
        var s = e.data("packageid"), i = e.data("cid"), t = i + "_" + s;
        $(".js-package-list").remove(), $(".package-bottom-box").remove(), $(".js-list-scroll").remove();
        var l = 1, p = "";
        $(n).each(function (a, e) {
            e.id == t && (l = 0, p = e.item)
        }), l ? d(i, s, function (a) {
            p = a;
            var e = {id: t, item: a};
            n.push(e), $(".js-nav-scroll").after(p), $(".package-detail-box").show(), $(".package-bottom-box").show(), o("list"), $(".loading").hide(), r = 1
        }) : ($(".js-nav-scroll").after(p), $(".package-detail-box").show(), $(".package-bottom-box").show(), o("list"), $(".loading").hide(), r = 1)
    });
    var d = function (a, e, c) {
        var s = a + "_" + e;
        $(n).each(function (a, e) {
            e.id === s
        });
        var i = function (a) {
            var e, c = new RegExp("(^| )" + a + "=([^;]*)(;|$)");
            return (e = document.cookie.match(c)) ? unescape(e[2]) : null
        }, t = i("apsid");
        null == t && (t = "0"), $.ajax({
            url: "//coding.imooc.com/wap/getpackageinfo",
            type: "post",
            dataType: "json",
            data: {cid: a, id: e, apsid: t},
            success: function (a) {
                if (1e3 == a.errorCode) {
                    var e = a.data,
                        s = '<div class="package-detail-box r js-package-list">									<div class="package-detail js-combine-box">';
                    if (s += '<p class="package-name">' + e.name + "</p>", 0 != e.courses.length) {
                        s += '<p class="package-num">包含' + e.course_count + "门课</p>", s += '<ul class="package-list">';
                        var i = e.courses, t = ["入门", "初级", "中级", "高级", "专业"];
                        $(i).each(function (a, e) {
                            var c = "";
                            1 == e.is_buy && (c = "100" == e.learn_rate ? '<p class="learn-rate"><i class="imv2-check"></i></p>' : '<p class="learn-rate">' + e.learn_rate + "%</p>"), s += '<a href="//coding.imooc.com/class/' + e.id + '.html" target="_blank" class="package-item js-item">										<li class="clearfix">											<div class="img-box l" style="background-image: url(' + e.pic + ');">' + c + '</div>											<div class="package-content l">												<p class="course-name">' + e.name + '</p>												<div class="course-detail clearfix">													<span class="level l">' + t[e.easy_type - 1] + '</span>													<div class="learn-num l">														<i class="imv2-set-sns"></i>														<span class="nums">' + e.numbers + "</span>													</div>												</div>											</div>										</li>									</a>"
                        }), s += "</ul>							</div>						</div>", s += '<div class="package-bottom-box clearfix">									<div class="detail-box l">										<div class="price-box clearfix">											<p class="now-price r">超值套餐价格：￥' + e.price + '</p>											<p class="origin-price r">原价总计：￥' + e.total + "</p>										</div>", s += 1 == e.can_buy ? '<p class="tip">组合套餐不接受换课和退课，请购买前知晓</p>									</div>									<a class="go-buy-package r js-buy-package" href="javascript:void(0);" data-typeid="' + e.id + '">立即购买</a>								</div>' : '<p class="tip"><i class="imv2-error_c"></i>您已购买本套餐内课程，无法重复购买</p>									</div>									<a class="go-buy-package r cant-buy" href="javascript:void(0);">立即购买</a>								</div>', s += '<div class="package-list-scroll-bar js-list-scroll"><span></span></div>'
                    }
                    c(s)
                } else $.alert(a.errorDesc, {
                    callback: function () {
                        $(".js-block-package").height($(document).height()).show(), $(".loading").show(), l = 1
                    }
                })
            },
            complete: function () {
            }
        })
    };
    $(".body-main").delegate(".js-buy-package", "click", function () {
        if (!OP_CONFIG.isLogin) return void $("#js-signin-btn").trigger("click");
        if (!$(this).hasClass("cant-buy")) {
            var a = $(this).attr("data-typeid");
            window.location.href = "//order.imooc.com/pay/confirm/goods_ids/6-" + a
        }
    }), $(".body-main").delegate(".js-buy-package_lujing", "click", function () {
        if (!OP_CONFIG.isLogin) return void $("#js-signin-btn").trigger("click");
        if (!$(this).hasClass("cant-buy")) {
            var a = $(this).attr("data-typeid");
            window.location.href = "//order.imooc.com/pay/confirm/goods_ids/7-" + a
        }
    });
    var t = function (a) {
        $(a).perfectScrollbar({wheelSpeed: 100, wheelPropagation: !1}), $(a).perfectScrollbar("update")
    }, p = function (a, e) {
        if ("nav" == a) {
            var c = $(".js-package-" + a), s = c.find(".js-combine-box");
            s.outerHeight(!0) > c.height() && t(".js-package-" + a)
        } else {
            var c = $(".package_" + e), s = c.find(".js-combine-box");
            s.outerHeight(!0) > c.height() && t(".package_" + e)
        }
    }, v = function (a, e) {
        if (0 != a.length) {
            var c = "",
                s = '<div class="package-nav-box l js-package-nav">									<ul class="package-nav js-combine-box">';
            $(a).each(function (a, i) {
                if (a + 1 > 9) var t = a + 1; else var t = "0" + (a + 1);
                if (0 == a) {
                    s += '<li data-packageid="' + a + '" class="nav-item js-nav-item2 js-item active"><span>套餐' + t + "</span></li>"
                } else s += '<li data-packageid="' + a + '" class="nav-item js-nav-item2 js-item"><span>套餐' + t + "</span></li>";
                var o = i.plans;
                c += '<div class="package-detail-box r js-package-list package_' + a + '">							<div class="package-detail js-combine-box">', c += '<p class="package-name">' + e + '组合套餐</p>								<p class="package-num">包含' + o.length + '门就业班课程</p>								<ul class="package-list">', $(o).each(function (a, e) {
                    var s = "";
                    e.activation && (s = "100" == e.learn_rate ? '<p class="learn-rate"><i class="imv2-check"></i></p>' : '<p class="learn-rate">' + e.learn_rate + "%</p>"), c += '<a href="//class.imooc.com/sc/' + e.id + '" target="_blank" class="package-item js-item">								<li class="clearfix">									<div class="img-box l" style="background-image: url(' + e.pic + ');">' + s + '</div>									<div class="package-content l">										<p class="course-name">' + e.name + '</p>										<div class="course-detail clearfix">											<div class="learn-num l">												<i class="imv2-set-sns"></i>												<span class="nums">' + e.numbers + "</span>											</div>										</div>									</div>								</li>							</a>"
                }), c += "</ul>					</div>				</div>", c += '<div class="package-bottom-box clearfix package_' + a + '"">							<div class="detail-box l">								<div class="price-box clearfix">									<p class="now-price r">超值套餐价格：￥' + i.actual_price + '</p>									<p class="origin-price r">原价总计：￥' + i.price + "</p>								</div>", c += 1 == i.can_buy ? '<p class="tip">组合套餐不接受换课和退课，请购买前知晓</p>							</div>							<a class="go-buy-package r js-buy-package_lujing" href="javascript:void(0);" data-typeid="' + i.id + '">立即购买</a>						</div>' : '<p class="tip"><i class="imv2-error_c"></i>您已购买本套餐内课程，无法重复购买</p>							</div>							<a class="go-buy-package r cant-buy" href="javascript:void(0);">立即购买</a>						</div>', c += '<div class="package-list-scroll-bar js-list-scroll package_' + a + '""><span></span></div>'
            }), s += "</ul>						</div>"
        }
        var i = '<div class="package-recomment-box">						<i class="close-btn imv2-close js-close-btn"></i>						<p class="big-package-title">选择组合套餐</p>						<div class="package-box clearfix">';
        i += s, i += '<div class="package-nav-scroll-bar js-nav-scroll">					<span></span>				</div>', i += c, i += "</div>", i += "</div>", $(".js-block-package").after(i), $(".loading").hide(), $(".package-recomment-box").show(), p("nav"), p("list", 0), m = 1
    }, m = 1, g = function (a) {
        if (!m) return void $.alert("操作频繁，请稍后！");
        m = 0, $(".js-block-package").height($(document).height()).show(), $(".loading").show();
        var e, c;
        e = a.attr("data-id"), c = a.siblings("a").find("dt").text().substring(6);
        var s = function (a) {
            var e, c = new RegExp("(^| )" + a + "=([^;]*)(;|$)");
            return (e = document.cookie.match(c)) ? unescape(e[2]) : null
        }, i = s("apsid");
        $.ajax({
            url: "//class.imooc.com/sc/ajaxgetpackage",
            type: "get",
            dataType: "json",
            data: {plan_id: e, apsid: i},
            success: function (a) {
                v(a.data, c)
            }
        })
    };
    $("body").delegate(".js-nav-item2", "click", function () {
        $(this).siblings().removeClass("active"), $(this).addClass("active");
        var a = $(this).attr("data-packageid");
        $(".package_" + a).siblings().not(".js-package-nav").hide(), $(".package_" + a).not(".js-list-scroll").show(), p("list", a)
    })
});
