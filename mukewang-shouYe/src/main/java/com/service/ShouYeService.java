package com.service;

import com.dao.MvMapper;
import com.dao.TeacherMapper;
import com.entity.Mv;
import com.entity.MvExample;
import com.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShouYeService {

    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private MvMapper mvMapper;

    //单个
    public Teacher selectId(Integer teacherId){return  teacherMapper.selectByPrimaryKey(teacherId);}

    public List<Mv> selectListMv(MvExample example){return mvMapper.selectByExample(example);}

}
