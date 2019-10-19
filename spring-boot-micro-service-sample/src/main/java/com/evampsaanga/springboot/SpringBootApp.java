package com.evampsaanga.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.evampsaanga.*")
@EntityScan("com.evampsaanga.models")
@EnableJpaRepositories("com.evampsaanga.dao")
@EnableAutoConfiguration
public class SpringBootApp {

    public static void main(String[] args) {
	SpringApplication.run(SpringBootApp.class, args);
    }

}
