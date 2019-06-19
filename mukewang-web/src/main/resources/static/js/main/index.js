define(function (require) {
    require("common"), require("/js/main/newcomer.js"), require("/js/main/stackblur.js"), require("/js/main/swiper-3.4.2.jquery.min.js");
    var a = require("/js/main/mouse-move-angle.js");
    $(function () {
        var c = function () {
            var a = navigator.userAgent;
            return a.indexOf("Opera") > -1 || a.indexOf("OPR") > -1 ? !1 : a.indexOf("compatible") > -1 && a.indexOf("MSIE") > -1 ? !0 : a.indexOf("Edge") > -1 ? "Edge" : a.indexOf("Firefox") > -1 ? !1 : a.indexOf("Safari") > -1 && -1 == a.indexOf("Chrome") ? !1 : a.indexOf("Chrome") > -1 && a.indexOf("Safari") > -1 ? !1 : window.ActiveXObject || "ActiveXObject" in window ? !0 : !1
        };
        $("#js-app-load").on("mouseenter", function () {
            $(this).find(".js-load-box").show()
        }).on("mouseleave", function () {
            $(this).find(".js-load-box").hide()
        }), $(".search-input").on("focus", function () {
            $(".search-warp").addClass("focused")
        }).on("blur", function () {
            $(".search-warp").removeClass("focused")
        }), c() && $(".bk").hide();
        var h, v = 0;
        $(".menuContent .item").mouseenter(function () {
            var c = $(this), g = {
                left: c.offset().left,
                top: c.offset().top,
                lx: c.offset().left + c.outerWidth(),
                ty: c.offset().top + c.outerHeight()
            };
            if (h = a.getSlope(g), clearTimeout(v), h) {
                var j = this, b = $(".menuContent").find(".js-menu-item-on")[0];
                v = setTimeout(function () {
                    if (b != j) {
                        $(".menuContent .item").removeClass("js-menu-item-on"), c.addClass("js-menu-item-on"), $(".submenu").hide();
                        var a = c.attr("data-id");
                        $("." + a).show()
                    }
                }, 600)
            } else {
                clearTimeout(v), $(".menuContent .item").removeClass("js-menu-item-on"), c.addClass("js-menu-item-on"), $(".submenu").hide();
                var w = c.attr("data-id");
                $("." + w).show()
            }
        }), $(".menuContent , .submenu").mouseleave(function () {
            clearTimeout(v), h || ($(".menuContent .item").removeClass("js-menu-item-on"), $(".submenu").hide())
        }), $(".submenu").mouseenter(function () {
            $(".submenu").hide();
            var a = $(this).data("id"), c = $(".menuContent .item");
            $.each(c, function (i) {
                var h = $(c[i]).data("id");
                h == a && $(c[i]).addClass("js-menu-item-on")
            }), $(this).show()
        }), $(".g-banner").on("mouseleave", function () {
            $(".menuContent .item").removeClass("js-menu-item-on"), $(".submenu").hide()
        });
        var g = !1, j = 0;
        $(document).delegate(".js-upAni", "mouseenter", function () {
            var a = this;
            j = setTimeout(function () {
                if ($(a).find(".js-upBox").css({top: "77px"}), $(a).find(".title").css({
                    height: "auto",
                    "max-height": "48px",
                    overflow: "hidden"
                }), $(a).find(".summary").css({margin: "0px"}), !g) {
                    $(a).find(".js-upBox").addClass("doing");
                    var c = $(a).find(".js-upBox");
                    $(a).find(".js-upBox").animate({top: "22px"}, 100, function () {
                        $(a).find(".js-upBox").addClass("box_body_hover"), g = !1, c.hasClass("doing") || c.css("top", "77px")
                    })
                }
                return !1
            }, 200)
        }), $(document).delegate(".js-upAni", "mouseleave", function () {
            window.clearInterval(j), $(this).find(".js-upBox").removeClass("box_body_hover"), $(this).find(".title").css("height", "24px"), $(this).find(".summary").css({margin: "2px"}), $(".doing").css("top", "77px"), $(".doing").removeClass("doing"), $(this).find(".js-upBox").css({top: "77px"});
            $(this).find(".js-upBox");
            return !1
        })
    }), $("#js-header-login").click(function () {
        require.async("login_sns", function (mod) {
            mod.init()
        })
    }), $("#js-header-register").click(function () {
        require.async("login_sns", function (mod) {
            mod.signup()
        })
    });
    var c = "24px", h = $(".js-notice-txt").width();
    $(".js-notice").size() > 0 && ($(".js-notice").on("mouseenter", function () {
        $(this).hasClass("closed") && ($(".js-notice").removeClass("closed"), $(".js-notice-txt").animate({width: h}))
    }), $(".js-notice-close").on("click", function (e) {
        e.stopPropagation(), $(".js-notice").addClass("closed"), $(".js-notice-txt").animate({width: c})
    }));
    var v = function (a) {
        for (var c = $(".js-wonderful-list .item").outerWidth(), h = a.width(), v = parseInt(h / c), g = [], i = 0; v > i; i++) g.push(0);
        var j = 0;
        $(".js-wonderful-list .item").each(function () {
            for (var a = $(this), c = 0, h = g[0], v = 0; v < g.length; v++) g[v] < h && (h = g[v], c = v);
            a.css({left: c * a.outerWidth(!0), top: h}), g[c] = h + a.outerHeight(!0)
        }), g = g.sort(function (a, c) {
            return a - c
        }), j = g[g.length - 1], a.height(j)
    }, g = "", j = "";
    $.ajax({
        url: "/index/getstarlist", type: "get", dataType: "json", success: function (a) {
            if (0 == a.result) {
                for (var x = 0; x < a.data.numberOne.length; x++) {
                    var c = "yellow", h = "", b = "javascript:void(0);";
                    if ("" != a.data.numberOne[x]) {
                        switch (h = a.data.numberOne[x].img, b = "/u/" + a.data.numberOne[x].uid, a.data.numberOne[x].type) {
                            case 0:
                                c = "purple";
                                break;
                            case 1:
                                c = "green";
                                break;
                            case 2:
                                c = "blue";
                                break;
                            case 3:
                                c = "yellow", b = "javascript:void(0);", h = "/static/img/index/tuhao.png"
                        }
                        g += '<dd>                                <div class="lead-item-photo">                                    <a target="_blank" href=' + b + '><img src="' + h + '"></a>                                    <span class="' + c + '"></span>                                </div>                                <p class="lead-item-name ellipsis">' + a.data.numberOne[x].nickname + '</p>                                <p class="lead-item-tit">' + a.data.cate[a.data.numberOne[x].type] + "</p>                            </dd>"
                    }
                }
                $(".js-lead-list").html(g);
                for (var w = 0; w < a.data.list.length; w++) {
                    var C = "", k = "", O = "";
                    switch (a.data.list[w].type) {
                        case 0:
                            C = "purple", k = "一周获得 " + a.data.list[w].count + "积分";
                            break;
                        case 1:
                            C = "green", k = "一周解题 " + a.data.list[w].count + " 个";
                            break;
                        case 2:
                            C = "blue", k = "一周发布手记 " + a.data.list[w].count + " 篇"
                    }
                    10 == w ? O = "marr0" : 11 == w && (O = "marl0"), j += '<dd class="other-item ' + C + " " + O + '">                                <a target="_blank" href="/u/' + a.data.list[w].uid + '">                                <img src="' + a.data.list[w].img + '">                                <div>                                    <p class="title">="' + a.data.cate[a.data.list[w].type] + '"=</p>                                    <p class="nickname">' + a.data.list[w].nickname + '</p>                                    <p class="desc">' + k + '</p>                                    <span class="cur">◆</span>                                </div>                                </a>                            </dd>'
                }
                $(".js-other-list").html(j)
            }
            setTimeout(function () {
                v($(".js-wonderful-list"))
            }, 100)
        }
    });
    $(".js-other-list").on("mouseenter", "dd", function () {
        $(this).find("div").fadeIn(150)
    }).on("mouseleave", "dd", function () {
        $(this).find("div").fadeOut(150)
    }), function () {
        function a(i) {
            var a = w.filter(".slide-active");
            w.stop(!0, !0), a.removeClass("slide-active").fadeOut(400), w.eq(i).addClass("slide-active").fadeIn(600), c(i)
        }

        function c(i) {
            j && j.removeClass("active").eq(i).addClass("active"), $(".bk").css("backgroundImage", 'url("' + w.eq(i).attr("data-url") + '")')
        }

        function h() {
            y--, y = 0 > y ? O - 1 : y, a(y)
        }

        function v() {
            y++, y = y > O - 1 ? 0 : y, a(y)
        }

        function g() {
            I && clearInterval(I), I = setInterval(function () {
                v()
            }, B)
        }

        var j, b = $(".g-banner"), w = b.find(".banner-slide"), C = b.find(".banner-dots"), k = "", O = w.length, y = 0,
            B = 3e3, I = null;
        1 != O && ($(".banner-slide").each(function (i) {
            if (i > 0) {
                var a = '<img src="' + $(this).attr("data-url") + '">';
                $(this).html(a)
            }
        }), k = "<span></span>", $.each(w, function (i) {
            if (i > 0) {
                var a = '<img src="' + $(this).attr("data-url") + '">';
                $(this).html(a)
            }
            C.append(k)
        }), j = C.find("span"), b.find(".banner-anchor").removeAttr("style"), b.on("click", ".prev", function () {
            h()
        }).on("click", ".next", function () {
            v()
        }).on("click", ".banner-dots span", function () {
            if (!$(this).hasClass("active")) {
                var i = $(this).index();
                y = i, a(i)
            }
        }), b.on("mouseenter", function () {
            I && clearInterval(I)
        }).on("mouseleave", function () {
            g()
        }), c(0), g())
    }(), $(window).trigger("scroll");
    var b = function () {
        var a = new Swiper(".js-lecturer-container", {
            pagination: ".slider-pagination",
            nextButton: ".slider-next",
            prevButton: ".slider-prev",
            paginationClickable: !0,
            spaceBetween: 30,
            centeredSlides: !0,
            autoplay: 8e3,
            autoplayDisableOnInteraction: !1,
            loop: !0,
            observer: !0,
            observeParents: !0
        });
        $(".js-lecturer-container").hover(function () {
            a.stopAutoplay()
        }, function () {
            a.startAutoplay()
        })
    }, w = function (a, c, h) {
        for (var v = [], $ = "", i = a; c > i; i++) {
            var t = h[i], g = "";
            g += '<a target="_blank" href=\'//www.imooc.com/u/' + t.uid + "' class='lecturer-item'>", g += "<img class='lecturer-uimg' src='" + t.img + "' data-original='" + t.img + "' title='" + t.nickname + "' />", g += "<span class='lecturer-name'>" + t.nickname + "</span>", g += "<span class='lecturer-title'>" + t.job_title + "</span>", g += "<span class='lecturer-p' title='" + t.aboutme + "'>" + t.aboutme + "</span>", g += "</a>", v.push(g)
        }
        return $ += "<div class='lecturer-list clearfix swiper-slide'>", $ += v.join(""), $ += "</div> "
    }, C = function () {
        $.ajax({
            type: "get", dataType: "json", url: "/lecturer/ajaxrecteacher", success: function (a) {
                if (a.data && a.data.length > 0) {
                    var c = a.data, h = w(0, 5, c), v = w(5, 10, c);
                    $(".js-swiper-wrap").append(h).append(v), b()
                }
            }
        })
    };
    $(function () {
        C()
    }), $(".js-close-livead").on("click", function () {
        return $(".js-live-ad").remove(), !1
    })
});
