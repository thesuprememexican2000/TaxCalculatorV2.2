package com.example.gtc.BLL.Control;

public class GlobalTaxCalculator {
    double getTax(double amount) {
        double total = 0;
        //49 020 ou moins
        if (amount <= 46295 ){
            total = amount * .15;
        }
        //entre 49 020 et 98 040
        else if (amount > 46295 && amount <= 92580) {
            total = 46295 * .15;
            total = total + ((amount - 46295) * .205);
        }
        //entre 98 040 et 151 978
        else if (amount > 92580 && amount <= 112655) {
            total = 46295 * .15;
            total = total + (92580 * .205);
            total = total + ((amount - 92580) * .26);
        }
        //plus de 216 511
        else if (amount > 112655) {
            total = 46295 * .15;
            total = total + (92580 * .205);
            total = total + (112655 * .26);
            total = total + ((amount - 112655) * 32);
        } else
            return total;
    }
}
