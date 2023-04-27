package com.example.ctc.API;

import com.example.ctc.BLL.Control.CanadaTaxController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/ctc/api")
public class    CanadaService {

    //Request: http://localhost:13001/ctc/api/tax?amount=1000
    @GetMapping("/tax")
    public double calculateQuebecTax(@RequestParam Map<String,String> allParams) {
        double amount = Double.valueOf(allParams.get("amount"));
        CanadaTaxController controller = new CanadaTaxController();
        return controller.getTax(amount);
    }
}
