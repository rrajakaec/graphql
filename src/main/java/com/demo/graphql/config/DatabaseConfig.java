package com.demo.graphql.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.demo.graphql.repositories"})
public class DatabaseConfig {

}
