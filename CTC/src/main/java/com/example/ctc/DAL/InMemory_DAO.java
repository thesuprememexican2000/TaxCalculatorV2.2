package com.example.ctc.DAL;

import com.example.ctc.BLL.Model.TaxBracket;

import java.util.ArrayList;
import java.util.List;

public class InMemory_DAO {
    List<TaxBracket> list;

    public InMemory_DAO() {
        list = new ArrayList<>();

        TaxBracket bracket = new TaxBracket(0,49020,.15f);
        list.add(bracket);

        bracket = new TaxBracket(49020,98040,.205f);
        list.add(bracket);

        bracket = new TaxBracket(98040,151978,.26f);
        list.add(bracket);

        bracket = new TaxBracket(151978,216511,.29f);
        list.add(bracket);

        bracket = new TaxBracket(216511,Float.MAX_VALUE,.33f);
        list.add(bracket);
    }
    public List<TaxBracket> getTaxBrackets() {
        return list;
    }
}
