package com.example.qtc.DAL;

import com.example.qtc.BLL.Model.TaxBracket;

import java.util.List;

public interface ITaxBracket {
    public List<TaxBracket> findAllBrackets();
}
