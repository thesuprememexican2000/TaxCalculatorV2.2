package com.example.ctc.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = CanadaService.class)
public class CanadaServiceApplication {
    public static void main(String[] args) {SpringApplication.run(CanadaServiceApplication.class, args);}

}
