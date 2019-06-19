package com.dao;

import com.entity.MvCategory;
import com.entity.MvCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvCategoryMapper {

    List<MvCategory> selectByExampleid(Integer categoryId);

    List<MvCategory> selectByExampleId(@Param("categoryId") Integer categoryId,@Param("categoryParentid") Integer categoryParentid);

    List<MvCategory> selectParents(Integer ParentId);

    long countByExample(MvCategoryExample example);

    int deleteByExample(MvCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(MvCategory record);

    int insertSelective(MvCategory record);

    List<MvCategory> selectByExample(MvCategoryExample example);

    MvCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") MvCategory record, @Param("example") MvCategoryExample example);

    int updateByExample(@Param("record") MvCategory record, @Param("example") MvCategoryExample example);

    int updateByPrimaryKeySelective(MvCategory record);

    int updateByPrimaryKey(MvCategory record);
}