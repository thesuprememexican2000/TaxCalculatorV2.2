package com.example.ctc.API;

import com.example.ctc.DAL.MongoDB_DAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CanadaServiceApplication {

    @Bean
    MongoDB_DAO getMongoDB_DAO(){return MongoDB_DAO.getInstance();}

    public static void main(String[] args) {SpringApplication.run(CanadaServiceApplication.class, args);}

}
