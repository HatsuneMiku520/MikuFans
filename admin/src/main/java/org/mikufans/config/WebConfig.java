package org.mikufans.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author admin
 * @WebConfig
 * @2020/4/15
 */
@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {


    /**
     * 关闭 spring security 登录认证
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll().and().logout().permitAll();

        /**
         * 关闭csrf验证
         */
        http.csrf().disable();
    }

}
