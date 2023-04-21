package com.example.qtc.API;

import com.example.qtc.BLL.Model.TaxBracket;
import com.example.qtc.DAL.AlwaysDataSQL_DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/api/qtc")
public class QuebecService {

    @Autowired
    private AlwaysDataSQL_DAO dao;

    @RequestMapping("/rate")
    //Request: http://localhost:8082/api/qtc/tax
    double getTax(@RequestParam double allParams) {
        return 6;// temp

    }
}
