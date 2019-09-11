package com.mikemyzhao.microcloud.dao;

import com.mikemyzhao.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/11 16:14
 * @Description:
 */
@Mapper
public interface IDeptDAO {
    public boolean doCreate(Dept vo);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
