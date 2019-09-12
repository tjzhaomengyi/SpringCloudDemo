package com.mikemyzhao.microcloud.controller;

import com.mikemyzhao.vo.Dept;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/12 10:39
 * @Description:
 */

@RestController
public class ConsumerDeptController {
    public static final String DEPT_GET_URL = "http://dept-8001.com:8001/dept/get/";
    public static final String DEPT_LIST_URL = "http://dept-8001.com:8001/dept/list/";
    public static final String DEPT_ADD_URL = "http://dept-8001.com:8001/dept/add/";


    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders headers;

    //请求地址：http://client.com:8002/consumer/dept/get?id=4
    @RequestMapping(value="/consumer/dept/get")
    public Object getDept(@RequestParam("id") long id){
        Dept dept = this.restTemplate.exchange(DEPT_GET_URL+id, HttpMethod.GET,
                new HttpEntity<Object>(this.headers),Dept.class).getBody();
//                this.restTemplate.getForObject(DEPT_GET_URL+id,Dept.class);
        return dept;
    }

    //请求地址:http://client.com:8002/consumer/dept/list
    @RequestMapping(value="/consumer/dept/list")
    public Object listDept(){
        List<Dept> aldept = this.restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET,
                new HttpEntity<Object>(this.headers),List.class).getBody();
//                this.restTemplate.getForObject(DEPT_LIST_URL,List.class);
        return aldept;
    }

    //请求地址:http://client.com:8002/consumer/dept/add?dname=测试开发
    @RequestMapping(value="/consumer/dept/add")
    public Object addDept(Dept dept){
        Boolean flag = this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST,
                new HttpEntity<Object>(dept,this.headers),Boolean.class).getBody();

//                this.restTemplate.postForObject(DEPT_ADD_URL,dept,Boolean.class);
        return flag;
    }


}
