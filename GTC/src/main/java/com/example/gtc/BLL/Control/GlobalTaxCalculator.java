package com.example.gtc.BLL.Control;

import com.google.gson.JsonObject;

public class GlobalTaxCalculator {
    RemoteQTC qtc;
    RemoteCTC ctc;
    public GlobalTaxCalculator(){
        qtc = new RemoteQTC();
        ctc = new RemoteCTC();
    }

    public double getTax(double amount){
        double totalTax = 0;
        JsonObject qcTax,caTax;
        String taxInfo;
        //recevoir taxe qc + ca
        totalTax += qtc.getTax(amount);
        totalTax += ctc.getTax(amount);
        //taxInfo = String.format("{\"QuebecRate\":%f,\"CanadaRate\":%f,\"Amount\":%.2f}",qcTax.get("rate"),caTax.get("rate"),totalTax);
        return Math.round(totalTax * 100.0)/100.0;
    }

}
