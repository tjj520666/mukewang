package com.dao;

import com.entity.Jurisdiction;
import com.entity.JurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JurisdictionMapper {
    long countByExample(JurisdictionExample example);

    int deleteByExample(JurisdictionExample example);

    int deleteByPrimaryKey(Integer jurisdictionId);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    List<Jurisdiction> selectByExample(JurisdictionExample example);

    Jurisdiction selectByPrimaryKey(Integer jurisdictionId);

    int updateByExampleSelective(@Param("record") Jurisdiction record, @Param("example") JurisdictionExample example);

    int updateByExample(@Param("record") Jurisdiction record, @Param("example") JurisdictionExample example);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);
}