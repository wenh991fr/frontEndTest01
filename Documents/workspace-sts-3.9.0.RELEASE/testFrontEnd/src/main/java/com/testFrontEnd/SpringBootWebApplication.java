package com.testFrontEnd;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testFrontEnd.configuration.SecurityConfiguration;
 
@SpringBootApplication
public class SpringBootWebApplication {
	
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
