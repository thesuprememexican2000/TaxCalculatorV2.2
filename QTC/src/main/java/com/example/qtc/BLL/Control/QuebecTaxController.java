package com.example.qtc.BLL.Control;

import com.example.qtc.BLL.Model.TaxBracket;
import com.example.qtc.DAL.AlwaysDataSQL_DAO;
import com.example.qtc.DAL.InMemory_DAO;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class QuebecTaxController {
    InMemory_DAO inmemdao;
    AlwaysDataSQL_DAO dao;
    List<TaxBracket> TaxBrackets;

    public QuebecTaxController() {
        inmemdao = new InMemory_DAO();
        dao = AlwaysDataSQL_DAO.getInstance();
        TaxBrackets = dao.findAllBrackets();
    }

     public JsonObject getTax(double amount) {
        double tax = 0;
        String taxInfo;
        JsonObject json = null;

        for (TaxBracket bracket : TaxBrackets) {
            if (amount > bracket.getMax()) {
                tax += (bracket.getMax() - bracket.getMin()) * bracket.getRate();
                taxInfo = String.format("{\"amount\":%.2f,\"rate\":%f}", tax, bracket.getRate());
                json = new JsonParser().parse(taxInfo).getAsJsonObject();
            } else {
                tax += (amount- bracket.getMin()) * bracket.getRate();
                taxInfo = String.format("{\"amount\":%.2f,\"rate\":%f}", tax, bracket.getRate());
                json = new JsonParser().parse(taxInfo).getAsJsonObject();
                break;
            }
        }
        return json;
    }
/*
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
    } */
}


//cringe version
//    double getTax(double amount) {
//        double total = 0;
//        if (amount <= 46295 ){
//            total = amount * .15;
//        }
//        //entre 49 020 et 98 040
//        else if (amount > 46295 && amount <= 92580) {
//            total = 46295 * .15;
//            total = total + ((amount - 46295) * .205);
//        }
//        //entre 98 040 et 151 978
//        else if (amount > 92580 && amount <= 112655) {
//            total = 46295 * .15;
//            total = total + (92580 * .205);
//            total = total + ((amount - 92580) * .26);
//        }
//        //plus de 216 511
//        else if (amount > 112655) {
//            total = 46295 * .15;
//            total = total + (92580 * .205);
//            total = total + (112655 * .26);
//            total = total + ((amount - 112655) * 32);
//        }