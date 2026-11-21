package com.acme.csrf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Spring Security 7 removed csrf().disable(); the lambda DSL keeps the same behaviour.
        http.csrf(csrf -> csrf.disable());
        return http.build();
    }
}
