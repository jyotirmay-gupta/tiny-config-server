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
package com.redashwood.tinyconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TinyConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinyConfigServerApplication.class, args);
    }
}
