package com.example.qtc.BLL.Control;

import com.example.qtc.BLL.Model.TaxBracket;
import com.example.qtc.DAL.AlwaysDataSQL_DAO;
import com.example.qtc.DAL.InMemory_DAO;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class QuebecTaxController {
    //AlwaysDataSQL_DAO dao;
    InMemory_DAO dao;
    List<TaxBracket> TaxBrackets;

    public QuebecTaxController() {
        //dao = AlwaysDataSQL_DAO.getInstance();
        dao = new InMemory_DAO();
        TaxBrackets = dao.findAllBrackets();
    }

    public double getTax(double amount) {
        double tax = 0;

        for (TaxBracket taxBracket : TaxBrackets) {
            if (taxBracket.getMin() <= amount && amount < taxBracket.getMax()) {
                tax = amount * (taxBracket.getRate());
            }
        }
        return tax;
    }
}