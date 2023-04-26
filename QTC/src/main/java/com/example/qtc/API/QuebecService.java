package com.example.qtc.API;

import com.example.qtc.BLL.Control.QuebecTaxController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/qtc/api")
public class    QuebecService {

    //Request: http://localhost:13001/qtc/api/tax?amount=1000
    @GetMapping("/tax")
    public double calculateQuebecTax(@RequestParam Map<String,String> allParams) {

        double amount = Double.valueOf(allParams.get("amount"));
        QuebecTaxController controller = new QuebecTaxController();
        return controller.getTax(amount);
    }

    //GET http://localhost:8089/client_service/api/
    @GetMapping(path="/")
    public String getLandingMessage()
    {
        return "Quebec Tax Calculator...";
    }
}
