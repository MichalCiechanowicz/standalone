package com.example.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StandaloneApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StandaloneApplication.class, args);
    }

}
