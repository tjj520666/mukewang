package com.service;

import com.entity.*;

import java.util.List;

public interface UserBackgService {

    Users selectBylogin(UsersExample example);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKey(Users users);

    List<Recently> selectByUserAll(Recently recently);

    List<Recently> selectByClassIgy(Recently recently);

    List<RecentlyClassify> selectByAll(RecentlyClassify recentlyClassify);

    List<RecentlyClassify> selectByAllClassify(RecentlyClassify recentlyClassify);

    int deleteByRecentlyId(Integer id);

    int deleteByClassId(Integer classifyId);

    List<Address> selectByAddressAll(Integer id);

    Address selectByAddressId(Integer id);

    int deleteAddress(Integer id);

    int insert(Address address);

    int updateByPrimaryKey(Address address);

    List<AddressInfo> selectByAllParentId();

    List<AddressInfo> selectByIdSonId(Integer id);

    int updateByDfault();

    int updateByIsDfaultId(Integer addressId);

    List<Article> selectByRainAll(Integer id);

    Order selectByOrderKey(Integer orderId);

    List<Order> selectByOrderAll(Integer id);

    int selectByOrderIsYes();

    int selectByOrderIsNo();

    int selectByDetaCountAll();

    List<Order> selectByOrderYes(Integer id);

    List<Order> selectByOrderNo(Integer id);

    List<Purchase> selectByAllJiuYe(Integer id);

    int deleteById(Integer id);

    int deleteOrderId(Integer orderId);

    int deleteDeta(Integer detailId);

    Order selectByOrder(Integer orderId);

}
