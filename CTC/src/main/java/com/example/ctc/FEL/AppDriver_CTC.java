package com.example.ctc.FEL;

import com.example.ctc.BLL.Control.CanadaTaxController;
import com.example.ctc.BLL.Model.TaxBracket;
import com.example.ctc.DAL.ITaxBracket;
import com.example.ctc.DAL.MongoDB_DAO;
import com.google.gson.JsonObject;

import java.util.List;

public class AppDriver_CTC {

    private static ITaxBracket dao = new MongoDB_DAO();
    static List<TaxBracket> bracketList = dao.findAllBrackets();
    Logger logger = new Logger();
    static CanadaTaxController controller = new CanadaTaxController();

    public static void testprintBrackets(List<TaxBracket> brackets) {
        for (TaxBracket bracket : brackets) {
            System.out.println(bracket.toString());
        }
    }

    public static void main(String[] args) {
        double amount = 92580;
        JsonObject tax = controller.getTax(amount);
        String taxAmount = tax.toString();

        Logger.Logger(taxAmount);
    }
}