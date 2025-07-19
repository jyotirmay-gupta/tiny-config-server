# Tiny Config Server

**Copyright (c) 2025 Jyotirmay Gupta**

[![Build Status](https://github.com/jyotirmay-gupta/tiny-config-server/actions/workflows/maven.yml/badge.svg)](https://github.com/jyotirmay-gupta/tiny-config-server/actions/workflows/maven.yml)
[![License](https://img.shields.io/badge/License-Apache%202.0-brightgreen.svg)](LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/jyotirmay-gupta/tiny-config-server.svg)](https://github.com/jyotirmay-gupta/tiny-config-server/stargazers)
[![GitHub last commit](https://img.shields.io/github/last-commit/jyotirmay-gupta/tiny-config-server.svg)](https://github.com/jyotirmay-gupta/tiny-config-server/commits)
[![Contributors](https://img.shields.io/github/contributors/jyotirmay-gupta/tiny-config-server.svg)](https://github.com/jyotirmay-gupta/tiny-config-server/graphs/contributors)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.5.3-brightgreen)](https://spring.io/projects/spring-boot)
[![Spring Cloud Config Server](https://img.shields.io/badge/Spring%20Cloud%20Config%20Server-v2025.0.0-brightgreen)](https://spring.io/projects/spring-cloud-config)
[![Java](https://img.shields.io/badge/Java-21-brightgreen)](https://www.oracle.com/java/)

**Project:** Tiny Config Server  
**Description:** This is a personal Spring Cloud Config Server implementation by Jyotirmay Gupta. It serves as a centralized configuration management system for distributed Spring Boot applications.

This project demonstrates core cloud-native concepts such as centralized configuration, environment-specific profiles, and Git-backed property management.

Licensed under the Apache License Version 2.0. See LICENSE file for more details.

---

## Overview

**Tiny Config Server** acts as a centralized configuration server using [Spring Cloud Config Server](https://cloud.spring.io/spring-cloud-config/reference/html/). It retrieves configuration properties for client applications from a Git-based repository.

It allows client services (like Tiny URL) to externalize their configuration and dynamically update environment-specific settings without redeployment.

---

## Features

- Centralized external configuration for multiple Spring Boot services
- Support for profile-based and environment-specific configuration
- Git-backed property storage
- Secure with Basic Authentication
- Easily scalable and extensible for microservice architectures

---

## Example Endpoints

| Endpoint                      | Description                                 |
|------------------------------|---------------------------------------------|
| `/tiny-url/default`          | Fetches default config for `tiny-url` app   |
| `/tiny-url/dev`              | Fetches dev profile config for `tiny-url`   |
| `/actuator/health`           | Health check for the config server          |

> 🔐 Note: Authentication may be required if the server is secured.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Cloud Config Server
- Spring Security (for securing endpoints)
- Git (as the config source)
- Spring Actuator (for monitoring)

---

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/tiny-config-server.git

2. pdate the Git repo URI in application.yml:

```yaml

spring:
    cloud:
        config:
            server:
                git:
                    uri: https://github.com/your-username/your-config-repo.git
                    username: your-username
                    password: your-token
                    clone-on-start: true
```

3. Build and run the server:

```bash

mvn clean spring-boot:run
```

4. Access the config endpoints:

```bash
curl http://localhost:8888/tiny-url/dev
```
---

## Notes
The config server supports both public and private Git repositories.

The your-config-repo should follow standard Spring Config naming:
e.g., tiny-url-dev.yml, tiny-url-prod.yml, etc.

Secure endpoints with Spring Security to prevent unauthorized access.

Environment variables are recommended for storing credentials securely.

---

## License
Licensed under the Apache License Version 2.0. See the LICENSE file for details.

---

*Created by Jyotirmay Gupta — 2025*