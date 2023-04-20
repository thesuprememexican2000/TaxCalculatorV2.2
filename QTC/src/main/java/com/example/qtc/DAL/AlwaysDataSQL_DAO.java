package com.example.qtc.DAL;

import com.example.qtc.BLL.Model.TaxBracket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlwaysDataSQL_DAO implements ITaxBracket{

    private static AlwaysDataSQL_DAO instance = null;
    private ISQLDriver driver;

    private AlwaysDataSQL_DAO() {
        driver = new AlwaysDataSQL_Driver();
    }

    public static AlwaysDataSQL_DAO getInstance() {
        if(instance==null)
            instance = new AlwaysDataSQL_DAO();
        return instance;
    }

    @Override
    public TaxBracket findBracketbyRate(float Rate) {
        String query = String.format("SELECT * FROM QuebecTaxBracket" + "WHERE rate='%s'", Rate);
        TaxBracket bracket = null;

        try {
            Statement st = this.driver.getConnection().createStatement();
            ResultSet result = st.executeQuery(query);

            while (result.next()) {
                float min = result.getFloat(1);
                float max = result.getFloat(2);
                float rate = result.getFloat(3);
                bracket = new TaxBracket(min, max, rate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlwaysDataSQL_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bracket;
    }



}
