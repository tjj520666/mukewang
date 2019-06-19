package com.dao;

import com.entity.Address;

import java.util.List;

public interface AddressMapper {

    List<Address> selectByAddressAll(Integer id);

    Address selectByAddressId(Integer id);

    int deleteAddress(Integer id);

    int insert(Address address);

    int updateByPrimaryKey(Address address);

    int updateByDfault();

    int updateByIsDfaultId(Integer addressId);

}