package com.example.gtc.API;

import com.example.gtc.BLL.Control.GlobalTaxCalculator;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@RestController
@RequestMapping("/gtc/api")
public class GlobalService {

    //Request: http://localhost:13001/gtc/api/tax?amount=1000
    @CrossOrigin
    @GetMapping("/tax")
    public double calculateTax(@RequestParam Map<String, String> allParams) {
        double amount = Double.valueOf(allParams.get("amount"));
        GlobalTaxCalculator calculator = new GlobalTaxCalculator();
        return calculator.getTax(amount);
    }
}
