package com.service;

import com.dao.MvCategoryMapper;
import com.entity.MvCategory;
import com.entity.MvCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private MvCategoryMapper mvCategoryMapper;


    //查询所有分类信息
    public List<MvCategory> selectAllmvCaregory(){
        return mvCategoryMapper.selectByExample(null);
    }


    //查询单个
    public MvCategory selectMvCategoryById(Integer id){
        return mvCategoryMapper.selectByPrimaryKey(id);
    }



    //单个删除
    public void delmvCaregory(Integer id) {
        mvCategoryMapper.deleteByPrimaryKey(id);

    }


    //批量删除
    public void deleteBatch(List<Integer> ids) {
        MvCategoryExample example=new MvCategoryExample();
        MvCategoryExample.Criteria criteria=example.createCriteria();
        criteria.andCategoryIdIn(ids);
        mvCategoryMapper.deleteByExample(example);
    }


    //修改分类
    public void updatemvCaregory(MvCategory mc){
            mvCategoryMapper.updateByPrimaryKeySelective(mc);
    }

    //添加分类
    public int addMvCaregory(MvCategory mc){
        return mvCategoryMapper.insert(mc);
    }


    //查询分类
    public List<MvCategory> selectParents( Integer parentId){
        return mvCategoryMapper.selectParents(parentId);
    }

}
