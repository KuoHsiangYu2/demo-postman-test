package com.hsiangyu.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPostmanTestApplication {

    public static void main(String[] args) {
        System.out.println("====start====");
        SpringApplication.run(DemoPostmanTestApplication.class, args);
        System.out.println("====finish====");
    }

}
