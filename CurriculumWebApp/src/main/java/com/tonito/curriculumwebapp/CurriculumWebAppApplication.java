package com.tonito.curriculumwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class CurriculumWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurriculumWebAppApplication.class, args);
    }

}
