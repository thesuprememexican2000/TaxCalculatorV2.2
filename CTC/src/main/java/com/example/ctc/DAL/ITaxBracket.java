package com.example.ctc.DAL;

import com.example.ctc.BLL.Model.TaxBracket;

import java.util.List;

public interface ITaxBracket {
    public List<TaxBracket> findAllBrackets();
}
