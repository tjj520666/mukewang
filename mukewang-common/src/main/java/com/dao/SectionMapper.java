package com.dao;

import com.entity.Section;
import com.entity.SectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionMapper {
    long countByExample(SectionExample example);

    int deleteByExample(SectionExample example);

    int deleteByPrimaryKey(Integer sectionId);

    int insert(Section record);

    int insertSelective(Section record);

    List<Section> selectByMvid(Integer mvid);

    List<Section> selectByExample(SectionExample example);

    Section selectByPrimaryKey(Integer sectionId);

    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);

    List<Section> selectAllSection(Integer sectionMv);
}