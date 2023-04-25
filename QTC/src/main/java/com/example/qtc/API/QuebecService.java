package com.example.qtc.API;

import com.example.qtc.BLL.Control.QuebecTaxController;
import com.example.qtc.BLL.Model.TaxBracket;
import com.example.qtc.DAL.AlwaysDataSQL_DAO;

import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/api/qtc")
public class    QuebecService {

    //Request: http://localhost:8082/api/qtc/tax
    @RequestMapping("/rate")
    JsonObject getTax(@RequestParam Map<String, String> allParams) {
        double amount = Double.valueOf(allParams.get("amount"));
        QuebecTaxController controller = new QuebecTaxController();
        return controller.getTax(amount);
    }
}
