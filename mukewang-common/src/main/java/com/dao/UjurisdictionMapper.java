package com.dao;

import com.entity.Ujurisdiction;
import com.entity.UjurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UjurisdictionMapper {
    long countByExample(UjurisdictionExample example);

    int deleteByExample(UjurisdictionExample example);

    int deleteByPrimaryKey(Integer ujurisdictionId);

    int insert(Ujurisdiction record);

    int insertSelective(Ujurisdiction record);

    List<Ujurisdiction> selectByExample(UjurisdictionExample example);

    Ujurisdiction selectByPrimaryKey(Integer ujurisdictionId);

    int updateByExampleSelective(@Param("record") Ujurisdiction record, @Param("example") UjurisdictionExample example);

    int updateByExample(@Param("record") Ujurisdiction record, @Param("example") UjurisdictionExample example);

    int updateByPrimaryKeySelective(Ujurisdiction record);

    int updateByPrimaryKey(Ujurisdiction record);
}