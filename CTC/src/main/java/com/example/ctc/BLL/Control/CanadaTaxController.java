package com.example.ctc.BLL.Control;

import com.example.ctc.BLL.Model.TaxBracket;
import com.example.ctc.DAL.InMemory_DAO;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.List;

public class CanadaTaxController {
    InMemory_DAO dao;
    List<TaxBracket> TaxBrackets;

    public CanadaTaxController() {
        dao = new InMemory_DAO();
        TaxBrackets = dao.getTaxBrackets();
    }

    JsonObject getTax(double amount) {
        String taxInfo;
        JsonObject jsonObject;
        double tax;

        for (TaxBracket taxBracket : TaxBrackets) {
            if (taxBracket.getMin() <= amount && amount < taxBracket.getMax()) {
                tax = amount * (taxBracket.getRate()/100);
                taxInfo = String.format("{\"amount\":%.2f,\"rate\":%f}",tax,taxBracket.getRate());
                jsonObject = new JsonParser().parse(taxInfo).getAsJsonObject();
                return jsonObject;
            }
        }
        taxInfo = "{\"amount\":0,\"rate\":0}";
        jsonObject = new JsonParser().parse(taxInfo).getAsJsonObject();
        return jsonObject;
    }
}
//    double getTax(double amount) {
//        double total = 0;
//        //49 020 ou moins
//        if (amount <= 49020 ){
//            total = amount * .15;
//        }
//        //entre 49 020 et 98 040
//        else if (amount > 49020 && amount <= 98040) {
//            total = 49020 * .15;
//            total = total + ((amount - 49020) * .205);
//        }
//        //entre 98 040 et 151 978
//        else if (amount > 98040 && amount <= 151978) {
//            total = 49020 * .15;
//            total = total + (98040 * .205);
//            total = total + ((amount - 98040) * .26);
//        }
//        //entre 151 978 et 216 511
//        else if (amount > 151978 && amount <= 216511) {
//            total = 49020 * .15;
//            total = total + (98040 * .205);
//            total = total + (151978 * .26);
//            total = total + ((amount - 151978) * .29);
//        }
//        //plus de 216 511
//        else if (amount > 216511) {
//            total = 49020 * .15;
//            total = total + (98040 * .205);
//            total = total + (151978 * .26);
//            total = total + (216511 * .29);
//            total = total + ((amount - 216511) * 32);
//        }
//        return total;
//    }
