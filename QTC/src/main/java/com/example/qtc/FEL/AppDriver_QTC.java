package com.example.qtc.FEL;

import com.example.qtc.BLL.Model.TaxBracket;
import com.example.qtc.DAL.*;
import com.example.qtc.BLL.Control.QuebecTaxController;
import com.google.gson.JsonObject;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;



//testing for now
//TODO console app interface
public class AppDriver_QTC {

    AlwaysDataSQL_DAO dao = AlwaysDataSQL_DAO.getInstance();
    List<TaxBracket> bracketList = dao.findAllBrackets();
    Logger logger = new Logger();
    static QuebecTaxController controller = new QuebecTaxController();

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