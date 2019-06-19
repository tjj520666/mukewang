package com.dao;

import com.entity.Recently;

import java.util.List;

public interface RecentlyMapper {

    List<Recently> selectByUserAll(Recently recently);

    List<Recently> selectByClassIgy(Recently recently);

    int deleteByRecentlyId(Integer id);

    int insert(Recently recently);

}
