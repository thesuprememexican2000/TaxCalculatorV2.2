package com.example.ctc.FEL;

import com.example.ctc.BLL.Control.CanadaTaxController;

public class AppDriver_CTC {
    public static void main(String[] args){
        CanadaTaxController test = new CanadaTaxController();
        System.out.println(test.getTax(1000));
    }
}