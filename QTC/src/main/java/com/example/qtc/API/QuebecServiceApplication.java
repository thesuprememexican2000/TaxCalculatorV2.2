package com.example.qtc.API;

import com.example.qtc.BLL.Control.QuebecTaxController;
import com.example.qtc.DAL.AlwaysDataSQL_DAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = QuebecService.class)
public class QuebecServiceApplication {

//    @Bean
//    AlwaysDataSQL_DAO getSQLDAO() {
//        return AlwaysDataSQL_DAO.getInstance();
//    }

    public static void main(String[] args) {
        SpringApplication.run(QuebecServiceApplication.class, args);
    }

}
