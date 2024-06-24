package com.web.students.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class securityConfig {

//overwritten the default security
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
//        csrf is to avoid vulnerabilities from hackers
        return http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth ->auth.anyRequest()
                        .authenticated())
                .sessionManagement(session ->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();

    }

}
