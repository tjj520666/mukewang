package com.dao;

import com.entity.Follows;
import com.entity.FollowsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowsMapper {
    long countByExample(FollowsExample example);

    int deleteByExample(FollowsExample example);

    int deleteByPrimaryKey(Integer followsId);

    int insert(Follows record);

    int insertSelective(Follows record);

    List<Follows> selectByExample(FollowsExample example);

    Follows selectByPrimaryKey(Integer followsId);

    int updateByExampleSelective(@Param("record") Follows record, @Param("example") FollowsExample example);

    int updateByExample(@Param("record") Follows record, @Param("example") FollowsExample example);

    int updateByPrimaryKeySelective(Follows record);

    int updateByPrimaryKey(Follows record);
}