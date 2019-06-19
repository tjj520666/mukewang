package com.controller;

import com.entity.*;
import com.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class CartController {

    @Autowired
    CartService cars;

    @RequestMapping("/toShoppingCart")
    public String toShoppingCart(Map map){
        map.put("carts",cars.getShoppings(1));
        return  "shoppingCart/shoppingCart";
    }
    @RequestMapping("/deleteCart")
    public String deleteCart(Integer id){
        cars.delete(id);
        return  "redirect:/toShoppingCart";
    }

    @RequestMapping("/toPay")
    public String toPay(Map map, HttpSession session) throws Exception{
        List<Shoppingcart> list=cars.getShoppings(1);
        double money=0;
        double shifu=0;
        for (Shoppingcart cart:list
                ) {
            shifu=cart.getShoppingcartMoney();
            if (shifu>299&&shifu<599){
                cart.setShifu(shifu-30);
            }else if (cart.getShoppingcartMoney()>=599){
                cart.setShifu(shifu-80);
            }else {
                cart.setShifu(shifu);
            }
            money+=cart.getShifu();
        }
        Order order=new Order();
        SimpleDateFormat da=new SimpleDateFormat("yyyyMMddHHMMSS");
        order.setOrderCreatetime(da.parse(da.format(new Date())));
        Users users =(Users) session.getAttribute("users");
        order.setOrderUid(users.getUserId());
        order.setOrderUname(users.getUserName());
        order.setOrderState(0);
        order.setOrderExpenditure(money);
        order.setOrderUaddress("");
        order.setOrderOrdernumber(num());
        cars.insertOrder(order);
        List deails=new ArrayList();
        for (Shoppingcart cart:list
                ) {
            Detail detail=new Detail();
            detail.setDetailMvid(cart.getShoppingcartMvid());
            detail.setDetailNumber(1);
            detail.setDetailOrderid(order.getOrderId());
            detail.setDetailMoney(shifu);
            detail.setMv(cart.getMv());
            deails.add(detail);
            cars.insertDetail(detail);
        }
        order.setDetails(deails);
        map.put("Order",order);
        return  "shoppingCart/pay";
    }


    @RequestMapping("/toPayInfo")
    public String toPayInfo(Map map,Integer mvid,HttpSession session) throws Exception{
        Mv mv=cars.getMv(mvid);
        Order order=new Order();
        SimpleDateFormat da=new SimpleDateFormat("yyyyMMddHHMMSS");
        order.setOrderCreatetime(da.parse(da.format(new Date())));
        Users users =(Users) session.getAttribute("users");
        order.setOrderUid(users.getUserId());
        order.setOrderUname(users.getUserName());
        order.setOrderState(1);
        order.setOrderExpenditure(mv.getMvPrice());
        order.setOrderUaddress("");
        order.setOrderOrdernumber(num());
        cars.insertOrder(order);
        List deails=new ArrayList();
        Detail detail=new Detail();
        detail.setDetailMvid(mv.getMvId());
        detail.setDetailNumber(1);
        detail.setDetailOrderid(order.getOrderId());
        detail.setDetailMoney(mv.getMvPrice());
        detail.setMv(mv);
        deails.add(detail);
        cars.insertDetail(detail);
        order.setDetails(deails);
        map.put("Order",order);
        return  "shoppingCart/pay";
    }

    @RequestMapping(value="/pays")
    public String pay(String name,Double money,Map map){
        List<Shoppingcart> list=cars.getShoppings(1);
        for (Shoppingcart cart:list){
            cars.delete(cart.getShoppingcartId());
        }
        map.put("name",name);
        map.put("money",money);
        return "forward:/pay/index.jsp";
    }

    @RequestMapping(value="/ok")
    public String pay(){

        return "forward:/toMain";
    }
    public String num(){
            String numStr;
            String trandStr = String.valueOf((Math.random() * 9 + 1) * 10000);
            String dataStr = new SimpleDateFormat("yyyyMMddHHMMSS").format(new Date());
            numStr = trandStr.toString().substring(0, 5);
            numStr = numStr + dataStr ;
           return numStr;
    }
}
