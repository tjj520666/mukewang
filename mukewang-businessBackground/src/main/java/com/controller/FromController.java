package com.controller;

import com.entity.Order;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.FromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FromController {
    @Autowired
    private FromService fromService;

    //查询所有订单信息
    @RequestMapping("getFrom")
    public  String selectAllOrder(Model model,@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,5);
        List<Order> orderList=fromService.selectAllOrder();
        PageInfo pageInfo=new PageInfo(orderList,5);
        model.addAttribute("from",pageInfo);
        return "houtai/from";
    }

    //按id查询订单
    @ResponseBody
    @RequestMapping("getFromById")
    public Object selectFromById(@RequestParam("id") Integer id){
        Order order=fromService.selectIdOrder(id);

        return order;
    }



    //订单删除
    @ResponseBody
    @RequestMapping("delOrder")
    public  Object delOrder(String ids){
        if (ids!=null&&ids!=""){
            if (ids.contains("-")){
                List<Integer> del_ids=new ArrayList<Integer>();
                String[] str_ids=ids.split("-");
                for (String string :str_ids) {
                    del_ids.add(Integer.parseInt(string));
                }
                fromService.deleteBatch(del_ids);
                return 1;
            }else{
                int id=Integer.parseInt(ids);
                fromService.delOrder(id);
                return 1;
            }
        }


        return "";
    }


    //修改订单
    @ResponseBody
    @RequestMapping("updateOrder")
    public Object updateOrder(Order order){
         fromService.updateOrder(order);

         return  1;
    }
}
