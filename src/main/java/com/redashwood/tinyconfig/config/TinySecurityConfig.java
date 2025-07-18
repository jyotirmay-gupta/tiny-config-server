/*
 * Copyright (c) 2025 Jyotirmay Gupta
 *
 * Project: Tiny Config Server
 * Description: This is a personal project by Jyotirmay Gupta that implements a Spring Cloud
 * Config Server. It serves centralized configuration for microservices by fetching configuration
 * files from a remote Git repository.
 *
 * This code is intended for educational and personal use, demonstrating core backend concepts
 * such as centralized configuration, environment-specific properties, and Spring Cloud integration.
 *
 * Licensed under the Apache License Version 2.0. See LICENSE file for more details.
 */
package com.redashwood.tinyconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class TinySecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/actuator/**").permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(httpBasic -> {
                })  // enable basic auth with default settings
                .csrf(AbstractHttpConfigurer::disable); // disable CSRF (safe for non-browser clients)

        return http.build();
    }
}
