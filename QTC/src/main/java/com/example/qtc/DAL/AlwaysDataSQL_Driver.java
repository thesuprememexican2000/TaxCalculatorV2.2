package com.example.qtc.DAL;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlwaysDataSQL_Driver implements ISQLDriver{

    private Connection conn;

    public AlwaysDataSQL_Driver() {
        this.conn = connect();
    }

    @Override
    public Connection connect() {
        MysqlDataSource datasource = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
        datasource.setUser("306943");
        datasource.setPassword("bigcappy45");
        datasource.setServerName("mysql-wokemoralistgaming25.alwaysdata.net");
        datasource.setPort(3306);
        datasource.setDatabaseName("wokemoralistgaming25_projetdbsql");
        Connection conn;

        try {
            conn = datasource.getConnection();
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(AlwaysDataSQL_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Connection getConnection() {
        return conn;
    }

}
