package com.dao;

import com.entity.Purchase;

import java.util.List;

public interface PurchaseMapper {

    List<Purchase> selectByAllJiuYe(Integer id);

    int deleteById(Integer id);
}
