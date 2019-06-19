package com.service;

import com.dao.TeacherMapper;
import com.entity.Teacher;
import com.entity.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;



    //查询全部老师信息
    public List<Teacher> selectAllTeacher(){
        return teacherMapper.selectByExample(null);
    }


    //id查老师
    public Teacher selectIdTeacher(Integer id){
        return teacherMapper.selectByPrimaryKey(id);
    }


    //新增老师
    public int addTeacher(Teacher teacher){
        return teacherMapper.insert(teacher);
    }

    //删除老师
    public  void delTeacher(Integer id){
        teacherMapper.deleteByPrimaryKey(id);
    }

    //批量删除
    public void deleteBatch(List<Integer> ids) {
        TeacherExample example=new TeacherExample();
        TeacherExample.Criteria criteria=example.createCriteria();
        criteria.andTeacherIdIn(ids);
        teacherMapper.deleteByExample(example);
    }

    //修改老师
    public  void updateTeacher(Teacher teacher){
        teacherMapper.updateByPrimaryKeySelective(teacher);
    }
}
