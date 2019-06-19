package com.service;

import com.dao.OrderMapper;
import com.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FromService {
    @Autowired
    private OrderMapper orderMapper;

    //查询所有订单
    public List<Order> selectAllOrder(){
        return orderMapper.selectByExample(null);
    }

    //按id查询订单信息
    public Order selectIdOrder(Integer id){
        return  orderMapper.selectByPrimaryKey(id);
    }

    //删除订单
    public  void delOrder(Integer id){
        orderMapper.deleteByPrimaryKey(id);
    }

    //批量删除
    public void deleteBatch(List<Integer> ids) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andOrderIdIn(ids);
        orderMapper.deleteByExample(example);
    }


    //修改用户
    public  void updateOrder(Order order){
        orderMapper.updateByPrimaryKeySelective(order);
    }

}
