package com.example.ctc.API;

import com.example.ctc.BLL.Control.CanadaTaxController;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/ctc")
public class    CanadaService {

    //Request: http://localhost:8082/api/ctc/tax
    @RequestMapping("/rate")
    JsonObject getTax(@RequestParam Map<String, String> allParams) {
        double amount = Double.valueOf(allParams.get("amount"));
        CanadaTaxController controller = new CanadaTaxController();
        return controller.getTax(amount);
    }
}
