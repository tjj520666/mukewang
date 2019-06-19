package com.dao;

import com.entity.Mv;
import com.entity.MvExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MvMapper {
    List<Mv> selectByDiff(Integer mvDifficultyid);
    List<Mv> selectByIdType3(@Param("mvType3id")Integer mvType3id,@Param("mvDifficultyid")Integer mvDifficultyid);
    List<Mv> selectByAll();
    List<Mv> selectByid(@Param("mvType2id")Integer mvType2id ,@Param("mvDifficultyid")Integer mvDifficultyid);
    long countByExample(MvExample example);

    int deleteByExample(MvExample example);

    int deleteByPrimaryKey(Integer mvId);

    int insert(Mv record);

    int insertSelective(Mv record);

    List<Mv> selectByExample(MvExample example);

    List<Mv> selectByMvCateId(Integer cateId,Integer number);

    Mv selectByPrimaryKey(Integer mvId);

    int updateByExampleSelective(@Param("record") Mv record, @Param("example") MvExample example);

    int updateByExample(@Param("record") Mv record, @Param("example") MvExample example);

    int updateByPrimaryKeySelective(Mv record);

    int updateByPrimaryKey(Mv record);
}