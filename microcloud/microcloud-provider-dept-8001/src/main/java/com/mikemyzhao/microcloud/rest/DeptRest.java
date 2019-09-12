package com.mikemyzhao.microcloud.rest;

import com.mikemyzhao.microcloud.service.IDeptService;
import com.mikemyzhao.vo.Dept;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/11 18:38
 * @Description:
 */

@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService;

    @RequestMapping("/dept/sessionid")
    public Object id(HttpServletRequest request){
        return request.getSession().getId();
    }

    //请求地址：http://dept-8001.com:8001/dept/get/1
    @RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
    public Object get(@PathVariable("id") long id){
        return this.deptService.get(id);
    }

    @RequestMapping(value="/dept/add",method = RequestMethod.POST)
    public Object add(@RequestBody Dept dept){
        return this.deptService.add(dept);
    }

    //请求地址：http://dept-8001.com:8001/dept/list
    @RequestMapping(value="/dept/list",method = RequestMethod.GET)
    public Object list(){
        return this.deptService.list();
    }


}
