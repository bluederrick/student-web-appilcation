package com.web.students.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class configuration {
    @Bean

    public BCryptPasswordEncoder bcryptPasswordEncoder(){
        return BCryptPasswordEncoder ;
    }
}
