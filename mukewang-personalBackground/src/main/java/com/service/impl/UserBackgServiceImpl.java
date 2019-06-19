package com.service.impl;

import com.dao.*;
import com.entity.*;
import com.service.UserBackgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBackgServiceImpl implements UserBackgService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private RecentlyMapper recentlyMapper;

    @Autowired
    private RecentlyclassifyMapper recentlyClassifyMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private AddressInfoMapper addressInfoMapper;

    @Autowired
    private ArticleMapper rainMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DetailMapper detailMapper;

    @Autowired
    private PurchaseMapper purchaseMapper;


    public Users selectBylogin(UsersExample example) {
        return usersMapper.selectBylogin (example);
    }

    public Users selectByPrimaryKey(Integer userId) {
        return usersMapper.selectByPrimaryKey (userId);
    }

    public int updateByPrimaryKey(Users users) {
        return usersMapper.updateByPrimaryKey(users);
    }

    public List<Recently> selectByUserAll(Recently recently){
        return recentlyMapper.selectByUserAll (recently);
    }

    public List<Recently> selectByClassIgy(Recently recently) {
        return recentlyMapper.selectByClassIgy (recently);
    }

    @Override
    public List<RecentlyClassify> selectByAll(RecentlyClassify recentlyClassify) {
        return recentlyClassifyMapper.selectByAll(recentlyClassify);
    }

    public List<RecentlyClassify>  selectByAllClassify(RecentlyClassify recentlyClassify) {
        return recentlyClassifyMapper.selectByAllClassify (recentlyClassify);
    }

    public int deleteByRecentlyId(Integer id) {
        return recentlyMapper.deleteByRecentlyId (id);
    }


    public int deleteByClassId(Integer classifyId) {
        return recentlyClassifyMapper.deleteByClassId (classifyId);
    }

    public List<Address> selectByAddressAll(Integer id) {
        return addressMapper.selectByAddressAll (id);
    }

    public Address selectByAddressId(Integer id) {
        return addressMapper.selectByAddressId (id);
    }

    public int deleteAddress(Integer id) {
        return addressMapper.deleteAddress (id);
    }

    public int insert(Address address) {
        return addressMapper.insert (address);
    }

    public int updateByPrimaryKey(Address address) {
        return addressMapper.updateByPrimaryKey (address);
    }

    public List<AddressInfo> selectByAllParentId() {
        return addressInfoMapper.selectByAllParentId ();
    }

    public List<AddressInfo> selectByIdSonId(Integer id) {
        return addressInfoMapper.selectByIdSonId (id);
    }

    public int updateByDfault() {
        return addressMapper.updateByDfault ();
    }

    public int updateByIsDfaultId(Integer addressId) {
        return addressMapper.updateByIsDfaultId (addressId);
    }

    public List<Article> selectByRainAll(Integer id) {
        return rainMapper.selectByRainAll (id);
    }

    public Order selectByOrderKey(Integer orderId) {
        return orderMapper.selectByPrimaryKey (orderId);
    }

    public List<Order> selectByOrderAll(Integer id) {
        return orderMapper.selectByOrderAll (id);
    }

    public int selectByOrderIsYes() {
        return orderMapper.selectByOrderIsYes ();
    }

    public int selectByOrderIsNo() {
        return orderMapper.selectByOrderIsNo ();
    }

    public int selectByDetaCountAll() {
        return detailMapper.selectByDetaCountAll ();
    }

    public List<Order> selectByOrderYes(Integer id) {
        return orderMapper.selectByOrderYes (id);
    }

    public List<Order> selectByOrderNo(Integer id) {
        return orderMapper.selectByOrderNo (id);
    }

    public List<Purchase> selectByAllJiuYe(Integer id) {
        return purchaseMapper.selectByAllJiuYe (id);
    }

    public int deleteById(Integer id) {
        return purchaseMapper.deleteById (id);
    }

    public int deleteOrderId(Integer orderId) {
        return orderMapper.deleteOrderId (orderId);
    }

    public int deleteDeta(Integer detailId) {
        return detailMapper.deleteDeta (detailId);
    }

    public Order selectByOrder(Integer orderId) {
        return orderMapper.selectByPrimaryKey (orderId);
    }

}
