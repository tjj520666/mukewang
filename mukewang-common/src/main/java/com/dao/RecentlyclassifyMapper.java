package com.dao;

import com.entity.RecentlyClassify;

import java.util.List;

public interface RecentlyclassifyMapper {

    List<RecentlyClassify> selectByAllClassify(RecentlyClassify recentlyClassify);

    List<RecentlyClassify> selectByAll(RecentlyClassify recentlyClassify);

    int deleteByClassId(Integer classifyId);

    int insert(RecentlyClassify recentlyClassify);


}