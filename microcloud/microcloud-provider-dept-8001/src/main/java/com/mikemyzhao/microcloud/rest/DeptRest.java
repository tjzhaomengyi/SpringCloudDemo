package com.mikemyzhao.microcloud.rest;

import com.mikemyzhao.vo.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/11 18:38
 * @Description:
 */

@RestController
public class DeptRest {
    @RequestMapping(value="")
    public Dept get(){
        return null;
    }
}
