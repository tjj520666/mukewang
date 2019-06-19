package com.dao;

import com.entity.Difficulty;
import com.entity.DifficultyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DifficultyMapper {
    List<Difficulty> selectByExampleid(Integer difficultyId);
    long countByExample(DifficultyExample example);

    int deleteByExample(DifficultyExample example);

    int deleteByPrimaryKey(Integer difficultyId);

    int insert(Difficulty record);

    int insertSelective(Difficulty record);

    List<Difficulty> selectByExample(DifficultyExample example);

    Difficulty selectByPrimaryKey(Integer difficultyId);

    int updateByExampleSelective(@Param("record") Difficulty record, @Param("example") DifficultyExample example);

    int updateByExample(@Param("record") Difficulty record, @Param("example") DifficultyExample example);

    int updateByPrimaryKeySelective(Difficulty record);

    int updateByPrimaryKey(Difficulty record);
}