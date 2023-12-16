//package com.myAuthTestProject;
//
//import com.azure.spring.cloud.autoconfigure.implementation.aad.security.AadWebApplicationHttpSecurityConfigurer;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//@Configuration
//@EnableWebSecurity
//public class MyTestConfig extends AadWebApplicationHttpSecurityConfigurer {
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
//    }
//}
