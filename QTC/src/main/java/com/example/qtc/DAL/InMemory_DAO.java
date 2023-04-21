package com.example.qtc.DAL;

import com.example.qtc.BLL.Model.TaxBracket;

import java.util.ArrayList;
import java.util.List;

public class InMemory_DAO implements ITaxBracket{
    List<TaxBracket> list;

    public InMemory_DAO() {
        list = new ArrayList<>();

        TaxBracket bracket = new TaxBracket(0,46295,.15f);
        list.add(bracket);

        bracket = new TaxBracket(46295,92580,.2f);
        list.add(bracket);

        bracket = new TaxBracket(92580,112655,.24f);
        list.add(bracket);

        bracket = new TaxBracket(112655,Float.MAX_VALUE,.2575f);
        list.add(bracket);
    }
    public List<TaxBracket> findAllBrackets() {
        return list;
    }
}
