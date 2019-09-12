package com.mikemyzhao.microcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import javax.annotation.Resource;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/12 15:32
 * @Description:
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //设置安全配置请求头
    @Resource
    public void configGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("mikemyzhao").password("123321").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        //表示所有的访问都需要进行认证处理
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
        //所有的Rest服务一定要设置为无状态
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}
