package com.dao;

import com.entity.AddressInfo;

import java.util.List;

public interface AddressInfoMapper {

    List<AddressInfo> selectByAllParentId();

    List<AddressInfo> selectByIdSonId(Integer id);

}
