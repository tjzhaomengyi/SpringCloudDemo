package com.mikemyzhao.microcloud.service;

import com.mikemyzhao.vo.Dept;

import java.util.List;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/11 16:57
 * @Description:
 */

public interface IDeptService {
    public Dept get(long id);
    public boolean add(Dept dept);
    public List<Dept> list();

}
