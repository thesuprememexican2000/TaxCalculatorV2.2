package com.example.qtc.DAL;

import java.sql.Connection;

public interface ISQLDriver {
    public Connection connect();
    public Connection getConnection();
}
