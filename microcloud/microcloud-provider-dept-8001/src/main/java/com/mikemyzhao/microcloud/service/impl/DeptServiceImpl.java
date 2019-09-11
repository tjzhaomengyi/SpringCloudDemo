package com.mikemyzhao.microcloud.service.impl;

import com.mikemyzhao.microcloud.dao.IDeptDAO;
import com.mikemyzhao.microcloud.service.IDeptService;
import com.mikemyzhao.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/11 16:59
 * @Description:
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDAO deptDAO;

    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }

    public boolean add(Dept dept) {
        return this.deptDAO.doCreate(dept);
    }

    public List<Dept> list() {
        return this.deptDAO.findAll();
    }
}
