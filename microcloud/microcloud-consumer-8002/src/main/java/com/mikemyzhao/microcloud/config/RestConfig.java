package com.mikemyzhao.microcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/12 10:38
 * @Description:
 */
@Configuration
public class RestConfig {
    @Bean
    public HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        //生成一个头信息
        String auth = "mikemyzhao:123321";
        byte[] encodeAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        //在进行授权的头信息内容配置时候加密信息一定要与basic之间有个空格
        String authHeader = "Basic " + new String(encodeAuth);
        headers.set("Authorization",authHeader);
        return headers;
    }
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
