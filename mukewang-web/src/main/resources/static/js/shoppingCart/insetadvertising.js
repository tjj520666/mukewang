/*
*   动态广告位 suoguangxu
*   DOM绑定： <div class="moco-advertising-container" data-position="" data-link="" data-image="" data-alt="" data-advid="" data-animate=""></div>
*   手动调用：initAdv (rootElementSelector: string | DOM , option: AdvConfig);
*   interface AdvConfig{
        position?: string = 'top',
        link: string = '',
        image: string = '',
        alt?: string = null,
        advid: number = 0,
        animate?: string = 'none',
*   }
*/
define(function(require, exports, module){

    /**
     * 创建对应样式表，注入页面head当中
     */
    var insertStyle = function(){
        var style      = document.createElement('style');
        var stylesheet = [
            '#MOCO_TOP_ADVERTISING{',
                'width: 100%;',
                'min-width: 1152px;',
                'max-width: 2560px;',
                'height: 40px;',
                'overflow: hidden;',
                'background: #eee;',
                'cursor: pointer;',
                'position: relative;',
                'z-index:901',
            '}',
            '#MOCO_TOP_ADVERTISING > img{',
                'height: 100%;',
                'display: block;',
                'position: absolute;',
                'top: 0;',
                'left: 50%;',
                'transform: translateX(-50%);',
                '-ms-transform: translateX(-50%);',
                '-webkit-transform: translateX(-50%);',
            '}',
            '#MOCO_TOP_ADVERTISING > .close-adv{',
                'color:#000;',
                'position: absolute;',
                'right: 15%;',
                'top: 8px;',
                'cursor: pointer;',
                'z-index: 1;',
                'font-size: 24px;',
            '}',
            '#MOCO_FLOATRIGHT_ADVERTISING{',
                'width: 102px;',
                'height: 102px;',
                'position: fixed;',
                'right: 0;',
                'top: 50%;',
                'margin-top: -218px;',
                'cursor: pointer;',
                'overflow: hidden;',
                'z-index:901',
            '}',
            '#MOCO_FLOATRIGHT_ADVERTISING .close-adv{',
                'position: absolute;',
                'right: 3px;',
                'top: 5px;',
                'cursor: pointer;',
                'color: rgba(255,255,255,0.8);',
                'font-size:16px;',
            '}',
            '#MOCO_FLOATRIGHT_ADVERTISING .close-adv:hover{',
                'color: rgba(242,13,13,0.8);',
            '}',
            '#MOCO_FLOATRIGHT_ADVERTISING > img{',
                'width: 100%;',
            '}',
            '#MOCO_BOTTOM_ADVERTISING{',
                'width:100%;',
                // 'min-height:80px;',
                'max-height:200px;',
                'position:fixed;',
                'bottom:0;',
                'left:0;',
                'cursor:pointer;',
                'z-index:2',
            '}',
            '#MOCO_BOTTOM_ADVERTISING > .close-adv{',
                'position:absolute;',
                'top:0;',
                'right:10px;',
                'font-size:18px;',
                'color: rgba(168, 160, 160, 0.8);',
                'transform: translateY(-65%);',
                '-ms-transform: translateY(-65%);',
                '-webkit-transform: translateY(-65%);',
                'z-index: 2;',
            '}',
            '#MOCO_BOTTOM_ADVERTISING > img{',
                'width: 100%;',
                'display: block;',
                // 'position: absolute;',
                // 'bottom: 0;',
                // 'left: 50%;',
                // 'transform: translateX(-50%) scale(1.33 , 1.33);',
                // '-ms-transform: translateX(-50%) scale(1.33 , 1.33);',
                // '-webkit-transform: translateX(-50%) scale(1.33 , 1.33);',
                // 'transform-origin: bottom center;',
                // '-ms-transform-origin: bottom center;',
                // '-webkit-transform-origin: bottom center;',
            '}'
        ]
        style.type      = 'text/css';
        style.id        = 'MOCO_ADV_STYLE';
        style.innerText = stylesheet.join('');
        document.head.appendChild(style);
    }

    /**
     * 创建广告图
     * @param {广告图相关属性配置} option
     */
    var createAdv = function(option, root){
        var domIds = {
            "top"    : "MOCO_TOP_ADVERTISING",
            "right"  : "MOCO_FLOATRIGHT_ADVERTISING",
            "bottom" : "MOCO_BOTTOM_ADVERTISING"
        }
        var advBox = document.createElement('div');
        var advImage = document.createElement('img');

        advBox.id  = domIds[option.position];
        advImage.src = option.image;
        option.alt && (advImage.alt = option.alt);
        //添加关闭按钮
        var closeBtn = document.createElement('div');
        closeBtn.className = 'close-adv imv2-close_c';

        // 如果是右侧/底部广告，直接关闭
        if(option.position === 'right' || option.position === 'bottom'){
            closeBtn.addEventListener('click', function(e){
                e.stopPropagation();
                advBox.style.display = 'none';
            })
        }
        // 如果是顶部广告，关闭时需要记录关闭时间
        if(option.position === 'top'){
            closeBtn.addEventListener('click', function(e){
                e.stopPropagation();
                cookie.set('MOCO_TOP_ADV_STATUS', new Date().getTime() + '#' + option.advid)
                $(root).slideUp(500);
            })
        }

        advBox.appendChild(closeBtn)
        advBox.appendChild(advImage);


        // 如果存在链接,则上报点击,跳转链接
        if(option.link){
            advBox.addEventListener('click', function(e){
                // 上报 跳转
                uploadClick(option.advid, option.link)
            })
        }
        return advBox
    }

    /**
     * 插入完成后执行动画
     * @param {根节点dom对象} root
     * @param {创建的广告dom对象} image
     * @param {动画类型} animationType  slide:下滑展开 fade: 淡入
     */
    var insertedAnimate = function(root, image, animationType){
        switch(animationType){
            case 'none':
                image.addEventListener('DOMNodeInserted',function(){
                    $(root).show()
                })
            case 'slide':
                image.addEventListener('DOMNodeInserted',function(){
                    $(root).slideDown(500)
                })
            break;
            case 'fade':
                image.addEventListener('DOMNodeInserted',function(){
                    $(root).fadeIn(300)
                })
            break;
        }
    }

    /**
     * 执行创建广告图
     * 创建完成后插入页面当中
     * @param {dom选择器名称} rootElementSelector
     * @param {广告图相关属性配置} options
     * options属性为入口函数整合完成后的属性
     * 通过选择器前缀判断使用哪种方式获取  id/class
     */
    var createAndInsert = function(rootElementSelector, options){
        // 获取根节点
        var Root = null;
        if(typeof rootElementSelector === 'object'){
            Root = rootElementSelector
        }else{
            // 判断使用选择器类型
            var selectorType = rootElementSelector.slice(0,1);
            if(selectorType === '#'){
                Root = document.getElementById(rootElementSelector.slice(1));
            }else if (selectorType === '.'){
                Root = document.getElementsByClassName(rootElementSelector.slice(1))[0];
            }
        }

        // 未获取到root节点抛出错误
        if(!Root){
            console.error('Root HTMLDom is not define')
            return;
        }

        var img = createAdv(options, Root); // 创建广告图
        Root.style ='display:none;'

        insertedAnimate(Root, img, options.animate); // 绑定广告出现动画

        Root.appendChild(img)
    }


    var navigateTo = function(url){
        window.open(url, '_blank')
    }

    var uploadClick = function(){
        var adv_id   = arguments[0];
        var url      = arguments[1];
        var sitehost = location.hostname.split('.')[0];
        var uploadapi;
        if(/(coding|order)/.test(sitehost)){
            uploadapi = '/index/ajaxadvclickcount';
        }else if(/class/.test(sitehost)){
            uploadapi = '/ajaxadvclickcount';
        }else{
            uploadapi = '/common/adver-advclickcount';
        }
        // 绕过chrome防弹框机制，点击上报前打开新窗口，请求回调中仅修改新窗口url
        var newWindow = window.open();
        $.post(uploadapi, {adv_id: adv_id}, function(res){
            newWindow.location.href = url
        })
    }




    /**
     * 手动创建广告位方法，调用入口函数
     * @param {dom选择器名称} rootElementSelector
     * @param {广告图相关属性配置} option
     */
    exports.initAdv = function(rootElementSelector, option){
        InsertADV(rootElementSelector, option)
    }

    /**
     * 入口函数
     * @param {dom选择器名称} rootElementSelector
     * @param {广告图相关属性配置} option
     */
    InsertADV = function(rootElementSelector, option){
        rootElementSelector || (rootElementSelector = '')
        // 设置option默认值
        option || (option = {})
        var options = {
            position: option.position || 'top',
            link    : option.link     || '',
            image   : option.image    || '',
            alt     : option.alt      || null,
            advid   : option.advid    || 0,
            animate : option.animate  || 'none',
        }
        // 缺少链接、图片、id时向控制台抛出警告
        if(!options.link){
            console.warn('Advertise set warn: ' + options.position + ' advertise unset navigate link');
        }
        if(!options.image){
            console.warn('Advertise set warn: ' + options.position + ' advertise unset image');
        }
        if(!options.advid){
            console.warn('Advertise set warn: ' + options.position + ' advertise unset id');
        }
        // 如果是头部广告位，先检查是否已关闭，已关闭且不足7天时，不会再次生成
        if(options.position === 'top' && !checkTopStatu(options.advid)){
            return false;
        }
        // console.log(options)
        // 如果为弹出广告, 调用moco dialog, 否则生成广告dom
        if(options.position === 'pop'){
            popAdvertising(options);
        }else{
            createAndInsert(rootElementSelector,options);
        }
    }

    /**
     * 获取默认绑定的广告位DOM (标识: class='moco-advertising-container')
     * 如果存在默认广告元素，则获取DOM属性列表
     * 支持的属性: position -> 广告图位置
     */
    var getDomDataMap = function(){
        var i        = 0     // 循环控制变量
        var dataMap  = [];   // DomDataMap
        var domIndex = [];   // 保存存在自定义属性的广告DOM索引
        var dom      = document.getElementsByClassName('moco-advertising-container'); // 默认广告位
        // 如果不存在默认广告位，直接跳出
        if(!dom.length>0){
            return
        }
        for(; i<dom.length;i++ ){
            // 如果不存在自定义属性，则忽略该DOM
            if(JSON.stringify(dom[i].dataset) === '{}'){
                continue;
            }
            dataMap.push(dom[i].dataset) // 保存当前DOM的dataMap
            domIndex.push(i)             // 保存当前元素索引
        }
        i = 0;
        // 对所有默认元素执行创建广告操作
        for(; i< domIndex.length; i++){
            InsertADV(dom[domIndex[i]], dataMap[domIndex[i]])
        }
    }

    /**
     * 弹出式广告，直接使用moco dialog组件
     * 弹出前重写部分 dialog 组件样式
     * 关闭时移除重写的样式
     */
    var popAdvertising = function(option){
        var preventPop = localStorage.getItem('MOCO_ADVERTISIONG_' + option.advid )
        if(preventPop){
            return;
        }
        var style = rewriteMocoDialog();
        document.head.appendChild(style);

        var dialog = $.dialog(getPopDom(option), {
            title    : ' ',
            modal    : true,
            width    : 480,
            height   : 640,
            callback : function(){
                document.head.removeChild(style);
                closePopAdvertising(option.advid)
            }
        })

        $('#MOCO_POP_ADVERTISING a').on('click', function(e){
            e.preventDefault();
            if(!option.link){
                return;
            }
            var url = $(this).attr('href');
            var id  = $(this).data('id');

            uploadClick(id, url)
        })

        $('.js-advpop-close').on('click', function(e){
            dialog.hide();
        })

        return dialog;
    }

    /**
     * 重写部分弹出层样式
     */
    var rewriteMocoDialog = function(){
        var style = [
            '.moco-modal-title{',
                'padding:0 !important;',
                'display: none;',
            '}',
            '.moco-modal-dialog{',
                'padding:0 !important;',
            '}',
            '.moco-modal-layer{',
                'background: transparent;',
                'box-shadow: 0 0 0 rgba(0,0,0,0) !important;',
            '}',
            '#MOCO_POP_ADVERTISING{',
                'width:480px;',
                'min-height:360px;',
                'max-height:640px;',
                'border-radius:25px;',
                'overflow:hidden;',
                'position:absolute;',
                'top: 50%;',
                'transform: translateY(-50%);',
                '-ms-transform: translateY(-50%);',
                '-webkit-transform: translateY(-50%);',
            '}',
            '#MOCO_POP_ADVERTISING img{',
                'width:100%;',
                'display:block;',
            '}',
            '#MOCO_POP_ADVERTISING > i{',
                'display: inline-block;',
                'position: absolute;',
                'right: 24px;',
                'top: 24px;',
                'color: #fff;',
                'font-size: 24px;',
                'opacity:0.3;',
            '}',
            '#MOCO_POP_ADVERTISING > i:hover{',
                'opacity: 0.8;',
            '}'
        ]
        var popStyle       = document.createElement('style');
        popStyle.type      = 'text/css';
        popStyle.id        = 'rewriteMocoDialog';
        popStyle.innerText = style.join('');
        return popStyle
    }

    /**
     * 创建弹出层dom
     */
    var getPopDom = function(option){
        return (
            '<div id="MOCO_POP_ADVERTISING">'+
                '<i class="imv2-close_c js-advpop-close"></i>'+
                '<a href="'+ option.link +'" data-id="'+option.advid+'" >'+
                    '<img src="'+ option.image +'" alt="'+ option.alt  +'"/>'+
                '</a>'+
            '</div>'
        )


    }

    /**
     *  弹出框关闭回调
     */
    var closePopAdvertising = function(id){
        localStorage.setItem('MOCO_ADVERTISIONG_' + id, id)
    }

    /**
     * 头部广告位状态检查
     */
    var checkTopStatu = function(advid){
        var stamp = cookie.get('MOCO_TOP_ADV_STATUS');
        if(!stamp){
            return true
        }
        var advStatusArr = stamp.split('#');
        var expMS = '604800000';
        if(new Date().getTime() - advStatusArr[0] > expMS || advStatusArr[1] != advid){
            return true;  // 关闭大于7天
        }else{
            return false; // 关闭不足7天
        }
    }
    /**
     * 操作cookie
     */
    var cookie = {
        parse: function(){
            var obj = new Object();
            var arr = document.cookie.split(';');
            for(var i in arr){
                var subarr = arr[i].split('=');
                obj[subarr[0].trim()] = subarr[1]
            }
            return obj;
        },
        get  : function(key){
            var obj = cookie.parse();
            return obj[key];
        },
        set: function(key, val){
            var str = key + '=' + val +';domain=.imooc.com';
            document.cookie = str;
        }
    }



    insertStyle()
    getDomDataMap()

})
