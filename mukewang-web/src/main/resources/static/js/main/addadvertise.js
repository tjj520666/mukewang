define(function(require){var a=require("//coding.imooc.com/static/lib/adv/insetadvertising.js");$.get("/common/adver-getadver",function(g){g=JSON.parse(g);var v=(new Date).getTime(),c=new Date,h=(c.setDate(7),c.setHours(22,0,0,0),c.getTime());if("course"==OP_CONFIG.module&&"list"==OP_CONFIG.page&&h>v&&a.initAdv("#moco-right-float-advertising",{position:"right",image:"/static/img/adver-live.gif",link:"https://m.imooc.com/live/3skl162i8m9",advid:"global_right_float",animate:"fade"}),0==g.result){var k=g.data.globalRightFloat,O=g.data.globalTopBanner;k.length>0&&(k=k[0],a.initAdv("#moco-right-float-advertising",{position:"right",image:"//img.mukewang.com/"+k.pic+"-160-160.jpg",link:k.links,advid:k.id,animate:"fade"})),O.length>0&&(O=O[0],a.initAdv("#moco-top-advertising",{position:"top",image:"//img.mukewang.com/"+O.pic+".jpg",link:O.links,advid:O.id,animate:"slide"}))}})});