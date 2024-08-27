package com.hsiangyu.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPostmanTestApplication {

    public static void main(String[] args) {
        System.out.println("====start====");
        System.out.println("中文測試");
        System.out.println("args");
        System.out.println(args);
        System.out.println("args.length = [" + args.length + "]");
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ". tt " + args[i]);
        }
        SpringApplication.run(DemoPostmanTestApplication.class, args);
        System.out.println("中文測試-2");
        System.out.println("====finish====");
    }

}

// mvnw.cmd clean
// mvnw.cmd install
// mvnw.cmd spring-boot:run
// http://127.0.0.1:9191/
