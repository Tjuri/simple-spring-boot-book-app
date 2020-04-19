package com.example.cc01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cc01Application {

    private final Logger logger = LoggerFactory.getLogger(Cc01Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Cc01Application.class, args);
    }

}
