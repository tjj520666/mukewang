package com.dao;

import com.entity.Order;
import com.entity.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

    int deleteOrderId(Integer orderId);

    List<Order> selectByOrderAll(Integer id);

    int selectByOrderIsYes();

    int selectByOrderIsNo();

    List<Order> selectByOrderYes(Integer id);

    List<Order> selectByOrderNo(Integer id);



    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}