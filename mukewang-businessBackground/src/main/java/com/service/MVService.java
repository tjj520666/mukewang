package com.service;


import com.dao.MvMapper;
import com.dao.MvinfoMapper;
import com.dao.SectionMapper;
import com.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MVService {
    @Autowired
    private MvMapper mvMapper;

    @Autowired
    private SectionMapper sectionMapper;

    @Autowired
    private MvinfoMapper mvinfoMapper;


    //查询所有视频信息
    public List<Mv> selectAllMV(){
        return mvMapper.selectByExample(null);
    }


    //按id查询视频
    public Mv selectIdMv(Integer id){
        return  mvMapper.selectByPrimaryKey(id);
    }



    //删除视频信息
    public  void delMv(Integer id){
         mvMapper.deleteByPrimaryKey(id);
    }


    //批量删除视频信息
    public void deleteBatch(List<Integer> ids) {
        MvExample example=new MvExample();
        MvExample.Criteria criteria=example.createCriteria();
        criteria.andMvIdIn(ids);
        mvMapper.deleteByExample(example);
    }

    //添加视频信息
    public int addMv(Mv mv){
        return mvMapper.insert(mv);
    }


    //修改视频信息
    public  void updateMv(Mv mv){
         mvMapper.updateByPrimaryKeySelective(mv);
    }


    //章节添加
    public int addSection(Section section) {
        return  sectionMapper.insertSelective(section);
    }


    //查询所有章节
    public List<Section>  selectAllSection(Integer id){
        return sectionMapper.selectAllSection(id);
    }

    //添加视频
    public int addMvInfo(Mvinfo mvinfo){
        return  mvinfoMapper.insertSelective(mvinfo);
    }

    //查询所有视频
    public List<Mvinfo> selectAllMvInfo(){
        return  mvinfoMapper.selectByExample(null);
    }

    //删除视频
    public int delMvInfo(Integer id){
        return mvinfoMapper.deleteByPrimaryKey(id);
    }

    //批量删除视频
    public void delMV(List<Integer> ids) {
        MvinfoExample example=new MvinfoExample();
        MvinfoExample.Criteria criteria=example.createCriteria();
        criteria.andMvinfoIdIn(ids);
        mvinfoMapper.deleteByExample(example);
    }

    //删除单个视频
    public void deleteMV(Integer ids){
        mvinfoMapper.deleteByPrimaryKey(ids);
    }


}
