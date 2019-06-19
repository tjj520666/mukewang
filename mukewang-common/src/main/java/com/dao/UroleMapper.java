package com.dao;

import com.entity.Urole;
import com.entity.UroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UroleMapper {
    long countByExample(UroleExample example);

    int deleteByExample(UroleExample example);

    int deleteByPrimaryKey(Integer uroleId);

    int insert(Urole record);

    int insertSelective(Urole record);

    List<Urole> selectByExample(UroleExample example);

    Urole selectByPrimaryKey(Integer uroleId);

    int updateByExampleSelective(@Param("record") Urole record, @Param("example") UroleExample example);

    int updateByExample(@Param("record") Urole record, @Param("example") UroleExample example);

    int updateByPrimaryKeySelective(Urole record);

    int updateByPrimaryKey(Urole record);
}