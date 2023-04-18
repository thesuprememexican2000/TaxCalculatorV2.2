package com.example.ctc.BLL.Control;

public class CanadaTaxController {
    //retourne l'imposition sur le salaire donné
    double getTax(double amount) {
        double total = 0;
        //49 020 ou moins
        if (amount <= 49020 ){
            total = amount * .15;
        }
        //entre 49 020 et 98 040
        else if (amount > 49020 && amount <= 98040) {
            total = 49020 * .15;
            total = total + ((amount - 49020) * .205);
        }
        //entre 98 040 et 151 978
        else if (amount > 98040 && amount <= 151978) {
            total = 49020 * .15;
            total = total + (98040 * .205);
            total = total + ((amount - 98040) * .26);
        }
        //entre 151 978 et 216 511
        else if (amount > 151978 && amount <= 216511) {
            total = 49020 * .15;
            total = total + (98040 * .205);
            total = total + (151978 * .26);
            total = total + ((amount - 151978) * .29);
        }
        //plus de 216 511
        else if (amount > 216511) {
            total = 49020 * .15;
            total = total + (98040 * .205);
            total = total + (151978 * .26);
            total = total + (216511 * .29);
            total = total + ((amount - 216511) * 32);
        }
        return total;
    }
}
