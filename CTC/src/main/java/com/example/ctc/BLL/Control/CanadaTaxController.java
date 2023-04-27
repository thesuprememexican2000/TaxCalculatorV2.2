package com.example.ctc.BLL.Control;

import com.example.ctc.BLL.Model.TaxBracket;
import com.example.ctc.DAL.InMemory_DAO;
import java.util.List;

public class CanadaTaxController {
    //    MongoDB_DAO dao;
    InMemory_DAO dao;
    List<TaxBracket> TaxBrackets;

    public CanadaTaxController() {
//        dao = new MongoDB_DAO();
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