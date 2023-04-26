package com.example.qtc.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = QuebecService.class)
public class QuebecServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuebecServiceApplication.class, args);
    }

}
