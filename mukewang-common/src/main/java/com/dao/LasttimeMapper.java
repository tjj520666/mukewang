package com.dao;

import com.entity.Lasttime;
import com.entity.LasttimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LasttimeMapper {
    long countByExample(LasttimeExample example);

    int deleteByExample(LasttimeExample example);

    int deleteByPrimaryKey(Integer lasttimeId);

    int insert(Lasttime record);

    int insertSelective(Lasttime record);

    List<Lasttime> selectByExample(LasttimeExample example);

    Lasttime selectByPrimaryKey(Integer lasttimeId);

    int updateByExampleSelective(@Param("record") Lasttime record, @Param("example") LasttimeExample example);

    int updateByExample(@Param("record") Lasttime record, @Param("example") LasttimeExample example);

    int updateByPrimaryKeySelective(Lasttime record);

    int updateByPrimaryKey(Lasttime record);
}