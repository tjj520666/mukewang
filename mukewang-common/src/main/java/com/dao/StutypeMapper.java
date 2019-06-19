package com.dao;

import com.entity.Stutype;
import com.entity.StutypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StutypeMapper {
    long countByExample(StutypeExample example);

    int deleteByExample(StutypeExample example);

    int deleteByPrimaryKey(Integer stutypeId);

    int insert(Stutype record);

    int insertSelective(Stutype record);

    List<Stutype> selectByExample(StutypeExample example);

    Stutype selectByPrimaryKey(Integer stutypeId);

    int updateByExampleSelective(@Param("record") Stutype record, @Param("example") StutypeExample example);

    int updateByExample(@Param("record") Stutype record, @Param("example") StutypeExample example);

    int updateByPrimaryKeySelective(Stutype record);

    int updateByPrimaryKey(Stutype record);
}