package com.example.gtc.BLL.Control;

import com.google.gson.JsonObject;

public class GlobalTaxCalculator {
    JsonObject getTax(double amount){
        double totalTax = 0;
        JsonObject qcTax,caTax;
        String taxInfo;
        //recevoir taxe qc + ca

        //taxInfo = String.format("{\"QuebecRate\":%f,\"CanadaRate\":%f,\"Amount\":%.2f}",qcTax.get("rate"),caTax.get("rate"),totalTax);
        return null;
    }
}
