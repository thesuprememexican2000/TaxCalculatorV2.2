package com.example.qtc.DAL;

import com.example.qtc.BLL.Model.TaxBracket;

public interface ITaxBracket {
    public TaxBracket findBracketbyRate(float Rate);
}
