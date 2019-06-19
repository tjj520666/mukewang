package com.dao;

import com.entity.Position;

import java.util.List;

public interface PositionMapper {

    List<Position> selectByPositionAll();

    Position selectByPositionId(Integer id);

}
