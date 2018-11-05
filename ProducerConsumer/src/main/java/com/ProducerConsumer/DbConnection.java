package com.ProducerConsumer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "vgaddam";
    private static final String password = "";

    private DbConnection() {}

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(dbUrl, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
