package com.dao;

import com.entity.Detail;
import com.entity.DetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailMapper {
    int deleteDeta(Integer detailId);

    int selectByDetaCountAll();

    long countByExample(DetailExample example);

    int deleteByExample(DetailExample example);

    int deleteByPrimaryKey(Integer detailId);

    int insert(Detail record);

    int insertSelective(Detail record);

    List<Detail> selectByExampleId(Integer detailId);

    List<Detail> selectByExample(DetailExample example);

    Detail selectByPrimaryKey(Integer detailId);

    int updateByExampleSelective(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExample(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}