package com.dao;

import com.entity.Mvinfo;
import com.entity.MvinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvinfoMapper {
    long countByExample(MvinfoExample example);

    int deleteByExample(MvinfoExample example);

    int deleteByPrimaryKey(Integer mvinfoId);

    int insert(Mvinfo record);

    int insertSelective(Mvinfo record);

    List<Mvinfo> selectByExample(MvinfoExample example);

    List<Mvinfo> selectBySection(Integer sectionid);

    Mvinfo selectByPrimaryKey(Integer mvinfoId);

    int updateByExampleSelective(@Param("record") Mvinfo record, @Param("example") MvinfoExample example);

    int updateByExample(@Param("record") Mvinfo record, @Param("example") MvinfoExample example);

    int updateByPrimaryKeySelective(Mvinfo record);

    int updateByPrimaryKey(Mvinfo record);
}