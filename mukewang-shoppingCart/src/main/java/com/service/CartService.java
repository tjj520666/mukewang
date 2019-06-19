package com.service;

import com.dao.*;
import com.entity.*;
import com.mukewangelasticsearch.Config.Elasticsearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
//    @Autowired
//    Elasticsearch elasticsearch;

    @Autowired
    ShoppingcartMapper shops;

    @Autowired
    OrderMapper orders;

    @Autowired
    DetailMapper details;

    @Autowired
    MvMapper mvMapper;

    public List<Shoppingcart> getShoppings(Integer uid){
        ShoppingcartExample example=new ShoppingcartExample();
        ShoppingcartExample.Criteria criteria = example.createCriteria();
        criteria.andShoppingcartUidEqualTo(uid);
        return shops.selectByExample(example);
    }

    public void delete(Integer id){
        shops.deleteByPrimaryKey(id);
    }
    public void insertOrder(Order order){
        orders.insert(order);
    }
    public void insertDetail(Detail detail){
        details.insert(detail);
    }


    public Mv getMv(Integer mvid){
        return mvMapper.selectByPrimaryKey(mvid);
    }
}
